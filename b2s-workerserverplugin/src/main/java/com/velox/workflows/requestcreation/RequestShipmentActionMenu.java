/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.workflows.requestcreation;

import com.velox.RemoteIconUtil;
import com.velox.api.access.AccessType;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.clientcallback.InputDialogCriteria;
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
import com.velox.api.util.InputDialogResult;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.recordmodels.SampleModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import org.apache.commons.lang3.StringUtils;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * B2S1-243: main-menu button that lets a sponsor raise a shipment requisition.
 *
 * <p>Runs as a sequence of dialogs and creates nothing until the final submit, so the Request is never saved
 * half-filled: project → destination (the sponsor's saved addresses) → date needed (48-hour / weekend warnings)
 * → vials (Ready only) → review → one commit that creates the Request as a Submitted Shipment Requisition,
 * adds the vials under it, marks them Reserved (B2S1-61) and links the raising user's Sponsor Contact.
 */
public class RequestShipmentActionMenu extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String REQUEST_TYPE_SHIPMENT_REQUISITION = "Shipment Requisition";
    private static final String REQUISITION_STATUS_SUBMITTED = "Submitted";
    // Same value the OOTB request portal uses when existing samples are selected.
    private static final String ADD_SAMPLES_METHOD_SELECT_EXISTING = "Selected Samples from Exemplar BioBank";

    private static final String SAMPLE_READY = "Ready";
    private static final String SAMPLE_RESERVED = "Reserved";

    private static final long LEAD_TIME_MILLIS = 48L * 60 * 60 * 1000;
    private static final int MAX_SAMPLES_IN_REVIEW = 20;

    @Override
    public String getLine1Text() {
        return "Request";
    }

    @Override
    public String getLine2Text() {
        return "Shipment";
    }

    @Override
    public String getDescription() {
        return "Request a shipment of your material from B2S.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "truck-delivery-outline.svg");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        // Toolbar Designer limits the button to Sponsor Viewer / Sponsor Approver.
        return user.hasAccess(ProjectModel.DATA_TYPE_NAME, AccessType.READ)
                && user.hasAccess(RequestModel.DATA_TYPE_NAME, AccessType.WRITE);
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            ProjectModel project = promptForProject();
            logInfo("Request Shipment: project " + project.getRecordId());

            DirectoryModel sponsorDirectory = loadSponsorDirectory(project);
            List<C_SponsorAddressModel> addresses = loadActiveAddresses(sponsorDirectory);
            logInfo("Request Shipment: sponsor Directory " + (sponsorDirectory == null ? "none" : sponsorDirectory.getRecordId())
                    + ", active addresses " + addresses.size());
            if (addresses.isEmpty()) {
                clientCallback.displayError(
                        "There are no saved shipping addresses for this sponsor. Ask B2S to add one, then try again.");
                return new PluginResult(true);
            }
            C_SponsorAddressModel destination = promptForAddress(addresses);

            long dateNeeded = promptForDateNeeded();
            confirmDateWarnings(dateNeeded);
            logInfo("Request Shipment: date accepted " + dateNeeded);

            List<SampleModel> readySamples = loadReadySamples(project);
            logInfo("Request Shipment: Ready samples offered " + readySamples.size());
            if (readySamples.isEmpty()) {
                clientCallback.displayError("There are no available (Ready) vials on this project to request.");
                return new PluginResult(true);
            }
            List<SampleModel> selectedSamples = promptForSamples(readySamples);
            if (selectedSamples.isEmpty()) {
                clientCallback.displayError("Select at least one vial to request.");
                return new PluginResult(true);
            }

            confirmReview(project, destination, dateNeeded, selectedSamples);
            rejectIfNoLongerReady(selectedSamples);

            RequestModel request = createRequisition(project, destination, dateNeeded, selectedSamples);
            recMan.storeAndCommit("Created shipment requisition with " + selectedSamples.size() + " vial(s)");
            return new PluginResult(true, new DataRecordFormDirective(request.getDataRecord()));
        } catch (UserRequestedCancelServerException e) {
            // Cancelled at any step: nothing has been created.
            logInfo("Request Shipment: ended without creating a request");
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
                    "Select the Project to ship material from",
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

    /** The sponsor's Account (Directory) is the Project's parent; it holds the sponsor's saved addresses. */
    private DirectoryModel loadSponsorDirectory(ProjectModel project) throws Throwable {
        relationshipMan.loadParents(List.of(project), DirectoryModel.class);
        return project.get(Parent.ofType(DirectoryModel.class));
    }

    private List<C_SponsorAddressModel> loadActiveAddresses(DirectoryModel sponsorDirectory) throws Throwable {
        if (sponsorDirectory == null) {
            return List.of();
        }
        relationshipMan.loadChildren(sponsorDirectory, C_SponsorAddressModel.class);
        return sponsorDirectory.get(Children.ofType(C_SponsorAddressModel.class)).stream()
                // Retired addresses (C_IsActive = false) aren't offered.
                .filter(address -> !Boolean.FALSE.equals(address.getC_IsActive()))
                .collect(Collectors.toList());
    }

    private C_SponsorAddressModel promptForAddress(List<C_SponsorAddressModel> addresses) throws Throwable {
        if (addresses.size() == 1) {
            return addresses.get(0);
        }
        List<Map<String, Object>> selection = showSelectionDialog(
                "Select the destination address", C_SponsorAddressModel.DATA_TYPE_NAME, addresses, false);
        List<C_SponsorAddressModel> selected = mapSelection(selection, addresses);
        if (selected.size() != 1) {
            clientCallback.displayError("Select exactly one destination address.");
            throw new UserRequestedCancelServerException();
        }
        return selected.get(0);
    }

    private long promptForDateNeeded() throws Throwable {
        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Request Shipment")
                .message("When do you need the shipment to arrive?")
                .fieldDefinition(VeloxFieldDefinition.dateFieldBuilder()
                        .dataFieldName("DateNeeded")
                        .displayName("Date Needed")
                        .required(true)
                        .build())
                .build());
        if (input == null || input.getValue() == null) {
            logInfo("Request Shipment: Date Needed dialog returned " + (input == null ? "no result" : "a null value"));
            throw new UserRequestedCancelServerException();
        }
        Object value = input.getValue();
        logInfo("Request Shipment: Date Needed dialog returned " + value.getClass().getName() + " = " + value);
        Long dateNeeded = toEpochMillis(value);
        if (dateNeeded == null) {
            // Don't end silently: say what came back so it can be fixed.
            clientCallback.displayError("Could not read the Date Needed value (" + value.getClass().getName()
                    + ": " + value + "). Nothing was created.");
            throw new UserRequestedCancelServerException();
        }
        return dateNeeded;
    }

    /** The date dialog's value type isn't fixed by the API, so accept the common forms. */
    private static Long toEpochMillis(Object value) {
        if (value instanceof Number number) {
            return number.longValue();
        }
        if (value instanceof java.util.Date date) {
            return date.getTime();
        }
        if (value instanceof java.time.Instant instant) {
            return instant.toEpochMilli();
        }
        if (value instanceof java.time.LocalDate localDate) {
            return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
        if (value instanceof java.time.LocalDateTime localDateTime) {
            return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        }
        if (value instanceof ZonedDateTime zonedDateTime) {
            return zonedDateTime.toInstant().toEpochMilli();
        }
        if (value instanceof String text && StringUtils.isNumeric(text.trim())) {
            return Long.parseLong(text.trim());
        }
        return null;
    }

    /** Less than 48 hours ahead, or a weekend: warn, but let the sponsor continue (B2S SOP exceptions). */
    private void confirmDateWarnings(long dateNeeded) throws Throwable {
        List<String> warnings = new ArrayList<>();
        if (dateNeeded - System.currentTimeMillis() < LEAD_TIME_MILLIS) {
            warnings.add("The date needed is less than 48 hours away (B2S requires 48 hours' notice).");
        }
        DayOfWeek day = ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateNeeded), ZoneId.systemDefault()).getDayOfWeek();
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            warnings.add("The date needed falls on a weekend (B2S does not normally ship for weekend delivery).");
        }
        if (warnings.isEmpty()) {
            return;
        }
        boolean proceed = clientCallback.showYesNoDialog(
                "Date Warning",
                String.join("\n", warnings) + "\n\nContinue with this date?",
                false);
        if (!proceed) {
            throw new UserRequestedCancelServerException();
        }
    }

    /** Ready vials under the Project, directly or through its Studies. Access control limits sponsors to their own. */
    private List<SampleModel> loadReadySamples(ProjectModel project) throws Throwable {
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
        return samples.stream()
                .filter(sample -> SAMPLE_READY.equals(sample.getExemplarSampleStatus()))
                .collect(Collectors.toList());
    }

    private List<SampleModel> promptForSamples(List<SampleModel> readySamples) throws Throwable {
        List<Map<String, Object>> selection = showSelectionDialog(
                "Select the vials to ship", SampleModel.DATA_TYPE_NAME, readySamples, true);
        return mapSelection(selection, readySamples);
    }

    private void confirmReview(ProjectModel project, C_SponsorAddressModel destination, long dateNeeded,
                               List<SampleModel> selectedSamples) throws Throwable {
        String sampleList = selectedSamples.stream()
                .limit(MAX_SAMPLES_IN_REVIEW)
                .map(SampleModel::getSampleId)
                .collect(Collectors.joining(", "));
        if (selectedSamples.size() > MAX_SAMPLES_IN_REVIEW) {
            sampleList += " … and " + (selectedSamples.size() - MAX_SAMPLES_IN_REVIEW) + " more";
        }
        String summary = "Project: " + project.getDataRecordName()
                + "\nDestination: " + formatAddress(destination).replace("\n", ", ")
                + "\nDate needed: " + ZonedDateTime.ofInstant(Instant.ofEpochMilli(dateNeeded), ZoneId.systemDefault())
                .toLocalDate()
                + "\nVials (" + selectedSamples.size() + "): " + sampleList
                + "\n\nSubmit this shipment request? Choose No to cancel and start again.";
        if (!clientCallback.showYesNoDialog("Review Shipment Request", summary, true)) {
            throw new UserRequestedCancelServerException();
        }
    }

    /** Someone else may have reserved a vial while the dialogs were open. */
    private void rejectIfNoLongerReady(List<SampleModel> selectedSamples) throws Throwable {
        List<Object> recordIds = selectedSamples.stream().map(SampleModel::getRecordId).collect(Collectors.toList());
        List<DataRecord> current = dataRecordManager.queryDataRecords(
                SampleModel.DATA_TYPE_NAME, SampleModel.RECORD_ID, recordIds, user);
        List<String> unavailable = new ArrayList<>();
        for (DataRecord record : current) {
            String status = record.getStringVal(SampleModel.EXEMPLAR_SAMPLE_STATUS, user);
            if (!SAMPLE_READY.equals(status)) {
                unavailable.add(record.getStringVal(SampleModel.SAMPLE_ID, user) + " (" + status + ")");
            }
        }
        if (!unavailable.isEmpty()) {
            clientCallback.displayError("These vials are no longer available, so nothing was submitted:\n"
                    + String.join("\n", unavailable));
            throw new UserRequestedCancelServerException();
        }
    }

    private RequestModel createRequisition(ProjectModel project, C_SponsorAddressModel destination, long dateNeeded,
                                           List<SampleModel> selectedSamples) throws Throwable {
        RequestModel request = instMan.addNewRecord(RequestModel.class);
        request.setC_RequestType(REQUEST_TYPE_SHIPMENT_REQUISITION);
        // B2S1-244's RequisitionStatusOnSave allows a new requisition only to start as Submitted.
        request.setC_RequisitionStatus(REQUISITION_STATUS_SUBMITTED);
        request.setNumberOfSamples((long) selectedSamples.size());
        request.setAddSamplesMethod(ADD_SAMPLES_METHOD_SELECT_EXISTING);
        request.setRequestDate(System.currentTimeMillis());
        request.setC_DateNeeded(dateNeeded);
        request.setC_Destination(destination.getRecordId());
        // Copied so the request keeps the address even if the saved address is later edited or retired.
        request.setC_DestinationAddress(formatAddress(destination));
        project.add(Child.ref(request));

        for (SampleModel sample : selectedSamples) {
            request.add(Child.ref(sample));
            sample.setExemplarSampleStatus(SAMPLE_RESERVED);
        }

        C_SponsorContactModel sponsorContact = loadSponsorContactForCurrentUser();
        if (sponsorContact != null) {
            sponsorContact.add(Child.ref(request));
        }
        return request;
    }

    /** Same lookup as B2S1-247's CreateRequestActionMenu: the contact whose username matches the current user. */
    private C_SponsorContactModel loadSponsorContactForCurrentUser() throws Throwable {
        List<DataRecord> sponsorContacts = dataRecordManager.queryDataRecords(
                C_SponsorContactModel.DATA_TYPE_NAME,
                C_SponsorContactModel.C___USERNAME,
                List.of(user.getUsername()),
                user);
        if (sponsorContacts == null || sponsorContacts.isEmpty()) {
            return null;
        }
        return instMan.addExistingRecordOfType(sponsorContacts.get(0), C_SponsorContactModel.class);
    }

    private static String formatAddress(C_SponsorAddressModel address) {
        List<String> lines = new ArrayList<>();
        addIfPresent(lines, address.getC_AddressName());
        addIfPresent(lines, address.getC_Attention() == null ? null : "Attn: " + address.getC_Attention());
        addIfPresent(lines, address.getC_AddressLine1());
        addIfPresent(lines, address.getC_AddressLine2());
        addIfPresent(lines, StringUtils.joinWith(" ",
                StringUtils.defaultString(address.getC_City()),
                StringUtils.defaultString(address.getC_StateRegion()),
                StringUtils.defaultString(address.getC_PostalCode())));
        addIfPresent(lines, address.getC_Country());
        return String.join("\n", lines);
    }

    private static void addIfPresent(List<String> lines, String value) {
        String trimmed = StringUtils.normalizeSpace(value);
        if (StringUtils.isNotBlank(trimmed)) {
            lines.add(trimmed);
        }
    }

    private List<Map<String, Object>> showSelectionDialog(
            String title, String dataTypeName, List<? extends RecordModel> records,
            boolean multiSelect) throws Throwable {
        DataTypeDefinition definition = dataMgmtServer.getDataTypeManager(user).getDataTypeDefinition(dataTypeName);
        TemporaryDataType temporaryDataType = definition.getTemporaryDataType(user);
        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                title,
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(temporaryDataType)
                        .multiSelect(multiSelect)
                        .records(RecordModelUtil.getClonedFieldsList(records))
                        .build(),
                user);
        if (selection == null || clientCallback.isAborted()) {
            throw new UserRequestedCancelServerException();
        }
        return selection;
    }

    private static <T extends RecordModel> List<T> mapSelection(
            List<Map<String, Object>> selection, List<T> candidates) {
        Map<Long, T> byId = candidates.stream()
                .collect(Collectors.toMap(T::getRecordId, candidate -> candidate, (a, b) -> a));
        List<T> selected = new ArrayList<>();
        for (Map<String, Object> row : selection) {
            if (row.get("RecordId") instanceof Number recordId) {
                T candidate = byId.get(recordId.longValue());
                if (candidate != null && !selected.contains(candidate)) {
                    selected.add(candidate);
                }
            }
        }
        return selected;
    }
}
