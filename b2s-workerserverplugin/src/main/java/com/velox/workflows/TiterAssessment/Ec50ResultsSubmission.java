/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-04 16:04
 * Agent type: Composer
 */
package com.velox.workflows.TiterAssessment;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.eln.experimententry.ExperimentEntry;
import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentEntryValidationContext;
import com.velox.recordmodels.C_EC50ResultModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentEntryValidationPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * On completion of {@link Ec50ResultsToolbar#EC50_RESULTS_ENTRY_NAME} in experiments tagged with
 * {@link Ec50ResultsToolbar#TTA_TAG}, links each {@link C_EC50ResultModel} on the entry as a child of
 * the matching {@link SampleModel} from the {@value #SAMPLES_ENTRY_NAME} entry (matched by Sample ID).
 */
public class Ec50ResultsSubmission extends DefaultExperimentEntryValidationPlugin {

    public static final String SAMPLES_ENTRY_NAME = "Samples";

    @Override
    protected boolean shouldRun(NotebookExperimentEntryValidationContext ctx) throws Throwable {
        if (ctx.getNotebookExperiment() == null || ctx.getExperimentEntry() == null) {
            return false;
        }
        if (!Ec50ResultsToolbar.EC50_RESULTS_ENTRY_NAME.equals(ctx.getExperimentEntry().getExperimentEntryName())) {
            return false;
        }

        Map<String, String> optionMap = ctx.getNotebookExperiment().getNotebookExperimentOptionMap(user);
        return optionMap != null && optionMap.containsKey(Ec50ResultsToolbar.TTA_TAG);
    }

    @Override
    protected PluginResult run(NotebookExperimentEntryValidationContext ctx) throws Throwable {
        NotebookExperiment experiment = ctx.getNotebookExperiment();
        ExperimentEntry ec50Entry = ctx.getExperimentEntry();

        List<DataRecord> ec50Records = experiment.getDataRecordsForExperimentEntry(ec50Entry, user);
        if (ec50Records == null || ec50Records.isEmpty()) {
            return new PluginResult(true);
        }
        List<C_EC50ResultModel> ec50Results =
                instMan.addExistingRecordsOfType(ec50Records, C_EC50ResultModel.class);

        ExperimentEntry samplesEntry = experiment.getExperimentEntry(SAMPLES_ENTRY_NAME, user);
        if (samplesEntry == null) {
            clientCallback.displayError(
                    "\"" + SAMPLES_ENTRY_NAME + "\" entry was not found — EC50 Results were not linked to Samples.");
            return new PluginResult(false);
        }

        List<DataRecord> sampleRecords = experiment.getDataRecordsForExperimentEntry(samplesEntry, user);
        if (sampleRecords == null || sampleRecords.isEmpty()) {
            clientCallback.displayError(
                    "No Samples found on \"" + SAMPLES_ENTRY_NAME + "\" — EC50 Results were not linked.");
            return new PluginResult(false);
        }

        List<SampleModel> samples = instMan.addExistingRecordsOfType(sampleRecords, SampleModel.class);
        Map<String, SampleModel> sampleById = new HashMap<>();
        for (SampleModel sample : samples) {
            String sampleId = sample.getSampleId();
            if (sampleId != null && !sampleId.isBlank()) {
                sampleById.put(sampleId.trim(), sample);
            }
        }

        relationshipMan.loadChildren(samples, C_EC50ResultModel.class);
        relationshipMan.loadParents(ec50Results, SampleModel.class);

        Map<SampleModel, List<C_EC50ResultModel>> childrenToAddBySample = new HashMap<>();
        for (C_EC50ResultModel ec50 : ec50Results) {
            String ec50SampleId = ec50.getC_SampleId();
            if (ec50SampleId == null || ec50SampleId.isBlank()) {
                continue;
            }

            SampleModel matchingSample = sampleById.get(ec50SampleId.trim());
            if (matchingSample == null) {
                continue;
            }

            // An EC50 Result may have at most one Sample parent.
            var existingSampleParents = ec50.get(Parents.ofType(SampleModel.class));
            if (existingSampleParents != null && !existingSampleParents.isEmpty()) {
                boolean alreadyLinkedToMatch = existingSampleParents.stream()
                        .anyMatch(parent -> parent.equals(matchingSample));
                if (alreadyLinkedToMatch) {
                    continue;
                }
                // Already has a different Sample parent — leave it alone.
                continue;
            }

            var existingChildren = matchingSample.get(Children.ofType(C_EC50ResultModel.class));
            if (existingChildren != null && existingChildren.stream().anyMatch(child -> child.equals(ec50))) {
                continue;
            }

            childrenToAddBySample.computeIfAbsent(matchingSample, ignored -> new ArrayList<>()).add(ec50);
        }

        if (childrenToAddBySample.isEmpty()) {
            return new PluginResult(true);
        }

        for (Map.Entry<SampleModel, List<C_EC50ResultModel>> entry : childrenToAddBySample.entrySet()) {
            entry.getKey().add(Children.refs(entry.getValue()));
        }

        recMan.storeAndCommit("Link EC50 Result records as children of matching Samples by Sample ID");
        return new PluginResult(true);
    }
}
