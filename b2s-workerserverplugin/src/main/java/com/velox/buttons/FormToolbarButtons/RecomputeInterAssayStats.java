/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */

package com.velox.buttons.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.UserGroup;
import com.velox.recordmodels.C_InterAssayLevelResultModel;
import com.velox.recordmodels.SBA_AssayRunControlResultModel;
import com.velox.recordmodels.SBA_MasterAssayModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RelationshipPath;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Form toolbar button on a Master Assay that recomputes inter-assay statistics.
 * Only Principal Investigators, B2S Admins, and Sapio Admins see this button.
 */
public class RecomputeInterAssayStats extends DefaultFormToolbarPlugin {

    private static final String ASSAY_RUN_TYPE_ANALYSIS = "Analysis";
    private static final String RUN_RESULT_REJECT = "Reject";

    // Control results hang under one of these (the "level" parent used for grouping)
    private static final String MASTER_ASSAY_QC = "SBA_MasterAssayQC";
    private static final String MASTER_ASSAY_STANDARD = "SBA_MasterAssayStandard";

    // Name + limit fields on those parents
    private static final String QC_NAME_FIELD = "SBA_QCName";
    private static final String STANDARD_NAME_FIELD = "SBA_StandardName";
    private static final String CV_PERCENT_LIMIT_FIELD = "SBA_CVPercentLimit";
    private static final String FLAG_PCT_DIFF_FIELD = "SBA_FlagPctDiff";

    private static final String CONTROL_TYPE_QC = "QC";
    private static final String CONTROL_TYPE_STANDARD = "Standard";

    private static final Set<String> ALLOWED_GROUPS = Set.of(
            "Principal Investigator",
            "B2S Admin",
            "Sapio Admin");

    /**
     * One bucket of active control results for a single QC/Standard parent + analyte combo,
     * plus the stats we compute for that bucket.
     */
    private static final class ControlResultGroup {
        final String analyteName;
        final RecordModel parent; // SBA_MasterAssayQC or SBA_MasterAssayStandard
        final String controlType; // "QC" or "Standard"
        final String levelName;   // QC Name or Standard Name from the parent
        final double cvPercentLimit;
        final Double maxBiasPercent; // level's Max Bias %, else the assay's Max Mean Bias% Across Runs; null if both blank
        final List<SBA_AssayRunControlResultModel> controlResults = new ArrayList<>();

        int n;
        double mean;
        Double percentCv;   // blank when n < 2 or mean is 0
        Double percentBias; // blank when there's no usable nominal (missing or 0)
        Double nominal;     // blank when no result in the group has a theoretical value
        boolean withinLimits;

        ControlResultGroup(String analyteName, RecordModel parent, Double assayMaxMeanBiasInter) {
            this.analyteName = analyteName;
            this.parent = parent;

            // Pull display name + acceptance limits off the parent once at group creation
            boolean isQc = MASTER_ASSAY_QC.equals(parent.getDataTypeName());
            this.controlType = isQc ? CONTROL_TYPE_QC : CONTROL_TYPE_STANDARD;
            this.levelName = (String) parent.getField(isQc ? QC_NAME_FIELD : STANDARD_NAME_FIELD);
            this.cvPercentLimit = ((Number) parent.getField(CV_PERCENT_LIMIT_FIELD)).doubleValue();
            // Max Bias % is optional on the level — fall back to the assay-wide inter-assay limit
            Number levelMaxBias = (Number) parent.getField(FLAG_PCT_DIFF_FIELD);
            this.maxBiasPercent = levelMaxBias != null ? Double.valueOf(levelMaxBias.doubleValue()) : assayMaxMeanBiasInter;
        }
    }

    @Override
    public String getDescription() {
        return "Recompute Inter-Assay Stats for this Master Assay.";
    }

    @Override
    public String getLine1Text() {
        return "Recompute";
    }

