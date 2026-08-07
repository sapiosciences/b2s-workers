/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.workflows;
import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datarecord.AlreadyExists;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datarecord.IoError;
import com.velox.api.datarecord.NotFound;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.datatypelayout.DataTypeLayout;
import com.velox.api.datatype.datatypelayout.TableColumnDefinition;
import com.velox.api.datatype.datatypelayout.TableLayout;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.DataRecordFormDirective;
import com.velox.api.plugin.invocation.TableToolbarPlugin;
import com.velox.api.plugin.invocation.context.OnTableToolbarContext;
import com.velox.api.plugin.invocation.context.TableToolbarContext;
import com.velox.api.servermanager.DataTypeManager;
import com.velox.api.util.FormDialogCriteria;
import com.velox.api.util.PopupType;
import com.velox.api.util.ServerException;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.definition.datatype.DataTypeHelper;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import com.velox.sapio.commons.recordmodels.ba.AssayInstrumentConfigModel;
import com.velox.sapio.commons.recordmodels.ba.MasterAssayModel;
import com.velox.sapio.commons.recordmodels.ba.MasterAssayRunModel;
import com.velox.sapio.commons.recordmodels.ngs.StudyModel;
import com.velox.util.StringHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.*;
/**
 * @author Aryan Singh
 * 11/7/2025
 */
