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
 * Automatically generated class for: Assay Run Control Result
 */
@ExemplarDataTypeModel(dataTypeName="SBA_AssayRunControlResult")
public class SBA_AssayRunControlResultModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_AssayRunControlResult";

	/**
	 * <b>Data Field Name</b>: C_Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COMMENT = "C_Comment";

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
	 * <b>Data Field Name</b>: SBA_ConcentrationCV<br/>
	 * <br/>
	 * <b>Display Name</b>: CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONCENTRATION_CV = "SBA_ConcentrationCV";

	/**
	 * <b>Data Field Name</b>: SBA_ConcentrationUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONCENTRATION_UNIT = "SBA_ConcentrationUnit";

	/**
	 * <b>Data Field Name</b>: SBA_ControlName<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONTROL_NAME = "SBA_ControlName";

	/**
	 * <b>Data Field Name</b>: SBA_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONTROL_TYPE = "SBA_ControlType";

	/**
	 * <b>Data Field Name</b>: SBA_DeactivateReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Deactivate Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___DEACTIVATE_REASON = "SBA_DeactivateReason";

	/**
	 * <b>Data Field Name</b>: SBA_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___IS_ACTIVE = "SBA_IsActive";

	/**
	 * <b>Data Field Name</b>: SBA_MasterAssay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MASTER_ASSAY = "SBA_MasterAssay";

	/**
	 * <b>Data Field Name</b>: SBA_MeanBiasPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Bias %<br/>
	 * <br/>
	 * <b>Description</b>: The difference of measured concentration from nominal concentration. Only applicable to control samples.
	 */
	public static final String SBA___MEAN_BIAS_PERCENTAGE = "SBA_MeanBiasPercentage";

	/**
	 * <b>Data Field Name</b>: SBA_MeanConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MEAN_CONCENTRATION = "SBA_MeanConcentration";

	/**
	 * <b>Data Field Name</b>: SBA_MeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MEAN_SIGNAL = "SBA_MeanSignal";

	/**
	 * <b>Data Field Name</b>: SBA_PercentInhibition<br/>
	 * <br/>
	 * <b>Display Name</b>: % Inhibition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___PERCENT_INHIBITION = "SBA_PercentInhibition";

	/**
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 */
	public static final String SBA___PLATE_ID = "SBA_PlateId";

	/**
	 * <b>Data Field Name</b>: SBA_SampleAssayStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Assay Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SAMPLE_ASSAY_STATUS = "SBA_SampleAssayStatus";

	/**
	 * <b>Data Field Name</b>: SBA_SignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SIGNAL_CV = "SBA_SignalCV";

	/**
	 * <b>Data Field Name</b>: SBA_SignalEvaluation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SIGNAL_EVALUATION = "SBA_SignalEvaluation";

	/**
	 * <b>Data Field Name</b>: SBA_SignalStandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SIGNAL_STANDARD_DEVIATION = "SBA_SignalStandardDeviation";

	/**
	 * <b>Data Field Name</b>: SBA_SpikedMeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SPIKED_MEAN_SIGNAL = "SBA_SpikedMeanSignal";

	/**
	 * <b>Data Field Name</b>: SBA_SpikedSignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SPIKED_SIGNAL_CV = "SBA_SpikedSignalCV";

	/**
	 * <b>Data Field Name</b>: SBA_SpikedSignalStdDev<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SPIKED_SIGNAL_STD_DEV = "SBA_SpikedSignalStdDev";

	/**
	 * <b>Data Field Name</b>: SBA_StandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___STANDARD_DEVIATION = "SBA_StandardDeviation";

	/**
	 * <b>Data Field Name</b>: SBA_TheoreticalValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Value<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___THEORETICAL_VALUE = "SBA_TheoreticalValue";

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

	protected SBA_AssayRunControlResultModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COMMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Comment" field
	 */
	public String getC_Comment() {
		return getField(C___COMMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COMMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Comment" field
	 */
	public void setC_Comment(String value) {
		setField(C___COMMENT, value);
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
	 * Retrieves the value stored on the {@link #SBA___CONCENTRATION_CV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationCV<br/>
	 * <br/>
	 * <b>Display Name</b>: CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ConcentrationCV" field
	 */
	public Double getSBA_ConcentrationCV() {
		return getField(SBA___CONCENTRATION_CV);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONCENTRATION_CV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationCV<br/>
	 * <br/>
	 * <b>Display Name</b>: CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ConcentrationCV" field
	 */
	public void setSBA_ConcentrationCV(Double value) {
		setField(SBA___CONCENTRATION_CV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CONCENTRATION_UNIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ConcentrationUnit" field
	 */
	public String getSBA_ConcentrationUnit() {
		return getField(SBA___CONCENTRATION_UNIT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONCENTRATION_UNIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationUnit<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ConcentrationUnit" field
	 */
	public void setSBA_ConcentrationUnit(String value) {
		setField(SBA___CONCENTRATION_UNIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CONTROL_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlName<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ControlName" field
	 */
	public String getSBA_ControlName() {
		return getField(SBA___CONTROL_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONTROL_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlName<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ControlName" field
	 */
	public void setSBA_ControlName(String value) {
		setField(SBA___CONTROL_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CONTROL_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ControlType" field
	 */
	public String getSBA_ControlType() {
		return getField(SBA___CONTROL_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONTROL_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ControlType" field
	 */
	public void setSBA_ControlType(String value) {
		setField(SBA___CONTROL_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___DEACTIVATE_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DeactivateReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Deactivate Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_DeactivateReason" field
	 */
	public String getSBA_DeactivateReason() {
		return getField(SBA___DEACTIVATE_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___DEACTIVATE_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DeactivateReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Deactivate Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_DeactivateReason" field
	 */
	public void setSBA_DeactivateReason(String value) {
		setField(SBA___DEACTIVATE_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___IS_ACTIVE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_IsActive" field
	 */
	public Boolean getSBA_IsActive() {
		return getField(SBA___IS_ACTIVE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___IS_ACTIVE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_IsActive" field
	 */
	public void setSBA_IsActive(Boolean value) {
		setField(SBA___IS_ACTIVE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MASTER_ASSAY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MasterAssay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MasterAssay" field
	 */
	public Long getSBA_MasterAssay() {
		return getField(SBA___MASTER_ASSAY);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MASTER_ASSAY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MasterAssay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MasterAssay" field
	 */
	public void setSBA_MasterAssay(Long value) {
		setField(SBA___MASTER_ASSAY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MEAN_BIAS_PERCENTAGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanBiasPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Bias %<br/>
	 * <br/>
	 * <b>Description</b>: The difference of measured concentration from nominal concentration. Only applicable to control samples.
	 * 
	 * @return the value stored on the "SBA_MeanBiasPercentage" field
	 */
	public Double getSBA_MeanBiasPercentage() {
		return getField(SBA___MEAN_BIAS_PERCENTAGE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MEAN_BIAS_PERCENTAGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanBiasPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Bias %<br/>
	 * <br/>
	 * <b>Description</b>: The difference of measured concentration from nominal concentration. Only applicable to control samples.
	 * 
	 * @param value The value to set on the "SBA_MeanBiasPercentage" field
	 */
	public void setSBA_MeanBiasPercentage(Double value) {
		setField(SBA___MEAN_BIAS_PERCENTAGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MEAN_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MeanConcentration" field
	 */
	public Double getSBA_MeanConcentration() {
		return getField(SBA___MEAN_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MEAN_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MeanConcentration" field
	 */
	public void setSBA_MeanConcentration(Double value) {
		setField(SBA___MEAN_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MEAN_SIGNAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MeanSignal" field
	 */
	public Double getSBA_MeanSignal() {
		return getField(SBA___MEAN_SIGNAL);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MEAN_SIGNAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MeanSignal" field
	 */
	public void setSBA_MeanSignal(Double value) {
		setField(SBA___MEAN_SIGNAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___PERCENT_INHIBITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PercentInhibition<br/>
	 * <br/>
	 * <b>Display Name</b>: % Inhibition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_PercentInhibition" field
	 */
	public Double getSBA_PercentInhibition() {
		return getField(SBA___PERCENT_INHIBITION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___PERCENT_INHIBITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PercentInhibition<br/>
	 * <br/>
	 * <b>Display Name</b>: % Inhibition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_PercentInhibition" field
	 */
	public void setSBA_PercentInhibition(Double value) {
		setField(SBA___PERCENT_INHIBITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___PLATE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 * 
	 * @return the value stored on the "SBA_PlateId" field
	 */
	public String getSBA_PlateId() {
		return getField(SBA___PLATE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___PLATE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 * 
	 * @param value The value to set on the "SBA_PlateId" field
	 */
	public void setSBA_PlateId(String value) {
		setField(SBA___PLATE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SAMPLE_ASSAY_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleAssayStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Assay Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SampleAssayStatus" field
	 */
	public String getSBA_SampleAssayStatus() {
		return getField(SBA___SAMPLE_ASSAY_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SAMPLE_ASSAY_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleAssayStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Assay Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SampleAssayStatus" field
	 */
	public void setSBA_SampleAssayStatus(String value) {
		setField(SBA___SAMPLE_ASSAY_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SIGNAL_CV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SignalCV" field
	 */
	public Double getSBA_SignalCV() {
		return getField(SBA___SIGNAL_CV);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SIGNAL_CV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SignalCV" field
	 */
	public void setSBA_SignalCV(Double value) {
		setField(SBA___SIGNAL_CV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SIGNAL_EVALUATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalEvaluation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SignalEvaluation" field
	 */
	public String getSBA_SignalEvaluation() {
		return getField(SBA___SIGNAL_EVALUATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SIGNAL_EVALUATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalEvaluation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SignalEvaluation" field
	 */
	public void setSBA_SignalEvaluation(String value) {
		setField(SBA___SIGNAL_EVALUATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SIGNAL_STANDARD_DEVIATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalStandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SignalStandardDeviation" field
	 */
	public Double getSBA_SignalStandardDeviation() {
		return getField(SBA___SIGNAL_STANDARD_DEVIATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SIGNAL_STANDARD_DEVIATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalStandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SignalStandardDeviation" field
	 */
	public void setSBA_SignalStandardDeviation(Double value) {
		setField(SBA___SIGNAL_STANDARD_DEVIATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SPIKED_MEAN_SIGNAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedMeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SpikedMeanSignal" field
	 */
	public Double getSBA_SpikedMeanSignal() {
		return getField(SBA___SPIKED_MEAN_SIGNAL);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPIKED_MEAN_SIGNAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedMeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SpikedMeanSignal" field
	 */
	public void setSBA_SpikedMeanSignal(Double value) {
		setField(SBA___SPIKED_MEAN_SIGNAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SPIKED_SIGNAL_CV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedSignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SpikedSignalCV" field
	 */
	public Double getSBA_SpikedSignalCV() {
		return getField(SBA___SPIKED_SIGNAL_CV);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPIKED_SIGNAL_CV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedSignalCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal CV %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SpikedSignalCV" field
	 */
	public void setSBA_SpikedSignalCV(Double value) {
		setField(SBA___SPIKED_SIGNAL_CV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SPIKED_SIGNAL_STD_DEV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedSignalStdDev<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SpikedSignalStdDev" field
	 */
	public Double getSBA_SpikedSignalStdDev() {
		return getField(SBA___SPIKED_SIGNAL_STD_DEV);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPIKED_SIGNAL_STD_DEV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedSignalStdDev<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Signal Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SpikedSignalStdDev" field
	 */
	public void setSBA_SpikedSignalStdDev(Double value) {
		setField(SBA___SPIKED_SIGNAL_STD_DEV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___STANDARD_DEVIATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_StandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_StandardDeviation" field
	 */
	public Double getSBA_StandardDeviation() {
		return getField(SBA___STANDARD_DEVIATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___STANDARD_DEVIATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_StandardDeviation<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_StandardDeviation" field
	 */
	public void setSBA_StandardDeviation(Double value) {
		setField(SBA___STANDARD_DEVIATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___THEORETICAL_VALUE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_TheoreticalValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Value<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_TheoreticalValue" field
	 */
	public Double getSBA_TheoreticalValue() {
		return getField(SBA___THEORETICAL_VALUE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___THEORETICAL_VALUE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_TheoreticalValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Value<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_TheoreticalValue" field
	 */
	public void setSBA_TheoreticalValue(Double value) {
		setField(SBA___THEORETICAL_VALUE, value);
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