/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.onSave;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnSaveContext;
import com.velox.managers.RequisitionNotificationElevatedPlugin;
import com.velox.managers.ShipmentRequisitionManager;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * B2S1-244: gatekeeper for Shipment Requisition status changes on save.
 *
 * <p>Whenever someone saves a Request and changes Requisition Status, this plugin:
 * <ol>
 *   <li>Checks whether that user's group is allowed to make that move (unless Sapio Admin)</li>
 *   <li>May prompt for a Denial Reason or an e-signature along the way</li>
 *   <li>Sends email / in-app alerts for certain new statuses (Submitted, awaiting approvals, Shipped)</li>
 * </ol>
 * The actual rules and notification logic live in {@link ShipmentRequisitionManager}.
 */
public class RequisitionStatusOnSave extends DefaultOnSavePlugin {

    // Filled by shouldRun — only the Requests whose Requisition Status field just changed
    private List<RequestModel> changedRequests;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        // Walk everything in this save and keep only Shipment Requisitions whose status changed
        List<DataRecord> requestRecords = new ArrayList<>();
        for (DataRecord record : ctx.getDataRecordList()) {
            if (!RequestModel.DATA_TYPE_NAME.equals(record.getDataTypeName())
                    || !record.isChanged(RequestModel.C___REQUISITION_STATUS)) {
                continue;
            }
            // Ignore other Request types (e.g. sample submissions)
            if (!ShipmentRequisitionManager.REQUEST_TYPE_SHIPMENT_REQUISITION.equals(
                    record.getStringVal(RequestModel.C___REQUEST_TYPE, user))) {
                continue;
            }
            requestRecords.add(record);
        }

        // No matching requests, or no UI session (can't show dialogs) → skip this plugin
        if (requestRecords.isEmpty() || clientCallback == null) {
            return false;
        }
        changedRequests = instMan.addExistingRecordsOfType(requestRecords, RequestModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Active Sapio group for the user doing the save — drives who is allowed to change status
        String groupName = user.getUserGroup().getGroupName();
        // Sapio Admin bypasses the transition rules (still gets notifications below)
        boolean isAdmin = ShipmentRequisitionManager.GROUP_SAPIO_ADMIN.equals(groupName);

        // Must use this OnSave's clientCallback so denial / e-sign dialogs actually appear
        ShipmentRequisitionManager requisitionMan =
                new ShipmentRequisitionManager(clientCallback, exemplarContext);

        try {
            if (!isAdmin) {
                // Shipped / Delivered rules look at child boxes, so load them before validating
                relationshipMan.loadChildren(changedRequests, C_ShipmentBoxModel.class);
                List<String> errors = requisitionMan.validateRequests(changedRequests, groupName);
                if (!errors.isEmpty()) {
                    // Illegal move → show the errors and abort the whole save
                    clientCallback.displayError(String.join("\n", errors));
                    return new PluginResult(false);
                }
            }

            // Bucket requests by the status they just landed in, so we know whom to notify
            List<RequestModel> submittedRequests = new ArrayList<>();
            List<RequestModel> awaitingB2SRequests = new ArrayList<>();
            List<RequestModel> awaitingSponsorRequests = new ArrayList<>();
            List<RequestModel> shippedRequests = new ArrayList<>();
            for (RequestModel request : changedRequests) {
                String status = request.getC_RequisitionStatus();
                if (ShipmentRequisitionManager.STATUS_SUBMITTED.equals(status)) {
                    submittedRequests.add(request);
                } else if (ShipmentRequisitionManager.STATUS_AWAITING_B2S_APPROVAL.equals(status)) {
                    awaitingB2SRequests.add(request);
                } else if (ShipmentRequisitionManager.STATUS_AWAITING_SPONSOR_APPROVAL.equals(status)) {
                    awaitingSponsorRequests.add(request);
                } else if (ShipmentRequisitionManager.STATUS_SHIPPED.equals(status)) {
                    shippedRequests.add(request);
                }
            }

            // Alerts only after every transition in this save was accepted (or admin bypassed checks).
            // Queued to run elevated after commit: a sponsor can't list B2S group members.
            RequisitionNotificationElevatedPlugin.queue(user, RequisitionNotificationElevatedPlugin.KIND_SUBMITTED, submittedRequests);
            RequisitionNotificationElevatedPlugin.queue(user, RequisitionNotificationElevatedPlugin.KIND_AWAITING_B2S, awaitingB2SRequests);
            RequisitionNotificationElevatedPlugin.queue(user, RequisitionNotificationElevatedPlugin.KIND_AWAITING_SPONSOR, awaitingSponsorRequests);
            RequisitionNotificationElevatedPlugin.queue(user, RequisitionNotificationElevatedPlugin.KIND_SHIPPED, shippedRequests);

            // Write any Denial Reason collected during validation onto the ongoing save
            recMan.storeChanges();
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            // User backed out of the denial-reason or e-sign dialog → cancel the save
            return new PluginResult(false);
        }
    }
}
