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
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Keeps each Sponsor Lot's Volume field in sync with its child samples.
 *
 * <p>Volume on a Sponsor Lot should always equal the sum of Volume on every Sample still linked
 * under that lot. Two different kinds of saves can make that total wrong:
 * <ul>
 *   <li>Someone edits (or creates) a sample's Volume</li>
 *   <li>Someone links or unlinks a sample from a lot (the lot shows up in the save list)</li>
 * </ul>
 * This plugin watches for either case, figures out which lots are affected, and recalculates.
 */
public class SponsorLotEvaluation extends DefaultOnSavePlugin {

    // Lots that appeared directly in this save (typical for link / unlink)
    private List<C_SponsorLotModel> lotsFromSave;

    // Samples whose Volume is new or changed — their parent lot (if any) also needs a refresh
    private List<SampleModel> volumeTouchedSamples;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> lotRecords = new ArrayList<>();
        List<DataRecord> sampleRecords = new ArrayList<>();

        for (DataRecord record : ctx.getDataRecordList()) {
            String dataType = record.getDataTypeName();

            // Path 1: the Sponsor Lot itself is in the save (e.g. a vial was added or removed)
            if (C_SponsorLotModel.DATA_TYPE_NAME.equals(dataType)) {
                lotRecords.add(record);
                continue;
            }

            // Path 2: a Sample was created or its Volume field changed
            if (SampleModel.DATA_TYPE_NAME.equals(dataType)
                    && (record.isNew() || record.isChanged(SampleModel.VOLUME))) {
                sampleRecords.add(record);
            }
        }

        // Nothing we care about → skip this plugin for this save
        if (lotRecords.isEmpty() && sampleRecords.isEmpty()) {
            return false;
        }

        lotsFromSave = lotRecords.isEmpty()
                ? List.of()
                : instMan.addExistingRecordsOfType(lotRecords, C_SponsorLotModel.class);
        volumeTouchedSamples = sampleRecords.isEmpty()
                ? List.of()
                : instMan.addExistingRecordsOfType(sampleRecords, SampleModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // One entry per lot even if it showed up from both paths above
        Set<C_SponsorLotModel> lotsToRefresh = new LinkedHashSet<>(lotsFromSave);

        // For volume-touched samples, walk up to their Sponsor Lot parent (if they have one)
        if (!volumeTouchedSamples.isEmpty()) {
            relationshipMan.loadParents(volumeTouchedSamples, C_SponsorLotModel.class);
            for (SampleModel sample : volumeTouchedSamples) {
                C_SponsorLotModel lot = sample.get(Parent.ofType(C_SponsorLotModel.class));
                if (lot != null) {
                    lotsToRefresh.add(lot);
                }
            }
        }

        // Volume-touched samples with no Sponsor Lot parent → nothing to update
        if (lotsToRefresh.isEmpty()) {
            return new PluginResult(true);
        }

        List<C_SponsorLotModel> lots = new ArrayList<>(lotsToRefresh);
        relationshipMan.loadChildren(lots, SampleModel.class);

        boolean anyVolumeChanged = false;
        for (C_SponsorLotModel lot : lots) {
            // Add up every child sample's Volume (treat blank as zero)
            double totalVolume = 0.0;
            for (SampleModel child : lot.get(Children.ofType(SampleModel.class))) {
                Double volume = child.getVolume();
                if (volume != null) {
                    totalVolume += volume;
                }
            }

            // Only write when the stored value is wrong — avoids dirtying records for no reason
            Double currentVolume = lot.getC_Volume();
            if (currentVolume == null || Double.compare(currentVolume, totalVolume) != 0) {
                lot.setC_Volume(totalVolume);
                anyVolumeChanged = true;
            }
        }

        if (anyVolumeChanged) {
            // Stage onto the ongoing save
            recMan.storeChanges();
        }
        return new PluginResult(true);
    }
}
