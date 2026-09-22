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
 * Automatically generated class for: Sponsor Contact
 */
@ExemplarDataTypeModel(dataTypeName="C_SponsorContact")
public class C_SponsorContactModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_SponsorContact";

	/**
	 * <b>Data Field Name</b>: C_EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 */
	public static final String C___EMAIL_ADDRESS = "C_EmailAddress";

	/**
	 * <b>Data Field Name</b>: C_FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 */
	public static final String C___FIRST_NAME = "C_FirstName";

	/**
	 * <b>Data Field Name</b>: C_LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 */
	public static final String C___LAST_NAME = "C_LastName";

	/**
	 * <b>Data Field Name</b>: C_MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 */
	public static final String C___MIDDLE_NAME = "C_MiddleName";

	/**
	 * <b>Data Field Name</b>: C_Phone<br/>
	 * <br/>
	 * <b>Display Name</b>: Phone<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___PHONE = "C_Phone";

	/**
	 * <b>Data Field Name</b>: C_Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 */
	public static final String C___USERNAME = "C_Username";

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

	protected C_SponsorContactModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___EMAIL_ADDRESS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 * 
	 * @return the value stored on the "C_EmailAddress" field
	 */
	public String getC_EmailAddress() {
		return getField(C___EMAIL_ADDRESS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___EMAIL_ADDRESS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_EmailAddress<br/>
	 * <br/>
	 * <b>Display Name</b>: Email Address<br/>
	 * <br/>
	 * <b>Description</b>: The user's email address.
	 * 
	 * @param value The value to set on the "C_EmailAddress" field
	 */
	public void setC_EmailAddress(String value) {
		setField(C___EMAIL_ADDRESS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FIRST_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 * 
	 * @return the value stored on the "C_FirstName" field
	 */
	public String getC_FirstName() {
		return getField(C___FIRST_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FIRST_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_FirstName<br/>
	 * <br/>
	 * <b>Display Name</b>: First Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's first name.
	 * 
	 * @param value The value to set on the "C_FirstName" field
	 */
	public void setC_FirstName(String value) {
		setField(C___FIRST_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LAST_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 * 
	 * @return the value stored on the "C_LastName" field
	 */
	public String getC_LastName() {
		return getField(C___LAST_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LAST_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_LastName<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's last name.
	 * 
	 * @param value The value to set on the "C_LastName" field
	 */
	public void setC_LastName(String value) {
		setField(C___LAST_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___MIDDLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 * 
	 * @return the value stored on the "C_MiddleName" field
	 */
	public String getC_MiddleName() {
		return getField(C___MIDDLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___MIDDLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_MiddleName<br/>
	 * <br/>
	 * <b>Display Name</b>: Middle Name<br/>
	 * <br/>
	 * <b>Description</b>: The user's middle name.
	 * 
	 * @param value The value to set on the "C_MiddleName" field
	 */
	public void setC_MiddleName(String value) {
		setField(C___MIDDLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___PHONE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Phone<br/>
	 * <br/>
	 * <b>Display Name</b>: Phone<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Phone" field
	 */
	public String getC_Phone() {
		return getField(C___PHONE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___PHONE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Phone<br/>
	 * <br/>
	 * <b>Display Name</b>: Phone<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Phone" field
	 */
	public void setC_Phone(String value) {
		setField(C___PHONE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___USERNAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 * 
	 * @return the value stored on the "C_Username" field
	 */
	public String getC_Username() {
		return getField(C___USERNAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___USERNAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Username<br/>
	 * <br/>
	 * <b>Display Name</b>: Username<br/>
	 * <br/>
	 * <b>Description</b>: The user's username in the system.
	 * 
	 * @param value The value to set on the "C_Username" field
	 */
	public void setC_Username(String value) {
		setField(C___USERNAME, value);
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