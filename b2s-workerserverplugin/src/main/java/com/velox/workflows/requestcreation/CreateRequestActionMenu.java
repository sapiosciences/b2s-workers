/**
 * Created: 2026-09-21 16:45
 * Agent type: Auto
 */
/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.workflows.requestcreation;

import com.velox.api.access.AccessType;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.eln.notebookexperiment.TemplateExperiment;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.DataRecordFormDirective;
import com.velox.internalproducts.baselinesampleaccessioning.requestcreation.LaunchRequestCreationTemplateButton;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.recordmodels.ngs.ProjectModel;
import com.velox.sapio.commons.recordmodels.ngs.RequestModel;

import java.util.List;
import java.util.Map;

/**
 * Creates a Request directly under a user-selected Project without creating or opening an ELN experiment.
 */
public class CreateRequestActionMenu extends LaunchRequestCreationTemplateButton {

    public CreateRequestActionMenu() {
        setActionMenu(true);
        setFormToolbar(false);
        setTableToolbar(false);
        setDescription("Create @DATATYPEDISPLAYNAME(Request) under a selected @DATATYPEDISPLAYNAME(Project)");
    }

    @Override
    public boolean onActionMenu() {
        try {
            return user.hasAccess(ProjectModel.DATA_TYPE_NAME, AccessType.READ)
                    && user.hasAccess(RequestModel.DATA_TYPE_NAME, AccessType.WRITE);
        } catch(Exception exception) {
            logError(exception);
            return false;
        }
    }

    @Override
    public boolean onFormToolbar() {
        return false;
    }

    @Override
    public boolean onTableToolbar() {
        return false;
    }

    @Override
    protected PluginResult run() throws Throwable {
        return handleIdvRegistration();
    }

    @Override
    protected PluginResult handleIdvRegistration() throws Throwable {
        List<DataRecord> projects = dataRecordManager.queryDataRecords(ProjectModel.DATA_TYPE_NAME, null, user);
        DataRecord selectedProject;
        if (projects != null && projects.size() == 1) {
            selectedProject = projects.get(0);
        } else {
            List<DataRecord> selectedProjects = clientCallback.showInputSelectionDialog(
                    ProjectModel.DATA_TYPE_NAME,
                    "Select the Project for the new Request",
                    user);
            if (selectedProjects == null || selectedProjects.isEmpty()) {
                return new PluginResult(true);
            }
            if (selectedProjects.size() != 1) {
                displayWarning("Select exactly one Project.");
                return new PluginResult(false);
            }
            selectedProject = selectedProjects.get(0);
        }

        DataTypeDefinition requestDefinition =
                dataMgmtServer.getDataTypeManager(user).getDataTypeDefinition(RequestModel.DATA_TYPE_NAME);
        TemporaryDataType requestForm = requestDefinition.getTemporaryDataType(user);
        Map<String, Object> requestFields = clientCallback.showFieldEntryDialog(
                "Create " + requestDefinition.getDisplayName(user),
                "Enter the Request details",
                requestForm,
                user);
        if (requestFields == null) {
            return new PluginResult(true);
        }

        ProjectModel project = instMan.addExistingRecordOfType(selectedProject, ProjectModel.class);
        RequestModel request = instMan.addNewRecord(RequestModel.class);
        request.setFields(requestFields);
        project.add(Child.ref(request));

        C_SponsorContactModel sponsorContact = loadSponsorContactForCurrentUser();
        if (sponsorContact != null) {
            request.add(Child.ref(sponsorContact));
        }

        recMan.storeAndCommit("Created Request under selected Project");
        if (sponsorContact == null) {
            displayWarning("No Sponsor Contact is set up for user \"" + user.getUsername()
                    + "\" — the Request was created without one.");
        }

        return new PluginResult(true, new DataRecordFormDirective(request.getDataRecord()));
    }

    /**
     * Finds the existing Sponsor Contact whose {@link C_SponsorContactModel#C___USERNAME} matches the username of
     * the user running this plugin.
     *
     * @return the matching Sponsor Contact, or null when the current user has no Sponsor Contact record
     */
    private C_SponsorContactModel loadSponsorContactForCurrentUser() throws Throwable {
        List<DataRecord> sponsorContacts = dataRecordManager.queryDataRecords(
                C_SponsorContactModel.DATA_TYPE_NAME,
                C_SponsorContactModel.C___USERNAME,
                List.of(user.getUsername()),
                user);
        if (sponsorContacts == null || sponsorContacts.isEmpty()) {
            return null;
        }
        // Username is the unique handle for a Sponsor Contact, so at most one record is expected.
        return instMan.addExistingRecordOfType(sponsorContacts.get(0), C_SponsorContactModel.class);
    }

    @Override
    protected boolean registerOutsideExperiment() {
        return true;
    }

    @Override
    protected TemplateExperiment getTemplateExperimentWithMatchingKey() {
        return null;
    }
}
