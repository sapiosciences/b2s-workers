/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.clientcallback.InputDialogCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.directive.RefreshCurrentViewDirective;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.report.CustomReport;
import com.velox.api.report.ReportField;
import com.velox.api.report.ReportTerm;
import com.velox.api.util.InputDialogResult;
import com.velox.recordmodels.C_ShipmentBoxModel;
import com.velox.recordmodels.RequestModel;
import com.velox.recordmodels.SampleModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import com.velox.sapio.commons.recordmodels.ngs.StorageUnitModel;
import com.velox.sapio.commons.recordmodels.ngs.VeloxLocationModel;
import com.velox.sapio.commons.recordmodels.shippingreceiving.LocationGroupAssignmentModel;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Adds one or more shipment boxes to an approved or active Shipment Requisition.
 */
public class AddShipmentBox extends DefaultFormToolbarPlugin {

    private static final String SHIPMENT_REQUISITION = "Shipment Requisition";
    private static final Set<String> ALLOWED_REQUISITION_STATUSES =
            Set.of("Approved", "In Fulfilment", "Shipped");

    private static final String DEFAULT_LOCATION_NAME = "B2S";
    private static final String STORAGE_UNIT_TYPE = "Shipping Box";
    private static final String SHIPMENT_STATUS_PENDING = "Pending";

    private static final Set<String> SHIPMENT_BOX_TABLE_EXCLUDED_FIELDS = Set.of(
            C_ShipmentBoxModel.C___SHIPPED_DATE,
            C_ShipmentBoxModel.C___DELIVERED_DATE);

    private TemporaryDataType shipmentBoxEntryTemporaryDataType;

    @Override
    public String getDescription() {
        return "Add shipment boxes to this Shipment Requisition.";
    }

    @Override
    public String getLine1Text() {
        return "Add Shipment";
    }

