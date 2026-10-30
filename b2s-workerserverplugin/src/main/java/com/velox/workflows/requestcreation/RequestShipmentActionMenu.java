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
import com.velox.api.clientcallback.ReadFileDialogCriteria;
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
import com.velox.managers.ShipmentRequisitionManager;
import com.velox.plugin.materialsmanagement.pojo.ConsumableItem;
import com.velox.plugin.materialsmanagement.pojo.descriptor.ItemDescriptor;
import com.velox.plugin.materialsmanagement.pojo.descriptor.ParentDescriptor;
import com.velox.recordmodels.AttachmentModel;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.C_SponsorLotModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.recordmodels.SampleModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.attachment.AttachmentData;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import com.velox.sapio.commons.utils.StreamingUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * B2S1-243: main-menu button that lets a sponsor raise a shipment requisition.
 *
 * <p>Wizard-style flow — nothing is written until the very end, so a cancel mid-way leaves no
 * half-built Request. Typical order:
 * <ol>
 *   <li>Pick Project</li>
 *   <li>Pick destination address (from the sponsor Directory)</li>
 *   <li>Pick Date Needed (with 48-hour / weekend warnings)</li>
 *   <li>Pick available vials (stored/Active, not reserved or shipped)</li>
 *   <li>If the pick would leave a Sponsor Lot (or Part) at or below its minimum number of
 *       non-empty vials → warn; status becomes Awaiting B2S Approval instead of Submitted</li>
 *   <li>Review summary → optional file attachment</li>
 *   <li>One commit: create Request, move vials off the lot onto the Request, mark them Reserved</li>
 * </ol>
 */
