/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-04 15:36
 * Agent type: Composer
 * Modified: 2026-08-04 15:55
 * Agent type: Composer
 * Modified: 2026-08-04 15:56
 * Agent type: Composer
 */
package com.velox.workflows.TiterAssessment;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.ReadFileDialogCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.eln.experimententry.ExperimentTableEntry;
import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.plugin.EnbPluginResult;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentEntryToolbarContext;
import com.velox.api.plugin.invocation.context.OnNotebookExperimentEntryToolbarContext;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.C_EC50ResultModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentEntryToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.attachment.AttachmentData;
import com.velox.sapio.commons.utils.StreamingUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Toolbar button on the {@value #EC50_RESULTS_ENTRY_NAME} entry for experiments tagged with
 * {@value #TTA_TAG}. Uploads selected files and creates a {@link C_EC50ResultModel} attachment
 * record per file on the entry.
 */
public class Ec50ResultsToolbar extends DefaultExperimentEntryToolbarPlugin {

    public static final String EC50_RESULTS_ENTRY_NAME = "EC50 Results";
    public static final String TTA_TAG = "TTA";

    @Override
    public String getDescription() {
        return "Upload EC50 Result files to the entry for TTA experiments.";
    }

    @Override
    public boolean onExperimentEntryToolbar(OnNotebookExperimentEntryToolbarContext ctx) throws Throwable {
        if (ctx.getExperimentEntry() == null || ctx.getNotebookExperiment() == null) {
            return false;
        }
        if (!EC50_RESULTS_ENTRY_NAME.equals(ctx.getExperimentEntry().getExperimentEntryName())) {
            return false;
        }

        NotebookExperiment experiment = ctx.getNotebookExperiment();
        Map<String, String> optionMap = experiment.getNotebookExperimentOptionMap(user);
        return optionMap != null && optionMap.containsKey(TTA_TAG);
    }

    @Override
    public String getLine1Text() {
        return "Add EC50";
    }

    @Override
    public String getLine2Text() {
        return "Results";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "playlist-plus.svg");
    }

    @Override
    protected PluginResult run(NotebookExperimentEntryToolbarContext ctx) throws Throwable {
        NotebookExperiment experiment = ctx.getNotebookExperiment();
        ExperimentTableEntry tableEntry = (ExperimentTableEntry) ctx.getExperimentEntry();

        ReadFileDialogCriteria criteria = ReadFileDialogCriteria.builder()
                .title("Select EC50 Result Files")
                .build();
        List<String> filePaths = clientCallback.showMultiFileDialog(criteria);
        if (filePaths == null || filePaths.isEmpty()) {
            return new PluginResult(false);
        }

        List<C_EC50ResultModel> resultModels = new ArrayList<>(filePaths.size());
        for (String filePath : filePaths) {
            byte[] fileBytes;
            try {
                fileBytes = StreamingUtil.readBytesFromUser(filePath, exemplarContext);
            } catch (IOException e) {
                throw new ServerException("Error reading file: " + e.getMessage(), e);
            }
            if (fileBytes == null || fileBytes.length == 0) {
                clientCallback.displayError("Failed to read file bytes for: " + filePath);
                return new PluginResult(false);
            }

            String fileName = new File(filePath).getName();
            C_EC50ResultModel result = instMan.addNewRecord(C_EC50ResultModel.class);
            result.setFilePath(fileName);
            result.set(AttachmentData.bytes(fileBytes));
            resultModels.add(result);
        }

        // Persist records first so new attachment records receive IDs before entry linkage.
        recMan.storeAndCommit("Storing persistent records so we can attach attachment records appropriately");

        List<DataRecord> newRecords = new ArrayList<>(resultModels.size());
        for (C_EC50ResultModel result : resultModels) {
            newRecords.add(result.getDataRecord());
        }
        experiment.addRecordsToTableEntry(tableEntry, newRecords, user);
        recMan.storeAndCommit("Adding records to table entry.");
        return new EnbPluginResult(true, tableEntry);
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
