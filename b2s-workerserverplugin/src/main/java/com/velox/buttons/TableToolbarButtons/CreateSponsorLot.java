/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.access.AccessType;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnTableToolbarContext;
import com.velox.api.plugin.invocation.context.TableToolbarContext;
import com.velox.plugin.materialsmanagement.manager.ConsumableConfigManager;
import com.velox.plugin.materialsmanagement.manager.DataStructureManager;
import com.velox.plugin.materialsmanagement.pojo.descriptor.ItemDescriptor;
import com.velox.plugin.materialsmanagement.pojo.descriptor.ParentDescriptor;
import com.velox.plugin.materialsmanagement.util.ConsumableUtil;
import com.velox.recordmodels.C_SponsorLotModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.PluginOrder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultTableToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Creates a Sponsor Lot under the viewed Part and a selected Project, with selected vials as children.
 *
 * @author Connor Skevington
 */
public class CreateSponsorLot extends DefaultTableToolbarPlugin {

    private static final double MINIMUM_THRESHOLD_FRACTION = 0.25;

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
     * Same visibility rules as materials-management {@code AddConsumableItems}, adapted for table toolbar:
     * the Part is {@link OnTableToolbarContext#getBaseDataRecord()} rather than the form record.
     */
    @Override
    public boolean onTableToolbar(OnTableToolbarContext ctx) throws Throwable {
        DataRecord baseDataRecord = ctx.getBaseDataRecord();
        if (baseDataRecord == null) {
            return false;
        }

        try {
            String partDataType = baseDataRecord.getDataTypeName();
            ConsumableConfigManager configMan = exemplarContext.getInstance(ConsumableConfigManager.class);

            if (!configMan.isParentDataType(partDataType)) {
                return false;
            } else if (!ConsumableUtil.isAccessible(partDataType, exemplarContext, AccessType.WRITE)) {
                return false;
            }

            ParentDescriptor parentDescriptor = configMan.getParentDescriptor(partDataType);
            if (parentDescriptor == null) {
                return false;
            }

            Collection<ItemDescriptor> itemDescriptors = configMan.getItemDescriptorsForParent(parentDescriptor);
            DataStructureManager dataStrMan = exemplarContext.getInstance(DataStructureManager.class);

            return !dataStrMan
                    .getAvailableAndAccessibleDataTypes(itemDescriptors, exemplarContext, AccessType.CREATE)
                    .isEmpty();
        } catch (Throwable e) {
            logError("Failed to check if '" + getLine1Text() + " " + getLine2Text() + "' should show.", e);
            return false;
        }
    }

    @Override
    protected PluginResult run(TableToolbarContext ctx) throws Throwable {
        try {
            DataRecord partRecord = ctx.getBaseDataRecord();
            if (partRecord == null) {
                clientCallback.displayError("Open this button from a Part record's Samples table.");
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
