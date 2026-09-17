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
 * Automatically generated class for: Sponsor Lot
 */
@ExemplarDataTypeModel(dataTypeName="C_SponsorLot")
public class C_SponsorLotModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_SponsorLot";

	/**
	 * <b>Data Field Name</b>: C_MinimumThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Threshold<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 */
	public static final String C___MINIMUM_THRESHOLD = "C_MinimumThreshold";

	/**
	 * <b>Data Field Name</b>: C_Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: Contains the total volume of all sample children related to this lot
	 */
	public static final String C___VOLUME = "C_Volume";

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

	protected C_SponsorLotModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___MINIMUM_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_MinimumThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Threshold<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 * 
	 * @return the value stored on the "C_MinimumThreshold" field
	 */
	public Double getC_MinimumThreshold() {
		return getField(C___MINIMUM_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #C___MINIMUM_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_MinimumThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Threshold<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 * 
	 * @param value The value to set on the "C_MinimumThreshold" field
	 */
	public void setC_MinimumThreshold(Double value) {
		setField(C___MINIMUM_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: Contains the total volume of all sample children related to this lot
	 * 
	 * @return the value stored on the "C_Volume" field
	 */
	public Double getC_Volume() {
		return getField(C___VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: Contains the total volume of all sample children related to this lot
	 * 
	 * @param value The value to set on the "C_Volume" field
	 */
	public void setC_Volume(Double value) {
		setField(C___VOLUME, value);
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