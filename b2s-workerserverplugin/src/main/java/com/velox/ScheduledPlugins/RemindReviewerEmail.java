/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-28 08:55
 * Agent type: Composer
 * Modified: 2026-08-28 09:27
 * Agent type: Composer
 * Modified: 2026-08-28 11:06
 * Agent type: Composer
 */
package com.velox.ScheduledPlugins;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.eln.notebookexperiment.NotebookExperimentRoleAssignment;
import com.velox.api.eln.notebookexperiment.NotebookExperimentRoleAssignment.RoleType;
import com.velox.api.eln.notebookmanager.NotebookExperimentManager;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.ScheduledPluginContext;
import com.velox.api.portal.VeloxApp;
import com.velox.api.report.CustomReport;
import com.velox.api.report.CustomReportManager;
import com.velox.api.report.ReportField;
import com.velox.api.report.ReportTerm;
import com.velox.api.user.UserInfo;
import com.velox.api.user.VeloxUserManager;
import com.velox.recordmodels.ELNExperimentModel;
import com.velox.sapio.commons.exemplar.eln.impl.ElnNotebookManagerImpl;
import com.velox.sapio.commons.exemplar.mail.Email;
import com.velox.sapio.commons.exemplar.mail.EmailSender;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultScheduledPlugin;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Emails reviewers for experiments that have been in Locked Awaiting Approval for 22–24 hours.
 */
public class RemindReviewerEmail extends DefaultScheduledPlugin {

    private static final long REMINDER_WINDOW_MIN_AGE_MS = TimeUnit.HOURS.toMillis(22);
    private static final long REMINDER_WINDOW_MAX_AGE_MS = TimeUnit.HOURS.toMillis(24);

    @Override
    public String getDescription() {
        return "Emails reviewers for experiments that have been in Locked Awaiting Approval for 22–24 hours, "
                + "warning that review is needed before the experiment becomes late.";
    }

    @Override
    protected PluginResult run(ScheduledPluginContext ctx) throws Throwable {
        NotebookExperimentManager notebookExperimentManager = dataMgmtServer.getNotebookExperimentManager(user);
        if (!notebookExperimentManager.isENotebookLicensed()) {
            return new PluginResult(true);
        }

        long now = System.currentTimeMillis();
        List<DataRecord> eligibleExperiments = queryExperimentsInReminderWindow(now);

        int remindersSent = 0;
        for (DataRecord experimentRecord : eligibleExperiments) {
            if (sendReminderIfEligible(experimentRecord, notebookExperimentManager)) {
                remindersSent++;
            }
        }

        if (remindersSent > 0) {
            recMan.storeAndCommit("RemindReviewerEmail: marked FinalWarningSent on reminded experiments");
        }

        logInfo("RemindReviewerEmail: Sent " + remindersSent + " reminder email(s).");
        return new PluginResult(true);
    }

    private List<DataRecord> queryExperimentsInReminderWindow(long now) throws Throwable {
        long windowStartMillis = now - REMINDER_WINDOW_MAX_AGE_MS;
        long windowEndMillis = now - REMINDER_WINDOW_MIN_AGE_MS;

        CustomReport report = new CustomReport();
        report.addColumn(ELNExperimentModel.DATA_TYPE_NAME, "RecordId");

        ReportTerm statusTerm = report.addTerm(
                new ReportField(ELNExperimentModel.DATA_TYPE_NAME, ELNExperimentModel.VELOX_EXPERIMENT_STATUS),
                ReportTerm.EQUAL_TO_OPERATOR,
                NotebookExperiment.NotebookExperimentStatus.LockedAwaitingApproval.name());

        ReportTerm afterWindowStartTerm = report.addTerm(
                new ReportField(ELNExperimentModel.DATA_TYPE_NAME, ELNExperimentModel.LOCKED_AWAITING_APPROVAL_SINCE),
                ReportTerm.GREATER_THAN_OPERATOR,
                String.valueOf(windowStartMillis));

        ReportTerm beforeWindowEndTerm = report.addTerm(
                new ReportField(ELNExperimentModel.DATA_TYPE_NAME, ELNExperimentModel.LOCKED_AWAITING_APPROVAL_SINCE),
                ReportTerm.LESS_THAN_OPERATOR,
                String.valueOf(windowEndMillis));

        // Skip experiments that already received the final reminder email.
        ReportTerm warningNotSentTerm = report.addTerm(
                new ReportField(ELNExperimentModel.DATA_TYPE_NAME, ELNExperimentModel.FINAL_WARNING_SENT),
                ReportTerm.NOT_EQUAL_TO_OPERATOR,
                "true");

        ReportTerm windowTerm = report.combineTerms(afterWindowStartTerm, ReportTerm.AND_OPERATOR, beforeWindowEndTerm);
        ReportTerm statusAndWindowTerm = report.combineTerms(statusTerm, ReportTerm.AND_OPERATOR, windowTerm);
        report.combineTerms(statusAndWindowTerm, ReportTerm.AND_OPERATOR, warningNotSentTerm);

        CustomReportManager reportManager = dataMgmtServer.getCustomReportManager(user);
        List<DataRecord> results = reportManager.runCustomReportForRecords(report, user);
        return results == null ? List.of() : results;
    }