public class GlobalCreateAnalysisRunTableButton extends
        ExemplarVeloxServerPlugin<TableToolbarContext> implements TableToolbarPlugin {
    @Override
    public String getLine1Text() {
        return "Create";
    }
    @Override
    public String getLine2Text() {
        return "Analysis Run";
    }
    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "curve-cumulative.svg");
    }

    @Override
    protected PluginResult run(TableToolbarContext ctx) throws Throwable {
        DataTypeHelper dataTypeHelper = getInstance(DataTypeHelper.class);
        // get the selected samples
        List<DataRecord> sampleRecords = ctx.getDataRecordList();
        List<SampleModel> samples = instMan.addExistingRecordsOfType(sampleRecords, SampleModel.class);
        // get the single source study model if available
        relationshipMan.loadParents(samples, StudyModel.class);
        HashSet<StudyModel> studies = new HashSet<>();
        StudyModel study = null;
        for (SampleModel sample : samples) {
            StudyModel parentStudy = sample.get(Parent.ofType(StudyModel.class));
            if(parentStudy != null){
                studies.add(parentStudy);
            }
        }
        if(studies.size() == 1){
            study = studies.stream().toList().get(0);
        } else if (studies.isEmpty()) {
            clientCallback.displayPopup("Error", "No studies found associated with the selected samples", PopupType.Error);
            return new PluginResult(true);
        } else {
            DataTypeDefinition studyDefinition = getInstance(DataTypeManager.class).getDataTypeDefinition(StudyModel.DATA_TYPE_NAME);
            TemporaryDataType studyTempType = studyDefinition.getTemporaryDataType(user);
            List<Map<String, Object>> selectedStudy = clientCallback.showDataRecordSelectionDialog("Select the " + dataTypeHelper.getDisplayName(StudyModel.DATA_TYPE_NAME),
                    DataRecordSelectionCriteria.builder().temporaryDataType(studyTempType).multiSelect(false).records(RecordModelUtil.getClonedFieldsList(studies)).build(), user);
            if(selectedStudy == null || selectedStudy.isEmpty()){
                throw new UserRequestedCancelServerException();
            }
            Map<Long, StudyModel> studyByRecordId = RecordModelUtil.mapRecordsByFieldValue(studies, StudyModel.RECORD_ID);
            Long recordId = (Long)selectedStudy.get(0).get(StudyModel.RECORD_ID);
            if(recordId == null){
                clientCallback.displayPopup("No " + dataTypeHelper.getDisplayName(StudyModel.DATA_TYPE_NAME), "The selected " + dataTypeHelper.getDisplayName(StudyModel.DATA_TYPE_NAME) + " could not be found in the system.", PopupType.Warning);
                throw new IllegalStateException("The selected " + dataTypeHelper.getDisplayName(StudyModel.DATA_TYPE_NAME) + " could not be found in the system.");
            }
            study = studyByRecordId.get(recordId);
        }
        // get the master assay result, if multiple prompt  which assay result does it get linked to
        relationshipMan.loadChildren(study, MasterAssayModel.class);
        List<MasterAssayModel> masterAssayModels = new ArrayList<>(study.get(Children.ofType(MasterAssayModel.class)));
        MasterAssayModel masterAssay = null;
        if(masterAssayModels.isEmpty()){
            clientCallback.displayPopup("No " + dataTypeHelper.getPluralDisplayName(MasterAssayModel.DATA_TYPE_NAME),
                    "No " + dataTypeHelper.getPluralDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " linked to this " + dataTypeHelper.getDisplayName(com.velox.sapio.commons.recordmodels.ngs.StudyModel.DATA_TYPE_NAME), PopupType.Warning);
            throw new IllegalStateException("No " + dataTypeHelper.getPluralDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " linked to this " + dataTypeHelper.getDisplayName(com.velox.sapio.commons.recordmodels.ngs.StudyModel.DATA_TYPE_NAME));
        } else if(masterAssayModels.size() > 1){
            DataTypeDefinition masterAssayDefinition = getInstance(DataTypeManager.class).getDataTypeDefinition(MasterAssayModel.DATA_TYPE_NAME);
            if(masterAssayDefinition == null){
                clientCallback.displayPopup("No Master Assay Type Found", "No Master Assay data type exists in the system.", PopupType.Warning);
                throw new IllegalStateException("Cannot create an analysis run without a Master Assay.");
            }
            TemporaryDataType masterAssayTempType = masterAssayDefinition.getTemporaryDataType(user);
            List<TableColumnDefinition> tableColumnDefinitionList = new ArrayList<>();
            for(VeloxFieldDefinition field : masterAssayTempType.getVeloxFieldDefinitionList().stream().sorted(Comparator.comparing(VeloxFieldDefinition::getKeyFieldOrder)).toList()){
                if(field.isKeyField()){
                    tableColumnDefinitionList.add(TableColumnDefinition.builder().dataFieldName(field.getDataFieldName()).build());
                }
            }
            masterAssayTempType.getDataTypeLayout().setTableLayout(TableLayout.builder().tableColumnDefinitionList(tableColumnDefinitionList).build());
            List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog("Select the " + dataTypeHelper.getDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " to use for this run.",
                    DataRecordSelectionCriteria.builder().temporaryDataType(masterAssayTempType).multiSelect(false).records(RecordModelUtil.getClonedFieldsList(masterAssayModels)).build(), user);
            if(selection == null || selection.isEmpty()){
                throw new UserRequestedCancelServerException();
            }
            Map<Long, MasterAssayModel> masterAssayByRecordId = RecordModelUtil.mapRecordsByFieldValue(masterAssayModels, MasterAssayModel.RECORD_ID);
            Long recordId = (Long)selection.get(0).get(MasterAssayModel.RECORD_ID);
            if(recordId == null){
                clientCallback.displayPopup("No " + dataTypeHelper.getDisplayName(MasterAssayModel.DATA_TYPE_NAME), "The selected " + dataTypeHelper.getDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " could not be found in the system.", PopupType.Warning);
                throw new IllegalStateException("The selected " + dataTypeHelper.getDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " could not be found in the system.");
            }
            masterAssay = masterAssayByRecordId.get(recordId);
        } else {
            masterAssay = masterAssayModels.get(0);
        }
        // create the run model
        MasterAssayRunModel run = study.add(Child.ofType(MasterAssayRunModel.class));
        masterAssay.add(Child.ref(run));
        run.add(Children.refs(samples));
        run.setAssayRunType("Analysis");
        run.setAssayCategory(masterAssay.getAssayCategory());
        if(StringUtil.isNotBlank(masterAssay.getAssayInstrumentType())){
            run.setAssayInstrumentType(masterAssay.getAssayInstrumentType());
        }
        recMan.storeChanges();
        // prompt user
        run = promptForRunDetails(masterAssay, dataTypeHelper, run, "Create Analysis Run");
        // redirect user to the new model
        PluginResult pluginResult = new PluginResult();
        if(run != null) {
            pluginResult.setPassed(true);
            pluginResult.setPluginDirective(new DataRecordFormDirective(run.getDataRecord()));
        } else {
            pluginResult.setPassed(false);
        }
        return pluginResult;
    }
    @Override
    public boolean onTableToolbar(OnTableToolbarContext ctx) throws Throwable {
        // Show on sample tables
        if (ctx.getDataTypeName() == null){
            return false;
        }
        return StringUtils.equals(ctx.getDataTypeName(), SampleModel.DATA_TYPE_NAME);
    }
    protected byte[] getIcon(String iconPathInPackage) {
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(iconPathInPackage)) {
            if (inputStream == null) {
                return null; // Resource not found
            }
            return inputStream.readAllBytes();
        } catch (IOException e) {
            return null;
        }
    }
    public MasterAssayRunModel promptForRunDetails(MasterAssayModel masterAssayModel, DataTypeHelper dataTypeHelper, MasterAssayRunModel masterAssayRunModel, String dialogTitle) throws RemoteException, ServerException, NotFound, IoError, AlreadyExists {
        DataTypeDefinition dataTypeDefinition = getInstance(DataTypeManager.class).getDataTypeDefinition(MasterAssayRunModel.DATA_TYPE_NAME);
        DataTypeLayout layout = dataTypeDefinition.getDataTypeLayout("Sapio Bioanalysis create Master Assay Run Layout", user);
        if(layout == null){
            layout = dataTypeDefinition.getDefaultDataTypeLayout(user);
        }
        boolean promptComplete = false;
        boolean storeChange = false;
        do {
            storeChange = clientCallback.showFieldEntryDialog(masterAssayRunModel.getDataRecord(), FormDialogCriteria.builder().title(dialogTitle).dataTypeLayout(layout).isInitiallyMinimalView(false)
                    // CR-47684 Make the dialog wider to support wider labels of carryover.
                    .widthPercentage(0.85F).build(), user);
            if (storeChange) {
                String instrumentType = (String) masterAssayRunModel.getDataRecord().getDataField(MasterAssayRunModel.ASSAY_INSTRUMENT_TYPE, user);
                boolean isConcentration = "concentration".equalsIgnoreCase( (String)masterAssayRunModel.getDataRecord().getDataField(MasterAssayRunModel.INSTRUMENT_OUTPUT_DATA_TYPE, user));
                List<DataRecord> assayInstrumentConfigList = dataRecordManager.queryDataRecords(AssayInstrumentConfigModel.DATA_TYPE_NAME, AssayInstrumentConfigModel.ASSAY_INSTRUMENT_TYPE, Collections.singletonList(instrumentType), user);
                if (CollectionUtils.isNotEmpty(assayInstrumentConfigList)) {
                    List<AssayInstrumentConfigModel> configList = recMan.getInstanceManager().addExistingRecordsOfType(assayInstrumentConfigList, AssayInstrumentConfigModel.class);
                    if(isConcentration) {
                        boolean matchingConcentration = false;
                        boolean missingIsResponse = true;
                        for (AssayInstrumentConfigModel config : configList) {
                            // Assume the config matches if there are no units specified.
                            if (StringUtils.isBlank(config.getExpectedConcentrationUnits()) || StringHelper.trimEqualsIgnoreCase(config.getExpectedConcentrationUnits(), masterAssayModel.getConcentrationUnits())) {
                                matchingConcentration = true;
                                break;
                            }
                        }
                        // Restructure to support multiple checks
                        if(!matchingConcentration) {
                            boolean continueWithInstrumentType = clientCallback.showYesNoDialog("Concentration Unit Mismatch", "The selected instrument type '" + instrumentType
                                    + "' is not configured to support " + masterAssayModel.getConcentrationUnits() + " which is the concentration unit defined on the "
                                    + dataTypeHelper.getDisplayName(MasterAssayModel.DATA_TYPE_NAME) + " " + masterAssayModel.getMasterAssayName()
                                    + ".  Are you sure you would like to continue with this instrument type?", false);
                            if (continueWithInstrumentType) {
                                promptComplete = true;
                            }
                        } else {
                            promptComplete = true;
                        }
                    } else {
                        promptComplete = true;
                    }
                } else {
                    clientCallback.displayPopup("Instrument Not Configured", "There is no assay instrument configuration for " + instrumentType
                            + ". Without a configuration results cannot be loaded.", PopupType.Warning);
                }
            }
        } while (storeChange && !promptComplete);
        if(storeChange) {
            recMan.storeChanges();
            dataRecordManager.storeAndCommit("Storing Master Assay Run", clientCallback.getClientCallbackRMI(), user);
            return masterAssayRunModel;
        } else {
            dataRecordManager.rollbackChanges(user);
            return null;
        }
    }
}