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
 * Automatically generated class for: Storage Unit
 */
@ExemplarDataTypeModel(dataTypeName="StorageUnit")
public class StorageUnitModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "StorageUnit";

	/**
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position of this Storage Unit within its parent Storage Unit (if any). These should be numbered starting from 1 for each unit.
	 */
	public static final String COL_POSITION = "ColPosition";

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
	 * <b>Data Field Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Display Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HUMIDITY = "Humidity";

	/**
	 * <b>Data Field Name</b>: IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active?<br/>
	 * <br/>
	 * <b>Description</b>: Storage Units that are not marked active will be ignored by workflow plugins.
	 */
	public static final String IS_ACTIVE = "IsActive";

	/**
	 * <b>Data Field Name</b>: OccupiedCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Occupied Count<br/>
	 * <br/>
	 * <b>Description</b>: The number of positions that are currently occupied by storable items or other storage units.
	 */
	public static final String OCCUPIED_COUNT = "OccupiedCount";

	/**
	 * <b>Data Field Name</b>: RecomputeOccupancy<br/>
	 * <br/>
	 * <b>Display Name</b>: Recompute Occupancy<br/>
	 * <br/>
	 * <b>Description</b>: The Occupied Count could become incorrect if storable items or storage units are added to or removed from storage inappropriately. Hitting this button will correct the Occupied Count value when that happens.
	 */
	public static final String RECOMPUTE_OCCUPANCY = "RecomputeOccupancy";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position of this Storage Unit within its parent Storage Unit (if any). These should be letters starting at A for each storage unit.
	 */
	public static final String ROW_POSITION = "RowPosition";

	/**
	 * <b>Data Field Name</b>: StorageUnitCapacity<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Capacity<br/>
	 * <br/>
	 * <b>Description</b>: The number of child storable items or other storage units that can be contained within this Storage Unit.
	 */
	public static final String STORAGE_UNIT_CAPACITY = "StorageUnitCapacity";

	/**
	 * <b>Data Field Name</b>: StorageUnitId<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit ID<br/>
	 * <br/>
	 * <b>Description</b>: The unique alphanumeric identifier for this Storage Unit.
	 */
	public static final String STORAGE_UNIT_ID = "StorageUnitId";

	/**
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit. This path appears as the top most unit on the left stepping down to the current storage unit to the right. Storage units are delimited by a '/'.
	 */
	public static final String STORAGE_UNIT_PATH = "StorageUnitPath";

	/**
	 * <b>Data Field Name</b>: StorageUnitType<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Type<br/>
	 * <br/>
	 * <b>Description</b>: Descriptive display name that is used to validate the location in the defined storage hierarchy. (For example, "Building", "Room", "Freezer", etc.)
	 */
	public static final String STORAGE_UNIT_TYPE = "StorageUnitType";

	/**
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: Can be utilized for enforcing that storable items such as samples and consumables of certain types are stored in Storage Units of a sufficiently low temperature. See the Exemplar Configurations workflow for temperature enforcement setup.
	 */
	public static final String TEMPERATURE = "Temperature";

	/**
	 * <b>Data Field Name</b>: UnitColumns<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Columns<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of columns for this storage unit. This is used along with Unit Rows when calculating maximum storage space and for drawing GUI components.
	 */
	public static final String UNIT_COLUMNS = "UnitColumns";

	/**
	 * <b>Data Field Name</b>: UnitRows<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Rows<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of rows for this storage unit. This is used along with Unit Columns when calculating maximum storage space and for drawing GUI components.
	 */
	public static final String UNIT_ROWS = "UnitRows";

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

	protected StorageUnitModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COL_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position of this Storage Unit within its parent Storage Unit (if any). These should be numbered starting from 1 for each unit.
	 * 
	 * @return the value stored on the "ColPosition" field
	 */
	public String getColPosition() {
		return getField(COL_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #COL_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position of this Storage Unit within its parent Storage Unit (if any). These should be numbered starting from 1 for each unit.
	 * 
	 * @param value The value to set on the "ColPosition" field
	 */
	public void setColPosition(String value) {
		setField(COL_POSITION, value);
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
	 * Retrieves the value stored on the {@link #HUMIDITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Display Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Humidity" field
	 */
	public Double getHumidity() {
		return getField(HUMIDITY);
	}
	
	/**
	 * Sets the value stored on the {@link #HUMIDITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Display Name</b>: Humidity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Humidity" field
	 */
	public void setHumidity(Double value) {
		setField(HUMIDITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_ACTIVE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active?<br/>
	 * <br/>
	 * <b>Description</b>: Storage Units that are not marked active will be ignored by workflow plugins.
	 * 
	 * @return the value stored on the "IsActive" field
	 */
	public Boolean getIsActive() {
		return getField(IS_ACTIVE);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_ACTIVE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active?<br/>
	 * <br/>
	 * <b>Description</b>: Storage Units that are not marked active will be ignored by workflow plugins.
	 * 
	 * @param value The value to set on the "IsActive" field
	 */
	public void setIsActive(Boolean value) {
		setField(IS_ACTIVE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OCCUPIED_COUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OccupiedCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Occupied Count<br/>
	 * <br/>
	 * <b>Description</b>: The number of positions that are currently occupied by storable items or other storage units.
	 * 
	 * @return the value stored on the "OccupiedCount" field
	 */
	public Long getOccupiedCount() {
		return getField(OCCUPIED_COUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #OCCUPIED_COUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OccupiedCount<br/>
	 * <br/>
	 * <b>Display Name</b>: Occupied Count<br/>
	 * <br/>
	 * <b>Description</b>: The number of positions that are currently occupied by storable items or other storage units.
	 * 
	 * @param value The value to set on the "OccupiedCount" field
	 */
	public void setOccupiedCount(Long value) {
		setField(OCCUPIED_COUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROW_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position of this Storage Unit within its parent Storage Unit (if any). These should be letters starting at A for each storage unit.
	 * 
	 * @return the value stored on the "RowPosition" field
	 */
	public String getRowPosition() {
		return getField(ROW_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #ROW_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position of this Storage Unit within its parent Storage Unit (if any). These should be letters starting at A for each storage unit.
	 * 
	 * @param value The value to set on the "RowPosition" field
	 */
	public void setRowPosition(String value) {
		setField(ROW_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_CAPACITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitCapacity<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Capacity<br/>
	 * <br/>
	 * <b>Description</b>: The number of child storable items or other storage units that can be contained within this Storage Unit.
	 * 
	 * @return the value stored on the "StorageUnitCapacity" field
	 */
	public Long getStorageUnitCapacity() {
		return getField(STORAGE_UNIT_CAPACITY);
	}
	
	/**
	 * Sets the value stored on the {@link #STORAGE_UNIT_CAPACITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitCapacity<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Capacity<br/>
	 * <br/>
	 * <b>Description</b>: The number of child storable items or other storage units that can be contained within this Storage Unit.
	 * 
	 * @param value The value to set on the "StorageUnitCapacity" field
	 */
	public void setStorageUnitCapacity(Long value) {
		setField(STORAGE_UNIT_CAPACITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitId<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit ID<br/>
	 * <br/>
	 * <b>Description</b>: The unique alphanumeric identifier for this Storage Unit.
	 * 
	 * @return the value stored on the "StorageUnitId" field
	 */
	public String getStorageUnitId() {
		return getField(STORAGE_UNIT_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #STORAGE_UNIT_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitId<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit ID<br/>
	 * <br/>
	 * <b>Description</b>: The unique alphanumeric identifier for this Storage Unit.
	 * 
	 * @param value The value to set on the "StorageUnitId" field
	 */
	public void setStorageUnitId(String value) {
		setField(STORAGE_UNIT_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit. This path appears as the top most unit on the left stepping down to the current storage unit to the right. Storage units are delimited by a '/'.
	 * 
	 * @return the value stored on the "StorageUnitPath" field
	 */
	public String getStorageUnitPath() {
		return getField(STORAGE_UNIT_PATH);
	}
	
	/**
	 * Sets the value stored on the {@link #STORAGE_UNIT_PATH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit. This path appears as the top most unit on the left stepping down to the current storage unit to the right. Storage units are delimited by a '/'.
	 * 
	 * @param value The value to set on the "StorageUnitPath" field
	 */
	public void setStorageUnitPath(String value) {
		setField(STORAGE_UNIT_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitType<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Type<br/>
	 * <br/>
	 * <b>Description</b>: Descriptive display name that is used to validate the location in the defined storage hierarchy. (For example, "Building", "Room", "Freezer", etc.)
	 * 
	 * @return the value stored on the "StorageUnitType" field
	 */
	public String getStorageUnitType() {
		return getField(STORAGE_UNIT_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #STORAGE_UNIT_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitType<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Unit Type<br/>
	 * <br/>
	 * <b>Description</b>: Descriptive display name that is used to validate the location in the defined storage hierarchy. (For example, "Building", "Room", "Freezer", etc.)
	 * 
	 * @param value The value to set on the "StorageUnitType" field
	 */
	public void setStorageUnitType(String value) {
		setField(STORAGE_UNIT_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPERATURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: Can be utilized for enforcing that storable items such as samples and consumables of certain types are stored in Storage Units of a sufficiently low temperature. See the Exemplar Configurations workflow for temperature enforcement setup.
	 * 
	 * @return the value stored on the "Temperature" field
	 */
	public Double getTemperature() {
		return getField(TEMPERATURE);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPERATURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: Can be utilized for enforcing that storable items such as samples and consumables of certain types are stored in Storage Units of a sufficiently low temperature. See the Exemplar Configurations workflow for temperature enforcement setup.
	 * 
	 * @param value The value to set on the "Temperature" field
	 */
	public void setTemperature(Double value) {
		setField(TEMPERATURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #UNIT_COLUMNS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UnitColumns<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Columns<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of columns for this storage unit. This is used along with Unit Rows when calculating maximum storage space and for drawing GUI components.
	 * 
	 * @return the value stored on the "UnitColumns" field
	 */
	public Long getUnitColumns() {
		return getField(UNIT_COLUMNS);
	}
	
	/**
	 * Sets the value stored on the {@link #UNIT_COLUMNS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UnitColumns<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Columns<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of columns for this storage unit. This is used along with Unit Rows when calculating maximum storage space and for drawing GUI components.
	 * 
	 * @param value The value to set on the "UnitColumns" field
	 */
	public void setUnitColumns(Long value) {
		setField(UNIT_COLUMNS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #UNIT_ROWS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UnitRows<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Rows<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of rows for this storage unit. This is used along with Unit Columns when calculating maximum storage space and for drawing GUI components.
	 * 
	 * @return the value stored on the "UnitRows" field
	 */
	public Long getUnitRows() {
		return getField(UNIT_ROWS);
	}
	
	/**
	 * Sets the value stored on the {@link #UNIT_ROWS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UnitRows<br/>
	 * <br/>
	 * <b>Display Name</b>: Unit Rows<br/>
	 * <br/>
	 * <b>Description</b>: Declares the number of rows for this storage unit. This is used along with Unit Columns when calculating maximum storage space and for drawing GUI components.
	 * 
	 * @param value The value to set on the "UnitRows" field
	 */
	public void setUnitRows(Long value) {
		setField(UNIT_ROWS, value);
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