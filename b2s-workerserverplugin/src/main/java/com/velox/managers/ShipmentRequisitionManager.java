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
import com.velox.api.datarecord.DataRecord;
import com.velox.api.util.PopupType;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.portal.VeloxApp;
import com.velox.api.session.SessionManager;
import com.velox.api.system.SystemLogESignLoggingRequest;
import com.velox.api.user.ESignAuthentication;
import com.velox.api.user.User;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserInfo;
import com.velox.api.user.VeloxUserManager;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.C_SponsorContactModel;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Shared rules and helpers for Shipment Requisition status changes (B2S1-244).
 *
 * <p>Used by {@code RequisitionStatusOnSave}. In one place this class:
 * <ul>
 *   <li>Decides which group can move a request from status A to status B</li>
 *   <li>Prompts for Denial Reason or e-signature when those moves require it</li>
 *   <li>Sends email + in-app notifications when requests land in certain statuses</li>
 * </ul>
 */
public class ShipmentRequisitionManager {

    public static final String REQUEST_TYPE_SHIPMENT_REQUISITION = "Shipment Requisition";

    // --- Sapio user groups that appear in the status rules ---
    public static final String GROUP_SAPIO_ADMIN = "Sapio Admin";
    public static final String GROUP_B2S_ADMIN = "B2S Admin";
    public static final String GROUP_LOGISTICS = "Logistics";
    public static final String GROUP_PROJECT_COORDINATOR = "Project Coordinator";
    public static final String GROUP_PRINCIPAL_INVESTIGATOR = "Principal Investigator";
    public static final String GROUP_SPONSOR_APPROVER = "Sponsor Approver";

    // --- Allowed values of Request.C_RequisitionStatus ---
    public static final String STATUS_SUBMITTED = "Submitted";
    public static final String STATUS_UNDER_REVIEW = "Under Review";
    public static final String STATUS_AWAITING_B2S_APPROVAL = "Awaiting B2S Approval";
    public static final String STATUS_AWAITING_SPONSOR_APPROVAL = "Awaiting Sponsor Approval";
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
    private static final String ESIGN_REQUIRED_MESSAGE =
            "An electronic signature is required to approve this request";
    private static final String ESIGN_TITLE = "Electronic Signature";

    // Groups that can start review / fulfilment / close
    private static final Set<String> LOGISTICS_OR_COORDINATOR =
            Set.of(GROUP_LOGISTICS, GROUP_PROJECT_COORDINATOR);
    // Groups that can leave "Awaiting B2S Approval" (approve or deny)
    private static final Set<String> B2S_APPROVER_GROUPS =
            Set.of(GROUP_PRINCIPAL_INVESTIGATOR, GROUP_B2S_ADMIN);

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
     * Walks every status-changed request in the save.
     * For each one: maybe ask for a denial reason, check the move is legal, maybe collect an e-sign.
     *
     * @return one error line per illegal change, or an empty list if all are allowed
     */
    public List<String> validateRequests(List<RequestModel> requests, String groupName) throws Throwable {
        List<String> errors = new ArrayList<>();
        for (RequestModel request : requests) {
            // "From" = what was last committed; "to" = what the user is trying to save now.
            // A new request has nothing committed: its last-saved value is the field default (Submitted), so treat it as blank.
            DataRecord record = request.getDataRecord();
            Object lastSaved = record.isNew() ? null : record.getLastSavedValue(RequestModel.C___REQUISITION_STATUS);
            String previousStatus = lastSaved == null ? null : lastSaved.toString();
            String newStatus = request.getC_RequisitionStatus();

            // Denying with no reason yet → pop a dialog and fill Denial Reason before we decide
            if (needsDenialReasonPrompt(previousStatus, newStatus, groupName, request)) {
                promptForDenialReason(request);
            }

            String error = validateTransition(request, previousStatus, newStatus, groupName);
            if (error != null) {
                errors.add(error);
                continue; // Don't bother with e-sign for an illegal move
            }

            // Legal approval steps that advance the chain still need an e-signature
            if (needsApprovalESign(previousStatus, newStatus)) {
                promptForApprovalESign(request, previousStatus, newStatus);
            }
        }
        return errors;
    }

