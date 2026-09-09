/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.OnTableToolbarContext;
import com.velox.api.plugin.invocation.context.TableToolbarContext;
import com.velox.api.servermanager.DataTypeManager;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.SampleModel;
import com.velox.recordmodels.SampleReceiptModel;
import com.velox.sapio.commons.collection.iterable.IterableUtil;
import com.velox.sapio.commons.exemplar.definition.datatype.DataTypeHelper;
import com.velox.sapio.commons.exemplar.layout.SapioDefaultLayoutUtil;
import com.velox.sapio.commons.exemplar.plugin.PluginOrder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultTableToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.SideLink;
import com.velox.sapio.commons.recordmodels.ngs.SampleRegistrationModel;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Table toolbar button on the Samples table of a Sample Registration layout.
 * Mirrors baseline "Receive Samples" IDV behavior, but persists all SampleReceipt
 * fields returned from the receipt dialog (not only a hardcoded whitelist).
 *
 * @author Connor Skevington
 */
public class CustomSampleRegistration extends DefaultTableToolbarPlugin {

	private static final String STATUS_LOGGED = "Logged";
	private static final String STATUS_AVAILABLE = "Available";
	private static final String STATUS_RECEIVED = "Received";
	private static final String STATUS_REJECTED = "Rejected";

	@Override
	public String getLine1Text() {
		return "Receive";
	}

	@Override
	public String getLine2Text() {
		return "Samples";
	}

