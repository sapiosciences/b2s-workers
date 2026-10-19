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
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Stops users from relating a Storage Unit under an inactive Storage Unit (or under a unit
 * that has an inactive ancestor).
 *
 * <p>This is the hierarchy-move cousin of {@link InactiveStorageLocationOnSave}. That plugin
 * watches items being stored into a location. This one watches Storage Units being reparented
 * under other Storage Units — the failure mode that can wipe sample StorageLocationBarcode
 * values when Sapio rewrites paths after a bad move.
 */
public class InactiveStorageUnitParentOnSave extends DefaultOnSavePlugin {

    /**
     * Child Storage Unit → the Storage Unit parent(s) newly linked on this save.
     * Filled in by shouldRun() so run() only has to validate.
     */
    private Map<DataRecord, List<DataRecord>> childToNewStorageUnitParents;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> dataRecordList = ctx.getDataRecordList();
        if (dataRecordList == null) {
            return false;
        }

        // A save can mix data types. We only care about Storage Units that might have been reparented.
        List<DataRecord> storageUnitsInSave = new ArrayList<>();
        for (DataRecord record : dataRecordList) {
            if (StorageUnitModel.DATA_TYPE_NAME.equals(record.getDataTypeName())) {
                storageUnitsInSave.add(record);
            }
        }
        if (storageUnitsInSave.isEmpty()) {
            return false;
        }

        // Ask Sapio which parents were newly attached to each of those units on this save.
        // Index i in the result lines up with storageUnitsInSave.get(i).
        List<List<DataRecord>> addedParentLists =
                dataRecordManager.getAddedParentLists(storageUnitsInSave, user);

        // Keep only children that gained at least one new Storage Unit parent (ignore other parent types).
        Map<DataRecord, List<DataRecord>> matched = new LinkedHashMap<>();
        for (int i = 0; i < storageUnitsInSave.size(); i++) {
            List<DataRecord> addedParents = addedParentLists.get(i);
            if (addedParents == null || addedParents.isEmpty()) {
                continue;
            }

            List<DataRecord> newStorageUnitParents = new ArrayList<>();
            for (DataRecord addedParent : addedParents) {
                if (addedParent != null
                        && StorageUnitModel.DATA_TYPE_NAME.equals(addedParent.getDataTypeName())) {
                    newStorageUnitParents.add(addedParent);
                }
            }
            if (!newStorageUnitParents.isEmpty()) {
                matched.put(storageUnitsInSave.get(i), newStorageUnitParents);
            }
        }

        // Nothing to check, or no UI session to show an error popup
        if (matched.isEmpty() || clientCallback == null) {
            return false;
        }

        childToNewStorageUnitParents = matched;
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Gather every new parent we need to inspect (dedupe — several children can move under one parent).
        Set<DataRecord> uniqueNewParents = new LinkedHashSet<>();
        for (List<DataRecord> parents : childToNewStorageUnitParents.values()) {
            uniqueNewParents.addAll(parents);
        }

        List<StorageUnitModel> newParentUnits =
                instMan.addExistingRecordsOfType(new ArrayList<>(uniqueNewParents), StorageUnitModel.class);
        // Walk up the tree above each new parent so "inactive freezer above an active shelf" still fails.
        ancestorMan.loadAncestors(newParentUnits, StorageUnitModel.class);

        // Build a quick lookup: parent record → model (for IsActive / StorageUnitId checks below)
        Map<Long, StorageUnitModel> parentModelByRecordId = new LinkedHashMap<>();
        for (StorageUnitModel parentUnit : newParentUnits) {
            parentModelByRecordId.put(parentUnit.getRecordId(), parentUnit);
        }

        List<String> errors = new ArrayList<>();
        for (Map.Entry<DataRecord, List<DataRecord>> entry : childToNewStorageUnitParents.entrySet()) {
            DataRecord childRecord = entry.getKey();
            String childId = childRecord.getStringVal(StorageUnitModel.STORAGE_UNIT_ID, user);

            for (DataRecord newParentRecord : entry.getValue()) {
                StorageUnitModel newParent = parentModelByRecordId.get(newParentRecord.getRecordId());
                if (newParent == null) {
                    continue;
                }

                // Direct new parent is inactive
                if (!newParent.getIsActive()) {
                    errors.add("Cannot move storage unit \""
                            + childId
                            + "\" under inactive storage unit \""
                            + newParent.getStorageUnitId()
                            + "\". The selected parent storage unit itself is inactive.");
                    continue;
                }

                // Or something above that parent is inactive
                for (StorageUnitModel ancestor
                        : newParent.get(ExemplarAncestors.ofType(StorageUnitModel.class))) {
                    if (!ancestor.getIsActive()) {
                        errors.add("Cannot move storage unit \""
                                + childId
                                + "\" under storage unit \""
                                + newParent.getStorageUnitId()
                                + "\" because ancestor storage unit \""
                                + ancestor.getStorageUnitId()
                                + "\" is inactive.");
                        break;
                    }
                }
            }
        }

        if (!errors.isEmpty()) {
            clientCallback.displayError(String.join("\n", errors));
            // Cancel the save so the bad hierarchy move (and any OOTB path rewrite) never commits
            return new PluginResult(false);
        }
        return new PluginResult(true);
    }
}
