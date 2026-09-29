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
 * Automatically generated class for: Sponsor Address
 */
@ExemplarDataTypeModel(dataTypeName="C_SponsorAddress")
public class C_SponsorAddressModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_SponsorAddress";

	/**
	 * <b>Data Field Name</b>: C_AddressLine1<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 1<br/>
	 * <br/>
	 * <b>Description</b>: Street address or PO box.
	 */
	public static final String C___ADDRESS_LINE_1 = "C_AddressLine1";

	/**
	 * <b>Data Field Name</b>: C_AddressLine2<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 2<br/>
	 * <br/>
	 * <b>Description</b>: Suite, building, floor or department, if needed.
	 */
	public static final String C___ADDRESS_LINE_2 = "C_AddressLine2";

	/**
	 * <b>Data Field Name</b>: C_AddressName<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Name<br/>
	 * <br/>
	 * <b>Description</b>: Short name for this address, shown when a sponsor picks a destination
	 */
	public static final String C___ADDRESS_NAME = "C_AddressName";

	/**
	 * <b>Data Field Name</b>: C_Attention<br/>
	 * <br/>
	 * <b>Display Name</b>: Attention<br/>
	 * <br/>
	 * <b>Description</b>: Person or team the shipment should be marked for at this address.
	 */
	public static final String C___ATTENTION = "C_Attention";

	/**
	 * <b>Data Field Name</b>: C_City<br/>
	 * <br/>
	 * <b>Display Name</b>: City<br/>
	 * <br/>
	 * <b>Description</b>: City or Town
	 */
	public static final String C___CITY = "C_City";

	/**
	 * <b>Data Field Name</b>: C_Country<br/>
	 * <br/>
	 * <b>Display Name</b>: Country<br/>
	 * <br/>
	 * <b>Description</b>: Country the shipment goes to.
	 */
	public static final String C___COUNTRY = "C_Country";

	/**
	 * <b>Data Field Name</b>: C_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Active<br/>
	 * <br/>
	 * <b>Description</b>: Uncheck to retire this address. Retired addresses are no longer offered on new shipment requests; past requests keep the address they used.
	 */
	public static final String C___IS_ACTIVE = "C_IsActive";

	/**
	 * <b>Data Field Name</b>: C_PostalCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Postal Code<br/>
	 * <br/>
	 * <b>Description</b>: ZIP or postal code.
	 */
	public static final String C___POSTAL_CODE = "C_PostalCode";

	/**
	 * <b>Data Field Name</b>: C_StateRegion<br/>
	 * <br/>
	 * <b>Display Name</b>: State / Region<br/>
	 * <br/>
	 * <b>Description</b>: State, province or region.
	 */
	public static final String C___STATE_REGION = "C_StateRegion";

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

	protected C_SponsorAddressModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ADDRESS_LINE_1} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressLine1<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 1<br/>
	 * <br/>
	 * <b>Description</b>: Street address or PO box.
	 * 
	 * @return the value stored on the "C_AddressLine1" field
	 */
	public String getC_AddressLine1() {
		return getField(C___ADDRESS_LINE_1);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ADDRESS_LINE_1} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressLine1<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 1<br/>
	 * <br/>
	 * <b>Description</b>: Street address or PO box.
	 * 
	 * @param value The value to set on the "C_AddressLine1" field
	 */
	public void setC_AddressLine1(String value) {
		setField(C___ADDRESS_LINE_1, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ADDRESS_LINE_2} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressLine2<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 2<br/>
	 * <br/>
	 * <b>Description</b>: Suite, building, floor or department, if needed.
	 * 
	 * @return the value stored on the "C_AddressLine2" field
	 */
	public String getC_AddressLine2() {
		return getField(C___ADDRESS_LINE_2);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ADDRESS_LINE_2} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressLine2<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Line 2<br/>
	 * <br/>
	 * <b>Description</b>: Suite, building, floor or department, if needed.
	 * 
	 * @param value The value to set on the "C_AddressLine2" field
	 */
	public void setC_AddressLine2(String value) {
		setField(C___ADDRESS_LINE_2, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ADDRESS_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressName<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Name<br/>
	 * <br/>
	 * <b>Description</b>: Short name for this address, shown when a sponsor picks a destination
	 * 
	 * @return the value stored on the "C_AddressName" field
	 */
	public String getC_AddressName() {
		return getField(C___ADDRESS_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ADDRESS_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AddressName<br/>
	 * <br/>
	 * <b>Display Name</b>: Address Name<br/>
	 * <br/>
	 * <b>Description</b>: Short name for this address, shown when a sponsor picks a destination
	 * 
	 * @param value The value to set on the "C_AddressName" field
	 */
	public void setC_AddressName(String value) {
		setField(C___ADDRESS_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ATTENTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Attention<br/>
	 * <br/>
	 * <b>Display Name</b>: Attention<br/>
	 * <br/>
	 * <b>Description</b>: Person or team the shipment should be marked for at this address.
	 * 
	 * @return the value stored on the "C_Attention" field
	 */
	public String getC_Attention() {
		return getField(C___ATTENTION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ATTENTION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Attention<br/>
	 * <br/>
	 * <b>Display Name</b>: Attention<br/>
	 * <br/>
	 * <b>Description</b>: Person or team the shipment should be marked for at this address.
	 * 
	 * @param value The value to set on the "C_Attention" field
	 */
	public void setC_Attention(String value) {
		setField(C___ATTENTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_City<br/>
	 * <br/>
	 * <b>Display Name</b>: City<br/>
	 * <br/>
	 * <b>Description</b>: City or Town
	 * 
	 * @return the value stored on the "C_City" field
	 */
	public String getC_City() {
		return getField(C___CITY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_City<br/>
	 * <br/>
	 * <b>Display Name</b>: City<br/>
	 * <br/>
	 * <b>Description</b>: City or Town
	 * 
	 * @param value The value to set on the "C_City" field
	 */
	public void setC_City(String value) {
		setField(C___CITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COUNTRY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Country<br/>
	 * <br/>
	 * <b>Display Name</b>: Country<br/>
	 * <br/>
	 * <b>Description</b>: Country the shipment goes to.
	 * 
	 * @return the value stored on the "C_Country" field
	 */
	public String getC_Country() {
		return getField(C___COUNTRY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COUNTRY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Country<br/>
	 * <br/>
	 * <b>Display Name</b>: Country<br/>
	 * <br/>
	 * <b>Description</b>: Country the shipment goes to.
	 * 
	 * @param value The value to set on the "C_Country" field
	 */
	public void setC_Country(String value) {
		setField(C___COUNTRY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___IS_ACTIVE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Active<br/>
	 * <br/>
	 * <b>Description</b>: Uncheck to retire this address. Retired addresses are no longer offered on new shipment requests; past requests keep the address they used.
	 * 
	 * @return the value stored on the "C_IsActive" field
	 */
	public Boolean getC_IsActive() {
		return getField(C___IS_ACTIVE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___IS_ACTIVE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Active<br/>
	 * <br/>
	 * <b>Description</b>: Uncheck to retire this address. Retired addresses are no longer offered on new shipment requests; past requests keep the address they used.
	 * 
	 * @param value The value to set on the "C_IsActive" field
	 */
	public void setC_IsActive(Boolean value) {
		setField(C___IS_ACTIVE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___POSTAL_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PostalCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Postal Code<br/>
	 * <br/>
	 * <b>Description</b>: ZIP or postal code.
	 * 
	 * @return the value stored on the "C_PostalCode" field
	 */
	public String getC_PostalCode() {
		return getField(C___POSTAL_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___POSTAL_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PostalCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Postal Code<br/>
	 * <br/>
	 * <b>Description</b>: ZIP or postal code.
	 * 
	 * @param value The value to set on the "C_PostalCode" field
	 */
	public void setC_PostalCode(String value) {
		setField(C___POSTAL_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STATE_REGION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StateRegion<br/>
	 * <br/>
	 * <b>Display Name</b>: State / Region<br/>
	 * <br/>
	 * <b>Description</b>: State, province or region.
	 * 
	 * @return the value stored on the "C_StateRegion" field
	 */
	public String getC_StateRegion() {
		return getField(C___STATE_REGION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STATE_REGION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StateRegion<br/>
	 * <br/>
	 * <b>Display Name</b>: State / Region<br/>
	 * <br/>
	 * <b>Description</b>: State, province or region.
	 * 
	 * @param value The value to set on the "C_StateRegion" field
	 */
	public void setC_StateRegion(String value) {
		setField(C___STATE_REGION, value);
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