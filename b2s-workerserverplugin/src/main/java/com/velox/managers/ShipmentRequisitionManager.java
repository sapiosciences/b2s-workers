/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.managers;

import com.velox.api.clientcallback.InputDialogCriteria;
import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.user.User;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.api.util.InputDialogResult;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
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

    public static final String DENIAL_REASON_REQUIRED_MESSAGE =
            "Please choose a Denial Reason before denying a request";

    private static final Set<String> LOGISTICS_OR_COORDINATOR =
            Set.of(GROUP_LOGISTICS, GROUP_PROJECT_COORDINATOR);

    /**
     * Validates a requisition status change for the given session group.
     * Does not prompt for or enforce Denial Reason — call {@link #ensureDenialReason} after this passes.
     *
     * @return an error message if the change is not allowed, or null if it is legal
     */
    public String validateTransition(RequestModel request, String previousStatus, String newStatus,
            String groupName) {
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
        // Submitted / Under Review → Denied: Sponsor Approver
        } else if ((STATUS_SUBMITTED.equals(from) || STATUS_UNDER_REVIEW.equals(from))
                && STATUS_DENIED.equals(to)) {
            allowed = GROUP_SPONSOR_APPROVER.equals(groupName);
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
        String requestId = StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
        String fromDisplay = from.isEmpty() ? "(blank)" : from;
        String toDisplay = to.isEmpty() ? "(blank)" : to;
        return requestId + ": " + groupName + " cannot move a request from " + fromDisplay + " to " + toDisplay;
    }

    /**
     * If {@code C_DenialReason} is blank, prompts with the Request field definition so the user can
     * select or type a reason, then writes it onto the request.
     *
     * @return {@link #DENIAL_REASON_REQUIRED_MESSAGE} if the user cancels or leaves it blank; null if set
     */
    public String ensureDenialReason(RequestModel request, ClientCallbackOperations clientCallback,
            User user, DataMgmtServer dataMgmtServer) throws Throwable {
        if (StringUtils.isNotBlank(request.getC_DenialReason())) {
            return null;
        }
        if (clientCallback == null) {
            String requestId = StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
            return requestId + ": " + DENIAL_REASON_REQUIRED_MESSAGE;
        }

        VeloxFieldDefinition<?> denialReasonField = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(RequestModel.DATA_TYPE_NAME)
                .getVeloxFieldDefinition(RequestModel.C___DENIAL_REASON, user);
        denialReasonField.setRequired(true);
        denialReasonField.setEditable(true);

        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Denial Reason")
                .message("Choose a Denial Reason for " + StringUtils.defaultIfBlank(
                        request.getRequestId(), "this request") + ".")
                .fieldDefinition(denialReasonField)
                .build());
        if (input == null || input.getValue() == null
                || StringUtils.isBlank(input.getValue().toString())) {
            String requestId = StringUtils.defaultIfBlank(request.getRequestId(), RequestModel.DATA_TYPE_NAME);
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

    private static String normalizeStatus(String value) {
        return value == null ? "" : StringUtils.trimToEmpty(value);
    }
}
