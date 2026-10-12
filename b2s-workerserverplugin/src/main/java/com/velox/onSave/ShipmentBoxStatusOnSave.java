/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.onSave;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnSaveContext;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultOnSavePlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.recordmodels.ngs.StorageUnitModel;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * B2S1-246: side effects of a Shipment Box status change (Mark Sent / Mark Delivered).
 *
 * <ul>
 *   <li>Box → In Transit: the vials packed in the box's Storage Unit become Sample Status "Shipped" and are
 *       added under the box. The Request moves to Shipped if it is Approved or In Fulfilment.</li>
 *   <li>Box → Delivered: the box's Storage Unit is set inactive. The Request moves to Delivered once every box
 *       under it is Delivered.</li>
 * </ul>
 *
 * <p>The Request status is written in its own commit after the box-side changes, because B2S1-244's
 * RequisitionStatusOnSave checks Shipped / Delivered against the boxes.
 */
public class ShipmentBoxStatusOnSave extends DefaultOnSavePlugin {

    private static final String SHIPMENT_REQUISITION = "Shipment Requisition";

    private static final String BOX_IN_TRANSIT = "In Transit";
    private static final String BOX_DELIVERED = "Delivered";

    private static final String SAMPLE_SHIPPED = "Shipped";

    private static final String REQUEST_APPROVED = "Approved";
    private static final String REQUEST_IN_FULFILMENT = "In Fulfilment";
    private static final String REQUEST_SHIPPED = "Shipped";
    private static final String REQUEST_DELIVERED = "Delivered";

    // Boxes from the current save whose status just changed to In Transit or Delivered — filled in by shouldRun()
    private List<C_ShipmentBoxModel> changedBoxes;

    @Override
    protected boolean shouldRun(OnSaveContext ctx) throws Throwable {
        List<DataRecord> boxRecords = new ArrayList<>();
        for (DataRecord record : ctx.getDataRecordList()) {
            if (!C_ShipmentBoxModel.DATA_TYPE_NAME.equals(record.getDataTypeName())
                    || !record.isChanged(C_ShipmentBoxModel.C___STATUS)) {
                continue;
            }
            String newStatus = record.getStringVal(C_ShipmentBoxModel.C___STATUS, user);
            if (BOX_IN_TRANSIT.equals(newStatus) || BOX_DELIVERED.equals(newStatus)) {
                boxRecords.add(record);
            }
        }
        if (boxRecords.isEmpty()) {
            return false;
        }
        changedBoxes = instMan.addExistingRecordsOfType(boxRecords, C_ShipmentBoxModel.class);
        return true;
    }

    @Override
    protected PluginResult run(OnSaveContext ctx) throws Throwable {
        relationshipMan.loadParents(changedBoxes, RequestModel.class);

        Set<RequestModel> requests = new LinkedHashSet<>();
        for (C_ShipmentBoxModel box : changedBoxes) {
            RequestModel request = box.get(Parent.ofType(RequestModel.class));
            // Only Shipment Requisitions (B2S1-243) carry the requisition lifecycle.
            if (request == null || !SHIPMENT_REQUISITION.equals(request.getC_RequestType())) {
                continue;
            }
            requests.add(request);

            if (BOX_IN_TRANSIT.equals(box.getC_Status())) {
                markPackedSamplesShipped(request, box);
            } else {
                deactivateStorageUnit(box);
            }
        }
        if (requests.isEmpty()) {
            return new PluginResult(true);
        }
        recMan.storeChanges();

        // Separate commit so B2S1-244's status check sees the box changes above.
        boolean requestChanged = false;
        for (RequestModel request : requests) {
            requestChanged |= rollUpRequestStatus(request);
        }
        if (requestChanged) {
            recMan.storeChanges();
        }
        return new PluginResult(true);
    }

    /**
     * The vials in a box are the Request's Samples whose storage location is the box's Storage Unit
     * (set by Add Shipment Box or the standard storage tools).
     */
    private void markPackedSamplesShipped(RequestModel request, C_ShipmentBoxModel box) throws Throwable {
        String storageUnitId = getStorageUnitId(box);
        if (storageUnitId == null) {
            return;
        }
        relationshipMan.loadChildren(request, SampleModel.class);
        for (SampleModel sample : request.get(Children.ofType(SampleModel.class))) {
            if (storageUnitId.equals(StringUtils.trimToNull(sample.getStorageLocationBarcode()))) {
                sample.setExemplarSampleStatus(SAMPLE_SHIPPED);
                // Lets the sponsor see which vials were in which box.
                box.add(Child.ref(sample));
            }
        }
    }

    /** A delivered shipping box can't be packed again. */
    private void deactivateStorageUnit(C_ShipmentBoxModel box) throws Throwable {
        String storageUnitId = getStorageUnitId(box);
        if (storageUnitId == null) {
            return;
        }
        List<DataRecord> storageUnitRecords = dataRecordManager.queryDataRecords(
                StorageUnitModel.DATA_TYPE_NAME,
                StorageUnitModel.STORAGE_UNIT_ID,
                List.of(storageUnitId),
                user);
        if (storageUnitRecords == null) {
            return;
        }
        for (StorageUnitModel storageUnit :
                instMan.addExistingRecordsOfType(storageUnitRecords, StorageUnitModel.class)) {
            storageUnit.setIsActive(false);
        }
    }

    /**
     * First box out → Shipped (from Approved or In Fulfilment); last box delivered → Delivered (from Shipped).
     *
     * @return true when the Request status was changed
     */
    private boolean rollUpRequestStatus(RequestModel request) throws Throwable {
        relationshipMan.loadChildren(request, C_ShipmentBoxModel.class);
        List<C_ShipmentBoxModel> boxes = new ArrayList<>(request.get(Children.ofType(C_ShipmentBoxModel.class)));
        String requestStatus = request.getC_RequisitionStatus();

        boolean anyBoxSent = boxes.stream()
                .anyMatch(box -> BOX_IN_TRANSIT.equals(box.getC_Status()) || BOX_DELIVERED.equals(box.getC_Status()));
        boolean allBoxesDelivered = !boxes.isEmpty()
                && boxes.stream().allMatch(box -> BOX_DELIVERED.equals(box.getC_Status()));

        if (anyBoxSent && (REQUEST_APPROVED.equals(requestStatus) || REQUEST_IN_FULFILMENT.equals(requestStatus))) {
            request.setC_RequisitionStatus(REQUEST_SHIPPED);
            return true;
        }
        if (allBoxesDelivered && REQUEST_SHIPPED.equals(requestStatus)) {
            request.setC_RequisitionStatus(REQUEST_DELIVERED);
            return true;
        }
        return false;
    }

    /**
     * Prefer the identifier field; boxes made before it existed carry the Storage Unit ID as their record name.
     */
    private static String getStorageUnitId(C_ShipmentBoxModel box) {
        String storageUnitId = StringUtils.trimToNull(box.getC_StorageUnitId());
        if (storageUnitId == null) {
            Object recordName = box.getField(C_ShipmentBoxModel.DATA_RECORD_NAME);
            storageUnitId = recordName == null ? null : StringUtils.trimToNull(recordName.toString());
        }
        return storageUnitId;
    }
}
