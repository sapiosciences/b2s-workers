/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-07-08
 * Agent type: Claude
 */
package com.velox.workflows.immunoaffinity;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.eln.experimententry.ExperimentEntry;
import com.velox.api.eln.experimententry.ExperimentTableEntry;
import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.plugin.EnbPluginResult;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentEntryValidationContext;
import com.velox.recordmodels.C_FractionModel;
import com.velox.recordmodels.ELNExperimentDetailModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentEntryValidationPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.pyparity.general.exceptions.MessageDisplayType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ticket : B2S1-161 (replaces the native Sapio rule originally scoped for this step; see also B2S1-76, B2S1-110)
 * Description : On completion of {@value #FRACTION_COLLECTION_RUNS_ENTRY_NAME}, create one dedicated base
 * {@link SampleModel} per row, extended with a {@link C_FractionModel} record, and add that Sample as a
 * child of the critical reagent sample from {@value #CRITICAL_REAGENT_ENTRY_NAME} via sample lineage. Each
 * fraction needs its own base Sample because a Sapio Sample extension is 1:1 with its immediate parent —
 * the C_Fraction extension cannot be attached directly to the (shared) critical reagent sample. Fractions
 * marked {@link ELNExperimentDetailModel#SELECTED_FOR_INTERMEDIATE_POOL} are added to {@value #POOLING_ENTRY_NAME}.
 * Idempotent on re-submission: matches existing Fraction children of the critical reagent sample by Run
 * Number + Step (read from each child's own C_Fraction extension) and updates them instead of duplicating.
 *
 * @author rdoster
 */
public class FractionCollectionRunsSubmission extends DefaultExperimentEntryValidationPlugin {

    /**
     * Experiment Detail table entry this plugin runs on completion of. Row columns: Run Number, Step,
     * Initial Fraction (mL), Final Fraction (mL), Selected For Intermediate Pool.
     */
    public static final String FRACTION_COLLECTION_RUNS_ENTRY_NAME = "Fraction Collection Runs";

    /**
     * Entry holding the Sample record for the critical reagent undergoing purification (B2S1-51). Every
     * Fraction sample created here becomes a child of that Sample via sample lineage.
     */
    public static final String CRITICAL_REAGENT_ENTRY_NAME = "Critical Reagent Details";

    /**
     * Sample entry that receives only the Fraction samples whose source row was marked
     * {@value #FRACTION_COLLECTION_RUNS_ENTRY_NAME}.Selected For Intermediate Pool = true (B2S1-110).
     */
    public static final String POOLING_ENTRY_NAME = "Fractions Selected for Intermediate Pooling";

    @Override
    protected boolean shouldRun(NotebookExperimentEntryValidationContext ctx) throws Throwable {
        if (ctx.getNotebookExperiment() == null || ctx.getExperimentEntry() == null) {
            return false;
        }
        return FRACTION_COLLECTION_RUNS_ENTRY_NAME.equals(ctx.getExperimentEntry().getExperimentEntryName());
    }

    @Override
    protected PluginResult run(NotebookExperimentEntryValidationContext ctx) throws Throwable {
        NotebookExperiment experiment = ctx.getNotebookExperiment();
        ExperimentEntry sourceEntry = ctx.getExperimentEntry();

        List<DataRecord> rowRecords = experiment.getDataRecordsForExperimentEntry(sourceEntry, user);
        if (rowRecords == null || rowRecords.isEmpty()) {
            return new PluginResult(true);
        }
        List<ELNExperimentDetailModel> rows =
                instMan.addExistingRecordsOfType(rowRecords, ELNExperimentDetailModel.class);

        displayMessage("Fraction Collection Runs — row values",
                buildFractionFieldDebugMessage(rows),
                MessageDisplayType.OK_DIALOG);

        SampleModel criticalReagentSample = loadCriticalReagentSample(experiment);
        if (criticalReagentSample == null) {
            displayMessage("Warning",
                    "No critical reagent Sample found on \"" + CRITICAL_REAGENT_ENTRY_NAME
                            + "\" — Fraction samples were not created. Complete that entry first.",
                    MessageDisplayType.TOASTER_WARNING);
            return new PluginResult(false);
        }

        // Idempotency: a prior submission of this same entry may have already created Fraction samples.
        // A Fraction is a Sample-extension: a *separate* base Sample record, each with its own accessioned
        // ID, that carries a C_Fraction child extension record for the Run Number/Step/volume fields.
        // criticalReagentSample's direct children are therefore the base Samples, not C_Fraction records —
        // read each child's own C_Fraction extension to recover Run Number + Step for the dedup key.
        relationshipMan.loadChildren(List.of(criticalReagentSample), SampleModel.class);
        List<SampleModel> existingFractionBaseSamples =
                new ArrayList<>(criticalReagentSample.get(Children.ofType(SampleModel.class)));
        relationshipMan.loadChildren(existingFractionBaseSamples, C_FractionModel.class);

        Map<String, SampleModel> existingBaseSampleByRunAndStep = new LinkedHashMap<>();
        Map<SampleModel, C_FractionModel> extensionByBaseSample = new LinkedHashMap<>();
        for (SampleModel baseSample : existingFractionBaseSamples) {
            C_FractionModel extension = baseSample.get(Children.ofType(C_FractionModel.class))
                    .stream().findFirst().orElse(null);
            if (extension == null) {
                continue;
            }
            extensionByBaseSample.put(baseSample, extension);
            existingBaseSampleByRunAndStep.put(fractionKey(extension.getC_RunNumber(), extension.getC_Step()), baseSample);
        }

        ExperimentEntry poolingEntryLookup = experiment.getExperimentEntry(POOLING_ENTRY_NAME, user);
        Set<Long> alreadyInPoolingEntry = new LinkedHashSet<>();
        if (poolingEntryLookup != null) {
            List<DataRecord> existingPoolingRecords = experiment.getDataRecordsForExperimentEntry(poolingEntryLookup, user);
            if (existingPoolingRecords != null) {
                for (DataRecord record : existingPoolingRecords) {
                    alreadyInPoolingEntry.add(record.getRecordId());
                }
            }
        }

        List<SampleModel> toAddToPoolingEntry = new ArrayList<>();
        for (ELNExperimentDetailModel row : rows) {
            Double runNumber = row.getRunNumber2();
            String step = row.getStep2();
            boolean isSelected = Boolean.TRUE.equals(row.getSelectedForIntermediatePool());

            SampleModel fractionBaseSample = existingBaseSampleByRunAndStep.get(fractionKey(runNumber, step));
            if (fractionBaseSample == null) {
                // C_Fraction is a Sample extension, and Sapio allows at most one extension record of a given
                // type per parent — so the extension can never be attached directly to criticalReagentSample
                // (only the FIRST fraction would succeed; every one after it would collide on that single
                // extension slot, which is exactly the "record already ..." failure this replaces). Each
                // fraction instead gets its own dedicated new base Sample to extend, and that dedicated
                // Sample — not the extension — becomes the child of the critical reagent sample.
                fractionBaseSample = instMan.addNewRecord(SampleModel.class);
                C_FractionModel extension = instMan.addNewRecord(C_FractionModel.class);
                extension.setC_RunNumber(runNumber);
                extension.setC_Step(step);
                extension.setC_InitialFractionmL(row.getField("PoolFractions"));
                extension.setC_FinalFractionmL(row.getField("VolumemL"));
                extension.setC_SelectedForIntermedi(isSelected);
                extension.setC_CriticalReagentSampl(criticalReagentSample.getSampleId());
                extension.add(Parent.ref(fractionBaseSample));

                // Lineage to the source reagent lot; criticalReagentSample itself is never mutated beyond
                // gaining this child reference — it is read-only otherwise, as it must be shared by every row.
                criticalReagentSample.add(Child.ref(fractionBaseSample));
            } else {
                // Re-submission of a row already backed by a Fraction sample: refresh volumes/selection on
                // its existing C_Fraction extension instead of creating a second Sample+C_Fraction pair.
                C_FractionModel extension = extensionByBaseSample.get(fractionBaseSample);
                extension.setC_InitialFractionmL(row.getField("PoolFractions"));
                extension.setC_FinalFractionmL(row.getField("VolumemL"));
                extension.setC_SelectedForIntermedi(isSelected);
                // Doesn't change across resubmissions (a Fraction's parent is fixed at creation), but set
                // defensively for symmetry with the create branch.
                extension.setC_CriticalReagentSampl(criticalReagentSample.getSampleId());
            }

            if (isSelected && !alreadyInPoolingEntry.contains(fractionBaseSample.getRecordId())) {
                toAddToPoolingEntry.add(fractionBaseSample);
            }
        }

        recMan.storeAndCommit("Create/update Fraction sample per Fraction Collection Runs row, "
                + "linked as children of the critical reagent sample");

        if (!toAddToPoolingEntry.isEmpty()) {
            if (poolingEntryLookup instanceof ExperimentTableEntry poolingEntry) {
                List<DataRecord> fractionRecordsToAdd = new ArrayList<>(toAddToPoolingEntry.size());
                for (SampleModel fractionBaseSample : toAddToPoolingEntry) {
                    fractionRecordsToAdd.add(fractionBaseSample.getDataRecord());
                }
                experiment.addRecordsToTableEntry(poolingEntry, fractionRecordsToAdd, user);
                recMan.storeAndCommit("Add fractions selected for intermediate pooling to " + POOLING_ENTRY_NAME);

                // Tell the client to refresh this entry specifically — it's a different entry than the one
                // being submitted, so it won't otherwise pick up the newly-added records without a manual
                // page refresh.
                return new EnbPluginResult(true, poolingEntry);
            } else {
                displayMessage("Warning",
                        "\"" + POOLING_ENTRY_NAME + "\" entry not found — created/updated Fraction sample(s) were "
                                + "not added to it. They were still created and linked to the critical reagent sample.",
                        MessageDisplayType.TOASTER_WARNING);
            }
        }

        return new PluginResult(true);
    }

    private static String fractionKey(Double runNumber, String step) {
        return runNumber + "|" + (step == null ? "" : step.trim().toLowerCase());
    }

    private static String buildFractionFieldDebugMessage(List<ELNExperimentDetailModel> rows) {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < rows.size(); i++) {
            ELNExperimentDetailModel row = rows.get(i);
            if (i > 0) {
                message.append("\n\n");
            }
            message.append("Row ").append(i + 1)
                    .append(" — Run ").append(formatDebugValue(row.getRunNumber2()))
                    .append(", Step ").append(formatDebugValue(row.getStep2()))
                    .append('\n')
                    .append("  Initial Fraction (mL): ").append(formatDebugValue(row.getInitialFractionmL()))
                    .append('\n')
                    .append("  Final Fraction (mL): ").append(formatDebugValue(row.getFinalFractionmL()));
        }
        return message.toString();
    }

    private static String formatDebugValue(Object value) {
        return value == null ? "(null)" : String.valueOf(value);
    }

    private SampleModel loadCriticalReagentSample(NotebookExperiment experiment) throws Throwable {
        List<DataRecord> records = experiment.getDataRecordsForExperimentEntry(CRITICAL_REAGENT_ENTRY_NAME, user);
        if (records == null || records.isEmpty()) {
            return null;
        }
        List<DataRecord> sampleRecords = new ArrayList<>();
        for (DataRecord record : records) {
            if (SampleModel.DATA_TYPE_NAME.equals(record.getDataTypeName())) {
                sampleRecords.add(record);
            }
        }
        if (sampleRecords.isEmpty()) {
            return null;
        }
        // Critical Reagent Details is scoped to exactly one reagent per experiment (B2S1-51); take the first.
        return instMan.addExistingRecordsOfType(sampleRecords, SampleModel.class).get(0);
    }
}
