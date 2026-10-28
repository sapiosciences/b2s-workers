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
import com.velox.recordmodels.SBA_AssayRunSampleResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RelationshipPath;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Runs when an Assay Run Sample Result has Is Reportable changed to true.
 *
 * <p>Only one non-rejected sample result per analyte under a Sample may be reportable. All other
 * non-rejected siblings for the same analyte must have a Reanalysis Reason. BLQ results that were over-diluted (dilution factor &gt; 1)
 * cannot be marked reportable. Sibling results under a Master Assay Run with Run Result = Reject are
 * ignored for sibling checks. Reportable By / Date Reportable are only stamped when the current
 * result's Master Assay Run is not Reject.
 */
public class ReportableResultOnSave extends DefaultOnSavePlugin {

    private static final String DETECTION_QUALITY_BQL = "BQL";
    private static final String RUN_RESULT_REJECT = "Reject";

    private static final String ALREADY_REPORTABLE_MESSAGE =
            "Result %s is already the reportable result for this sample. Clear it first.";
    private static final String MISSING_REANALYSIS_REASON_MESSAGE =
            "The other results for this sample require reanalysis reasons.";
    private static final String OVER_DILUTED_BLQ_MESSAGE =
            "This BLQ Result was over-diluted and must be reassayed. It cannot be reported";

    // Results from the current save whose Is Reportable just became true — filled in by shouldRun()
    private List<SBA_AssayRunSampleResultModel> reportableResults;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> resultRecords = new ArrayList<>();
        for (DataRecord record : ctx.getDataRecordList()) {
            if (!SBA_AssayRunSampleResultModel.DATA_TYPE_NAME.equals(record.getDataTypeName())
                    || !record.isChanged(SBA_AssayRunSampleResultModel.C___IS_REPORTABLE)) {
                continue;
            }
            if (Boolean.TRUE.equals(
                    record.getBooleanVal(SBA_AssayRunSampleResultModel.C___IS_REPORTABLE, user))) {
                resultRecords.add(record);
            }
        }
        // Need a UI session to show validation error popups
        if (resultRecords.isEmpty() || clientCallback == null) {
            return false;
        }
        reportableResults =
                instMan.addExistingRecordsOfType(resultRecords, SBA_AssayRunSampleResultModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        // One path load: result → Sample → sibling results → each sibling's Master Assay Run
        relationshipMan.loadPath(
                reportableResults,
                RelationshipPath.parent(SampleModel.class)
                        .child(SBA_AssayRunSampleResultModel.class)
                        .parent(SBA_MasterAssayRunModel.class));

        for (SBA_AssayRunSampleResultModel result : reportableResults) {
            // Each sample result has exactly one Sample parent
            SampleModel sample = result.get(Parent.ofType(SampleModel.class));

            boolean missingReanalysisReason = false;
            for (SBA_AssayRunSampleResultModel sibling :
                    sample.get(Children.ofType(SBA_AssayRunSampleResultModel.class))) {
                if (Objects.equals(sibling.getRecordId(), result.getRecordId())) {
                    continue;
                }
                // Only results for the same analyte compete for reportable
                if (!Objects.equals(sibling.getSBA_AnalyteName(), result.getSBA_AnalyteName())) {
                    continue;
                }
                SBA_MasterAssayRunModel siblingMaster =
                        sibling.get(Parent.ofType(SBA_MasterAssayRunModel.class));
                // Rejected runs are ignored for sibling checks
                if (isRejectedMasterAssayRun(siblingMaster)) {
                    continue;
                }
                if (Boolean.TRUE.equals(sibling.getC_IsReportable())) {
                    String runId = siblingMaster == null
                            ? ""
                            : StringUtils.defaultString(siblingMaster.getSBA_RunId());
                    clientCallback.displayError(String.format(ALREADY_REPORTABLE_MESSAGE, runId));
                    return new PluginResult(false);
                }
                if (StringUtils.isBlank(sibling.getC_ReanalysisReason())) {
                    missingReanalysisReason = true;
                }
            }
            if (missingReanalysisReason) {
                clientCallback.displayError(MISSING_REANALYSIS_REASON_MESSAGE);
                return new PluginResult(false);
            }

            if (DETECTION_QUALITY_BQL.equals(result.getSBA_AssayDetectionQuality())) {
                Double dilutionFactor = result.getSBA_DilutionFactor();
                if (dilutionFactor != null && dilutionFactor > 1.0) {
                    clientCallback.displayError(OVER_DILUTED_BLQ_MESSAGE);
                    return new PluginResult(false);
                }
            }

            // Rejected Master Assay Runs still allow Is Reportable, but skip the audit stamps
            if (!isRejectedMasterAssayRun(result.get(Parent.ofType(SBA_MasterAssayRunModel.class)))) {
                result.setC_ReportableBy(user.getUsername());
                result.setC_DateReportable(System.currentTimeMillis());
            }
        }

        recMan.storeChanges();
        return new PluginResult(true);
    }

    private static boolean isRejectedMasterAssayRun(SBA_MasterAssayRunModel masterAssayRun) {
        return masterAssayRun != null
                && RUN_RESULT_REJECT.equals(masterAssayRun.getSBA_RunResult());
    }
}
