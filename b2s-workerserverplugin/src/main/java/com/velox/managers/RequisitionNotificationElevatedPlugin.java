/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.ElevatedPrivilegePluginContext;
import com.velox.api.user.User;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.RequestModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultElevatedPrivilegePlugin;
import com.velox.sapio.commons.exemplar.recordmodel.main.RecordModelManager;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Sends shipment requisition / submission alerts with elevated privileges, after the triggering save
 * commits. Sponsor users can't list the members of B2S groups, so when a sponsor's save sent these
 * directly the recipient lookup came back empty and nothing went out. Callers queue one invocation per
 * alert kind with {@link #queue}; recipients and wording stay in {@link ShipmentRequisitionManager}.
 * Same pattern as cst-workers' ACLElevatedPrivilegePlugin.
 */
public class RequisitionNotificationElevatedPlugin extends DefaultElevatedPrivilegePlugin {

    public static final String KIND_SUBMITTED = "submitted";
    public static final String KIND_AWAITING_B2S = "awaitingB2S";
    public static final String KIND_AWAITING_SPONSOR = "awaitingSponsor";
    public static final String KIND_SHIPPED = "shipped";
    public static final String KIND_SUBMISSION = "submission";

    private static final Gson GSON = new GsonBuilder().create();

    /** Context payload passed through {@code user.addElevatedPrivilegeInvocation}. */
    public static class Payload {
        public String kind;
        public List<Long> requestRecordIds;

        public Payload() {
        }

        public Payload(String kind, List<Long> requestRecordIds) {
            this.kind = kind;
            this.requestRecordIds = requestRecordIds;
        }
    }

    /** Queues one alert of the given kind for these requests; it runs once the current save commits. */
    public static void queue(User user, String kind, List<RequestModel> requests) throws Throwable {
        if (CollectionUtils.isEmpty(requests)) {
            return;
        }
        List<Long> recordIds = new ArrayList<>();
        for (RequestModel request : requests) {
            recordIds.add(request.getRecordId());
        }
        user.addElevatedPrivilegeInvocation(RequisitionNotificationElevatedPlugin.class.getName(),
                GSON.toJson(new Payload(kind, recordIds)));
    }

    @Override
    protected PluginResult run(ElevatedPrivilegePluginContext ctx) throws Throwable {
        if (ctx.getContextData() == null) {
            return new PluginResult();
        }
        Payload payload = GSON.fromJson((String) ctx.getContextData(), Payload.class);
        if (payload == null || payload.kind == null || CollectionUtils.isEmpty(payload.requestRecordIds)) {
            return new PluginResult();
        }

        List<DataRecord> records = new ArrayList<>();
        for (Long recordId : payload.requestRecordIds) {
            if (recordId == null) {
                continue;
            }
            DataRecord record = dataRecordManager.querySystemForRecord(recordId, RequestModel.DATA_TYPE_NAME, user);
            if (record != null) {
                records.add(record);
            }
        }
        if (records.isEmpty()) {
            return new PluginResult();
        }
        List<RequestModel> requests = instMan.addExistingRecordsOfType(records, RequestModel.class);

        // No client session here: the manager only uses the callback for dialogs, not for alerts
        ShipmentRequisitionManager requisitionMan = new ShipmentRequisitionManager(null, exemplarContext);
        switch (payload.kind) {
            case KIND_SUBMITTED:
                requisitionMan.notifySubmitted(requests);
                break;
            case KIND_AWAITING_B2S:
                requisitionMan.notifyAwaitingB2SApproval(requests);
                break;
            case KIND_AWAITING_SPONSOR:
                requisitionMan.notifyAwaitingSponsorApproval(requests);
                break;
            case KIND_SHIPPED:
                requisitionMan.notifyShipped(requests);
                break;
            case KIND_SUBMISSION:
                exemplarContext.getInstance(RecordModelManager.class)
                        .getRelationshipManager().loadParents(requests, ProjectModel.class);
                for (RequestModel request : requests) {
                    ProjectModel project = request.get(Parent.ofType(ProjectModel.class));
                    if (project != null) {
                        requisitionMan.notifySubmissionCreated(request, project);
                    }
                }
                break;
            default:
                exemplarContext.getLogger().error("RequisitionNotificationElevatedPlugin: unknown kind " + payload.kind);
        }
        return new PluginResult(true);
    }
}
