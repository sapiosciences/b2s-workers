/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-31 12:35
 * Agent type: Composer
 */
package com.velox.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.ESignAuthentication;
import com.velox.api.user.UserGroupInfo;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Form toolbar button on {@link SBA_MasterAssayRunModel} records that are not yet approved.
 * Collects override or rejection reasons for child results whose outcome fields are out of
 * alignment, then e-signs as a Principal Investigator and approves the run.
 */
public class OverrideAssayRun extends DefaultFormToolbarPlugin {

    private static final String STATUS_PASSED = "Passed";
    private static final String STATUS_FAILED = "Failed";
    private static final String ACCEPT = "Accept";
    private static final String REJECT = "Reject";
    private static final String PRINCIPAL_INVESTIGATOR_GROUP = "Principal Investigator";
    private static final String REASON_FIELD = "Reason";

    private static final String PI_REQUIRED_MESSAGE =
            "Only a user in the Principal Investigator group may approve this Master Assay Run.";

    @Override
    public String getDescription() {
        return "Override and approve this Master Assay Run when result outcomes have been changed manually.";
    }

    @Override
    public String getLine1Text() {
        return "Override";
    }

    @Override
    public String getLine2Text() {
        return "Assay Run";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "step-over.svg");
    }

    /**
     * Shown only on {@link SBA_MasterAssayRunModel} forms where {@code C_Approved} is not true.
     */
    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        if (ctx.getDataTypeName() == null
                || !SBA_MasterAssayRunModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName())) {
            return false;
        }
        if (ctx.getDataRecord() == null) {
            return false;
        }

        SBA_MasterAssayRunModel assayRun =
                instMan.addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayRunModel.class);
        return !Boolean.TRUE.equals(assayRun.getC_Approved());
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        try {
            if (ctx.getDataRecord() == null) {
                clientCallback.displayWarning("No Master Assay Run is displayed on this form.");
                return new PluginResult(false);
            }

            SBA_MasterAssayRunModel masterAssayRun =
                    instMan.addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayRunModel.class);

            relationshipMan.loadChildren(masterAssayRun, SBA_AssayRunResultModel.class);
            Collection<SBA_AssayRunResultModel> results =
                    masterAssayRun.get(Children.ofType(SBA_AssayRunResultModel.class));

            collectReasonsForMisalignedResults(results);

            ESignAuthentication eSign = clientCallback.showESignDialog(
                    "Electronic Signature",
                    "A Principal Investigator must authenticate to override and approve this Master Assay Run.",
                    true,
                    null,
                    user);
            if (eSign == null || !eSign.isAuthenticated()) {
                return new PluginResult(true);
            }

            if (!isPrincipalInvestigator(eSign)) {
                clientCallback.displayError(PI_REQUIRED_MESSAGE);
                return new PluginResult(false);
            }

            masterAssayRun.setC_Approved(true);
            recMan.storeAndCommit("Override and approve Master Assay Run " + masterAssayRun.getRecordId());

            return new PluginResult(true, new RefreshCurrentViewDirective());
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * For each child whose outcome fields are not aligned, prompts for and stores either a
     * manual override reason ({@link SBA_AssayRunResultModel#SBA___MANUAL_OVERRIDE_REASON}) when
     * Accept/Reject is Accept, or a manual rejection reason
     * ({@link SBA_AssayRunResultModel#SBA___MANUAL_REJECTION_REASON}) when Accept/Reject is Reject.
     */
    private void collectReasonsForMisalignedResults(Collection<SBA_AssayRunResultModel> results)
            throws Throwable {
        if (results == null || results.isEmpty()) {
            return;
        }

        for (SBA_AssayRunResultModel result : results) {
            if (isOutcomeConsistent(result)) {
                continue;
            }

            String acceptOrReject = result.getSBA_AcceptOrReject();
            if (ACCEPT.equals(acceptOrReject)) {
                String reason = promptForReason(
                        "Override Reason",
                        "Provide an override reason for result "
                                + describeResult(result) + " (Accept/Reject is Accept).",
                        "Override Reason");
                result.setSBA_ManualOverrideReason(reason);
            } else if (REJECT.equals(acceptOrReject)) {
                String reason = promptForReason(
                        "Rejection Reason",
                        "Provide a rejection reason for result "
                                + describeResult(result) + " (Accept/Reject is Reject).",
                        "Rejection Reason");
                result.setSBA_ManualRejectionReason(reason);
            } else {
                clientCallback.displayError(
                        "Result " + describeResult(result)
                                + " has misaligned outcome fields but Accept/Reject is not set to Accept or Reject.");
                throw new UserRequestedCancelServerException();
            }
        }
    }

    private String promptForReason(String title, String message, String displayName) throws Throwable {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(REASON_FIELD)
                .displayName(displayName)
                .required(true)
                .editable(true)
                .build());
        TemporaryDataType temporaryDataType = formBuilder.getTemporaryDataType();

        Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                title, message, temporaryDataType, user);
        if (entered == null) {
            throw new UserRequestedCancelServerException();
        }

        Object rawReason = entered.get(REASON_FIELD);
        String reason = rawReason == null ? null : rawReason.toString().trim();
        if (StringUtils.isBlank(reason)) {
            clientCallback.displayError(displayName + " is required.");
            throw new UserRequestedCancelServerException();
        }
        return reason;
    }

    private static String describeResult(SBA_AssayRunResultModel result) {
        if (StringUtils.isNotBlank(result.getSBA_AnalyteName())) {
            return result.getSBA_AnalyteName();
        }
        if (StringUtils.isNotBlank(result.getDataRecordName())) {
            return result.getDataRecordName();
        }
        return "RecordId " + result.getRecordId();
    }

    private boolean isPrincipalInvestigator(ESignAuthentication eSign) throws Throwable {
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

    private static boolean isOutcomeConsistent(SBA_AssayRunResultModel result) {
        boolean failureDetected = isFailureDetected(result.getField(SBA_AssayRunResultModel.SBA___FAILURE_DETECTED));
        String acceptOrReject = result.getSBA_AcceptOrReject();
        String status = result.getSBA_Status();

        if (failureDetected) {
            return REJECT.equals(acceptOrReject) && STATUS_FAILED.equals(status);
        }
        return ACCEPT.equals(acceptOrReject) && STATUS_PASSED.equals(status);
    }

    private static boolean isFailureDetected(Object value) {
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
}
