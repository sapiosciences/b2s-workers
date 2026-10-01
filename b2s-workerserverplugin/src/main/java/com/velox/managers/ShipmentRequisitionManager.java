/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.managers;

import com.velox.api.access.AccessType;
import com.velox.api.access.DataRecordACL;
import com.velox.api.access.DataRecordAccess;
import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.portal.VeloxApp;
import com.velox.api.user.User;
import com.velox.api.user.UserGroup;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserInfo;
import com.velox.api.user.VeloxUserManager;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.context.ExemplarContext;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.mail.Email;
import com.velox.sapio.commons.exemplar.mail.EmailSender;
import com.velox.sapio.commons.exemplar.recordmodel.main.RecordModelManager;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RecordModelRelationshipManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import java.rmi.RemoteException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Rules and helpers for Shipment Requisition status changes (B2S1-244).
 */
public class ShipmentRequisitionManager {

    public static final String REQUEST_TYPE_SHIPMENT_REQUISITION = "Shipment Requisition";

    public static final String GROUP_SAPIO_ADMIN = "Sapio Admin";
    public static final String GROUP_LOGISTICS = "Logistics";
    public static final String GROUP_PROJECT_COORDINATOR = "Project Coordinator";
    public static final String GROUP_SPONSOR_APPROVER = "Sponsor Approver";

    public static final String STATUS_SUBMITTED = "Submitted";
    public static final String STATUS_UNDER_REVIEW = "Under Review";
    public static final String STATUS_APPROVED = "Approved";
    public static final String STATUS_IN_FULFILMENT = "In Fulfilment";
    public static final String STATUS_SHIPPED = "Shipped";
    public static final String STATUS_DELIVERED = "Delivered";
    public static final String STATUS_CLOSED = "Closed";
    public static final String STATUS_DENIED = "Denied";

    public static final String BOX_STATUS_IN_TRANSIT = "In Transit";
    public static final String BOX_STATUS_DELIVERED = "Delivered";

    private static final String DENIAL_REASON_REQUIRED_MESSAGE =
            "Please choose a Denial Reason before denying a request";

    private static final Set<String> LOGISTICS_OR_COORDINATOR =
            Set.of(GROUP_LOGISTICS, GROUP_PROJECT_COORDINATOR);

    private static final DateTimeFormatter DATE_NEEDED_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd").withZone(ZoneId.systemDefault());

    // Must be the OnSave plugin's clientCallback — not looked up later from context.
    private final ClientCallbackOperations clientCallback;
    private final ExemplarContext exemplarContext;
    private final User user;
    private final DataMgmtServer dataMgmtServer;
    private final RecordModelRelationshipManager relationshipMan;
    private final Logger logger;

    public ShipmentRequisitionManager(ClientCallbackOperations clientCallback,
            ExemplarContext exemplarContext) {
        this.clientCallback = clientCallback;
        this.exemplarContext = exemplarContext;
        this.user = exemplarContext.getUser();
        this.dataMgmtServer = exemplarContext.getDataMgmtServer();
        RecordModelManager recMan = exemplarContext.getInstance(RecordModelManager.class);
        this.relationshipMan = recMan.getRelationshipManager();
        this.logger = exemplarContext.getLogger();
    }

    /**
     * Checks every request in the save. Asks for a denial reason when needed.
     *
     * @return one error line per illegal change, or an empty list if all are allowed
     */
    public List<String> validateRequests(List<RequestModel> requests, String groupName) throws Throwable {
        List<String> errors = new ArrayList<>();
        for (RequestModel request : requests) {
            Object lastSaved = request.getDataRecord().getLastSavedValue(RequestModel.C___REQUISITION_STATUS);
            String previousStatus = lastSaved == null ? null : lastSaved.toString();
            String newStatus = request.getC_RequisitionStatus();

            // Denying with no reason yet → ask the user before we decide.
            if (needsDenialReasonPrompt(previousStatus, newStatus, groupName, request)) {
                promptForDenialReason(request);
            }

            String error = validateTransition(request, previousStatus, newStatus, groupName);
            if (error != null) {
                errors.add(error);
            }
        }
        return errors;
    }

