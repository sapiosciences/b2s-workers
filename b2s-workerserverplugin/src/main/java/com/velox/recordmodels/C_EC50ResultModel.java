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
 * Automatically generated class for: EC50 Result
 */
@ExemplarDataTypeModel(dataTypeName="C_EC50Result")
public class C_EC50ResultModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_EC50Result";

	/**
	 * <b>Data Field Name</b>: C_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SAMPLE_ID = "C_SampleId";

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
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 */
	public static final String FILE_PATH = "FilePath";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 */
	public static final String VELOX_CHECK_OUT_USER = "VeloxCheckOutUser";

	/**
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 */
	public static final String VELOX_CURRENT_VERSION = "VeloxCurrentVersion";

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

	protected C_EC50ResultModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SampleId" field
	 */
	public String getC_SampleId() {
		return getField(C___SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SampleId" field
	 */
	public void setC_SampleId(String value) {
		setField(C___SAMPLE_ID, value);
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
	 * Retrieves the value stored on the {@link #FILE_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @return the value stored on the "FilePath" field
	 */
	public String getFilePath() {
		return getField(FILE_PATH);
	}
	
	/**
	 * Sets the value stored on the {@link #FILE_PATH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @param value The value to set on the "FilePath" field
	 */
	public void setFilePath(String value) {
		setField(FILE_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_CHECK_OUT_USER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @return the value stored on the "VeloxCheckOutUser" field
	 */
	public String getVeloxCheckOutUser() {
		return getField(VELOX_CHECK_OUT_USER);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_CHECK_OUT_USER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @param value The value to set on the "VeloxCheckOutUser" field
	 */
	public void setVeloxCheckOutUser(String value) {
		setField(VELOX_CHECK_OUT_USER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_CURRENT_VERSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @return the value stored on the "VeloxCurrentVersion" field
	 */
	public Integer getVeloxCurrentVersion() {
		return getField(VELOX_CURRENT_VERSION);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_CURRENT_VERSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @param value The value to set on the "VeloxCurrentVersion" field
	 */
	public void setVeloxCurrentVersion(Integer value) {
		setField(VELOX_CURRENT_VERSION, value);
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