    @Override
    public String getLine2Text() {
        return "Inter-Assay Stats";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "curve-cumulative.svg");
    }

    /**
     * Show the button only on Master Assay forms for allowed user groups.
     */
    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        // Grab these once — onFormToolbar can be called often while painting toolbars
        String datatypeName = ctx.getDataTypeName();
        UserGroup group = user.getUserGroup();
        if (datatypeName == null || group == null) {
            return false;
        }

        String userGroupName = group.getGroupName();
        return datatypeName.equals(SBA_MasterAssayModel.DATA_TYPE_NAME)
                && ALLOWED_GROUPS.contains(userGroupName);
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        // Retrieve & wrap the Master Assay on this form
        SBA_MasterAssayModel masterAssay =
                instMan.addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayModel.class);

        // Master Assay → runs → control results, plus any existing inter-assay level results
        relationshipMan.loadPath(List.of(masterAssay),
                RelationshipPath.child(SBA_MasterAssayRunModel.class)
                        .child(SBA_AssayRunControlResultModel.class));
        relationshipMan.loadChildren(masterAssay, C_InterAssayLevelResultModel.class);

        // Sort control results into QC/Standard + analyte buckets
        List<ControlResultGroup> groups = buildControlResultGroups(masterAssay);
        if (groups.isEmpty()) {
            return new PluginResult(true);
        }

        // Figure n, mean, %CV, and %Bias for each bucket
        for (ControlResultGroup group : groups) {
            computeGroupStats(group);
        }

        // Wipe old inter-assay results and write fresh ones under this Master Assay
        List<C_InterAssayLevelResultModel> newResults = replaceInterAssayLevelResults(masterAssay, groups);
        recMan.storeAndCommit("Recompute Inter-Assay Stats for Master Assay " + masterAssay.getRecordId());

        // Show the new results in a read-only table, with outside-limits count up front
        showResultsSummary(newResults);

        return new PluginResult(true, new RefreshCurrentViewDirective());
    }

    /**
     * From fitting Analysis runs, gather active control results and bucket them by their
     * QC or Standard parent plus analyte name.
     */
    private List<ControlResultGroup> buildControlResultGroups(SBA_MasterAssayModel masterAssay)
            throws Throwable {
        // Assay-wide bias limit, used when a QC/Standard has no Max Bias % of its own
        Double assayMaxMeanBiasInter = masterAssay.getSBA_AccAndPrecCriteriaInterSBA_MaxMeanBiasInter();

        // Collect the controls we care about first so we can load their parents in bulk
        List<SBA_AssayRunControlResultModel> activeControls = new ArrayList<>();
        for (SBA_MasterAssayRunModel run : masterAssay.get(Children.ofType(SBA_MasterAssayRunModel.class))) {
            if (!isFittingAnalysisRun(run)) {
                continue;
            }
            for (SBA_AssayRunControlResultModel control
                    : run.get(Children.ofType(SBA_AssayRunControlResultModel.class))) {
                // No back-calculated concentration means nothing to aggregate — leave it out of n
                if (Boolean.TRUE.equals(control.getSBA_IsActive())
                        && control.getSBA_MeanConcentration() != null) {
                    activeControls.add(control);
                }
            }
        }
        if (activeControls.isEmpty()) {
            return List.of();
        }

        // Each control hangs under either a QC or a Standard — load both parent types once
        relationshipMan.loadParents(activeControls, MASTER_ASSAY_QC);
        relationshipMan.loadParents(activeControls, MASTER_ASSAY_STANDARD);

        Map<String, ControlResultGroup> groupsByKey = new LinkedHashMap<>();
        for (SBA_AssayRunControlResultModel control : activeControls) {
            RecordModel parent = control.get(Parent.ofType(MASTER_ASSAY_QC));
            if (parent == null) {
                parent = control.get(Parent.ofType(MASTER_ASSAY_STANDARD));
            }
            // No QC/Standard parent means no level to group under — skip it
            if (parent == null) {
                continue;
            }

            String analyteName = control.getSBA_AnalyteName();
            String key = parent.getRecordId() + "|" + analyteName;
            RecordModel finalParent = parent;
            groupsByKey
                    .computeIfAbsent(key, ignored -> new ControlResultGroup(analyteName, finalParent, assayMaxMeanBiasInter))
                    .controlResults.add(control);
        }

        return new ArrayList<>(groupsByKey.values());
    }

    /**
     * Fill in n / mean / %CV / %Bias / nominal on the group from its control results.
     * x = SBA_MeanConcentration, nominal = SBA_TheoreticalValue (first non-blank one).
     */
    private static void computeGroupStats(ControlResultGroup group) {
        List<SBA_AssayRunControlResultModel> results = group.controlResults;
        int n = results.size();
        group.n = n;

        // Mean of all mean-concentrations in the bucket
        double sum = 0;
        for (SBA_AssayRunControlResultModel control : results) {
            sum += control.getSBA_MeanConcentration();
        }
        double mean = sum / n;
        group.mean = mean;

        // Sample stdev needs at least 2 points, and %CV needs a non-zero mean; otherwise %CV stays blank
        if (n >= 2 && mean != 0) {
            double sumSqDiff = 0;
            for (SBA_AssayRunControlResultModel control : results) {
                double diff = control.getSBA_MeanConcentration() - mean;
                sumSqDiff += diff * diff;
            }
            double sampleStdev = Math.sqrt(sumSqDiff / (n - 1));
            group.percentCv = (sampleStdev / mean) * 100;
        }

        // %Bias vs the shared theoretical (nominal) value — take the first one that's filled in
        Double nominal = null;
        for (SBA_AssayRunControlResultModel control : results) {
            if (control.getSBA_TheoreticalValue() != null) {
                nominal = control.getSBA_TheoreticalValue();
                break;
            }
        }
        group.nominal = nominal;
        // A nominal of 0 would divide by zero, so %Bias stays blank
        if (nominal != null && nominal != 0) {
            group.percentBias = ((mean - nominal) / nominal) * 100;
        }

        // Within limits when %CV and |%Bias| both fall under the thresholds.
        // A blank %CV, blank %Bias, or no bias limit at all means we can't confirm the level → false.
        group.withinLimits = group.percentCv != null
                && group.percentCv < group.cvPercentLimit
                && group.percentBias != null
                && group.maxBiasPercent != null
                && Math.abs(group.percentBias) < group.maxBiasPercent;
    }

    /**
     * Delete existing Inter Assay Level Results under this Master Assay, then create one
     * new child per calculated group. Returns the newly created records.
     */
    private static List<C_InterAssayLevelResultModel> replaceInterAssayLevelResults(
            SBA_MasterAssayModel masterAssay, List<ControlResultGroup> groups) {
        // Clear whatever was there before
        for (C_InterAssayLevelResultModel existing
                : masterAssay.get(Children.ofType(C_InterAssayLevelResultModel.class))) {
            existing.delete();
        }

        // One new result record per group, hung directly under the Master Assay
        List<C_InterAssayLevelResultModel> created = new ArrayList<>(groups.size());
        for (ControlResultGroup group : groups) {
            C_InterAssayLevelResultModel result =
                    masterAssay.add(Child.ofType(C_InterAssayLevelResultModel.class));
            result.setC_Level(group.levelName);
            result.setC_ControlType(group.controlType);
            result.setC_AnalyteName(group.analyteName);
            result.setC_NominalConcentration(group.nominal);
            result.setC_N(group.n);
            result.setC_Mean(group.mean);
            result.setC_PercentCV(group.percentCv);
            result.setC_PercentBias(group.percentBias);
            result.setC_WithinLimits(group.withinLimits);
            created.add(result);
        }
        return created;
    }

    /**
     * Show the new level results in a selection-grid dialog (read-only browse).
     * Sorted by control type, then nominal concentration high → low.
     */
    private void showResultsSummary(List<C_InterAssayLevelResultModel> results) throws Throwable {
        results.sort(Comparator
                .comparing(C_InterAssayLevelResultModel::getC_ControlType,
                        Comparator.nullsLast(String::compareTo))
                .thenComparing(C_InterAssayLevelResultModel::getC_NominalConcentration,
                        Comparator.nullsLast(Comparator.reverseOrder())));

        int outsideLimits = 0;
        for (C_InterAssayLevelResultModel result : results) {
            if (!Boolean.TRUE.equals(result.getC_WithinLimits())) {
                outsideLimits++;
            }
        }

        TemporaryDataType tempType = dtMan
                .getDataTypeDefinition(C_InterAssayLevelResultModel.DATA_TYPE_NAME)
                .getTemporaryDataType(user);

        clientCallback.showDataRecordSelectionDialog(
                "Inter-Assay Level Results — " + outsideLimits + " of " + results.size()
                        + " outside limits",
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(tempType)
                        .records(RecordModelUtil.getClonedFieldsList(results))
                        .multiSelect(false)
                        .build(),
                user);
    }

    /** True when this run is an Analysis run and its overall result is not Reject. */
    private static boolean isFittingAnalysisRun(SBA_MasterAssayRunModel run) {
        return ASSAY_RUN_TYPE_ANALYSIS.equals(run.getSBA_AssayRunType())
                && !RUN_RESULT_REJECT.equals(run.getSBA_RunResult());
    }
}
