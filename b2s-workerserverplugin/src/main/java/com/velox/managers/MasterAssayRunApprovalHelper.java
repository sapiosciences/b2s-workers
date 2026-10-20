/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.managers;

import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.ESignAuthentication;
import com.velox.api.user.User;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.util.ClientCallbackOperations;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_AssayRunSampleResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.context.ExemplarContext;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.recordmodel.main.RecordModelManager;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RecordModelRelationshipManager;
import org.apache.commons.lang3.StringUtils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Shared logic for Approve / Override Master Assay Run toolbar buttons: toolbar visibility,
 * e-sign validation, outcome consistency checks, approval stamping, and auto-marking lone
 * eligible sample results as reportable.
 */
public class MasterAssayRunApprovalHelper {

    public static final String STATUS_PASSED = "Passed";
    public static final String STATUS_FAILED = "Failed";
    public static final String ACCEPT = "Accept";
    public static final String REJECT = "Reject";
    public static final String PRINCIPAL_INVESTIGATOR_GROUP = "Principal Investigator";
    public static final String DETECTION_QUALITY_BQL = "BQL";

    public static final String PI_REQUIRED_MESSAGE =
            "Only a user in the Principal Investigator group may approve this Master Assay Run.";
    public static final String SAME_USER_MESSAGE =
            "The Principal Investigator who approves this Master Assay Run must be different from the user who completed it.";

    private final User user;
    private final DataMgmtServer dataMgmtServer;
    private final RecordModelManager recMan;
    private final RecordModelRelationshipManager relationshipMan;

    public MasterAssayRunApprovalHelper(ExemplarContext exemplarContext) {
        this.user = exemplarContext.getUser();
        this.dataMgmtServer = exemplarContext.getDataMgmtServer();
        this.recMan = exemplarContext.getInstance(RecordModelManager.class);
        this.relationshipMan = recMan.getRelationshipManager();
    }

