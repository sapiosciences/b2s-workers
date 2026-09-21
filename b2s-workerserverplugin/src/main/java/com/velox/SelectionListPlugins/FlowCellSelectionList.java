/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.SelectionListPlugins;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.eln.experimententry.ExperimentEntry;
import com.velox.api.plugin.invocation.context.SelectionListContext;
import com.velox.api.servermanager.PickListManager;
import com.velox.recordmodels.ELNSampleDetailModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultSelectionListPlugin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Connor Skevington
 * 8/10/2026
 */
public class FlowCellSelectionList extends DefaultSelectionListPlugin {

    private ExperimentEntry entry;

    private static final String picklistName = "Flow Cell Lanes";

    @Override
    protected boolean shouldRun(SelectionListContext ctx) throws Throwable {

        //We must first check to see if the datatype and datafield equal Sample Detail and Flow Cell Lane Assigment.
        //That is the only field that this should run on.
        boolean isSampleDetail = ctx.getDataTypeName().contains(ELNSampleDetailModel.DATA_TYPE_NAME);
        boolean isFieldName = ctx.getDataFieldName().equals(ELNSampleDetailModel.FLOW_CELL_LANE_ASSIGMENT);

        //Next, we must ensure that there is actually an entry present so that we can retreive data from it.
        entry = ctx.getExperimentEntry();
        boolean entryExists = entry != null;

        return (isSampleDetail && isFieldName && entryExists);
    }

    @Override
    protected List<String> produceListValues(SelectionListContext ctx) throws Throwable {

        List<DataRecord> records = ctx.getNotebookExperiment().getDataRecordsForExperimentEntry(entry, user);

        List<ELNSampleDetailModel> sampleDetails = instMan.addExistingRecordsOfType(records, ELNSampleDetailModel.class);

        Set<String> usedLanes = new HashSet<>();
        for (ELNSampleDetailModel singleDetail : sampleDetails){
            usedLanes.add(singleDetail.getFlowCellLaneAssigment());
        }

        PickListManager pickListManager = exemplarContext.getDataMgmtServer().getPickListManager(user);

        List<String> fullPicklist = pickListManager.getPickListConfig(picklistName).getEntryList();

        List<String> remainingOptions = new ArrayList<>();

        for (String singleItem : fullPicklist){
            if (!usedLanes.contains(singleItem))
                remainingOptions.add(singleItem);
        }

        return remainingOptions;
    }
}