    @Override
    public String getLine2Text() {
        return "Box";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "plus-circle-outline.svg");
    }

    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        if (!RequestModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName())
                || ctx.getDataRecord() == null) {
            return false;
        }

        RequestModel request =
                instMan.addExistingRecordOfType(ctx.getDataRecord(), RequestModel.class);
        return SHIPMENT_REQUISITION.equals(request.getC_RequestType())
                && ALLOWED_REQUISITION_STATUSES.contains(request.getC_RequisitionStatus());
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        try {
            RequestModel request =
                    instMan.addExistingRecordOfType(ctx.getDataRecord(), RequestModel.class);
            int boxCount = promptForBoxCount();
            List<C_ShipmentBoxModel> shipmentBoxes = promptForBoxDetails(request, boxCount);

            List<SampleModel> availableSamples = loadUnassignedRequestSamples(request);

            VeloxLocationModel location = resolveLocation();
            if (location == null) {
                clientCallback.displayError(
                        "No Location Group Assignment was found for the current group, and the B2S Location does not exist.");
                return new PluginResult(false);
            }

            List<String> storageUnitIds = allocateStorageUnitIds(request, boxCount);

            for (int index = 0; index < boxCount; index++) {
                int boxNumber = index + 1;
                List<SampleModel> selectedSamples =
                        promptForSamples(availableSamples, boxNumber, boxCount);
                availableSamples.removeAll(selectedSamples);

                StorageUnitModel storageUnit = attachStorageUnitAndRequest(
                        request,
                        location,
                        storageUnitIds.get(index),
                        shipmentBoxes.get(index));
                assignSamplesToStorageUnit(selectedSamples, storageUnit);
            }

            recMan.storeAndCommit(
                    "Add " + boxCount + " shipment box(es) to Request " + request.getRequestId());
            return new PluginResult(true, new RefreshCurrentViewDirective());
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(false);
        }
    }

    private int promptForBoxCount() throws Throwable {
        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Add Shipment Box")
                .message("How many boxes are in this batch?")
                .fieldDefinition(VeloxFieldDefinition.integerFieldBuilder()
                        .dataFieldName("BoxCount")
                        .displayName("Number of Boxes")
                        .minValue(1)
                        .defaultValue(1)
                        .required(true)
                        .build())
                .build());
        if (input == null || input.getValue() == null) {
            throw new UserRequestedCancelServerException();
        }

        int boxCount = ((Number) input.getValue()).intValue();
        if (boxCount < 1) {
            clientCallback.displayError("The number of boxes must be at least 1.");
            throw new UserRequestedCancelServerException();
        }
        return boxCount;
    }

    private List<C_ShipmentBoxModel> promptForBoxDetails(RequestModel request, int boxCount)
            throws Throwable {
        String defaultTracking = StringUtils.trimToNull(request.getC_TrackingNumber());
        TemporaryDataType temporaryDataType = getShipmentBoxEntryTemporaryDataType();

        List<C_ShipmentBoxModel> drafts = new ArrayList<>(boxCount);
        for (int boxNumber = 1; boxNumber <= boxCount; boxNumber++) {
            C_ShipmentBoxModel draft = instMan.addNewRecord(C_ShipmentBoxModel.class);
            draft.setC_BoxNumber((long) boxNumber);
            draft.setC_BoxCount((long) boxCount);
            if (defaultTracking != null) {
                draft.setC_ShipmentId(defaultTracking);
            }
            drafts.add(draft);
        }

        List<Map<String, Object>> result = clientCallback.showTableEntryDialog(
                "Add Shipment Boxes",
                "Enter tracking and carrier information. Blank Carrier cells use the first entered Carrier.",
                temporaryDataType,
                RecordModelUtil.getClonedFieldsList(drafts));
        if (result == null) {
            throw new UserRequestedCancelServerException();
        }
        if (result.size() != boxCount) {
            clientCallback.displayError("Exactly " + boxCount + " box rows are required.");
            throw new UserRequestedCancelServerException();
        }

        for (int index = 0; index < boxCount; index++) {
            drafts.get(index).setFields(result.get(index));
        }
        return drafts;
    }

    private List<SampleModel> loadUnassignedRequestSamples(RequestModel request) throws Throwable {
        relationshipMan.loadChildren(request, SampleModel.class);
        List<SampleModel> requestSamples =
                new ArrayList<>(request.get(Children.ofType(SampleModel.class)));
        if (requestSamples.isEmpty()) {
            return requestSamples;
        }

        Set<String> shipmentBoxStorageUnitIds = queryShipmentBoxStorageUnitIds(request);
        if (shipmentBoxStorageUnitIds.isEmpty()) {
            return requestSamples;
        }

        requestSamples.removeIf(sample -> {
            String storageLocation = StringUtils.trimToNull(sample.getStorageLocationBarcode());
            return storageLocation != null && shipmentBoxStorageUnitIds.contains(storageLocation);
        });
        return requestSamples;
    }

    private Set<String> queryShipmentBoxStorageUnitIds(RequestModel request) throws Throwable {
        relationshipMan.loadChildren(request, C_ShipmentBoxModel.class);
        Collection<C_ShipmentBoxModel> existingBoxes =
                request.get(Children.ofType(C_ShipmentBoxModel.class));
        if (existingBoxes.isEmpty()) {
            return Set.of();
        }

        List<Object> storageUnitRecordIds = existingBoxes.stream()
                .map(C_ShipmentBoxModel::getC_StorageUnit)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
        if (storageUnitRecordIds.isEmpty()) {
            return Set.of();
        }

        List<DataRecord> storageUnitRecords = dataRecordManager.queryDataRecords(
                StorageUnitModel.DATA_TYPE_NAME,
                StorageUnitModel.RECORD_ID,
                storageUnitRecordIds,
                user);
        if (storageUnitRecords == null || storageUnitRecords.isEmpty()) {
            return Set.of();
        }

        return instMan.addExistingRecordsOfType(storageUnitRecords, StorageUnitModel.class).stream()
                .map(StorageUnitModel::getStorageUnitId)
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.toSet());
    }

    private List<SampleModel> promptForSamples(
            List<SampleModel> availableSamples, int boxNumber, int boxCount) throws Throwable {
        if (availableSamples.isEmpty()) {
            return List.of();
        }

        DataTypeDefinition sampleDefinition = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(SampleModel.DATA_TYPE_NAME);
        TemporaryDataType temporaryDataType = sampleDefinition.getTemporaryDataType(user);
        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                "Select samples for Box " + boxNumber + " of " + boxCount,
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(temporaryDataType)
                        .multiSelect(true)
                        .records(RecordModelUtil.getClonedFieldsList(availableSamples))
                        .build(),
                user);
        if (selection == null || clientCallback.isAborted()) {
            throw new UserRequestedCancelServerException();
        }

        Map<Long, SampleModel> samplesById =
                RecordModelUtil.mapRecordsByFieldValue(availableSamples, SampleModel.RECORD_ID);
        Set<SampleModel> selectedSamples = new LinkedHashSet<>();
        for (Map<String, Object> row : selection) {
            Object recordId = row.get(SampleModel.RECORD_ID);
            if (recordId instanceof Number number) {
                SampleModel sample = samplesById.get(number.longValue());
                if (sample != null) {
                    selectedSamples.add(sample);
                }
            }
        }
        return new ArrayList<>(selectedSamples);
    }

    private void assignSamplesToStorageUnit(List<SampleModel> samples, StorageUnitModel storageUnit) {
        String storageUnitId = storageUnit.getStorageUnitId();
        String storageUnitPath = StringUtils.defaultIfBlank(storageUnit.getStorageUnitPath(), storageUnitId);
        for (SampleModel sample : samples) {
            sample.setStorageLocationBarcode(storageUnitId);
            sample.setStorageUnitPath(storageUnitPath);
        }
    }

    private TemporaryDataType getShipmentBoxEntryTemporaryDataType() throws Throwable {
        if (shipmentBoxEntryTemporaryDataType != null) {
            return shipmentBoxEntryTemporaryDataType;
        }
        DataTypeDefinition boxDefinition = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(C_ShipmentBoxModel.DATA_TYPE_NAME);
        TemporaryDataType temporaryDataType = boxDefinition.getTemporaryDataType(user);

        for (VeloxFieldDefinition<?> field : temporaryDataType.getVeloxFieldDefinitionList()) {
            if (field.isSystemField()
                    || SHIPMENT_BOX_TABLE_EXCLUDED_FIELDS.contains(field.getDataFieldName())) {
                field.setVisible(false);
            }
        }

        shipmentBoxEntryTemporaryDataType = temporaryDataType;
        return shipmentBoxEntryTemporaryDataType;
    }

    private List<String> allocateStorageUnitIds(RequestModel request, int boxCount) throws Throwable {
        if (StringUtils.isBlank(request.getRequestId())) {
            clientCallback.displayError("The Request must have a Request ID before boxes can be added.");
            throw new UserRequestedCancelServerException();
        }

        String boxIdPrefix = request.getRequestId() + "-B";
        long maxSequence = queryExistingStorageUnitIds(request.getRequestId()).stream()
                .filter(id -> id.startsWith(boxIdPrefix))
                .map(id -> id.substring(boxIdPrefix.length()))
                .filter(StringUtils::isNumeric)
                .mapToLong(Long::parseLong)
                .max()
                .orElse(0L);

        List<String> storageUnitIds = new ArrayList<>(boxCount);
        for (int index = 1; index <= boxCount; index++) {
            storageUnitIds.add(boxIdPrefix + (maxSequence + index));
        }
        return storageUnitIds;
    }

    private Set<String> queryExistingStorageUnitIds(String requestId) throws Throwable {
        CustomReport report = new CustomReport();
        report.addColumn(StorageUnitModel.DATA_TYPE_NAME, StorageUnitModel.STORAGE_UNIT_ID);
        report.addTerm(
                new ReportField(StorageUnitModel.DATA_TYPE_NAME, StorageUnitModel.STORAGE_UNIT_ID),
                ReportTerm.EQUAL_TO_OPERATOR,
                requestId + "*");

        List<DataRecord> matchingStorageUnits = dataMgmtServer.getCustomReportManager(user)
                .runCustomReportForRecords(report, user);
        if (matchingStorageUnits == null || matchingStorageUnits.isEmpty()) {
            return Set.of();
        }

        return instMan.addExistingRecordsOfType(matchingStorageUnits, StorageUnitModel.class).stream()
                .map(StorageUnitModel::getStorageUnitId)
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.toSet());
    }

    private VeloxLocationModel resolveLocation() throws Throwable {
        String groupName = getCurrentGroupName();
        List<DataRecord> assignmentRecords = dataRecordManager.queryDataRecords(
                LocationGroupAssignmentModel.DATA_TYPE_NAME,
                null,
                user);
        if (assignmentRecords != null && !assignmentRecords.isEmpty()) {
            List<LocationGroupAssignmentModel> assignments =
                    instMan.addExistingRecordsOfType(assignmentRecords, LocationGroupAssignmentModel.class);
            relationshipMan.loadParents(assignments, VeloxLocationModel.class);
            for (LocationGroupAssignmentModel assignment : assignments) {
                if (!groupName.equals(assignment.getUserGroupName())) {
                    continue;
                }
                VeloxLocationModel location = assignment.get(Parent.ofType(VeloxLocationModel.class));
                if (location != null) {
                    return location;
                }
            }
        }

        List<DataRecord> locationRecords = dataRecordManager.getAllRecordsOfType(
                VeloxLocationModel.DATA_TYPE_NAME,
                user);
        if (locationRecords == null || locationRecords.isEmpty()) {
            return null;
        }
        for (DataRecord locationRecord : locationRecords) {
            VeloxLocationModel location =
                    instMan.addExistingRecordOfType(locationRecord, VeloxLocationModel.class);
            if (DEFAULT_LOCATION_NAME.equals(location.getLocationName())) {
                return location;
            }
        }
        return null;
    }

    private StorageUnitModel attachStorageUnitAndRequest(
            RequestModel request,
            VeloxLocationModel location,
            String storageUnitId,
            C_ShipmentBoxModel shipmentBox) {
        StorageUnitModel storageUnit = instMan.addNewRecord(StorageUnitModel.class);
        storageUnit.setStorageUnitId(storageUnitId);
        storageUnit.setStorageUnitType(STORAGE_UNIT_TYPE);
        storageUnit.setIsActive(true);
        location.add(Child.ref(storageUnit));

        shipmentBox.setField(C_ShipmentBoxModel.DATA_RECORD_NAME, storageUnitId);
        shipmentBox.setC_Status(SHIPMENT_STATUS_PENDING);
        shipmentBox.setC_StorageUnit(storageUnit.getRecordId());
        request.add(Child.ref(shipmentBox));
        return storageUnit;
    }

    private String getCurrentGroupName() throws Throwable {
        return user.getUserGroup() == null ? "" : user.getUserGroup().getGroupName();
    }
}