    /**
     * Toolbar visibility shared by Approve and Override: Master Assay Run form, not yet approved,
     * completed fields populated, active group is Principal Investigator.
     */
    public boolean shouldShowOnFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        if (ctx.getDataTypeName() == null
                || !SBA_MasterAssayRunModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName())) {
            return false;
        }
        if (ctx.getDataRecord() == null) {
            return false;
        }
        if (user.getUserGroup() == null
                || !PRINCIPAL_INVESTIGATOR_GROUP.equals(user.getUserGroup().getGroupName())) {
            return false;
        }

        SBA_MasterAssayRunModel assayRun =
                recMan.getInstanceManager()
                        .addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayRunModel.class);
        return !Boolean.TRUE.equals(assayRun.getC_Approved())
                && assayRun.getSBA_DateCompleted() != null
                && StringUtils.isNotBlank(assayRun.getSBA_CompletedBy());
    }

    /**
     * Builds read-only summary fields for the e-sign dialog from the current Master Assay Run.
     */
    public static TemporaryDataType buildReadOnlyESignFields(SBA_MasterAssayRunModel masterAssayRun)
            throws ServerException, RemoteException {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(SBA_MasterAssayRunModel.SBA___RUN_RESULT)
                .displayName("Run Result")
                .editable(false)
                .required(false)
                .defaultValue(masterAssayRun.getSBA_RunResult())
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(SBA_MasterAssayRunModel.SBA___OVERRIDE_COMMENT)
                .displayName("Override Comment")
                .editable(false)
                .required(false)
                .defaultValue(masterAssayRun.getSBA_OverrideComment())
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(SBA_MasterAssayRunModel.SBA___COMPLETED_BY)
                .displayName("Completed By")
                .editable(false)
                .required(false)
                .defaultValue(masterAssayRun.getSBA_CompletedBy())
                .build());
        return formBuilder.getTemporaryDataType();
    }

    /**
     * Validates that the e-signing user is a Principal Investigator and is not the same as
     * Completed By. Shows errors via {@code clientCallback} when validation fails.
     *
     * @return {@code true} when the e-sign is acceptable for approval
     */
    public boolean validateApprovingESign(
            ESignAuthentication eSign,
            SBA_MasterAssayRunModel masterAssayRun,
            ClientCallbackOperations clientCallback) throws Throwable {
        if (!isPrincipalInvestigator(eSign)) {
            clientCallback.displayError(PI_REQUIRED_MESSAGE);
            return false;
        }
        if (isSameAsCompletedBy(eSign, masterAssayRun)) {
            clientCallback.displayError(SAME_USER_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean isPrincipalInvestigator(ESignAuthentication eSign) throws Throwable {
        if (eSign.getUserInfo() == null || StringUtils.isBlank(eSign.getUserInfo().getUsername())) {
            return false;
        }

        List<UserGroupInfo> groups = dataMgmtServer.getUserGroupManager(user)
                .getUserGroupInfoListForUser(eSign.getUserInfo().getUsername(), user);
        if (groups == null || groups.isEmpty()) {
            return false;
        }

        return groups.stream()
                .anyMatch(group -> PRINCIPAL_INVESTIGATOR_GROUP.equals(group.getUserGroupName()));
    }

    public static boolean isSameAsCompletedBy(
            ESignAuthentication eSign, SBA_MasterAssayRunModel masterAssayRun) throws RemoteException {
        if (eSign.getUserInfo() == null || StringUtils.isBlank(eSign.getUserInfo().getUsername())) {
            return false;
        }
        return StringUtils.equalsIgnoreCase(
                eSign.getUserInfo().getUsername(), masterAssayRun.getSBA_CompletedBy());
    }

    /**
     * Returns true if any child result has outcome fields that are not mutually consistent.
     */
    public static boolean hasInconsistentResult(Collection<SBA_AssayRunResultModel> results) {
        if (results == null || results.isEmpty()) {
            return false;
        }
        for (SBA_AssayRunResultModel result : results) {
            if (!isOutcomeConsistent(result)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Failure detected → Accept/Reject = Reject and Status = Failed;
     * otherwise → Accept/Reject = Accept and Status = Passed.
     */
    public static boolean isOutcomeConsistent(SBA_AssayRunResultModel result) {
        boolean failureDetected =
                isFailureDetected(result.getField(SBA_AssayRunResultModel.SBA___FAILURE_DETECTED));
        String acceptOrReject = result.getSBA_AcceptOrReject();
        String status = result.getSBA_Status();

        if (failureDetected) {
            return REJECT.equals(acceptOrReject) && STATUS_FAILED.equals(status);
        }
        return ACCEPT.equals(acceptOrReject) && STATUS_PASSED.equals(status);
    }

    public static boolean isFailureDetected(Object value) {
        if (value == null) {
            return false;
        }
        if (value instanceof Boolean bool) {
            return bool;
        }
        String text = value.toString().trim();
        if (StringUtils.isBlank(text)) {
            return false;
        }
        return Boolean.parseBoolean(text) || "yes".equalsIgnoreCase(text) || "1".equals(text);
    }

    /**
     * Stamps Approved / Approved By / Date Approved, auto-marks lone eligible sample results when
     * Run Result is Accept, then commits.
     */
    public void applyApproval(
            SBA_MasterAssayRunModel masterAssayRun, String approvedByUsername, String commitMessage)
            throws Throwable {
        masterAssayRun.setC_Approved(true);
        masterAssayRun.setC_ApprovedBy(approvedByUsername);
        masterAssayRun.setC_DateApproved(System.currentTimeMillis());
        autoMarkLoneEligibleSampleResults(masterAssayRun, approvedByUsername);
        recMan.storeAndCommit(commitMessage);
    }

    /**
     * When the Master Assay Run's Run Result is Accept, finds Samples under this run that have
     * exactly one non-rejected Assay Run Sample Result which is not BQL and has dilution factor
     * &lt;= 1, and marks that result reportable.
     */
    public void autoMarkLoneEligibleSampleResults(
            SBA_MasterAssayRunModel masterAssayRun, String reportableBy) throws Throwable {
        if (!ACCEPT.equals(masterAssayRun.getSBA_RunResult())) {
            return;
        }

        relationshipMan.loadChildren(masterAssayRun, SBA_AssayRunSampleResultModel.class);
        List<SBA_AssayRunSampleResultModel> runSampleResults = new ArrayList<>(
                masterAssayRun.get(Children.ofType(SBA_AssayRunSampleResultModel.class)));
        if (runSampleResults.isEmpty()) {
            return;
        }

        relationshipMan.loadParents(runSampleResults, SampleModel.class);

        Map<Long, SampleModel> samplesById = new LinkedHashMap<>();
        for (SBA_AssayRunSampleResultModel runResult : runSampleResults) {
            SampleModel sample = runResult.get(Parent.ofType(SampleModel.class));
            if (sample != null) {
                samplesById.putIfAbsent(sample.getRecordId(), sample);
            }
        }
        if (samplesById.isEmpty()) {
            return;
        }

        List<SampleModel> samples = new ArrayList<>(samplesById.values());
        relationshipMan.loadChildren(samples, SBA_AssayRunSampleResultModel.class);

        List<SBA_AssayRunSampleResultModel> allSampleResults = new ArrayList<>();
        for (SampleModel sample : samples) {
            allSampleResults.addAll(sample.get(Children.ofType(SBA_AssayRunSampleResultModel.class)));
        }
        relationshipMan.loadParents(allSampleResults, SBA_MasterAssayRunModel.class);

        long now = System.currentTimeMillis();
        for (SampleModel sample : samples) {
            List<SBA_AssayRunSampleResultModel> nonRejected = new ArrayList<>();
            for (SBA_AssayRunSampleResultModel sampleResult :
                    sample.get(Children.ofType(SBA_AssayRunSampleResultModel.class))) {
                if (!isRejectedMasterAssayRun(
                        sampleResult.get(Parent.ofType(SBA_MasterAssayRunModel.class)))) {
                    nonRejected.add(sampleResult);
                }
            }

            if (nonRejected.size() != 1) {
                continue;
            }
            SBA_AssayRunSampleResultModel loneResult = nonRejected.get(0);
            if (!isEligibleForAutoReportable(loneResult)) {
                continue;
            }

            loneResult.setC_IsReportable(true);
            loneResult.setC_ReportableBy(reportableBy);
            loneResult.setC_DateReportable(now);
        }
    }

    /**
     * Eligible when detection quality is not BQL and dilution factor is null or &lt;= 1.
     */
    public static boolean isEligibleForAutoReportable(SBA_AssayRunSampleResultModel result) {
        if (DETECTION_QUALITY_BQL.equals(result.getSBA_AssayDetectionQuality())) {
            return false;
        }
        Double dilutionFactor = result.getSBA_DilutionFactor();
        return dilutionFactor == null || dilutionFactor <= 1.0;
    }

    private static boolean isRejectedMasterAssayRun(SBA_MasterAssayRunModel masterAssayRun) {
        return masterAssayRun != null && REJECT.equals(masterAssayRun.getSBA_RunResult());
    }
}
