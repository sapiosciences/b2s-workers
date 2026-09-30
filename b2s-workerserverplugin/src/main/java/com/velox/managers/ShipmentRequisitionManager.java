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
import com.velox.api.clientcallback.InputDialogCriteria;
import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.portal.VeloxApp;
import com.velox.api.user.User;
import com.velox.api.user.UserGroup;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserInfo;
import com.velox.api.user.VeloxUserManager;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.api.util.InputDialogResult;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.context.ExemplarContext;
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
 * Shared constants and validation for Shipment Requisition status transitions (B2S1-244).
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

    private final ExemplarContext exemplarContext;
    private final User user;
    private final ClientCallbackOperations clientCallback;
    private final DataMgmtServer dataMgmtServer;
    private final RecordModelRelationshipManager relationshipMan;
    private final Logger logger;

    public ShipmentRequisitionManager(ExemplarContext exemplarContext) {
        this.exemplarContext = exemplarContext;
        user = exemplarContext.getUser();
        clientCallback = exemplarContext.getClientCallback();
        dataMgmtServer = exemplarContext.getDataMgmtServer();
        RecordModelManager recMan = exemplarContext.getInstance(RecordModelManager.class);
        relationshipMan = recMan.getRelationshipManager();
        logger = exemplarContext.getLogger();
    }

    /**
     * Validates a requisition status change for the given session group.
     * For Denied, prompts for {@code C_DenialReason} when blank.
     *
     * @return an error message if the change is not allowed, or null if it is legal
     */
    public String validateTransition(RequestModel request, String previousStatus, String newStatus,
            String groupName) throws Throwable {
        String from = normalizeStatus(previousStatus);
        String to = normalizeStatus(newStatus);

        boolean allowed;
        // blank → Submitted: anyone (new requisitions from Request Shipment)
        if (from.isEmpty() && STATUS_SUBMITTED.equals(to)) {
            allowed = true;
        // Submitted → Under Review: Logistics, Project Coordinator
        } else if (STATUS_SUBMITTED.equals(from) && STATUS_UNDER_REVIEW.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        // Submitted / Under Review → Approved: Sponsor Approver
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
                && STATUS_APPROVED.equals(to)) {
            allowed = GROUP_SPONSOR_APPROVER.equals(groupName);
        // Submitted / Under Review → Denied: Sponsor Approver, with a denial reason
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
                && STATUS_DENIED.equals(to)) {
            if (!GROUP_SPONSOR_APPROVER.equals(groupName)) {
                allowed = false;
            } else {
                String denialError = ensureDenialReason(request);
                if (denialError != null) {
                    return denialError;
                }
                allowed = true;
            }
        // Approved → In Fulfilment: Logistics, Project Coordinator
        } else if (STATUS_APPROVED.equals(from) && STATUS_IN_FULFILMENT.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        // Approved / In Fulfilment → Shipped: anyone, if boxes support Shipped
        } else if ((STATUS_APPROVED.equals(from) || STATUS_IN_FULFILMENT.equals(from))
                && STATUS_SHIPPED.equals(to)) {
            allowed = boxesSupported(request, STATUS_SHIPPED);
        // Shipped → Delivered: anyone, if boxes support Delivered
        } else if (STATUS_SHIPPED.equals(from) && STATUS_DELIVERED.equals(to)) {
            allowed = boxesSupported(request, STATUS_DELIVERED);
        // Delivered / Denied → Closed: Logistics, Project Coordinator
        } else if ((STATUS_DELIVERED.equals(from) || STATUS_DENIED.equals(from))
                && STATUS_CLOSED.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        } else {
            allowed = false;
        }

        if (allowed) {
            return null;
        }
        return formatTransitionError(request, groupName, from, to);
    }

    /**
     * Emails Sponsor Approver users (Directory ACL with read/write, and in the Sponsor Approver group)
     * for each request that was just moved to Submitted. If no Sponsor Approver can be resolved for a
     * request, notifies every member of Logistics and Project Coordinator instead. One email per
     * recipient listing all of their matching requests. Call only after every transition in the save
     * has been validated.
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
                        + StringUtils.defaultIfBlank(request.getRequestId(), String.valueOf(request.getRecordId())));
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
                        + StringUtils.defaultIfBlank(request.getRequestId(), String.valueOf(request.getRecordId())),
                        e);
            }
        }
    }

    /**
     * If {@code C_DenialReason} is blank, prompts with the Request field definition so the user can
     * select or type a reason, then writes it onto the request.
     *
     * @return an error message if the user cancels or leaves it blank; null if set
     */
    private String ensureDenialReason(RequestModel request) throws Throwable {
        if (StringUtils.isNotBlank(request.getC_DenialReason())) {
            return null;
        }
        String requestId = StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
        if (clientCallback == null) {
            return requestId + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
        }

        VeloxFieldDefinition<?> denialReasonField = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(RequestModel.DATA_TYPE_NAME)
                .getVeloxFieldDefinition(RequestModel.C___DENIAL_REASON, user);
        denialReasonField.setRequired(true);
        denialReasonField.setEditable(true);

        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Denial Reason")
                .message("Choose a Denial Reason for " + requestId + ".")
                .fieldDefinition(denialReasonField)
                .build());
        if (input == null || input.getValue() == null
                || StringUtils.isBlank(input.getValue().toString())) {
            return requestId + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
        }

        request.setC_DenialReason(input.getValue().toString().trim());
        return null;
    }

    /**
     * Whether child shipment boxes support moving the requisition to the given status.
     * <ul>
     *   <li>Shipped — at least one box is In Transit or Delivered</li>
     *   <li>Delivered — every box is Delivered (and there is at least one box)</li>
     * </ul>
     * Child {@link C_ShipmentBoxModel} records must already be loaded on the request.
     */
    public boolean boxesSupported(RequestModel request, String status) {
        if (STATUS_SHIPPED.equals(status)) {
            for (C_ShipmentBoxModel box : request.get(Children.ofType(C_ShipmentBoxModel.class))) {
                String boxStatus = box.getC_Status();
                if (BOX_STATUS_IN_TRANSIT.equals(boxStatus) || BOX_STATUS_DELIVERED.equals(boxStatus)) {
                    return true;
                }
            }
            return false;
        }
        if (STATUS_DELIVERED.equals(status)) {
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
        String requestId = StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
        String fromDisplay = from.isEmpty() ? "(blank)" : from;
        String toDisplay = to.isEmpty() ? "(blank)" : to;
        return requestId + ": " + groupName + " cannot move a request from " + fromDisplay + " to " + toDisplay;
    }

    private static String normalizeStatus(String value) {
        return value == null ? "" : StringUtils.trimToEmpty(value);
    }
}
