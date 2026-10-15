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
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import org.apache.commons.lang3.StringUtils;

/**
 * Form toolbar button on {@link SBA_MasterAssayRunModel} records that have not been reviewed yet.
 * Asks for confirmation, then stamps Reviewed By / Date Reviewed for the current user.
 */
public class ReviewAssayRun extends DefaultFormToolbarPlugin {

    private static final String PRINCIPAL_INVESTIGATOR_GROUP = "Principal Investigator";

    @Override
    public String getDescription() {
        return "Mark this Master Assay Run as reviewed.";
    }

    @Override
    public String getLine1Text() {
        return "Review";
    }

    @Override
    public String getLine2Text() {
        return "Assay Run";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "card-text-outline.svg");
    }

    /**
     * Shown only on Master Assay Run forms that are completed, have not been reviewed yet, and
     * only when the current user's active group is not Principal Investigator.
     * Reviewed By and Date Reviewed are always set together, so checking Reviewed By alone is enough.
     */
    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        // Only show this button on Master Assay Run forms.
        if (ctx.getDataTypeName() == null
                || !SBA_MasterAssayRunModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName())) {
            return false;
        }
        if (ctx.getDataRecord() == null) {
            return false;
        }

        // Principal Investigators approve/override; they should not see the Review button.
        if (user.getUserGroup() != null
                && PRINCIPAL_INVESTIGATOR_GROUP.equals(user.getUserGroup().getGroupName())) {
            return false;
        }

        SBA_MasterAssayRunModel assayRun =
                instMan.addExistingRecordOfType(ctx.getDataRecord(), SBA_MasterAssayRunModel.class);

        // Same completion gate as Approve/Override: Date Completed and Completed By must both be set.
        // Also hide once Reviewed By is already populated (Date Reviewed is set at the same time).
        return assayRun.getSBA_DateCompleted() != null
                && StringUtils.isNotBlank(assayRun.getSBA_CompletedBy())
                && StringUtils.isBlank(assayRun.getC_ReviewedBy());
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

            // Simple confirmation — no e-sign required for review.
            boolean confirmed = clientCallback.showYesNoDialog(
                    "Review Run",
                    "Are you sure you want to mark this run as reviewed?",
                    false);
            if (!confirmed) {
                return new PluginResult(true);
            }

            // Stamp review fields with the current user and the current date/time.
            masterAssayRun.setC_ReviewedBy(user.getUsername());
            masterAssayRun.setC_DateReviewed(System.currentTimeMillis());
            recMan.storeAndCommit("Review Master Assay Run " + masterAssayRun.getRecordId());

            return new PluginResult(true, new RefreshCurrentViewDirective());
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }
}
