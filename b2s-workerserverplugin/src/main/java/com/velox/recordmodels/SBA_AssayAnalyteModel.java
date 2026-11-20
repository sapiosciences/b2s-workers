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
 * Automatically generated class for: Assay Analyte
 */
@ExemplarDataTypeModel(dataTypeName="SBA_AssayAnalyte")
public class SBA_AssayAnalyteModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_AssayAnalyte";

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
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ANALYTE_NAME = "SBA_AnalyteName";

	/**
	 * <b>Data Field Name</b>: SBA_InternalStandard<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard<br/>
	 * <br/>
	 * <b>Description</b>: The related analyte internal standard for this analyte
	 */
	public static final String SBA___INTERNAL_STANDARD = "SBA_InternalStandard";

	/**
	 * <b>Data Field Name</b>: SBA_IsPlaceholder<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Placeholder<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___IS_PLACEHOLDER = "SBA_IsPlaceholder";

	/**
	 * <b>Data Field Name</b>: SBA_IsrDiffPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: ISR Difference Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ISR_DIFF_PERCENT_LIMIT = "SBA_IsrDiffPercentLimit";

	/**
	 * <b>Data Field Name</b>: SBA_LLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___LLOQ = "SBA_LLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteDataTypeName<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Data Type Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___RELATED_ANALYTE_DATA_TYPE_NAME = "SBA_RelatedAnalyteDataTypeName";

	/**
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Record Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___RELATED_ANALYTE_RECORD_ID = "SBA_RelatedAnalyteRecordId";

	/**
	 * <b>Data Field Name</b>: SBA_ULOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: ULOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ULOQ = "SBA_ULOQ";

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

	protected SBA_AssayAnalyteModel(RecordModel backingModel) {
		super(backingModel);
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
	 * Retrieves the value stored on the {@link #SBA___ANALYTE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AnalyteName" field
	 */
	public String getSBA_AnalyteName() {
		return getField(SBA___ANALYTE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ANALYTE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AnalyteName" field
	 */
	public void setSBA_AnalyteName(String value) {
		setField(SBA___ANALYTE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___INTERNAL_STANDARD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_InternalStandard<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard<br/>
	 * <br/>
	 * <b>Description</b>: The related analyte internal standard for this analyte
	 * 
	 * @return the value stored on the "SBA_InternalStandard" field
	 */
	public String getSBA_InternalStandard() {
		return getField(SBA___INTERNAL_STANDARD);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___INTERNAL_STANDARD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_InternalStandard<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard<br/>
	 * <br/>
	 * <b>Description</b>: The related analyte internal standard for this analyte
	 * 
	 * @param value The value to set on the "SBA_InternalStandard" field
	 */
	public void setSBA_InternalStandard(String value) {
		setField(SBA___INTERNAL_STANDARD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___IS_PLACEHOLDER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsPlaceholder<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Placeholder<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_IsPlaceholder" field
	 */
	public Boolean getSBA_IsPlaceholder() {
		return getField(SBA___IS_PLACEHOLDER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___IS_PLACEHOLDER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsPlaceholder<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Placeholder<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_IsPlaceholder" field
	 */
	public void setSBA_IsPlaceholder(Boolean value) {
		setField(SBA___IS_PLACEHOLDER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ISR_DIFF_PERCENT_LIMIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsrDiffPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: ISR Difference Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_IsrDiffPercentLimit" field
	 */
	public Double getSBA_IsrDiffPercentLimit() {
		return getField(SBA___ISR_DIFF_PERCENT_LIMIT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ISR_DIFF_PERCENT_LIMIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsrDiffPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: ISR Difference Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_IsrDiffPercentLimit" field
	 */
	public void setSBA_IsrDiffPercentLimit(Double value) {
		setField(SBA___ISR_DIFF_PERCENT_LIMIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_LLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_LLOQ" field
	 */
	public Double getSBA_LLOQ() {
		return getField(SBA___LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_LLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_LLOQ" field
	 */
	public void setSBA_LLOQ(Double value) {
		setField(SBA___LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RELATED_ANALYTE_DATA_TYPE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteDataTypeName<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Data Type Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_RelatedAnalyteDataTypeName" field
	 */
	public String getSBA_RelatedAnalyteDataTypeName() {
		return getField(SBA___RELATED_ANALYTE_DATA_TYPE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RELATED_ANALYTE_DATA_TYPE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteDataTypeName<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Data Type Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_RelatedAnalyteDataTypeName" field
	 */
	public void setSBA_RelatedAnalyteDataTypeName(String value) {
		setField(SBA___RELATED_ANALYTE_DATA_TYPE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RELATED_ANALYTE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Record Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_RelatedAnalyteRecordId" field
	 */
	public Long getSBA_RelatedAnalyteRecordId() {
		return getField(SBA___RELATED_ANALYTE_RECORD_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RELATED_ANALYTE_RECORD_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RelatedAnalyteRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Analyte Record Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_RelatedAnalyteRecordId" field
	 */
	public void setSBA_RelatedAnalyteRecordId(Long value) {
		setField(SBA___RELATED_ANALYTE_RECORD_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ULOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ULOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: ULOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ULOQ" field
	 */
	public Double getSBA_ULOQ() {
		return getField(SBA___ULOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ULOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ULOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: ULOQ<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ULOQ" field
	 */
	public void setSBA_ULOQ(Double value) {
		setField(SBA___ULOQ, value);
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