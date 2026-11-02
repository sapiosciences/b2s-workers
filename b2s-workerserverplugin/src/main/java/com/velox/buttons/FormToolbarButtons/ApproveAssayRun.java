/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */

package com.velox.buttons.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.ESignAuthentication;
import com.velox.managers.MasterAssayRunApprovalHelper;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;

import java.util.Collection;

/**
 * Form toolbar button on {@link SBA_MasterAssayRunModel} records that are not yet approved.
 * Approves the run after verifying child {@link SBA_AssayRunResultModel} outcome fields are consistent
 * and collecting an electronic signature from a Principal Investigator.
 */
public class ApproveAssayRun extends DefaultFormToolbarPlugin {

    private static final String MANUAL_OUTCOME_MESSAGE =
            "This run has manual outcome changes on its results. Please utilize the 'Override' feature to approve it instead";

    @Override
    public String getDescription() {
        return "Approve this Master Assay Run.";
    }

    @Override
    public String getLine1Text() {
        return "Approve";
    }

    @Override
    public String getLine2Text() {
        return "Assay Run";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "check-decagram.svg");
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

            // Approve only when outcomes are consistent; otherwise send the user to Override
            if (MasterAssayRunApprovalHelper.hasInconsistentResult(results)) {
                clientCallback.displayWarning(MANUAL_OUTCOME_MESSAGE);
                return new PluginResult(false);
            }

            ESignAuthentication eSign = clientCallback.showESignDialog(
                    "Electronic Signature",
                    "A Principal Investigator must authenticate to approve this Master Assay Run.",
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
                    "Approve Master Assay Run " + masterAssayRun.getRecordId());

            return new PluginResult(true, new RefreshCurrentViewDirective());
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }
}
