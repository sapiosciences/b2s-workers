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
 * Automatically generated class for: Assay Run Sample Result
 */
@ExemplarDataTypeModel(dataTypeName="SBA_AssayRunSampleResult")
public class SBA_AssayRunSampleResultModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_AssayRunSampleResult";

	/**
	 * <b>Data Field Name</b>: C_DateReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___DATE_REPORTABLE = "C_DateReportable";

	/**
	 * <b>Data Field Name</b>: C_IsReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___IS_REPORTABLE = "C_IsReportable";

	/**
	 * <b>Data Field Name</b>: C_ReanalysisReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Reanalysis Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REANALYSIS_REASON = "C_ReanalysisReason";

	/**
	 * <b>Data Field Name</b>: C_ReportableBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REPORTABLE_BY = "C_ReportableBy";

	/**
	 * <b>Data Field Name</b>: C_ReportableResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable Result<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REPORTABLE_RESULT = "C_ReportableResult";

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
	 * <b>Data Field Name</b>: SBA_AssayDetectionQuality<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_DETECTION_QUALITY = "SBA_AssayDetectionQuality";

	/**
	 * <b>Data Field Name</b>: SBA_AssayProcessStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Process Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_PROCESS_STATUS = "SBA_AssayProcessStatus";

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
	 * <b>Data Field Name</b>: SBA_DeactivateReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Deactivate Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___DEACTIVATE_REASON = "SBA_DeactivateReason";

	/**
	 * <b>Data Field Name</b>: SBA_DilutionFactor<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: When used with Immunogenicity Titer assays this field is used as a grouping for samples at different dilutions
	 */
	public static final String SBA___DILUTION_FACTOR = "SBA_DilutionFactor";

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
	 * <b>Data Field Name</b>: SBA_MeanConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MEAN_CONCENTRATION = "SBA_MeanConcentration";

	/**
	 * <b>Data Field Name</b>: SBA_MeanFoundConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Found Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The concentration that is determined based on the raw readings and the standards in the run.  If dilution factors are specified for the source sample, they will not be factored into this value.  The dilution factor will be included in the Calculated Concentration
	 */
	public static final String SBA___MEAN_FOUND_CONCENTRATION = "SBA_MeanFoundConcentration";

	/**
	 * <b>Data Field Name</b>: SBA_MeanSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Signal<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MEAN_SIGNAL = "SBA_MeanSignal";

	/**
	 * <b>Data Field Name</b>: SBA_OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
	 */
	public static final String SBA___OTHER_SAMPLE_ID = "SBA_OtherSampleId";

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
	 * <b>Data Field Name</b>: SBA_SampleCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SAMPLE_CONDITION = "SBA_SampleCondition";

	/**
	 * <b>Data Field Name</b>: SBA_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID        <br/>
	 * <br/>
	 * <b>Description</b>: The primary identifier of the sample.
	 */
	public static final String SBA___SAMPLE_ID = "SBA_SampleId";

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
	 * <b>Data Field Name</b>: SBA_SpikedControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Control<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Selectivity validation of Immunogenicity assays.
	 */
	public static final String SBA___SPIKED_CONTROL = "SBA_SpikedControl";

	/**
	 * <b>Data Field Name</b>: SBA_SpikedDrug<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Drug<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Specificity validation of Immunogenicity assays.
	 */
	public static final String SBA___SPIKED_DRUG = "SBA_SpikedDrug";

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
	 * <b>Data Field Name</b>: SBA_Titer<br/>
	 * <br/>
	 * <b>Display Name</b>: Titer<br/>
	 * <br/>
	 * <b>Description</b>: When used in Immunogenicity Titer assays this field indicates what concentration level is the titer for the current sample.
	 */
	public static final String SBA___TITER = "SBA_Titer";

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

	protected SBA_AssayRunSampleResultModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___DATE_REPORTABLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_DateReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_DateReportable" field
	 */
	public Long getC_DateReportable() {
		return getField(C___DATE_REPORTABLE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___DATE_REPORTABLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_DateReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_DateReportable" field
	 */
	public void setC_DateReportable(Long value) {
		setField(C___DATE_REPORTABLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___IS_REPORTABLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_IsReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_IsReportable" field
	 */
	public Boolean getC_IsReportable() {
		return getField(C___IS_REPORTABLE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___IS_REPORTABLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_IsReportable<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Reportable<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_IsReportable" field
	 */
	public void setC_IsReportable(Boolean value) {
		setField(C___IS_REPORTABLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REANALYSIS_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReanalysisReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Reanalysis Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReanalysisReason" field
	 */
	public String getC_ReanalysisReason() {
		return getField(C___REANALYSIS_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REANALYSIS_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReanalysisReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Reanalysis Reason<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReanalysisReason" field
	 */
	public void setC_ReanalysisReason(String value) {
		setField(C___REANALYSIS_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REPORTABLE_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportableBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReportableBy" field
	 */
	public String getC_ReportableBy() {
		return getField(C___REPORTABLE_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REPORTABLE_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportableBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReportableBy" field
	 */
	public void setC_ReportableBy(String value) {
		setField(C___REPORTABLE_BY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REPORTABLE_RESULT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportableResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable Result<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReportableResult" field
	 */
	public String getC_ReportableResult() {
		return getField(C___REPORTABLE_RESULT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REPORTABLE_RESULT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportableResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Reportable Result<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReportableResult" field
	 */
	public void setC_ReportableResult(String value) {
		setField(C___REPORTABLE_RESULT, value);
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
	 * Retrieves the value stored on the {@link #SBA___ASSAY_DETECTION_QUALITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayDetectionQuality<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayDetectionQuality" field
	 */
	public String getSBA_AssayDetectionQuality() {
		return getField(SBA___ASSAY_DETECTION_QUALITY);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_DETECTION_QUALITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayDetectionQuality<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayDetectionQuality" field
	 */
	public void setSBA_AssayDetectionQuality(String value) {
		setField(SBA___ASSAY_DETECTION_QUALITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_PROCESS_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayProcessStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Process Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayProcessStatus" field
	 */
	public String getSBA_AssayProcessStatus() {
		return getField(SBA___ASSAY_PROCESS_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_PROCESS_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayProcessStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Process Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayProcessStatus" field
	 */
	public void setSBA_AssayProcessStatus(String value) {
		setField(SBA___ASSAY_PROCESS_STATUS, value);
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
	 * Retrieves the value stored on the {@link #SBA___DILUTION_FACTOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DilutionFactor<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: When used with Immunogenicity Titer assays this field is used as a grouping for samples at different dilutions
	 * 
	 * @return the value stored on the "SBA_DilutionFactor" field
	 */
	public Double getSBA_DilutionFactor() {
		return getField(SBA___DILUTION_FACTOR);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___DILUTION_FACTOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DilutionFactor<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: When used with Immunogenicity Titer assays this field is used as a grouping for samples at different dilutions
	 * 
	 * @param value The value to set on the "SBA_DilutionFactor" field
	 */
	public void setSBA_DilutionFactor(Double value) {
		setField(SBA___DILUTION_FACTOR, value);
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
	 * Retrieves the value stored on the {@link #SBA___MEAN_FOUND_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanFoundConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Found Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The concentration that is determined based on the raw readings and the standards in the run.  If dilution factors are specified for the source sample, they will not be factored into this value.  The dilution factor will be included in the Calculated Concentration
	 * 
	 * @return the value stored on the "SBA_MeanFoundConcentration" field
	 */
	public Double getSBA_MeanFoundConcentration() {
		return getField(SBA___MEAN_FOUND_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MEAN_FOUND_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MeanFoundConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Found Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The concentration that is determined based on the raw readings and the standards in the run.  If dilution factors are specified for the source sample, they will not be factored into this value.  The dilution factor will be included in the Calculated Concentration
	 * 
	 * @param value The value to set on the "SBA_MeanFoundConcentration" field
	 */
	public void setSBA_MeanFoundConcentration(Double value) {
		setField(SBA___MEAN_FOUND_CONCENTRATION, value);
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
	 * Retrieves the value stored on the {@link #SBA___OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
	 * 
	 * @return the value stored on the "SBA_OtherSampleId" field
	 */
	public String getSBA_OtherSampleId() {
		return getField(SBA___OTHER_SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___OTHER_SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
	 * 
	 * @param value The value to set on the "SBA_OtherSampleId" field
	 */
	public void setSBA_OtherSampleId(String value) {
		setField(SBA___OTHER_SAMPLE_ID, value);
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
	 * Retrieves the value stored on the {@link #SBA___SAMPLE_CONDITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SampleCondition" field
	 */
	public String getSBA_SampleCondition() {
		return getField(SBA___SAMPLE_CONDITION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SAMPLE_CONDITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Condition<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SampleCondition" field
	 */
	public void setSBA_SampleCondition(String value) {
		setField(SBA___SAMPLE_CONDITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID        <br/>
	 * <br/>
	 * <b>Description</b>: The primary identifier of the sample.
	 * 
	 * @return the value stored on the "SBA_SampleId" field
	 */
	public String getSBA_SampleId() {
		return getField(SBA___SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID        <br/>
	 * <br/>
	 * <b>Description</b>: The primary identifier of the sample.
	 * 
	 * @param value The value to set on the "SBA_SampleId" field
	 */
	public void setSBA_SampleId(String value) {
		setField(SBA___SAMPLE_ID, value);
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
	 * Retrieves the value stored on the {@link #SBA___SPIKED_CONTROL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Control<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Selectivity validation of Immunogenicity assays.
	 * 
	 * @return the value stored on the "SBA_SpikedControl" field
	 */
	public String getSBA_SpikedControl() {
		return getField(SBA___SPIKED_CONTROL);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPIKED_CONTROL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Control<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Selectivity validation of Immunogenicity assays.
	 * 
	 * @param value The value to set on the "SBA_SpikedControl" field
	 */
	public void setSBA_SpikedControl(String value) {
		setField(SBA___SPIKED_CONTROL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SPIKED_DRUG} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedDrug<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Drug<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Specificity validation of Immunogenicity assays.
	 * 
	 * @return the value stored on the "SBA_SpikedDrug" field
	 */
	public String getSBA_SpikedDrug() {
		return getField(SBA___SPIKED_DRUG);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPIKED_DRUG} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SpikedDrug<br/>
	 * <br/>
	 * <b>Display Name</b>: Spiked Drug<br/>
	 * <br/>
	 * <b>Description</b>: Field used for Specificity validation of Immunogenicity assays.
	 * 
	 * @param value The value to set on the "SBA_SpikedDrug" field
	 */
	public void setSBA_SpikedDrug(String value) {
		setField(SBA___SPIKED_DRUG, value);
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
	 * Retrieves the value stored on the {@link #SBA___TITER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Titer<br/>
	 * <br/>
	 * <b>Display Name</b>: Titer<br/>
	 * <br/>
	 * <b>Description</b>: When used in Immunogenicity Titer assays this field indicates what concentration level is the titer for the current sample.
	 * 
	 * @return the value stored on the "SBA_Titer" field
	 */
	public Boolean getSBA_Titer() {
		return getField(SBA___TITER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___TITER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Titer<br/>
	 * <br/>
	 * <b>Display Name</b>: Titer<br/>
	 * <br/>
	 * <b>Description</b>: When used in Immunogenicity Titer assays this field indicates what concentration level is the titer for the current sample.
	 * 
	 * @param value The value to set on the "SBA_Titer" field
	 */
	public void setSBA_Titer(Boolean value) {
		setField(SBA___TITER, value);
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