public class RequestShipmentActionMenu extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String REQUEST_TYPE_SHIPMENT_REQUISITION = "Shipment Requisition";
    // Same value the OOTB request portal uses when existing samples are selected.
    private static final String ADD_SAMPLES_METHOD_SELECT_EXISTING = "Selected Samples from Exemplar BioBank";
    // On a Part with no Sponsor Lot, this field is the minimum number of non-empty vials to keep.
    private static final String PART_REORDER_LEVEL_FIELD = "ReorderLevelQuantity";

    private static final String SAMPLE_RESERVED = "Reserved";
    // A vial is available once stored (Lifecycle Status Active, B2S1-47) and not already on a requisition
    private static final Set<String> SAMPLE_HELD_STATUSES = Set.of(SAMPLE_RESERVED, "Shipped");
    private static final String LIFECYCLE_ACTIVE = "Active";

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
            // --- Step through the wizard; cancel at any dialog throws and we exit cleanly ---
            ProjectModel project = promptForProject();
            logInfo("Request Shipment: project " + project.getRecordId());

            // Addresses live on the sponsor's Directory (parent of the Project)
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

            // Only available vials are offered
            List<SampleModel> readySamples = loadReadySamples(project);
            logInfo("Request Shipment: Ready samples offered " + readySamples.size());
            if (readySamples.isEmpty()) {
                clientCallback.displayError("There are no available vials on this project to request. Vials must be stored (Active) and not already reserved or shipped.");
                return new PluginResult(true);
            }
            List<SampleModel> selectedSamples = promptForSamples(readySamples);
            if (selectedSamples.isEmpty()) {
                clientCallback.displayError("Select at least one vial to request.");
                return new PluginResult(true);
            }

            // Submitted normally; Awaiting B2S Approval if this pick would leave too few non-empty vials
            String requisitionStatus = resolveRequisitionStatusForSelection(selectedSamples);
            confirmReview(project, destination, dateNeeded, selectedSamples);
            // Re-check Ready in case another user grabbed a vial while dialogs were open
            rejectIfNoLongerReady(selectedSamples);

            PendingAttachment pendingAttachment = promptOptionalAttachment();
            RequestModel request = createRequisition(
                    project, destination, dateNeeded, selectedSamples, requisitionStatus, pendingAttachment);
            // Single commit — Request, vial moves, reservation, and optional attachment together
            recMan.storeAndCommit("Created shipment requisition with " + selectedSamples.size() + " vial(s)");
            return new PluginResult(true, new DataRecordFormDirective(request.getDataRecord()));
        } catch (UserRequestedCancelServerException e) {
            // User cancelled a dialog: nothing was committed, so there is no orphan Request
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

    /** Available vials under the Project, directly or through its Studies or Sponsor Lots. Access control limits sponsors to their own. */
    private List<SampleModel> loadReadySamples(ProjectModel project) throws Throwable {
        relationshipMan.loadChildren(project, SampleModel.class);
        relationshipMan.loadChildren(project, StudyModel.class);
        relationshipMan.loadChildren(project, C_SponsorLotModel.class);
        List<StudyModel> studies = new ArrayList<>(project.get(Children.ofType(StudyModel.class)));
        if (!studies.isEmpty()) {
            relationshipMan.loadChildren(studies, SampleModel.class);
        }
        // Create Sponsor Lot files vials under the lot, not the Project
        List<C_SponsorLotModel> lots = new ArrayList<>(project.get(Children.ofType(C_SponsorLotModel.class)));
        if (!lots.isEmpty()) {
            relationshipMan.loadChildren(lots, SampleModel.class);
        }

        Set<SampleModel> samples = new LinkedHashSet<>(project.get(Children.ofType(SampleModel.class)));
        for (StudyModel study : studies) {
            samples.addAll(study.get(Children.ofType(SampleModel.class)));
        }
        for (C_SponsorLotModel lot : lots) {
            samples.addAll(lot.get(Children.ofType(SampleModel.class)));
        }
        return samples.stream()
                .filter(sample -> isAvailable(sample.getC_LifecycleStatus(), sample.getExemplarSampleStatus()))
                .collect(Collectors.toList());
    }

    private static boolean isAvailable(String lifecycleStatus, String sampleStatus) {
        return LIFECYCLE_ACTIVE.equals(lifecycleStatus) && !SAMPLE_HELD_STATUSES.contains(sampleStatus);
    }

    private List<SampleModel> promptForSamples(List<SampleModel> readySamples) throws Throwable {
        List<Map<String, Object>> selection = showSelectionDialog(
                "Select the vials to ship", SampleModel.DATA_TYPE_NAME, readySamples, true);
        return mapSelection(selection, readySamples);
    }

    /**
     * Submitted unless removing the selection would leave a Sponsor Lot (or, if none, its Part) at or
     * below its minimum threshold. In that case the user must confirm, and the request starts as
     * Awaiting B2S Approval. Samples with neither a Sponsor Lot nor a consumable Part parent are skipped.
     */
    private String resolveRequisitionStatusForSelection(List<SampleModel> selectedSamples) throws Throwable {
        List<String> breachMessages = findMinimumThresholdBreaches(selectedSamples);
        if (breachMessages.isEmpty()) {
            return ShipmentRequisitionManager.STATUS_SUBMITTED;
        }

        String message = "This shipment would leave a Sponsor Lot or Part at or below its minimum number of non-empty vials:\n\n"
                + String.join("\n", breachMessages)
                + "\n\nIf you continue, the request will be created as "
                + ShipmentRequisitionManager.STATUS_AWAITING_B2S_APPROVAL
                + " and will need B2S approval before it can proceed.\n\nContinue?";
        if (!clientCallback.showYesNoDialog("Minimum Threshold Warning", message, false)) {
            throw new UserRequestedCancelServerException();
        }
        return ShipmentRequisitionManager.STATUS_AWAITING_B2S_APPROVAL;
    }

    /**
     * Figures out which Sponsor Lots (or Parts, if no lot) would fall to/below their minimum
     * if the selected vials were removed. Returns human-readable breach lines for the warning dialog.
     * Does not change any records — this is a what-if check only.
     */
    private List<String> findMinimumThresholdBreaches(List<SampleModel> selectedSamples) throws Throwable {
        relationshipMan.loadParents(selectedSamples, C_SponsorLotModel.class);

        // Group the selection by Sponsor Lot; vials with no lot go to the Part fallback list
        Map<Long, C_SponsorLotModel> lotsById = new LinkedHashMap<>();
        Map<Long, List<SampleModel>> selectedByLotId = new HashMap<>();
        List<SampleModel> samplesWithoutLot = new ArrayList<>();

        for (SampleModel sample : selectedSamples) {
            C_SponsorLotModel lot = sample.get(Parent.ofType(C_SponsorLotModel.class));
            if (lot == null) {
                samplesWithoutLot.add(sample);
                continue;
            }
            lotsById.putIfAbsent(lot.getRecordId(), lot);
            selectedByLotId.computeIfAbsent(lot.getRecordId(), ignored -> new ArrayList<>()).add(sample);
        }

        List<String> breaches = new ArrayList<>();
        if (!lotsById.isEmpty()) {
            List<C_SponsorLotModel> lots = new ArrayList<>(lotsById.values());
            relationshipMan.loadChildren(lots, SampleModel.class);
            for (C_SponsorLotModel lot : lots) {
                Double threshold = lot.getC_MinimumThreshold();
                // Null threshold → no check for this lot (zero is still a real threshold)
                if (threshold == null) {
                    continue;
                }
                // Remaining = non-empty child vials still on the lot after this pick.
                // Threshold is a vial count (25% of the non-empty vials allocated at creation).
                Set<Long> selectedIds = selectedByLotId.getOrDefault(lot.getRecordId(), List.of()).stream()
                        .map(SampleModel::getRecordId)
                        .collect(Collectors.toCollection(LinkedHashSet::new));
                int remaining = countNonEmptyExcluding(
                        lot.get(Children.ofType(SampleModel.class)), selectedIds);
                if (remaining <= threshold) {
                    breaches.add(formatBreachLine(
                            "Sponsor Lot",
                            StringUtils.defaultIfBlank(lot.getDataRecordName(), String.valueOf(lot.getRecordId())),
                            remaining,
                            threshold));
                }
            }
        }

        // Vials not under a lot: try the consumable Part's minimum instead
        breaches.addAll(findPartMinimumThresholdBreaches(samplesWithoutLot));
        return breaches;
    }

    /**
     * For selected vials with no Sponsor Lot: resolve the materials-management Part parent and compare
     * remaining non-empty child vials to {@link #PART_REORDER_LEVEL_FIELD}. Skip when there is no Part.
     */
    private List<String> findPartMinimumThresholdBreaches(List<SampleModel> samplesWithoutLot) throws Throwable {
        if (samplesWithoutLot.isEmpty()) {
            return List.of();
        }

        Map<String, List<SampleModel>> samplesByPartType = new HashMap<>();
        Map<SampleModel, String> partTypeBySample = new HashMap<>();
        for (SampleModel sample : samplesWithoutLot) {
            String partDataType = resolvePartDataType(sample);
            if (StringUtils.isBlank(partDataType)) {
                continue;
            }
            partTypeBySample.put(sample, partDataType);
            samplesByPartType.computeIfAbsent(partDataType, ignored -> new ArrayList<>()).add(sample);
        }
        if (samplesByPartType.isEmpty()) {
            return List.of();
        }

        for (Map.Entry<String, List<SampleModel>> entry : samplesByPartType.entrySet()) {
            relationshipMan.loadParents(entry.getValue(), entry.getKey());
        }

        Map<String, RecordModel> partsByKey = new LinkedHashMap<>();
        Map<String, List<SampleModel>> selectedByPartKey = new HashMap<>();
        for (SampleModel sample : samplesWithoutLot) {
            String partDataType = partTypeBySample.get(sample);
            if (partDataType == null) {
                continue;
            }
            RecordModel part = sample.get(Parent.ofType(partDataType));
            if (part == null || part.getRecordId() == null) {
                continue;
            }
            String partKey = partDataType + ":" + part.getRecordId();
            partsByKey.putIfAbsent(partKey, part);
            selectedByPartKey.computeIfAbsent(partKey, ignored -> new ArrayList<>()).add(sample);
        }
        if (partsByKey.isEmpty()) {
            return List.of();
        }

        // Parts may be different data types; load Sample children per distinct part type.
        Map<String, List<RecordModel>> partsByType = new HashMap<>();
        for (RecordModel part : partsByKey.values()) {
            partsByType.computeIfAbsent(part.getDataTypeName(), ignored -> new ArrayList<>()).add(part);
        }
        for (List<RecordModel> parts : partsByType.values()) {
            relationshipMan.loadChildren(parts, SampleModel.class);
        }

        List<String> breaches = new ArrayList<>();
        for (Map.Entry<String, RecordModel> entry : partsByKey.entrySet()) {
            RecordModel part = entry.getValue();
            Double threshold = toDouble(part.getField(PART_REORDER_LEVEL_FIELD));
            if (threshold == null) {
                continue;
            }
            Set<Long> selectedIds = selectedByPartKey.getOrDefault(entry.getKey(), List.of()).stream()
                    .map(SampleModel::getRecordId)
                    .collect(Collectors.toCollection(LinkedHashSet::new));
            int remaining = countNonEmptyExcluding(
                    part.get(Children.ofType(SampleModel.class)), selectedIds);
            if (remaining <= threshold) {
                Object partName = part.getField("DataRecordName");
                breaches.add(formatBreachLine(
                        "Part",
                        StringUtils.defaultIfBlank(
                                partName == null ? null : partName.toString(),
                                String.valueOf(part.getRecordId())),
                        remaining,
                        threshold));
            }
        }
        return breaches;
    }

    /**
     * Asks materials management: "what Part data type is this sample an item of?"
     * Returns that type name so we can load Parent.ofType(...), or null if it isn't a consumable item.
     */
    private String resolvePartDataType(SampleModel sample) {
        try {
            ConsumableItem item = ConsumableItem.toItem(sample, exemplarContext);
            if (item == null) {
                return null;
            }
            ItemDescriptor itemDescriptor = item.getDescriptor();
            if (itemDescriptor == null) {
                return null;
            }
            ParentDescriptor parentDescriptor = itemDescriptor.getParentDescriptor();
            return parentDescriptor == null ? null : parentDescriptor.getDataTypeName();
        } catch (Throwable t) {
            logInfo("Request Shipment: could not resolve consumable Part type for sample "
                    + sample.getRecordId() + ": " + t.getMessage());
            return null;
        }
    }

    // Non-empty vials still present after skipping the ones being requested. Volume > 0 counts as non-empty.
    private static int countNonEmptyExcluding(Iterable<SampleModel> samples, Set<Long> excludedRecordIds) {
        int count = 0;
        for (SampleModel sample : samples) {
            if (sample.getRecordId() != null && excludedRecordIds.contains(sample.getRecordId())) {
                continue;
            }
            Double volume = sample.getVolume();
            if (volume != null && volume > 0.0) {
                count++;
            }
        }
        return count;
    }

    private static Double toDouble(Object value) {
        if (value instanceof Number number) {
            return number.doubleValue();
        }
        if (value instanceof String text && StringUtils.isNotBlank(text)) {
            try {
                return Double.parseDouble(text.trim());
            } catch (NumberFormatException ignored) {
                return null;
            }
        }
        return null;
    }

    private static String formatBreachLine(String kind, String name, int remaining, double threshold) {
        String vials = remaining == 1 ? "non-empty vial" : "non-empty vials";
        return "- " + kind + " " + name + ": " + remaining + " " + vials
                + " would remain (minimum " + formatCount(threshold) + ")";
    }

    // Whole numbers print without a trailing ".0" (a threshold of 8, not 8.0).
    private static String formatCount(double value) {
        if (!Double.isInfinite(value) && value == Math.rint(value)) {
            return Long.toString((long) value);
        }
        return Double.toString(value);
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
            if (!isAvailable(record.getStringVal(SampleModel.C___LIFECYCLE_STATUS, user), status)) {
                unavailable.add(record.getStringVal(SampleModel.SAMPLE_ID, user) + " (" + status + ")");
            }
        }
        if (!unavailable.isEmpty()) {
            clientCallback.displayError("These vials are no longer available, so nothing was submitted:\n"
                    + String.join("\n", unavailable));
            throw new UserRequestedCancelServerException();
        }
    }

    /**
     * Optional single-file attachment. No → skip. Yes → file picker; canceling the picker also skips.
     */
    private PendingAttachment promptOptionalAttachment() throws Throwable {
        boolean addFile = clientCallback.showYesNoDialog(
                "Add Attachment",
                "Would you like to attach an optional file to this request?",
                false);
        if (!addFile) {
            return null;
        }

        String filePath = clientCallback.showFileDialog(ReadFileDialogCriteria.builder()
                .title("Select a file to attach")
                .build());
        if (StringUtils.isBlank(filePath) || clientCallback.isAborted()) {
            return null;
        }

        byte[] fileBytes = StreamingUtil.readBytesFromUser(filePath, exemplarContext);
        if (fileBytes == null || fileBytes.length == 0) {
            clientCallback.displayError("Could not read the selected file. The request will be created without an attachment.");
            return null;
        }
        return new PendingAttachment(new File(filePath).getName(), fileBytes);
    }

    /**
     * Builds the new Request in memory (not committed yet): fields, Project link, unhook vials from
     * their Sponsor Lots, hang them under the Request as Reserved, optional Attachment, Sponsor Contact.
     */
    private RequestModel createRequisition(ProjectModel project, C_SponsorAddressModel destination, long dateNeeded,
                                           List<SampleModel> selectedSamples, String requisitionStatus,
                                           PendingAttachment pendingAttachment)
            throws Throwable {
        RequestModel request = instMan.addNewRecord(RequestModel.class);
        request.setC_RequestType(REQUEST_TYPE_SHIPMENT_REQUISITION);
        // Status was decided earlier (Submitted vs Awaiting B2S Approval); OnSave allows either from blank
        request.setC_RequisitionStatus(requisitionStatus);
        request.setNumberOfSamples((long) selectedSamples.size());
        request.setAddSamplesMethod(ADD_SAMPLES_METHOD_SELECT_EXISTING);
        request.setRequestDate(System.currentTimeMillis());
        request.setC_DateNeeded(dateNeeded);
        request.setC_Destination(destination.getRecordId());
        // Snapshot of the address text so later edits/retirements of the saved address don't rewrite history
        request.setC_DestinationAddress(formatAddress(destination));
        project.add(Child.ref(request));

        // Unlink selected vials from their Sponsor Lot — they belong to the Request from here on
        relationshipMan.loadParents(selectedSamples, C_SponsorLotModel.class);
        Map<Long, C_SponsorLotModel> lotsById = new LinkedHashMap<>();
        Map<Long, List<SampleModel>> samplesByLotId = new HashMap<>();
        for (SampleModel sample : selectedSamples) {
            C_SponsorLotModel lot = sample.get(Parent.ofType(C_SponsorLotModel.class));
            if (lot == null || lot.getRecordId() == null) {
                continue;
            }
            lotsById.putIfAbsent(lot.getRecordId(), lot);
            samplesByLotId.computeIfAbsent(lot.getRecordId(), ignored -> new ArrayList<>()).add(sample);
        }
        for (Map.Entry<Long, List<SampleModel>> entry : samplesByLotId.entrySet()) {
            lotsById.get(entry.getKey()).remove(Children.refs(entry.getValue()));
        }

        // Request → vials, and mark them Reserved so nobody else can pick them
        for (SampleModel sample : selectedSamples) {
            request.add(Child.ref(sample));
            sample.setExemplarSampleStatus(SAMPLE_RESERVED);
        }

        // Optional file the user picked earlier → Attachment child of the Request
        if (pendingAttachment != null) {
            AttachmentModel attachment = instMan.addNewRecord(AttachmentModel.class);
            attachment.setFilePath(pendingAttachment.fileName);
            attachment.set(AttachmentData.bytes(pendingAttachment.bytes));
            request.add(Child.ref(attachment));
        }

        // Link the raising user's Sponsor Contact when we can find one
        C_SponsorContactModel sponsorContact = loadSponsorContactForCurrentUser();
        if (sponsorContact != null) {
            sponsorContact.add(Child.ref(request));
        }
        return request;
    }

    // Holds file bytes in memory until createRequisition turns them into an Attachment record
    private static final class PendingAttachment {
        private final String fileName;
        private final byte[] bytes;

        private PendingAttachment(String fileName, byte[] bytes) {
            this.fileName = fileName;
            this.bytes = bytes;
        }
    }

    /** Same lookup as B2S1-247's CreateSubmission: the contact whose username matches the current user. */
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
