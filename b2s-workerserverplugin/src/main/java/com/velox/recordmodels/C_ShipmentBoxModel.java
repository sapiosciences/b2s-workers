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

/**
 * Automatically generated class for: Shipment Box
 */
@ExemplarDataTypeModel(dataTypeName="C_ShipmentBox")
public class C_ShipmentBoxModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_ShipmentBox";

	/**
	 * <b>Data Field Name</b>: C_BoxCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Count<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___BOX_COUNT = "C_BoxCount";

	/**
	 * <b>Data Field Name</b>: C_BoxNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___BOX_NUMBER = "C_BoxNumber";

	/**
	 * <b>Data Field Name</b>: C_Carrier<br/>
	 * <br/>
	 * <b>Display Name</b>: Carrier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___CARRIER = "C_Carrier";

	/**
	 * <b>Data Field Name</b>: C_DeliveredDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Delivered Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___DELIVERED_DATE = "C_DeliveredDate";

	/**
	 * <b>Data Field Name</b>: C_ShipmentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipment ID (Tracking #)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SHIPMENT_ID = "C_ShipmentId";

	/**
	 * <b>Data Field Name</b>: C_ShippedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipped Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SHIPPED_DATE = "C_ShippedDate";

	/**
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STATUS = "C_Status";

	/**
	 * <b>Data Field Name</b>: C_StorageUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STORAGE_UNIT = "C_StorageUnit";

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
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

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

	protected C_ShipmentBoxModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___BOX_COUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BoxCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Count<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_BoxCount" field
	 */
	public Long getC_BoxCount() {
		return getField(C___BOX_COUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___BOX_COUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BoxCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Count<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_BoxCount" field
	 */
	public void setC_BoxCount(Long value) {
		setField(C___BOX_COUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___BOX_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BoxNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_BoxNumber" field
	 */
	public Long getC_BoxNumber() {
		return getField(C___BOX_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___BOX_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BoxNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Box Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_BoxNumber" field
	 */
	public void setC_BoxNumber(Long value) {
		setField(C___BOX_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CARRIER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Carrier<br/>
	 * <br/>
	 * <b>Display Name</b>: Carrier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Carrier" field
	 */
	public String getC_Carrier() {
		return getField(C___CARRIER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CARRIER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Carrier<br/>
	 * <br/>
	 * <b>Display Name</b>: Carrier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Carrier" field
	 */
	public void setC_Carrier(String value) {
		setField(C___CARRIER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___DELIVERED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_DeliveredDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Delivered Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_DeliveredDate" field
	 */
	public Long getC_DeliveredDate() {
		return getField(C___DELIVERED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___DELIVERED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_DeliveredDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Delivered Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_DeliveredDate" field
	 */
	public void setC_DeliveredDate(Long value) {
		setField(C___DELIVERED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SHIPMENT_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ShipmentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipment ID (Tracking #)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ShipmentId" field
	 */
	public String getC_ShipmentId() {
		return getField(C___SHIPMENT_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SHIPMENT_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ShipmentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipment ID (Tracking #)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ShipmentId" field
	 */
	public void setC_ShipmentId(String value) {
		setField(C___SHIPMENT_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SHIPPED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ShippedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipped Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ShippedDate" field
	 */
	public Long getC_ShippedDate() {
		return getField(C___SHIPPED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SHIPPED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ShippedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Shipped Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ShippedDate" field
	 */
	public void setC_ShippedDate(Long value) {
		setField(C___SHIPPED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Status" field
	 */
	public String getC_Status() {
		return getField(C___STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Status" field
	 */
	public void setC_Status(String value) {
		setField(C___STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STORAGE_UNIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StorageUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_StorageUnit" field
	 */
	public Long getC_StorageUnit() {
		return getField(C___STORAGE_UNIT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STORAGE_UNIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StorageUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_StorageUnit" field
	 */
	public void setC_StorageUnit(Long value) {
		setField(C___STORAGE_UNIT, value);
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
}