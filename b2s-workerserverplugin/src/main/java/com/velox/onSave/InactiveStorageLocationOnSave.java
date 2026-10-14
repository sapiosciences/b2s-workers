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
 * Stops users from putting items into an inactive Storage Unit (or under an inactive ancestor).
 *
 * <p>When something is moved into storage, Sapio writes a slash-delimited path on
 * StorageLocationBarcode (e.g. {@code Freezer/Shelf/Rack/Box}). We take the last segment as the
 * unit they landed in, then make sure that unit and every Storage Unit above it is still active.
 */
public class InactiveStorageLocationOnSave extends DefaultOnSavePlugin {

    private static final String STORAGE_LOCATION_BARCODE = "StorageLocationBarcode";

    // Records from this save whose storage location just changed — filled in by shouldRun()
    private List<DataRecord> recordsWithChangedStorageLocation;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> dataRecordList = ctx.getDataRecordList();
        if (dataRecordList == null) {
            return false;
        }

        // A save can mix many data types; only keep records that actually got a new storage location
        List<DataRecord> matched = new ArrayList<>();
        for (DataRecord record : dataRecordList) {
            Object barcode;
            try {
                // Not every data type has StorageLocationBarcode — missing field throws, so skip those
                barcode = record.getDataField(STORAGE_LOCATION_BARCODE, user);
            } catch (Throwable t) {
                continue;
            }
            // Empty location, or location unchanged on this save — nothing for us to validate
            if (barcode == null || !record.isChanged(STORAGE_LOCATION_BARCODE)) {
                continue;
            }
            matched.add(record);
        }

        // Need a UI session so we can show the error popup if validation fails
        if (matched.isEmpty() || clientCallback == null) {
            return false;
        }
        recordsWithChangedStorageLocation = matched;
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Collect the leaf Storage Unit ID from each barcode (last path segment only).
        // Parents in the path are covered later via ancestorMan — checking them here too would
        // duplicate the same inactive-ancestor error for every level of the path.
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

        // Resolve those IDs to real Storage Unit records
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
        // Pull in every Storage Unit above each leaf in the hierarchy
        ancestorMan.loadAncestors(storageUnits, StorageUnitModel.class);

        List<String> errors = new ArrayList<>();
        for (StorageUnitModel storageUnit : storageUnits) {
            // The unit itself is inactive
            if (!storageUnit.getIsActive()) {
                errors.add("Cannot store items in inactive storage unit \""
                        + storageUnit.getStorageUnitId()
                        + "\". The selected storage unit itself is inactive.");
                continue;
            }
            // Or something above it in the hierarchy is inactive (freezer, shelf, rack, etc.)
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
            // false cancels the save so the items never land in the inactive location
            return new PluginResult(false);
        }
        return new PluginResult(true);
    }
}
