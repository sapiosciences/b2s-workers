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
import com.velox.recordmodels.C_SponsorLotModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Connor Skevington
 */
public class AssignSponsorLots extends DefaultOnSavePlugin {

    // Minimum threshold on a new lot is always 25% of its total volume
    private static final double MINIMUM_THRESHOLD_FRACTION = 0.25;

    // ExemplarConfig stores consumable mappings as: Part ::: Sample ::: Item (one per line)
    private static final String EXEMPLAR_CONFIG_DATA_TYPE = "ExemplarConfig";
    private static final String CONSUMABLE_DATA_TYPES_FIELD = "ConsumableDataTypes";
    private static final String CONSUMABLE_DATA_TYPE_SEGMENT_DELIMITER = " ::: ";

    // Samples from the current save — filled in by shouldRun()
    private List<SampleModel> samples;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        // A save can include mixed record types; we only care about Samples
        List<DataRecord> sampleRecords = new ArrayList<>();
        for (DataRecord record : ctx.getDataRecordList()) {
            if (SampleModel.DATA_TYPE_NAME.equals(record.getDataTypeName())) {
                sampleRecords.add(record);
            }
        }

        // Skip if there are no samples, or no UI to show the confirmation dialog
        if (sampleRecords.isEmpty() || clientCallback == null) {
            return false;
        }

        // Convert to SampleModels so we can use typed fields and relationships
        samples = instMan.addExistingRecordsOfType(sampleRecords, SampleModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // Part ↔ Item mapping from ExemplarConfig (same idea as CST's AssignSampleLinks)
        Map<String, String> partToItemMap = getPartToItemDataTypeMap();
        Map<String, String> itemToPartMap = partToItemMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        // Figure out which samples already have a Sponsor Lot parent
        relationshipMan.loadParents(samples, C_SponsorLotModel.class);

        // Group samples that still need a lot by their Part data type
        Map<String, List<SampleModel>> partToSamplesNeedingLot = new HashMap<>();
        for (SampleModel sample : samples) {
            if (sample.get(Parent.ofType(C_SponsorLotModel.class)) != null) {
                continue;
            }

            String itemType = getItemTypeForSample(sample, partToItemMap);
            if (itemType == null || itemType.isBlank() || !itemToPartMap.containsKey(itemType)) {
                continue;
            }

            String partType = itemToPartMap.get(itemType);
            partToSamplesNeedingLot.computeIfAbsent(partType, ignored -> new ArrayList<>()).add(sample);
        }

        if (partToSamplesNeedingLot.isEmpty()) {
            return new PluginResult(true);
        }

        // Load each sample's Part parent so we can hang the new lot under it
        for (Map.Entry<String, List<SampleModel>> entry : partToSamplesNeedingLot.entrySet()) {
            relationshipMan.loadParents(entry.getValue(), entry.getKey());
        }

        // Only samples that actually have a Part parent can get a lot (same rule as CST)
        List<SampleModel> samplesToCreateLotsFor = new ArrayList<>();
        Map<SampleModel, RecordModel> sampleToPart = new HashMap<>();
        for (Map.Entry<String, List<SampleModel>> entry : partToSamplesNeedingLot.entrySet()) {
            String partType = entry.getKey();
            for (SampleModel sample : entry.getValue()) {
                RecordModel partParent = sample.get(Parent.ofType(partType));
                if (partParent == null) {
                    continue;
                }
                samplesToCreateLotsFor.add(sample);
                sampleToPart.put(sample, partParent);
            }
        }

        if (samplesToCreateLotsFor.isEmpty()) {
            return new PluginResult(true);
        }

        // Ask once before creating. Cancel = skip lot creation, save still goes through
        if (!clientCallback.showOkCancelDialog(
                "Warning",
                "Create a Sponsor Lot for each of "
                        + samplesToCreateLotsFor.size()
                        + " sample(s) that do not already have one?")) {
            return new PluginResult(true);
        }

        // Each sample gets its own Sponsor Lot under its Part, with volume/threshold from that sample
        for (SampleModel sample : samplesToCreateLotsFor) {
            Double volume = sample.getVolume();
            double totalVolume = volume != null ? volume : 0.0;

            C_SponsorLotModel sponsorLot = instMan.addNewRecord(C_SponsorLotModel.class);
            sponsorLot.setC_Volume(totalVolume);
            sponsorLot.setC_MinimumThreshold(totalVolume * MINIMUM_THRESHOLD_FRACTION);

            // Part → Sponsor Lot → Sample (mirror CST: partModel.add(Child.ref(newLot)))
            RecordModel partParent = sampleToPart.get(sample);
            partParent.add(Child.ref(sponsorLot));
            sponsorLot.add(Children.refs(List.of(sample)));
        }

        // Stage changes for the ongoing save — do not commit here
        recMan.storeChanges();
        return new PluginResult(true);
    }

    // Reads ExemplarConfig.ConsumableDataTypes → Part data type → Item data type
    private Map<String, String> getPartToItemDataTypeMap() throws Throwable {
        Map<String, String> partToItemMap = new HashMap<>();

        List<DataRecord> configRecords =
                dataRecordManager.getAllRecordsOfType(EXEMPLAR_CONFIG_DATA_TYPE, user);
        if (configRecords == null || configRecords.size() != 1) {
            return partToItemMap;
        }

        RecordModel config = instMan.addExistingRecord(configRecords.get(0));
        Object raw = config.getField(CONSUMABLE_DATA_TYPES_FIELD);
        String consumableDataTypes = raw == null ? null : raw.toString();
        if (consumableDataTypes == null || consumableDataTypes.isBlank()) {
            return partToItemMap;
        }

        for (String line : consumableDataTypes.lines().toList()) {
            String trimmed = line.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            String[] segments = trimmed.split(CONSUMABLE_DATA_TYPE_SEGMENT_DELIMITER, -1);
            if (segments.length < 3) {
                continue;
            }
            String partDataType = segments[0].trim();
            String itemDataType = segments[2].trim();
            if (!partDataType.isEmpty() && !itemDataType.isEmpty()) {
                partToItemMap.put(partDataType, itemDataType);
            }
        }
        return partToItemMap;
    }

    // Which Item extension is on this sample? First matching {ItemType}.RecordId wins.
    private static String getItemTypeForSample(SampleModel sample, Map<String, String> partToItemMap) {
        for (String itemType : partToItemMap.values()) {
            if (sample.getField(itemType + ".RecordId") != null) {
                return itemType;
            }
        }
        return null;
    }
}
