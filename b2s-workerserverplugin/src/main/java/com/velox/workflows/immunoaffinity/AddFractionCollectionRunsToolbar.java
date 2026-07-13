/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-07-10
 * Agent type: Claude
 */
package com.velox.workflows.immunoaffinity;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.eln.experimententry.ExperimentTableEntry;
import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.EnbPluginResult;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentEntryToolbarContext;
import com.velox.api.plugin.invocation.context.OnNotebookExperimentEntryToolbarContext;
import com.velox.recordmodels.ELNExperimentDetailModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentEntryToolbarPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Toolbar button on {@value FractionCollectionRunsSubmission#FRACTION_COLLECTION_RUNS_ENTRY_NAME} that
 * prompts for how many runs to add, then appends {@code runs * 5} rows. Each run is a group of five
 * rows sharing the same Run Number, with Step and hidden Step Order set from
 * {@link #FRACTION_COLLECTION_STEP_ORDER}.
 */
public class AddFractionCollectionRunsToolbar extends DefaultExperimentEntryToolbarPlugin {

    /** Hidden field used to order steps within a run (values 1–5). */
    public static final String STEP_ORDER_FIELD = "StepOrder";

    /** Step names and Step Order values (1-based index) within each run. */
    private static final List<String> FRACTION_COLLECTION_STEP_ORDER = List.of(
            "1st PBS Wash",
            "1st Water Wash",
            "Acid/High Salt Elution",
            "2nd PBS Wash",
            "2nd Water Wash");

    private static final String RUN_COUNT_FIELD = "RunCount";

    @Override
    public String getDescription() {
        return "Add one or more fraction collection runs (5 step rows per run) to the table.";
    }

    @Override
    public boolean onExperimentEntryToolbar(OnNotebookExperimentEntryToolbarContext ctx) throws Throwable {
        if (ctx.getExperimentEntry() == null) {
            return false;
        }
        return FractionCollectionRunsSubmission.FRACTION_COLLECTION_RUNS_ENTRY_NAME
                .equals(ctx.getExperimentEntry().getExperimentEntryName());
    }

    @Override
    public String getLine1Text() {
        return "Add Runs";
    }

    @Override
    public String getLine2Text() {
        return "";
    }

    private static final String ICON_PATH =
            "com/velox/workflows/immunoaffinity/resources/add-fractions.svg";

    @Override
    public byte[] getIcon() {
        return getIcon(ICON_PATH);
    }

    @Override
    protected PluginResult run(NotebookExperimentEntryToolbarContext ctx) throws Throwable {
        NotebookExperiment experiment = ctx.getNotebookExperiment();
        ExperimentTableEntry tableEntry = (ExperimentTableEntry) ctx.getExperimentEntry();

        int runsToAdd = promptForRunCount();
        double nextRunNumber = resolveNextRunNumber(experiment, tableEntry);

        List<ELNExperimentDetailModel> newRows = new ArrayList<>(runsToAdd * FRACTION_COLLECTION_STEP_ORDER.size());
        for (int runOffset = 0; runOffset < runsToAdd; runOffset++) {
            double runNumber = nextRunNumber + runOffset;
            for (int stepIndex = 0; stepIndex < FRACTION_COLLECTION_STEP_ORDER.size(); stepIndex++) {
                ELNExperimentDetailModel row = instMan.addNewRecord(ELNExperimentDetailModel.class);
                row.setRunNumber2(runNumber);
                row.setStep2(FRACTION_COLLECTION_STEP_ORDER.get(stepIndex));
                row.setField(STEP_ORDER_FIELD, stepIndex + 1);
                newRows.add(row);
            }
        }

        List<DataRecord> recordsToAdd = new ArrayList<>(newRows.size());
        for (ELNExperimentDetailModel row : newRows) {
            recordsToAdd.add(row.getDataRecord());
        }

        recMan.storeAndCommit("Add " + runsToAdd + " fraction collection run(s) ("
                + newRows.size() + " rows)");
        experiment.addRecordsToTableEntry(tableEntry, recordsToAdd, user);
        recMan.storeAndCommit("Attach fraction collection run rows to "
                + FractionCollectionRunsSubmission.FRACTION_COLLECTION_RUNS_ENTRY_NAME);

        return new EnbPluginResult(true, tableEntry);
    }

    private int promptForRunCount() throws Throwable {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.integerFieldBuilder()
                .dataFieldName(RUN_COUNT_FIELD)
                .displayName("Number of Runs")
                .required(true)
                .editable(true)
                .minValue(1)
                .defaultValue(1)
                .build());
        TemporaryDataType temporaryDataType = formBuilder.getTemporaryDataType();

        Map<String, Object> result = clientCallback.showFieldEntryDialog(
                "Add Fraction Collection Runs",
                "Each run adds 5 step rows (1st PBS Wash through 2nd Water Wash).",
                temporaryDataType,
                user);
        if (result == null) {
            throw new UserRequestedCancelServerException();
        }

        Object rawCount = result.get(RUN_COUNT_FIELD);
        if (rawCount == null) {
            clientCallback.displayError("Number of runs is required.");
            throw new UserRequestedCancelServerException();
        }

        int runCount;
        if (rawCount instanceof Number number) {
            runCount = number.intValue();
        } else {
            try {
                runCount = Integer.parseInt(rawCount.toString().trim());
            } catch (NumberFormatException e) {
                clientCallback.displayError("Number of runs must be a whole number.");
                throw new UserRequestedCancelServerException();
            }
        }

        if (runCount < 1) {
            clientCallback.displayError("Number of runs must be at least 1.");
            throw new UserRequestedCancelServerException();
        }

        return runCount;
    }

    private double resolveNextRunNumber(NotebookExperiment experiment, ExperimentTableEntry tableEntry)
            throws Throwable {
        List<DataRecord> existingRecords = experiment.getDataRecordsForExperimentEntry(tableEntry, user);
        if (existingRecords == null || existingRecords.isEmpty()) {
            return 1.0;
        }

        double maxRunNumber = 0.0;
        List<ELNExperimentDetailModel> existingRows =
                instMan.addExistingRecordsOfType(existingRecords, ELNExperimentDetailModel.class);
        for (ELNExperimentDetailModel row : existingRows) {
            Double runNumber = row.getRunNumber2();
            if (runNumber != null && runNumber > maxRunNumber) {
                maxRunNumber = runNumber;
            }
        }
        return maxRunNumber + 1.0;
    }

    @Override
    public int getOrder() {
        return 100;
    }

    @Override
    public boolean isSendAllRowsWhenNoSelection() {
        return false;
    }
}
