/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.onSave;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnSaveContext;
import com.velox.managers.ShipmentRequisitionManager;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * B2S1-244: validate / enforce requisition status transitions on Request save.
 */
public class RequisitionStatusOnSave extends DefaultOnSavePlugin {

    // Requests from the current save whose Requisition Status just changed — filled in by shouldRun()
    private List<RequestModel> changedRequests;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> requestRecords = new ArrayList<>();
        for (DataRecord record : ctx.getDataRecordList()) {
            if (!RequestModel.DATA_TYPE_NAME.equals(record.getDataTypeName())
                    || !record.isChanged(RequestModel.C___REQUISITION_STATUS)) {
                continue;
            }
            if (!ShipmentRequisitionManager.REQUEST_TYPE_SHIPMENT_REQUISITION.equals(
                    record.getStringVal(RequestModel.C___REQUEST_TYPE, user))) {
                continue;
            }
            requestRecords.add(record);
        }
        if (requestRecords.isEmpty()) {
            return false;
        }
        changedRequests = instMan.addExistingRecordsOfType(requestRecords, RequestModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        String groupName = user.getUserGroup().getGroupName();
        ShipmentRequisitionManager requisitionMan = new ShipmentRequisitionManager(exemplarContext);
        boolean isAdmin = ShipmentRequisitionManager.GROUP_SAPIO_ADMIN.equals(groupName);

        if (!isAdmin) {
            relationshipMan.loadChildren(changedRequests, C_ShipmentBoxModel.class);
        }

        List<String> errors = new ArrayList<>();
        List<RequestModel> submittedRequests = new ArrayList<>();
        List<RequestModel> shippedRequests = new ArrayList<>();
        for (RequestModel request : changedRequests) {
            if (!isAdmin) {
                Object lastSaved = request.getDataRecord().getLastSavedValue(RequestModel.C___REQUISITION_STATUS);
                String previousStatus = lastSaved == null ? null : lastSaved.toString();
                String error = requisitionMan.validateTransition(
                        request, previousStatus, request.getC_RequisitionStatus(), groupName);
                if (error != null) {
                    errors.add(error);
                }
            }
            if (ShipmentRequisitionManager.STATUS_SUBMITTED.equals(request.getC_RequisitionStatus())) {
                submittedRequests.add(request);
            } else if (ShipmentRequisitionManager.STATUS_SHIPPED.equals(request.getC_RequisitionStatus())) {
                shippedRequests.add(request);
            }
        }
        if (!errors.isEmpty()) {
            if (clientCallback != null) {
                clientCallback.displayError(String.join("\n", errors));
            }
            return new PluginResult(false);
        }

        // Only after every transition in this save has been accepted.
        if (!submittedRequests.isEmpty()) {
            requisitionMan.notifySubmitted(submittedRequests);
        }
        if (!shippedRequests.isEmpty()) {
            requisitionMan.notifyShipped(shippedRequests);
        }
        return new PluginResult(true);
    }
}