    /**
     * Pure rule check for one from→to status move for one group.
     * Does not show dialogs — denial reason / e-sign are handled by {@link #validateRequests}.
     *
     * @return an error message if not allowed, or null if it is fine
     */
    public String validateTransition(RequestModel request, String previousStatus, String newStatus,
            String groupName) {
        String from = normalizeStatus(previousStatus);
        String to = normalizeStatus(newStatus);

        boolean allowed;
        // Brand-new request: blank → Submitted or Awaiting B2S Approval (anyone may create these)
        if (from.isEmpty()
                && (STATUS_SUBMITTED.equals(to) || STATUS_AWAITING_B2S_APPROVAL.equals(to))) {
            allowed = true;
        // Start review: Submitted → Under Review (Logistics / Project Coordinator)
        } else if (STATUS_SUBMITTED.equals(from) && STATUS_UNDER_REVIEW.equals(to)) {
            allowed = LOGISTICS_OR_COORDINATOR.contains(groupName);
        // B2S approve: Awaiting B2S Approval → Awaiting Sponsor Approval (PI / B2S Admin; e-sign later)
        } else if (STATUS_AWAITING_B2S_APPROVAL.equals(from)
                && STATUS_AWAITING_SPONSOR_APPROVAL.equals(to)) {
            allowed = B2S_APPROVER_GROUPS.contains(groupName);
        // B2S deny: Awaiting B2S Approval → Denied (same groups; Denial Reason required)
        } else if (STATUS_AWAITING_B2S_APPROVAL.equals(from) && STATUS_DENIED.equals(to)) {
            if (!B2S_APPROVER_GROUPS.contains(groupName)) {
                allowed = false;
            } else if (StringUtils.isBlank(request.getC_DenialReason())) {
                return requestLabel(request) + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
            } else {
                allowed = true;
            }
        // Sponsor approve: Awaiting Sponsor Approval → Approved (Sponsor Approver; e-sign later)
        } else if (STATUS_AWAITING_SPONSOR_APPROVAL.equals(from) && STATUS_APPROVED.equals(to)) {
            allowed = GROUP_SPONSOR_APPROVER.equals(groupName);
        // Sponsor deny from awaiting: Awaiting Sponsor Approval → Denied (Sponsor Approver + reason)
        } else if (STATUS_AWAITING_SPONSOR_APPROVAL.equals(from) && STATUS_DENIED.equals(to)) {
            if (!GROUP_SPONSOR_APPROVER.equals(groupName)) {
                allowed = false;
            } else if (StringUtils.isBlank(request.getC_DenialReason())) {
                return requestLabel(request) + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
            } else {
                allowed = true;
            }
        // Legacy approve path: Submitted or Under Review → Approved (Sponsor Approver)
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
                && STATUS_APPROVED.equals(to)) {
            allowed = GROUP_SPONSOR_APPROVER.equals(groupName);
        // Legacy deny path: Submitted, Under Review or Approved → Denied (Sponsor Approver + reason)
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
        // Ship: Approved or In Fulfilment → Shipped (anyone, if at least one box has left)
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
            // Any other jump (skipping steps, wrong direction, etc.) is not allowed
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
     * Emails and in-app notifies Sponsor Approver users (Request ACL with read/write, and in the
     * Sponsor Approver group) for each request that was just moved to Submitted. If no Sponsor
     * Approver can be resolved for a request, notifies every member of Logistics and Project
     * Coordinator instead. One email / in-app message per recipient listing all of their matching
     * requests. Call only after every transition in the save has been validated. Delivery failures
     * are logged and do not fail the save.
     */
    public void notifySubmitted(List<RequestModel> submittedRequests) throws Throwable {
        if (submittedRequests == null || submittedRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(submittedRequests, ProjectModel.class);

        // Cache: username → "are they in Sponsor Approver?" so we don't re-query per request
        Map<String, Boolean> sponsorApproverByUsername = new HashMap<>();
        List<NotificationRecipient> fallbackRecipients = null;
        // Keyed by email so one body is shared for email + in-app to the same person
        Map<String, NotificationRecipient> recipientByEmail = new LinkedHashMap<>();
        // Which requests each email address should see in their message
        Map<String, List<RequestModel>> requestsByRecipientEmail = new LinkedHashMap<>();

        for (RequestModel request : submittedRequests) {
            // Prefer Sponsor Approvers who already have read+write on this Request's ACL
            List<NotificationRecipient> recipients =
                    findSponsorApproverRecipients(request, sponsorApproverByUsername);
            if (recipients.isEmpty()) {
                // Nobody ACL-matched → fall back to Logistics / Project Coordinator (once, then reuse)
                if (fallbackRecipients == null) {
                    fallbackRecipients = findLogisticsAndProjectCoordinatorRecipients();
                }
                recipients = fallbackRecipients;
            }
            for (NotificationRecipient recipient : recipients) {
                if (StringUtils.isBlank(recipient.email)) {
                    continue;
                }
                recipientByEmail.putIfAbsent(recipient.email, recipient);
                requestsByRecipientEmail.computeIfAbsent(recipient.email, key -> new ArrayList<>())
                        .add(request);
            }
        }

        if (requestsByRecipientEmail.isEmpty()) {
            return;
        }

        for (Map.Entry<String, List<RequestModel>> entry : requestsByRecipientEmail.entrySet()) {
            NotificationRecipient recipient = recipientByEmail.get(entry.getKey());
            String body = buildSubmittedEmailBody(entry.getValue());
            deliverEmailAndInAppNotification(
                    recipient,
                    "Shipment requisition(s) submitted",
                    body,
                    "submitted");
        }
    }

    /**
     * B2S1-249: emails and in-app notifies every Logistics and Project Coordinator user that a sponsor
     * Submission was created. Call after the Submission is committed so its link resolves.
     * Replaces the Request OnSave rule for new Submissions: that rule can't see the ancestor Project on
     * the create save, so it only fired on a later edit. Delivery failures are logged and do not fail.
     */
    public void notifySubmissionCreated(RequestModel request, ProjectModel project) throws Throwable {
        List<NotificationRecipient> recipients = findLogisticsAndProjectCoordinatorRecipients();
        if (recipients.isEmpty()) {
            logger.error("ShipmentRequisitionManager: No Logistics / Project Coordinator recipients "
                    + "with email for Submission notification");
            return;
        }

        String projectId = StringUtils.defaultIfBlank(project.getProjectId(), project.getDataRecordName());
        String sampleCount = request.getNumberOfSamples() == null
                ? "" : String.valueOf(request.getNumberOfSamples());
        String requestId = StringUtils.defaultIfBlank(request.getRequestId(), "Request");
        String link = buildRecordLink(RequestModel.DATA_TYPE_NAME, request.getRecordId());

        // Same wording as the rule this replaces
        String body = "<p>A request has been created for project " + escapeHtml(projectId) + ".</p>"
                + "<p>Sample Count: " + escapeHtml(sampleCount) + "</p>"
                + "<p>Expected Arrival Date: " + escapeHtml(formatDateNeeded(request.getC_ExpectedArrivalDate())) + "</p>"
                + "<p>Request Link: <a href=\"" + escapeHtml(link) + "\">" + escapeHtml(requestId) + "</a></p>";
        String subject = "A request has been created for project " + projectId;
        for (NotificationRecipient recipient : recipients) {
            deliverEmailAndInAppNotification(recipient, subject, body, "submission");
        }
    }

    /**
     * Emails and in-app notifies every Principal Investigator and B2S Admin user when requests move
     * to Awaiting B2S Approval. One message per recipient listing all matching requests in the save.
     * Call only after every transition in the save has been validated. Delivery failures are logged
     * and do not fail the save.
     */
    public void notifyAwaitingB2SApproval(List<RequestModel> awaitingB2SRequests) throws Throwable {
        if (awaitingB2SRequests == null || awaitingB2SRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(awaitingB2SRequests, ProjectModel.class);
        // Whole group(s): anyone in PI or B2S Admin can act on these, so notify all of them
        List<NotificationRecipient> recipients = findRecipientsInGroups(B2S_APPROVER_GROUPS);
        if (recipients.isEmpty()) {
            logger.error("ShipmentRequisitionManager: No Principal Investigator / B2S Admin recipients "
                    + "with email for Awaiting B2S Approval notification");
            return;
        }

        // Same body for everyone — each recipient gets the full list from this save
        String body = buildAwaitingB2SApprovalEmailBody(awaitingB2SRequests);
        for (NotificationRecipient recipient : recipients) {
            deliverEmailAndInAppNotification(
                    recipient,
                    "Shipment requisition(s) awaiting B2S approval",
                    body,
                    "awaiting B2S approval");
        }
    }

    /**
     * Emails and in-app notifies Sponsor Approver users who have read+write on each request's ACL
     * when requests move to Awaiting Sponsor Approval. Does not fall back to other groups. One
     * message per recipient listing their matching requests. Call only after every transition in
     * the save has been validated. Delivery failures are logged and do not fail the save.
     */
    public void notifyAwaitingSponsorApproval(List<RequestModel> awaitingSponsorRequests) throws Throwable {
        if (awaitingSponsorRequests == null || awaitingSponsorRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(awaitingSponsorRequests, ProjectModel.class);

        Map<String, Boolean> sponsorApproverByUsername = new HashMap<>();
        Map<String, NotificationRecipient> recipientByEmail = new LinkedHashMap<>();
        Map<String, List<RequestModel>> requestsByRecipientEmail = new LinkedHashMap<>();

        for (RequestModel request : awaitingSponsorRequests) {
            // Only Sponsor Approvers with ACL on THIS request — not the whole group, no fallback
            List<NotificationRecipient> recipients =
                    findSponsorApproverRecipients(request, sponsorApproverByUsername);
            if (recipients.isEmpty()) {
                logger.error("ShipmentRequisitionManager: No ACL Sponsor Approver with email for "
                        + "Awaiting Sponsor Approval request "
                        + StringUtils.defaultIfBlank(request.getRequestId(),
                        String.valueOf(request.getRecordId())));
                continue;
            }
            for (NotificationRecipient recipient : recipients) {
                if (StringUtils.isBlank(recipient.email)) {
                    continue;
                }
                recipientByEmail.putIfAbsent(recipient.email, recipient);
                requestsByRecipientEmail.computeIfAbsent(recipient.email, key -> new ArrayList<>())
                        .add(request);
            }
        }

        if (requestsByRecipientEmail.isEmpty()) {
            return;
        }

        for (Map.Entry<String, List<RequestModel>> entry : requestsByRecipientEmail.entrySet()) {
            NotificationRecipient recipient = recipientByEmail.get(entry.getKey());
            String body = buildAwaitingSponsorApprovalEmailBody(entry.getValue());
            deliverEmailAndInAppNotification(
                    recipient,
                    "Shipment requisition(s) awaiting sponsor approval",
                    body,
                    "awaiting sponsor approval");
        }
    }

    /**
     * Emails and in-app notifies each shipped request's Sponsor Contact with request and shipment
     * box details. Call only after every transition in the save has been validated. Delivery
     * failures are logged and do not fail the save.
     */
    public void notifyShipped(List<RequestModel> shippedRequests) throws Throwable {
        if (shippedRequests == null || shippedRequests.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(shippedRequests, C_SponsorContactModel.class);
        relationshipMan.loadChildren(shippedRequests, C_ShipmentBoxModel.class);

        for (RequestModel request : shippedRequests) {
            C_SponsorContactModel contact = request.get(Parent.ofType(C_SponsorContactModel.class));
            if (contact == null || StringUtils.isBlank(contact.getC_EmailAddress())) {
                logger.error("ShipmentRequisitionManager: No Sponsor Contact email for shipped request "
                        + StringUtils.defaultIfBlank(request.getRequestId(),
                        String.valueOf(request.getRecordId())));
                continue;
            }
            NotificationRecipient recipient = new NotificationRecipient(
                    StringUtils.trimToNull(contact.getC_Username()),
                    contact.getC_EmailAddress().trim());
            String body = buildShippedEmailBody(request);
            deliverEmailAndInAppNotification(
                    recipient,
                    "Your Request has Shipped",
                    body,
                    "shipped");
        }
    }

    /**
     * Sends the same HTML body as email and as an in-app {@link SessionManager#sendUserMessage}
     * to the same recipient. Failures are logged independently and never fail the save.
     */
    private void deliverEmailAndInAppNotification(NotificationRecipient recipient, String subject,
            String htmlBody, String notificationKind) {
        if (recipient == null || StringUtils.isBlank(recipient.email)) {
            return;
        }

        try {
            Email email = Email.builder()
                    .to(recipient.email)
                    .subject(subject)
                    .htmlBody(htmlBody)
                    .build();
            exemplarContext.getInstance(EmailSender.class).sendEmail(email, true);
        } catch (Exception e) {
            logger.error("ShipmentRequisitionManager: Failed to send " + notificationKind
                    + " email to " + recipient.email, e);
        }

        // Prefer Sapio username; fall back to email (sponsor usernames are typically the email).
        String inAppUsername = StringUtils.isNotBlank(recipient.username)
                ? recipient.username
                : recipient.email;
        try {
            SessionManager sessionManager = dataMgmtServer.getSessionManager();
            sessionManager.sendUserMessage(htmlBody, List.of(inAppUsername), user);
        } catch (Exception e) {
            logger.error("ShipmentRequisitionManager: Failed to send " + notificationKind
                    + " in-app notification to " + inAppUsername, e);
        }
    }

    // True when this user is allowed to deny from the current status and Denial Reason is still empty
    private boolean needsDenialReasonPrompt(String previousStatus, String newStatus, String groupName,
            RequestModel request) {
        if (StringUtils.isNotBlank(request.getC_DenialReason()) || !STATUS_DENIED.equals(newStatus)) {
            return false;
        }
        String from = normalizeStatus(previousStatus);
        if (STATUS_AWAITING_B2S_APPROVAL.equals(from)) {
            return B2S_APPROVER_GROUPS.contains(groupName);
        }
        if (STATUS_AWAITING_SPONSOR_APPROVAL.equals(from)
                || STATUS_SUBMITTED.equals(from)
                || STATUS_UNDER_REVIEW.equals(from)
                || STATUS_APPROVED.equals(from)) {
            return GROUP_SPONSOR_APPROVER.equals(groupName);
        }
        return false;
    }

    // True for the two "approve forward" moves that require an electronic signature
    private static boolean needsApprovalESign(String previousStatus, String newStatus) {
        String from = normalizeStatus(previousStatus);
        String to = normalizeStatus(newStatus);
        return (STATUS_AWAITING_B2S_APPROVAL.equals(from) && STATUS_AWAITING_SPONSOR_APPROVAL.equals(to))
                || (STATUS_AWAITING_SPONSOR_APPROVAL.equals(from) && STATUS_APPROVED.equals(to));
    }

    /**
     * Collects an e-signature for an approval transition and writes it to the system log.
     * Cancel or failed authentication aborts the save.
     */
    private void promptForApprovalESign(RequestModel request, String previousStatus, String newStatus)
            throws Throwable {
        String requestId = requestLabel(request);
        String from = normalizeStatus(previousStatus);
        String to = normalizeStatus(newStatus);
        String message = "Authenticate to move " + requestId + " from " + from + " to " + to + ".";

        ESignAuthentication eSign = clientCallback.showESignDialog(
                ESIGN_TITLE,
                message,
                true,
                buildApprovalESignFields(request, from, to),
                user);
        if (eSign == null || !eSign.isAuthenticated()) {
            clientCallback.displayError(requestId + ": " + ESIGN_REQUIRED_MESSAGE);
            throw new UserRequestedCancelServerException();
        }

        String userComment = StringUtils.defaultIfBlank(eSign.getUserComment(),
                "Approve requisition: " + from + " → " + to);
        user.getSystemLog().appendESignatureLog(
                SystemLogESignLoggingRequest.builder()
                        .eSignAuthentication(eSign)
                        .dataRecordsToESign(Collections.singletonList(request.getDataRecord()))
                        .userComment(userComment)
                        .build(),
                user);
        // The system e-sign log isn't shown on the record's audit trail, so record the signature there too
        user.getAuditLog().logInfo("E-signed " + from + " → " + to + ": " + userComment,
                request.getDataRecord(), user);
    }

    private static TemporaryDataType buildApprovalESignFields(RequestModel request, String from, String to)
            throws ServerException, RemoteException {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName("RequestId")
                .displayName("Request ID")
                .editable(false)
                .required(false)
                .defaultValue(requestLabel(request))
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName("FromStatus")
                .displayName("From Status")
                .editable(false)
                .required(false)
                .defaultValue(from)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName("ToStatus")
                .displayName("To Status")
                .editable(false)
                .required(false)
                .defaultValue(to)
                .build());
        return formBuilder.getTemporaryDataType();
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

    /**
     * Finds people to notify for a specific request:
     * must be on the Request's user ACL with read+write, AND be in the Sponsor Approver group.
     * That way we only email the sponsor approver(s) who can actually see / act on this record.
     */
    private List<NotificationRecipient> findSponsorApproverRecipients(RequestModel request,
            Map<String, Boolean> sponsorApproverByUsername) throws Throwable {
        DataRecordACL acl = request.getDataRecord().getDataRecordACL(user);
        Map<String, DataRecordAccess> userAccessMap = acl == null ? null : acl.getDataRecordAccessMap();
        if (userAccessMap == null || userAccessMap.isEmpty()) {
            return List.of();
        }

        VeloxUserManager userManager = dataMgmtServer.getVeloxUserManager(user);
        Map<String, NotificationRecipient> recipientsByEmail = new LinkedHashMap<>();
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
            String email = null;
            if (userInfo != null && StringUtils.isNotBlank(userInfo.getEmailAddress())) {
                email = userInfo.getEmailAddress().trim();
            } else if (StringUtils.isNotBlank(username) && username.contains("@")) {
                // Sponsor usernames are typically the email address.
                email = username.trim();
            }
            if (StringUtils.isBlank(email)) {
                continue;
            }
            recipientsByEmail.putIfAbsent(email, new NotificationRecipient(username, email));
        }
        return new ArrayList<>(recipientsByEmail.values());
    }

    /** Users in Logistics or Project Coordinator who have an email address. */
    private List<NotificationRecipient> findLogisticsAndProjectCoordinatorRecipients() throws Throwable {
        return findRecipientsInGroups(LOGISTICS_OR_COORDINATOR);
    }

    /**
     * Users in any of the given groups who have an email address (deduped by email).
     * Uses getUserInfoMapForGroups (as the rule email action does): UserGroup.getUserList needs
     * user-admin privileges, so it fails when a sponsor's save notifies B2S groups.
     */
    private List<NotificationRecipient> findRecipientsInGroups(Set<String> groupNames) throws Throwable {
        Map<String, NotificationRecipient> recipientsByEmail = new LinkedHashMap<>();
        Map<String, Set<UserInfo>> usersByGroup =
                dataMgmtServer.getUserGroupManager(user).getUserInfoMapForGroups(groupNames, user);
        debugRecipientLookup(groupNames, usersByGroup);
        if (usersByGroup == null) {
            return new ArrayList<>();
        }
        for (Set<UserInfo> groupUsers : usersByGroup.values()) {
            if (groupUsers == null) {
                continue;
            }
            for (UserInfo groupUser : groupUsers) {
                if (groupUser == null || StringUtils.isBlank(groupUser.getEmailAddress())) {
                    continue;
                }
                String email = groupUser.getEmailAddress().trim();
                String username = StringUtils.trimToNull(groupUser.getUsername());
                recipientsByEmail.putIfAbsent(email, new NotificationRecipient(username, email));
            }
        }
        return new ArrayList<>(recipientsByEmail.values());
    }

    // TEMP DEBUG (B2S1-249, 10/30): shows what the group lookup returned for the current user. Remove before stage.
    private void debugRecipientLookup(Set<String> groupNames, Map<String, Set<UserInfo>> usersByGroup)
            throws Throwable {
        StringBuilder message = new StringBuilder("Lookup as " + user.getUsername() + " for " + groupNames + ":");
        if (usersByGroup == null) {
            message.append("\n(null map)");
        } else if (usersByGroup.isEmpty()) {
            message.append("\n(empty map)");
        } else {
            for (Map.Entry<String, Set<UserInfo>> entry : usersByGroup.entrySet()) {
                Set<UserInfo> users = entry.getValue();
                message.append("\n").append(entry.getKey()).append(": ")
                        .append(users == null ? "null" : users.size() + " user(s)");
                if (users != null) {
                    for (UserInfo info : users) {
                        message.append("\n  - ").append(info == null ? "null"
                                : info.getUsername() + " <" + StringUtils.defaultIfBlank(info.getEmailAddress(), "no email") + ">");
                    }
                }
            }
        }
        logger.info("ShipmentRequisitionManager DEBUG " + message);
        if (clientCallback != null) {
            try {
                clientCallback.displayPopup("DEBUG: notification recipients", message.toString(), PopupType.Info);
            } catch (Exception e) {
                logger.error("ShipmentRequisitionManager: debug popup failed", e);
            }
        }
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
        return buildRequestListEmailBody("The following requests have been submitted:", requests);
    }

    private String buildAwaitingB2SApprovalEmailBody(List<RequestModel> requests)
            throws RemoteException, ServerException {
        return buildRequestListEmailBody(
                "The following requests are awaiting B2S approval:", requests);
    }

    private String buildAwaitingSponsorApprovalEmailBody(List<RequestModel> requests)
            throws RemoteException, ServerException {
        return buildRequestListEmailBody(
                "The following requests are awaiting sponsor approval:", requests);
    }

    private String buildRequestListEmailBody(String intro, List<RequestModel> requests)
            throws RemoteException, ServerException {
        StringBuilder html = new StringBuilder();
        html.append("<p>").append(escapeHtml(intro)).append("</p>");
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

    /** Email recipient plus Sapio username for the matching in-app notification. */
    private static final class NotificationRecipient {
        private final String username;
        private final String email;

        private NotificationRecipient(String username, String email) {
            this.username = username;
            this.email = email;
        }
    }
}