    private boolean sendReminderIfEligible(
            DataRecord experimentRecord,
            NotebookExperimentManager notebookExperimentManager) throws Throwable {
        NotebookExperiment experiment =
                notebookExperimentManager.getNotebookExperiment(experimentRecord.getRecordId(), user);
        if (experiment == null) {
            return false;
        }

        List<String> reviewerEmails = getReviewerEmails(experiment);
        if (reviewerEmails.isEmpty()) {
            return false;
        }

        if (!sendLateReviewReminderEmail(experiment, reviewerEmails)) {
            return false;
        }

        ELNExperimentModel experimentModel =
                instMan.addExistingRecordOfType(experimentRecord, ELNExperimentModel.class);
        experimentModel.setFinalWarningSent(true);
        return true;
    }

    private Set<String> getReviewerUsernames(NotebookExperiment experiment) throws Throwable {
        NotebookExperimentRoleAssignment assignment = experiment.getNotebookExperimentRoleAssignment(user);
        if (assignment == null) {
            return Set.of();
        }

        return new LinkedHashSet<>(
                exemplarContext.getInstance(ElnNotebookManagerImpl.class)
                        .getExpandedUsersWithRole(assignment, RoleType.Reviewer));
    }

    private List<String> getReviewerEmails(NotebookExperiment experiment) throws Throwable {
        Set<String> reviewerUsernames = getReviewerUsernames(experiment);
        if (reviewerUsernames.isEmpty()) {
            return List.of();
        }

        VeloxUserManager userManager = dataMgmtServer.getVeloxUserManager(user);
        List<String> reviewerEmails = new ArrayList<>();
        for (String reviewerUsername : reviewerUsernames) {
            UserInfo reviewerInfo = userManager.getUserInfo(user, reviewerUsername);
            if (reviewerInfo != null && StringUtils.isNotBlank(reviewerInfo.getEmailAddress())) {
                reviewerEmails.add(reviewerInfo.getEmailAddress());
            }
        }
        return reviewerEmails;
    }

    private String buildExperimentLink(NotebookExperiment experiment) throws Throwable {
        VeloxApp app = dataMgmtServer.getVeloxApp(user);
        return app.getAppUrl() + app.getGuid()
                + "#notebookExperimentId=" + experiment.getNotebookExperimentId() + ";view=eln";
    }

    private boolean sendLateReviewReminderEmail(NotebookExperiment experiment, List<String> reviewerEmails)
            throws Throwable {
        String experimentDisplayName = dtMan.getDisplayName(ELNExperimentModel.DATA_TYPE_NAME);
        String experimentName = experiment.getNotebookExperimentName(user);
        String elnLink = buildExperimentLink(experiment);

        String subject = "Action needed: review " + experimentDisplayName + " " + experimentName + " before it becomes late";
        String htmlBody = "<p>The assigned reviewer needs to review "
                + StringUtils.lowerCase(experimentDisplayName) + " <strong>" + experimentName
                + "</strong> before it becomes late.</p><p><a href=\"" + elnLink
                + "\">Open " + experimentDisplayName + "</a></p>";

        try {
            Email email = Email.builder()
                    .to(reviewerEmails)
                    .subject(subject)
                    .htmlBody(htmlBody)
                    .build();
            exemplarContext.getInstance(EmailSender.class).sendEmail(email, true);
            return true;
        } catch (Exception e) {
            logError("RemindReviewerEmail: Failed to send reminder for experiment "
                    + experimentName + ": " + e.getMessage(), e);
            return false;
        }
    }
}
