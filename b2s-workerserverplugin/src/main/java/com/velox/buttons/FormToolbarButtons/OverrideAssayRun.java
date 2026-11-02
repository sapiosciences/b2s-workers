/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */

package com.velox.buttons.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.ESignAuthentication;
import com.velox.managers.MasterAssayRunApprovalHelper;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * Form toolbar button on {@link SBA_MasterAssayRunModel} records that are not yet approved.
 * Collects override or rejection reasons for child results whose outcome fields are out of
 * alignment, then e-signs as a Principal Investigator and approves the run.
 */
public class OverrideAssayRun extends DefaultFormToolbarPlugin {

    private static final String REASON_FIELD = "Reason";

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

    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        return new MasterAssayRunApprovalHelper(exemplarContext).shouldShowOnFormToolbar(ctx);
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        try {
            if (ctx.getDataRecord() == null) {
                clientCallback.displayWarning("No Master Assay Run is displayed on this form.");
                return new PluginResult(false);
            }

            MasterAssayRunApprovalHelper approvalHelper =
                    new MasterAssayRunApprovalHelper(exemplarContext);
            SBA_MasterAssayRunModel masterAssayRun =
                    instMan.addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayRunModel.class);

            relationshipMan.loadChildren(masterAssayRun, SBA_AssayRunResultModel.class);
            Collection<SBA_AssayRunResultModel> results =
                    masterAssayRun.get(Children.ofType(SBA_AssayRunResultModel.class));

            // Override-specific: gather reasons for any misaligned child outcomes
            collectReasonsForMisalignedResults(results);

            ESignAuthentication eSign = clientCallback.showESignDialog(
                    "Electronic Signature",
                    "A Principal Investigator must authenticate to override and approve this Master Assay Run.",
                    true,
                    MasterAssayRunApprovalHelper.buildReadOnlyESignFields(masterAssayRun),
                    user);
            if (eSign == null || !eSign.isAuthenticated()) {
                return new PluginResult(true);
            }

            if (!approvalHelper.validateApprovingESign(eSign, masterAssayRun, clientCallback)) {
                return new PluginResult(false);
            }

            approvalHelper.applyApproval(
                    masterAssayRun,
                    eSign.getUserInfo().getUsername(),
                    "Override and approve Master Assay Run " + masterAssayRun.getRecordId());

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
            if (MasterAssayRunApprovalHelper.isOutcomeConsistent(result)) {
                continue;
            }

            String acceptOrReject = result.getSBA_AcceptOrReject();
            if (MasterAssayRunApprovalHelper.ACCEPT.equals(acceptOrReject)) {
                String reason = promptForReason(
                        "Override Reason",
                        "Provide an override reason for result "
                                + describeResult(result) + " (Accept/Reject is Accept).",
                        "Override Reason");
                result.setSBA_ManualOverrideReason(reason);
            } else if (MasterAssayRunApprovalHelper.REJECT.equals(acceptOrReject)) {
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
}
