/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnTableToolbarContext;
import com.velox.api.plugin.invocation.context.TableToolbarContext;
import com.velox.api.system.SystemLogESignLoggingRequest;
import com.velox.api.user.ESignAuthentication;
import com.velox.api.util.PopupType;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.sapio.commons.collection.iterable.IterableUtil;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.PluginOrder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultTableToolbarPlugin;
import org.apache.commons.lang3.StringUtils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Marks selected Pending shipment boxes as In Transit after a single e-signature (Logistics only).
 *
 * Created: 2025-09-25
 * Agent type: Composer
 */
public class MarkShipmentBoxSent extends DefaultTableToolbarPlugin {

    private static final String ESIGN_TITLE = "Electronic Signature";
    private static final String ESIGN_MESSAGE =
            "Authenticate to mark the selected shipment box(es) as sent (In Transit).";

    @Override
    public String getLine1Text() {
        return "Mark";
    }

    @Override
    public String getLine2Text() {
        return "Sent";
    }

    @Override
    public String getDescription() {
        return "Mark selected Pending shipment boxes as In Transit (requires e-signature).";
    }

    @Override
    public int getOrder() {
        return PluginOrder.MIDDLE.getOrder();
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "truck-delivery-outline.svg");
    }

    @Override
    public boolean onTableToolbar(OnTableToolbarContext ctx) throws Throwable {
        if (ctx.getDataTypeName() == null
                || !C_ShipmentBoxModel.DATA_TYPE_NAME.equalsIgnoreCase(ctx.getDataTypeName())) {
            return false;
        }
        return ShipmentBoxTableToolbarSupport.isLogisticsUser(user, dataMgmtServer);
    }

    @Override
    protected PluginResult run(TableToolbarContext ctx) throws Throwable {
        try {
            List<C_ShipmentBoxModel> selectedBoxes = resolveSelectedShipmentBoxes(ctx);
            if (IterableUtil.isBlank(selectedBoxes)) {
                clientCallback.displayPopup(
                        "No Selection",
                        "Select one or more Shipment Box rows to mark as sent.",
                        PopupType.Warning);
                return new PluginResult(false);
            }

            List<C_ShipmentBoxModel> boxesToUpdate = selectedBoxes.stream()
                    .filter(ShipmentBoxTableToolbarSupport::isPending)
                    .collect(Collectors.toList());
            if (boxesToUpdate.isEmpty()) {
                clientCallback.displayInfo(
                        "No eligible boxes\n\nNone of the selected rows have status Pending. No changes were made.");
                return new PluginResult(true);
            }

            ESignAuthentication eSign = clientCallback.showESignDialog(
                    ESIGN_TITLE,
                    ESIGN_MESSAGE,
                    true,
                    buildReadOnlyESignFields(boxesToUpdate),
                    user);
            if (eSign == null || !eSign.isAuthenticated()) {
                return new PluginResult(true);
            }

            long shippedDate = System.currentTimeMillis();
            String userComment = StringUtils.defaultIfBlank(eSign.getUserComment(), "Mark Sent");
            for (C_ShipmentBoxModel shipmentBox : boxesToUpdate) {
                user.getSystemLog().appendESignatureLog(
                        SystemLogESignLoggingRequest.builder()
                                .eSignAuthentication(eSign)
                                .dataRecordsToESign(Collections.singletonList(shipmentBox.getDataRecord()))
                                .userComment(userComment)
                                .build(),
                        user);
                shipmentBox.setC_Status(ShipmentBoxTableToolbarSupport.STATUS_IN_TRANSIT);
                shipmentBox.setC_ShippedDate(shippedDate);
            }

            recMan.storeAndCommit("Mark " + boxesToUpdate.size() + " shipment box(es) sent");
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    private List<C_ShipmentBoxModel> resolveSelectedShipmentBoxes(TableToolbarContext ctx) throws Throwable {
        List<DataRecord> dataRecordList = ctx.getDataRecordList();
        if (IterableUtil.isBlank(dataRecordList)) {
            return List.of();
        }
        if (!C_ShipmentBoxModel.DATA_TYPE_NAME.equalsIgnoreCase(dataRecordList.get(0).getDataTypeName())) {
            return List.of();
        }
        return new ArrayList<>(instMan.addExistingRecordsOfType(dataRecordList, C_ShipmentBoxModel.class));
    }

    private static TemporaryDataType buildReadOnlyESignFields(List<C_ShipmentBoxModel> boxesToUpdate)
            throws ServerException, RemoteException {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.longFieldBuilder()
                .dataFieldName("BoxCount")
                .displayName("Boxes to Mark Sent")
                .editable(false)
                .required(false)
                .defaultValue((long) boxesToUpdate.size())
                .build());
        String boxSummary = boxesToUpdate.stream()
                .map(box -> StringUtils.defaultIfBlank(box.getDataRecordName(),
                        box.getRecordId() == null ? "" : String.valueOf(box.getRecordId())))
                .collect(Collectors.joining(", "));
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName("BoxIds")
                .displayName("Shipment Box ID(s)")
                .editable(false)
                .required(false)
                .defaultValue(boxSummary)
                .build());
        return formBuilder.getTemporaryDataType();
    }
}
