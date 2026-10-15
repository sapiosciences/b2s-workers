/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.recordmodels.C_SponsorLotModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.PluginOrder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Creates a Sponsor Lot under the viewed Part and a selected Project, with selected vials as children.
 *
 * @author Connor Skevington
 */
public class CreateSponsorLot extends DefaultFormToolbarPlugin {

    private static final double MINIMUM_THRESHOLD_FRACTION = 0.25;

    // ExemplarConfig stores consumable mappings as: Part ::: Sample ::: Item (one per line)
    private static final String EXEMPLAR_CONFIG_DATA_TYPE = "ExemplarConfig";
    private static final String CONSUMABLE_DATA_TYPES_FIELD = "ConsumableDataTypes";
    private static final String CONSUMABLE_DATA_TYPE_SEGMENT_DELIMITER = " ::: ";

    @Override
    public String getLine1Text() {
        return "Create";
    }

    @Override
    public String getLine2Text() {
        return "Sponsor Lot";
    }

    @Override
    public String getDescription() {
        return "Allocate vials from this Part into a new Sponsor Lot under a Project.";
    }

    @Override
    public int getOrder() {
        return PluginOrder.MIDDLE.getOrder();
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "plus-circle-outline.svg");
    }

    /**
     * Show when the open form's data type is an MM Part (first segment of
     * ExemplarConfig.ConsumableDataTypes). Restricted workers cannot load MM classes.
     */
    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        String dataTypeName = ctx.getDataTypeName();
        return dataTypeName != null && getPartDataTypes().contains(dataTypeName);
    }

    /** Part data type names from ExemplarConfig.ConsumableDataTypes. */
    private Set<String> getPartDataTypes() throws Throwable {
        Set<String> partTypes = new HashSet<>();
        List<DataRecord> configRecords =
                dataRecordManager.getAllRecordsOfType(EXEMPLAR_CONFIG_DATA_TYPE, user);
        if (configRecords == null || configRecords.size() != 1) {
            return partTypes;
        }

        RecordModel config = instMan.addExistingRecord(configRecords.get(0));
        Object raw = config.getField(CONSUMABLE_DATA_TYPES_FIELD);
        String consumableDataTypes = raw == null ? null : raw.toString();
        if (consumableDataTypes == null || consumableDataTypes.isBlank()) {
            return partTypes;
        }

        for (String line : consumableDataTypes.lines().toList()) {
            String trimmed = line.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            String[] segments = trimmed.split(CONSUMABLE_DATA_TYPE_SEGMENT_DELIMITER, -1);
            if (segments.length < 1) {
                continue;
            }
            String partDataType = segments[0].trim();
            if (!partDataType.isEmpty()) {
                partTypes.add(partDataType);
            }
        }
        return partTypes;
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        try {
            DataRecord partRecord = ctx.getDataRecord();
            if (partRecord == null) {
                clientCallback.displayError("Open this button from a Part record form.");
                return new PluginResult(false);
            }
            RecordModel part = instMan.addExistingRecord(partRecord);

            ProjectModel project = promptForProject();

            List<SampleModel> vials = loadPartVials(part);
            if (vials.isEmpty()) {
                clientCallback.displayError("This Part has no child vials to allocate.");
                return new PluginResult(false);
            }

            List<SampleModel> selectedVials = promptForVials(vials);
            if (selectedVials.isEmpty()) {
                clientCallback.displayError("Select at least one vial to allocate.");
                return new PluginResult(false);
            }

            createSponsorLot(project, part, selectedVials);
            recMan.storeAndCommit(
                    "Created Sponsor Lot under Project "
                            + project.getRecordId()
                            + " with "
                            + selectedVials.size()
                            + " vial(s)");
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
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
                    "Select the Project for this Sponsor Lot",
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

    private List<SampleModel> loadPartVials(RecordModel part) throws Throwable {
        relationshipMan.loadChildren(part, SampleModel.class);
        return new ArrayList<>(part.get(Children.ofType(SampleModel.class)));
    }

    private List<SampleModel> promptForVials(List<SampleModel> vials) throws Throwable {
        DataTypeDefinition sampleDefinition =
                dataMgmtServer.getDataTypeManager(user).getDataTypeDefinition(SampleModel.DATA_TYPE_NAME);
        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                "Select the vials to allocate",
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(sampleDefinition.getTemporaryDataType(user))
                        .multiSelect(true)
                        .records(RecordModelUtil.getClonedFieldsList(vials))
                        .build(),
                user);
        if (selection == null || clientCallback.isAborted()) {
            throw new UserRequestedCancelServerException();
        }

        Map<Long, SampleModel> byId = vials.stream()
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

    private void createSponsorLot(ProjectModel project, RecordModel part, List<SampleModel> selectedVials)
            throws Throwable {
        double totalVolume = 0.0;
        for (SampleModel vial : selectedVials) {
            Double volume = vial.getVolume();
            if (volume != null) {
                totalVolume += volume;
            }
        }

        C_SponsorLotModel sponsorLot = instMan.addNewRecord(C_SponsorLotModel.class);
        sponsorLot.setC_Volume(totalVolume);
        sponsorLot.setC_MinimumThreshold(totalVolume * MINIMUM_THRESHOLD_FRACTION);

        // Project → Lot ← Part; Lot → selected vials
        project.add(Child.ref(sponsorLot));
        part.add(Child.ref(sponsorLot));
        sponsorLot.add(Children.refs(selectedVials));
    }
}
