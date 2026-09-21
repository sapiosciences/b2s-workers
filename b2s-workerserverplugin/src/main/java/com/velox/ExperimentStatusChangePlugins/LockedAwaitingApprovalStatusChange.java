/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
/**
 * Created: 2026-08-28 08:34
 * Agent type: Composer
 * Modified: 2026-08-28 09:12
 * Agent type: Composer
 * Modified: 2026-08-28 09:27
 * Agent type: Composer
 */
package com.velox.ExperimentStatusChangePlugins;

import com.velox.api.eln.notebookexperiment.NotebookExperiment;
import com.velox.api.eln.notebookexperiment.NotebookExperimentRoleAssignment;
import com.velox.api.eln.notebookexperiment.NotebookExperimentRoleAssignment.RoleType;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.NotebookExperimentStatusChangeContext;
import com.velox.api.portal.VeloxApp;
import com.velox.api.user.UserInfo;
import com.velox.api.user.VeloxUserManager;
import com.velox.recordmodels.ELNExperimentModel;
import com.velox.sapio.commons.exemplar.eln.impl.ElnNotebookManagerImpl;
import com.velox.sapio.commons.exemplar.mail.Email;
import com.velox.sapio.commons.exemplar.mail.EmailSender;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultExperimentStatusChangePlugin;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Notifies the assigned reviewer when an experiment is submitted for approval.
 */
public class LockedAwaitingApprovalStatusChange extends DefaultExperimentStatusChangePlugin {

    @Override
    protected boolean shouldRun(NotebookExperimentStatusChangeContext ctx) throws Throwable {
        return ctx.getNotebookExperiment().getStatus(user)
                .equals(NotebookExperiment.NotebookExperimentStatus.LockedAwaitingApproval);
    }

    @Override
    protected PluginResult run(NotebookExperimentStatusChangeContext ctx) throws Throwable {
        NotebookExperiment experiment = ctx.getNotebookExperiment();

        ELNExperimentModel experimentModel = instMan.addExistingRecordOfType(
                experiment.getExperimentDataRecord(user), ELNExperimentModel.class);
        experimentModel.setLockedAwaitingApprovalSince(System.currentTimeMillis());

        List<String> reviewerEmails = getReviewerEmails(experiment);
        if (reviewerEmails.isEmpty()) {
            return new PluginResult(true);
        }

        sendReviewerNotificationEmail(experiment, reviewerEmails);
        return new PluginResult(true);
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

    private void sendReviewerNotificationEmail(NotebookExperiment experiment, List<String> reviewerEmails)
            throws Throwable {
        String experimentDisplayName = dtMan.getDisplayName(ELNExperimentModel.DATA_TYPE_NAME);
        String experimentName = experiment.getNotebookExperimentName(user);
        String elnLink = buildExperimentLink(experiment);
        String actor = StringUtils.defaultIfBlank(user.getFullName(), user.getUsername());

        String subject = experimentDisplayName + " " + experimentName + " is awaiting your review";
        String htmlBody = "<p>" + actor + " submitted "
                + StringUtils.lowerCase(experimentDisplayName) + " <strong>" + experimentName
                + "</strong> for review.</p><p><a href=\"" + elnLink + "\">Open " + experimentDisplayName + "</a></p>";

        try {
            Email email = Email.builder()
                    .to(reviewerEmails)
                    .subject(subject)
                    .htmlBody(htmlBody)
                    .build();
            exemplarContext.getInstance(EmailSender.class).sendEmail(email, true);
        } catch (Exception e) {
            clientCallback.displayWarning("Unable to send reviewer notification email: " + e.getMessage());
        }
    }
}
