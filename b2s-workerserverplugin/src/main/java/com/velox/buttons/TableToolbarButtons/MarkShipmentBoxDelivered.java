/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnTableToolbarContext;
import com.velox.api.plugin.invocation.context.TableToolbarContext;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.sapio.commons.collection.iterable.IterableUtil;
import com.velox.sapio.commons.exemplar.plugin.PluginOrder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultTableToolbarPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Marks selected In Transit shipment boxes as Delivered (Logistics only, no e-signature).
 *
 * Created: 2025-09-25
 * Agent type: Composer
 */
public class MarkShipmentBoxDelivered extends DefaultTableToolbarPlugin {

    @Override
    public String getLine1Text() {
        return "Mark";
    }

    @Override
    public String getLine2Text() {
        return "Delivered";
    }

    @Override
    public String getDescription() {
        return "Mark selected In Transit shipment boxes as Delivered.";
    }

    @Override
    public int getOrder() {
        return PluginOrder.MIDDLE.getOrder() + 1;
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "package-variant-closed-check.svg");
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
        List<C_ShipmentBoxModel> selectedBoxes = resolveSelectedShipmentBoxes(ctx);
        if (IterableUtil.isBlank(selectedBoxes)) {
            clientCallback.displayPopup(
                    "No Selection",
                    "Select one or more Shipment Box rows to mark as delivered.",
                    PopupType.Warning);
            return new PluginResult(false);
        }

        List<C_ShipmentBoxModel> boxesToUpdate = selectedBoxes.stream()
                .filter(ShipmentBoxTableToolbarSupport::isInTransit)
                .collect(Collectors.toList());
        if (boxesToUpdate.isEmpty()) {
            clientCallback.displayInfo(
                    "No eligible boxes\n\nNone of the selected rows have status In Transit. No changes were made.");
            return new PluginResult(true);
        }

        long deliveredDate = System.currentTimeMillis();
        for (C_ShipmentBoxModel shipmentBox : boxesToUpdate) {
            shipmentBox.setC_Status(ShipmentBoxTableToolbarSupport.STATUS_DELIVERED);
            shipmentBox.setC_DeliveredDate(deliveredDate);
        }

        recMan.storeAndCommit("Mark " + boxesToUpdate.size() + " shipment box(es) delivered");
        return new PluginResult(true);
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
}
