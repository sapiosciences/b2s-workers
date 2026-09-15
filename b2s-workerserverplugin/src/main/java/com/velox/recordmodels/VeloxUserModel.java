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
 * Automatically generated class for: User
 */
@ExemplarDataTypeModel(dataTypeName="VeloxUser")
public class VeloxUserModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "VeloxUser";

	/**
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SPONSOR = "C_Sponsor";

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
	 * <b>Data Field Name</b>: EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 */
	public static final String EMAIL_ADDRESS = "EmailAddress";

	/**
	 * <b>Data Field Name</b>: FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 */
	public static final String FIRST_NAME = "FirstName";

	/**
	 * <b>Data Field Name</b>: JobTitle<br/>
	 * <br/>
	 * <b>Display Name</b>: Job Title<br/>
	 * <br/>
	 * <b>Description</b>: The user's job title.
	 */
	public static final String JOB_TITLE = "JobTitle";

	/**
	 * <b>Data Field Name</b>: LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 */
	public static final String LAST_NAME = "LastName";

	/**
	 * <b>Data Field Name</b>: MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 */
	public static final String MIDDLE_NAME = "MiddleName";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 */
	public static final String USERNAME = "Username";

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

	protected VeloxUserModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SPONSOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Sponsor" field
	 */
	public String getC_Sponsor() {
		return getField(C___SPONSOR);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SPONSOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Sponsor" field
	 */
	public void setC_Sponsor(String value) {
		setField(C___SPONSOR, value);
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
	 * Retrieves the value stored on the {@link #EMAIL_ADDRESS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 * 
	 * @return the value stored on the "EmailAddress" field
	 */
	public String getEmailAddress() {
		return getField(EMAIL_ADDRESS);
	}
	
	/**
	 * Sets the value stored on the {@link #EMAIL_ADDRESS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 * 
	 * @param value The value to set on the "EmailAddress" field
	 */
	public void setEmailAddress(String value) {
		setField(EMAIL_ADDRESS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FIRST_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 * 
	 * @return the value stored on the "FirstName" field
	 */
	public String getFirstName() {
		return getField(FIRST_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #FIRST_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 * 
	 * @param value The value to set on the "FirstName" field
	 */
	public void setFirstName(String value) {
		setField(FIRST_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #JOB_TITLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: JobTitle<br/>
	 * <br/>
	 * <b>Display Name</b>: Job Title<br/>
	 * <br/>
	 * <b>Description</b>: The user's job title.
	 * 
	 * @return the value stored on the "JobTitle" field
	 */
	public String getJobTitle() {
		return getField(JOB_TITLE);
	}
	
	/**
	 * Sets the value stored on the {@link #JOB_TITLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: JobTitle<br/>
	 * <br/>
	 * <b>Display Name</b>: Job Title<br/>
	 * <br/>
	 * <b>Description</b>: The user's job title.
	 * 
	 * @param value The value to set on the "JobTitle" field
	 */
	public void setJobTitle(String value) {
		setField(JOB_TITLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LAST_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 * 
	 * @return the value stored on the "LastName" field
	 */
	public String getLastName() {
		return getField(LAST_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #LAST_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 * 
	 * @param value The value to set on the "LastName" field
	 */
	public void setLastName(String value) {
		setField(LAST_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MIDDLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 * 
	 * @return the value stored on the "MiddleName" field
	 */
	public String getMiddleName() {
		return getField(MIDDLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #MIDDLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 * 
	 * @param value The value to set on the "MiddleName" field
	 */
	public void setMiddleName(String value) {
		setField(MIDDLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #USERNAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 * 
	 * @return the value stored on the "Username" field
	 */
	public String getUsername() {
		return getField(USERNAME);
	}
	
	/**
	 * Sets the value stored on the {@link #USERNAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 * 
	 * @param value The value to set on the "Username" field
	 */
	public void setUsername(String value) {
		setField(USERNAME, value);
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