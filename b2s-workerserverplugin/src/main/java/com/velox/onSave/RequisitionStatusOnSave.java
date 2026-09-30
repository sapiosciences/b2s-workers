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
import com.velox.managers.ShipmentRequisitionManager;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * B2S1-244: block illegal Shipment Requisition status changes on save.
 */
public class RequisitionStatusOnSave extends DefaultOnSavePlugin {

    // Filled by shouldRun — Requests whose Requisition Status just changed
    private List<RequestModel> changedRequests;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        // Only Shipment Requisitions where status actually changed
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

        // Need a live UI session for error popups / denial-reason prompt
        if (requestRecords.isEmpty() || clientCallback == null) {
            return false;
        }
        changedRequests = instMan.addExistingRecordsOfType(requestRecords, RequestModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Admins can change status freely
        String groupName = user.getUserGroup().getGroupName();
        if (ShipmentRequisitionManager.GROUP_SAPIO_ADMIN.equals(groupName)) {
            return new PluginResult(true);
        }

        try {
            // Box rules need child shipment boxes loaded first
            relationshipMan.loadChildren(changedRequests, C_ShipmentBoxModel.class);

            // Pass this plugin's clientCallback so dialogs work in OnSave
            ShipmentRequisitionManager requisitionMan =
                    new ShipmentRequisitionManager(clientCallback, user, dataMgmtServer);
            List<String> errors = requisitionMan.validateRequests(changedRequests, groupName);

            if (!errors.isEmpty()) {
                clientCallback.displayError(String.join("\n", errors));
                return new PluginResult(false);
            }
            // Persist any Denial Reason we just collected on the requests
            recMan.storeChanges();
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            // User cancelled the denial-reason dialog
            return new PluginResult(false);
        }
    }
}
