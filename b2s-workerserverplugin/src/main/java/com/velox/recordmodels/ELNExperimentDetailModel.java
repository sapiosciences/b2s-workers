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
 * Automatically generated class for: Experiment Detail
 */
@ExemplarDataTypeModel(dataTypeName="ELNExperimentDetail")
public class ELNExperimentDetailModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "ELNExperimentDetail";

	/**
	 * <b>Data Field Name</b>: ActualAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) How much of this compound was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 */
	public static final String ACTUAL_AMOUNT = "ActualAmount";

	/**
	 * <b>Data Field Name</b>: ActualUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass Units<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) The units for the amount of compound that was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 */
	public static final String ACTUAL_UNITS = "ActualUnits";

	/**
	 * <b>Data Field Name</b>: CASNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS Number<br/>
	 * <br/>
	 * <b>Description</b>: The CAS Number for this compound.
	 */
	public static final String CASNUMBER = "CASNumber";

	/**
	 * <b>Data Field Name</b>: C_ColumnPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COLUMN_PART_CONSUMABLE_LOT = "C_ColumnPartConsumableLot";

	/**
	 * <b>Data Field Name</b>: C_ColumnPartConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COLUMN_PART_CONSUMABLE_NAME = "C_ColumnPartConsumableName";

	/**
	 * <b>Data Field Name</b>: C_ColumnPartConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COLUMN_PART_CONSUMABLE_QTY = "C_ColumnPartConsumableQty";

	/**
	 * <b>Data Field Name</b>: C_ColumnPartConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COLUMN_PART_CONSUMABLE_TYPE = "C_ColumnPartConsumableType";

	/**
	 * <b>Data Field Name</b>: CanEditRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Can Edit Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String CAN_EDIT_RUN_MODE = "CanEditRunMode";

	/**
	 * <b>Data Field Name</b>: ChemConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity/Conc<br/>
	 * <br/>
	 * <b>Description</b>: The purity or concentration of this compound.
	 */
	public static final String CHEM_CONCENTRATION = "ChemConcentration";

	/**
	 * <b>Data Field Name</b>: Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: The bounds for this compound.
	 */
	public static final String CI_95_BOUNDS = "Ci95Bounds";

	/**
	 * <b>Data Field Name</b>: Ci95BoundsThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the CI 95% bounds that the assay data should be within.
	 */
	public static final String CI_95_BOUNDS_THRESHOLD = "Ci95BoundsThreshold";

	/**
	 * <b>Data Field Name</b>: ClusterWithCBot<br/>
	 * <br/>
	 * <b>Display Name</b>: Cluster With CBot<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String CLUSTER_WITH_CBOT = "ClusterWithCBot";

	/**
	 * <b>Data Field Name</b>: Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMMENT = "Comment";

	/**
	 * <b>Data Field Name</b>: ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the quantity used of this item.
	 */
	public static final String CONCENTRATION_UNITS = "ConcentrationUnits";

	/**
	 * <b>Data Field Name</b>: ConsumableBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode      <br/>
	 * <br/>
	 * <b>Description</b>: Barcode associated with this consumable item.
	 */
	public static final String CONSUMABLE_BARCODE = "ConsumableBarcode";

	/**
	 * <b>Data Field Name</b>: ConsumableExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The expiration date for this particular item.
	 */
	public static final String CONSUMABLE_EXPIRATION_DATE = "ConsumableExpirationDate";

	/**
	 * <b>Data Field Name</b>: ConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable lot number from material management.
	 */
	public static final String CONSUMABLE_LOT = "ConsumableLot";

	/**
	 * <b>Data Field Name</b>: ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: The material name to track for this item.
	 */
	public static final String CONSUMABLE_NAME = "ConsumableName";

	/**
	 * <b>Data Field Name</b>: ConsumableNameFormulationDetails<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of this consumable object.
	 */
	public static final String CONSUMABLE_NAME_FORMULATION_DETAILS = "ConsumableNameFormulationDetails";

	/**
	 * <b>Data Field Name</b>: ConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String CONSUMABLE_QTY = "ConsumableQty";

	/**
	 * <b>Data Field Name</b>: ConsumableQuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Registration
	 */
	public static final String CONSUMABLE_QUANTITY_REMAINING = "ConsumableQuantityRemaining";

	/**
	 * <b>Data Field Name</b>: ConsumableRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Record ID<br/>
	 * <br/>
	 * <b>Description</b>: Record ID of the consumable data record that this ingredient represents.
	 */
	public static final String CONSUMABLE_RECORD_ID = "ConsumableRecordId";

	/**
	 * <b>Data Field Name</b>: ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: The material type to track for this item.
	 */
	public static final String CONSUMABLE_TYPE = "ConsumableType";

	/**
	 * <b>Data Field Name</b>: ConsumableTypeForRecipe<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String CONSUMABLE_TYPE_FOR_RECIPE = "ConsumableTypeForRecipe";

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
	 * <b>Data Field Name</b>: Date<br/>
	 * <br/>
	 * <b>Display Name</b>: Date<br/>
	 * <br/>
	 * <b>Description</b>: Standard date field formatting as (dd MMM, yyyy).
	 */
	public static final String DATE = "Date";

	/**
	 * <b>Data Field Name</b>: DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DATE_CREATED = "DateCreated";

	/**
	 * <b>Data Field Name</b>: DatePurchased<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Purchased<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String DATE_PURCHASED = "DatePurchased";

	/**
	 * <b>Data Field Name</b>: Density<br/>
	 * <br/>
	 * <b>Display Name</b>: Density (g/mL)<br/>
	 * <br/>
	 * <b>Description</b>: The density of this compound.
	 */
	public static final String DENSITY = "Density";

	/**
	 * <b>Data Field Name</b>: Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information pertaining this particular consumable object.
	 */
	public static final String DESCRIPTION = "Description";

	/**
	 * <b>Data Field Name</b>: DetectionWavelength<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Wavelength<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DETECTION_WAVELENGTH = "DetectionWavelength";

	/**
	 * <b>Data Field Name</b>: ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass for this compound.
	 */
	public static final String EXACT_MASS = "ExactMass";

	/**
	 * <b>Data Field Name</b>: ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String EXPIRATION_DATE = "ExpirationDate";

	/**
	 * <b>Data Field Name</b>: FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FINAL_FRACTIONM_L = "FinalFractionmL";

	/**
	 * <b>Data Field Name</b>: FlowcellId<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String FLOWCELL_ID = "FlowcellId";

	/**
	 * <b>Data Field Name</b>: Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: MF<br/>
	 * <br/>
	 * <b>Description</b>: The formula of this compound.
	 */
	public static final String FORMULA = "Formula";

	/**
	 * <b>Data Field Name</b>: GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: The hazard code for this compound.
	 */
	public static final String GHSHAZARD_CODE = "GHSHazardCode";

	/**
	 * <b>Data Field Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 */
	public static final String IUPAC = "IUPAC";

	/**
	 * <b>Data Field Name</b>: InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String INITIAL_FRACTIONM_L = "InitialFractionmL";

	/**
	 * <b>Data Field Name</b>: InstrumentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String INSTRUMENT_STATUS = "InstrumentStatus";

	/**
	 * <b>Data Field Name</b>: InstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String INSTRUMENT_TYPE = "InstrumentType";

	/**
	 * <b>Data Field Name</b>: InstrumentUsed<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Used<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String INSTRUMENT_USED = "InstrumentUsed";

	/**
	 * <b>Data Field Name</b>: LastMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String LAST_MAINTENANCE_DATE = "LastMaintenanceDate";

	/**
	 * <b>Data Field Name</b>: LimitingReactant<br/>
	 * <br/>
	 * <b>Display Name</b>: LR<br/>
	 * <br/>
	 * <b>Description</b>: The limiting reactant for this reaction.
	 */
	public static final String LIMITING_REACTANT = "LimitingReactant";

	/**
	 * <b>Data Field Name</b>: LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Formulation Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for formulations. This is used also by chemistry reactant and product tables.
	 */
	public static final String LOT_NUMBER = "LotNumber";

	/**
	 * <b>Data Field Name</b>: ModelNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Model Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String MODEL_NUMBER = "ModelNumber";

	/**
	 * <b>Data Field Name</b>: MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: MW (g/mol)<br/>
	 * <br/>
	 * <b>Description</b>: The molecular weight of this compound.
	 */
	public static final String MOLECULAR_WEIGHT = "MolecularWeight";

	/**
	 * <b>Data Field Name</b>: Moles<br/>
	 * <br/>
	 * <b>Display Name</b>: Moles<br/>
	 * <br/>
	 * <b>Description</b>: The Moles of this compound for this reaction.
	 */
	public static final String MOLES = "Moles";

	/**
	 * <b>Data Field Name</b>: Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this item.
	 */
	public static final String NAME = "Name";

	/**
	 * <b>Data Field Name</b>: NextMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Next Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String NEXT_MAINTENANCE_DATE = "NextMaintenanceDate";

	/**
	 * <b>Data Field Name</b>: NormalizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalization Method<br/>
	 * <br/>
	 * <b>Description</b>: The method used to normalize the samples.
	 */
	public static final String NORMALIZATION_METHOD = "NormalizationMethod";

	/**
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The sample's external identifier or name.
	 */
	public static final String OTHER_SAMPLE_ID = "OtherSampleId";

	/**
	 * <b>Data Field Name</b>: PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String PART_NUMBER = "PartNumber";

	/**
	 * <b>Data Field Name</b>: PlanAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Amount<br/>
	 * <br/>
	 * <b>Description</b>: The possible amount to be used of a compound for this reaction.
	 */
	public static final String PLAN_AMOUNT = "PlanAmount";

	/**
	 * <b>Data Field Name</b>: PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the plasmid used for screening.
	 */
	public static final String PLASMID_NAME = "PlasmidName";

	/**
	 * <b>Data Field Name</b>: PlasmidUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units of the plasmid part record.
	 */
	public static final String PLASMID_UNITS = "PlasmidUnits";

	/**
	 * <b>Data Field Name</b>: Position<br/>
	 * <br/>
	 * <b>Display Name</b>: Position<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String POSITION = "Position";

	/**
	 * <b>Data Field Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: The amount of pressure set for this reaction.
	 */
	public static final String PRESSURE = "Pressure";

	/**
	 * <b>Data Field Name</b>: PressureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the pressure set for this reaction.
	 */
	public static final String PRESSURE_UNITS = "PressureUnits";

	/**
	 * <b>Data Field Name</b>: Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: The purity of this compound
	 */
	public static final String PURITY = "Purity";

	/**
	 * <b>Data Field Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity remaining of this item.
	 */
	public static final String QUANTITY = "Quantity";

	/**
	 * <b>Data Field Name</b>: QuantityPerItem<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity / Volume Per Item<br/>
	 * <br/>
	 * <b>Description</b>: Amount received per shipment of this item.
	 */
	public static final String QUANTITY_PER_ITEM = "QuantityPerItem";

	/**
	 * <b>Data Field Name</b>: QuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Remaining<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String QUANTITY_REMAINING = "QuantityRemaining";

	/**
	 * <b>Data Field Name</b>: ReactionCoefficient<br/>
	 * <br/>
	 * <b>Display Name</b>: Equivalents<br/>
	 * <br/>
	 * <b>Description</b>: The coefficients for this reaction.
	 */
	public static final String REACTION_COEFFICIENT = "ReactionCoefficient";

	/**
	 * <b>Data Field Name</b>: ReactionPlanUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Units<br/>
	 * <br/>
	 * <b>Description</b>: The possible units for the theoretical amount of a compound for this reaction.
	 */
	public static final String REACTION_PLAN_UNITS = "ReactionPlanUnits";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry Id<br/>
	 * <br/>
	 * <b>Description</b>: The ID of this compound.
	 */
	public static final String REGISTRY_ID = "RegistryId";

	/**
	 * <b>Data Field Name</b>: ReorderLevelQuantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Reorder Level Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 */
	public static final String REORDER_LEVEL_QUANTITY = "ReorderLevelQuantity";

	/**
	 * <b>Data Field Name</b>: RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RETEST_DATE = "RetestDate";

	/**
	 * <b>Data Field Name</b>: Role<br/>
	 * <br/>
	 * <b>Display Name</b>: Role<br/>
	 * <br/>
	 * <b>Description</b>: The type of compound for this reaction.
	 */
	public static final String ROLE = "Role";

	/**
	 * <b>Data Field Name</b>: RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String RUN_ID = "RunId";

	/**
	 * <b>Data Field Name</b>: RunNumber2<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RUN_NUMBER_2 = "RunNumber2";

	/**
	 * <b>Data Field Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: The SMILES for a compound.
	 */
	public static final String SMILES = "SMILES";

	/**
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Barcode<br/>
	 * <br/>
	 * <b>Description</b>: Sample Receiving
	 */
	public static final String SAMPLE_ID = "SampleId";

	/**
	 * <b>Data Field Name</b>: SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean of the samples.
	 */
	public static final String SAMPLE_MEAN = "SampleMean";

	/**
	 * <b>Data Field Name</b>: SampleMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the mean that the assay data should be within.
	 */
	public static final String SAMPLE_MEAN_THRESHOLD = "SampleMeanThreshold";

	/**
	 * <b>Data Field Name</b>: SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean when normalizing the samples.
	 */
	public static final String SAMPLE_NORMALIZED_MEAN = "SampleNormalizedMean";

	/**
	 * <b>Data Field Name</b>: SampleNormalizedMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean Threshold<br/>
	 * <br/>
	 * <b>Description</b>: The threshold for the mean when normalizing the samples.
	 */
	public static final String SAMPLE_NORMALIZED_MEAN_THRESHOLD = "SampleNormalizedMeanThreshold";

	/**
	 * <b>Data Field Name</b>: SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: The STD for this item.
	 */
	public static final String SAMPLE_STD = "SampleStd";

	/**
	 * <b>Data Field Name</b>: SampleStdThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard deviation that the assay data should be within.
	 */
	public static final String SAMPLE_STD_THRESHOLD = "SampleStdThreshold";

	/**
	 * <b>Data Field Name</b>: SelectedForIntermediatePool<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pool<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SELECTED_FOR_INTERMEDIATE_POOL = "SelectedForIntermediatePool";

	/**
	 * <b>Data Field Name</b>: SequencerInstrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Used<br/>
	 * <br/>
	 * <b>Description</b>: The sequencer used.
	 */
	public static final String SEQUENCER_INSTRUMENT = "SequencerInstrument";

	/**
	 * <b>Data Field Name</b>: SequencerRunFolder<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Folder<br/>
	 * <br/>
	 * <b>Description</b>: The sequencing run folder 
	 */
	public static final String SEQUENCER_RUN_FOLDER = "SequencerRunFolder";

	/**
	 * <b>Data Field Name</b>: SequencingRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String SEQUENCING_RUN_MODE = "SequencingRunMode";

	/**
	 * <b>Data Field Name</b>: SequencingRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Type<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 */
	public static final String SEQUENCING_RUN_TYPE = "SequencingRunType";

	/**
	 * <b>Data Field Name</b>: SerialNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Serial Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String SERIAL_NUMBER = "SerialNumber";

	/**
	 * <b>Data Field Name</b>: StainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this stain.
	 */
	public static final String STAIN_PART_CONSUMABLE_LOT = "StainPartConsumableLot";

	/**
	 * <b>Data Field Name</b>: StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: The STDER for this item.
	 */
	public static final String STANDARD_ERROR = "StandardError";

	/**
	 * <b>Data Field Name</b>: StandardErrorThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard error that the assay data should be within.
	 */
	public static final String STANDARD_ERROR_THRESHOLD = "StandardErrorThreshold";

	/**
	 * <b>Data Field Name</b>: Step2<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STEP_2 = "Step2";

	/**
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String STORAGE_UNIT_PATH = "StorageUnitPath";

	/**
	 * <b>Data Field Name</b>: StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the strain used for screening.
	 */
	public static final String STRAIN_NAME = "StrainName";

	/**
	 * <b>Data Field Name</b>: StrainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this strain.
	 */
	public static final String STRAIN_PART_CONSUMABLE_LOT = "StrainPartConsumableLot";

	/**
	 * <b>Data Field Name</b>: Technician<br/>
	 * <br/>
	 * <b>Display Name</b>: Technician<br/>
	 * <br/>
	 * <b>Description</b>: This field is backed by the usernames of users with access to this Lab/App. Names may also be directly entered.
	 */
	public static final String TECHNICIAN = "Technician";

	/**
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: The temperature set for this reaction.
	 */
	public static final String TEMPERATURE = "Temperature";

	/**
	 * <b>Data Field Name</b>: TemperatureDuringSeparation<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature During Separation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TEMPERATURE_DURING_SEPARATION = "TemperatureDuringSeparation";

	/**
	 * <b>Data Field Name</b>: TemperatureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the temperature of this reaction.
	 */
	public static final String TEMPERATURE_UNITS = "TemperatureUnits";

	/**
	 * <b>Data Field Name</b>: Units<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: This field is used for defining formulation recipe
	 */
	public static final String UNITS = "Units";

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

	/**
	 * <b>Data Field Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 */
	public static final String VENDOR = "Vendor";

	/**
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: The volume for this item.
	 */
	public static final String VOLUME = "Volume";

	/**
	 * <b>Data Field Name</b>: VolumeUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the volume of this item.
	 */
	public static final String VOLUME_UNITS = "VolumeUnits";

	/**
	 * <b>Data Field Name</b>: WorkstationId<br/>
	 * <br/>
	 * <b>Display Name</b>: Workstation ID<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 */
	public static final String WORKSTATION_ID = "WorkstationId";

	/**
	 * <b>Data Field Name</b>: Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: % Yield<br/>
	 * <br/>
	 * <b>Description</b>: The yield for this reaction compound.
	 */
	public static final String YIELD = "Yield";

	/**
	 * <b>Data Field Name</b>: inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: Inchi<br/>
	 * <br/>
	 * <b>Description</b>: The Inchi for this compound.
	 */
	public static final String INCHI = "inchi";

	protected ELNExperimentDetailModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ACTUAL_AMOUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActualAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) How much of this compound was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 * 
	 * @return the value stored on the "ActualAmount" field
	 */
	public Double getActualAmount() {
		return getField(ACTUAL_AMOUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #ACTUAL_AMOUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActualAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) How much of this compound was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 * 
	 * @param value The value to set on the "ActualAmount" field
	 */
	public void setActualAmount(Double value) {
		setField(ACTUAL_AMOUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ACTUAL_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActualUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass Units<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) The units for the amount of compound that was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 * 
	 * @return the value stored on the "ActualUnits" field
	 */
	public String getActualUnits() {
		return getField(ACTUAL_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #ACTUAL_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActualUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Mass Units<br/>
	 * <br/>
	 * <b>Description</b>: (CHEM) The units for the amount of compound that was used for this reaction. Note: only mass is allowed for quantity tracking in chem.
	 * 
	 * @param value The value to set on the "ActualUnits" field
	 */
	public void setActualUnits(String value) {
		setField(ACTUAL_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CASNUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CASNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS Number<br/>
	 * <br/>
	 * <b>Description</b>: The CAS Number for this compound.
	 * 
	 * @return the value stored on the "CASNumber" field
	 */
	public String getCASNumber() {
		return getField(CASNUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #CASNUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CASNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS Number<br/>
	 * <br/>
	 * <b>Description</b>: The CAS Number for this compound.
	 * 
	 * @param value The value to set on the "CASNumber" field
	 */
	public void setCASNumber(String value) {
		setField(CASNUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_LOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ColumnPartConsumableLot" field
	 */
	public String getC_ColumnPartConsumableLot() {
		return getField(C___COLUMN_PART_CONSUMABLE_LOT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_LOT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ColumnPartConsumableLot" field
	 */
	public void setC_ColumnPartConsumableLot(String value) {
		setField(C___COLUMN_PART_CONSUMABLE_LOT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ColumnPartConsumableName" field
	 */
	public String getC_ColumnPartConsumableName() {
		return getField(C___COLUMN_PART_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ColumnPartConsumableName" field
	 */
	public void setC_ColumnPartConsumableName(String value) {
		setField(C___COLUMN_PART_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_QTY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ColumnPartConsumableQty" field
	 */
	public Double getC_ColumnPartConsumableQty() {
		return getField(C___COLUMN_PART_CONSUMABLE_QTY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_QTY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ColumnPartConsumableQty" field
	 */
	public void setC_ColumnPartConsumableQty(Double value) {
		setField(C___COLUMN_PART_CONSUMABLE_QTY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ColumnPartConsumableType" field
	 */
	public String getC_ColumnPartConsumableType() {
		return getField(C___COLUMN_PART_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_PART_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ColumnPartConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ColumnPartConsumableType" field
	 */
	public void setC_ColumnPartConsumableType(String value) {
		setField(C___COLUMN_PART_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CAN_EDIT_RUN_MODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CanEditRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Can Edit Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "CanEditRunMode" field
	 */
	public Boolean getCanEditRunMode() {
		return getField(CAN_EDIT_RUN_MODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CAN_EDIT_RUN_MODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CanEditRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Can Edit Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "CanEditRunMode" field
	 */
	public void setCanEditRunMode(Boolean value) {
		setField(CAN_EDIT_RUN_MODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEM_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity/Conc<br/>
	 * <br/>
	 * <b>Description</b>: The purity or concentration of this compound.
	 * 
	 * @return the value stored on the "ChemConcentration" field
	 */
	public String getChemConcentration() {
		return getField(CHEM_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEM_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity/Conc<br/>
	 * <br/>
	 * <b>Description</b>: The purity or concentration of this compound.
	 * 
	 * @param value The value to set on the "ChemConcentration" field
	 */
	public void setChemConcentration(String value) {
		setField(CHEM_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CI_95_BOUNDS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: The bounds for this compound.
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
	 * <b>Description</b>: The bounds for this compound.
	 * 
	 * @param value The value to set on the "Ci95Bounds" field
	 */
	public void setCi95Bounds(Double value) {
		setField(CI_95_BOUNDS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CI_95_BOUNDS_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Ci95BoundsThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the CI 95% bounds that the assay data should be within.
	 * 
	 * @return the value stored on the "Ci95BoundsThreshold" field
	 */
	public Double getCi95BoundsThreshold() {
		return getField(CI_95_BOUNDS_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #CI_95_BOUNDS_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Ci95BoundsThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the CI 95% bounds that the assay data should be within.
	 * 
	 * @param value The value to set on the "Ci95BoundsThreshold" field
	 */
	public void setCi95BoundsThreshold(Double value) {
		setField(CI_95_BOUNDS_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CLUSTER_WITH_CBOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ClusterWithCBot<br/>
	 * <br/>
	 * <b>Display Name</b>: Cluster With CBot<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "ClusterWithCBot" field
	 */
	public Boolean getClusterWithCBot() {
		return getField(CLUSTER_WITH_CBOT);
	}
	
	/**
	 * Sets the value stored on the {@link #CLUSTER_WITH_CBOT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ClusterWithCBot<br/>
	 * <br/>
	 * <b>Display Name</b>: Cluster With CBot<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "ClusterWithCBot" field
	 */
	public void setClusterWithCBot(Boolean value) {
		setField(CLUSTER_WITH_CBOT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Comment" field
	 */
	public String getComment() {
		return getField(COMMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #COMMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Comment<br/>
	 * <br/>
	 * <b>Display Name</b>: Comment<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Comment" field
	 */
	public void setComment(String value) {
		setField(COMMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONCENTRATION_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the quantity used of this item.
	 * 
	 * @return the value stored on the "ConcentrationUnits" field
	 */
	public String getConcentrationUnits() {
		return getField(CONCENTRATION_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #CONCENTRATION_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the quantity used of this item.
	 * 
	 * @param value The value to set on the "ConcentrationUnits" field
	 */
	public void setConcentrationUnits(String value) {
		setField(CONCENTRATION_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_BARCODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode      <br/>
	 * <br/>
	 * <b>Description</b>: Barcode associated with this consumable item.
	 * 
	 * @return the value stored on the "ConsumableBarcode" field
	 */
	public String getConsumableBarcode() {
		return getField(CONSUMABLE_BARCODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_BARCODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode      <br/>
	 * <br/>
	 * <b>Description</b>: Barcode associated with this consumable item.
	 * 
	 * @param value The value to set on the "ConsumableBarcode" field
	 */
	public void setConsumableBarcode(String value) {
		setField(CONSUMABLE_BARCODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The expiration date for this particular item.
	 * 
	 * @return the value stored on the "ConsumableExpirationDate" field
	 */
	public Long getConsumableExpirationDate() {
		return getField(CONSUMABLE_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The expiration date for this particular item.
	 * 
	 * @param value The value to set on the "ConsumableExpirationDate" field
	 */
	public void setConsumableExpirationDate(Long value) {
		setField(CONSUMABLE_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_LOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable lot number from material management.
	 * 
	 * @return the value stored on the "ConsumableLot" field
	 */
	public String getConsumableLot() {
		return getField(CONSUMABLE_LOT);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_LOT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable lot number from material management.
	 * 
	 * @param value The value to set on the "ConsumableLot" field
	 */
	public void setConsumableLot(String value) {
		setField(CONSUMABLE_LOT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: The material name to track for this item.
	 * 
	 * @return the value stored on the "ConsumableName" field
	 */
	public String getConsumableName() {
		return getField(CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: The material name to track for this item.
	 * 
	 * @param value The value to set on the "ConsumableName" field
	 */
	public void setConsumableName(String value) {
		setField(CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_NAME_FORMULATION_DETAILS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableNameFormulationDetails<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of this consumable object.
	 * 
	 * @return the value stored on the "ConsumableNameFormulationDetails" field
	 */
	public String getConsumableNameFormulationDetails() {
		return getField(CONSUMABLE_NAME_FORMULATION_DETAILS);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_NAME_FORMULATION_DETAILS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableNameFormulationDetails<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of this consumable object.
	 * 
	 * @param value The value to set on the "ConsumableNameFormulationDetails" field
	 */
	public void setConsumableNameFormulationDetails(String value) {
		setField(CONSUMABLE_NAME_FORMULATION_DETAILS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_QTY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "ConsumableQty" field
	 */
	public Double getConsumableQty() {
		return getField(CONSUMABLE_QTY);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_QTY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableQty<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Used<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "ConsumableQty" field
	 */
	public void setConsumableQty(Double value) {
		setField(CONSUMABLE_QTY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_QUANTITY_REMAINING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableQuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Registration
	 * 
	 * @return the value stored on the "ConsumableQuantityRemaining" field
	 */
	public Double getConsumableQuantityRemaining() {
		return getField(CONSUMABLE_QUANTITY_REMAINING);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_QUANTITY_REMAINING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableQuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Registration
	 * 
	 * @param value The value to set on the "ConsumableQuantityRemaining" field
	 */
	public void setConsumableQuantityRemaining(Double value) {
		setField(CONSUMABLE_QUANTITY_REMAINING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Record ID<br/>
	 * <br/>
	 * <b>Description</b>: Record ID of the consumable data record that this ingredient represents.
	 * 
	 * @return the value stored on the "ConsumableRecordId" field
	 */
	public Long getConsumableRecordId() {
		return getField(CONSUMABLE_RECORD_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_RECORD_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableRecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Record ID<br/>
	 * <br/>
	 * <b>Description</b>: Record ID of the consumable data record that this ingredient represents.
	 * 
	 * @param value The value to set on the "ConsumableRecordId" field
	 */
	public void setConsumableRecordId(Long value) {
		setField(CONSUMABLE_RECORD_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: The material type to track for this item.
	 * 
	 * @return the value stored on the "ConsumableType" field
	 */
	public String getConsumableType() {
		return getField(CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: The material type to track for this item.
	 * 
	 * @param value The value to set on the "ConsumableType" field
	 */
	public void setConsumableType(String value) {
		setField(CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_TYPE_FOR_RECIPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableTypeForRecipe<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "ConsumableTypeForRecipe" field
	 */
	public String getConsumableTypeForRecipe() {
		return getField(CONSUMABLE_TYPE_FOR_RECIPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_TYPE_FOR_RECIPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableTypeForRecipe<br/>
	 * <br/>
	 * <b>Display Name</b>: Material Type<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "ConsumableTypeForRecipe" field
	 */
	public void setConsumableTypeForRecipe(String value) {
		setField(CONSUMABLE_TYPE_FOR_RECIPE, value);
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
	 * Retrieves the value stored on the {@link #DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Date<br/>
	 * <br/>
	 * <b>Display Name</b>: Date<br/>
	 * <br/>
	 * <b>Description</b>: Standard date field formatting as (dd MMM, yyyy).
	 * 
	 * @return the value stored on the "Date" field
	 */
	public Long getDate() {
		return getField(DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Date<br/>
	 * <br/>
	 * <b>Display Name</b>: Date<br/>
	 * <br/>
	 * <b>Description</b>: Standard date field formatting as (dd MMM, yyyy).
	 * 
	 * @param value The value to set on the "Date" field
	 */
	public void setDate(Long value) {
		setField(DATE, value);
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
	 * Retrieves the value stored on the {@link #DATE_PURCHASED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DatePurchased<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Purchased<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "DatePurchased" field
	 */
	public Long getDatePurchased() {
		return getField(DATE_PURCHASED);
	}
	
	/**
	 * Sets the value stored on the {@link #DATE_PURCHASED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DatePurchased<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Purchased<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "DatePurchased" field
	 */
	public void setDatePurchased(Long value) {
		setField(DATE_PURCHASED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DENSITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Density<br/>
	 * <br/>
	 * <b>Display Name</b>: Density (g/mL)<br/>
	 * <br/>
	 * <b>Description</b>: The density of this compound.
	 * 
	 * @return the value stored on the "Density" field
	 */
	public Double getDensity() {
		return getField(DENSITY);
	}
	
	/**
	 * Sets the value stored on the {@link #DENSITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Density<br/>
	 * <br/>
	 * <b>Display Name</b>: Density (g/mL)<br/>
	 * <br/>
	 * <b>Description</b>: The density of this compound.
	 * 
	 * @param value The value to set on the "Density" field
	 */
	public void setDensity(Double value) {
		setField(DENSITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DESCRIPTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information pertaining this particular consumable object.
	 * 
	 * @return the value stored on the "Description" field
	 */
	public String getDescription() {
		return getField(DESCRIPTION);
	}
	
	/**
	 * Sets the value stored on the {@link #DESCRIPTION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Additional information pertaining this particular consumable object.
	 * 
	 * @param value The value to set on the "Description" field
	 */
	public void setDescription(String value) {
		setField(DESCRIPTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DETECTION_WAVELENGTH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DetectionWavelength<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Wavelength<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DetectionWavelength" field
	 */
	public Long getDetectionWavelength() {
		return getField(DETECTION_WAVELENGTH);
	}
	
	/**
	 * Sets the value stored on the {@link #DETECTION_WAVELENGTH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DetectionWavelength<br/>
	 * <br/>
	 * <b>Display Name</b>: Detection Wavelength<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DetectionWavelength" field
	 */
	public void setDetectionWavelength(Long value) {
		setField(DETECTION_WAVELENGTH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXACT_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass for this compound.
	 * 
	 * @return the value stored on the "ExactMass" field
	 */
	public Double getExactMass() {
		return getField(EXACT_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #EXACT_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass for this compound.
	 * 
	 * @param value The value to set on the "ExactMass" field
	 */
	public void setExactMass(Double value) {
		setField(EXACT_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "ExpirationDate" field
	 */
	public Long getExpirationDate() {
		return getField(EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "ExpirationDate" field
	 */
	public void setExpirationDate(Long value) {
		setField(EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FINAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FinalFractionmL" field
	 */
	public Double getFinalFractionmL() {
		return getField(FINAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #FINAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FinalFractionmL" field
	 */
	public void setFinalFractionmL(Double value) {
		setField(FINAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FLOWCELL_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowcellId<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "FlowcellId" field
	 */
	public String getFlowcellId() {
		return getField(FLOWCELL_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #FLOWCELL_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowcellId<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "FlowcellId" field
	 */
	public void setFlowcellId(String value) {
		setField(FLOWCELL_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FORMULA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: MF<br/>
	 * <br/>
	 * <b>Description</b>: The formula of this compound.
	 * 
	 * @return the value stored on the "Formula" field
	 */
	public String getFormula() {
		return getField(FORMULA);
	}
	
	/**
	 * Sets the value stored on the {@link #FORMULA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: MF<br/>
	 * <br/>
	 * <b>Description</b>: The formula of this compound.
	 * 
	 * @param value The value to set on the "Formula" field
	 */
	public void setFormula(String value) {
		setField(FORMULA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #GHSHAZARD_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: The hazard code for this compound.
	 * 
	 * @return the value stored on the "GHSHazardCode" field
	 */
	public String getGHSHazardCode() {
		return getField(GHSHAZARD_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #GHSHAZARD_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: The hazard code for this compound.
	 * 
	 * @param value The value to set on the "GHSHazardCode" field
	 */
	public void setGHSHazardCode(String value) {
		setField(GHSHAZARD_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IUPAC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @return the value stored on the "IUPAC" field
	 */
	public String getIUPAC() {
		return getField(IUPAC);
	}
	
	/**
	 * Sets the value stored on the {@link #IUPAC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @param value The value to set on the "IUPAC" field
	 */
	public void setIUPAC(String value) {
		setField(IUPAC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INITIAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "InitialFractionmL" field
	 */
	public Double getInitialFractionmL() {
		return getField(INITIAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #INITIAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "InitialFractionmL" field
	 */
	public void setInitialFractionmL(Double value) {
		setField(INITIAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INSTRUMENT_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "InstrumentStatus" field
	 */
	public String getInstrumentStatus() {
		return getField(INSTRUMENT_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #INSTRUMENT_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "InstrumentStatus" field
	 */
	public void setInstrumentStatus(String value) {
		setField(INSTRUMENT_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INSTRUMENT_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "InstrumentType" field
	 */
	public String getInstrumentType() {
		return getField(INSTRUMENT_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #INSTRUMENT_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentType<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Type<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "InstrumentType" field
	 */
	public void setInstrumentType(String value) {
		setField(INSTRUMENT_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INSTRUMENT_USED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentUsed<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Used<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "InstrumentUsed" field
	 */
	public String getInstrumentUsed() {
		return getField(INSTRUMENT_USED);
	}
	
	/**
	 * Sets the value stored on the {@link #INSTRUMENT_USED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InstrumentUsed<br/>
	 * <br/>
	 * <b>Display Name</b>: Instrument Used<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "InstrumentUsed" field
	 */
	public void setInstrumentUsed(String value) {
		setField(INSTRUMENT_USED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LAST_MAINTENANCE_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "LastMaintenanceDate" field
	 */
	public String getLastMaintenanceDate() {
		return getField(LAST_MAINTENANCE_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #LAST_MAINTENANCE_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "LastMaintenanceDate" field
	 */
	public void setLastMaintenanceDate(String value) {
		setField(LAST_MAINTENANCE_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LIMITING_REACTANT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LimitingReactant<br/>
	 * <br/>
	 * <b>Display Name</b>: LR<br/>
	 * <br/>
	 * <b>Description</b>: The limiting reactant for this reaction.
	 * 
	 * @return the value stored on the "LimitingReactant" field
	 */
	public Boolean getLimitingReactant() {
		return getField(LIMITING_REACTANT);
	}
	
	/**
	 * Sets the value stored on the {@link #LIMITING_REACTANT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LimitingReactant<br/>
	 * <br/>
	 * <b>Display Name</b>: LR<br/>
	 * <br/>
	 * <b>Description</b>: The limiting reactant for this reaction.
	 * 
	 * @param value The value to set on the "LimitingReactant" field
	 */
	public void setLimitingReactant(Boolean value) {
		setField(LIMITING_REACTANT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Formulation Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for formulations. This is used also by chemistry reactant and product tables.
	 * 
	 * @return the value stored on the "LotNumber" field
	 */
	public String getLotNumber() {
		return getField(LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Formulation Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for formulations. This is used also by chemistry reactant and product tables.
	 * 
	 * @param value The value to set on the "LotNumber" field
	 */
	public void setLotNumber(String value) {
		setField(LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MODEL_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ModelNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Model Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "ModelNumber" field
	 */
	public String getModelNumber() {
		return getField(MODEL_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #MODEL_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ModelNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Model Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "ModelNumber" field
	 */
	public void setModelNumber(String value) {
		setField(MODEL_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MOLECULAR_WEIGHT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: MW (g/mol)<br/>
	 * <br/>
	 * <b>Description</b>: The molecular weight of this compound.
	 * 
	 * @return the value stored on the "MolecularWeight" field
	 */
	public Double getMolecularWeight() {
		return getField(MOLECULAR_WEIGHT);
	}
	
	/**
	 * Sets the value stored on the {@link #MOLECULAR_WEIGHT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: MW (g/mol)<br/>
	 * <br/>
	 * <b>Description</b>: The molecular weight of this compound.
	 * 
	 * @param value The value to set on the "MolecularWeight" field
	 */
	public void setMolecularWeight(Double value) {
		setField(MOLECULAR_WEIGHT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MOLES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Moles<br/>
	 * <br/>
	 * <b>Display Name</b>: Moles<br/>
	 * <br/>
	 * <b>Description</b>: The Moles of this compound for this reaction.
	 * 
	 * @return the value stored on the "Moles" field
	 */
	public Double getMoles() {
		return getField(MOLES);
	}
	
	/**
	 * Sets the value stored on the {@link #MOLES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Moles<br/>
	 * <br/>
	 * <b>Display Name</b>: Moles<br/>
	 * <br/>
	 * <b>Description</b>: The Moles of this compound for this reaction.
	 * 
	 * @param value The value to set on the "Moles" field
	 */
	public void setMoles(Double value) {
		setField(MOLES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this item.
	 * 
	 * @return the value stored on the "Name" field
	 */
	public String getName() {
		return getField(NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The external identifier or name for this item.
	 * 
	 * @param value The value to set on the "Name" field
	 */
	public void setName(String value) {
		setField(NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NEXT_MAINTENANCE_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NextMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Next Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "NextMaintenanceDate" field
	 */
	public String getNextMaintenanceDate() {
		return getField(NEXT_MAINTENANCE_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #NEXT_MAINTENANCE_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NextMaintenanceDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Next Maintenance Date<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "NextMaintenanceDate" field
	 */
	public void setNextMaintenanceDate(String value) {
		setField(NEXT_MAINTENANCE_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NORMALIZATION_METHOD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NormalizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalization Method<br/>
	 * <br/>
	 * <b>Description</b>: The method used to normalize the samples.
	 * 
	 * @return the value stored on the "NormalizationMethod" field
	 */
	public String getNormalizationMethod() {
		return getField(NORMALIZATION_METHOD);
	}
	
	/**
	 * Sets the value stored on the {@link #NORMALIZATION_METHOD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NormalizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalization Method<br/>
	 * <br/>
	 * <b>Description</b>: The method used to normalize the samples.
	 * 
	 * @param value The value to set on the "NormalizationMethod" field
	 */
	public void setNormalizationMethod(String value) {
		setField(NORMALIZATION_METHOD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: The sample's external identifier or name.
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
	 * <b>Description</b>: The sample's external identifier or name.
	 * 
	 * @param value The value to set on the "OtherSampleId" field
	 */
	public void setOtherSampleId(String value) {
		setField(OTHER_SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "PartNumber" field
	 */
	public String getPartNumber() {
		return getField(PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "PartNumber" field
	 */
	public void setPartNumber(String value) {
		setField(PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PLAN_AMOUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlanAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Amount<br/>
	 * <br/>
	 * <b>Description</b>: The possible amount to be used of a compound for this reaction.
	 * 
	 * @return the value stored on the "PlanAmount" field
	 */
	public Double getPlanAmount() {
		return getField(PLAN_AMOUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #PLAN_AMOUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlanAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Amount<br/>
	 * <br/>
	 * <b>Description</b>: The possible amount to be used of a compound for this reaction.
	 * 
	 * @param value The value to set on the "PlanAmount" field
	 */
	public void setPlanAmount(Double value) {
		setField(PLAN_AMOUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PLASMID_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the plasmid used for screening.
	 * 
	 * @return the value stored on the "PlasmidName" field
	 */
	public String getPlasmidName() {
		return getField(PLASMID_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #PLASMID_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the plasmid used for screening.
	 * 
	 * @param value The value to set on the "PlasmidName" field
	 */
	public void setPlasmidName(String value) {
		setField(PLASMID_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PLASMID_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlasmidUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units of the plasmid part record.
	 * 
	 * @return the value stored on the "PlasmidUnits" field
	 */
	public String getPlasmidUnits() {
		return getField(PLASMID_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #PLASMID_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlasmidUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: The units of the plasmid part record.
	 * 
	 * @param value The value to set on the "PlasmidUnits" field
	 */
	public void setPlasmidUnits(String value) {
		setField(PLASMID_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Position<br/>
	 * <br/>
	 * <b>Display Name</b>: Position<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "Position" field
	 */
	public String getPosition() {
		return getField(POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Position<br/>
	 * <br/>
	 * <b>Display Name</b>: Position<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "Position" field
	 */
	public void setPosition(String value) {
		setField(POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PRESSURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: The amount of pressure set for this reaction.
	 * 
	 * @return the value stored on the "Pressure" field
	 */
	public Double getPressure() {
		return getField(PRESSURE);
	}
	
	/**
	 * Sets the value stored on the {@link #PRESSURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: The amount of pressure set for this reaction.
	 * 
	 * @param value The value to set on the "Pressure" field
	 */
	public void setPressure(Double value) {
		setField(PRESSURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PRESSURE_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PressureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the pressure set for this reaction.
	 * 
	 * @return the value stored on the "PressureUnits" field
	 */
	public String getPressureUnits() {
		return getField(PRESSURE_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #PRESSURE_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PressureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the pressure set for this reaction.
	 * 
	 * @param value The value to set on the "PressureUnits" field
	 */
	public void setPressureUnits(String value) {
		setField(PRESSURE_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PURITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: The purity of this compound
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
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: The purity of this compound
	 * 
	 * @param value The value to set on the "Purity" field
	 */
	public void setPurity(Double value) {
		setField(PURITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUANTITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity remaining of this item.
	 * 
	 * @return the value stored on the "Quantity" field
	 */
	public Double getQuantity() {
		return getField(QUANTITY);
	}
	
	/**
	 * Sets the value stored on the {@link #QUANTITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: The quantity remaining of this item.
	 * 
	 * @param value The value to set on the "Quantity" field
	 */
	public void setQuantity(Double value) {
		setField(QUANTITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUANTITY_PER_ITEM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuantityPerItem<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity / Volume Per Item<br/>
	 * <br/>
	 * <b>Description</b>: Amount received per shipment of this item.
	 * 
	 * @return the value stored on the "QuantityPerItem" field
	 */
	public Double getQuantityPerItem() {
		return getField(QUANTITY_PER_ITEM);
	}
	
	/**
	 * Sets the value stored on the {@link #QUANTITY_PER_ITEM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuantityPerItem<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity / Volume Per Item<br/>
	 * <br/>
	 * <b>Description</b>: Amount received per shipment of this item.
	 * 
	 * @param value The value to set on the "QuantityPerItem" field
	 */
	public void setQuantityPerItem(Double value) {
		setField(QUANTITY_PER_ITEM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUANTITY_REMAINING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Remaining<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "QuantityRemaining" field
	 */
	public Double getQuantityRemaining() {
		return getField(QUANTITY_REMAINING);
	}
	
	/**
	 * Sets the value stored on the {@link #QUANTITY_REMAINING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuantityRemaining<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Remaining<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "QuantityRemaining" field
	 */
	public void setQuantityRemaining(Double value) {
		setField(QUANTITY_REMAINING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REACTION_COEFFICIENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReactionCoefficient<br/>
	 * <br/>
	 * <b>Display Name</b>: Equivalents<br/>
	 * <br/>
	 * <b>Description</b>: The coefficients for this reaction.
	 * 
	 * @return the value stored on the "ReactionCoefficient" field
	 */
	public Double getReactionCoefficient() {
		return getField(REACTION_COEFFICIENT);
	}
	
	/**
	 * Sets the value stored on the {@link #REACTION_COEFFICIENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReactionCoefficient<br/>
	 * <br/>
	 * <b>Display Name</b>: Equivalents<br/>
	 * <br/>
	 * <b>Description</b>: The coefficients for this reaction.
	 * 
	 * @param value The value to set on the "ReactionCoefficient" field
	 */
	public void setReactionCoefficient(Double value) {
		setField(REACTION_COEFFICIENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REACTION_PLAN_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReactionPlanUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Units<br/>
	 * <br/>
	 * <b>Description</b>: The possible units for the theoretical amount of a compound for this reaction.
	 * 
	 * @return the value stored on the "ReactionPlanUnits" field
	 */
	public String getReactionPlanUnits() {
		return getField(REACTION_PLAN_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #REACTION_PLAN_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReactionPlanUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Theoretical Units<br/>
	 * <br/>
	 * <b>Description</b>: The possible units for the theoretical amount of a compound for this reaction.
	 * 
	 * @param value The value to set on the "ReactionPlanUnits" field
	 */
	public void setReactionPlanUnits(String value) {
		setField(REACTION_PLAN_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry Id<br/>
	 * <br/>
	 * <b>Description</b>: The ID of this compound.
	 * 
	 * @return the value stored on the "RegistryId" field
	 */
	public String getRegistryId() {
		return getField(REGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #REGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry Id<br/>
	 * <br/>
	 * <b>Description</b>: The ID of this compound.
	 * 
	 * @param value The value to set on the "RegistryId" field
	 */
	public void setRegistryId(String value) {
		setField(REGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REORDER_LEVEL_QUANTITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReorderLevelQuantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Reorder Level Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 * 
	 * @return the value stored on the "ReorderLevelQuantity" field
	 */
	public Double getReorderLevelQuantity() {
		return getField(REORDER_LEVEL_QUANTITY);
	}
	
	/**
	 * Sets the value stored on the {@link #REORDER_LEVEL_QUANTITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReorderLevelQuantity<br/>
	 * <br/>
	 * <b>Display Name</b>: Reorder Level Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Quantity / volume at which an alert notification will be issued.
	 * 
	 * @param value The value to set on the "ReorderLevelQuantity" field
	 */
	public void setReorderLevelQuantity(Double value) {
		setField(REORDER_LEVEL_QUANTITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RETEST_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RetestDate" field
	 */
	public Long getRetestDate() {
		return getField(RETEST_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #RETEST_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RetestDate" field
	 */
	public void setRetestDate(Long value) {
		setField(RETEST_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROLE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Role<br/>
	 * <br/>
	 * <b>Display Name</b>: Role<br/>
	 * <br/>
	 * <b>Description</b>: The type of compound for this reaction.
	 * 
	 * @return the value stored on the "Role" field
	 */
	public String getRole() {
		return getField(ROLE);
	}
	
	/**
	 * Sets the value stored on the {@link #ROLE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Role<br/>
	 * <br/>
	 * <b>Display Name</b>: Role<br/>
	 * <br/>
	 * <b>Description</b>: The type of compound for this reaction.
	 * 
	 * @param value The value to set on the "Role" field
	 */
	public void setRole(String value) {
		setField(ROLE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RUN_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "RunId" field
	 */
	public String getRunId() {
		return getField(RUN_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #RUN_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "RunId" field
	 */
	public void setRunId(String value) {
		setField(RUN_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RUN_NUMBER_2} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunNumber2<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RunNumber2" field
	 */
	public Double getRunNumber2() {
		return getField(RUN_NUMBER_2);
	}
	
	/**
	 * Sets the value stored on the {@link #RUN_NUMBER_2} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunNumber2<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RunNumber2" field
	 */
	public void setRunNumber2(Double value) {
		setField(RUN_NUMBER_2, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SMILES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: The SMILES for a compound.
	 * 
	 * @return the value stored on the "SMILES" field
	 */
	public String getSMILES() {
		return getField(SMILES);
	}
	
	/**
	 * Sets the value stored on the {@link #SMILES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: The SMILES for a compound.
	 * 
	 * @param value The value to set on the "SMILES" field
	 */
	public void setSMILES(String value) {
		setField(SMILES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Barcode<br/>
	 * <br/>
	 * <b>Description</b>: Sample Receiving
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
	 * <b>Display Name</b>: Sample Barcode<br/>
	 * <br/>
	 * <b>Description</b>: Sample Receiving
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
	 * <b>Description</b>: The mean of the samples.
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
	 * <b>Description</b>: The mean of the samples.
	 * 
	 * @param value The value to set on the "SampleMean" field
	 */
	public void setSampleMean(Double value) {
		setField(SAMPLE_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_MEAN_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the mean that the assay data should be within.
	 * 
	 * @return the value stored on the "SampleMeanThreshold" field
	 */
	public Double getSampleMeanThreshold() {
		return getField(SAMPLE_MEAN_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_MEAN_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the mean that the assay data should be within.
	 * 
	 * @param value The value to set on the "SampleMeanThreshold" field
	 */
	public void setSampleMeanThreshold(Double value) {
		setField(SAMPLE_MEAN_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_NORMALIZED_MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: The mean when normalizing the samples.
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
	 * <b>Description</b>: The mean when normalizing the samples.
	 * 
	 * @param value The value to set on the "SampleNormalizedMean" field
	 */
	public void setSampleNormalizedMean(Double value) {
		setField(SAMPLE_NORMALIZED_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_NORMALIZED_MEAN_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleNormalizedMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean Threshold<br/>
	 * <br/>
	 * <b>Description</b>: The threshold for the mean when normalizing the samples.
	 * 
	 * @return the value stored on the "SampleNormalizedMeanThreshold" field
	 */
	public Double getSampleNormalizedMeanThreshold() {
		return getField(SAMPLE_NORMALIZED_MEAN_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_NORMALIZED_MEAN_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleNormalizedMeanThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean Threshold<br/>
	 * <br/>
	 * <b>Description</b>: The threshold for the mean when normalizing the samples.
	 * 
	 * @param value The value to set on the "SampleNormalizedMeanThreshold" field
	 */
	public void setSampleNormalizedMeanThreshold(Double value) {
		setField(SAMPLE_NORMALIZED_MEAN_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_STD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: The STD for this item.
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
	 * <b>Description</b>: The STD for this item.
	 * 
	 * @param value The value to set on the "SampleStd" field
	 */
	public void setSampleStd(Double value) {
		setField(SAMPLE_STD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_STD_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleStdThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard deviation that the assay data should be within.
	 * 
	 * @return the value stored on the "SampleStdThreshold" field
	 */
	public Double getSampleStdThreshold() {
		return getField(SAMPLE_STD_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_STD_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleStdThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard deviation that the assay data should be within.
	 * 
	 * @param value The value to set on the "SampleStdThreshold" field
	 */
	public void setSampleStdThreshold(Double value) {
		setField(SAMPLE_STD_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SELECTED_FOR_INTERMEDIATE_POOL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedForIntermediatePool<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pool<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SelectedForIntermediatePool" field
	 */
	public Boolean getSelectedForIntermediatePool() {
		return getField(SELECTED_FOR_INTERMEDIATE_POOL);
	}
	
	/**
	 * Sets the value stored on the {@link #SELECTED_FOR_INTERMEDIATE_POOL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SelectedForIntermediatePool<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pool<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SelectedForIntermediatePool" field
	 */
	public void setSelectedForIntermediatePool(Boolean value) {
		setField(SELECTED_FOR_INTERMEDIATE_POOL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCER_INSTRUMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerInstrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Used<br/>
	 * <br/>
	 * <b>Description</b>: The sequencer used.
	 * 
	 * @return the value stored on the "SequencerInstrument" field
	 */
	public String getSequencerInstrument() {
		return getField(SEQUENCER_INSTRUMENT);
	}
	
	/**
	 * Sets the value stored on the {@link #SEQUENCER_INSTRUMENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerInstrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Used<br/>
	 * <br/>
	 * <b>Description</b>: The sequencer used.
	 * 
	 * @param value The value to set on the "SequencerInstrument" field
	 */
	public void setSequencerInstrument(String value) {
		setField(SEQUENCER_INSTRUMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCER_RUN_FOLDER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerRunFolder<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Folder<br/>
	 * <br/>
	 * <b>Description</b>: The sequencing run folder 
	 * 
	 * @return the value stored on the "SequencerRunFolder" field
	 */
	public String getSequencerRunFolder() {
		return getField(SEQUENCER_RUN_FOLDER);
	}
	
	/**
	 * Sets the value stored on the {@link #SEQUENCER_RUN_FOLDER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerRunFolder<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Folder<br/>
	 * <br/>
	 * <b>Description</b>: The sequencing run folder 
	 * 
	 * @param value The value to set on the "SequencerRunFolder" field
	 */
	public void setSequencerRunFolder(String value) {
		setField(SEQUENCER_RUN_FOLDER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCING_RUN_MODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencingRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "SequencingRunMode" field
	 */
	public String getSequencingRunMode() {
		return getField(SEQUENCING_RUN_MODE);
	}
	
	/**
	 * Sets the value stored on the {@link #SEQUENCING_RUN_MODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencingRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "SequencingRunMode" field
	 */
	public void setSequencingRunMode(String value) {
		setField(SEQUENCING_RUN_MODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCING_RUN_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencingRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Type<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @return the value stored on the "SequencingRunType" field
	 */
	public String getSequencingRunType() {
		return getField(SEQUENCING_RUN_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #SEQUENCING_RUN_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencingRunType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Type<br/>
	 * <br/>
	 * <b>Description</b>: Illumina Sequencing Template
	 * 
	 * @param value The value to set on the "SequencingRunType" field
	 */
	public void setSequencingRunType(String value) {
		setField(SEQUENCING_RUN_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SERIAL_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SerialNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Serial Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "SerialNumber" field
	 */
	public String getSerialNumber() {
		return getField(SERIAL_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #SERIAL_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SerialNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Serial Number<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "SerialNumber" field
	 */
	public void setSerialNumber(String value) {
		setField(SERIAL_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_PART_CONSUMABLE_LOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this stain.
	 * 
	 * @return the value stored on the "StainPartConsumableLot" field
	 */
	public String getStainPartConsumableLot() {
		return getField(STAIN_PART_CONSUMABLE_LOT);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_PART_CONSUMABLE_LOT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this stain.
	 * 
	 * @param value The value to set on the "StainPartConsumableLot" field
	 */
	public void setStainPartConsumableLot(String value) {
		setField(STAIN_PART_CONSUMABLE_LOT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STANDARD_ERROR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: The STDER for this item.
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
	 * <b>Description</b>: The STDER for this item.
	 * 
	 * @param value The value to set on the "StandardError" field
	 */
	public void setStandardError(Double value) {
		setField(STANDARD_ERROR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STANDARD_ERROR_THRESHOLD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StandardErrorThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard error that the assay data should be within.
	 * 
	 * @return the value stored on the "StandardErrorThreshold" field
	 */
	public Double getStandardErrorThreshold() {
		return getField(STANDARD_ERROR_THRESHOLD);
	}
	
	/**
	 * Sets the value stored on the {@link #STANDARD_ERROR_THRESHOLD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StandardErrorThreshold<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error Threshold (%)<br/>
	 * <br/>
	 * <b>Description</b>: The percentage of the difference between the standard error that the assay data should be within.
	 * 
	 * @param value The value to set on the "StandardErrorThreshold" field
	 */
	public void setStandardErrorThreshold(Double value) {
		setField(STANDARD_ERROR_THRESHOLD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STEP_2} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Step2<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Step2" field
	 */
	public String getStep2() {
		return getField(STEP_2);
	}
	
	/**
	 * Sets the value stored on the {@link #STEP_2} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Step2<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Step2" field
	 */
	public void setStep2(String value) {
		setField(STEP_2, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
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
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "StorageUnitPath" field
	 */
	public void setStorageUnitPath(String value) {
		setField(STORAGE_UNIT_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the strain used for screening.
	 * 
	 * @return the value stored on the "StrainName" field
	 */
	public String getStrainName() {
		return getField(STRAIN_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the strain used for screening.
	 * 
	 * @param value The value to set on the "StrainName" field
	 */
	public void setStrainName(String value) {
		setField(STRAIN_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_PART_CONSUMABLE_LOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this strain.
	 * 
	 * @return the value stored on the "StrainPartConsumableLot" field
	 */
	public String getStrainPartConsumableLot() {
		return getField(STRAIN_PART_CONSUMABLE_LOT);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_PART_CONSUMABLE_LOT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainPartConsumableLot<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number for this strain.
	 * 
	 * @param value The value to set on the "StrainPartConsumableLot" field
	 */
	public void setStrainPartConsumableLot(String value) {
		setField(STRAIN_PART_CONSUMABLE_LOT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TECHNICIAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Technician<br/>
	 * <br/>
	 * <b>Display Name</b>: Technician<br/>
	 * <br/>
	 * <b>Description</b>: This field is backed by the usernames of users with access to this Lab/App. Names may also be directly entered.
	 * 
	 * @return the value stored on the "Technician" field
	 */
	public String getTechnician() {
		return getField(TECHNICIAN);
	}
	
	/**
	 * Sets the value stored on the {@link #TECHNICIAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Technician<br/>
	 * <br/>
	 * <b>Display Name</b>: Technician<br/>
	 * <br/>
	 * <b>Description</b>: This field is backed by the usernames of users with access to this Lab/App. Names may also be directly entered.
	 * 
	 * @param value The value to set on the "Technician" field
	 */
	public void setTechnician(String value) {
		setField(TECHNICIAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPERATURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: The temperature set for this reaction.
	 * 
	 * @return the value stored on the "Temperature" field
	 */
	public Long getTemperature() {
		return getField(TEMPERATURE);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPERATURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: The temperature set for this reaction.
	 * 
	 * @param value The value to set on the "Temperature" field
	 */
	public void setTemperature(Long value) {
		setField(TEMPERATURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPERATURE_DURING_SEPARATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemperatureDuringSeparation<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature During Separation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TemperatureDuringSeparation" field
	 */
	public Long getTemperatureDuringSeparation() {
		return getField(TEMPERATURE_DURING_SEPARATION);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPERATURE_DURING_SEPARATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemperatureDuringSeparation<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature During Separation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TemperatureDuringSeparation" field
	 */
	public void setTemperatureDuringSeparation(Long value) {
		setField(TEMPERATURE_DURING_SEPARATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPERATURE_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemperatureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the temperature of this reaction.
	 * 
	 * @return the value stored on the "TemperatureUnits" field
	 */
	public String getTemperatureUnits() {
		return getField(TEMPERATURE_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPERATURE_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemperatureUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the temperature of this reaction.
	 * 
	 * @param value The value to set on the "TemperatureUnits" field
	 */
	public void setTemperatureUnits(String value) {
		setField(TEMPERATURE_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Units<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: This field is used for defining formulation recipe
	 * 
	 * @return the value stored on the "Units" field
	 */
	public String getUnits() {
		return getField(UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Units<br/>
	 * <br/>
	 * <b>Display Name</b>: Units<br/>
	 * <br/>
	 * <b>Description</b>: This field is used for defining formulation recipe
	 * 
	 * @param value The value to set on the "Units" field
	 */
	public void setUnits(String value) {
		setField(UNITS, value);
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
	
	/**
	 * Retrieves the value stored on the {@link #VENDOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @return the value stored on the "Vendor" field
	 */
	public String getVendor() {
		return getField(VENDOR);
	}
	
	/**
	 * Sets the value stored on the {@link #VENDOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: Consumable Tracking
	 * 
	 * @param value The value to set on the "Vendor" field
	 */
	public void setVendor(String value) {
		setField(VENDOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: The volume for this item.
	 * 
	 * @return the value stored on the "Volume" field
	 */
	public Double getVolume() {
		return getField(VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume<br/>
	 * <br/>
	 * <b>Description</b>: The volume for this item.
	 * 
	 * @param value The value to set on the "Volume" field
	 */
	public void setVolume(Double value) {
		setField(VOLUME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VOLUME_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VolumeUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the volume of this item.
	 * 
	 * @return the value stored on the "VolumeUnits" field
	 */
	public String getVolumeUnits() {
		return getField(VOLUME_UNITS);
	}
	
	/**
	 * Sets the value stored on the {@link #VOLUME_UNITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VolumeUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Volume Units<br/>
	 * <br/>
	 * <b>Description</b>: The units for the volume of this item.
	 * 
	 * @param value The value to set on the "VolumeUnits" field
	 */
	public void setVolumeUnits(String value) {
		setField(VOLUME_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #WORKSTATION_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: WorkstationId<br/>
	 * <br/>
	 * <b>Display Name</b>: Workstation ID<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @return the value stored on the "WorkstationId" field
	 */
	public String getWorkstationId() {
		return getField(WORKSTATION_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #WORKSTATION_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: WorkstationId<br/>
	 * <br/>
	 * <b>Display Name</b>: Workstation ID<br/>
	 * <br/>
	 * <b>Description</b>: Instrument Tracking
	 * 
	 * @param value The value to set on the "WorkstationId" field
	 */
	public void setWorkstationId(String value) {
		setField(WORKSTATION_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #YIELD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: % Yield<br/>
	 * <br/>
	 * <b>Description</b>: The yield for this reaction compound.
	 * 
	 * @return the value stored on the "Yield" field
	 */
	public Double getYield() {
		return getField(YIELD);
	}
	
	/**
	 * Sets the value stored on the {@link #YIELD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: % Yield<br/>
	 * <br/>
	 * <b>Description</b>: The yield for this reaction compound.
	 * 
	 * @param value The value to set on the "Yield" field
	 */
	public void setYield(Double value) {
		setField(YIELD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INCHI} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: Inchi<br/>
	 * <br/>
	 * <b>Description</b>: The Inchi for this compound.
	 * 
	 * @return the value stored on the "inchi" field
	 */
	public String getinchi() {
		return getField(INCHI);
	}
	
	/**
	 * Sets the value stored on the {@link #INCHI} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: Inchi<br/>
	 * <br/>
	 * <b>Description</b>: The Inchi for this compound.
	 * 
	 * @param value The value to set on the "inchi" field
	 */
	public void setinchi(String value) {
		setField(INCHI, value);
	}
}