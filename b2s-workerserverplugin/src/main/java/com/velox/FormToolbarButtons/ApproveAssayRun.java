/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-31 12:00
 * Agent type: Composer
 * Modified: 2026-08-31 12:25
 * Agent type: Composer
 * Modified: 2026-08-31 12:30
 * Agent type: Composer
 */
package com.velox.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.user.ESignAuthentication;
import com.velox.api.user.UserGroupInfo;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.List;

/**
 * Form toolbar button on {@link SBA_MasterAssayRunModel} records that are not yet approved.
 * Approves the run after verifying child {@link SBA_AssayRunResultModel} outcome fields are consistent
 * and collecting an electronic signature from a Principal Investigator.
 */
public class ApproveAssayRun extends DefaultFormToolbarPlugin {

    private static final String STATUS_PASSED = "Passed";
    private static final String STATUS_FAILED = "Failed";
    private static final String ACCEPT = "Accept";
    private static final String REJECT = "Reject";
    private static final String PRINCIPAL_INVESTIGATOR_GROUP = "Principal Investigator";

    private static final String MANUAL_OUTCOME_MESSAGE =
            "This run has manual outcome changes on its results. Please utilize the 'Override' feature to approve it instead";
    private static final String PI_REQUIRED_MESSAGE =
            "Only a user in the Principal Investigator group may approve this Master Assay Run.";

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

            if (hasInconsistentResult(results)) {
                clientCallback.displayWarning(MANUAL_OUTCOME_MESSAGE);
                return new PluginResult(false);
            }

            ESignAuthentication eSign = clientCallback.showESignDialog(
                    "Electronic Signature",
                    "A Principal Investigator must authenticate to approve this Master Assay Run.",
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
            recMan.storeAndCommit("Approve Master Assay Run " + masterAssayRun.getRecordId());

            return new PluginResult(true, new RefreshCurrentViewDirective());
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * Returns true when the e-signing user belongs to {@value #PRINCIPAL_INVESTIGATOR_GROUP}.
     */
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

    /**
     * Returns true if any child result has {@code SBA_FailureDetected}, {@code SBA_AcceptOrReject},
     * and {@code SBA_Status} that are not mutually consistent.
     * <ul>
     *   <li>Failure detected → Accept/Reject = Reject and Status = Failed</li>
     *   <li>No failure detected → Accept/Reject = Accept and Status = Passed</li>
     * </ul>
     */
    private static boolean hasInconsistentResult(Collection<SBA_AssayRunResultModel> results) {
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
