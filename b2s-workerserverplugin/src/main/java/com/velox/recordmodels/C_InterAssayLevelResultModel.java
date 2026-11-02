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
 * Automatically generated class for: Inter Assay Level Result
 */
@ExemplarDataTypeModel(dataTypeName="C_InterAssayLevelResult")
public class C_InterAssayLevelResultModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_InterAssayLevelResult";

	/**
	 * <b>Data Field Name</b>: C_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___ANALYTE_NAME = "C_AnalyteName";

	/**
	 * <b>Data Field Name</b>: C_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___CONTROL_TYPE = "C_ControlType";

	/**
	 * <b>Data Field Name</b>: C_Level<br/>
	 * <br/>
	 * <b>Display Name</b>: Level<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___LEVEL = "C_Level";

	/**
	 * <b>Data Field Name</b>: C_Mean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___MEAN = "C_Mean";

	/**
	 * <b>Data Field Name</b>: C_N<br/>
	 * <br/>
	 * <b>Display Name</b>: N<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___N = "C_N";

	/**
	 * <b>Data Field Name</b>: C_NominalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Nominal Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___NOMINAL_CONCENTRATION = "C_NominalConcentration";

	/**
	 * <b>Data Field Name</b>: C_PercentBias<br/>
	 * <br/>
	 * <b>Display Name</b>: % Bias<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___PERCENT_BIAS = "C_PercentBias";

	/**
	 * <b>Data Field Name</b>: C_PercentCV<br/>
	 * <br/>
	 * <b>Display Name</b>: % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___PERCENT_CV = "C_PercentCV";

	/**
	 * <b>Data Field Name</b>: C_WithinLimits<br/>
	 * <br/>
	 * <b>Display Name</b>: Within Limits<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___WITHIN_LIMITS = "C_WithinLimits";

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

	protected C_InterAssayLevelResultModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ANALYTE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_AnalyteName" field
	 */
	public String getC_AnalyteName() {
		return getField(C___ANALYTE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ANALYTE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_AnalyteName" field
	 */
	public void setC_AnalyteName(String value) {
		setField(C___ANALYTE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CONTROL_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ControlType" field
	 */
	public String getC_ControlType() {
		return getField(C___CONTROL_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CONTROL_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ControlType" field
	 */
	public void setC_ControlType(String value) {
		setField(C___CONTROL_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LEVEL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Level<br/>
	 * <br/>
	 * <b>Display Name</b>: Level<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Level" field
	 */
	public String getC_Level() {
		return getField(C___LEVEL);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LEVEL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Level<br/>
	 * <br/>
	 * <b>Display Name</b>: Level<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Level" field
	 */
	public void setC_Level(String value) {
		setField(C___LEVEL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Mean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Mean" field
	 */
	public Double getC_Mean() {
		return getField(C___MEAN);
	}
	
	/**
	 * Sets the value stored on the {@link #C___MEAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Mean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Mean" field
	 */
	public void setC_Mean(Double value) {
		setField(C___MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___N} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_N<br/>
	 * <br/>
	 * <b>Display Name</b>: N<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_N" field
	 */
	public Integer getC_N() {
		return getField(C___N);
	}
	
	/**
	 * Sets the value stored on the {@link #C___N} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_N<br/>
	 * <br/>
	 * <b>Display Name</b>: N<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_N" field
	 */
	public void setC_N(Integer value) {
		setField(C___N, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___NOMINAL_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_NominalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Nominal Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_NominalConcentration" field
	 */
	public Double getC_NominalConcentration() {
		return getField(C___NOMINAL_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___NOMINAL_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_NominalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Nominal Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_NominalConcentration" field
	 */
	public void setC_NominalConcentration(Double value) {
		setField(C___NOMINAL_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___PERCENT_BIAS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PercentBias<br/>
	 * <br/>
	 * <b>Display Name</b>: % Bias<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_PercentBias" field
	 */
	public Double getC_PercentBias() {
		return getField(C___PERCENT_BIAS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___PERCENT_BIAS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PercentBias<br/>
	 * <br/>
	 * <b>Display Name</b>: % Bias<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_PercentBias" field
	 */
	public void setC_PercentBias(Double value) {
		setField(C___PERCENT_BIAS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___PERCENT_CV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PercentCV<br/>
	 * <br/>
	 * <b>Display Name</b>: % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_PercentCV" field
	 */
	public Double getC_PercentCV() {
		return getField(C___PERCENT_CV);
	}
	
	/**
	 * Sets the value stored on the {@link #C___PERCENT_CV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PercentCV<br/>
	 * <br/>
	 * <b>Display Name</b>: % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_PercentCV" field
	 */
	public void setC_PercentCV(Double value) {
		setField(C___PERCENT_CV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___WITHIN_LIMITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_WithinLimits<br/>
	 * <br/>
	 * <b>Display Name</b>: Within Limits<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_WithinLimits" field
	 */
	public Boolean getC_WithinLimits() {
		return getField(C___WITHIN_LIMITS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___WITHIN_LIMITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_WithinLimits<br/>
	 * <br/>
	 * <b>Display Name</b>: Within Limits<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_WithinLimits" field
	 */
	public void setC_WithinLimits(Boolean value) {
		setField(C___WITHIN_LIMITS, value);
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