    /**
     * Checks one status move against the group / box rules.
     *
     * @return an error message if not allowed, or null if it is fine
     */
    public String validateTransition(RequestModel request, String previousStatus, String newStatus,
            String groupName) {
        String from = normalizeStatus(previousStatus);
        String to = normalizeStatus(newStatus);

        boolean allowed;
        // New requisition: blank → Submitted (anyone)
        if (from.isEmpty() && STATUS_SUBMITTED.equals(to)) {
            allowed = true;
        // Start review: Submitted → Under Review (Logistics / Project Coordinator)
        } else if (STATUS_SUBMITTED.equals(from) && STATUS_UNDER_REVIEW.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        // Approve: Submitted or Under Review → Approved (Sponsor Approver)
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
                && STATUS_APPROVED.equals(to)) {
            allowed = GROUP_SPONSOR_APPROVER.equals(groupName);
        // Deny: Submitted, Under Review or Approved → Denied (Sponsor Approver + reason)
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from) || STATUS_APPROVED.equals(from))
                && STATUS_DENIED.equals(to)) {
            if (!GROUP_SPONSOR_APPROVER.equals(groupName)) {
                allowed = false;
            } else if (StringUtils.isBlank(request.getC_DenialReason())) {
                return requestLabel(request) + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
            } else {
                allowed = true;
            }
        // Start fulfilment: Approved → In Fulfilment (Logistics / Project Coordinator)
        } else if (STATUS_APPROVED.equals(from) && STATUS_IN_FULFILMENT.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        // Ship: Approved or In Fulfilment → Shipped (anyone, if a box has left)
        } else if ((STATUS_APPROVED.equals(from) || STATUS_IN_FULFILMENT.equals(from))
                && STATUS_SHIPPED.equals(to)) {
            allowed = boxesSupported(request, STATUS_SHIPPED);
        // Deliver: Shipped → Delivered (anyone, if every box is Delivered)
        } else if (STATUS_SHIPPED.equals(from) && STATUS_DELIVERED.equals(to)) {
            allowed = boxesSupported(request, STATUS_DELIVERED);
        // Close: Delivered or Denied → Closed (Logistics / Project Coordinator)
        } else if ((STATUS_DELIVERED.equals(from) || STATUS_DENIED.equals(from))
                && STATUS_CLOSED.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        } else {
            // Any other jump is not allowed
            allowed = false;
        }

        return allowed ? null : formatTransitionError(request, groupName, from, to);
    }

    /**
     * True when child boxes allow the request to move to Shipped or Delivered.
     * Boxes must already be loaded on the request.
     */
    public boolean boxesSupported(RequestModel request, String status) {
        if (STATUS_SHIPPED.equals(status)) {
            // Need at least one box In Transit or Delivered
            for (C_ShipmentBoxModel box : request.get(Children.ofType(C_ShipmentBoxModel.class))) {
                String boxStatus = box.getC_Status();
                if (BOX_STATUS_IN_TRANSIT.equals(boxStatus) || BOX_STATUS_DELIVERED.equals(boxStatus)) {
                    return true;
                }
            }
            return false;
        }
        if (STATUS_DELIVERED.equals(status)) {
            // Every box must be Delivered (and there must be at least one)
            List<C_ShipmentBoxModel> boxes =
                    new ArrayList<>(request.get(Children.ofType(C_ShipmentBoxModel.class)));
            if (boxes.isEmpty()) {
                return false;
            }
            for (C_ShipmentBoxModel box : boxes) {
                if (!BOX_STATUS_DELIVERED.equals(box.getC_Status())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Emails Sponsor Approver users (Directory ACL with read/write, and in the Sponsor Approver group)
     * for each request that was just moved to Submitted. If no Sponsor Approver can be resolved for a
     * request, notifies every member of Logistics and Project Coordinator instead. One email per
     * recipient listing all of their matching requests. Call only after every transition in the save
     * has been validated. Email failures are logged and do not fail the save.
     */
    public void notifySubmitted(List<RequestModel> submittedRequests) throws Throwable {
        if (submittedRequests == null || submittedRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(submittedRequests, C_SponsorContactModel.class);
        relationshipMan.loadParents(submittedRequests, ProjectModel.class);

        List<C_SponsorContactModel> contacts = new ArrayList<>();
        for (RequestModel request : submittedRequests) {
            C_SponsorContactModel contact = request.get(Parent.ofType(C_SponsorContactModel.class));
            if (contact != null) {
                contacts.add(contact);
            }
        }
        if (!contacts.isEmpty()) {
            relationshipMan.loadParents(contacts, DirectoryModel.class);
        }

        Map<String, Boolean> sponsorApproverByUsername = new HashMap<>();
        Map<Long, List<String>> approverEmailsByDirectoryId = new HashMap<>();
        List<String> fallbackEmails = null;
        Map<String, List<RequestModel>> requestsByRecipientEmail = new LinkedHashMap<>();

        for (RequestModel request : submittedRequests) {
            List<String> recipientEmails = List.of();
            C_SponsorContactModel contact = request.get(Parent.ofType(C_SponsorContactModel.class));
            DirectoryModel account = contact == null ? null : contact.get(Parent.ofType(DirectoryModel.class));
            if (account != null) {
                Long directoryId = account.getRecordId();
                if (approverEmailsByDirectoryId.containsKey(directoryId)) {
                    recipientEmails = approverEmailsByDirectoryId.get(directoryId);
                } else {
                    recipientEmails = findSponsorApproverEmails(account, sponsorApproverByUsername);
                    approverEmailsByDirectoryId.put(directoryId, recipientEmails);
                }
            }
            if (recipientEmails.isEmpty()) {
                if (fallbackEmails == null) {
                    fallbackEmails = findLogisticsAndProjectCoordinatorEmails();
                }
                recipientEmails = fallbackEmails;
            }
            for (String email : recipientEmails) {
                requestsByRecipientEmail.computeIfAbsent(email, key -> new ArrayList<>()).add(request);
            }
        }

        if (requestsByRecipientEmail.isEmpty()) {
            return;
        }

        EmailSender emailSender = exemplarContext.getInstance(EmailSender.class);
        for (Map.Entry<String, List<RequestModel>> entry : requestsByRecipientEmail.entrySet()) {
            try {
                Email email = Email.builder()
                        .to(entry.getKey())
                        .subject("Shipment requisition(s) submitted")
                        .htmlBody(buildSubmittedEmailBody(entry.getValue()))
                        .build();
                emailSender.sendEmail(email, true);
            } catch (Exception e) {
                logger.error("ShipmentRequisitionManager: Failed to send submitted notification to "
                        + entry.getKey(), e);
            }
        }
    }

    /**
     * Emails each shipped request's Sponsor Contact ({@code C_EmailAddress}) with request and shipment
     * box details. Call only after every transition in the save has been validated. Email failures are
     * logged and do not fail the save.
     */
    public void notifyShipped(List<RequestModel> shippedRequests) throws Throwable {
        if (shippedRequests == null || shippedRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(shippedRequests, C_SponsorContactModel.class);
        relationshipMan.loadChildren(shippedRequests, C_ShipmentBoxModel.class);

        EmailSender emailSender = exemplarContext.getInstance(EmailSender.class);
        for (RequestModel request : shippedRequests) {
            C_SponsorContactModel contact = request.get(Parent.ofType(C_SponsorContactModel.class));
            if (contact == null || StringUtils.isBlank(contact.getC_EmailAddress())) {
                logger.error("ShipmentRequisitionManager: No Sponsor Contact email for shipped request "
                        + StringUtils.defaultIfBlank(request.getRequestId(),
                        String.valueOf(request.getRecordId())));
                continue;
            }
            String recipient = contact.getC_EmailAddress().trim();
            try {
                Email email = Email.builder()
                        .to(recipient)
                        .subject("Your Request has Shipped")
                        .htmlBody(buildShippedEmailBody(request))
                        .build();
                emailSender.sendEmail(email, true);
            } catch (Exception e) {
                logger.error("ShipmentRequisitionManager: Failed to send shipped notification to "
                        + recipient + " for request "
                        + StringUtils.defaultIfBlank(request.getRequestId(),
                        String.valueOf(request.getRecordId())), e);
            }
        }
    }

    // Ask for Denial Reason when a Sponsor Approver is denying and the field is still blank.
    private boolean needsDenialReasonPrompt(String previousStatus, String newStatus, String groupName,
            RequestModel request) {
        if (!GROUP_SPONSOR_APPROVER.equals(groupName) || StringUtils.isNotBlank(request.getC_DenialReason())) {
            return false;
        }
        String from = normalizeStatus(previousStatus);
        return (STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from) || STATUS_APPROVED.equals(from))
                && STATUS_DENIED.equals(newStatus);
    }

    // Shows the Denial Reason field. Cancel or empty answer aborts the save.
    private void promptForDenialReason(RequestModel request) throws Throwable {
        String requestId = requestLabel(request);

        VeloxFieldDefinition<?> denialReasonField = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(RequestModel.DATA_TYPE_NAME)
                .getVeloxFieldDefinition(RequestModel.C___DENIAL_REASON, user);

        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(denialReasonField);
        TemporaryDataType form = formBuilder.getTemporaryDataType();
        for (VeloxFieldDefinition<?> field : form.getVeloxFieldDefinitionList()) {
            field.setRequired(true);
            field.setEditable(true);
            field.setVisible(true);
        }

        Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                "Denial Reason",
                "Choose a Denial Reason for " + requestId + ".",
                form,
                user);
        if (entered == null || clientCallback.isAborted()) {
            clientCallback.displayError(requestId + ": " + DENIAL_REASON_REQUIRED_MESSAGE);
            throw new UserRequestedCancelServerException();
        }

        Object rawReason = entered.get(RequestModel.C___DENIAL_REASON);
        String reason = rawReason == null ? null : rawReason.toString().trim();
        if (StringUtils.isBlank(reason)) {
            clientCallback.displayError(requestId + ": " + DENIAL_REASON_REQUIRED_MESSAGE);
            throw new UserRequestedCancelServerException();
        }
        request.setC_DenialReason(reason);
    }

    private List<String> findSponsorApproverEmails(DirectoryModel account,
            Map<String, Boolean> sponsorApproverByUsername) throws Throwable {
        DataRecordACL acl = account.getDataRecord().getDataRecordACL(user);
        Map<String, DataRecordAccess> userAccessMap = acl == null ? null : acl.getDataRecordAccessMap();
        if (userAccessMap == null || userAccessMap.isEmpty()) {
            return List.of();
        }

        VeloxUserManager userManager = dataMgmtServer.getVeloxUserManager(user);
        Set<String> emails = new LinkedHashSet<>();
        for (Map.Entry<String, DataRecordAccess> entry : userAccessMap.entrySet()) {
            DataRecordAccess access = entry.getValue();
            if (access == null
                    || !access.hasAccess(AccessType.READ)
                    || !access.hasAccess(AccessType.WRITE)) {
                continue;
            }
            String username = entry.getKey();
            if (!isSponsorApprover(username, sponsorApproverByUsername)) {
                continue;
            }
            UserInfo userInfo = userManager.getUserInfo(user, username);
            if (userInfo != null && StringUtils.isNotBlank(userInfo.getEmailAddress())) {
                emails.add(userInfo.getEmailAddress());
            } else if (StringUtils.isNotBlank(username) && username.contains("@")) {
                // Sponsor usernames are typically the email address.
                emails.add(username);
            }
        }
        return new ArrayList<>(emails);
    }

    /** All email addresses for users in Logistics or Project Coordinator. */
    private List<String> findLogisticsAndProjectCoordinatorEmails() throws Throwable {
        Set<String> emails = new LinkedHashSet<>();
        for (UserGroup group : dataMgmtServer.getUserGroupManager(user).getUserGroupList(user)) {
            if (group == null || !LOGISTICS_OR_COORDINATOR.contains(group.getGroupName())) {
                continue;
            }
            List<User> groupUsers = group.getUserList(user);
            if (groupUsers == null) {
                continue;
            }
            for (User groupUser : groupUsers) {
                if (groupUser != null && StringUtils.isNotBlank(groupUser.getEmailAddress())) {
                    emails.add(groupUser.getEmailAddress());
                }
            }
        }
        return new ArrayList<>(emails);
    }

    private boolean isSponsorApprover(String username, Map<String, Boolean> cache) throws Throwable {
        if (cache.containsKey(username)) {
            return Boolean.TRUE.equals(cache.get(username));
        }
        List<UserGroupInfo> groups = dataMgmtServer.getUserGroupManager(user)
                .getUserGroupInfoListForUser(username, user);
        boolean isApprover = false;
        if (groups != null) {
            for (UserGroupInfo groupInfo : groups) {
                if (groupInfo != null && GROUP_SPONSOR_APPROVER.equals(groupInfo.getUserGroupName())) {
                    isApprover = true;
                    break;
                }
            }
        }
        cache.put(username, isApprover);
        return isApprover;
    }

    private String buildSubmittedEmailBody(List<RequestModel> requests) throws RemoteException, ServerException {
        StringBuilder html = new StringBuilder();
        html.append("<p>The following requests have been submitted:</p>");
        html.append("<p></p>");
        for (RequestModel request : requests) {
            ProjectModel project = request.get(Parent.ofType(ProjectModel.class));
            String projectName = project == null
                    ? ""
                    : StringUtils.defaultIfBlank(project.getProjectName(), project.getDataRecordName());
            String requestId = StringUtils.defaultIfBlank(request.getRequestId(), "Request");
            String sampleCount = request.getNumberOfSamples() == null
                    ? "0"
                    : String.valueOf(request.getNumberOfSamples());
            String dateNeeded = formatDateNeeded(request.getC_DateNeeded());
            String destination = StringUtils.defaultString(request.getC_DestinationAddress())
                    .replace("\r\n", ", ")
                    .replace("\n", ", ")
                    .replace("\r", ", ");
            String link = buildRecordLink(RequestModel.DATA_TYPE_NAME, request.getRecordId());

            html.append("<p>")
                    .append(escapeHtml(requestId))
                    .append(" | ")
                    .append(escapeHtml(projectName))
                    .append(" | ")
                    .append(escapeHtml(sampleCount))
                    .append(" samples | ")
                    .append(escapeHtml(dateNeeded))
                    .append(" | ")
                    .append(escapeHtml(destination))
                    .append(" | ")
                    .append("<a href=\"").append(escapeHtml(link)).append("\">Open request</a>")
                    .append("</p>");
        }
        return html.toString();
    }

    private String buildShippedEmailBody(RequestModel request) throws RemoteException, ServerException {
        String requestId = StringUtils.defaultIfBlank(request.getRequestId(), "Request");
        String requestLink = buildRecordLink(RequestModel.DATA_TYPE_NAME, request.getRecordId());

        StringBuilder html = new StringBuilder();
        html.append("<p>Your Request has Shipped</p>");
        html.append("<p></p>");
        html.append("<p>")
                .append(escapeHtml(requestId))
                .append(" | ")
                .append("<a href=\"").append(escapeHtml(requestLink)).append("\">Open request</a>")
                .append("</p>");
        html.append("<p></p>");
        html.append("<p>Shipment boxes:</p>");

        List<C_ShipmentBoxModel> boxes =
                new ArrayList<>(request.get(Children.ofType(C_ShipmentBoxModel.class)));
        if (boxes.isEmpty()) {
            html.append("<p>(none)</p>");
            return html.toString();
        }

        for (C_ShipmentBoxModel box : boxes) {
            String carrier = StringUtils.defaultString(box.getC_Carrier());
            String shipmentId = StringUtils.defaultString(box.getC_ShipmentId());
            String boxNumber = box.getC_BoxNumber() == null ? "" : String.valueOf(box.getC_BoxNumber());
            String boxCount = box.getC_BoxCount() == null ? "" : String.valueOf(box.getC_BoxCount());
            String boxLink = buildRecordLink(C_ShipmentBoxModel.DATA_TYPE_NAME, box.getRecordId());

            html.append("<p>")
                    .append(escapeHtml(carrier))
                    .append(" | ")
                    .append(escapeHtml(shipmentId))
                    .append(" | Box ")
                    .append(escapeHtml(boxNumber))
                    .append(" | Count ")
                    .append(escapeHtml(boxCount))
                    .append(" | ")
                    .append("<a href=\"").append(escapeHtml(boxLink)).append("\">Open box</a>")
                    .append("</p>");
        }
        return html.toString();
    }

    private String buildRecordLink(String dataTypeName, Long recordId) throws RemoteException, ServerException {
        VeloxApp app = dataMgmtServer.getVeloxApp(user);
        return app.getAppUrl() + app.getGuid()
                + "#view=dataRecord;recordId=" + recordId
                + ";dataType=" + dataTypeName;
    }

    private static String formatDateNeeded(Long epochMillis) {
        if (epochMillis == null) {
            return "";
        }
        return DATE_NEEDED_FORMAT.format(Instant.ofEpochMilli(epochMillis));
    }

    private static String escapeHtml(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;");
    }

    private static String formatTransitionError(RequestModel request, String groupName, String from, String to) {
        String fromDisplay = from.isEmpty() ? "(blank)" : from;
        String toDisplay = to.isEmpty() ? "(blank)" : to;
        return requestLabel(request) + ": " + groupName + " cannot move a request from "
                + fromDisplay + " to " + toDisplay;
    }

    private static String requestLabel(RequestModel request) {
        return StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
    }

    private static String normalizeStatus(String value) {
        return value == null ? "" : StringUtils.trimToEmpty(value);
    }
}
