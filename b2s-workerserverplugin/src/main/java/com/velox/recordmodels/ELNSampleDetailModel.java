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
 * Automatically generated class for: Sample Detail
 */
@ExemplarDataTypeModel(dataTypeName="ELNSampleDetail")
public class ELNSampleDetailModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "ELNSampleDetail";

	/**
	 * <b>Data Field Name</b>: BiotinIncorporation<br/>
	 * <br/>
	 * <b>Display Name</b>: Biotin Incorporation #<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String BIOTIN_INCORPORATION = "BiotinIncorporation";

	/**
	 * <b>Data Field Name</b>: BufferExchangeMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Checkbox to route to Dialysis or Prep HPLC.
	 */
	public static final String BUFFER_EXCHANGE_METHOD = "BufferExchangeMethod";

	/**
	 * <b>Data Field Name</b>: ChallengeRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Challenge Ratio<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHALLENGE_RATIO = "ChallengeRatio";

	/**
	 * <b>Data Field Name</b>: Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: The bounds for this sample.
	 */
	public static final String CI_95_BOUNDS = "Ci95Bounds";

	/**
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: Deprecated
	 */
	public static final String COL_POSITION = "ColPosition";

	/**
	 * <b>Data Field Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CONCENTRATION = "Concentration";

	/**
	 * <b>Data Field Name</b>: ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: Used for Aliquoting to Designate the type of control to create.
	 */
	public static final String CONTROL_TYPE = "ControlType";

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
	 * <b>Data Field Name</b>: DataTypeId<br/>
	 * <br/>
	 * <b>Display Name</b>: Data Type ID<br/>
	 * <br/>
	 * <b>Description</b>: The Data Type ID of this E-Notebook data type data record.
	 */
	public static final String DATA_TYPE_ID = "DataTypeId";

	/**
	 * <b>Data Field Name</b>: DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DATE_CREATED = "DateCreated";

	/**
	 * <b>Data Field Name</b>: DesaltingColumn<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Used for routing the sample to the Prep HPLC (SEC) template
	 */
	public static final String DESALTING_COLUMN = "DesaltingColumn";

	/**
	 * <b>Data Field Name</b>: DiluentToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Diluent To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of diluent volume to use.
	 */
	public static final String DILUENT_TO_USE = "DiluentToUse";

	/**
	 * <b>Data Field Name</b>: DilutionFactor2<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DILUTION_FACTOR_2 = "DilutionFactor2";

	/**
	 * <b>Data Field Name</b>: EditableOtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this samples.
	 */
	public static final String EDITABLE_OTHER_SAMPLE_ID = "EditableOtherSampleId";

	/**
	 * <b>Data Field Name</b>: ExcludeFromTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude From Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String EXCLUDE_FROM_TITER = "ExcludeFromTiter";

	/**
	 * <b>Data Field Name</b>: ExcludeforAnalyticalSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude for Analytical SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String EXCLUDEFOR_ANALYTICAL_SEC = "ExcludeforAnalyticalSEC";

	/**
	 * <b>Data Field Name</b>: ExistingPlateRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Existing Plate Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The record ID of a plate already existing for this sample.
	 */
	public static final String EXISTING_PLATE_RECORD_ID = "ExistingPlateRecordId";

	/**
	 * <b>Data Field Name</b>: FinalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_AMOUNT = "FinalAmount";

	/**
	 * <b>Data Field Name</b>: FinalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_CONCENTRATION = "FinalConcentration";

	/**
	 * <b>Data Field Name</b>: FinalStorageBuffer<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Storage Buffer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_STORAGE_BUFFER = "FinalStorageBuffer";

	/**
	 * <b>Data Field Name</b>: FinalTotalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Total Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_TOTAL_AMOUNT = "FinalTotalAmount";

	/**
	 * <b>Data Field Name</b>: FinalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_VOLUME = "FinalVolume";

	/**
	 * <b>Data Field Name</b>: FlowCellLaneAssigment<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell Lane Assigment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FLOW_CELL_LANE_ASSIGMENT = "FlowCellLaneAssigment";

	/**
	 * <b>Data Field Name</b>: Hit<br/>
	 * <br/>
	 * <b>Display Name</b>: Hit<br/>
	 * <br/>
	 * <b>Description</b>: Whether this sample is a hit to progress further in the screening process.
	 */
	public static final String HIT = "Hit";

	/**
	 * <b>Data Field Name</b>: IndexId<br/>
	 * <br/>
	 * <b>Display Name</b>: Index ID<br/>
	 * <br/>
	 * <b>Description</b>: Identifier for this Index Tag sequence. (E.g. AG001 for an Agilent index.)
	 */
	public static final String INDEX_ID = "IndexId";

	/**
	 * <b>Data Field Name</b>: IndexTag<br/>
	 * <br/>
	 * <b>Display Name</b>: Index Tag<br/>
	 * <br/>
	 * <b>Description</b>: The barcode sequence for this Index. (E.g. ATCGAT)
	 */
	public static final String INDEX_TAG = "IndexTag";

	/**
	 * <b>Data Field Name</b>: InputAssignmentRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Input Assignment Record ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is a reference to the record used to assign the Index to the sample via the assignment GUI. Typically this will be the record ID of an Index Assignment record.
	 */
	public static final String INPUT_ASSIGNMENT_RECORD_ID = "InputAssignmentRecordId";

	/**
	 * <b>Data Field Name</b>: IsNewControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is New Control?<br/>
	 * <br/>
	 * <b>Description</b>: This indicates if this row represents a new control.
	 */
	public static final String IS_NEW_CONTROL = "IsNewControl";

	/**
	 * <b>Data Field Name</b>: LowerCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Lower CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The lower bounds for this sample.
	 */
	public static final String LOWER_CI_95 = "LowerCi95";

	/**
	 * <b>Data Field Name</b>: MainPeakArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Main Peak Area<br/>
	 * <br/>
	 * <b>Description</b>: Field to manually enter the Main Peak Area results for analytical HPLC (SEC).
	 */
	public static final String MAIN_PEAK_AREA = "MainPeakArea";

	/**
	 * <b>Data Field Name</b>: MultiplexInstructions<br/>
	 * <br/>
	 * <b>Display Name</b>: Multiplex Instructions<br/>
	 * <br/>
	 * <b>Description</b>: The multiplex instructions from the sample if it had any assigned. This field requires a tag to populate it.
	 */
	public static final String MULTIPLEX_INSTRUCTIONS = "MultiplexInstructions";

	/**
	 * <b>Data Field Name</b>: NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of aliquoting replicates to make.
	 */
	public static final String NUMBER_OF_REPLICATES = "NumberOfReplicates";

	/**
	 * <b>Data Field Name</b>: NumberOfReplicatesNotEditable<br/>
	 * <br/>
	 * <b>Display Name</b>: Number of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of replicates to create for this sample.
	 */
	public static final String NUMBER_OF_REPLICATES_NOT_EDITABLE = "NumberOfReplicatesNotEditable";

	/**
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The Sample Name of this E-Notebook Sample Details data type.
	 */
	public static final String OTHER_SAMPLE_ID = "OtherSampleId";

	/**
	 * <b>Data Field Name</b>: PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: The ID of the plate for this sample.
	 */
	public static final String PLATE_ID = "PlateId";

	/**
	 * <b>Data Field Name</b>: Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PURITY = "Purity";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RoutetoDialysis<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Dialysis<br/>
	 * <br/>
	 * <b>Description</b>: Field to trigger routing to buffer exchange by dialysis.
	 */
	public static final String ROUTETO_DIALYSIS = "RoutetoDialysis";

	/**
	 * <b>Data Field Name</b>: RoutetoTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Titer?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ROUTETO_TITER = "RoutetoTiter";

	/**
	 * <b>Data Field Name</b>: RouttoFinalPooling<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Final Pooling?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ROUTTO_FINAL_POOLING = "RouttoFinalPooling";

	/**
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the sample that this Index was assigned to.
	 */
	public static final String ROW_POSITION = "RowPosition";

	/**
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: The Sample ID of this E-Notebook Sample Details data type.
	 */
	public static final String SAMPLE_ID = "SampleId";

	/**
	 * <b>Data Field Name</b>: SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean of this sample.
	 */
	public static final String SAMPLE_MEAN = "SampleMean";

	/**
	 * <b>Data Field Name</b>: SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: The normalized mean of this sample.
	 */
	public static final String SAMPLE_NORMALIZED_MEAN = "SampleNormalizedMean";

	/**
	 * <b>Data Field Name</b>: SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: The STD of this sample.
	 */
	public static final String SAMPLE_STD = "SampleStd";

	/**
	 * <b>Data Field Name</b>: SampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of sample being used.
	 */
	public static final String SAMPLE_TYPE = "SampleType";

	/**
	 * <b>Data Field Name</b>: SelectedForTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SELECTED_FOR_TITER = "SelectedForTiter";

	/**
	 * <b>Data Field Name</b>: SelectedforSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected for SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SELECTEDFOR_SEC = "SelectedforSEC";

	/**
	 * <b>Data Field Name</b>: SendtoPreparativeHPLC<br/>
	 * <br/>
	 * <b>Display Name</b>: Send to Preparative HPLC?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SENDTO_PREPARATIVE_HPLC = "SendtoPreparativeHPLC";

	/**
	 * <b>Data Field Name</b>: SkipBufferExchange<br/>
	 * <br/>
	 * <b>Display Name</b>: Skip Buffer Exchange?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SKIP_BUFFER_EXCHANGE = "SkipBufferExchange";

	/**
	 * <b>Data Field Name</b>: SourceConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The original concentration of the source sample prior to creating the aliquot.
	 */
	public static final String SOURCE_CONCENTRATION = "SourceConcentration";

	/**
	 * <b>Data Field Name</b>: SourceMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass<br/>
	 * <br/>
	 * <b>Description</b>: The original mass of the source sample prior to creating the aliquot. This is a product of the source volume and source concentration.
	 */
	public static final String SOURCE_MASS = "SourceMass";

	/**
	 * <b>Data Field Name</b>: SourceMassToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of mass to use from the source sample to create the aliquot.
	 */
	public static final String SOURCE_MASS_TO_USE = "SourceMassToUse";

	/**
	 * <b>Data Field Name</b>: SourcePlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Plate<br/>
	 * <br/>
	 * <b>Description</b>: The source plate of the samples.
	 */
	public static final String SOURCE_PLATE = "SourcePlate";

	/**
	 * <b>Data Field Name</b>: SourcePosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Position<br/>
	 * <br/>
	 * <b>Description</b>: The location(A1,A2, etc) if any of the source sample. A1 is the top-left most location in an object.
	 */
	public static final String SOURCE_POSITION = "SourcePosition";

	/**
	 * <b>Data Field Name</b>: SourceVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume<br/>
	 * <br/>
	 * <b>Description</b>: The original volume of the source sample prior to creating the aliquot.
	 */
	public static final String SOURCE_VOLUME = "SourceVolume";

	/**
	 * <b>Data Field Name</b>: SourceVolumeToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of volume to use from the source sample to create the aliquot.
	 */
	public static final String SOURCE_VOLUME_TO_USE = "SourceVolumeToUse";

	/**
	 * <b>Data Field Name</b>: StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: The STDER of this sample.
	 */
	public static final String STANDARD_ERROR = "StandardError";

	/**
	 * <b>Data Field Name</b>: TargetConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent.
	 */
	public static final String TARGET_CONCENTRATION = "TargetConcentration";

	/**
	 * <b>Data Field Name</b>: TargetConcentrationRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent. (Required)
	 */
	public static final String TARGET_CONCENTRATION_REQUIRED = "TargetConcentrationRequired";

	/**
	 * <b>Data Field Name</b>: TargetMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Mass<br/>
	 * <br/>
	 * <b>Description</b>: The resulting mass of the aliquot. This is a product of target volume and target concentration.
	 */
	public static final String TARGET_MASS = "TargetMass";

	/**
	 * <b>Data Field Name</b>: TargetPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Plate<br/>
	 * <br/>
	 * <b>Description</b>: The Plate Id of that the resulting aliquot is on. May be accessioned automatically.
	 */
	public static final String TARGET_PLATE = "TargetPlate";

	/**
	 * <b>Data Field Name</b>: TargetPool<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Pool<br/>
	 * <br/>
	 * <b>Description</b>: The Pool Id of the resulting aliquot.
	 */
	public static final String TARGET_POOL = "TargetPool";

	/**
	 * <b>Data Field Name</b>: TargetPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Position<br/>
	 * <br/>
	 * <b>Description</b>: The target location (A1, A2, etc) of the resulting aliquot.
	 */
	public static final String TARGET_POSITION = "TargetPosition";

	/**
	 * <b>Data Field Name</b>: TargetTank<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Tank<br/>
	 * <br/>
	 * <b>Description</b>: The tank to use for this sample in screening.
	 */
	public static final String TARGET_TANK = "TargetTank";

	/**
	 * <b>Data Field Name</b>: TargetVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use.
	 */
	public static final String TARGET_VOLUME = "TargetVolume";

	/**
	 * <b>Data Field Name</b>: TargetVolumeRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use. (Required)
	 */
	public static final String TARGET_VOLUME_REQUIRED = "TargetVolumeRequired";

	/**
	 * <b>Data Field Name</b>: TempC<br/>
	 * <br/>
	 * <b>Display Name</b>: Temp (C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TEMP_C = "TempC";

	/**
	 * <b>Data Field Name</b>: Timemin<br/>
	 * <br/>
	 * <b>Display Name</b>: Time (min)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TIMEMIN = "Timemin";

	/**
	 * <b>Data Field Name</b>: TotalMassFormula<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TOTAL_MASS_FORMULA = "TotalMassFormula";

	/**
	 * <b>Data Field Name</b>: TotalMassmg2<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TOTAL_MASSMG_2 = "TotalMassmg2";

	/**
	 * <b>Data Field Name</b>: TotalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TOTAL_VOLUME = "TotalVolume";

	/**
	 * <b>Data Field Name</b>: UpperCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Upper CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The upper bounds for this sample.
	 */
	public static final String UPPER_CI_95 = "UpperCi95";

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

	protected ELNSampleDetailModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIOTIN_INCORPORATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BiotinIncorporation<br/>
	 * <br/>
	 * <b>Display Name</b>: Biotin Incorporation #<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "BiotinIncorporation" field
	 */
	public Double getBiotinIncorporation() {
		return getField(BIOTIN_INCORPORATION);
	}
	
	/**
	 * Sets the value stored on the {@link #BIOTIN_INCORPORATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BiotinIncorporation<br/>
	 * <br/>
	 * <b>Display Name</b>: Biotin Incorporation #<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "BiotinIncorporation" field
	 */
	public void setBiotinIncorporation(Double value) {
		setField(BIOTIN_INCORPORATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BUFFER_EXCHANGE_METHOD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BufferExchangeMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Checkbox to route to Dialysis or Prep HPLC.
	 * 
	 * @return the value stored on the "BufferExchangeMethod" field
	 */
	public Boolean getBufferExchangeMethod() {
		return getField(BUFFER_EXCHANGE_METHOD);
	}
	
	/**
	 * Sets the value stored on the {@link #BUFFER_EXCHANGE_METHOD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BufferExchangeMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Checkbox to route to Dialysis or Prep HPLC.
	 * 
	 * @param value The value to set on the "BufferExchangeMethod" field
	 */
	public void setBufferExchangeMethod(Boolean value) {
		setField(BUFFER_EXCHANGE_METHOD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHALLENGE_RATIO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChallengeRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Challenge Ratio<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChallengeRatio" field
	 */
	public Double getChallengeRatio() {
		return getField(CHALLENGE_RATIO);
	}
	
	/**
	 * Sets the value stored on the {@link #CHALLENGE_RATIO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChallengeRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Challenge Ratio<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChallengeRatio" field
	 */
	public void setChallengeRatio(Double value) {
		setField(CHALLENGE_RATIO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CI_95_BOUNDS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: The bounds for this sample.
	 * 
	 * @return the value stored on the "Ci95Bounds" field
	 */
	public Double getCi95Bounds() {
		return getField(CI_95_BOUNDS);
	}
	
	/**
	 * Sets the value stored on the {@link #CI_95_BOUNDS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: The bounds for this sample.
	 * 
	 * @param value The value to set on the "Ci95Bounds" field
	 */
	public void setCi95Bounds(Double value) {
		setField(CI_95_BOUNDS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COL_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: Deprecated
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
	 * <b>Description</b>: Deprecated
	 * 
	 * @param value The value to set on the "ColPosition" field
	 */
	public void setColPosition(String value) {
		setField(COL_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Concentration" field
	 */
	public Double getConcentration() {
		return getField(CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Concentration" field
	 */
	public void setConcentration(Double value) {
		setField(CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONTROL_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: Used for Aliquoting to Designate the type of control to create.
	 * 
	 * @return the value stored on the "ControlType" field
	 */
	public String getControlType() {
		return getField(CONTROL_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONTROL_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: Used for Aliquoting to Designate the type of control to create.
	 * 
	 * @param value The value to set on the "ControlType" field
	 */
	public void setControlType(String value) {
		setField(CONTROL_TYPE, value);
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
	 * Retrieves the value stored on the {@link #DATA_TYPE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DataTypeId<br/>
	 * <br/>
	 * <b>Display Name</b>: Data Type ID<br/>
	 * <br/>
	 * <b>Description</b>: The Data Type ID of this E-Notebook data type data record.
	 * 
	 * @return the value stored on the "DataTypeId" field
	 */
	public Long getDataTypeId() {
		return getField(DATA_TYPE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #DATA_TYPE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DataTypeId<br/>
	 * <br/>
	 * <b>Display Name</b>: Data Type ID<br/>
	 * <br/>
	 * <b>Description</b>: The Data Type ID of this E-Notebook data type data record.
	 * 
	 * @param value The value to set on the "DataTypeId" field
	 */
	public void setDataTypeId(Long value) {
		setField(DATA_TYPE_ID, value);
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
	 * Retrieves the value stored on the {@link #DESALTING_COLUMN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DesaltingColumn<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Used for routing the sample to the Prep HPLC (SEC) template
	 * 
	 * @return the value stored on the "DesaltingColumn" field
	 */
	public Boolean getDesaltingColumn() {
		return getField(DESALTING_COLUMN);
	}
	
	/**
	 * Sets the value stored on the {@link #DESALTING_COLUMN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DesaltingColumn<br/>
	 * <br/>
	 * <b>Display Name</b>: Desalting Column<br/>
	 * <br/>
	 * <b>Description</b>: Used for routing the sample to the Prep HPLC (SEC) template
	 * 
	 * @param value The value to set on the "DesaltingColumn" field
	 */
	public void setDesaltingColumn(Boolean value) {
		setField(DESALTING_COLUMN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DILUENT_TO_USE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DiluentToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Diluent To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of diluent volume to use.
	 * 
	 * @return the value stored on the "DiluentToUse" field
	 */
	public Double getDiluentToUse() {
		return getField(DILUENT_TO_USE);
	}
	
	/**
	 * Sets the value stored on the {@link #DILUENT_TO_USE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DiluentToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Diluent To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of diluent volume to use.
	 * 
	 * @param value The value to set on the "DiluentToUse" field
	 */
	public void setDiluentToUse(Double value) {
		setField(DILUENT_TO_USE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DILUTION_FACTOR_2} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DilutionFactor2<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DilutionFactor2" field
	 */
	public Double getDilutionFactor2() {
		return getField(DILUTION_FACTOR_2);
	}
	
	/**
	 * Sets the value stored on the {@link #DILUTION_FACTOR_2} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DilutionFactor2<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DilutionFactor2" field
	 */
	public void setDilutionFactor2(Double value) {
		setField(DILUTION_FACTOR_2, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EDITABLE_OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EditableOtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this samples.
	 * 
	 * @return the value stored on the "EditableOtherSampleId" field
	 */
	public String getEditableOtherSampleId() {
		return getField(EDITABLE_OTHER_SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #EDITABLE_OTHER_SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EditableOtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this samples.
	 * 
	 * @param value The value to set on the "EditableOtherSampleId" field
	 */
	public void setEditableOtherSampleId(String value) {
		setField(EDITABLE_OTHER_SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXCLUDE_FROM_TITER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExcludeFromTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude From Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ExcludeFromTiter" field
	 */
	public Boolean getExcludeFromTiter() {
		return getField(EXCLUDE_FROM_TITER);
	}
	
	/**
	 * Sets the value stored on the {@link #EXCLUDE_FROM_TITER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExcludeFromTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude From Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ExcludeFromTiter" field
	 */
	public void setExcludeFromTiter(Boolean value) {
		setField(EXCLUDE_FROM_TITER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXCLUDEFOR_ANALYTICAL_SEC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExcludeforAnalyticalSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude for Analytical SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ExcludeforAnalyticalSEC" field
	 */
	public Boolean getExcludeforAnalyticalSEC() {
		return getField(EXCLUDEFOR_ANALYTICAL_SEC);
	}
	
	/**
	 * Sets the value stored on the {@link #EXCLUDEFOR_ANALYTICAL_SEC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExcludeforAnalyticalSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Exclude for Analytical SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ExcludeforAnalyticalSEC" field
	 */
	public void setExcludeforAnalyticalSEC(Boolean value) {
		setField(EXCLUDEFOR_ANALYTICAL_SEC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXISTING_PLATE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExistingPlateRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Existing Plate Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The record ID of a plate already existing for this sample.
	 * 
	 * @return the value stored on the "ExistingPlateRecordId" field
	 */
	public Long getExistingPlateRecordId() {
		return getField(EXISTING_PLATE_RECORD_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #EXISTING_PLATE_RECORD_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExistingPlateRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Existing Plate Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The record ID of a plate already existing for this sample.
	 * 
	 * @param value The value to set on the "ExistingPlateRecordId" field
	 */
	public void setExistingPlateRecordId(Long value) {
		setField(EXISTING_PLATE_RECORD_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_AMOUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalAmount" field
	 */
	public Double getFinalAmount() {
		return getField(FINAL_AMOUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_AMOUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalAmount" field
	 */
	public void setFinalAmount(Double value) {
		setField(FINAL_AMOUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalConcentration" field
	 */
	public Double getFinalConcentration() {
		return getField(FINAL_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalConcentration" field
	 */
	public void setFinalConcentration(Double value) {
		setField(FINAL_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_STORAGE_BUFFER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalStorageBuffer<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Storage Buffer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalStorageBuffer" field
	 */
	public String getFinalStorageBuffer() {
		return getField(FINAL_STORAGE_BUFFER);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_STORAGE_BUFFER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalStorageBuffer<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Storage Buffer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalStorageBuffer" field
	 */
	public void setFinalStorageBuffer(String value) {
		setField(FINAL_STORAGE_BUFFER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_TOTAL_AMOUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalTotalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Total Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalTotalAmount" field
	 */
	public Double getFinalTotalAmount() {
		return getField(FINAL_TOTAL_AMOUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_TOTAL_AMOUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalTotalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Total Amount<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalTotalAmount" field
	 */
	public void setFinalTotalAmount(Double value) {
		setField(FINAL_TOTAL_AMOUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalVolume" field
	 */
	public Double getFinalVolume() {
		return getField(FINAL_VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalVolume" field
	 */
	public void setFinalVolume(Double value) {
		setField(FINAL_VOLUME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FLOW_CELL_LANE_ASSIGMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowCellLaneAssigment<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell Lane Assigment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FlowCellLaneAssigment" field
	 */
	public String getFlowCellLaneAssigment() {
		return getField(FLOW_CELL_LANE_ASSIGMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #FLOW_CELL_LANE_ASSIGMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowCellLaneAssigment<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell Lane Assigment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FlowCellLaneAssigment" field
	 */
	public void setFlowCellLaneAssigment(String value) {
		setField(FLOW_CELL_LANE_ASSIGMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Hit<br/>
	 * <br/>
	 * <b>Display Name</b>: Hit<br/>
	 * <br/>
	 * <b>Description</b>: Whether this sample is a hit to progress further in the screening process.
	 * 
	 * @return the value stored on the "Hit" field
	 */
	public Boolean getHit() {
		return getField(HIT);
	}
	
	/**
	 * Sets the value stored on the {@link #HIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Hit<br/>
	 * <br/>
	 * <b>Display Name</b>: Hit<br/>
	 * <br/>
	 * <b>Description</b>: Whether this sample is a hit to progress further in the screening process.
	 * 
	 * @param value The value to set on the "Hit" field
	 */
	public void setHit(Boolean value) {
		setField(HIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INDEX_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IndexId<br/>
	 * <br/>
	 * <b>Display Name</b>: Index ID<br/>
	 * <br/>
	 * <b>Description</b>: Identifier for this Index Tag sequence. (E.g. AG001 for an Agilent index.)
	 * 
	 * @return the value stored on the "IndexId" field
	 */
	public String getIndexId() {
		return getField(INDEX_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #INDEX_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IndexId<br/>
	 * <br/>
	 * <b>Display Name</b>: Index ID<br/>
	 * <br/>
	 * <b>Description</b>: Identifier for this Index Tag sequence. (E.g. AG001 for an Agilent index.)
	 * 
	 * @param value The value to set on the "IndexId" field
	 */
	public void setIndexId(String value) {
		setField(INDEX_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INDEX_TAG} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IndexTag<br/>
	 * <br/>
	 * <b>Display Name</b>: Index Tag<br/>
	 * <br/>
	 * <b>Description</b>: The barcode sequence for this Index. (E.g. ATCGAT)
	 * 
	 * @return the value stored on the "IndexTag" field
	 */
	public String getIndexTag() {
		return getField(INDEX_TAG);
	}
	
	/**
	 * Sets the value stored on the {@link #INDEX_TAG} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IndexTag<br/>
	 * <br/>
	 * <b>Display Name</b>: Index Tag<br/>
	 * <br/>
	 * <b>Description</b>: The barcode sequence for this Index. (E.g. ATCGAT)
	 * 
	 * @param value The value to set on the "IndexTag" field
	 */
	public void setIndexTag(String value) {
		setField(INDEX_TAG, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INPUT_ASSIGNMENT_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InputAssignmentRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Input Assignment Record ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is a reference to the record used to assign the Index to the sample via the assignment GUI. Typically this will be the record ID of an Index Assignment record.
	 * 
	 * @return the value stored on the "InputAssignmentRecordId" field
	 */
	public Long getInputAssignmentRecordId() {
		return getField(INPUT_ASSIGNMENT_RECORD_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #INPUT_ASSIGNMENT_RECORD_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InputAssignmentRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Input Assignment Record ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is a reference to the record used to assign the Index to the sample via the assignment GUI. Typically this will be the record ID of an Index Assignment record.
	 * 
	 * @param value The value to set on the "InputAssignmentRecordId" field
	 */
	public void setInputAssignmentRecordId(Long value) {
		setField(INPUT_ASSIGNMENT_RECORD_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_NEW_CONTROL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsNewControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is New Control?<br/>
	 * <br/>
	 * <b>Description</b>: This indicates if this row represents a new control.
	 * 
	 * @return the value stored on the "IsNewControl" field
	 */
	public Boolean getIsNewControl() {
		return getField(IS_NEW_CONTROL);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_NEW_CONTROL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsNewControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is New Control?<br/>
	 * <br/>
	 * <b>Description</b>: This indicates if this row represents a new control.
	 * 
	 * @param value The value to set on the "IsNewControl" field
	 */
	public void setIsNewControl(Boolean value) {
		setField(IS_NEW_CONTROL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOWER_CI_95} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LowerCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Lower CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The lower bounds for this sample.
	 * 
	 * @return the value stored on the "LowerCi95" field
	 */
	public Double getLowerCi95() {
		return getField(LOWER_CI_95);
	}
	
	/**
	 * Sets the value stored on the {@link #LOWER_CI_95} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LowerCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Lower CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The lower bounds for this sample.
	 * 
	 * @param value The value to set on the "LowerCi95" field
	 */
	public void setLowerCi95(Double value) {
		setField(LOWER_CI_95, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MAIN_PEAK_AREA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MainPeakArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Main Peak Area<br/>
	 * <br/>
	 * <b>Description</b>: Field to manually enter the Main Peak Area results for analytical HPLC (SEC).
	 * 
	 * @return the value stored on the "MainPeakArea" field
	 */
	public Double getMainPeakArea() {
		return getField(MAIN_PEAK_AREA);
	}
	
	/**
	 * Sets the value stored on the {@link #MAIN_PEAK_AREA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MainPeakArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Main Peak Area<br/>
	 * <br/>
	 * <b>Description</b>: Field to manually enter the Main Peak Area results for analytical HPLC (SEC).
	 * 
	 * @param value The value to set on the "MainPeakArea" field
	 */
	public void setMainPeakArea(Double value) {
		setField(MAIN_PEAK_AREA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MULTIPLEX_INSTRUCTIONS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MultiplexInstructions<br/>
	 * <br/>
	 * <b>Display Name</b>: Multiplex Instructions<br/>
	 * <br/>
	 * <b>Description</b>: The multiplex instructions from the sample if it had any assigned. This field requires a tag to populate it.
	 * 
	 * @return the value stored on the "MultiplexInstructions" field
	 */
	public String getMultiplexInstructions() {
		return getField(MULTIPLEX_INSTRUCTIONS);
	}
	
	/**
	 * Sets the value stored on the {@link #MULTIPLEX_INSTRUCTIONS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MultiplexInstructions<br/>
	 * <br/>
	 * <b>Display Name</b>: Multiplex Instructions<br/>
	 * <br/>
	 * <b>Description</b>: The multiplex instructions from the sample if it had any assigned. This field requires a tag to populate it.
	 * 
	 * @param value The value to set on the "MultiplexInstructions" field
	 */
	public void setMultiplexInstructions(String value) {
		setField(MULTIPLEX_INSTRUCTIONS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NUMBER_OF_REPLICATES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of aliquoting replicates to make.
	 * 
	 * @return the value stored on the "NumberOfReplicates" field
	 */
	public Long getNumberOfReplicates() {
		return getField(NUMBER_OF_REPLICATES);
	}
	
	/**
	 * Sets the value stored on the {@link #NUMBER_OF_REPLICATES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of aliquoting replicates to make.
	 * 
	 * @param value The value to set on the "NumberOfReplicates" field
	 */
	public void setNumberOfReplicates(Long value) {
		setField(NUMBER_OF_REPLICATES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NUMBER_OF_REPLICATES_NOT_EDITABLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfReplicatesNotEditable<br/>
	 * <br/>
	 * <b>Display Name</b>: Number of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of replicates to create for this sample.
	 * 
	 * @return the value stored on the "NumberOfReplicatesNotEditable" field
	 */
	public Long getNumberOfReplicatesNotEditable() {
		return getField(NUMBER_OF_REPLICATES_NOT_EDITABLE);
	}
	
	/**
	 * Sets the value stored on the {@link #NUMBER_OF_REPLICATES_NOT_EDITABLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfReplicatesNotEditable<br/>
	 * <br/>
	 * <b>Display Name</b>: Number of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: The number of replicates to create for this sample.
	 * 
	 * @param value The value to set on the "NumberOfReplicatesNotEditable" field
	 */
	public void setNumberOfReplicatesNotEditable(Long value) {
		setField(NUMBER_OF_REPLICATES_NOT_EDITABLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The Sample Name of this E-Notebook Sample Details data type.
	 * 
	 * @return the value stored on the "OtherSampleId" field
	 */
	public String getOtherSampleId() {
		return getField(OTHER_SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The Sample Name of this E-Notebook Sample Details data type.
	 * 
	 * @param value The value to set on the "OtherSampleId" field
	 */
	public void setOtherSampleId(String value) {
		setField(OTHER_SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PLATE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: The ID of the plate for this sample.
	 * 
	 * @return the value stored on the "PlateId" field
	 */
	public String getPlateId() {
		return getField(PLATE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #PLATE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: The ID of the plate for this sample.
	 * 
	 * @param value The value to set on the "PlateId" field
	 */
	public void setPlateId(String value) {
		setField(PLATE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PURITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Purity" field
	 */
	public Double getPurity() {
		return getField(PURITY);
	}
	
	/**
	 * Sets the value stored on the {@link #PURITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity %<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Purity" field
	 */
	public void setPurity(Double value) {
		setField(PURITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROUTETO_DIALYSIS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RoutetoDialysis<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Dialysis<br/>
	 * <br/>
	 * <b>Description</b>: Field to trigger routing to buffer exchange by dialysis.
	 * 
	 * @return the value stored on the "RoutetoDialysis" field
	 */
	public Boolean getRoutetoDialysis() {
		return getField(ROUTETO_DIALYSIS);
	}
	
	/**
	 * Sets the value stored on the {@link #ROUTETO_DIALYSIS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RoutetoDialysis<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Dialysis<br/>
	 * <br/>
	 * <b>Description</b>: Field to trigger routing to buffer exchange by dialysis.
	 * 
	 * @param value The value to set on the "RoutetoDialysis" field
	 */
	public void setRoutetoDialysis(Boolean value) {
		setField(ROUTETO_DIALYSIS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROUTETO_TITER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RoutetoTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Titer?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RoutetoTiter" field
	 */
	public Boolean getRoutetoTiter() {
		return getField(ROUTETO_TITER);
	}
	
	/**
	 * Sets the value stored on the {@link #ROUTETO_TITER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RoutetoTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Titer?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RoutetoTiter" field
	 */
	public void setRoutetoTiter(Boolean value) {
		setField(ROUTETO_TITER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROUTTO_FINAL_POOLING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RouttoFinalPooling<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Final Pooling?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RouttoFinalPooling" field
	 */
	public Boolean getRouttoFinalPooling() {
		return getField(ROUTTO_FINAL_POOLING);
	}
	
	/**
	 * Sets the value stored on the {@link #ROUTTO_FINAL_POOLING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RouttoFinalPooling<br/>
	 * <br/>
	 * <b>Display Name</b>: Route to Final Pooling?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RouttoFinalPooling" field
	 */
	public void setRouttoFinalPooling(Boolean value) {
		setField(ROUTTO_FINAL_POOLING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROW_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: Mapped from the sample that this Index was assigned to.
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
	 * <b>Description</b>: Mapped from the sample that this Index was assigned to.
	 * 
	 * @param value The value to set on the "RowPosition" field
	 */
	public void setRowPosition(String value) {
		setField(ROW_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: The Sample ID of this E-Notebook Sample Details data type.
	 * 
	 * @return the value stored on the "SampleId" field
	 */
	public String getSampleId() {
		return getField(SAMPLE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: The Sample ID of this E-Notebook Sample Details data type.
	 * 
	 * @param value The value to set on the "SampleId" field
	 */
	public void setSampleId(String value) {
		setField(SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean of this sample.
	 * 
	 * @return the value stored on the "SampleMean" field
	 */
	public Double getSampleMean() {
		return getField(SAMPLE_MEAN);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_MEAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean of this sample.
	 * 
	 * @param value The value to set on the "SampleMean" field
	 */
	public void setSampleMean(Double value) {
		setField(SAMPLE_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_NORMALIZED_MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: The normalized mean of this sample.
	 * 
	 * @return the value stored on the "SampleNormalizedMean" field
	 */
	public Double getSampleNormalizedMean() {
		return getField(SAMPLE_NORMALIZED_MEAN);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_NORMALIZED_MEAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: The normalized mean of this sample.
	 * 
	 * @param value The value to set on the "SampleNormalizedMean" field
	 */
	public void setSampleNormalizedMean(Double value) {
		setField(SAMPLE_NORMALIZED_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_STD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: The STD of this sample.
	 * 
	 * @return the value stored on the "SampleStd" field
	 */
	public Double getSampleStd() {
		return getField(SAMPLE_STD);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_STD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: The STD of this sample.
	 * 
	 * @param value The value to set on the "SampleStd" field
	 */
	public void setSampleStd(Double value) {
		setField(SAMPLE_STD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of sample being used.
	 * 
	 * @return the value stored on the "SampleType" field
	 */
	public String getSampleType() {
		return getField(SAMPLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of sample being used.
	 * 
	 * @param value The value to set on the "SampleType" field
	 */
	public void setSampleType(String value) {
		setField(SAMPLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SELECTED_FOR_TITER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedForTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SelectedForTiter" field
	 */
	public Boolean getSelectedForTiter() {
		return getField(SELECTED_FOR_TITER);
	}
	
	/**
	 * Sets the value stored on the {@link #SELECTED_FOR_TITER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedForTiter<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Titer<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SelectedForTiter" field
	 */
	public void setSelectedForTiter(Boolean value) {
		setField(SELECTED_FOR_TITER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SELECTEDFOR_SEC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedforSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected for SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SelectedforSEC" field
	 */
	public Boolean getSelectedforSEC() {
		return getField(SELECTEDFOR_SEC);
	}
	
	/**
	 * Sets the value stored on the {@link #SELECTEDFOR_SEC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedforSEC<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected for SEC<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SelectedforSEC" field
	 */
	public void setSelectedforSEC(Boolean value) {
		setField(SELECTEDFOR_SEC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SENDTO_PREPARATIVE_HPLC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SendtoPreparativeHPLC<br/>
	 * <br/>
	 * <b>Display Name</b>: Send to Preparative HPLC?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SendtoPreparativeHPLC" field
	 */
	public Boolean getSendtoPreparativeHPLC() {
		return getField(SENDTO_PREPARATIVE_HPLC);
	}
	
	/**
	 * Sets the value stored on the {@link #SENDTO_PREPARATIVE_HPLC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SendtoPreparativeHPLC<br/>
	 * <br/>
	 * <b>Display Name</b>: Send to Preparative HPLC?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SendtoPreparativeHPLC" field
	 */
	public void setSendtoPreparativeHPLC(Boolean value) {
		setField(SENDTO_PREPARATIVE_HPLC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SKIP_BUFFER_EXCHANGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SkipBufferExchange<br/>
	 * <br/>
	 * <b>Display Name</b>: Skip Buffer Exchange?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SkipBufferExchange" field
	 */
	public Boolean getSkipBufferExchange() {
		return getField(SKIP_BUFFER_EXCHANGE);
	}
	
	/**
	 * Sets the value stored on the {@link #SKIP_BUFFER_EXCHANGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SkipBufferExchange<br/>
	 * <br/>
	 * <b>Display Name</b>: Skip Buffer Exchange?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SkipBufferExchange" field
	 */
	public void setSkipBufferExchange(Boolean value) {
		setField(SKIP_BUFFER_EXCHANGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The original concentration of the source sample prior to creating the aliquot.
	 * 
	 * @return the value stored on the "SourceConcentration" field
	 */
	public Double getSourceConcentration() {
		return getField(SOURCE_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The original concentration of the source sample prior to creating the aliquot.
	 * 
	 * @param value The value to set on the "SourceConcentration" field
	 */
	public void setSourceConcentration(Double value) {
		setField(SOURCE_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass<br/>
	 * <br/>
	 * <b>Description</b>: The original mass of the source sample prior to creating the aliquot. This is a product of the source volume and source concentration.
	 * 
	 * @return the value stored on the "SourceMass" field
	 */
	public Double getSourceMass() {
		return getField(SOURCE_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass<br/>
	 * <br/>
	 * <b>Description</b>: The original mass of the source sample prior to creating the aliquot. This is a product of the source volume and source concentration.
	 * 
	 * @param value The value to set on the "SourceMass" field
	 */
	public void setSourceMass(Double value) {
		setField(SOURCE_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_MASS_TO_USE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceMassToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of mass to use from the source sample to create the aliquot.
	 * 
	 * @return the value stored on the "SourceMassToUse" field
	 */
	public Double getSourceMassToUse() {
		return getField(SOURCE_MASS_TO_USE);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_MASS_TO_USE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceMassToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Mass To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of mass to use from the source sample to create the aliquot.
	 * 
	 * @param value The value to set on the "SourceMassToUse" field
	 */
	public void setSourceMassToUse(Double value) {
		setField(SOURCE_MASS_TO_USE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_PLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourcePlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Plate<br/>
	 * <br/>
	 * <b>Description</b>: The source plate of the samples.
	 * 
	 * @return the value stored on the "SourcePlate" field
	 */
	public String getSourcePlate() {
		return getField(SOURCE_PLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_PLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourcePlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Plate<br/>
	 * <br/>
	 * <b>Description</b>: The source plate of the samples.
	 * 
	 * @param value The value to set on the "SourcePlate" field
	 */
	public void setSourcePlate(String value) {
		setField(SOURCE_PLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourcePosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Position<br/>
	 * <br/>
	 * <b>Description</b>: The location(A1,A2, etc) if any of the source sample. A1 is the top-left most location in an object.
	 * 
	 * @return the value stored on the "SourcePosition" field
	 */
	public String getSourcePosition() {
		return getField(SOURCE_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourcePosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Position<br/>
	 * <br/>
	 * <b>Description</b>: The location(A1,A2, etc) if any of the source sample. A1 is the top-left most location in an object.
	 * 
	 * @param value The value to set on the "SourcePosition" field
	 */
	public void setSourcePosition(String value) {
		setField(SOURCE_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume<br/>
	 * <br/>
	 * <b>Description</b>: The original volume of the source sample prior to creating the aliquot.
	 * 
	 * @return the value stored on the "SourceVolume" field
	 */
	public Double getSourceVolume() {
		return getField(SOURCE_VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume<br/>
	 * <br/>
	 * <b>Description</b>: The original volume of the source sample prior to creating the aliquot.
	 * 
	 * @param value The value to set on the "SourceVolume" field
	 */
	public void setSourceVolume(Double value) {
		setField(SOURCE_VOLUME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_VOLUME_TO_USE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceVolumeToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of volume to use from the source sample to create the aliquot.
	 * 
	 * @return the value stored on the "SourceVolumeToUse" field
	 */
	public Double getSourceVolumeToUse() {
		return getField(SOURCE_VOLUME_TO_USE);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_VOLUME_TO_USE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceVolumeToUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Source Volume To Use<br/>
	 * <br/>
	 * <b>Description</b>: The amount of volume to use from the source sample to create the aliquot.
	 * 
	 * @param value The value to set on the "SourceVolumeToUse" field
	 */
	public void setSourceVolumeToUse(Double value) {
		setField(SOURCE_VOLUME_TO_USE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STANDARD_ERROR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: The STDER of this sample.
	 * 
	 * @return the value stored on the "StandardError" field
	 */
	public Double getStandardError() {
		return getField(STANDARD_ERROR);
	}
	
	/**
	 * Sets the value stored on the {@link #STANDARD_ERROR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: The STDER of this sample.
	 * 
	 * @param value The value to set on the "StandardError" field
	 */
	public void setStandardError(Double value) {
		setField(STANDARD_ERROR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent.
	 * 
	 * @return the value stored on the "TargetConcentration" field
	 */
	public Double getTargetConcentration() {
		return getField(TARGET_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent.
	 * 
	 * @param value The value to set on the "TargetConcentration" field
	 */
	public void setTargetConcentration(Double value) {
		setField(TARGET_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_CONCENTRATION_REQUIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetConcentrationRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent. (Required)
	 * 
	 * @return the value stored on the "TargetConcentrationRequired" field
	 */
	public Double getTargetConcentrationRequired() {
		return getField(TARGET_CONCENTRATION_REQUIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_CONCENTRATION_REQUIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetConcentrationRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The resulting concentration of the aliquot. The concentration may decrease based on added diluent. (Required)
	 * 
	 * @param value The value to set on the "TargetConcentrationRequired" field
	 */
	public void setTargetConcentrationRequired(Double value) {
		setField(TARGET_CONCENTRATION_REQUIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Mass<br/>
	 * <br/>
	 * <b>Description</b>: The resulting mass of the aliquot. This is a product of target volume and target concentration.
	 * 
	 * @return the value stored on the "TargetMass" field
	 */
	public Double getTargetMass() {
		return getField(TARGET_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Mass<br/>
	 * <br/>
	 * <b>Description</b>: The resulting mass of the aliquot. This is a product of target volume and target concentration.
	 * 
	 * @param value The value to set on the "TargetMass" field
	 */
	public void setTargetMass(Double value) {
		setField(TARGET_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_PLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Plate<br/>
	 * <br/>
	 * <b>Description</b>: The Plate Id of that the resulting aliquot is on. May be accessioned automatically.
	 * 
	 * @return the value stored on the "TargetPlate" field
	 */
	public String getTargetPlate() {
		return getField(TARGET_PLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_PLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Plate<br/>
	 * <br/>
	 * <b>Description</b>: The Plate Id of that the resulting aliquot is on. May be accessioned automatically.
	 * 
	 * @param value The value to set on the "TargetPlate" field
	 */
	public void setTargetPlate(String value) {
		setField(TARGET_PLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_POOL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPool<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Pool<br/>
	 * <br/>
	 * <b>Description</b>: The Pool Id of the resulting aliquot.
	 * 
	 * @return the value stored on the "TargetPool" field
	 */
	public String getTargetPool() {
		return getField(TARGET_POOL);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_POOL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPool<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Pool<br/>
	 * <br/>
	 * <b>Description</b>: The Pool Id of the resulting aliquot.
	 * 
	 * @param value The value to set on the "TargetPool" field
	 */
	public void setTargetPool(String value) {
		setField(TARGET_POOL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Position<br/>
	 * <br/>
	 * <b>Description</b>: The target location (A1, A2, etc) of the resulting aliquot.
	 * 
	 * @return the value stored on the "TargetPosition" field
	 */
	public String getTargetPosition() {
		return getField(TARGET_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Position<br/>
	 * <br/>
	 * <b>Description</b>: The target location (A1, A2, etc) of the resulting aliquot.
	 * 
	 * @param value The value to set on the "TargetPosition" field
	 */
	public void setTargetPosition(String value) {
		setField(TARGET_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_TANK} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetTank<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Tank<br/>
	 * <br/>
	 * <b>Description</b>: The tank to use for this sample in screening.
	 * 
	 * @return the value stored on the "TargetTank" field
	 */
	public String getTargetTank() {
		return getField(TARGET_TANK);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_TANK} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetTank<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Tank<br/>
	 * <br/>
	 * <b>Description</b>: The tank to use for this sample in screening.
	 * 
	 * @param value The value to set on the "TargetTank" field
	 */
	public void setTargetTank(String value) {
		setField(TARGET_TANK, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use.
	 * 
	 * @return the value stored on the "TargetVolume" field
	 */
	public Double getTargetVolume() {
		return getField(TARGET_VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use.
	 * 
	 * @param value The value to set on the "TargetVolume" field
	 */
	public void setTargetVolume(Double value) {
		setField(TARGET_VOLUME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TARGET_VOLUME_REQUIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetVolumeRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use. (Required)
	 * 
	 * @return the value stored on the "TargetVolumeRequired" field
	 */
	public Double getTargetVolumeRequired() {
		return getField(TARGET_VOLUME_REQUIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #TARGET_VOLUME_REQUIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TargetVolumeRequired<br/>
	 * <br/>
	 * <b>Display Name</b>: Target Volume<br/>
	 * <br/>
	 * <b>Description</b>: The resulting volume of the aliquot. This may be the sum of the diluent to use + source volume to use. (Required)
	 * 
	 * @param value The value to set on the "TargetVolumeRequired" field
	 */
	public void setTargetVolumeRequired(Double value) {
		setField(TARGET_VOLUME_REQUIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMP_C} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TempC<br/>
	 * <br/>
	 * <b>Display Name</b>: Temp (C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TempC" field
	 */
	public Double getTempC() {
		return getField(TEMP_C);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMP_C} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TempC<br/>
	 * <br/>
	 * <b>Display Name</b>: Temp (C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TempC" field
	 */
	public void setTempC(Double value) {
		setField(TEMP_C, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TIMEMIN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Timemin<br/>
	 * <br/>
	 * <b>Display Name</b>: Time (min)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Timemin" field
	 */
	public Double getTimemin() {
		return getField(TIMEMIN);
	}
	
	/**
	 * Sets the value stored on the {@link #TIMEMIN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Timemin<br/>
	 * <br/>
	 * <b>Display Name</b>: Time (min)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Timemin" field
	 */
	public void setTimemin(Double value) {
		setField(TIMEMIN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TOTAL_MASS_FORMULA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMassFormula<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TotalMassFormula" field
	 */
	public Double getTotalMassFormula() {
		return getField(TOTAL_MASS_FORMULA);
	}
	
	/**
	 * Sets the value stored on the {@link #TOTAL_MASS_FORMULA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMassFormula<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TotalMassFormula" field
	 */
	public void setTotalMassFormula(Double value) {
		setField(TOTAL_MASS_FORMULA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TOTAL_MASSMG_2} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMassmg2<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TotalMassmg2" field
	 */
	public Double getTotalMassmg2() {
		return getField(TOTAL_MASSMG_2);
	}
	
	/**
	 * Sets the value stored on the {@link #TOTAL_MASSMG_2} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMassmg2<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass (mg)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TotalMassmg2" field
	 */
	public void setTotalMassmg2(Double value) {
		setField(TOTAL_MASSMG_2, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TOTAL_VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TotalVolume" field
	 */
	public Double getTotalVolume() {
		return getField(TOTAL_VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #TOTAL_VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Volume<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TotalVolume" field
	 */
	public void setTotalVolume(Double value) {
		setField(TOTAL_VOLUME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #UPPER_CI_95} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UpperCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Upper CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The upper bounds for this sample.
	 * 
	 * @return the value stored on the "UpperCi95" field
	 */
	public Double getUpperCi95() {
		return getField(UPPER_CI_95);
	}
	
	/**
	 * Sets the value stored on the {@link #UPPER_CI_95} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UpperCi95<br/>
	 * <br/>
	 * <b>Display Name</b>: Upper CI 95%<br/>
	 * <br/>
	 * <b>Description</b>: The upper bounds for this sample.
	 * 
	 * @param value The value to set on the "UpperCi95" field
	 */
	public void setUpperCi95(Double value) {
		setField(UPPER_CI_95, value);
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