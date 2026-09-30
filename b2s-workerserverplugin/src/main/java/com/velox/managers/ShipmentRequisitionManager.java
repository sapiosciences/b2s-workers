/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.managers;

import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.user.User;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
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

    // Must be the OnSave plugin's clientCallback — not looked up later from context.
    private final ClientCallbackOperations clientCallback;
    private final User user;
    private final DataMgmtServer dataMgmtServer;

    public ShipmentRequisitionManager(ClientCallbackOperations clientCallback, User user,
            DataMgmtServer dataMgmtServer) {
        this.clientCallback = clientCallback;
        this.user = user;
        this.dataMgmtServer = dataMgmtServer;
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
        // Deny: Submitted or Under Review → Denied (Sponsor Approver + reason)
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
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

    // Ask for Denial Reason when a Sponsor Approver is denying and the field is still blank.
    private boolean needsDenialReasonPrompt(String previousStatus, String newStatus, String groupName,
            RequestModel request) {
        if (!GROUP_SPONSOR_APPROVER.equals(groupName) || StringUtils.isNotBlank(request.getC_DenialReason())) {
            return false;
        }
        String from = normalizeStatus(previousStatus);
        return (STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
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
