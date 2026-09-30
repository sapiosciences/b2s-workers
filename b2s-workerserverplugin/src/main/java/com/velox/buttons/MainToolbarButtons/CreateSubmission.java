/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.MainToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.access.AccessType;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.DataRecordFormDirective;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.recordmodels.SampleModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * B2S1-247: main-menu button that lets a sponsor (or Project Coordinator / Logistics) raise a Submission — notice
 * that material is on its way to B2S.
 *
 * <p>Standalone rather than built on the OOTB request-creation button, whose visibility needs Process read access and
 * the Request Creation ELN template, which sponsor groups don't have. Replaces the earlier CreateRequestActionMenu.
 *
 * <p>Flow: project → "are the samples already registered?" → if yes, pick the registered (Logged) samples → the
 * submission details → one commit that creates the Request as Request Type = Submission and
 * C_RequisitionStatus = Submitted, with any picked samples under it and the Sponsor Contact linked as parent.
 */
public class CreateSubmission extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String REQUEST_TYPE_SUBMISSION = "Submission";
    private static final String REQUISITION_STATUS_SUBMITTED = "Submitted";
    // OOTB Sample Creation or Selection Method values.
    private static final String ADD_SAMPLES_METHOD_SELECT_EXISTING = "Selected Samples from Exemplar BioBank";
    private static final String ADD_SAMPLES_METHOD_MANIFEST = "Add New Samples Via Spreadsheet Load";

    // Registered in Sapio but not yet received.
    private static final String SAMPLE_LOGGED = "Logged";

    // Only the fields a Submission captures; the number of samples comes from the selection when pre-registered.
    private static final List<String> SUBMISSION_FIELDS = List.of(
            RequestModel.C___EXPECTED_ARRIVAL_DATE,
            RequestModel.C___TRACKING_NUMBER,
            RequestModel.C___STORAGE_TEMP,
            RequestModel.C___SAMPLE_NAME_TYPE,
            RequestModel.C___COMMENTS);

    @Override
    public String getLine1Text() {
        return "Create";
    }

    @Override
    public String getLine2Text() {
        return "Submission";
    }

    @Override
    public String getDescription() {
        return "Tell B2S that material is on its way.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "plus-circle-outline.svg");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        // Toolbar Designer limits the button to Sponsor Viewer / Sponsor Approver (and B2S groups as configured).
        return user.hasAccess(ProjectModel.DATA_TYPE_NAME, AccessType.READ)
                && user.hasAccess(RequestModel.DATA_TYPE_NAME, AccessType.WRITE);
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            ProjectModel project = promptForProject();

            boolean preRegistered = clientCallback.showYesNoDialog(
                    "Create Submission",
                    "Are the samples for this submission already registered in Sapio?\n\n"
                            + "Choose Yes only if B2S has told you they're registered.",
                    false);

            List<SampleModel> selectedSamples = List.of();
            if (preRegistered) {
                List<SampleModel> registeredSamples = loadRegisteredSamples(project);
                if (registeredSamples.isEmpty()) {
                    clientCallback.displayError("No registered samples were found on this project. "
                            + "Run Create Submission again and choose No.");
                    return new PluginResult(true);
                }
                selectedSamples = promptForSamples(registeredSamples);
                if (selectedSamples.isEmpty()) {
                    clientCallback.displayError("Select at least one sample.");
                    return new PluginResult(true);
                }
            }

            Map<String, Object> details = promptForDetails(preRegistered);

            RequestModel request = createSubmission(project, details, selectedSamples);
            recMan.storeAndCommit("Created submission under Project " + project.getRecordId());
            return new PluginResult(true, new DataRecordFormDirective(request.getDataRecord()));
        } catch (UserRequestedCancelServerException e) {
            // Cancelled at any step: nothing has been created.
            return new PluginResult(true);
        }
    }

    /** Auto-picks the project when the user can see only one; access control scopes the list. */
    private ProjectModel promptForProject() throws Throwable {
        List<DataRecord> projects = dataRecordManager.queryDataRecords(ProjectModel.DATA_TYPE_NAME, null, user);
        DataRecord selectedProject;
        if (projects != null && projects.size() == 1) {
            selectedProject = projects.get(0);
        } else {
            List<DataRecord> selectedProjects = clientCallback.showInputSelectionDialog(
                    ProjectModel.DATA_TYPE_NAME,
                    "Select the Project for the submission",
                    user);
            if (selectedProjects == null || selectedProjects.isEmpty()) {
                throw new UserRequestedCancelServerException();
            }
            if (selectedProjects.size() != 1) {
                clientCallback.displayError("Select exactly one Project.");
                throw new UserRequestedCancelServerException();
            }
            selectedProject = selectedProjects.get(0);
        }
        return instMan.addExistingRecordOfType(selectedProject, ProjectModel.class);
    }

    /**
     * Logged samples directly under the Project or one of its Studies that aren't already on a Request.
     * Access control limits sponsors to their own.
     */
    private List<SampleModel> loadRegisteredSamples(ProjectModel project) throws Throwable {
        relationshipMan.loadChildren(project, SampleModel.class);
        relationshipMan.loadChildren(project, StudyModel.class);
        List<StudyModel> studies = new ArrayList<>(project.get(Children.ofType(StudyModel.class)));
        if (!studies.isEmpty()) {
            relationshipMan.loadChildren(studies, SampleModel.class);
        }

        Set<SampleModel> samples = new LinkedHashSet<>(project.get(Children.ofType(SampleModel.class)));
        for (StudyModel study : studies) {
            samples.addAll(study.get(Children.ofType(SampleModel.class)));
        }
        List<SampleModel> logged = samples.stream()
                .filter(sample -> SAMPLE_LOGGED.equals(sample.getExemplarSampleStatus()))
                .collect(Collectors.toList());
        if (logged.isEmpty()) {
            return logged;
        }

        relationshipMan.loadParents(logged, RequestModel.class);
        return logged.stream()
                .filter(sample -> sample.get(Parent.ofType(RequestModel.class)) == null)
                .collect(Collectors.toList());
    }

    private List<SampleModel> promptForSamples(List<SampleModel> registeredSamples) throws Throwable {
        DataTypeDefinition sampleDefinition =
                dataMgmtServer.getDataTypeManager(user).getDataTypeDefinition(SampleModel.DATA_TYPE_NAME);
        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                "Select the samples in this submission",
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(sampleDefinition.getTemporaryDataType(user))
                        .multiSelect(true)
                        .records(RecordModelUtil.getClonedFieldsList(registeredSamples))
                        .build(),
                user);
        if (selection == null || clientCallback.isAborted()) {
            throw new UserRequestedCancelServerException();
        }

        Map<Long, SampleModel> byId = registeredSamples.stream()
                .collect(Collectors.toMap(SampleModel::getRecordId, sample -> sample, (a, b) -> a));
        List<SampleModel> selected = new ArrayList<>();
        for (Map<String, Object> row : selection) {
            if (row.get(SampleModel.RECORD_ID) instanceof Number recordId) {
                SampleModel sample = byId.get(recordId.longValue());
                if (sample != null && !selected.contains(sample)) {
                    selected.add(sample);
                }
            }
        }
        return selected;
    }

    /**
     * The submission fields from the Request definition. Number of Samples is asked for only when the samples aren't
     * pre-registered. Expected Arrival Date (and Number of Samples when asked) are required, since B2S1-249's
     * notification only fires once they're filled in.
     */
    private Map<String, Object> promptForDetails(boolean preRegistered) throws Throwable {
        DataTypeDefinition requestDefinition =
                dataMgmtServer.getDataTypeManager(user).getDataTypeDefinition(RequestModel.DATA_TYPE_NAME);
        TemporaryDataType form = requestDefinition.getTemporaryDataType(user);

        List<String> fieldNames = new ArrayList<>();
        if (!preRegistered) {
            fieldNames.add(RequestModel.NUMBER_OF_SAMPLES);
        }
        fieldNames.addAll(SUBMISSION_FIELDS);
        List<VeloxFieldDefinition<?>> fields = new ArrayList<>();
        for (String fieldName : fieldNames) {
            VeloxFieldDefinition<?> field = form.getVeloxFieldDefinition(fieldName);
            if (field != null) {
                fields.add(field);
            }
        }
        form.setVeloxFieldDefinitionList(fields);

        while (true) {
            Map<String, Object> details = clientCallback.showFieldEntryDialog(
                    "Create Submission", "Enter the submission details", form, user);
            if (details == null) {
                throw new UserRequestedCancelServerException();
            }
            List<String> missing = new ArrayList<>();
            if (details.get(RequestModel.C___EXPECTED_ARRIVAL_DATE) == null) {
                missing.add("Expected Arrival Date");
            }
            if (!preRegistered && !(details.get(RequestModel.NUMBER_OF_SAMPLES) instanceof Number)) {
                missing.add("Number of Samples");
            }
            if (missing.isEmpty()) {
                return details;
            }
            clientCallback.displayError("Please fill in: " + String.join(", ", missing) + ".");
        }
    }

    private RequestModel createSubmission(ProjectModel project, Map<String, Object> details,
                                          List<SampleModel> selectedSamples) throws Throwable {
        RequestModel request = instMan.addNewRecord(RequestModel.class);
        request.setFields(details);
        request.setC_RequestType(REQUEST_TYPE_SUBMISSION);
        request.setC_RequisitionStatus(REQUISITION_STATUS_SUBMITTED);
        request.setRequestDate(System.currentTimeMillis());
        if (selectedSamples.isEmpty()) {
            request.setAddSamplesMethod(ADD_SAMPLES_METHOD_MANIFEST);
        } else {
            request.setAddSamplesMethod(ADD_SAMPLES_METHOD_SELECT_EXISTING);
            request.setNumberOfSamples((long) selectedSamples.size());
            for (SampleModel sample : selectedSamples) {
                request.add(Child.ref(sample));
            }
        }
        project.add(Child.ref(request));

        C_SponsorContactModel sponsorContact = loadSponsorContactForCurrentUser();
        if (sponsorContact == null) {
            // Project Coordinator / Logistics have no Sponsor Contact of their own.
            sponsorContact = loadOnlySponsorContactForProject(project);
        }
        if (sponsorContact != null) {
            // Sponsor Contact is the parent: one contact rolls up many Requests.
            sponsorContact.add(Child.ref(request));
        }
        return request;
    }

    /** The Sponsor Contact whose username matches the current user. */
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

    /**
     * For a Request raised by a B2S user: the Sponsor Contact under the Project's sponsor Directory, when it has
     * exactly one; otherwise null (left unlinked, no prompt).
     */
    private C_SponsorContactModel loadOnlySponsorContactForProject(ProjectModel project) throws Throwable {
        relationshipMan.loadParents(List.of(project), DirectoryModel.class);
        DirectoryModel sponsorDirectory = project.get(Parent.ofType(DirectoryModel.class));
        if (sponsorDirectory == null) {
            return null;
        }
        relationshipMan.loadChildren(sponsorDirectory, C_SponsorContactModel.class);
        List<C_SponsorContactModel> sponsorContacts =
                new ArrayList<>(sponsorDirectory.get(Children.ofType(C_SponsorContactModel.class)));
        return sponsorContacts.size() == 1 ? sponsorContacts.get(0) : null;
    }
}
