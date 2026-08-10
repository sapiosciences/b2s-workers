/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox;

import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.servermanager.DataTypeManager;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.SampleModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.definition.datatype.DataTypeHelper;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RelationshipPath;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Connor Skevington
 * 8/10/2026
 */
public class ImportSponsorStudySamples extends DefaultFormToolbarPlugin {
    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        // Show only on Study record forms
        String datatype = ctx.getDataTypeName();
        if (datatype == null) {
            return false;
        }
        return StudyModel.DATA_TYPE_NAME.equals(datatype);
    }

    @Override
    public String getLine1Text() {
        return "Import";
    }

    @Override
    public String getLine2Text() {
        return "Samples";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "plus-circle-outline.svg");
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        try {
            StudyModel study = instMan.addExistingRecordOfType(ctx.getDataRecord(), StudyModel.class);

            String sponsorStudyNumber = study.getC_SponsorStudyNumber();
            if (StringUtils.isBlank(sponsorStudyNumber)) {
                clientCallback.displayWarning("This Study has no Sponsor Study Number set.");
                return new PluginResult(false);
            }

            List<SampleModel> projectSamples = loadProjectChildSamples(study);
            List<SampleModel> matchingSamples = querySamplesBySponsorStudyNumber(sponsorStudyNumber);
            List<SampleModel> existingStudySamples = loadExistingStudySamples(study);
            Set<SampleModel> candidateSamples =
                    combineCandidateSamples(projectSamples, matchingSamples, existingStudySamples);

            if (candidateSamples.isEmpty()) {
                clientCallback.displayWarning("No Samples were found under the parent Project or with a matching Sponsor Study Number.");
                return new PluginResult(false);
            }

            List<SampleModel> selectedSamples = promptForSampleSelection(candidateSamples, existingStudySamples);
            replaceStudySampleChildren(study, existingStudySamples, selectedSamples);
            recMan.storeAndCommit("Import sponsor study samples for Study " + study.getRecordId());

            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * Loads Study → parent Project → child Samples in a single relationship load.
     */
    private List<SampleModel> loadProjectChildSamples(StudyModel study) throws Throwable {
        relationshipMan.loadPath(List.of(study),
                RelationshipPath.parent(ProjectModel.class).child(SampleModel.class));
        ProjectModel project = study.get(Parent.ofType(ProjectModel.class));
        if (project == null) {
            return List.of();
        }
        return new ArrayList<>(project.get(Children.ofType(SampleModel.class)));
    }

    private List<SampleModel> querySamplesBySponsorStudyNumber(String sponsorStudyNumber) throws Throwable {
        List<DataRecord> matchingSampleRecords = dataRecordManager.queryDataRecords(
                SampleModel.DATA_TYPE_NAME,
                SampleModel.C___SPONSOR_STUDY_NUMBER,
                Collections.singletonList(sponsorStudyNumber),
                user);
        if (matchingSampleRecords == null || matchingSampleRecords.isEmpty()) {
            return List.of();
        }
        return instMan.addExistingRecordsOfType(matchingSampleRecords, SampleModel.class);
    }

    /**
     * Existing study children are needed for preselection and must appear in the dialog list.
     */
    private List<SampleModel> loadExistingStudySamples(StudyModel study) throws Throwable {
        relationshipMan.loadChildren(study, SampleModel.class);
        return new ArrayList<>(study.get(Children.ofType(SampleModel.class)));
    }

    private static Set<SampleModel> combineCandidateSamples(
            List<SampleModel> projectSamples,
            List<SampleModel> matchingSamples,
            List<SampleModel> existingStudySamples) {
        Set<SampleModel> candidateSamples = new LinkedHashSet<>();
        candidateSamples.addAll(projectSamples);
        candidateSamples.addAll(matchingSamples);
        candidateSamples.addAll(existingStudySamples);
        return candidateSamples;
    }

    private List<SampleModel> promptForSampleSelection(
            Set<SampleModel> candidateSamples,
            List<SampleModel> existingStudySamples) throws Throwable {
        DataTypeHelper dataTypeHelper = getInstance(DataTypeHelper.class);
        DataTypeDefinition sampleDefinition =
                getInstance(DataTypeManager.class).getDataTypeDefinition(SampleModel.DATA_TYPE_NAME);
        TemporaryDataType sampleTempType = sampleDefinition.getTemporaryDataType(user);

        List<Long> preselectedRecordIds = existingStudySamples.stream()
                .map(SampleModel::getRecordId)
                .collect(Collectors.toCollection(ArrayList::new));

        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                "Select " + dataTypeHelper.getPluralDisplayName(SampleModel.DATA_TYPE_NAME)
                        + " to link to this " + dataTypeHelper.getDisplayName(StudyModel.DATA_TYPE_NAME),
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(sampleTempType)
                        .multiSelect(true)
                        .records(RecordModelUtil.getClonedFieldsList(candidateSamples))
                        .preselectedRecordIds(preselectedRecordIds)
                        .build(),
                user);

        if (selection == null || clientCallback.isAborted()) {
            throw new UserRequestedCancelServerException();
        }

        return resolveSelectedSamples(selection, candidateSamples);
    }

    private static List<SampleModel> resolveSelectedSamples(
            List<Map<String, Object>> selection,
            Set<SampleModel> candidateSamples) {
        Map<Long, SampleModel> samplesByRecordId =
                RecordModelUtil.mapRecordsByFieldValue(candidateSamples, SampleModel.RECORD_ID);
        List<SampleModel> selectedSamples = new ArrayList<>();
        for (Map<String, Object> row : selection) {
            Object recordIdObj = row.get(SampleModel.RECORD_ID);
            if (!(recordIdObj instanceof Number)) {
                continue;
            }
            SampleModel sample = samplesByRecordId.get(((Number) recordIdObj).longValue());
            if (sample != null) {
                selectedSamples.add(sample);
            }
        }
        return selectedSamples;
    }

    /**
     * Removes all existing Sample children from the study, then adds exactly {@code selectedSamples}.
     */
    private static void replaceStudySampleChildren(
            StudyModel study,
            List<SampleModel> existingStudySamples,
            List<SampleModel> selectedSamples) {
        if (!existingStudySamples.isEmpty()) {
            study.remove(Children.refs(existingStudySamples));
        }
        if (!selectedSamples.isEmpty()) {
            study.add(Children.refs(selectedSamples));
        }
    }
}
