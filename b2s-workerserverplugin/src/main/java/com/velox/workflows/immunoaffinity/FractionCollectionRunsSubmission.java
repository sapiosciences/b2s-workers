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
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentEntryValidationContext;
import com.velox.recordmodels.C_FractionModel;
import com.velox.recordmodels.ELNExperimentDetailModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentEntryValidationPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.pyparity.general.exceptions.MessageDisplayType;

import java.util.ArrayList;
import java.util.List;

/**
 * Ticket : B2S1-161 (replaces the native Sapio rule originally scoped for this step; see also B2S1-76, B2S1-110)
 * Description : On completion of {@value #FRACTION_COLLECTION_RUNS_ENTRY_NAME}, create one {@link C_FractionModel}
 * sample per row, linked as a child of the critical reagent sample from {@value #CRITICAL_REAGENT_ENTRY_NAME}
 * (via sample lineage), and add the fractions marked {@link ELNExperimentDetailModel#SELECTED_FOR_INTERMEDIATE_POOL}
 * to {@value #POOLING_ENTRY_NAME}.
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

        SampleModel criticalReagentSample = loadCriticalReagentSample(experiment);
        if (criticalReagentSample == null) {
            displayMessage("Warning",
                    "No critical reagent Sample found on \"" + CRITICAL_REAGENT_ENTRY_NAME
                            + "\" — Fraction samples were not created. Complete that entry first.",
                    MessageDisplayType.TOASTER_WARNING);
            return new PluginResult(false);
        }

        List<C_FractionModel> selectedFractions = new ArrayList<>();
        for (ELNExperimentDetailModel row : rows) {
            C_FractionModel fraction = instMan.addNewRecord(C_FractionModel.class);
            fraction.setC_RunNumber(row.getRunNumber2());
            fraction.setC_Step(row.getStep2());
            fraction.setC_InitialFractionmL(row.getInitialFractionmL());
            fraction.setC_FinalFractionmL(row.getFinalFractionmL());

            boolean isSelected = Boolean.TRUE.equals(row.getSelectedForIntermediatePool());
            fraction.setC_SelectedForIntermedi(isSelected);

            // Child lineage (not a side-link): the fraction must be traceable back to the exact reagent lot
            // undergoing purification, same as any other sample lineage chain in the system.
            criticalReagentSample.add(Child.ref(fraction));

            if (isSelected) {
                selectedFractions.add(fraction);
            }
        }

        recMan.storeAndCommit("Create Fraction sample per Fraction Collection Runs row, "
                + "linked as children of the critical reagent sample");

        if (!selectedFractions.isEmpty()) {
            if (experiment.getExperimentEntry(POOLING_ENTRY_NAME, user) instanceof ExperimentTableEntry poolingEntry) {
                List<DataRecord> selectedFractionRecords = new ArrayList<>(selectedFractions.size());
                for (C_FractionModel fraction : selectedFractions) {
                    selectedFractionRecords.add(fraction.getDataRecord());
                }
                experiment.addRecordsToTableEntry(poolingEntry, selectedFractionRecords, user);
                recMan.storeAndCommit("Add fractions selected for intermediate pooling to " + POOLING_ENTRY_NAME);
            } else {
                displayMessage("Warning",
                        "\"" + POOLING_ENTRY_NAME + "\" entry not found — created Fraction sample(s) were not "
                                + "added to it. They were still created and linked to the critical reagent sample.",
                        MessageDisplayType.TOASTER_WARNING);
            }
        }

        return new PluginResult(true);
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