	@Override
	public String getDescription() {
		return "Receive one or more registered samples into the system (saves all Sample Receipt fields from the dialog).";
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
	 * Show on Sample tables when the base record is a Sample Registration
	 * (e.g. the "Sample Registration Samples" search on that layout).
	 */
	@Override
	public boolean onTableToolbar(OnTableToolbarContext ctx) throws Throwable {
		if (ctx.getDataTypeName() == null
				|| !SampleModel.DATA_TYPE_NAME.equalsIgnoreCase(ctx.getDataTypeName())) {
			return false;
		}

		DataRecord baseDataRecord = ctx.getBaseDataRecord();
		return baseDataRecord != null
				&& SampleRegistrationModel.DATA_TYPE_NAME.equalsIgnoreCase(baseDataRecord.getDataTypeName());
	}

	@Override
	protected PluginResult run(TableToolbarContext ctx) throws Throwable {
		try {
			List<SampleModel> samplesToReceive = resolveSamplesToReceive(ctx);
			if (IterableUtil.isBlank(samplesToReceive)) {
				clientCallback.displayPopup("No Samples",
						"There are no " + getInstance(DataTypeHelper.class).getPluralDisplayName(SampleModel.DATA_TYPE_NAME)
								+ " eligible for receiving",
						PopupType.Warning);
				return new PluginResult(false);
			}

			List<SampleReceiptModel> sampleReceipts = receiveSamples(samplesToReceive);
			recMan.storeAndCommit("Received Samples");

			finishReceiving(sampleReceipts);
			recMan.storeAndCommit("Stored Samples");

			return new PluginResult(true);
		} catch (UserRequestedCancelServerException e) {
			return new PluginResult(true);
		}
	}

	/**
	 * Prefer selected Sample rows; otherwise load all samples linked to the Sample Registration.
	 * Only Logged/Available samples are eligible.
	 */
	private List<SampleModel> resolveSamplesToReceive(TableToolbarContext ctx) throws Throwable {
		List<SampleModel> samplesToReceive = new ArrayList<>();

		List<DataRecord> dataRecordList = ctx.getDataRecordList();
		if (!IterableUtil.isBlank(dataRecordList)
				&& SampleModel.DATA_TYPE_NAME.equalsIgnoreCase(dataRecordList.get(0).getDataTypeName())) {
			samplesToReceive.addAll(instMan.addExistingRecordsOfType(dataRecordList, SampleModel.class));
		}

		DataRecord baseDataRecord = ctx.getBaseDataRecord();
		if (IterableUtil.isBlank(samplesToReceive) && baseDataRecord != null
				&& SampleRegistrationModel.DATA_TYPE_NAME.equalsIgnoreCase(baseDataRecord.getDataTypeName())) {
			RecordModel sampleRegistrationRec = instMan.addExistingRecord(baseDataRecord);
			relationshipMan.loadReverseSideLinks(Collections.singleton(sampleRegistrationRec),
					SampleModel.DATA_TYPE_NAME, SampleModel.SAMPLE_REGISTRATION_LINK);
			samplesToReceive.addAll(sampleRegistrationRec.get(
					SideLink.ofReverseLinks(SampleModel.class, SampleModel.SAMPLE_REGISTRATION_LINK)));
		}

		samplesToReceive.removeIf(sample -> !isEligibleForReceiving(sample));
		return samplesToReceive;
	}

	private static boolean isEligibleForReceiving(SampleModel sample) {
		String status = sample.getExemplarSampleStatus();
		return STATUS_LOGGED.equalsIgnoreCase(status) || STATUS_AVAILABLE.equalsIgnoreCase(status);
	}

	/**
	 * Prompt for receipt details and create SampleReceipt children, copying every
	 * non-system SampleReceipt field present in the dialog result.
	 */
	private List<SampleReceiptModel> receiveSamples(List<SampleModel> samplesToReceive) throws Throwable {
		Map<Long, SampleModel> sampleByRecordIdMap = new HashMap<>();
		List<Map<String, Object>> receivingSampleMapList = new ArrayList<>();
		for (SampleModel sample : samplesToReceive) {
			Map<String, Object> fieldMap = new HashMap<>();
			fieldMap.putAll(sample.getFields());
			fieldMap.put(SampleReceiptModel.RECEIVED_BY, user.getUsername());
			fieldMap.put(SampleReceiptModel.RECEIVED_DATE, System.currentTimeMillis());
			fieldMap.put(SampleReceiptModel.SAMPLE_RECEIVED_REJECTED, STATUS_RECEIVED);
			receivingSampleMapList.add(fieldMap);
			sampleByRecordIdMap.put(sample.getRecordId(), sample);
		}

		String pluralName = getInstance(DataTypeHelper.class).getPluralDisplayName(SampleModel.DATA_TYPE_NAME);
		TemporaryDataType receivingType =
				SapioDefaultLayoutUtil.getDefaultTemporaryDataType(SampleReceiptModel.DATA_TYPE_NAME, exemplarContext);
		List<Map<String, Object>> enteredValueMapList = clientCallback.showTableEntryDialog(
				"Receive " + pluralName,
				"Enter receipt details for these " + pluralName,
				receivingType,
				receivingSampleMapList);
		if (CollectionUtils.isEmpty(enteredValueMapList)) {
			throw new UserRequestedCancelServerException();
		}

		DataTypeDefinition receiptDtDef =
				getInstance(DataTypeManager.class).getDataTypeDefinition(SampleReceiptModel.DATA_TYPE_NAME);
		Map<String, VeloxFieldDefinition<?>> receiptFieldDefs =
				receiptDtDef.getVeloxFieldDefinitionMapWithExtensions(user);

		List<SampleReceiptModel> receipts = new ArrayList<>();
		for (Map<String, Object> fieldMap : enteredValueMapList) {
			Long recordId = (Long) fieldMap.get(SampleModel.RECORD_ID);
			SampleModel sample = sampleByRecordIdMap.get(recordId);
			if (sample == null) {
				throw new IllegalStateException("Sample not found for record ID: " + recordId);
			}

			SampleReceiptModel receipt = sample.add(Child.ofType(SampleReceiptModel.class));
			receipts.add(receipt);

			applyAllReceiptFields(receipt, fieldMap, receiptFieldDefs);

			// Keep sample identity fields authoritative from the source sample.
			receipt.setSampleId(sample.getSampleId());
			receipt.setOtherSampleId(sample.getOtherSampleId());
			receipt.setExemplarSampleType(sample.getExemplarSampleType());
		}

		return receipts;
	}

	/**
	 * Persist every non-system SampleReceipt field returned by the dialog.
	 * Sample fields that happen to share names are ignored unless they are also SampleReceipt fields.
	 */
	private static void applyAllReceiptFields(
			SampleReceiptModel receipt,
			Map<String, Object> fieldMap,
			Map<String, VeloxFieldDefinition<?>> receiptFieldDefs) {
		for (Map.Entry<String, Object> entry : fieldMap.entrySet()) {
			String fieldName = entry.getKey();
			VeloxFieldDefinition<?> fieldDef = receiptFieldDefs.get(fieldName);
			if (fieldDef == null || fieldDef.isSystemField()) {
				continue;
			}
			receipt.setField(fieldName, entry.getValue());
		}
	}

	/**
	 * Update sample statuses from receipt Received/Rejected values (IDV path skips storage prompt).
	 */
	private void finishReceiving(List<SampleReceiptModel> receipts) throws Throwable {
		relationshipMan.loadParents(receipts, SampleModel.class);

		DataTypeDefinition sampleDef =
				getInstance(DataTypeManager.class).getDataTypeDefinition(SampleModel.DATA_TYPE_NAME);

		for (SampleReceiptModel receipt : receipts) {
			SampleModel sample = receipt.get(Parent.ofType(SampleModel.class));
			if (sample == null) {
				clientCallback.displayWarning("No " + sampleDef.getDisplayName(user)
						+ " found for receipt \"" + receipt.getSampleId() + "\"");
				continue;
			}

			String receiptStatus = receipt.getSampleReceivedRejected();
			if (STATUS_RECEIVED.equalsIgnoreCase(receiptStatus)) {
				if (STATUS_LOGGED.equalsIgnoreCase(sample.getExemplarSampleStatus())) {
					sample.setExemplarSampleStatus(STATUS_RECEIVED);
				} else if (StringUtils.isBlank(sample.getExemplarSampleStatus())
						|| STATUS_AVAILABLE.equalsIgnoreCase(sample.getExemplarSampleStatus())) {
					sample.setExemplarSampleStatus(STATUS_RECEIVED);
				} else if (!StringUtils.containsIgnoreCase(sample.getExemplarSampleStatus(), STATUS_RECEIVED)) {
					sample.setExemplarSampleStatus(STATUS_RECEIVED);
				}
			} else {
				sample.setExemplarSampleStatus(
						StringUtils.defaultIfBlank(receiptStatus, STATUS_REJECTED));
			}
		}
	}
}
