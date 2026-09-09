/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.recordmodels;

import com.velox.sapio.commons.exemplar.recordmodel.annotation.ExemplarDataTypeModel;
import com.velox.sapio.commons.exemplar.recordmodel.record.AbstractRecordModelWrapper;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.util.time.DateRange;
/**
 * Automatically generated class for: Sample Receipt
 */
@ExemplarDataTypeModel(dataTypeName="SampleReceipt")
public class SampleReceiptModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SampleReceipt";

	/**
	 * <b>Data Field Name</b>: C_ReceiptCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Receipt Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___RECEIPT_CONDITION = "C_ReceiptCondition";

	/**
	 * <b>Data Field Name</b>: C_TemperatureExcursion<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Excursion<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___TEMPERATURE_EXCURSION = "C_TemperatureExcursion";

	/**
	 * <b>Data Field Name</b>: C_TemperatureMonitorPresent<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Monitor Present<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___TEMPERATURE_MONITOR_PRESENT = "C_TemperatureMonitorPresent";

	/**
	 * <b>Data Field Name</b>: CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String CREATED_BY = "CreatedBy";

	/**
	 * <b>Data Field Name</b>: DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String DATA_RECORD_NAME = "DataRecordName";

	/**
	 * <b>Data Field Name</b>: DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DATE_CREATED = "DateCreated";

	/**
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 */
	public static final String EXEMPLAR_SAMPLE_TYPE = "ExemplarSampleType";

	/**
	 * <b>Data Field Name</b>: FailureComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Comment<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a free text comment can be entered here.
	 */
	public static final String FAILURE_COMMENT = "FailureComment";

	/**
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 */
	public static final String OTHER_SAMPLE_ID = "OtherSampleId";

	/**
	 * <b>Data Field Name</b>: ReceivedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Received By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RECEIVED_BY = "ReceivedBy";

	/**
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RECEIVED_DATE = "ReceivedDate";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a reason can be selected here. This is a controlled vocabulary that can be edited through the List Manager.
	 */
	public static final String REJECTION_REASON = "RejectionReason";

	/**
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 */
	public static final String SAMPLE_ID = "SampleId";

	/**
	 * <b>Data Field Name</b>: SampleReceivedRejected<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Receipt Status<br/>
	 * <br/>
	 * <b>Description</b>: Whether the sample was Received or Rejected. Typically marking a sample as Received will cause process tracking to kick off for that sample. So then on submission of the Sample Receipt task, the sample will be marked as "Ready for - the first workflow in its process definition". If the received sample has no valid process assigned yet, then its status will just be "Received". Samples that are marked as "Rejected" will have their status reflect that and they will not proceed to become ready for any process workflows.
	 */
	public static final String SAMPLE_RECEIVED_REJECTED = "SampleReceivedRejected";

	/**
	 * <b>Data Field Name</b>: VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String VELOX_LAST_MODIFIED_BY = "VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String VELOX_LAST_MODIFIED_DATE = "VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity of sample received. This value will get mapped to the Volume field on the received sample.
	 */
	public static final String VOLUME = "Volume";

	protected SampleReceiptModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___RECEIPT_CONDITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReceiptCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Receipt Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReceiptCondition" field
	 */
	public String getC_ReceiptCondition() {
		return getField(C___RECEIPT_CONDITION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___RECEIPT_CONDITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReceiptCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Receipt Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReceiptCondition" field
	 */
	public void setC_ReceiptCondition(String value) {
		setField(C___RECEIPT_CONDITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___TEMPERATURE_EXCURSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TemperatureExcursion<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Excursion<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_TemperatureExcursion" field
	 */
	public Boolean getC_TemperatureExcursion() {
		return getField(C___TEMPERATURE_EXCURSION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___TEMPERATURE_EXCURSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TemperatureExcursion<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Excursion<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_TemperatureExcursion" field
	 */
	public void setC_TemperatureExcursion(Boolean value) {
		setField(C___TEMPERATURE_EXCURSION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___TEMPERATURE_MONITOR_PRESENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TemperatureMonitorPresent<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Monitor Present<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_TemperatureMonitorPresent" field
	 */
	public Boolean getC_TemperatureMonitorPresent() {
		return getField(C___TEMPERATURE_MONITOR_PRESENT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___TEMPERATURE_MONITOR_PRESENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TemperatureMonitorPresent<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Monitor Present<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_TemperatureMonitorPresent" field
	 */
	public void setC_TemperatureMonitorPresent(Boolean value) {
		setField(C___TEMPERATURE_MONITOR_PRESENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "CreatedBy" field
	 */
	public String getCreatedBy() {
		return getField(CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "DataRecordName" field
	 */
	public String getDataRecordName() {
		return getField(DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "DateCreated" field
	 */
	public Long getDateCreated() {
		return getField(DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXEMPLAR_SAMPLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @return the value stored on the "ExemplarSampleType" field
	 */
	public String getExemplarSampleType() {
		return getField(EXEMPLAR_SAMPLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #EXEMPLAR_SAMPLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @param value The value to set on the "ExemplarSampleType" field
	 */
	public void setExemplarSampleType(String value) {
		setField(EXEMPLAR_SAMPLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FAILURE_COMMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FailureComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Comment<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a free text comment can be entered here.
	 * 
	 * @return the value stored on the "FailureComment" field
	 */
	public String getFailureComment() {
		return getField(FAILURE_COMMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #FAILURE_COMMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FailureComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Comment<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a free text comment can be entered here.
	 * 
	 * @param value The value to set on the "FailureComment" field
	 */
	public void setFailureComment(String value) {
		setField(FAILURE_COMMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @return the value stored on the "OtherSampleId" field
	 */
	public String getOtherSampleId() {
		return getField(OTHER_SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @param value The value to set on the "OtherSampleId" field
	 */
	public void setOtherSampleId(String value) {
		setField(OTHER_SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RECEIVED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Received By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ReceivedBy" field
	 */
	public String getReceivedBy() {
		return getField(RECEIVED_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #RECEIVED_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Received By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ReceivedBy" field
	 */
	public void setReceivedBy(String value) {
		setField(RECEIVED_BY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RECEIVED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ReceivedDate" field
	 */
	public Long getReceivedDate() {
		return getField(RECEIVED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #RECEIVED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ReceivedDate" field
	 */
	public void setReceivedDate(Long value) {
		setField(RECEIVED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REJECTION_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a reason can be selected here. This is a controlled vocabulary that can be edited through the List Manager.
	 * 
	 * @return the value stored on the "RejectionReason" field
	 */
	public String getRejectionReason() {
		return getField(REJECTION_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #REJECTION_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: If Rejected was chosen for the status, a reason can be selected here. This is a controlled vocabulary that can be edited through the List Manager.
	 * 
	 * @param value The value to set on the "RejectionReason" field
	 */
	public void setRejectionReason(String value) {
		setField(REJECTION_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @return the value stored on the "SampleId" field
	 */
	public String getSampleId() {
		return getField(SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the received sample.
	 * 
	 * @param value The value to set on the "SampleId" field
	 */
	public void setSampleId(String value) {
		setField(SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_RECEIVED_REJECTED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleReceivedRejected<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Receipt Status<br/>
	 * <br/>
	 * <b>Description</b>: Whether the sample was Received or Rejected. Typically marking a sample as Received will cause process tracking to kick off for that sample. So then on submission of the Sample Receipt task, the sample will be marked as "Ready for - the first workflow in its process definition". If the received sample has no valid process assigned yet, then its status will just be "Received". Samples that are marked as "Rejected" will have their status reflect that and they will not proceed to become ready for any process workflows.
	 * 
	 * @return the value stored on the "SampleReceivedRejected" field
	 */
	public String getSampleReceivedRejected() {
		return getField(SAMPLE_RECEIVED_REJECTED);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_RECEIVED_REJECTED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleReceivedRejected<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Receipt Status<br/>
	 * <br/>
	 * <b>Description</b>: Whether the sample was Received or Rejected. Typically marking a sample as Received will cause process tracking to kick off for that sample. So then on submission of the Sample Receipt task, the sample will be marked as "Ready for - the first workflow in its process definition". If the received sample has no valid process assigned yet, then its status will just be "Received". Samples that are marked as "Rejected" will have their status reflect that and they will not proceed to become ready for any process workflows.
	 * 
	 * @param value The value to set on the "SampleReceivedRejected" field
	 */
	public void setSampleReceivedRejected(String value) {
		setField(SAMPLE_RECEIVED_REJECTED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "VeloxLastModifiedBy" field
	 */
	public String getVeloxLastModifiedBy() {
		return getField(VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "VeloxLastModifiedDate" field
	 */
	public Long getVeloxLastModifiedDate() {
		return getField(VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity of sample received. This value will get mapped to the Volume field on the received sample.
	 * 
	 * @return the value stored on the "Volume" field
	 */
	public Double getVolume() {
		return getField(VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity of sample received. This value will get mapped to the Volume field on the received sample.
	 * 
	 * @param value The value to set on the "Volume" field
	 */
	public void setVolume(Double value) {
		setField(VOLUME, value);
	}
}