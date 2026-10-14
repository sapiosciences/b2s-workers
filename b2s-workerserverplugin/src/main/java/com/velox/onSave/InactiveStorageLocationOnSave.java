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
import com.velox.recordmodels.StorageUnitModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;
import com.velox.sapio.commons.exemplar.recordmodel.ancestor.ExemplarAncestors;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Blocks storing items into an inactive Storage Unit when StorageLocationBarcode changes.
 * The leaf Storage Unit ID (last barcode path segment) and its ancestors are checked for IsActive.
 */
public class InactiveStorageLocationOnSave extends DefaultOnSavePlugin {

    private static final String STORAGE_LOCATION_BARCODE = "StorageLocationBarcode";

    // Records whose StorageLocationBarcode just changed — filled in by shouldRun()
    private List<DataRecord> recordsWithChangedStorageLocation;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> dataRecordList = ctx.getDataRecordList();
        if (dataRecordList == null) {
            return false;
        }

        List<DataRecord> matched = new ArrayList<>();
        for (DataRecord record : dataRecordList) {
            Object barcode;
            try {
                barcode = record.getDataField(STORAGE_LOCATION_BARCODE, user);
            } catch (Throwable t) {
                continue;
            }
            if (barcode == null || !record.isChanged(STORAGE_LOCATION_BARCODE)) {
                continue;
            }
            matched.add(record);
        }

        if (matched.isEmpty() || clientCallback == null) {
            return false;
        }
        recordsWithChangedStorageLocation = matched;
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Leaf only — ancestors are loaded via ancestorMan, so do not also treat path parents as roots
        Set<String> storageUnitIds = new LinkedHashSet<>();
        for (DataRecord record : recordsWithChangedStorageLocation) {
            Object barcodeValue = record.getDataField(STORAGE_LOCATION_BARCODE, user);
            if (barcodeValue == null) {
                continue;
            }
            String leafId = null;
            for (String segment : barcodeValue.toString().split("/")) {
                if (!segment.isEmpty()) {
                    leafId = segment;
                }
            }
            if (leafId != null) {
                storageUnitIds.add(leafId);
            }
        }

        if (storageUnitIds.isEmpty()) {
            return new PluginResult(true);
        }

        List<DataRecord> storageUnitRecords = dataRecordManager.queryDataRecords(
                StorageUnitModel.DATA_TYPE_NAME,
                StorageUnitModel.STORAGE_UNIT_ID,
                new ArrayList<>(storageUnitIds),
                user);
        if (storageUnitRecords == null || storageUnitRecords.isEmpty()) {
            return new PluginResult(true);
        }

        List<StorageUnitModel> storageUnits =
                instMan.addExistingRecordsOfType(storageUnitRecords, StorageUnitModel.class);
        ancestorMan.loadAncestors(storageUnits, StorageUnitModel.class);

        List<String> errors = new ArrayList<>();
        for (StorageUnitModel storageUnit : storageUnits) {
            if (!storageUnit.getIsActive()) {
                errors.add("Cannot store items in inactive storage unit \""
                        + storageUnit.getStorageUnitId()
                        + "\". The selected storage unit itself is inactive.");
                continue;
            }
            for (StorageUnitModel ancestor : storageUnit.get(ExemplarAncestors.ofType(StorageUnitModel.class))) {
                if (!ancestor.getIsActive()) {
                    errors.add("Cannot store items in storage unit \""
                            + storageUnit.getStorageUnitId()
                            + "\" because ancestor storage unit \""
                            + ancestor.getStorageUnitId()
                            + "\" is inactive.");
                    break;
                }
            }
        }

        if (!errors.isEmpty()) {
            clientCallback.displayError(String.join("\n", errors));
            return new PluginResult(false);
        }
        return new PluginResult(true);
    }
}
