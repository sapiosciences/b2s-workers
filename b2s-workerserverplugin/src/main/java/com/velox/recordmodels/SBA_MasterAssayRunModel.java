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
 * Automatically generated class for: Assay Run
 */
@ExemplarDataTypeModel(dataTypeName="SBA_MasterAssayRun")
public class SBA_MasterAssayRunModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_MasterAssayRun";

	/**
	 * <b>Data Field Name</b>: C_Approved<br/>
	 * <br/>
	 * <b>Display Name</b>: Approved?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___APPROVED = "C_Approved";

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
	 * <b>Data Field Name</b>: SBA_AssayCategory<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Category<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_CATEGORY = "SBA_AssayCategory";

	/**
	 * <b>Data Field Name</b>: SBA_AssayInstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_INSTRUMENT_TYPE = "SBA_AssayInstrumentType";

	/**
	 * <b>Data Field Name</b>: SBA_AssayRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_RUN_TYPE = "SBA_AssayRunType";

	/**
	 * <b>Data Field Name</b>: SBA_AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ASSAY_TYPE = "SBA_AssayType";

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
	 * <b>Data Field Name</b>: SBA_CompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___COMPLETED_BY = "SBA_CompletedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CutPointAcceptanceCriteria<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Acceptance Criteria<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CUT_POINT_ACCEPTANCE_CRITERIA = "SBA_CutPointAcceptanceCriteria";

	/**
	 * <b>Data Field Name</b>: SBA_CutPointValue<br/>
	 * <br/>
	 * <b>Display Name</b>: Cut Point Value<br/>
	 * <br/>
	 * <b>Description</b>: The value associated with the cut point type.  If the type requires a multiplier or offset then this represents the multiplier or offset respectively.  If the type of cut point is a fixed value then this is the cut point value.
	 */
	public static final String SBA___CUT_POINT_VALUE = "SBA_CutPointValue";

	/**
	 * <b>Data Field Name</b>: SBA_DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___DATE_COMPLETED = "SBA_DateCompleted";

	/**
	 * <b>Data Field Name</b>: SBA_Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information about this validation run. For example, if this is Freeze-thaw stability or Stock Solution stablity.
	 */
	public static final String SBA___DESCRIPTION = "SBA_Description";

	/**
	 * <b>Data Field Name</b>: SBA_Instrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___INSTRUMENT = "SBA_Instrument";

	/**
	 * <b>Data Field Name</b>: SBA_InstrumentOutputDataType<br/>
	 * <br/>
	 * <b>Display Name</b>: Output Mode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___INSTRUMENT_OUTPUT_DATA_TYPE = "SBA_InstrumentOutputDataType";

	/**
	 * <b>Data Field Name</b>: SBA_IsPlatingComplete<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Plating Complete<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___IS_PLATING_COMPLETE = "SBA_IsPlatingComplete";

	/**
	 * <b>Data Field Name</b>: SBA_MaxQCCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Common]The maximum value of CV% across replicates for each QC sample.
	 */
	public static final String SBA___MAX_QCCV = "SBA_MaxQCCV";

	/**
	 * <b>Data Field Name</b>: SBA_OverrideComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Comment<br/>
	 * <br/>
	 * <b>Description</b>: The comment that was captured when this record's validation result was modified
	 */
	public static final String SBA___OVERRIDE_COMMENT = "SBA_OverrideComment";

	/**
	 * <b>Data Field Name</b>: SBA_OverrideCutPoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Cut Point<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___OVERRIDE_CUT_POINT = "SBA_OverrideCutPoint";

	/**
	 * <b>Data Field Name</b>: SBA_ParameterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Parameter Name<br/>
	 * <br/>
	 * <b>Description</b>: The parameter name of the validation
	 */
	public static final String SBA___PARAMETER_NAME = "SBA_ParameterName";

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
	 * <b>Data Field Name</b>: SBA_RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___RUN_ID = "SBA_RunId";

	/**
	 * <b>Data Field Name</b>: SBA_RunResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 */
	public static final String SBA___RUN_RESULT = "SBA_RunResult";

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
	 * <b>Data Field Name</b>: SBA_ValidatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___VALIDATED_BY = "SBA_ValidatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this record was created
	 */
	public static final String SBA___VALIDATION_DATE = "SBA_ValidationDate";

	/**
	 * <b>Data Field Name</b>: SBA_ValidationParameter<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Parameter<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___VALIDATION_PARAMETER = "SBA_ValidationParameter";

	/**
	 * <b>Data Field Name</b>: SBA_ValidationResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 */
	public static final String SBA___VALIDATION_RESULT = "SBA_ValidationResult";

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

	protected SBA_MasterAssayRunModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___APPROVED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Approved<br/>
	 * <br/>
	 * <b>Display Name</b>: Approved?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Approved" field
	 */
	public Boolean getC_Approved() {
		return getField(C___APPROVED);
	}
	
	/**
	 * Sets the value stored on the {@link #C___APPROVED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Approved<br/>
	 * <br/>
	 * <b>Display Name</b>: Approved?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Approved" field
	 */
	public void setC_Approved(Boolean value) {
		setField(C___APPROVED, value);
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
	 * Retrieves the value stored on the {@link #SBA___ASSAY_RUN_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AssayRunType" field
	 */
	public String getSBA_AssayRunType() {
		return getField(SBA___ASSAY_RUN_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_RUN_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AssayRunType" field
	 */
	public void setSBA_AssayRunType(String value) {
		setField(SBA___ASSAY_RUN_TYPE, value);
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
	 * Retrieves the value stored on the {@link #SBA___COMPLETED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CompletedBy" field
	 */
	public String getSBA_CompletedBy() {
		return getField(SBA___COMPLETED_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___COMPLETED_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CompletedBy" field
	 */
	public void setSBA_CompletedBy(String value) {
		setField(SBA___COMPLETED_BY, value);
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
	 * Retrieves the value stored on the {@link #SBA___DATE_COMPLETED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_DateCompleted" field
	 */
	public Long getSBA_DateCompleted() {
		return getField(SBA___DATE_COMPLETED);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___DATE_COMPLETED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_DateCompleted" field
	 */
	public void setSBA_DateCompleted(Long value) {
		setField(SBA___DATE_COMPLETED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___DESCRIPTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information about this validation run. For example, if this is Freeze-thaw stability or Stock Solution stablity.
	 * 
	 * @return the value stored on the "SBA_Description" field
	 */
	public String getSBA_Description() {
		return getField(SBA___DESCRIPTION);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___DESCRIPTION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information about this validation run. For example, if this is Freeze-thaw stability or Stock Solution stablity.
	 * 
	 * @param value The value to set on the "SBA_Description" field
	 */
	public void setSBA_Description(String value) {
		setField(SBA___DESCRIPTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___INSTRUMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Instrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_Instrument" field
	 */
	public String getSBA_Instrument() {
		return getField(SBA___INSTRUMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___INSTRUMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Instrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_Instrument" field
	 */
	public void setSBA_Instrument(String value) {
		setField(SBA___INSTRUMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___INSTRUMENT_OUTPUT_DATA_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_InstrumentOutputDataType<br/>
	 * <br/>
	 * <b>Display Name</b>: Output Mode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_InstrumentOutputDataType" field
	 */
	public String getSBA_InstrumentOutputDataType() {
		return getField(SBA___INSTRUMENT_OUTPUT_DATA_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___INSTRUMENT_OUTPUT_DATA_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_InstrumentOutputDataType<br/>
	 * <br/>
	 * <b>Display Name</b>: Output Mode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_InstrumentOutputDataType" field
	 */
	public void setSBA_InstrumentOutputDataType(String value) {
		setField(SBA___INSTRUMENT_OUTPUT_DATA_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___IS_PLATING_COMPLETE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsPlatingComplete<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Plating Complete<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_IsPlatingComplete" field
	 */
	public Boolean getSBA_IsPlatingComplete() {
		return getField(SBA___IS_PLATING_COMPLETE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___IS_PLATING_COMPLETE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_IsPlatingComplete<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Plating Complete<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_IsPlatingComplete" field
	 */
	public void setSBA_IsPlatingComplete(Boolean value) {
		setField(SBA___IS_PLATING_COMPLETE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MAX_QCCV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MaxQCCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Common]The maximum value of CV% across replicates for each QC sample.
	 * 
	 * @return the value stored on the "SBA_MaxQCCV" field
	 */
	public Double getSBA_MaxQCCV() {
		return getField(SBA___MAX_QCCV);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MAX_QCCV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_MaxQCCV<br/>
	 * <br/>
	 * <b>Display Name</b>: Max QC CV%<br/>
	 * <br/>
	 * <b>Description</b>: [Common]The maximum value of CV% across replicates for each QC sample.
	 * 
	 * @param value The value to set on the "SBA_MaxQCCV" field
	 */
	public void setSBA_MaxQCCV(Double value) {
		setField(SBA___MAX_QCCV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___OVERRIDE_COMMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OverrideComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Comment<br/>
	 * <br/>
	 * <b>Description</b>: The comment that was captured when this record's validation result was modified
	 * 
	 * @return the value stored on the "SBA_OverrideComment" field
	 */
	public String getSBA_OverrideComment() {
		return getField(SBA___OVERRIDE_COMMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___OVERRIDE_COMMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OverrideComment<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Comment<br/>
	 * <br/>
	 * <b>Description</b>: The comment that was captured when this record's validation result was modified
	 * 
	 * @param value The value to set on the "SBA_OverrideComment" field
	 */
	public void setSBA_OverrideComment(String value) {
		setField(SBA___OVERRIDE_COMMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___OVERRIDE_CUT_POINT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OverrideCutPoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Cut Point<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_OverrideCutPoint" field
	 */
	public Boolean getSBA_OverrideCutPoint() {
		return getField(SBA___OVERRIDE_CUT_POINT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___OVERRIDE_CUT_POINT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_OverrideCutPoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Override Cut Point<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_OverrideCutPoint" field
	 */
	public void setSBA_OverrideCutPoint(Boolean value) {
		setField(SBA___OVERRIDE_CUT_POINT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___PARAMETER_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ParameterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Parameter Name<br/>
	 * <br/>
	 * <b>Description</b>: The parameter name of the validation
	 * 
	 * @return the value stored on the "SBA_ParameterName" field
	 */
	public String getSBA_ParameterName() {
		return getField(SBA___PARAMETER_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___PARAMETER_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ParameterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Parameter Name<br/>
	 * <br/>
	 * <b>Description</b>: The parameter name of the validation
	 * 
	 * @param value The value to set on the "SBA_ParameterName" field
	 */
	public void setSBA_ParameterName(String value) {
		setField(SBA___PARAMETER_NAME, value);
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
	 * Retrieves the value stored on the {@link #SBA___RUN_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_RunId" field
	 */
	public String getSBA_RunId() {
		return getField(SBA___RUN_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RUN_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_RunId" field
	 */
	public void setSBA_RunId(String value) {
		setField(SBA___RUN_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RUN_RESULT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 * 
	 * @return the value stored on the "SBA_RunResult" field
	 */
	public String getSBA_RunResult() {
		return getField(SBA___RUN_RESULT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RUN_RESULT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RunResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 * 
	 * @param value The value to set on the "SBA_RunResult" field
	 */
	public void setSBA_RunResult(String value) {
		setField(SBA___RUN_RESULT, value);
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
	 * Retrieves the value stored on the {@link #SBA___VALIDATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_ValidatedBy" field
	 */
	public String getSBA_ValidatedBy() {
		return getField(SBA___VALIDATED_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___VALIDATED_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @param value The value to set on the "SBA_ValidatedBy" field
	 */
	public void setSBA_ValidatedBy(String value) {
		setField(SBA___VALIDATED_BY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___VALIDATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this record was created
	 * 
	 * @return the value stored on the "SBA_ValidationDate" field
	 */
	public Long getSBA_ValidationDate() {
		return getField(SBA___VALIDATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___VALIDATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this record was created
	 * 
	 * @param value The value to set on the "SBA_ValidationDate" field
	 */
	public void setSBA_ValidationDate(Long value) {
		setField(SBA___VALIDATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___VALIDATION_PARAMETER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationParameter<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Parameter<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_ValidationParameter" field
	 */
	public String getSBA_ValidationParameter() {
		return getField(SBA___VALIDATION_PARAMETER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___VALIDATION_PARAMETER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationParameter<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Parameter<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_ValidationParameter" field
	 */
	public void setSBA_ValidationParameter(String value) {
		setField(SBA___VALIDATION_PARAMETER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___VALIDATION_RESULT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 * 
	 * @return the value stored on the "SBA_ValidationResult" field
	 */
	public String getSBA_ValidationResult() {
		return getField(SBA___VALIDATION_RESULT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___VALIDATION_RESULT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ValidationResult<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Result<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject
	 * 
	 * @param value The value to set on the "SBA_ValidationResult" field
	 */
	public void setSBA_ValidationResult(String value) {
		setField(SBA___VALIDATION_RESULT, value);
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