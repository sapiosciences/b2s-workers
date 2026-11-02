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
 * Automatically generated class for: Assay
 */
@ExemplarDataTypeModel(dataTypeName="SBA_MasterAssay")
public class SBA_MasterAssayModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_MasterAssay";

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
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_CREATED_BY = "SBA_AccAndPrecCriteriaInter.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_DATA_RECORD_NAME = "SBA_AccAndPrecCriteriaInter.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_DATE_CREATED = "SBA_AccAndPrecCriteriaInter.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_RECORD_ID = "SBA_AccAndPrecCriteriaInter.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_CVINTER = "SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_MEAN_BIAS_INTER = "SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Ratio of LQC/LLOQ Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RATIO_LQCOVER_LLOQ = "SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRunInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Run #<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RUN_INTER = "SBA_AccAndPrecCriteriaInter.SBA_MinRunInter";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_BY = "SBA_AccAndPrecCriteriaInter.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_DATE = "SBA_AccAndPrecCriteriaInter.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_CREATED_BY = "SBA_AccuracyAndPrecCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_DATA_RECORD_NAME = "SBA_AccuracyAndPrecCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_DATE_CREATED = "SBA_AccuracyAndPrecCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_RECORD_ID = "SBA_AccuracyAndPrecCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_CVINTRA = "SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_MEAN_BIAS_INTRA = "SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Replicate # of QCs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MIN_REPLICATE_NUM_INTRA = "SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_AccuracyAndPrecCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_AccuracyAndPrecCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_AdditionalInstruments<br/>
	 * <br/>
	 * <b>Display Name</b>: Additional Instruments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ADDITIONAL_INSTRUMENTS = "SBA_AdditionalInstruments";

	/**
	 * <b>Data Field Name</b>: SBA_ApprovalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Approval Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___APPROVAL_DATE = "SBA_ApprovalDate";

	/**
	 * <b>Data Field Name</b>: SBA_AssayCategory<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Category<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_CATEGORY = "SBA_AssayCategory";

	/**
	 * <b>Data Field Name</b>: SBA_AssayComments<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_COMMENTS = "SBA_AssayComments";

	/**
	 * <b>Data Field Name</b>: SBA_AssayDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Description<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_DESCRIPTION = "SBA_AssayDescription";

	/**
	 * <b>Data Field Name</b>: SBA_AssayId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_ID = "SBA_AssayId";

	/**
	 * <b>Data Field Name</b>: SBA_AssayInstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_INSTRUMENT_TYPE = "SBA_AssayInstrumentType";

	/**
	 * <b>Data Field Name</b>: SBA_AssayMethodStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Method Status<br/>
	 * <br/>
	 * <b>Description</b>: New, Validation, or Approved
	 */
	public static final String SBA___ASSAY_METHOD_STATUS = "SBA_AssayMethodStatus";

	/**
	 * <b>Data Field Name</b>: SBA_AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_TYPE = "SBA_AssayType";

	/**
	 * <b>Data Field Name</b>: SBA_BiologicalMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Biological Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___BIOLOGICAL_MATRIX = "SBA_BiologicalMatrix";

	/**
	 * <b>Data Field Name</b>: SBA_CVOfLLOQSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max LLOQ STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CVOF_LLOQSTD = "SBA_CVOfLLOQSTD";

	/**
	 * <b>Data Field Name</b>: SBA_CVOfQC<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the control results if the cv % is larger than this value.
	 */
	public static final String SBA___CVOF_QC = "SBA_CVOfQC";

	/**
	 * <b>Data Field Name</b>: SBA_CVOfSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis.  Can be used to enforce run acceptance if the run acceptance configuration is set up to do so.
	 */
	public static final String SBA___CVOF_STD = "SBA_CVOfSTD";

	/**
	 * <b>Data Field Name</b>: SBA_CVOfUnknownSample<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% of Unk. Sample<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the sample results if the cv % is larger than this value.
	 */
	public static final String SBA___CVOF_UNKNOWN_SAMPLE = "SBA_CVOfUnknownSample";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_CREATED_BY = "SBA_CalibrationCurveCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_DATA_RECORD_NAME = "SBA_CalibrationCurveCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_DATE_CREATED = "SBA_CalibrationCurveCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_RECORD_ID = "SBA_CalibrationCurveCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_LLOQ = "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for non-LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_NON_LLOQ = "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_OF_STDLEVELS = "SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Pass Rate per STD Level<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_PASS_RATE_PER_STDLEVEL = "SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Min STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_STDPASS_RATE = "SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_CalibrationCurveCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_CalibrationCurveCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_CREATED_BY = "SBA_CarryOverCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_DATA_RECORD_NAME = "SBA_CarryOverCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_DATE_CREATED = "SBA_CarryOverCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_RECORD_ID = "SBA_CarryOverCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___CALC_AREA_RATIO_CARRYOVER = "SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___CALC_ISCARRYOVER = "SBA_CarryOverCriteria.SBA_CalcISCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___CALCULATE_PEAK_AREA_CARRYOVER = "SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_ISBlanksInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Internal Standard Blanks In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___ISBLANKS_IN_CALCULATION = "SBA_CarryOverCriteria.SBA_ISBlanksInCalculation";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Internal Standard Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_IS = "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Peak Area Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_LLOQ = "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Area Ratio Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AREA_RATIO = "SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_QcInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use QC IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___QC_IN_CALCULATION = "SBA_CarryOverCriteria.SBA_QcInCalculation";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_StandardInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Standard IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_SBA___STANDARD_IN_CALCULATION = "SBA_CarryOverCriteria.SBA_StandardInCalculation";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_CarryOverCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_CarryOverCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONCENTRATION_UNITS = "SBA_ConcentrationUnits";

	/**
	 * <b>Data Field Name</b>: SBA_CutPointAcceptanceCriteria<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Acceptance Criteria<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CUT_POINT_ACCEPTANCE_CRITERIA = "SBA_CutPointAcceptanceCriteria";

	/**
	 * <b>Data Field Name</b>: SBA_CutPointType<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CUT_POINT_TYPE = "SBA_CutPointType";

	/**
	 * <b>Data Field Name</b>: SBA_CutPointValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Value<br/>
	 * <br/>
	 * <b>Description</b>: The value associated with the cut point type.  If the type requires a multiplier or offset then this represents the multiplier or offset respectively.  If the type of cut point is a fixed value then this is the cut point value.
	 */
	public static final String SBA___CUT_POINT_VALUE = "SBA_CutPointValue";

	/**
	 * <b>Data Field Name</b>: SBA_IsActive<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Active<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___IS_ACTIVE = "SBA_IsActive";

	/**
	 * <b>Data Field Name</b>: SBA_IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___IS_TEMPLATE = "SBA_IsTemplate";

	/**
	 * <b>Data Field Name</b>: SBA_MasterAssayName<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MASTER_ASSAY_NAME = "SBA_MasterAssayName";

	/**
	 * <b>Data Field Name</b>: SBA_MaterialTypes<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Types<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MATERIAL_TYPES = "SBA_MaterialTypes";

	/**
	 * <b>Data Field Name</b>: SBA_MinIsrPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum ISR Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___MIN_ISR_PASS_RATE = "SBA_MinIsrPassRate";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___RECOVERY_CRITERIA_CREATED_BY = "SBA_RecoveryCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___RECOVERY_CRITERIA_DATA_RECORD_NAME = "SBA_RecoveryCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___RECOVERY_CRITERIA_DATE_CREATED = "SBA_RecoveryCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___RECOVERY_CRITERIA_RECORD_ID = "SBA_RecoveryCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff Limit<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 */
	public static final String SBA___RECOVERY_CRITERIA_SBA___MAX_MIN_RECOVERY_DIFF_LIMIT = "SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_RecoveryCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_RecoveryCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_RequiredValidationParam<br/>
	 * <br/>
	 * <b>Display Name</b>: Required Validation Parameters<br/>
	 * <br/>
	 * <b>Description</b>: Parameters that are required to be validated before this Assay Method can be approved.
	 */
	public static final String SBA___REQUIRED_VALIDATION_PARAM = "SBA_RequiredValidationParam";

	/**
	 * <b>Data Field Name</b>: SBA_RunAcceptanceConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Acceptance Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The run acceptance configuration that will be used during sample analysis to determine if the results for a given plate are acceptable.
	 */
	public static final String SBA___RUN_ACCEPTANCE_CONFIG = "SBA_RunAcceptanceConfig";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_CREATED_BY = "SBA_SelectivityCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_DATA_RECORD_NAME = "SBA_SelectivityCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_DATE_CREATED = "SBA_SelectivityCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_RECORD_ID = "SBA_SelectivityCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankISRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and BLANK_IS.
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_ISRATIO = "SBA_SelectivityCriteria.SBA_MaxBlankISRatio";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and LLOQ.
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_LLOQRATIO = "SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of Passed BLANK Samples<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] Min number of BLANK samples needed to pass evaluation
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_SBA___MIN_NUM_OF_PASSED_SAMPLES = "SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_SelectivityCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_SelectivityCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_CREATED_BY = "SBA_SensitivityCriteria.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_DATA_RECORD_NAME = "SBA_SensitivityCriteria.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_DATE_CREATED = "SBA_SensitivityCriteria.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_RECORD_ID = "SBA_SensitivityCriteria.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.SBA_MaxBias<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity] The maximum Bias% from nominal value for any aliquot.
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_SBA___MAX_BIAS = "SBA_SensitivityCriteria.SBA_MaxBias";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY = "SBA_SensitivityCriteria.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE = "SBA_SensitivityCriteria.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_SignalNormalization<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Normalization<br/>
	 * <br/>
	 * <b>Description</b>: Whether the signal values in Immunogenicity assay runs should be normalized and how to normalize them.
	 */
	public static final String SBA___SIGNAL_NORMALIZATION = "SBA_SignalNormalization";

	/**
	 * <b>Data Field Name</b>: SBA_SourceTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SOURCE_TEMPLATE = "SBA_SourceTemplate";

	/**
	 * <b>Data Field Name</b>: SBA_Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___SPECIES = "SBA_Species";

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

	protected SBA_MasterAssayModel(RecordModel backingModel) {
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
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.CreatedBy" field
	 */
	public String getSBA_AccAndPrecCriteriaInterCreatedBy() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.DataRecordName" field
	 */
	public String getSBA_AccAndPrecCriteriaInterDataRecordName() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.DateCreated" field
	 */
	public Long getSBA_AccAndPrecCriteriaInterDateCreated() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.RecordId" field
	 */
	public Long getSBA_AccAndPrecCriteriaInterRecordId() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_CVINTER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter" field
	 */
	public Double getSBA_AccAndPrecCriteriaInterSBA_MaxCVInter() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_CVINTER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_CVINTER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecCriteriaInter.SBA_MaxCVInter" field
	 */
	public void setSBA_AccAndPrecCriteriaInterSBA_MaxCVInter(Double value) {
		setField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_CVINTER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_MEAN_BIAS_INTER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter" field
	 */
	public Double getSBA_AccAndPrecCriteriaInterSBA_MaxMeanBiasInter() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_MEAN_BIAS_INTER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_MEAN_BIAS_INTER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecCriteriaInter.SBA_MaxMeanBiasInter" field
	 */
	public void setSBA_AccAndPrecCriteriaInterSBA_MaxMeanBiasInter(Double value) {
		setField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MAX_MEAN_BIAS_INTER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RATIO_LQCOVER_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Ratio of LQC/LLOQ Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ" field
	 */
	public Double getSBA_AccAndPrecCriteriaInterSBA_MinRatioLQCOverLLOQ() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RATIO_LQCOVER_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RATIO_LQCOVER_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Ratio of LQC/LLOQ Across Runs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecCriteriaInter.SBA_MinRatioLQCOverLLOQ" field
	 */
	public void setSBA_AccAndPrecCriteriaInterSBA_MinRatioLQCOverLLOQ(Double value) {
		setField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RATIO_LQCOVER_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RUN_INTER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRunInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Run #<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.SBA_MinRunInter" field
	 */
	public Integer getSBA_AccAndPrecCriteriaInterSBA_MinRunInter() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RUN_INTER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RUN_INTER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.SBA_MinRunInter<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Run #<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Inter]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecCriteriaInter.SBA_MinRunInter" field
	 */
	public void setSBA_AccAndPrecCriteriaInterSBA_MinRunInter(Integer value) {
		setField(SBA___ACC_AND_PREC_CRITERIA_INTER_SBA___MIN_RUN_INTER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.VeloxLastModifiedBy" field
	 */
	public String getSBA_AccAndPrecCriteriaInterVeloxLastModifiedBy() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecCriteriaInter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecCriteriaInter.VeloxLastModifiedDate" field
	 */
	public Long getSBA_AccAndPrecCriteriaInterVeloxLastModifiedDate() {
		return getField(SBA___ACC_AND_PREC_CRITERIA_INTER_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.CreatedBy" field
	 */
	public String getSBA_AccuracyAndPrecCriteriaCreatedBy() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.DataRecordName" field
	 */
	public String getSBA_AccuracyAndPrecCriteriaDataRecordName() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.DateCreated" field
	 */
	public Long getSBA_AccuracyAndPrecCriteriaDateCreated() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.RecordId" field
	 */
	public Long getSBA_AccuracyAndPrecCriteriaRecordId() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_CVINTRA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra" field
	 */
	public Double getSBA_AccuracyAndPrecCriteriaSBA_MaxCVIntra() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_CVINTRA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_CVINTRA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @param value The value to set on the "SBA_AccuracyAndPrecCriteria.SBA_MaxCVIntra" field
	 */
	public void setSBA_AccuracyAndPrecCriteriaSBA_MaxCVIntra(Double value) {
		setField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_CVINTRA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_MEAN_BIAS_INTRA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra" field
	 */
	public Double getSBA_AccuracyAndPrecCriteriaSBA_MaxMeanBiasIntra() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_MEAN_BIAS_INTRA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_MEAN_BIAS_INTRA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @param value The value to set on the "SBA_AccuracyAndPrecCriteria.SBA_MaxMeanBiasIntra" field
	 */
	public void setSBA_AccuracyAndPrecCriteriaSBA_MaxMeanBiasIntra(Double value) {
		setField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MAX_MEAN_BIAS_INTRA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MIN_REPLICATE_NUM_INTRA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Replicate # of QCs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra" field
	 */
	public Integer getSBA_AccuracyAndPrecCriteriaSBA_MinReplicateNumIntra() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MIN_REPLICATE_NUM_INTRA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MIN_REPLICATE_NUM_INTRA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum Replicate # of QCs<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra]
	 * 
	 * @param value The value to set on the "SBA_AccuracyAndPrecCriteria.SBA_MinReplicateNumIntra" field
	 */
	public void setSBA_AccuracyAndPrecCriteriaSBA_MinReplicateNumIntra(Integer value) {
		setField(SBA___ACCURACY_AND_PREC_CRITERIA_SBA___MIN_REPLICATE_NUM_INTRA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_AccuracyAndPrecCriteriaVeloxLastModifiedBy() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccuracyAndPrecCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_AccuracyAndPrecCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_AccuracyAndPrecCriteriaVeloxLastModifiedDate() {
		return getField(SBA___ACCURACY_AND_PREC_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ADDITIONAL_INSTRUMENTS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AdditionalInstruments<br/>
	 * <br/>
	 * <b>Display Name</b>: Additional Instruments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AdditionalInstruments" field
	 */
	public String getSBA_AdditionalInstruments() {
		return getField(SBA___ADDITIONAL_INSTRUMENTS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ADDITIONAL_INSTRUMENTS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AdditionalInstruments<br/>
	 * <br/>
	 * <b>Display Name</b>: Additional Instruments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AdditionalInstruments" field
	 */
	public void setSBA_AdditionalInstruments(String value) {
		setField(SBA___ADDITIONAL_INSTRUMENTS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___APPROVAL_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ApprovalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Approval Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ApprovalDate" field
	 */
	public Long getSBA_ApprovalDate() {
		return getField(SBA___APPROVAL_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___APPROVAL_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ApprovalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Approval Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ApprovalDate" field
	 */
	public void setSBA_ApprovalDate(Long value) {
		setField(SBA___APPROVAL_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_CATEGORY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayCategory<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Category<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayCategory" field
	 */
	public String getSBA_AssayCategory() {
		return getField(SBA___ASSAY_CATEGORY);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_CATEGORY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayCategory<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Category<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayCategory" field
	 */
	public void setSBA_AssayCategory(String value) {
		setField(SBA___ASSAY_CATEGORY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_COMMENTS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayComments<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayComments" field
	 */
	public String getSBA_AssayComments() {
		return getField(SBA___ASSAY_COMMENTS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_COMMENTS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayComments<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayComments" field
	 */
	public void setSBA_AssayComments(String value) {
		setField(SBA___ASSAY_COMMENTS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_DESCRIPTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Description<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayDescription" field
	 */
	public String getSBA_AssayDescription() {
		return getField(SBA___ASSAY_DESCRIPTION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_DESCRIPTION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Description<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayDescription" field
	 */
	public void setSBA_AssayDescription(String value) {
		setField(SBA___ASSAY_DESCRIPTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayId" field
	 */
	public String getSBA_AssayId() {
		return getField(SBA___ASSAY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayId" field
	 */
	public void setSBA_AssayId(String value) {
		setField(SBA___ASSAY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_INSTRUMENT_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayInstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayInstrumentType" field
	 */
	public String getSBA_AssayInstrumentType() {
		return getField(SBA___ASSAY_INSTRUMENT_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_INSTRUMENT_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayInstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayInstrumentType" field
	 */
	public void setSBA_AssayInstrumentType(String value) {
		setField(SBA___ASSAY_INSTRUMENT_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_METHOD_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayMethodStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Method Status<br/>
	 * <br/>
	 * <b>Description</b>: New, Validation, or Approved
	 * 
	 * @return the value stored on the "SBA_AssayMethodStatus" field
	 */
	public String getSBA_AssayMethodStatus() {
		return getField(SBA___ASSAY_METHOD_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_METHOD_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayMethodStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Method Status<br/>
	 * <br/>
	 * <b>Description</b>: New, Validation, or Approved
	 * 
	 * @param value The value to set on the "SBA_AssayMethodStatus" field
	 */
	public void setSBA_AssayMethodStatus(String value) {
		setField(SBA___ASSAY_METHOD_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayType" field
	 */
	public String getSBA_AssayType() {
		return getField(SBA___ASSAY_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayType" field
	 */
	public void setSBA_AssayType(String value) {
		setField(SBA___ASSAY_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___BIOLOGICAL_MATRIX} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_BiologicalMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Biological Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_BiologicalMatrix" field
	 */
	public String getSBA_BiologicalMatrix() {
		return getField(SBA___BIOLOGICAL_MATRIX);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___BIOLOGICAL_MATRIX} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_BiologicalMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Biological Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_BiologicalMatrix" field
	 */
	public void setSBA_BiologicalMatrix(String value) {
		setField(SBA___BIOLOGICAL_MATRIX, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CVOF_LLOQSTD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfLLOQSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max LLOQ STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CVOfLLOQSTD" field
	 */
	public Double getSBA_CVOfLLOQSTD() {
		return getField(SBA___CVOF_LLOQSTD);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CVOF_LLOQSTD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfLLOQSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max LLOQ STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CVOfLLOQSTD" field
	 */
	public void setSBA_CVOfLLOQSTD(Double value) {
		setField(SBA___CVOF_LLOQSTD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CVOF_QC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfQC<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the control results if the cv % is larger than this value.
	 * 
	 * @return the value stored on the "SBA_CVOfQC" field
	 */
	public Double getSBA_CVOfQC() {
		return getField(SBA___CVOF_QC);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CVOF_QC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfQC<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the control results if the cv % is larger than this value.
	 * 
	 * @param value The value to set on the "SBA_CVOfQC" field
	 */
	public void setSBA_CVOfQC(Double value) {
		setField(SBA___CVOF_QC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CVOF_STD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis.  Can be used to enforce run acceptance if the run acceptance configuration is set up to do so.
	 * 
	 * @return the value stored on the "SBA_CVOfSTD" field
	 */
	public Double getSBA_CVOfSTD() {
		return getField(SBA___CVOF_STD);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CVOF_STD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfSTD<br/>
	 * <br/>
	 * <b>Display Name</b>: Max STD CV%<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis.  Can be used to enforce run acceptance if the run acceptance configuration is set up to do so.
	 * 
	 * @param value The value to set on the "SBA_CVOfSTD" field
	 */
	public void setSBA_CVOfSTD(Double value) {
		setField(SBA___CVOF_STD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CVOF_UNKNOWN_SAMPLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfUnknownSample<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% of Unk. Sample<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the sample results if the cv % is larger than this value.
	 * 
	 * @return the value stored on the "SBA_CVOfUnknownSample" field
	 */
	public Double getSBA_CVOfUnknownSample() {
		return getField(SBA___CVOF_UNKNOWN_SAMPLE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CVOF_UNKNOWN_SAMPLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVOfUnknownSample<br/>
	 * <br/>
	 * <b>Display Name</b>: Max CV% of Unk. Sample<br/>
	 * <br/>
	 * <b>Description</b>: Used during sample analysis to flag the sample results if the cv % is larger than this value.
	 * 
	 * @param value The value to set on the "SBA_CVOfUnknownSample" field
	 */
	public void setSBA_CVOfUnknownSample(Double value) {
		setField(SBA___CVOF_UNKNOWN_SAMPLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.CreatedBy" field
	 */
	public String getSBA_CalibrationCurveCriteriaCreatedBy() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.DataRecordName" field
	 */
	public String getSBA_CalibrationCurveCriteriaDataRecordName() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.DateCreated" field
	 */
	public Long getSBA_CalibrationCurveCriteriaDateCreated() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.RecordId" field
	 */
	public Long getSBA_CalibrationCurveCriteriaRecordId() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ" field
	 */
	public Double getSBA_CalibrationCurveCriteriaSBA_MaxMeanBiasForLLOQ() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForLLOQ" field
	 */
	public void setSBA_CalibrationCurveCriteriaSBA_MaxMeanBiasForLLOQ(Double value) {
		setField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_NON_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for non-LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ" field
	 */
	public Double getSBA_CalibrationCurveCriteriaSBA_MaxMeanBiasForNonLLOQ() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_NON_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_NON_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Mean Bias% for non-LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveCriteria.SBA_MaxMeanBiasForNonLLOQ" field
	 */
	public void setSBA_CalibrationCurveCriteriaSBA_MaxMeanBiasForNonLLOQ(Double value) {
		setField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MAX_MEAN_BIAS_FOR_NON_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_OF_STDLEVELS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels" field
	 */
	public Long getSBA_CalibrationCurveCriteriaSBA_MinOfSTDLevels() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_OF_STDLEVELS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_OF_STDLEVELS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveCriteria.SBA_MinOfSTDLevels" field
	 */
	public void setSBA_CalibrationCurveCriteriaSBA_MinOfSTDLevels(Long value) {
		setField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_OF_STDLEVELS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_PASS_RATE_PER_STDLEVEL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Pass Rate per STD Level<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel" field
	 */
	public Double getSBA_CalibrationCurveCriteriaSBA_MinPassRatePerSTDLevel() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_PASS_RATE_PER_STDLEVEL);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_PASS_RATE_PER_STDLEVEL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel<br/>
	 * <br/>
	 * <b>Display Name</b>: Min Pass Rate per STD Level<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveCriteria.SBA_MinPassRatePerSTDLevel" field
	 */
	public void setSBA_CalibrationCurveCriteriaSBA_MinPassRatePerSTDLevel(Double value) {
		setField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_PASS_RATE_PER_STDLEVEL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_STDPASS_RATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Min STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate" field
	 */
	public Double getSBA_CalibrationCurveCriteriaSBA_MinSTDPassRate() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_STDPASS_RATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_STDPASS_RATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Min STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveCriteria.SBA_MinSTDPassRate" field
	 */
	public void setSBA_CalibrationCurveCriteriaSBA_MinSTDPassRate(Double value) {
		setField(SBA___CALIBRATION_CURVE_CRITERIA_SBA___MIN_STDPASS_RATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_CalibrationCurveCriteriaVeloxLastModifiedBy() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_CalibrationCurveCriteriaVeloxLastModifiedDate() {
		return getField(SBA___CALIBRATION_CURVE_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.CreatedBy" field
	 */
	public String getSBA_CarryOverCriteriaCreatedBy() {
		return getField(SBA___CARRY_OVER_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.DataRecordName" field
	 */
	public String getSBA_CarryOverCriteriaDataRecordName() {
		return getField(SBA___CARRY_OVER_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.DateCreated" field
	 */
	public Long getSBA_CarryOverCriteriaDateCreated() {
		return getField(SBA___CARRY_OVER_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.RecordId" field
	 */
	public Long getSBA_CarryOverCriteriaRecordId() {
		return getField(SBA___CARRY_OVER_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALC_AREA_RATIO_CARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_CalcAreaRatioCarryover() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___CALC_AREA_RATIO_CARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALC_AREA_RATIO_CARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_CalcAreaRatioCarryover" field
	 */
	public void setSBA_CarryOverCriteriaSBA_CalcAreaRatioCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___CALC_AREA_RATIO_CARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALC_ISCARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_CalcISCarryover" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_CalcISCarryover() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___CALC_ISCARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALC_ISCARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_CalcISCarryover" field
	 */
	public void setSBA_CarryOverCriteriaSBA_CalcISCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___CALC_ISCARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALCULATE_PEAK_AREA_CARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_CalculatePeakAreaCarryover() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___CALCULATE_PEAK_AREA_CARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___CALCULATE_PEAK_AREA_CARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_CalculatePeakAreaCarryover" field
	 */
	public void setSBA_CarryOverCriteriaSBA_CalculatePeakAreaCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___CALCULATE_PEAK_AREA_CARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___ISBLANKS_IN_CALCULATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_ISBlanksInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Internal Standard Blanks In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_ISBlanksInCalculation" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_ISBlanksInCalculation() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___ISBLANKS_IN_CALCULATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___ISBLANKS_IN_CALCULATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_ISBlanksInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Internal Standard Blanks In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_ISBlanksInCalculation" field
	 */
	public void setSBA_CarryOverCriteriaSBA_ISBlanksInCalculation(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___ISBLANKS_IN_CALCULATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_IS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Internal Standard Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS" field
	 */
	public Double getSBA_CarryOverCriteriaSBA_MaxCarryoverAgainstIS() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_IS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_IS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Internal Standard Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstIS" field
	 */
	public void setSBA_CarryOverCriteriaSBA_MaxCarryoverAgainstIS(Double value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_IS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Peak Area Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ" field
	 */
	public Double getSBA_CarryOverCriteriaSBA_MaxCarryoverAgainstLLOQ() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Peak Area Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAgainstLLOQ" field
	 */
	public void setSBA_CarryOverCriteriaSBA_MaxCarryoverAgainstLLOQ(Double value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AGAINST_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AREA_RATIO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Area Ratio Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio" field
	 */
	public Double getSBA_CarryOverCriteriaSBA_MaxCarryoverAreaRatio() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AREA_RATIO);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AREA_RATIO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Area Ratio Carryover Percentage<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_MaxCarryoverAreaRatio" field
	 */
	public void setSBA_CarryOverCriteriaSBA_MaxCarryoverAreaRatio(Double value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___MAX_CARRYOVER_AREA_RATIO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___QC_IN_CALCULATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_QcInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use QC IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_QcInCalculation" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_QcInCalculation() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___QC_IN_CALCULATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___QC_IN_CALCULATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_QcInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use QC IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_QcInCalculation" field
	 */
	public void setSBA_CarryOverCriteriaSBA_QcInCalculation(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___QC_IN_CALCULATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___STANDARD_IN_CALCULATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_StandardInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Standard IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.SBA_StandardInCalculation" field
	 */
	public Boolean getSBA_CarryOverCriteriaSBA_StandardInCalculation() {
		return getField(SBA___CARRY_OVER_CRITERIA_SBA___STANDARD_IN_CALCULATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_SBA___STANDARD_IN_CALCULATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.SBA_StandardInCalculation<br/>
	 * <br/>
	 * <b>Display Name</b>: Use Standard IS Response In the IS Carryover Calculation<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over]
	 * 
	 * @param value The value to set on the "SBA_CarryOverCriteria.SBA_StandardInCalculation" field
	 */
	public void setSBA_CarryOverCriteriaSBA_StandardInCalculation(Boolean value) {
		setField(SBA___CARRY_OVER_CRITERIA_SBA___STANDARD_IN_CALCULATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_CarryOverCriteriaVeloxLastModifiedBy() {
		return getField(SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_CarryOverCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_CarryOverCriteriaVeloxLastModifiedDate() {
		return getField(SBA___CARRY_OVER_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CONCENTRATION_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ConcentrationUnits" field
	 */
	public String getSBA_ConcentrationUnits() {
		return getField(SBA___CONCENTRATION_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONCENTRATION_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Unit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ConcentrationUnits" field
	 */
	public void setSBA_ConcentrationUnits(String value) {
		setField(SBA___CONCENTRATION_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CUT_POINT_ACCEPTANCE_CRITERIA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointAcceptanceCriteria<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Acceptance Criteria<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CutPointAcceptanceCriteria" field
	 */
	public String getSBA_CutPointAcceptanceCriteria() {
		return getField(SBA___CUT_POINT_ACCEPTANCE_CRITERIA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CUT_POINT_ACCEPTANCE_CRITERIA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointAcceptanceCriteria<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Acceptance Criteria<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CutPointAcceptanceCriteria" field
	 */
	public void setSBA_CutPointAcceptanceCriteria(String value) {
		setField(SBA___CUT_POINT_ACCEPTANCE_CRITERIA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CUT_POINT_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointType<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CutPointType" field
	 */
	public String getSBA_CutPointType() {
		return getField(SBA___CUT_POINT_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CUT_POINT_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointType<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CutPointType" field
	 */
	public void setSBA_CutPointType(String value) {
		setField(SBA___CUT_POINT_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CUT_POINT_VALUE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Value<br/>
	 * <br/>
	 * <b>Description</b>: The value associated with the cut point type.  If the type requires a multiplier or offset then this represents the multiplier or offset respectively.  If the type of cut point is a fixed value then this is the cut point value.
	 * 
	 * @return the value stored on the "SBA_CutPointValue" field
	 */
	public Double getSBA_CutPointValue() {
		return getField(SBA___CUT_POINT_VALUE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CUT_POINT_VALUE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CutPointValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Value<br/>
	 * <br/>
	 * <b>Description</b>: The value associated with the cut point type.  If the type requires a multiplier or offset then this represents the multiplier or offset respectively.  If the type of cut point is a fixed value then this is the cut point value.
	 * 
	 * @param value The value to set on the "SBA_CutPointValue" field
	 */
	public void setSBA_CutPointValue(Double value) {
		setField(SBA___CUT_POINT_VALUE, value);
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
	 * Retrieves the value stored on the {@link #SBA___IS_TEMPLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_IsTemplate" field
	 */
	public Boolean getSBA_IsTemplate() {
		return getField(SBA___IS_TEMPLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___IS_TEMPLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_IsTemplate" field
	 */
	public void setSBA_IsTemplate(Boolean value) {
		setField(SBA___IS_TEMPLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MASTER_ASSAY_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MasterAssayName<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MasterAssayName" field
	 */
	public String getSBA_MasterAssayName() {
		return getField(SBA___MASTER_ASSAY_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MASTER_ASSAY_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MasterAssayName<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MasterAssayName" field
	 */
	public void setSBA_MasterAssayName(String value) {
		setField(SBA___MASTER_ASSAY_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MATERIAL_TYPES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MaterialTypes<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Types<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MaterialTypes" field
	 */
	public String getSBA_MaterialTypes() {
		return getField(SBA___MATERIAL_TYPES);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MATERIAL_TYPES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MaterialTypes<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Types<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MaterialTypes" field
	 */
	public void setSBA_MaterialTypes(String value) {
		setField(SBA___MATERIAL_TYPES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MIN_ISR_PASS_RATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MinIsrPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum ISR Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_MinIsrPassRate" field
	 */
	public Double getSBA_MinIsrPassRate() {
		return getField(SBA___MIN_ISR_PASS_RATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MIN_ISR_PASS_RATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MinIsrPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Minimum ISR Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_MinIsrPassRate" field
	 */
	public void setSBA_MinIsrPassRate(Double value) {
		setField(SBA___MIN_ISR_PASS_RATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.CreatedBy" field
	 */
	public String getSBA_RecoveryCriteriaCreatedBy() {
		return getField(SBA___RECOVERY_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.DataRecordName" field
	 */
	public String getSBA_RecoveryCriteriaDataRecordName() {
		return getField(SBA___RECOVERY_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.DateCreated" field
	 */
	public Long getSBA_RecoveryCriteriaDateCreated() {
		return getField(SBA___RECOVERY_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.RecordId" field
	 */
	public Long getSBA_RecoveryCriteriaRecordId() {
		return getField(SBA___RECOVERY_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_SBA___MAX_MIN_RECOVERY_DIFF_LIMIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff Limit<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit" field
	 */
	public Double getSBA_RecoveryCriteriaSBA_MaxMinRecoveryDiffLimit() {
		return getField(SBA___RECOVERY_CRITERIA_SBA___MAX_MIN_RECOVERY_DIFF_LIMIT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RECOVERY_CRITERIA_SBA___MAX_MIN_RECOVERY_DIFF_LIMIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff Limit<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 * 
	 * @param value The value to set on the "SBA_RecoveryCriteria.SBA_MaxMinRecoveryDiffLimit" field
	 */
	public void setSBA_RecoveryCriteriaSBA_MaxMinRecoveryDiffLimit(Double value) {
		setField(SBA___RECOVERY_CRITERIA_SBA___MAX_MIN_RECOVERY_DIFF_LIMIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_RecoveryCriteriaVeloxLastModifiedBy() {
		return getField(SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_RecoveryCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_RecoveryCriteriaVeloxLastModifiedDate() {
		return getField(SBA___RECOVERY_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___REQUIRED_VALIDATION_PARAM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RequiredValidationParam<br/>
	 * <br/>
	 * <b>Display Name</b>: Required Validation Parameters<br/>
	 * <br/>
	 * <b>Description</b>: Parameters that are required to be validated before this Assay Method can be approved.
	 * 
	 * @return the value stored on the "SBA_RequiredValidationParam" field
	 */
	public String getSBA_RequiredValidationParam() {
		return getField(SBA___REQUIRED_VALIDATION_PARAM);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___REQUIRED_VALIDATION_PARAM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RequiredValidationParam<br/>
	 * <br/>
	 * <b>Display Name</b>: Required Validation Parameters<br/>
	 * <br/>
	 * <b>Description</b>: Parameters that are required to be validated before this Assay Method can be approved.
	 * 
	 * @param value The value to set on the "SBA_RequiredValidationParam" field
	 */
	public void setSBA_RequiredValidationParam(String value) {
		setField(SBA___REQUIRED_VALIDATION_PARAM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RUN_ACCEPTANCE_CONFIG} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunAcceptanceConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Acceptance Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The run acceptance configuration that will be used during sample analysis to determine if the results for a given plate are acceptable.
	 * 
	 * @return the value stored on the "SBA_RunAcceptanceConfig" field
	 */
	public String getSBA_RunAcceptanceConfig() {
		return getField(SBA___RUN_ACCEPTANCE_CONFIG);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RUN_ACCEPTANCE_CONFIG} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunAcceptanceConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Acceptance Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The run acceptance configuration that will be used during sample analysis to determine if the results for a given plate are acceptable.
	 * 
	 * @param value The value to set on the "SBA_RunAcceptanceConfig" field
	 */
	public void setSBA_RunAcceptanceConfig(String value) {
		setField(SBA___RUN_ACCEPTANCE_CONFIG, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.CreatedBy" field
	 */
	public String getSBA_SelectivityCriteriaCreatedBy() {
		return getField(SBA___SELECTIVITY_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.DataRecordName" field
	 */
	public String getSBA_SelectivityCriteriaDataRecordName() {
		return getField(SBA___SELECTIVITY_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.DateCreated" field
	 */
	public Long getSBA_SelectivityCriteriaDateCreated() {
		return getField(SBA___SELECTIVITY_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.RecordId" field
	 */
	public Long getSBA_SelectivityCriteriaRecordId() {
		return getField(SBA___SELECTIVITY_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_ISRATIO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankISRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and BLANK_IS.
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.SBA_MaxBlankISRatio" field
	 */
	public Double getSBA_SelectivityCriteriaSBA_MaxBlankISRatio() {
		return getField(SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_ISRATIO);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_ISRATIO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankISRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and BLANK_IS.
	 * 
	 * @param value The value to set on the "SBA_SelectivityCriteria.SBA_MaxBlankISRatio" field
	 */
	public void setSBA_SelectivityCriteriaSBA_MaxBlankISRatio(Double value) {
		setField(SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_ISRATIO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_LLOQRATIO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and LLOQ.
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio" field
	 */
	public Double getSBA_SelectivityCriteriaSBA_MaxBlankLLOQRatio() {
		return getField(SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_LLOQRATIO);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_LLOQRATIO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Max %LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] The maximum ratio between BLANK and LLOQ.
	 * 
	 * @param value The value to set on the "SBA_SelectivityCriteria.SBA_MaxBlankLLOQRatio" field
	 */
	public void setSBA_SelectivityCriteriaSBA_MaxBlankLLOQRatio(Double value) {
		setField(SBA___SELECTIVITY_CRITERIA_SBA___MAX_BLANK_LLOQRATIO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MIN_NUM_OF_PASSED_SAMPLES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of Passed BLANK Samples<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] Min number of BLANK samples needed to pass evaluation
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples" field
	 */
	public Long getSBA_SelectivityCriteriaSBA_MinNumOfPassedSamples() {
		return getField(SBA___SELECTIVITY_CRITERIA_SBA___MIN_NUM_OF_PASSED_SAMPLES);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_SBA___MIN_NUM_OF_PASSED_SAMPLES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Min # of Passed BLANK Samples<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity] Min number of BLANK samples needed to pass evaluation
	 * 
	 * @param value The value to set on the "SBA_SelectivityCriteria.SBA_MinNumOfPassedSamples" field
	 */
	public void setSBA_SelectivityCriteriaSBA_MinNumOfPassedSamples(Long value) {
		setField(SBA___SELECTIVITY_CRITERIA_SBA___MIN_NUM_OF_PASSED_SAMPLES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_SelectivityCriteriaVeloxLastModifiedBy() {
		return getField(SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_SelectivityCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_SelectivityCriteriaVeloxLastModifiedDate() {
		return getField(SBA___SELECTIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.CreatedBy" field
	 */
	public String getSBA_SensitivityCriteriaCreatedBy() {
		return getField(SBA___SENSITIVITY_CRITERIA_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.DataRecordName" field
	 */
	public String getSBA_SensitivityCriteriaDataRecordName() {
		return getField(SBA___SENSITIVITY_CRITERIA_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.DateCreated" field
	 */
	public Long getSBA_SensitivityCriteriaDateCreated() {
		return getField(SBA___SENSITIVITY_CRITERIA_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.RecordId" field
	 */
	public Long getSBA_SensitivityCriteriaRecordId() {
		return getField(SBA___SENSITIVITY_CRITERIA_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_SBA___MAX_BIAS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.SBA_MaxBias<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity] The maximum Bias% from nominal value for any aliquot.
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.SBA_MaxBias" field
	 */
	public Double getSBA_SensitivityCriteriaSBA_MaxBias() {
		return getField(SBA___SENSITIVITY_CRITERIA_SBA___MAX_BIAS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_SBA___MAX_BIAS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.SBA_MaxBias<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias%<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity] The maximum Bias% from nominal value for any aliquot.
	 * 
	 * @param value The value to set on the "SBA_SensitivityCriteria.SBA_MaxBias" field
	 */
	public void setSBA_SensitivityCriteriaSBA_MaxBias(Double value) {
		setField(SBA___SENSITIVITY_CRITERIA_SBA___MAX_BIAS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.VeloxLastModifiedBy" field
	 */
	public String getSBA_SensitivityCriteriaVeloxLastModifiedBy() {
		return getField(SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityCriteria.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_SensitivityCriteria.VeloxLastModifiedDate" field
	 */
	public Long getSBA_SensitivityCriteriaVeloxLastModifiedDate() {
		return getField(SBA___SENSITIVITY_CRITERIA_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SIGNAL_NORMALIZATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalNormalization<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Normalization<br/>
	 * <br/>
	 * <b>Description</b>: Whether the signal values in Immunogenicity assay runs should be normalized and how to normalize them.
	 * 
	 * @return the value stored on the "SBA_SignalNormalization" field
	 */
	public String getSBA_SignalNormalization() {
		return getField(SBA___SIGNAL_NORMALIZATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SIGNAL_NORMALIZATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SignalNormalization<br/>
	 * <br/>
	 * <b>Display Name</b>: Signal Normalization<br/>
	 * <br/>
	 * <b>Description</b>: Whether the signal values in Immunogenicity assay runs should be normalized and how to normalize them.
	 * 
	 * @param value The value to set on the "SBA_SignalNormalization" field
	 */
	public void setSBA_SignalNormalization(String value) {
		setField(SBA___SIGNAL_NORMALIZATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SOURCE_TEMPLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SourceTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_SourceTemplate" field
	 */
	public Long getSBA_SourceTemplate() {
		return getField(SBA___SOURCE_TEMPLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SOURCE_TEMPLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SourceTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_SourceTemplate" field
	 */
	public void setSBA_SourceTemplate(Long value) {
		setField(SBA___SOURCE_TEMPLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SPECIES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_Species" field
	 */
	public String getSBA_Species() {
		return getField(SBA___SPECIES);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SPECIES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_Species" field
	 */
	public void setSBA_Species(String value) {
		setField(SBA___SPECIES, value);
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