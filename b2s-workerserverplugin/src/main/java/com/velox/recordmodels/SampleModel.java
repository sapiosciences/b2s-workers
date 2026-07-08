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
 * Automatically generated class for: Sample
 */
@ExemplarDataTypeModel(dataTypeName="Sample")
public class SampleModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "Sample";

	/**
	 * <b>Data Field Name</b>: ActiveWorkflowId<br/>
	 * <br/>
	 * <b>Display Name</b>: Active Workflow ID<br/>
	 * <br/>
	 * <b>Description</b>: Stores the last process workflow identifier.
	 */
	public static final String ACTIVE_WORKFLOW_ID = "ActiveWorkflowId";

	/**
	 * <b>Data Field Name</b>: Antibody.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String ANTIBODY_CONSUMABLE_NAME = "Antibody.ConsumableName";

	/**
	 * <b>Data Field Name</b>: Antibody.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String ANTIBODY_CONSUMABLE_TYPE = "Antibody.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Antibody.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String ANTIBODY_CREATED_BY = "Antibody.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Antibody.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String ANTIBODY_DATA_RECORD_NAME = "Antibody.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Antibody.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String ANTIBODY_DATE_CREATED = "Antibody.DateCreated";

	/**
	 * <b>Data Field Name</b>: Antibody.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String ANTIBODY_EXPIRATION_DATE = "Antibody.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Antibody.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ANTIBODY_EXPIRED = "Antibody.Expired";

	/**
	 * <b>Data Field Name</b>: Antibody.HELM<br/>
	 * <br/>
	 * <b>Display Name</b>: HELM<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ANTIBODY_HELM = "Antibody.HELM";

	/**
	 * <b>Data Field Name</b>: Antibody.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String ANTIBODY_LOT_NUMBER = "Antibody.LotNumber";

	/**
	 * <b>Data Field Name</b>: Antibody.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String ANTIBODY_RECORD_ID = "Antibody.RecordId";

	/**
	 * <b>Data Field Name</b>: Antibody.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 */
	public static final String ANTIBODY_REGISTRY_ID = "Antibody.RegistryId";

	/**
	 * <b>Data Field Name</b>: Antibody.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ANTIBODY_VALIDATED = "Antibody.Validated";

	/**
	 * <b>Data Field Name</b>: Antibody.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String ANTIBODY_VELOX_LAST_MODIFIED_BY = "Antibody.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Antibody.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String ANTIBODY_VELOX_LAST_MODIFIED_DATE = "Antibody.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: Antibody.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 */
	public static final String ANTIBODY_VENDOR = "Antibody.Vendor";

	/**
	 * <b>Data Field Name</b>: AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: [System Field] Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: Invisible to user. System field used in Sample Receiving.
	 */
	public static final String ASSAY_TYPE = "AssayType";

	/**
	 * <b>Data Field Name</b>: BioConjugate.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String BIO_CONJUGATE_CONSUMABLE_NAME = "BioConjugate.ConsumableName";

	/**
	 * <b>Data Field Name</b>: BioConjugate.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String BIO_CONJUGATE_CONSUMABLE_TYPE = "BioConjugate.ConsumableType";

	/**
	 * <b>Data Field Name</b>: BioConjugate.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String BIO_CONJUGATE_CREATED_BY = "BioConjugate.CreatedBy";

	/**
	 * <b>Data Field Name</b>: BioConjugate.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String BIO_CONJUGATE_DATA_RECORD_NAME = "BioConjugate.DataRecordName";

	/**
	 * <b>Data Field Name</b>: BioConjugate.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String BIO_CONJUGATE_DATE_CREATED = "BioConjugate.DateCreated";

	/**
	 * <b>Data Field Name</b>: BioConjugate.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String BIO_CONJUGATE_EXPIRATION_DATE = "BioConjugate.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: BioConjugate.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String BIO_CONJUGATE_EXPIRED = "BioConjugate.Expired";

	/**
	 * <b>Data Field Name</b>: BioConjugate.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String BIO_CONJUGATE_LOT_NUMBER = "BioConjugate.LotNumber";

	/**
	 * <b>Data Field Name</b>: BioConjugate.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String BIO_CONJUGATE_RECORD_ID = "BioConjugate.RecordId";

	/**
	 * <b>Data Field Name</b>: BioConjugate.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 */
	public static final String BIO_CONJUGATE_REGISTRY_ID = "BioConjugate.RegistryId";

	/**
	 * <b>Data Field Name</b>: BioConjugate.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String BIO_CONJUGATE_VALIDATED = "BioConjugate.Validated";

	/**
	 * <b>Data Field Name</b>: BioConjugate.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String BIO_CONJUGATE_VELOX_LAST_MODIFIED_BY = "BioConjugate.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: BioConjugate.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String BIO_CONJUGATE_VELOX_LAST_MODIFIED_DATE = "BioConjugate.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: BioConjugate.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 */
	public static final String BIO_CONJUGATE_VENDOR = "BioConjugate.Vendor";

	/**
	 * <b>Data Field Name</b>: C_AnalysisSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Analysis Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___ANALYSIS_SAMPLE_TYPE = "C_AnalysisSampleType";

	/**
	 * <b>Data Field Name</b>: C_BioanalysisUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Bioanalysis Use<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___BIOANALYSIS_USE = "C_BioanalysisUse";

	/**
	 * <b>Data Field Name</b>: C_CharacterizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Characterization Method<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___CHARACTERIZATION_METHOD = "C_CharacterizationMethod";

	/**
	 * <b>Data Field Name</b>: C_Column.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 */
	public static final String C___COLUMN_C___CONSUMABLE_NAME = "C_Column.C_ConsumableName";

	/**
	 * <b>Data Field Name</b>: C_Column.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 */
	public static final String C___COLUMN_C___CONSUMABLE_TYPE = "C_Column.C_ConsumableType";

	/**
	 * <b>Data Field Name</b>: C_Column.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 */
	public static final String C___COLUMN_C___EXPIRATION_DATE = "C_Column.C_ExpirationDate";

	/**
	 * <b>Data Field Name</b>: C_Column.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 */
	public static final String C___COLUMN_C___EXPIRED = "C_Column.C_Expired";

	/**
	 * <b>Data Field Name</b>: C_Column.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 */
	public static final String C___COLUMN_C___LOT_NUMBER = "C_Column.C_LotNumber";

	/**
	 * <b>Data Field Name</b>: C_Column.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 */
	public static final String C___COLUMN_C___PART_NUMBER = "C_Column.C_PartNumber";

	/**
	 * <b>Data Field Name</b>: C_Column.C_Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COLUMN_C___PRESSURE = "C_Column.C_Pressure";

	/**
	 * <b>Data Field Name</b>: C_Column.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 */
	public static final String C___COLUMN_C___VALIDATED = "C_Column.C_Validated";

	/**
	 * <b>Data Field Name</b>: C_Column.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String C___COLUMN_CREATED_BY = "C_Column.CreatedBy";

	/**
	 * <b>Data Field Name</b>: C_Column.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String C___COLUMN_DATA_RECORD_NAME = "C_Column.DataRecordName";

	/**
	 * <b>Data Field Name</b>: C_Column.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String C___COLUMN_DATE_CREATED = "C_Column.DateCreated";

	/**
	 * <b>Data Field Name</b>: C_Column.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String C___COLUMN_RECORD_ID = "C_Column.RecordId";

	/**
	 * <b>Data Field Name</b>: C_Column.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String C___COLUMN_VELOX_LAST_MODIFIED_BY = "C_Column.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: C_Column.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String C___COLUMN_VELOX_LAST_MODIFIED_DATE = "C_Column.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: C_CompletedCharacterization<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Characterization<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COMPLETED_CHARACTERIZATION = "C_CompletedCharacterization";

	/**
	 * <b>Data Field Name</b>: C_Criticality<br/>
	 * <br/>
	 * <b>Display Name</b>: Criticality<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___CRITICALITY = "C_Criticality";

	/**
	 * <b>Data Field Name</b>: C_Fraction.C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FRACTION_C___FINAL_FRACTIONM_L = "C_Fraction.C_FinalFractionmL";

	/**
	 * <b>Data Field Name</b>: C_Fraction.C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FRACTION_C___INITIAL_FRACTIONM_L = "C_Fraction.C_InitialFractionmL";

	/**
	 * <b>Data Field Name</b>: C_Fraction.C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FRACTION_C___RUN_NUMBER = "C_Fraction.C_RunNumber";

	/**
	 * <b>Data Field Name</b>: C_Fraction.C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FRACTION_C___SELECTED_FOR_INTERMEDI = "C_Fraction.C_SelectedForIntermedi";

	/**
	 * <b>Data Field Name</b>: C_Fraction.C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FRACTION_C___STEP = "C_Fraction.C_Step";

	/**
	 * <b>Data Field Name</b>: C_Fraction.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String C___FRACTION_CREATED_BY = "C_Fraction.CreatedBy";

	/**
	 * <b>Data Field Name</b>: C_Fraction.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String C___FRACTION_DATA_RECORD_NAME = "C_Fraction.DataRecordName";

	/**
	 * <b>Data Field Name</b>: C_Fraction.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String C___FRACTION_DATE_CREATED = "C_Fraction.DateCreated";

	/**
	 * <b>Data Field Name</b>: C_Fraction.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String C___FRACTION_RECORD_ID = "C_Fraction.RecordId";

	/**
	 * <b>Data Field Name</b>: C_Fraction.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String C___FRACTION_VELOX_LAST_MODIFIED_BY = "C_Fraction.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: C_Fraction.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String C___FRACTION_VELOX_LAST_MODIFIED_DATE = "C_Fraction.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: C_Hazard<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___HAZARD = "C_Hazard";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 */
	public static final String C___LABWARE_C___CONSUMABLE_NAME = "C_Labware.C_ConsumableName";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 */
	public static final String C___LABWARE_C___CONSUMABLE_TYPE = "C_Labware.C_ConsumableType";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 */
	public static final String C___LABWARE_C___EXPIRATION_DATE = "C_Labware.C_ExpirationDate";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 */
	public static final String C___LABWARE_C___EXPIRED = "C_Labware.C_Expired";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 */
	public static final String C___LABWARE_C___LOT_NUMBER = "C_Labware.C_LotNumber";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 */
	public static final String C___LABWARE_C___PART_NUMBER = "C_Labware.C_PartNumber";

	/**
	 * <b>Data Field Name</b>: C_Labware.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 */
	public static final String C___LABWARE_C___VALIDATED = "C_Labware.C_Validated";

	/**
	 * <b>Data Field Name</b>: C_Labware.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String C___LABWARE_CREATED_BY = "C_Labware.CreatedBy";

	/**
	 * <b>Data Field Name</b>: C_Labware.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String C___LABWARE_DATA_RECORD_NAME = "C_Labware.DataRecordName";

	/**
	 * <b>Data Field Name</b>: C_Labware.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String C___LABWARE_DATE_CREATED = "C_Labware.DateCreated";

	/**
	 * <b>Data Field Name</b>: C_Labware.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String C___LABWARE_RECORD_ID = "C_Labware.RecordId";

	/**
	 * <b>Data Field Name</b>: C_Labware.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String C___LABWARE_VELOX_LAST_MODIFIED_BY = "C_Labware.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: C_Labware.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String C___LABWARE_VELOX_LAST_MODIFIED_DATE = "C_Labware.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: C_OpenedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Opened Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___OPENED_DATE = "C_OpenedDate";

	/**
	 * <b>Data Field Name</b>: C_PreparationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparation Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___PREPARATION_DATE = "C_PreparationDate";

	/**
	 * <b>Data Field Name</b>: C_PreparerInitials<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparer Initials<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___PREPARER_INITIALS = "C_PreparerInitials";

	/**
	 * <b>Data Field Name</b>: C_RecommendedStorage<br/>
	 * <br/>
	 * <b>Display Name</b>: Recommended Storage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___RECOMMENDED_STORAGE = "C_RecommendedStorage";

	/**
	 * <b>Data Field Name</b>: C_RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___RETEST_DATE = "C_RetestDate";

	/**
	 * <b>Data Field Name</b>: C_SampleMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SAMPLE_MATRIX = "C_SampleMatrix";

	/**
	 * <b>Data Field Name</b>: C_SponsorBatchId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Batch Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SPONSOR_BATCH_ID = "C_SponsorBatchId";

	/**
	 * <b>Data Field Name</b>: C_SponsorStudyNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Study Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SPONSOR_STUDY_NUMBER = "C_SponsorStudyNumber";

	/**
	 * <b>Data Field Name</b>: C_StabilityRetestInterval<br/>
	 * <br/>
	 * <b>Display Name</b>: Stability Retest Interval<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STABILITY_RETEST_INTERVAL = "C_StabilityRetestInterval";

	/**
	 * <b>Data Field Name</b>: C_pH<br/>
	 * <br/>
	 * <b>Display Name</b>: pH<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C__P_H = "C_pH";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: The CAS number if known.
	 */
	public static final String CHEMICAL_REAGENT_CAS = "ChemicalReagent.CAS";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_CXSMILESHASH = "ChemicalReagent.CXSMILESHash";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 */
	public static final String CHEMICAL_REAGENT_CHARGE = "ChemicalReagent.Charge";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable part.
	 */
	public static final String CHEMICAL_REAGENT_CONSUMABLE_TYPE = "ChemicalReagent.ConsumableType";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String CHEMICAL_REAGENT_CREATED_BY = "ChemicalReagent.CreatedBy";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String CHEMICAL_REAGENT_DATA_RECORD_NAME = "ChemicalReagent.DataRecordName";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String CHEMICAL_REAGENT_DATE_CREATED = "ChemicalReagent.DateCreated";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 */
	public static final String CHEMICAL_REAGENT_EXACT_MASS = "ChemicalReagent.ExactMass";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String CHEMICAL_REAGENT_EXPIRATION_DATE = "ChemicalReagent.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_EXPIRED = "ChemicalReagent.Expired";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: The chemical formula of this molecule.
	 */
	public static final String CHEMICAL_REAGENT_FORMULA = "ChemicalReagent.Formula";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_GHSCAUTION_CODE = "ChemicalReagent.GHSCautionCode";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 */
	public static final String CHEMICAL_REAGENT_GHSHAZARD_CODE = "ChemicalReagent.GHSHazardCode";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 */
	public static final String CHEMICAL_REAGENT_GHSPICTO_CODE = "ChemicalReagent.GHSPictoCode";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 */
	public static final String CHEMICAL_REAGENT_GHSSIGNAL = "ChemicalReagent.GHSSignal";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_HAS_OR_STEREO_GROUP = "ChemicalReagent.HasOrStereoGroup";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 */
	public static final String CHEMICAL_REAGENT_IUPAC = "ChemicalReagent.IUPAC";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_INCHI_KEY = "ChemicalReagent.InchiKey";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 */
	public static final String CHEMICAL_REAGENT_IS_GHSCLASSIFIED = "ChemicalReagent.IsGHSClassified";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String CHEMICAL_REAGENT_LOT_NUMBER = "ChemicalReagent.LotNumber";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 */
	public static final String CHEMICAL_REAGENT_MOLECULAR_WEIGHT = "ChemicalReagent.MolecularWeight";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 */
	public static final String CHEMICAL_REAGENT_POLAR_SURFACE_AREA = "ChemicalReagent.PolarSurfaceArea";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 */
	public static final String CHEMICAL_REAGENT_PUBCHEM_CID = "ChemicalReagent.PubchemCid";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_PURITY = "ChemicalReagent.Purity";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String CHEMICAL_REAGENT_RECORD_ID = "ChemicalReagent.RecordId";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 */
	public static final String CHEMICAL_REAGENT_REGISTRY_ID = "ChemicalReagent.RegistryId";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: Canonical SMILES<br/>
	 * <br/>
	 * <b>Description</b>: Canonical SMILES of RDKIt algorithm.
	 */
	public static final String CHEMICAL_REAGENT_SMILES = "ChemicalReagent.SMILES";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_STEREO_REG_HASH = "ChemicalReagent.StereoRegHash";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Supplier<br/>
	 * <br/>
	 * <b>Display Name</b>: Supplier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_SUPPLIER = "ChemicalReagent.Supplier";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 */
	public static final String CHEMICAL_REAGENT_TOTAL_HBOND_ACCEPTORS = "ChemicalReagent.TotalHBondAcceptors";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 */
	public static final String CHEMICAL_REAGENT_TOTAL_HBOND_COUNT = "ChemicalReagent.TotalHBondCount";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_VALIDATED = "ChemicalReagent.Validated";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_BY = "ChemicalReagent.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_DATE = "ChemicalReagent.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENT_YIELD = "ChemicalReagent.Yield";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 */
	public static final String CHEMICAL_REAGENTC_LOG_P = "ChemicalReagent.cLogP";

	/**
	 * <b>Data Field Name</b>: ChemicalReagent.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String CHEMICAL_REAGENTINCHI = "ChemicalReagent.inchi";

	/**
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position in the Storage Unit where this sample resides.
	 */
	public static final String COL_POSITION = "ColPosition";

	/**
	 * <b>Data Field Name</b>: CollectionDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COLLECTION_DATE = "CollectionDate";

	/**
	 * <b>Data Field Name</b>: CollectionDateTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date/Time<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COLLECTION_DATE_TIME = "CollectionDateTime";

	/**
	 * <b>Data Field Name</b>: Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMMENTS = "Comments";

	/**
	 * <b>Data Field Name</b>: Compound.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: CAS Registration Number. This may be blank for unregistered compounds.
	 */
	public static final String COMPOUND_CAS = "Compound.CAS";

	/**
	 * <b>Data Field Name</b>: Compound.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_CXSMILESHASH = "Compound.CXSMILESHash";

	/**
	 * <b>Data Field Name</b>: Compound.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 */
	public static final String COMPOUND_CHARGE = "Compound.Charge";

	/**
	 * <b>Data Field Name</b>: Compound.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String COMPOUND_CONSUMABLE_TYPE = "Compound.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Compound.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String COMPOUND_CREATED_BY = "Compound.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Compound.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String COMPOUND_DATA_RECORD_NAME = "Compound.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Compound.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String COMPOUND_DATE_CREATED = "Compound.DateCreated";

	/**
	 * <b>Data Field Name</b>: Compound.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 */
	public static final String COMPOUND_EXACT_MASS = "Compound.ExactMass";

	/**
	 * <b>Data Field Name</b>: Compound.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String COMPOUND_EXPIRATION_DATE = "Compound.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Compound.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_EXPIRED = "Compound.Expired";

	/**
	 * <b>Data Field Name</b>: Compound.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_FORMULA = "Compound.Formula";

	/**
	 * <b>Data Field Name</b>: Compound.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_GHSCAUTION_CODE = "Compound.GHSCautionCode";

	/**
	 * <b>Data Field Name</b>: Compound.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 */
	public static final String COMPOUND_GHSHAZARD_CODE = "Compound.GHSHazardCode";

	/**
	 * <b>Data Field Name</b>: Compound.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 */
	public static final String COMPOUND_GHSPICTO_CODE = "Compound.GHSPictoCode";

	/**
	 * <b>Data Field Name</b>: Compound.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 */
	public static final String COMPOUND_GHSSIGNAL = "Compound.GHSSignal";

	/**
	 * <b>Data Field Name</b>: Compound.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_HAS_OR_STEREO_GROUP = "Compound.HasOrStereoGroup";

	/**
	 * <b>Data Field Name</b>: Compound.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 */
	public static final String COMPOUND_IUPAC = "Compound.IUPAC";

	/**
	 * <b>Data Field Name</b>: Compound.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_INCHI_KEY = "Compound.InchiKey";

	/**
	 * <b>Data Field Name</b>: Compound.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 */
	public static final String COMPOUND_IS_GHSCLASSIFIED = "Compound.IsGHSClassified";

	/**
	 * <b>Data Field Name</b>: Compound.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String COMPOUND_LOT_NUMBER = "Compound.LotNumber";

	/**
	 * <b>Data Field Name</b>: Compound.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 */
	public static final String COMPOUND_MOLECULAR_WEIGHT = "Compound.MolecularWeight";

	/**
	 * <b>Data Field Name</b>: Compound.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 */
	public static final String COMPOUND_POLAR_SURFACE_AREA = "Compound.PolarSurfaceArea";

	/**
	 * <b>Data Field Name</b>: Compound.Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_PRESSURE = "Compound.Pressure";

	/**
	 * <b>Data Field Name</b>: Compound.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 */
	public static final String COMPOUND_PUBCHEM_CID = "Compound.PubchemCid";

	/**
	 * <b>Data Field Name</b>: Compound.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_PURITY = "Compound.Purity";

	/**
	 * <b>Data Field Name</b>: Compound.ReactionTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Reaction Time (h)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_REACTION_TIME = "Compound.ReactionTime";

	/**
	 * <b>Data Field Name</b>: Compound.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String COMPOUND_RECORD_ID = "Compound.RecordId";

	/**
	 * <b>Data Field Name</b>: Compound.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 */
	public static final String COMPOUND_REGISTRY_ID = "Compound.RegistryId";

	/**
	 * <b>Data Field Name</b>: Compound.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_SMILES = "Compound.SMILES";

	/**
	 * <b>Data Field Name</b>: Compound.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_STEREO_REG_HASH = "Compound.StereoRegHash";

	/**
	 * <b>Data Field Name</b>: Compound.Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_TEMPERATURE = "Compound.Temperature";

	/**
	 * <b>Data Field Name</b>: Compound.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 */
	public static final String COMPOUND_TOTAL_HBOND_ACCEPTORS = "Compound.TotalHBondAcceptors";

	/**
	 * <b>Data Field Name</b>: Compound.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 */
	public static final String COMPOUND_TOTAL_HBOND_COUNT = "Compound.TotalHBondCount";

	/**
	 * <b>Data Field Name</b>: Compound.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_VALIDATED = "Compound.Validated";

	/**
	 * <b>Data Field Name</b>: Compound.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String COMPOUND_VELOX_LAST_MODIFIED_BY = "Compound.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Compound.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String COMPOUND_VELOX_LAST_MODIFIED_DATE = "Compound.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: Compound.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_YIELD = "Compound.Yield";

	/**
	 * <b>Data Field Name</b>: Compound.ZoBioonly<br/>
	 * <br/>
	 * <b>Display Name</b>: Zo Bio only<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUND_ZO_BIOONLY = "Compound.ZoBioonly";

	/**
	 * <b>Data Field Name</b>: Compound.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 */
	public static final String COMPOUNDC_LOG_P = "Compound.cLogP";

	/**
	 * <b>Data Field Name</b>: Compound.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String COMPOUNDINCHI = "Compound.inchi";

	/**
	 * <b>Data Field Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The amount of mass per volume of sample material in the container. This could be a standard mass or a molar mass. The units are specified in the corresponding Concentration Units field.
	 */
	public static final String CONCENTRATION = "Concentration";

	/**
	 * <b>Data Field Name</b>: ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Concentration.
	 */
	public static final String CONCENTRATION_UNITS = "ConcentrationUnits";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position in the Storage Unit where this reagent resides.
	 */
	public static final String CONSUMABLE_ITEM_COL_POSITION = "ConsumableItem.ColPosition";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of a consumable object that this item represents.
	 */
	public static final String CONSUMABLE_ITEM_CONSUMABLE_NAME = "ConsumableItem.ConsumableName";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Type<br/>
	 * <br/>
	 * <b>Description</b>: Type of this particular consumable object.
	 */
	public static final String CONSUMABLE_ITEM_CONSUMABLE_TYPE = "ConsumableItem.ConsumableType";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String CONSUMABLE_ITEM_CREATED_BY = "ConsumableItem.CreatedBy";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String CONSUMABLE_ITEM_DATA_RECORD_NAME = "ConsumableItem.DataRecordName";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String CONSUMABLE_ITEM_DATE_CREATED = "ConsumableItem.DateCreated";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of expiration for this consumable item.
	 */
	public static final String CONSUMABLE_ITEM_EXPIRATION_DATE = "ConsumableItem.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 */
	public static final String CONSUMABLE_ITEM_EXPIRED = "ConsumableItem.Expired";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.KitLotNumbers<br/>
	 * <br/>
	 * <b>Display Name</b>: Kit Lot Numbers<br/>
	 * <br/>
	 * <b>Description</b>: Lot number(s) of a kit that this consumable item is a part of.
	 */
	public static final String CONSUMABLE_ITEM_KIT_LOT_NUMBERS = "ConsumableItem.KitLotNumbers";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number    <br/>
	 * <br/>
	 * <b>Description</b>: Lot number of this particular consumable item.
	 */
	public static final String CONSUMABLE_ITEM_LOT_NUMBER = "ConsumableItem.LotNumber";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.LotNumberDefined<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number Defined<br/>
	 * <br/>
	 * <b>Description</b>: This field is used to make the consumable item log number field either editable or not editable. This is a system field used by Materials Management
	 */
	public static final String CONSUMABLE_ITEM_LOT_NUMBER_DEFINED = "ConsumableItem.LotNumberDefined";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Part number corresponding to a consumable object to which this item belongs to.
	 */
	public static final String CONSUMABLE_ITEM_PART_NUMBER = "ConsumableItem.PartNumber";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String CONSUMABLE_ITEM_RECORD_ID = "ConsumableItem.RecordId";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position in the Storage Unit where this reagent resides.
	 */
	public static final String CONSUMABLE_ITEM_ROW_POSITION = "ConsumableItem.RowPosition";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this reagent resides.
	 */
	public static final String CONSUMABLE_ITEM_STORAGE_LOCATION_BARCODE = "ConsumableItem.StorageLocationBarcode";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
	 */
	public static final String CONSUMABLE_ITEM_STORAGE_UNIT_PATH = "ConsumableItem.StorageUnitPath";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 */
	public static final String CONSUMABLE_ITEM_VALIDATED = "ConsumableItem.Validated";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of validation for this consumable item.
	 */
	public static final String CONSUMABLE_ITEM_VALIDATION_DATE = "ConsumableItem.ValidationDate";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ValidationExperimentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Experiment Id<br/>
	 * <br/>
	 * <b>Description</b>: Id of an experiment during which this consumable item has been validated.
	 */
	public static final String CONSUMABLE_ITEM_VALIDATION_EXPERIMENT_ID = "ConsumableItem.ValidationExperimentId";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.ValidationTechician<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Technician<br/>
	 * <br/>
	 * <b>Description</b>: <!-- TECHNICIAN -->
	 */
	public static final String CONSUMABLE_ITEM_VALIDATION_TECHICIAN = "ConsumableItem.ValidationTechician";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_BY = "ConsumableItem.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: ConsumableItem.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_DATE = "ConsumableItem.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: ContainerType<br/>
	 * <br/>
	 * <b>Display Name</b>: Container Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of container the sample material is in.
	 */
	public static final String CONTAINER_TYPE = "ContainerType";

	/**
	 * <b>Data Field Name</b>: ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
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
	 * <b>Data Field Name</b>: DNA.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String DNACREATED_BY = "DNA.CreatedBy";

	/**
	 * <b>Data Field Name</b>: DNA.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String DNADATA_RECORD_NAME = "DNA.DataRecordName";

	/**
	 * <b>Data Field Name</b>: DNA.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DNADATE_CREATED = "DNA.DateCreated";

	/**
	 * <b>Data Field Name</b>: DNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNAEXPIRATION_DATE = "DNA.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: DNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNAEXPIRED = "DNA.Expired";

	/**
	 * <b>Data Field Name</b>: DNA.ItemId<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNAITEM_ID = "DNA.ItemId";

	/**
	 * <b>Data Field Name</b>: DNA.Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNANAME = "DNA.Name";

	/**
	 * <b>Data Field Name</b>: DNA.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable part. The default will be "Compound". It does not need to be unique. It is only used as a disambiguate in case of collision in auto-name.
	 */
	public static final String DNAPART_NUMBER = "DNA.PartNumber";

	/**
	 * <b>Data Field Name</b>: DNA.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String DNARECORD_ID = "DNA.RecordId";

	/**
	 * <b>Data Field Name</b>: DNA.SequenceType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequence Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNASEQUENCE_TYPE = "DNA.SequenceType";

	/**
	 * <b>Data Field Name</b>: DNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DNAVALIDATED = "DNA.Validated";

	/**
	 * <b>Data Field Name</b>: DNA.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String DNAVELOX_LAST_MODIFIED_BY = "DNA.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: DNA.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String DNAVELOX_LAST_MODIFIED_DATE = "DNA.VeloxLastModifiedDate";

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
	 * <b>Data Field Name</b>: DateofBirth<br/>
	 * <br/>
	 * <b>Display Name</b>: Date of Birth<br/>
	 * <br/>
	 * <b>Description</b>: Date of Birth of Patient
	 */
	public static final String DATEOF_BIRTH = "DateofBirth";

	/**
	 * <b>Data Field Name</b>: DrugProduct.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String DRUG_PRODUCT_CONSUMABLE_NAME = "DrugProduct.ConsumableName";

	/**
	 * <b>Data Field Name</b>: DrugProduct.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String DRUG_PRODUCT_CONSUMABLE_TYPE = "DrugProduct.ConsumableType";

	/**
	 * <b>Data Field Name</b>: DrugProduct.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String DRUG_PRODUCT_CREATED_BY = "DrugProduct.CreatedBy";

	/**
	 * <b>Data Field Name</b>: DrugProduct.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String DRUG_PRODUCT_DATA_RECORD_NAME = "DrugProduct.DataRecordName";

	/**
	 * <b>Data Field Name</b>: DrugProduct.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DRUG_PRODUCT_DATE_CREATED = "DrugProduct.DateCreated";

	/**
	 * <b>Data Field Name</b>: DrugProduct.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String DRUG_PRODUCT_EXPIRATION_DATE = "DrugProduct.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: DrugProduct.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String DRUG_PRODUCT_LOT_NUMBER = "DrugProduct.LotNumber";

	/**
	 * <b>Data Field Name</b>: DrugProduct.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: MES/ERP Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 */
	public static final String DRUG_PRODUCT_PART_NUMBER = "DrugProduct.PartNumber";

	/**
	 * <b>Data Field Name</b>: DrugProduct.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String DRUG_PRODUCT_RECORD_ID = "DrugProduct.RecordId";

	/**
	 * <b>Data Field Name</b>: DrugProduct.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 */
	public static final String DRUG_PRODUCT_VALIDATED = "DrugProduct.Validated";

	/**
	 * <b>Data Field Name</b>: DrugProduct.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String DRUG_PRODUCT_VELOX_LAST_MODIFIED_BY = "DrugProduct.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: DrugProduct.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String DRUG_PRODUCT_VELOX_LAST_MODIFIED_DATE = "DrugProduct.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: Enzyme.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme ID<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String ENZYME_CONSUMABLE_NAME = "Enzyme.ConsumableName";

	/**
	 * <b>Data Field Name</b>: Enzyme.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String ENZYME_CONSUMABLE_TYPE = "Enzyme.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Enzyme.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String ENZYME_CREATED_BY = "Enzyme.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Enzyme.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String ENZYME_DATA_RECORD_NAME = "Enzyme.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Enzyme.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String ENZYME_DATE_CREATED = "Enzyme.DateCreated";

	/**
	 * <b>Data Field Name</b>: Enzyme.DateOfPurchase<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Of Purchase<br/>
	 * <br/>
	 * <b>Description</b>: The purchasing date of this enzyme lot
	 */
	public static final String ENZYME_DATE_OF_PURCHASE = "Enzyme.DateOfPurchase";

	/**
	 * <b>Data Field Name</b>: Enzyme.EnzymeType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ENZYME_ENZYME_TYPE = "Enzyme.EnzymeType";

	/**
	 * <b>Data Field Name</b>: Enzyme.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String ENZYME_EXPIRATION_DATE = "Enzyme.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Enzyme.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ENZYME_EXPIRED = "Enzyme.Expired";

	/**
	 * <b>Data Field Name</b>: Enzyme.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String ENZYME_LOT_NUMBER = "Enzyme.LotNumber";

	/**
	 * <b>Data Field Name</b>: Enzyme.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 */
	public static final String ENZYME_PART_NUMBER = "Enzyme.PartNumber";

	/**
	 * <b>Data Field Name</b>: Enzyme.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String ENZYME_RECORD_ID = "Enzyme.RecordId";

	/**
	 * <b>Data Field Name</b>: Enzyme.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ENZYME_VALIDATED = "Enzyme.Validated";

	/**
	 * <b>Data Field Name</b>: Enzyme.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String ENZYME_VELOX_LAST_MODIFIED_BY = "Enzyme.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Enzyme.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String ENZYME_VELOX_LAST_MODIFIED_DATE = "Enzyme.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: Enzyme.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 */
	public static final String ENZYME_VENDOR = "Enzyme.Vendor";

	/**
	 * <b>Data Field Name</b>: ExemplarSampleStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Current process tracking status of the sample. This maintains the samples current availability and progress through its assigned processes. Once a sample enters into process tracking workflows, this field will usually contain values that reflect that it has become ready for, in process, completed, or failed for a workflow. Note that this status only applies to this specific aliquot and not the whole lineage of the sample from which it is derived.
	 */
	public static final String EXEMPLAR_SAMPLE_STATUS = "ExemplarSampleStatus";

	/**
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The physical type of sample material. (E.g. Blood, DNA, or DNA Library)
	 */
	public static final String EXEMPLAR_SAMPLE_TYPE = "ExemplarSampleType";

	/**
	 * <b>Data Field Name</b>: FedExTrackingNo<br/>
	 * <br/>
	 * <b>Display Name</b>: FedEx Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: Tracking Number of FedEx Shipment
	 */
	public static final String FED_EX_TRACKING_NO = "FedExTrackingNo";

	/**
	 * <b>Data Field Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Display Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FERMENTED = "Fermented";

	/**
	 * <b>Data Field Name</b>: Flags<br/>
	 * <br/>
	 * <b>Display Name</b>: Flags<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FLAGS = "Flags";

	/**
	 * <b>Data Field Name</b>: FlowJoGroupSideLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Jo Group Side Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String FLOW_JO_GROUP_SIDE_LINK = "FlowJoGroupSideLink";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AperioId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_APERIO_ID = "HistologySlide.AperioId";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AperioImageId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio Image ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_APERIO_IMAGE_ID = "HistologySlide.AperioImageId";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AssignedDosage<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Dosage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_ASSIGNED_DOSAGE = "HistologySlide.AssignedDosage";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AssignedGroups<br/>
	 * <br/>
	 * <b>Display Name</b>: Section(s) On Slide<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_ASSIGNED_GROUPS = "HistologySlide.AssignedGroups";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_ASSIGNED_STAIN = "HistologySlide.AssignedStain";

	/**
	 * <b>Data Field Name</b>: HistologySlide.AssignedTissue<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Tissue<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_ASSIGNED_TISSUE = "HistologySlide.AssignedTissue";

	/**
	 * <b>Data Field Name</b>: HistologySlide.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String HISTOLOGY_SLIDE_CREATED_BY = "HistologySlide.CreatedBy";

	/**
	 * <b>Data Field Name</b>: HistologySlide.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String HISTOLOGY_SLIDE_DATA_RECORD_NAME = "HistologySlide.DataRecordName";

	/**
	 * <b>Data Field Name</b>: HistologySlide.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String HISTOLOGY_SLIDE_DATE_CREATED = "HistologySlide.DateCreated";

	/**
	 * <b>Data Field Name</b>: HistologySlide.FileIdentifier<br/>
	 * <br/>
	 * <b>Display Name</b>: File Identifier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_FILE_IDENTIFIER = "HistologySlide.FileIdentifier";

	/**
	 * <b>Data Field Name</b>: HistologySlide.FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 */
	public static final String HISTOLOGY_SLIDE_FILE_PATH = "HistologySlide.FilePath";

	/**
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutAssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Suggested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_GENERATED_LAYOUT_ASSIGNED_STAIN = "HistologySlide.GeneratedLayoutAssignedStain";

	/**
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutSlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Generated Layout Slide Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_GENERATED_LAYOUT_SLIDE_ID = "HistologySlide.GeneratedLayoutSlideId";

	/**
	 * <b>Data Field Name</b>: HistologySlide.NumSections<br/>
	 * <br/>
	 * <b>Display Name</b>: # Sections<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_NUM_SECTIONS = "HistologySlide.NumSections";

	/**
	 * <b>Data Field Name</b>: HistologySlide.ProtocolName<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_PROTOCOL_NAME = "HistologySlide.ProtocolName";

	/**
	 * <b>Data Field Name</b>: HistologySlide.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_PROTOCOL_NUMBER = "HistologySlide.ProtocolNumber";

	/**
	 * <b>Data Field Name</b>: HistologySlide.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String HISTOLOGY_SLIDE_RECORD_ID = "HistologySlide.RecordId";

	/**
	 * <b>Data Field Name</b>: HistologySlide.SampleGroupByFieldIds<br/>
	 * <br/>
	 * <b>Display Name</b>: Investigator Ids<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_SAMPLE_GROUP_BY_FIELD_IDS = "HistologySlide.SampleGroupByFieldIds";

	/**
	 * <b>Data Field Name</b>: HistologySlide.SlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_SLIDE_ID = "HistologySlide.SlideId";

	/**
	 * <b>Data Field Name</b>: HistologySlide.SlideIdClonedFrom<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID Cloned From<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String HISTOLOGY_SLIDE_SLIDE_ID_CLONED_FROM = "HistologySlide.SlideIdClonedFrom";

	/**
	 * <b>Data Field Name</b>: HistologySlide.VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 */
	public static final String HISTOLOGY_SLIDE_VELOX_CHECK_OUT_USER = "HistologySlide.VeloxCheckOutUser";

	/**
	 * <b>Data Field Name</b>: HistologySlide.VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 */
	public static final String HISTOLOGY_SLIDE_VELOX_CURRENT_VERSION = "HistologySlide.VeloxCurrentVersion";

	/**
	 * <b>Data Field Name</b>: HistologySlide.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_BY = "HistologySlide.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: HistologySlide.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_DATE = "HistologySlide.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: IsControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Control?<br/>
	 * <br/>
	 * <b>Description</b>: Denotes if this sample represents a control sample or not.
	 */
	public static final String IS_CONTROL = "IsControl";

	/**
	 * <b>Data Field Name</b>: IsInvalid<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Invalid?<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the Specimen's validity for consideration for further testing
	 */
	public static final String IS_INVALID = "IsInvalid";

	/**
	 * <b>Data Field Name</b>: IsPooled<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Pooled?<br/>
	 * <br/>
	 * <b>Description</b>: This should be set to true when a sample represents a pool of multiple other samples.
	 */
	public static final String IS_POOLED = "IsPooled";

	/**
	 * <b>Data Field Name</b>: LastEditedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Edited By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LAST_EDITED_BY = "LastEditedBy";

	/**
	 * <b>Data Field Name</b>: NGSSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: NGS Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String NGSSINGLE_TEMPLATE_PROCESS = "NGSSingleTemplateProcess";

	/**
	 * <b>Data Field Name</b>: ObservedCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Observed Aspects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String OBSERVED_CONDITION = "ObservedCondition";

	/**
	 * <b>Data Field Name</b>: Organism<br/>
	 * <br/>
	 * <b>Display Name</b>: Organism<br/>
	 * <br/>
	 * <b>Description</b>: Describes the specimen this sample was extracted from.
	 */
	public static final String ORGANISM = "Organism";

	/**
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
	 */
	public static final String OTHER_SAMPLE_ID = "OtherSampleId";

	/**
	 * <b>Data Field Name</b>: PatientID<br/>
	 * <br/>
	 * <b>Display Name</b>: Patient ID<br/>
	 * <br/>
	 * <b>Description</b>: Patient ID
	 */
	public static final String PATIENT_ID = "PatientID";

	/**
	 * <b>Data Field Name</b>: PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PLATE_ID = "PlateId";

	/**
	 * <b>Data Field Name</b>: PreviousExemplarStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Previous Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Previous sample status before placed on-hold Agendia only.
	 */
	public static final String PREVIOUS_EXEMPLAR_STATUS = "PreviousExemplarStatus";

	/**
	 * <b>Data Field Name</b>: Protein.Barcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PROTEIN_BARCODE = "Protein.Barcode";

	/**
	 * <b>Data Field Name</b>: Protein.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this part.
	 */
	public static final String PROTEIN_CONSUMABLE_NAME = "Protein.ConsumableName";

	/**
	 * <b>Data Field Name</b>: Protein.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this part.
	 */
	public static final String PROTEIN_CONSUMABLE_TYPE = "Protein.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Protein.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String PROTEIN_CREATED_BY = "Protein.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Protein.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String PROTEIN_DATA_RECORD_NAME = "Protein.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Protein.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String PROTEIN_DATE_CREATED = "Protein.DateCreated";

	/**
	 * <b>Data Field Name</b>: Protein.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String PROTEIN_EXPIRATION_DATE = "Protein.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Protein.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 */
	public static final String PROTEIN_EXPIRED = "Protein.Expired";

	/**
	 * <b>Data Field Name</b>: Protein.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String PROTEIN_LOT_NUMBER = "Protein.LotNumber";

	/**
	 * <b>Data Field Name</b>: Protein.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is not used, but currently required to identify a data type as a consumable item.
	 */
	public static final String PROTEIN_PART_NUMBER = "Protein.PartNumber";

	/**
	 * <b>Data Field Name</b>: Protein.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String PROTEIN_RECORD_ID = "Protein.RecordId";

	/**
	 * <b>Data Field Name</b>: Protein.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PROTEIN_VALIDATED = "Protein.Validated";

	/**
	 * <b>Data Field Name</b>: Protein.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String PROTEIN_VELOX_LAST_MODIFIED_BY = "Protein.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Protein.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String PROTEIN_VELOX_LAST_MODIFIED_DATE = "Protein.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: RNA.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String RNACONSUMABLE_NAME = "RNA.ConsumableName";

	/**
	 * <b>Data Field Name</b>: RNA.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String RNACONSUMABLE_TYPE = "RNA.ConsumableType";

	/**
	 * <b>Data Field Name</b>: RNA.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String RNACREATED_BY = "RNA.CreatedBy";

	/**
	 * <b>Data Field Name</b>: RNA.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String RNADATA_RECORD_NAME = "RNA.DataRecordName";

	/**
	 * <b>Data Field Name</b>: RNA.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String RNADATE_CREATED = "RNA.DateCreated";

	/**
	 * <b>Data Field Name</b>: RNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String RNAEXPIRATION_DATE = "RNA.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: RNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RNAEXPIRED = "RNA.Expired";

	/**
	 * <b>Data Field Name</b>: RNA.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String RNALOT_NUMBER = "RNA.LotNumber";

	/**
	 * <b>Data Field Name</b>: RNA.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RNARECORD_ID = "RNA.RecordId";

	/**
	 * <b>Data Field Name</b>: RNA.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 */
	public static final String RNAREGISTRY_ID = "RNA.RegistryId";

	/**
	 * <b>Data Field Name</b>: RNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RNAVALIDATED = "RNA.Validated";

	/**
	 * <b>Data Field Name</b>: RNA.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String RNAVELOX_LAST_MODIFIED_BY = "RNA.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: RNA.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String RNAVELOX_LAST_MODIFIED_DATE = "RNA.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RelatedPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Plate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String RELATED_PLATE = "RelatedPlate";

	/**
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position in the Storage Unit where this sample resides.
	 */
	public static final String ROW_POSITION = "RowPosition";

	/**
	 * <b>Data Field Name</b>: SacrificedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sacrificed Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SACRIFICED_DATE = "SacrificedDate";

	/**
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: The primary identifier of the sample.
	 */
	public static final String SAMPLE_ID = "SampleId";

	/**
	 * <b>Data Field Name</b>: SampleRegistrationLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Registration Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SAMPLE_REGISTRATION_LINK = "SampleRegistrationLink";

	/**
	 * <b>Data Field Name</b>: SamplingSchedule<br/>
	 * <br/>
	 * <b>Display Name</b>: Sampling Schedule<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SAMPLING_SCHEDULE = "SamplingSchedule";

	/**
	 * <b>Data Field Name</b>: SapioSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: Sapio Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SAPIO_SINGLE_TEMPLATE_PROCESS = "SapioSingleTemplateProcess";

	/**
	 * <b>Data Field Name</b>: SourceSubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SOURCE_SUBJECT = "SourceSubject";

	/**
	 * <b>Data Field Name</b>: Stain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Id<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String STAIN_CONSUMABLE_NAME = "Stain.ConsumableName";

	/**
	 * <b>Data Field Name</b>: Stain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String STAIN_CONSUMABLE_TYPE = "Stain.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Stain.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String STAIN_CREATED_BY = "Stain.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Stain.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String STAIN_DATA_RECORD_NAME = "Stain.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Stain.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String STAIN_DATE_CREATED = "Stain.DateCreated";

	/**
	 * <b>Data Field Name</b>: Stain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String STAIN_EXPIRATION_DATE = "Stain.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Stain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STAIN_EXPIRED = "Stain.Expired";

	/**
	 * <b>Data Field Name</b>: Stain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String STAIN_LOT_NUMBER = "Stain.LotNumber";

	/**
	 * <b>Data Field Name</b>: Stain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 */
	public static final String STAIN_PART_NUMBER = "Stain.PartNumber";

	/**
	 * <b>Data Field Name</b>: Stain.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STAIN_PROTOCOL_NUMBER = "Stain.ProtocolNumber";

	/**
	 * <b>Data Field Name</b>: Stain.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String STAIN_RECORD_ID = "Stain.RecordId";

	/**
	 * <b>Data Field Name</b>: Stain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STAIN_VALIDATED = "Stain.Validated";

	/**
	 * <b>Data Field Name</b>: Stain.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String STAIN_VELOX_LAST_MODIFIED_BY = "Stain.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Stain.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String STAIN_VELOX_LAST_MODIFIED_DATE = "Stain.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this sample resides.
	 */
	public static final String STORAGE_LOCATION_BARCODE = "StorageLocationBarcode";

	/**
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
	 */
	public static final String STORAGE_UNIT_PATH = "StorageUnitPath";

	/**
	 * <b>Data Field Name</b>: Strain.Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_CI_95_BOUNDS = "Strain.Ci95Bounds";

	/**
	 * <b>Data Field Name</b>: Strain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 */
	public static final String STRAIN_CONSUMABLE_NAME = "Strain.ConsumableName";

	/**
	 * <b>Data Field Name</b>: Strain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 */
	public static final String STRAIN_CONSUMABLE_TYPE = "Strain.ConsumableType";

	/**
	 * <b>Data Field Name</b>: Strain.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String STRAIN_CREATED_BY = "Strain.CreatedBy";

	/**
	 * <b>Data Field Name</b>: Strain.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String STRAIN_DATA_RECORD_NAME = "Strain.DataRecordName";

	/**
	 * <b>Data Field Name</b>: Strain.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String STRAIN_DATE_CREATED = "Strain.DateCreated";

	/**
	 * <b>Data Field Name</b>: Strain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 */
	public static final String STRAIN_EXPIRATION_DATE = "Strain.ExpirationDate";

	/**
	 * <b>Data Field Name</b>: Strain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_EXPIRED = "Strain.Expired";

	/**
	 * <b>Data Field Name</b>: Strain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 */
	public static final String STRAIN_LOT_NUMBER = "Strain.LotNumber";

	/**
	 * <b>Data Field Name</b>: Strain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 */
	public static final String STRAIN_PART_NUMBER = "Strain.PartNumber";

	/**
	 * <b>Data Field Name</b>: Strain.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String STRAIN_RECORD_ID = "Strain.RecordId";

	/**
	 * <b>Data Field Name</b>: Strain.SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_SAMPLE_MEAN = "Strain.SampleMean";

	/**
	 * <b>Data Field Name</b>: Strain.SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_SAMPLE_NORMALIZED_MEAN = "Strain.SampleNormalizedMean";

	/**
	 * <b>Data Field Name</b>: Strain.SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_SAMPLE_STD = "Strain.SampleStd";

	/**
	 * <b>Data Field Name</b>: Strain.StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_STANDARD_ERROR = "Strain.StandardError";

	/**
	 * <b>Data Field Name</b>: Strain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_VALIDATED = "Strain.Validated";

	/**
	 * <b>Data Field Name</b>: Strain.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String STRAIN_VELOX_LAST_MODIFIED_BY = "Strain.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: Strain.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String STRAIN_VELOX_LAST_MODIFIED_DATE = "Strain.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: StrainDetails.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String STRAIN_DETAILS_CREATED_BY = "StrainDetails.CreatedBy";

	/**
	 * <b>Data Field Name</b>: StrainDetails.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String STRAIN_DETAILS_DATA_RECORD_NAME = "StrainDetails.DataRecordName";

	/**
	 * <b>Data Field Name</b>: StrainDetails.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String STRAIN_DETAILS_DATE_CREATED = "StrainDetails.DateCreated";

	/**
	 * <b>Data Field Name</b>: StrainDetails.PlasmidLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_PLASMID_LOT_NUMBER = "StrainDetails.PlasmidLotNumber";

	/**
	 * <b>Data Field Name</b>: StrainDetails.PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_PLASMID_NAME = "StrainDetails.PlasmidName";

	/**
	 * <b>Data Field Name</b>: StrainDetails.PlasmidSequence<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Sequence<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_PLASMID_SEQUENCE = "StrainDetails.PlasmidSequence";

	/**
	 * <b>Data Field Name</b>: StrainDetails.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String STRAIN_DETAILS_RECORD_ID = "StrainDetails.RecordId";

	/**
	 * <b>Data Field Name</b>: StrainDetails.StrainLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_STRAIN_LOT_NUMBER = "StrainDetails.StrainLotNumber";

	/**
	 * <b>Data Field Name</b>: StrainDetails.StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_STRAIN_NAME = "StrainDetails.StrainName";

	/**
	 * <b>Data Field Name</b>: StrainDetails.StrainPartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Part Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_DETAILS_STRAIN_PART_NUMBER = "StrainDetails.StrainPartNumber";

	/**
	 * <b>Data Field Name</b>: StrainDetails.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String STRAIN_DETAILS_VELOX_LAST_MODIFIED_BY = "StrainDetails.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: StrainDetails.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String STRAIN_DETAILS_VELOX_LAST_MODIFIED_DATE = "StrainDetails.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: StrainHit<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Hit?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STRAIN_HIT = "StrainHit";

	/**
	 * <b>Data Field Name</b>: StudySamplingId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Sampling ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SAMPLING_ID = "StudySamplingId";

	/**
	 * <b>Data Field Name</b>: StudySubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT = "StudySubject";

	/**
	 * <b>Data Field Name</b>: TatProgressStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT Progress Status<br/>
	 * <br/>
	 * <b>Description</b>: The progress of a sample in terms of Turn Around Time in assigned process
	 */
	public static final String TAT_PROGRESS_STATUS = "TatProgressStatus";

	/**
	 * <b>Data Field Name</b>: TimePoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Point (hr)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String TIME_POINT = "TimePoint";

	/**
	 * <b>Data Field Name</b>: TotalMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass is automatically computed by the system from the Concentration and Volume when both are specified. The units for the Concentration are derived from Concentration Units, while the units for Volume are assumed to be ul.
	 */
	public static final String TOTAL_MASS = "TotalMass";

	/**
	 * <b>Data Field Name</b>: TubeBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Tube Barcode<br/>
	 * <br/>
	 * <b>Description</b>: A field for holding a barcode value that can be used as an identifier to match on for scanning interfaces or other purposes by plugins.
	 */
	public static final String TUBE_BARCODE = "TubeBarcode";

	/**
	 * <b>Data Field Name</b>: UltimaPoolCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Ultima Pool Created?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String ULTIMA_POOL_CREATED = "UltimaPoolCreated";

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
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Volume can specified in whatever units is desirable. The default assumed by most built-in functionality is microliters once a Concentration value appears on the sample. Prior to that the volume could represent units of any quantity metric desired.
	 */
	public static final String VOLUME = "Volume";

	/**
	 * <b>Data Field Name</b>: VolumeUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Volume.
	 */
	public static final String VOLUME_UNITS = "VolumeUnits";

	protected SampleModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ACTIVE_WORKFLOW_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActiveWorkflowId<br/>
	 * <br/>
	 * <b>Display Name</b>: Active Workflow ID<br/>
	 * <br/>
	 * <b>Description</b>: Stores the last process workflow identifier.
	 * 
	 * @return the value stored on the "ActiveWorkflowId" field
	 */
	public Long getActiveWorkflowId() {
		return getField(ACTIVE_WORKFLOW_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #ACTIVE_WORKFLOW_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ActiveWorkflowId<br/>
	 * <br/>
	 * <b>Display Name</b>: Active Workflow ID<br/>
	 * <br/>
	 * <b>Description</b>: Stores the last process workflow identifier.
	 * 
	 * @param value The value to set on the "ActiveWorkflowId" field
	 */
	public void setActiveWorkflowId(Long value) {
		setField(ACTIVE_WORKFLOW_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "Antibody.ConsumableName" field
	 */
	public String getAntibodyConsumableName() {
		return getField(ANTIBODY_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "Antibody.ConsumableName" field
	 */
	public void setAntibodyConsumableName(String value) {
		setField(ANTIBODY_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "Antibody.ConsumableType" field
	 */
	public String getAntibodyConsumableType() {
		return getField(ANTIBODY_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Antibody Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "Antibody.ConsumableType" field
	 */
	public void setAntibodyConsumableType(String value) {
		setField(ANTIBODY_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Antibody.CreatedBy" field
	 */
	public String getAntibodyCreatedBy() {
		return getField(ANTIBODY_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Antibody.DataRecordName" field
	 */
	public String getAntibodyDataRecordName() {
		return getField(ANTIBODY_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Antibody.DateCreated" field
	 */
	public Long getAntibodyDateCreated() {
		return getField(ANTIBODY_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Antibody.ExpirationDate" field
	 */
	public Long getAntibodyExpirationDate() {
		return getField(ANTIBODY_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Antibody.ExpirationDate" field
	 */
	public void setAntibodyExpirationDate(Long value) {
		setField(ANTIBODY_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Antibody.Expired" field
	 */
	public Boolean getAntibodyExpired() {
		return getField(ANTIBODY_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Antibody.Expired" field
	 */
	public void setAntibodyExpired(Boolean value) {
		setField(ANTIBODY_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_HELM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.HELM<br/>
	 * <br/>
	 * <b>Display Name</b>: HELM<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Antibody.HELM" field
	 */
	public String getAntibodyHELM() {
		return getField(ANTIBODY_HELM);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_HELM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.HELM<br/>
	 * <br/>
	 * <b>Display Name</b>: HELM<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Antibody.HELM" field
	 */
	public void setAntibodyHELM(String value) {
		setField(ANTIBODY_HELM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Antibody.LotNumber" field
	 */
	public String getAntibodyLotNumber() {
		return getField(ANTIBODY_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Antibody.LotNumber" field
	 */
	public void setAntibodyLotNumber(String value) {
		setField(ANTIBODY_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Antibody.RecordId" field
	 */
	public Long getAntibodyRecordId() {
		return getField(ANTIBODY_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_REGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @return the value stored on the "Antibody.RegistryId" field
	 */
	public String getAntibodyRegistryId() {
		return getField(ANTIBODY_REGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_REGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @param value The value to set on the "Antibody.RegistryId" field
	 */
	public void setAntibodyRegistryId(String value) {
		setField(ANTIBODY_REGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Antibody.Validated" field
	 */
	public Boolean getAntibodyValidated() {
		return getField(ANTIBODY_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Antibody.Validated" field
	 */
	public void setAntibodyValidated(Boolean value) {
		setField(ANTIBODY_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Antibody.VeloxLastModifiedBy" field
	 */
	public String getAntibodyVeloxLastModifiedBy() {
		return getField(ANTIBODY_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Antibody.VeloxLastModifiedDate" field
	 */
	public Long getAntibodyVeloxLastModifiedDate() {
		return getField(ANTIBODY_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ANTIBODY_VENDOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @return the value stored on the "Antibody.Vendor" field
	 */
	public String getAntibodyVendor() {
		return getField(ANTIBODY_VENDOR);
	}
	
	/**
	 * Sets the value stored on the {@link #ANTIBODY_VENDOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Antibody.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @param value The value to set on the "Antibody.Vendor" field
	 */
	public void setAntibodyVendor(String value) {
		setField(ANTIBODY_VENDOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ASSAY_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: [System Field] Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: Invisible to user. System field used in Sample Receiving.
	 * 
	 * @return the value stored on the "AssayType" field
	 */
	public String getAssayType() {
		return getField(ASSAY_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #ASSAY_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AssayType<br/>
	 * <br/>
	 * <b>Display Name</b>: [System Field] Assay Type<br/>
	 * <br/>
	 * <b>Description</b>: Invisible to user. System field used in Sample Receiving.
	 * 
	 * @param value The value to set on the "AssayType" field
	 */
	public void setAssayType(String value) {
		setField(ASSAY_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "BioConjugate.ConsumableName" field
	 */
	public String getBioConjugateConsumableName() {
		return getField(BIO_CONJUGATE_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "BioConjugate.ConsumableName" field
	 */
	public void setBioConjugateConsumableName(String value) {
		setField(BIO_CONJUGATE_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "BioConjugate.ConsumableType" field
	 */
	public String getBioConjugateConsumableType() {
		return getField(BIO_CONJUGATE_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Conjugate Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "BioConjugate.ConsumableType" field
	 */
	public void setBioConjugateConsumableType(String value) {
		setField(BIO_CONJUGATE_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "BioConjugate.CreatedBy" field
	 */
	public String getBioConjugateCreatedBy() {
		return getField(BIO_CONJUGATE_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "BioConjugate.DataRecordName" field
	 */
	public String getBioConjugateDataRecordName() {
		return getField(BIO_CONJUGATE_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "BioConjugate.DateCreated" field
	 */
	public Long getBioConjugateDateCreated() {
		return getField(BIO_CONJUGATE_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "BioConjugate.ExpirationDate" field
	 */
	public Long getBioConjugateExpirationDate() {
		return getField(BIO_CONJUGATE_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "BioConjugate.ExpirationDate" field
	 */
	public void setBioConjugateExpirationDate(Long value) {
		setField(BIO_CONJUGATE_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "BioConjugate.Expired" field
	 */
	public Boolean getBioConjugateExpired() {
		return getField(BIO_CONJUGATE_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "BioConjugate.Expired" field
	 */
	public void setBioConjugateExpired(Boolean value) {
		setField(BIO_CONJUGATE_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "BioConjugate.LotNumber" field
	 */
	public String getBioConjugateLotNumber() {
		return getField(BIO_CONJUGATE_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "BioConjugate.LotNumber" field
	 */
	public void setBioConjugateLotNumber(String value) {
		setField(BIO_CONJUGATE_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "BioConjugate.RecordId" field
	 */
	public Long getBioConjugateRecordId() {
		return getField(BIO_CONJUGATE_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_REGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @return the value stored on the "BioConjugate.RegistryId" field
	 */
	public String getBioConjugateRegistryId() {
		return getField(BIO_CONJUGATE_REGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_REGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @param value The value to set on the "BioConjugate.RegistryId" field
	 */
	public void setBioConjugateRegistryId(String value) {
		setField(BIO_CONJUGATE_REGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "BioConjugate.Validated" field
	 */
	public Boolean getBioConjugateValidated() {
		return getField(BIO_CONJUGATE_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "BioConjugate.Validated" field
	 */
	public void setBioConjugateValidated(Boolean value) {
		setField(BIO_CONJUGATE_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "BioConjugate.VeloxLastModifiedBy" field
	 */
	public String getBioConjugateVeloxLastModifiedBy() {
		return getField(BIO_CONJUGATE_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "BioConjugate.VeloxLastModifiedDate" field
	 */
	public Long getBioConjugateVeloxLastModifiedDate() {
		return getField(BIO_CONJUGATE_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BIO_CONJUGATE_VENDOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @return the value stored on the "BioConjugate.Vendor" field
	 */
	public String getBioConjugateVendor() {
		return getField(BIO_CONJUGATE_VENDOR);
	}
	
	/**
	 * Sets the value stored on the {@link #BIO_CONJUGATE_VENDOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BioConjugate.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @param value The value to set on the "BioConjugate.Vendor" field
	 */
	public void setBioConjugateVendor(String value) {
		setField(BIO_CONJUGATE_VENDOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ANALYSIS_SAMPLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AnalysisSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Analysis Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_AnalysisSampleType" field
	 */
	public String getC_AnalysisSampleType() {
		return getField(C___ANALYSIS_SAMPLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ANALYSIS_SAMPLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_AnalysisSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Analysis Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_AnalysisSampleType" field
	 */
	public void setC_AnalysisSampleType(String value) {
		setField(C___ANALYSIS_SAMPLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___BIOANALYSIS_USE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BioanalysisUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Bioanalysis Use<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_BioanalysisUse" field
	 */
	public Boolean getC_BioanalysisUse() {
		return getField(C___BIOANALYSIS_USE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___BIOANALYSIS_USE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_BioanalysisUse<br/>
	 * <br/>
	 * <b>Display Name</b>: Bioanalysis Use<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_BioanalysisUse" field
	 */
	public void setC_BioanalysisUse(Boolean value) {
		setField(C___BIOANALYSIS_USE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CHARACTERIZATION_METHOD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CharacterizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Characterization Method<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_CharacterizationMethod" field
	 */
	public String getC_CharacterizationMethod() {
		return getField(C___CHARACTERIZATION_METHOD);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CHARACTERIZATION_METHOD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CharacterizationMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Characterization Method<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_CharacterizationMethod" field
	 */
	public void setC_CharacterizationMethod(String value) {
		setField(C___CHARACTERIZATION_METHOD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 * 
	 * @return the value stored on the "C_Column.C_ConsumableName" field
	 */
	public String getC_ColumnC_ConsumableName() {
		return getField(C___COLUMN_C___CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 * 
	 * @param value The value to set on the "C_Column.C_ConsumableName" field
	 */
	public void setC_ColumnC_ConsumableName(String value) {
		setField(C___COLUMN_C___CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 * 
	 * @return the value stored on the "C_Column.C_ConsumableType" field
	 */
	public String getC_ColumnC_ConsumableType() {
		return getField(C___COLUMN_C___CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 * 
	 * @param value The value to set on the "C_Column.C_ConsumableType" field
	 */
	public void setC_ColumnC_ConsumableType(String value) {
		setField(C___COLUMN_C___CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 * 
	 * @return the value stored on the "C_Column.C_ExpirationDate" field
	 */
	public Long getC_ColumnC_ExpirationDate() {
		return getField(C___COLUMN_C___EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 * 
	 * @param value The value to set on the "C_Column.C_ExpirationDate" field
	 */
	public void setC_ColumnC_ExpirationDate(Long value) {
		setField(C___COLUMN_C___EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 * 
	 * @return the value stored on the "C_Column.C_Expired" field
	 */
	public Boolean getC_ColumnC_Expired() {
		return getField(C___COLUMN_C___EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 * 
	 * @param value The value to set on the "C_Column.C_Expired" field
	 */
	public void setC_ColumnC_Expired(Boolean value) {
		setField(C___COLUMN_C___EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 * 
	 * @return the value stored on the "C_Column.C_LotNumber" field
	 */
	public String getC_ColumnC_LotNumber() {
		return getField(C___COLUMN_C___LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 * 
	 * @param value The value to set on the "C_Column.C_LotNumber" field
	 */
	public void setC_ColumnC_LotNumber(String value) {
		setField(C___COLUMN_C___LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 * 
	 * @return the value stored on the "C_Column.C_PartNumber" field
	 */
	public String getC_ColumnC_PartNumber() {
		return getField(C___COLUMN_C___PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 * 
	 * @param value The value to set on the "C_Column.C_PartNumber" field
	 */
	public void setC_ColumnC_PartNumber(String value) {
		setField(C___COLUMN_C___PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___PRESSURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Column.C_Pressure" field
	 */
	public Double getC_ColumnC_Pressure() {
		return getField(C___COLUMN_C___PRESSURE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___PRESSURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Column.C_Pressure" field
	 */
	public void setC_ColumnC_Pressure(Double value) {
		setField(C___COLUMN_C___PRESSURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_C___VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 * 
	 * @return the value stored on the "C_Column.C_Validated" field
	 */
	public Boolean getC_ColumnC_Validated() {
		return getField(C___COLUMN_C___VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COLUMN_C___VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 * 
	 * @param value The value to set on the "C_Column.C_Validated" field
	 */
	public void setC_ColumnC_Validated(Boolean value) {
		setField(C___COLUMN_C___VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "C_Column.CreatedBy" field
	 */
	public String getC_ColumnCreatedBy() {
		return getField(C___COLUMN_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "C_Column.DataRecordName" field
	 */
	public String getC_ColumnDataRecordName() {
		return getField(C___COLUMN_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "C_Column.DateCreated" field
	 */
	public Long getC_ColumnDateCreated() {
		return getField(C___COLUMN_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "C_Column.RecordId" field
	 */
	public Long getC_ColumnRecordId() {
		return getField(C___COLUMN_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "C_Column.VeloxLastModifiedBy" field
	 */
	public String getC_ColumnVeloxLastModifiedBy() {
		return getField(C___COLUMN_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COLUMN_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Column.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "C_Column.VeloxLastModifiedDate" field
	 */
	public Long getC_ColumnVeloxLastModifiedDate() {
		return getField(C___COLUMN_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COMPLETED_CHARACTERIZATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CompletedCharacterization<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Characterization<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_CompletedCharacterization" field
	 */
	public String getC_CompletedCharacterization() {
		return getField(C___COMPLETED_CHARACTERIZATION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COMPLETED_CHARACTERIZATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CompletedCharacterization<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Characterization<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_CompletedCharacterization" field
	 */
	public void setC_CompletedCharacterization(String value) {
		setField(C___COMPLETED_CHARACTERIZATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CRITICALITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Criticality<br/>
	 * <br/>
	 * <b>Display Name</b>: Criticality<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Criticality" field
	 */
	public String getC_Criticality() {
		return getField(C___CRITICALITY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CRITICALITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Criticality<br/>
	 * <br/>
	 * <b>Display Name</b>: Criticality<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Criticality" field
	 */
	public void setC_Criticality(String value) {
		setField(C___CRITICALITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_C___FINAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Fraction.C_FinalFractionmL" field
	 */
	public Double getC_FractionC_FinalFractionmL() {
		return getField(C___FRACTION_C___FINAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FRACTION_C___FINAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Fraction.C_FinalFractionmL" field
	 */
	public void setC_FractionC_FinalFractionmL(Double value) {
		setField(C___FRACTION_C___FINAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_C___INITIAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Fraction.C_InitialFractionmL" field
	 */
	public Double getC_FractionC_InitialFractionmL() {
		return getField(C___FRACTION_C___INITIAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FRACTION_C___INITIAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Fraction.C_InitialFractionmL" field
	 */
	public void setC_FractionC_InitialFractionmL(Double value) {
		setField(C___FRACTION_C___INITIAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_C___RUN_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Fraction.C_RunNumber" field
	 */
	public Double getC_FractionC_RunNumber() {
		return getField(C___FRACTION_C___RUN_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FRACTION_C___RUN_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Fraction.C_RunNumber" field
	 */
	public void setC_FractionC_RunNumber(Double value) {
		setField(C___FRACTION_C___RUN_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_C___SELECTED_FOR_INTERMEDI} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Fraction.C_SelectedForIntermedi" field
	 */
	public Boolean getC_FractionC_SelectedForIntermedi() {
		return getField(C___FRACTION_C___SELECTED_FOR_INTERMEDI);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FRACTION_C___SELECTED_FOR_INTERMEDI} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Fraction.C_SelectedForIntermedi" field
	 */
	public void setC_FractionC_SelectedForIntermedi(Boolean value) {
		setField(C___FRACTION_C___SELECTED_FOR_INTERMEDI, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_C___STEP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Fraction.C_Step" field
	 */
	public String getC_FractionC_Step() {
		return getField(C___FRACTION_C___STEP);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FRACTION_C___STEP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Fraction.C_Step" field
	 */
	public void setC_FractionC_Step(String value) {
		setField(C___FRACTION_C___STEP, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "C_Fraction.CreatedBy" field
	 */
	public String getC_FractionCreatedBy() {
		return getField(C___FRACTION_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "C_Fraction.DataRecordName" field
	 */
	public String getC_FractionDataRecordName() {
		return getField(C___FRACTION_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "C_Fraction.DateCreated" field
	 */
	public Long getC_FractionDateCreated() {
		return getField(C___FRACTION_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "C_Fraction.RecordId" field
	 */
	public Long getC_FractionRecordId() {
		return getField(C___FRACTION_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "C_Fraction.VeloxLastModifiedBy" field
	 */
	public String getC_FractionVeloxLastModifiedBy() {
		return getField(C___FRACTION_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FRACTION_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Fraction.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "C_Fraction.VeloxLastModifiedDate" field
	 */
	public Long getC_FractionVeloxLastModifiedDate() {
		return getField(C___FRACTION_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___HAZARD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Hazard<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Hazard" field
	 */
	public String getC_Hazard() {
		return getField(C___HAZARD);
	}
	
	/**
	 * Sets the value stored on the {@link #C___HAZARD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Hazard<br/>
	 * <br/>
	 * <b>Display Name</b>: Hazard<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Hazard" field
	 */
	public void setC_Hazard(String value) {
		setField(C___HAZARD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 * 
	 * @return the value stored on the "C_Labware.C_ConsumableName" field
	 */
	public String getC_LabwareC_ConsumableName() {
		return getField(C___LABWARE_C___CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this item.
	 * 
	 * @param value The value to set on the "C_Labware.C_ConsumableName" field
	 */
	public void setC_LabwareC_ConsumableName(String value) {
		setField(C___LABWARE_C___CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 * 
	 * @return the value stored on the "C_Labware.C_ConsumableType" field
	 */
	public String getC_LabwareC_ConsumableType() {
		return getField(C___LABWARE_C___CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Labware Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of item.
	 * 
	 * @param value The value to set on the "C_Labware.C_ConsumableType" field
	 */
	public void setC_LabwareC_ConsumableType(String value) {
		setField(C___LABWARE_C___CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 * 
	 * @return the value stored on the "C_Labware.C_ExpirationDate" field
	 */
	public Long getC_LabwareC_ExpirationDate() {
		return getField(C___LABWARE_C___EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this item will expire.
	 * 
	 * @param value The value to set on the "C_Labware.C_ExpirationDate" field
	 */
	public void setC_LabwareC_ExpirationDate(Long value) {
		setField(C___LABWARE_C___EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 * 
	 * @return the value stored on the "C_Labware.C_Expired" field
	 */
	public Boolean getC_LabwareC_Expired() {
		return getField(C___LABWARE_C___EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: If this item is expired.
	 * 
	 * @param value The value to set on the "C_Labware.C_Expired" field
	 */
	public void setC_LabwareC_Expired(Boolean value) {
		setField(C___LABWARE_C___EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 * 
	 * @return the value stored on the "C_Labware.C_LotNumber" field
	 */
	public String getC_LabwareC_LotNumber() {
		return getField(C___LABWARE_C___LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this item.
	 * 
	 * @param value The value to set on the "C_Labware.C_LotNumber" field
	 */
	public void setC_LabwareC_LotNumber(String value) {
		setField(C___LABWARE_C___LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 * 
	 * @return the value stored on the "C_Labware.C_PartNumber" field
	 */
	public String getC_LabwareC_PartNumber() {
		return getField(C___LABWARE_C___PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this item.
	 * 
	 * @param value The value to set on the "C_Labware.C_PartNumber" field
	 */
	public void setC_LabwareC_PartNumber(String value) {
		setField(C___LABWARE_C___PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_C___VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 * 
	 * @return the value stored on the "C_Labware.C_Validated" field
	 */
	public Boolean getC_LabwareC_Validated() {
		return getField(C___LABWARE_C___VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #C___LABWARE_C___VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.C_Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: If this item is validated and can be used in tracking.
	 * 
	 * @param value The value to set on the "C_Labware.C_Validated" field
	 */
	public void setC_LabwareC_Validated(Boolean value) {
		setField(C___LABWARE_C___VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "C_Labware.CreatedBy" field
	 */
	public String getC_LabwareCreatedBy() {
		return getField(C___LABWARE_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "C_Labware.DataRecordName" field
	 */
	public String getC_LabwareDataRecordName() {
		return getField(C___LABWARE_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "C_Labware.DateCreated" field
	 */
	public Long getC_LabwareDateCreated() {
		return getField(C___LABWARE_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "C_Labware.RecordId" field
	 */
	public Long getC_LabwareRecordId() {
		return getField(C___LABWARE_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "C_Labware.VeloxLastModifiedBy" field
	 */
	public String getC_LabwareVeloxLastModifiedBy() {
		return getField(C___LABWARE_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___LABWARE_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Labware.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "C_Labware.VeloxLastModifiedDate" field
	 */
	public Long getC_LabwareVeloxLastModifiedDate() {
		return getField(C___LABWARE_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___OPENED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_OpenedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Opened Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_OpenedDate" field
	 */
	public Long getC_OpenedDate() {
		return getField(C___OPENED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___OPENED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_OpenedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Opened Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_OpenedDate" field
	 */
	public void setC_OpenedDate(Long value) {
		setField(C___OPENED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___PREPARATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PreparationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparation Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_PreparationDate" field
	 */
	public Long getC_PreparationDate() {
		return getField(C___PREPARATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___PREPARATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PreparationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparation Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_PreparationDate" field
	 */
	public void setC_PreparationDate(Long value) {
		setField(C___PREPARATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___PREPARER_INITIALS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PreparerInitials<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparer Initials<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_PreparerInitials" field
	 */
	public String getC_PreparerInitials() {
		return getField(C___PREPARER_INITIALS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___PREPARER_INITIALS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_PreparerInitials<br/>
	 * <br/>
	 * <b>Display Name</b>: Preparer Initials<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_PreparerInitials" field
	 */
	public void setC_PreparerInitials(String value) {
		setField(C___PREPARER_INITIALS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___RECOMMENDED_STORAGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RecommendedStorage<br/>
	 * <br/>
	 * <b>Display Name</b>: Recommended Storage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_RecommendedStorage" field
	 */
	public String getC_RecommendedStorage() {
		return getField(C___RECOMMENDED_STORAGE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___RECOMMENDED_STORAGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RecommendedStorage<br/>
	 * <br/>
	 * <b>Display Name</b>: Recommended Storage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_RecommendedStorage" field
	 */
	public void setC_RecommendedStorage(String value) {
		setField(C___RECOMMENDED_STORAGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___RETEST_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_RetestDate" field
	 */
	public Long getC_RetestDate() {
		return getField(C___RETEST_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___RETEST_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RetestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Retest Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_RetestDate" field
	 */
	public void setC_RetestDate(Long value) {
		setField(C___RETEST_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SAMPLE_MATRIX} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SampleMatrix" field
	 */
	public String getC_SampleMatrix() {
		return getField(C___SAMPLE_MATRIX);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SAMPLE_MATRIX} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleMatrix<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Matrix<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SampleMatrix" field
	 */
	public void setC_SampleMatrix(String value) {
		setField(C___SAMPLE_MATRIX, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SPONSOR_BATCH_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorBatchId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Batch Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SponsorBatchId" field
	 */
	public String getC_SponsorBatchId() {
		return getField(C___SPONSOR_BATCH_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SPONSOR_BATCH_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorBatchId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Batch Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SponsorBatchId" field
	 */
	public void setC_SponsorBatchId(String value) {
		setField(C___SPONSOR_BATCH_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SPONSOR_STUDY_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorStudyNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Study Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SponsorStudyNumber" field
	 */
	public String getC_SponsorStudyNumber() {
		return getField(C___SPONSOR_STUDY_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SPONSOR_STUDY_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorStudyNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Study Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SponsorStudyNumber" field
	 */
	public void setC_SponsorStudyNumber(String value) {
		setField(C___SPONSOR_STUDY_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STABILITY_RETEST_INTERVAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StabilityRetestInterval<br/>
	 * <br/>
	 * <b>Display Name</b>: Stability Retest Interval<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_StabilityRetestInterval" field
	 */
	public String getC_StabilityRetestInterval() {
		return getField(C___STABILITY_RETEST_INTERVAL);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STABILITY_RETEST_INTERVAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StabilityRetestInterval<br/>
	 * <br/>
	 * <b>Display Name</b>: Stability Retest Interval<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_StabilityRetestInterval" field
	 */
	public void setC_StabilityRetestInterval(String value) {
		setField(C___STABILITY_RETEST_INTERVAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C__P_H} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_pH<br/>
	 * <br/>
	 * <b>Display Name</b>: pH<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_pH" field
	 */
	public Double getC_pH() {
		return getField(C__P_H);
	}
	
	/**
	 * Sets the value stored on the {@link #C__P_H} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_pH<br/>
	 * <br/>
	 * <b>Display Name</b>: pH<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_pH" field
	 */
	public void setC_pH(Double value) {
		setField(C__P_H, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_CAS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: The CAS number if known.
	 * 
	 * @return the value stored on the "ChemicalReagent.CAS" field
	 */
	public String getChemicalReagentCAS() {
		return getField(CHEMICAL_REAGENT_CAS);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_CAS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: The CAS number if known.
	 * 
	 * @param value The value to set on the "ChemicalReagent.CAS" field
	 */
	public void setChemicalReagentCAS(String value) {
		setField(CHEMICAL_REAGENT_CAS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_CXSMILESHASH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.CXSMILESHash" field
	 */
	public String getChemicalReagentCXSMILESHash() {
		return getField(CHEMICAL_REAGENT_CXSMILESHASH);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_CXSMILESHASH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.CXSMILESHash" field
	 */
	public void setChemicalReagentCXSMILESHash(String value) {
		setField(CHEMICAL_REAGENT_CXSMILESHASH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_CHARGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.Charge" field
	 */
	public Integer getChemicalReagentCharge() {
		return getField(CHEMICAL_REAGENT_CHARGE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_CHARGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.Charge" field
	 */
	public void setChemicalReagentCharge(Integer value) {
		setField(CHEMICAL_REAGENT_CHARGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable part.
	 * 
	 * @return the value stored on the "ChemicalReagent.ConsumableType" field
	 */
	public String getChemicalReagentConsumableType() {
		return getField(CHEMICAL_REAGENT_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable part.
	 * 
	 * @param value The value to set on the "ChemicalReagent.ConsumableType" field
	 */
	public void setChemicalReagentConsumableType(String value) {
		setField(CHEMICAL_REAGENT_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "ChemicalReagent.CreatedBy" field
	 */
	public String getChemicalReagentCreatedBy() {
		return getField(CHEMICAL_REAGENT_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "ChemicalReagent.DataRecordName" field
	 */
	public String getChemicalReagentDataRecordName() {
		return getField(CHEMICAL_REAGENT_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "ChemicalReagent.DateCreated" field
	 */
	public Long getChemicalReagentDateCreated() {
		return getField(CHEMICAL_REAGENT_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_EXACT_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.ExactMass" field
	 */
	public Double getChemicalReagentExactMass() {
		return getField(CHEMICAL_REAGENT_EXACT_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_EXACT_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.ExactMass" field
	 */
	public void setChemicalReagentExactMass(Double value) {
		setField(CHEMICAL_REAGENT_EXACT_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "ChemicalReagent.ExpirationDate" field
	 */
	public Long getChemicalReagentExpirationDate() {
		return getField(CHEMICAL_REAGENT_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "ChemicalReagent.ExpirationDate" field
	 */
	public void setChemicalReagentExpirationDate(Long value) {
		setField(CHEMICAL_REAGENT_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.Expired" field
	 */
	public Boolean getChemicalReagentExpired() {
		return getField(CHEMICAL_REAGENT_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.Expired" field
	 */
	public void setChemicalReagentExpired(Boolean value) {
		setField(CHEMICAL_REAGENT_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_FORMULA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: The chemical formula of this molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.Formula" field
	 */
	public String getChemicalReagentFormula() {
		return getField(CHEMICAL_REAGENT_FORMULA);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_FORMULA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: The chemical formula of this molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.Formula" field
	 */
	public void setChemicalReagentFormula(String value) {
		setField(CHEMICAL_REAGENT_FORMULA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_GHSCAUTION_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.GHSCautionCode" field
	 */
	public String getChemicalReagentGHSCautionCode() {
		return getField(CHEMICAL_REAGENT_GHSCAUTION_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_GHSCAUTION_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.GHSCautionCode" field
	 */
	public void setChemicalReagentGHSCautionCode(String value) {
		setField(CHEMICAL_REAGENT_GHSCAUTION_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_GHSHAZARD_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @return the value stored on the "ChemicalReagent.GHSHazardCode" field
	 */
	public String getChemicalReagentGHSHazardCode() {
		return getField(CHEMICAL_REAGENT_GHSHAZARD_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_GHSHAZARD_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @param value The value to set on the "ChemicalReagent.GHSHazardCode" field
	 */
	public void setChemicalReagentGHSHazardCode(String value) {
		setField(CHEMICAL_REAGENT_GHSHAZARD_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_GHSPICTO_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 * 
	 * @return the value stored on the "ChemicalReagent.GHSPictoCode" field
	 */
	public String getChemicalReagentGHSPictoCode() {
		return getField(CHEMICAL_REAGENT_GHSPICTO_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_GHSPICTO_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 * 
	 * @param value The value to set on the "ChemicalReagent.GHSPictoCode" field
	 */
	public void setChemicalReagentGHSPictoCode(String value) {
		setField(CHEMICAL_REAGENT_GHSPICTO_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_GHSSIGNAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @return the value stored on the "ChemicalReagent.GHSSignal" field
	 */
	public String getChemicalReagentGHSSignal() {
		return getField(CHEMICAL_REAGENT_GHSSIGNAL);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_GHSSIGNAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @param value The value to set on the "ChemicalReagent.GHSSignal" field
	 */
	public void setChemicalReagentGHSSignal(String value) {
		setField(CHEMICAL_REAGENT_GHSSIGNAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_HAS_OR_STEREO_GROUP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.HasOrStereoGroup" field
	 */
	public Boolean getChemicalReagentHasOrStereoGroup() {
		return getField(CHEMICAL_REAGENT_HAS_OR_STEREO_GROUP);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_HAS_OR_STEREO_GROUP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.HasOrStereoGroup" field
	 */
	public void setChemicalReagentHasOrStereoGroup(Boolean value) {
		setField(CHEMICAL_REAGENT_HAS_OR_STEREO_GROUP, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_IUPAC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @return the value stored on the "ChemicalReagent.IUPAC" field
	 */
	public String getChemicalReagentIUPAC() {
		return getField(CHEMICAL_REAGENT_IUPAC);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_IUPAC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @param value The value to set on the "ChemicalReagent.IUPAC" field
	 */
	public void setChemicalReagentIUPAC(String value) {
		setField(CHEMICAL_REAGENT_IUPAC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_INCHI_KEY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.InchiKey" field
	 */
	public String getChemicalReagentInchiKey() {
		return getField(CHEMICAL_REAGENT_INCHI_KEY);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_INCHI_KEY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.InchiKey" field
	 */
	public void setChemicalReagentInchiKey(String value) {
		setField(CHEMICAL_REAGENT_INCHI_KEY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_IS_GHSCLASSIFIED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 * 
	 * @return the value stored on the "ChemicalReagent.IsGHSClassified" field
	 */
	public Boolean getChemicalReagentIsGHSClassified() {
		return getField(CHEMICAL_REAGENT_IS_GHSCLASSIFIED);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_IS_GHSCLASSIFIED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 * 
	 * @param value The value to set on the "ChemicalReagent.IsGHSClassified" field
	 */
	public void setChemicalReagentIsGHSClassified(Boolean value) {
		setField(CHEMICAL_REAGENT_IS_GHSCLASSIFIED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "ChemicalReagent.LotNumber" field
	 */
	public String getChemicalReagentLotNumber() {
		return getField(CHEMICAL_REAGENT_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "ChemicalReagent.LotNumber" field
	 */
	public void setChemicalReagentLotNumber(String value) {
		setField(CHEMICAL_REAGENT_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_MOLECULAR_WEIGHT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.MolecularWeight" field
	 */
	public Double getChemicalReagentMolecularWeight() {
		return getField(CHEMICAL_REAGENT_MOLECULAR_WEIGHT);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_MOLECULAR_WEIGHT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.MolecularWeight" field
	 */
	public void setChemicalReagentMolecularWeight(Double value) {
		setField(CHEMICAL_REAGENT_MOLECULAR_WEIGHT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_POLAR_SURFACE_AREA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.PolarSurfaceArea" field
	 */
	public Double getChemicalReagentPolarSurfaceArea() {
		return getField(CHEMICAL_REAGENT_POLAR_SURFACE_AREA);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_POLAR_SURFACE_AREA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.PolarSurfaceArea" field
	 */
	public void setChemicalReagentPolarSurfaceArea(Double value) {
		setField(CHEMICAL_REAGENT_POLAR_SURFACE_AREA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_PUBCHEM_CID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 * 
	 * @return the value stored on the "ChemicalReagent.PubchemCid" field
	 */
	public Integer getChemicalReagentPubchemCid() {
		return getField(CHEMICAL_REAGENT_PUBCHEM_CID);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_PUBCHEM_CID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 * 
	 * @param value The value to set on the "ChemicalReagent.PubchemCid" field
	 */
	public void setChemicalReagentPubchemCid(Integer value) {
		setField(CHEMICAL_REAGENT_PUBCHEM_CID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_PURITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.Purity" field
	 */
	public Double getChemicalReagentPurity() {
		return getField(CHEMICAL_REAGENT_PURITY);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_PURITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.Purity" field
	 */
	public void setChemicalReagentPurity(Double value) {
		setField(CHEMICAL_REAGENT_PURITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "ChemicalReagent.RecordId" field
	 */
	public Long getChemicalReagentRecordId() {
		return getField(CHEMICAL_REAGENT_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_REGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 * 
	 * @return the value stored on the "ChemicalReagent.RegistryId" field
	 */
	public String getChemicalReagentRegistryId() {
		return getField(CHEMICAL_REAGENT_REGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_REGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 * 
	 * @param value The value to set on the "ChemicalReagent.RegistryId" field
	 */
	public void setChemicalReagentRegistryId(String value) {
		setField(CHEMICAL_REAGENT_REGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_SMILES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: Canonical SMILES<br/>
	 * <br/>
	 * <b>Description</b>: Canonical SMILES of RDKIt algorithm.
	 * 
	 * @return the value stored on the "ChemicalReagent.SMILES" field
	 */
	public String getChemicalReagentSMILES() {
		return getField(CHEMICAL_REAGENT_SMILES);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_SMILES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: Canonical SMILES<br/>
	 * <br/>
	 * <b>Description</b>: Canonical SMILES of RDKIt algorithm.
	 * 
	 * @param value The value to set on the "ChemicalReagent.SMILES" field
	 */
	public void setChemicalReagentSMILES(String value) {
		setField(CHEMICAL_REAGENT_SMILES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_STEREO_REG_HASH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.StereoRegHash" field
	 */
	public String getChemicalReagentStereoRegHash() {
		return getField(CHEMICAL_REAGENT_STEREO_REG_HASH);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_STEREO_REG_HASH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.StereoRegHash" field
	 */
	public void setChemicalReagentStereoRegHash(String value) {
		setField(CHEMICAL_REAGENT_STEREO_REG_HASH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_SUPPLIER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Supplier<br/>
	 * <br/>
	 * <b>Display Name</b>: Supplier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.Supplier" field
	 */
	public String getChemicalReagentSupplier() {
		return getField(CHEMICAL_REAGENT_SUPPLIER);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_SUPPLIER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Supplier<br/>
	 * <br/>
	 * <b>Display Name</b>: Supplier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.Supplier" field
	 */
	public void setChemicalReagentSupplier(String value) {
		setField(CHEMICAL_REAGENT_SUPPLIER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_TOTAL_HBOND_ACCEPTORS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.TotalHBondAcceptors" field
	 */
	public Integer getChemicalReagentTotalHBondAcceptors() {
		return getField(CHEMICAL_REAGENT_TOTAL_HBOND_ACCEPTORS);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_TOTAL_HBOND_ACCEPTORS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.TotalHBondAcceptors" field
	 */
	public void setChemicalReagentTotalHBondAcceptors(Integer value) {
		setField(CHEMICAL_REAGENT_TOTAL_HBOND_ACCEPTORS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_TOTAL_HBOND_COUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.TotalHBondCount" field
	 */
	public Integer getChemicalReagentTotalHBondCount() {
		return getField(CHEMICAL_REAGENT_TOTAL_HBOND_COUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_TOTAL_HBOND_COUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.TotalHBondCount" field
	 */
	public void setChemicalReagentTotalHBondCount(Integer value) {
		setField(CHEMICAL_REAGENT_TOTAL_HBOND_COUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.Validated" field
	 */
	public Boolean getChemicalReagentValidated() {
		return getField(CHEMICAL_REAGENT_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.Validated" field
	 */
	public void setChemicalReagentValidated(Boolean value) {
		setField(CHEMICAL_REAGENT_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "ChemicalReagent.VeloxLastModifiedBy" field
	 */
	public String getChemicalReagentVeloxLastModifiedBy() {
		return getField(CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "ChemicalReagent.VeloxLastModifiedDate" field
	 */
	public Long getChemicalReagentVeloxLastModifiedDate() {
		return getField(CHEMICAL_REAGENT_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENT_YIELD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.Yield" field
	 */
	public Double getChemicalReagentYield() {
		return getField(CHEMICAL_REAGENT_YIELD);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENT_YIELD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.Yield" field
	 */
	public void setChemicalReagentYield(Double value) {
		setField(CHEMICAL_REAGENT_YIELD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENTC_LOG_P} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 * 
	 * @return the value stored on the "ChemicalReagent.cLogP" field
	 */
	public Double getChemicalReagentcLogP() {
		return getField(CHEMICAL_REAGENTC_LOG_P);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENTC_LOG_P} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 * 
	 * @param value The value to set on the "ChemicalReagent.cLogP" field
	 */
	public void setChemicalReagentcLogP(Double value) {
		setField(CHEMICAL_REAGENTC_LOG_P, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CHEMICAL_REAGENTINCHI} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ChemicalReagent.inchi" field
	 */
	public String getChemicalReagentinchi() {
		return getField(CHEMICAL_REAGENTINCHI);
	}
	
	/**
	 * Sets the value stored on the {@link #CHEMICAL_REAGENTINCHI} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ChemicalReagent.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ChemicalReagent.inchi" field
	 */
	public void setChemicalReagentinchi(String value) {
		setField(CHEMICAL_REAGENTINCHI, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COL_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position in the Storage Unit where this sample resides.
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
	 * <b>Description</b>: The column position in the Storage Unit where this sample resides.
	 * 
	 * @param value The value to set on the "ColPosition" field
	 */
	public void setColPosition(String value) {
		setField(COL_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COLLECTION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CollectionDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "CollectionDate" field
	 */
	public Long getCollectionDate() {
		return getField(COLLECTION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #COLLECTION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CollectionDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "CollectionDate" field
	 */
	public void setCollectionDate(Long value) {
		setField(COLLECTION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COLLECTION_DATE_TIME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CollectionDateTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date/Time<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "CollectionDateTime" field
	 */
	public Long getCollectionDateTime() {
		return getField(COLLECTION_DATE_TIME);
	}
	
	/**
	 * Sets the value stored on the {@link #COLLECTION_DATE_TIME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CollectionDateTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Collection Date/Time<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "CollectionDateTime" field
	 */
	public void setCollectionDateTime(Long value) {
		setField(COLLECTION_DATE_TIME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMMENTS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Comments" field
	 */
	public String getComments() {
		return getField(COMMENTS);
	}
	
	/**
	 * Sets the value stored on the {@link #COMMENTS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Comments" field
	 */
	public void setComments(String value) {
		setField(COMMENTS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_CAS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: CAS Registration Number. This may be blank for unregistered compounds.
	 * 
	 * @return the value stored on the "Compound.CAS" field
	 */
	public String getCompoundCAS() {
		return getField(COMPOUND_CAS);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_CAS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.CAS<br/>
	 * <br/>
	 * <b>Display Name</b>: CAS<br/>
	 * <br/>
	 * <b>Description</b>: CAS Registration Number. This may be blank for unregistered compounds.
	 * 
	 * @param value The value to set on the "Compound.CAS" field
	 */
	public void setCompoundCAS(String value) {
		setField(COMPOUND_CAS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_CXSMILESHASH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.CXSMILESHash" field
	 */
	public String getCompoundCXSMILESHash() {
		return getField(COMPOUND_CXSMILESHASH);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_CXSMILESHASH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.CXSMILESHash<br/>
	 * <br/>
	 * <b>Display Name</b>: CXSMILES Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.CXSMILESHash" field
	 */
	public void setCompoundCXSMILESHash(String value) {
		setField(COMPOUND_CXSMILESHASH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_CHARGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 * 
	 * @return the value stored on the "Compound.Charge" field
	 */
	public Integer getCompoundCharge() {
		return getField(COMPOUND_CHARGE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_CHARGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Charge<br/>
	 * <br/>
	 * <b>Display Name</b>: Charge<br/>
	 * <br/>
	 * <b>Description</b>: The calculated charge of a molecule.
	 * 
	 * @param value The value to set on the "Compound.Charge" field
	 */
	public void setCompoundCharge(Integer value) {
		setField(COMPOUND_CHARGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "Compound.ConsumableType" field
	 */
	public String getCompoundConsumableType() {
		return getField(COMPOUND_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "Compound.ConsumableType" field
	 */
	public void setCompoundConsumableType(String value) {
		setField(COMPOUND_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Compound.CreatedBy" field
	 */
	public String getCompoundCreatedBy() {
		return getField(COMPOUND_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Compound.DataRecordName" field
	 */
	public String getCompoundDataRecordName() {
		return getField(COMPOUND_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Compound.DateCreated" field
	 */
	public Long getCompoundDateCreated() {
		return getField(COMPOUND_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_EXACT_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 * 
	 * @return the value stored on the "Compound.ExactMass" field
	 */
	public Double getCompoundExactMass() {
		return getField(COMPOUND_EXACT_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_EXACT_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ExactMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Exact Mass<br/>
	 * <br/>
	 * <b>Description</b>: The calculated exact mass of a molecule.
	 * 
	 * @param value The value to set on the "Compound.ExactMass" field
	 */
	public void setCompoundExactMass(Double value) {
		setField(COMPOUND_EXACT_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Compound.ExpirationDate" field
	 */
	public Long getCompoundExpirationDate() {
		return getField(COMPOUND_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Compound.ExpirationDate" field
	 */
	public void setCompoundExpirationDate(Long value) {
		setField(COMPOUND_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Expired" field
	 */
	public Boolean getCompoundExpired() {
		return getField(COMPOUND_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Expired" field
	 */
	public void setCompoundExpired(Boolean value) {
		setField(COMPOUND_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_FORMULA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Formula" field
	 */
	public String getCompoundFormula() {
		return getField(COMPOUND_FORMULA);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_FORMULA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Formula<br/>
	 * <br/>
	 * <b>Display Name</b>: Formula<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Formula" field
	 */
	public void setCompoundFormula(String value) {
		setField(COMPOUND_FORMULA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_GHSCAUTION_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.GHSCautionCode" field
	 */
	public String getCompoundGHSCautionCode() {
		return getField(COMPOUND_GHSCAUTION_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_GHSCAUTION_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSCautionCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Caution Code<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.GHSCautionCode" field
	 */
	public void setCompoundGHSCautionCode(String value) {
		setField(COMPOUND_GHSCAUTION_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_GHSHAZARD_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @return the value stored on the "Compound.GHSHazardCode" field
	 */
	public String getCompoundGHSHazardCode() {
		return getField(COMPOUND_GHSHAZARD_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_GHSHAZARD_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSHazardCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Hazard Code<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @param value The value to set on the "Compound.GHSHazardCode" field
	 */
	public void setCompoundGHSHazardCode(String value) {
		setField(COMPOUND_GHSHAZARD_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_GHSPICTO_CODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 * 
	 * @return the value stored on the "Compound.GHSPictoCode" field
	 */
	public String getCompoundGHSPictoCode() {
		return getField(COMPOUND_GHSPICTO_CODE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_GHSPICTO_CODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSPictoCode<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Pictogram Codes<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
These are comma-delimited values.
	 * 
	 * @param value The value to set on the "Compound.GHSPictoCode" field
	 */
	public void setCompoundGHSPictoCode(String value) {
		setField(COMPOUND_GHSPICTO_CODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_GHSSIGNAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @return the value stored on the "Compound.GHSSignal" field
	 */
	public String getCompoundGHSSignal() {
		return getField(COMPOUND_GHSSIGNAL);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_GHSSIGNAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.GHSSignal<br/>
	 * <br/>
	 * <b>Display Name</b>: GHS Signal<br/>
	 * <br/>
	 * <b>Description</b>: See https://pubchem.ncbi.nlm.nih.gov/ghs/
	 * 
	 * @param value The value to set on the "Compound.GHSSignal" field
	 */
	public void setCompoundGHSSignal(String value) {
		setField(COMPOUND_GHSSIGNAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_HAS_OR_STEREO_GROUP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.HasOrStereoGroup" field
	 */
	public Boolean getCompoundHasOrStereoGroup() {
		return getField(COMPOUND_HAS_OR_STEREO_GROUP);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_HAS_OR_STEREO_GROUP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.HasOrStereoGroup<br/>
	 * <br/>
	 * <b>Display Name</b>: Contains OR Stereo<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.HasOrStereoGroup" field
	 */
	public void setCompoundHasOrStereoGroup(Boolean value) {
		setField(COMPOUND_HAS_OR_STEREO_GROUP, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_IUPAC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @return the value stored on the "Compound.IUPAC" field
	 */
	public String getCompoundIUPAC() {
		return getField(COMPOUND_IUPAC);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_IUPAC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.IUPAC<br/>
	 * <br/>
	 * <b>Display Name</b>: IUPAC<br/>
	 * <br/>
	 * <b>Description</b>: The resolved IUPAC name of the compound part.
	 * 
	 * @param value The value to set on the "Compound.IUPAC" field
	 */
	public void setCompoundIUPAC(String value) {
		setField(COMPOUND_IUPAC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_INCHI_KEY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.InchiKey" field
	 */
	public String getCompoundInchiKey() {
		return getField(COMPOUND_INCHI_KEY);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_INCHI_KEY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.InchiKey<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI Key<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.InchiKey" field
	 */
	public void setCompoundInchiKey(String value) {
		setField(COMPOUND_INCHI_KEY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_IS_GHSCLASSIFIED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 * 
	 * @return the value stored on the "Compound.IsGHSClassified" field
	 */
	public Boolean getCompoundIsGHSClassified() {
		return getField(COMPOUND_IS_GHSCLASSIFIED);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_IS_GHSCLASSIFIED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.IsGHSClassified<br/>
	 * <br/>
	 * <b>Display Name</b>: Is GHS Classified<br/>
	 * <br/>
	 * <b>Description</b>: If set to true, GHS classification has been requested.
It is possible that GHS classification has been requested, but is still "not classified". 
It could be pending classification, or it can be rejected a classification. 
A compound that has been rejected classification does not necessarily mean it is not hazardous.
	 * 
	 * @param value The value to set on the "Compound.IsGHSClassified" field
	 */
	public void setCompoundIsGHSClassified(Boolean value) {
		setField(COMPOUND_IS_GHSCLASSIFIED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Compound.LotNumber" field
	 */
	public String getCompoundLotNumber() {
		return getField(COMPOUND_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Compound.LotNumber" field
	 */
	public void setCompoundLotNumber(String value) {
		setField(COMPOUND_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_MOLECULAR_WEIGHT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 * 
	 * @return the value stored on the "Compound.MolecularWeight" field
	 */
	public Double getCompoundMolecularWeight() {
		return getField(COMPOUND_MOLECULAR_WEIGHT);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_MOLECULAR_WEIGHT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.MolecularWeight<br/>
	 * <br/>
	 * <b>Display Name</b>: Molecular Weight<br/>
	 * <br/>
	 * <b>Description</b>: Calculated molecular weight of a molecule.
	 * 
	 * @param value The value to set on the "Compound.MolecularWeight" field
	 */
	public void setCompoundMolecularWeight(Double value) {
		setField(COMPOUND_MOLECULAR_WEIGHT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_POLAR_SURFACE_AREA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 * 
	 * @return the value stored on the "Compound.PolarSurfaceArea" field
	 */
	public Double getCompoundPolarSurfaceArea() {
		return getField(COMPOUND_POLAR_SURFACE_AREA);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_POLAR_SURFACE_AREA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.PolarSurfaceArea<br/>
	 * <br/>
	 * <b>Display Name</b>: Polar Surface Area<br/>
	 * <br/>
	 * <b>Description</b>: The calculated Polar Surface Area of a molecule.
	 * 
	 * @param value The value to set on the "Compound.PolarSurfaceArea" field
	 */
	public void setCompoundPolarSurfaceArea(Double value) {
		setField(COMPOUND_POLAR_SURFACE_AREA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_PRESSURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Pressure" field
	 */
	public Double getCompoundPressure() {
		return getField(COMPOUND_PRESSURE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_PRESSURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Pressure<br/>
	 * <br/>
	 * <b>Display Name</b>: Pressure<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Pressure" field
	 */
	public void setCompoundPressure(Double value) {
		setField(COMPOUND_PRESSURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_PUBCHEM_CID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 * 
	 * @return the value stored on the "Compound.PubchemCid" field
	 */
	public Integer getCompoundPubchemCid() {
		return getField(COMPOUND_PUBCHEM_CID);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_PUBCHEM_CID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.PubchemCid<br/>
	 * <br/>
	 * <b>Display Name</b>: Pubchem CID<br/>
	 * <br/>
	 * <b>Description</b>: Compound ID from pubchem.
	 * 
	 * @param value The value to set on the "Compound.PubchemCid" field
	 */
	public void setCompoundPubchemCid(Integer value) {
		setField(COMPOUND_PUBCHEM_CID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_PURITY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Purity" field
	 */
	public Double getCompoundPurity() {
		return getField(COMPOUND_PURITY);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_PURITY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Purity<br/>
	 * <br/>
	 * <b>Display Name</b>: Purity<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Purity" field
	 */
	public void setCompoundPurity(Double value) {
		setField(COMPOUND_PURITY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_REACTION_TIME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ReactionTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Reaction Time (h)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.ReactionTime" field
	 */
	public Double getCompoundReactionTime() {
		return getField(COMPOUND_REACTION_TIME);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_REACTION_TIME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ReactionTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Reaction Time (h)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.ReactionTime" field
	 */
	public void setCompoundReactionTime(Double value) {
		setField(COMPOUND_REACTION_TIME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Compound.RecordId" field
	 */
	public Long getCompoundRecordId() {
		return getField(COMPOUND_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_REGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 * 
	 * @return the value stored on the "Compound.RegistryId" field
	 */
	public String getCompoundRegistryId() {
		return getField(COMPOUND_REGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_REGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-accessioned identifier for this compound part.
	 * 
	 * @param value The value to set on the "Compound.RegistryId" field
	 */
	public void setCompoundRegistryId(String value) {
		setField(COMPOUND_REGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_SMILES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.SMILES" field
	 */
	public String getCompoundSMILES() {
		return getField(COMPOUND_SMILES);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_SMILES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.SMILES<br/>
	 * <br/>
	 * <b>Display Name</b>: SMILES<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.SMILES" field
	 */
	public void setCompoundSMILES(String value) {
		setField(COMPOUND_SMILES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_STEREO_REG_HASH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.StereoRegHash" field
	 */
	public String getCompoundStereoRegHash() {
		return getField(COMPOUND_STEREO_REG_HASH);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_STEREO_REG_HASH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.StereoRegHash<br/>
	 * <br/>
	 * <b>Display Name</b>: Stereo Registration Hash<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.StereoRegHash" field
	 */
	public void setCompoundStereoRegHash(String value) {
		setField(COMPOUND_STEREO_REG_HASH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_TEMPERATURE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Temperature" field
	 */
	public Double getCompoundTemperature() {
		return getField(COMPOUND_TEMPERATURE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_TEMPERATURE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Temperature<br/>
	 * <br/>
	 * <b>Display Name</b>: Temperature<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Temperature" field
	 */
	public void setCompoundTemperature(Double value) {
		setField(COMPOUND_TEMPERATURE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_TOTAL_HBOND_ACCEPTORS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 * 
	 * @return the value stored on the "Compound.TotalHBondAcceptors" field
	 */
	public Integer getCompoundTotalHBondAcceptors() {
		return getField(COMPOUND_TOTAL_HBOND_ACCEPTORS);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_TOTAL_HBOND_ACCEPTORS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.TotalHBondAcceptors<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Acceptors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated # of Hydrogen acceptors in a molecule.
	 * 
	 * @param value The value to set on the "Compound.TotalHBondAcceptors" field
	 */
	public void setCompoundTotalHBondAcceptors(Integer value) {
		setField(COMPOUND_TOTAL_HBOND_ACCEPTORS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_TOTAL_HBOND_COUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 * 
	 * @return the value stored on the "Compound.TotalHBondCount" field
	 */
	public Integer getCompoundTotalHBondCount() {
		return getField(COMPOUND_TOTAL_HBOND_COUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_TOTAL_HBOND_COUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.TotalHBondCount<br/>
	 * <br/>
	 * <b>Display Name</b>: #Hydrogen Bond Donors<br/>
	 * <br/>
	 * <b>Description</b>: Calculated number of hydrogen bond donors in a molecule.
	 * 
	 * @param value The value to set on the "Compound.TotalHBondCount" field
	 */
	public void setCompoundTotalHBondCount(Integer value) {
		setField(COMPOUND_TOTAL_HBOND_COUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Validated" field
	 */
	public Boolean getCompoundValidated() {
		return getField(COMPOUND_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Validated" field
	 */
	public void setCompoundValidated(Boolean value) {
		setField(COMPOUND_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Compound.VeloxLastModifiedBy" field
	 */
	public String getCompoundVeloxLastModifiedBy() {
		return getField(COMPOUND_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Compound.VeloxLastModifiedDate" field
	 */
	public Long getCompoundVeloxLastModifiedDate() {
		return getField(COMPOUND_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_YIELD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.Yield" field
	 */
	public Double getCompoundYield() {
		return getField(COMPOUND_YIELD);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_YIELD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.Yield<br/>
	 * <br/>
	 * <b>Display Name</b>: Yield<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.Yield" field
	 */
	public void setCompoundYield(Double value) {
		setField(COMPOUND_YIELD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUND_ZO_BIOONLY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ZoBioonly<br/>
	 * <br/>
	 * <b>Display Name</b>: Zo Bio only<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.ZoBioonly" field
	 */
	public Boolean getCompoundZoBioonly() {
		return getField(COMPOUND_ZO_BIOONLY);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUND_ZO_BIOONLY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.ZoBioonly<br/>
	 * <br/>
	 * <b>Display Name</b>: Zo Bio only<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.ZoBioonly" field
	 */
	public void setCompoundZoBioonly(Boolean value) {
		setField(COMPOUND_ZO_BIOONLY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUNDC_LOG_P} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 * 
	 * @return the value stored on the "Compound.cLogP" field
	 */
	public Double getCompoundcLogP() {
		return getField(COMPOUNDC_LOG_P);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUNDC_LOG_P} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.cLogP<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculated cLogP<br/>
	 * <br/>
	 * <b>Description</b>: The Calculated cLogP for the molecule.
	 * 
	 * @param value The value to set on the "Compound.cLogP" field
	 */
	public void setCompoundcLogP(Double value) {
		setField(COMPOUNDC_LOG_P, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPOUNDINCHI} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Compound.inchi" field
	 */
	public String getCompoundinchi() {
		return getField(COMPOUNDINCHI);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPOUNDINCHI} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Compound.inchi<br/>
	 * <br/>
	 * <b>Display Name</b>: INCHI<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Compound.inchi" field
	 */
	public void setCompoundinchi(String value) {
		setField(COMPOUNDINCHI, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration<br/>
	 * <br/>
	 * <b>Description</b>: The amount of mass per volume of sample material in the container. This could be a standard mass or a molar mass. The units are specified in the corresponding Concentration Units field.
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
	 * <b>Description</b>: The amount of mass per volume of sample material in the container. This could be a standard mass or a molar mass. The units are specified in the corresponding Concentration Units field.
	 * 
	 * @param value The value to set on the "Concentration" field
	 */
	public void setConcentration(Double value) {
		setField(CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONCENTRATION_UNITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConcentrationUnits<br/>
	 * <br/>
	 * <b>Display Name</b>: Concentration Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Concentration.
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
	 * <b>Display Name</b>: Concentration Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Concentration.
	 * 
	 * @param value The value to set on the "ConcentrationUnits" field
	 */
	public void setConcentrationUnits(String value) {
		setField(CONCENTRATION_UNITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_COL_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position in the Storage Unit where this reagent resides.
	 * 
	 * @return the value stored on the "ConsumableItem.ColPosition" field
	 */
	public String getConsumableItemColPosition() {
		return getField(CONSUMABLE_ITEM_COL_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_COL_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ColPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Column Position<br/>
	 * <br/>
	 * <b>Description</b>: The column position in the Storage Unit where this reagent resides.
	 * 
	 * @param value The value to set on the "ConsumableItem.ColPosition" field
	 */
	public void setConsumableItemColPosition(String value) {
		setField(CONSUMABLE_ITEM_COL_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of a consumable object that this item represents.
	 * 
	 * @return the value stored on the "ConsumableItem.ConsumableName" field
	 */
	public String getConsumableItemConsumableName() {
		return getField(CONSUMABLE_ITEM_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Name<br/>
	 * <br/>
	 * <b>Description</b>: Name of a consumable object that this item represents.
	 * 
	 * @param value The value to set on the "ConsumableItem.ConsumableName" field
	 */
	public void setConsumableItemConsumableName(String value) {
		setField(CONSUMABLE_ITEM_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Type<br/>
	 * <br/>
	 * <b>Description</b>: Type of this particular consumable object.
	 * 
	 * @return the value stored on the "ConsumableItem.ConsumableType" field
	 */
	public String getConsumableItemConsumableType() {
		return getField(CONSUMABLE_ITEM_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Consumable Type<br/>
	 * <br/>
	 * <b>Description</b>: Type of this particular consumable object.
	 * 
	 * @param value The value to set on the "ConsumableItem.ConsumableType" field
	 */
	public void setConsumableItemConsumableType(String value) {
		setField(CONSUMABLE_ITEM_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "ConsumableItem.CreatedBy" field
	 */
	public String getConsumableItemCreatedBy() {
		return getField(CONSUMABLE_ITEM_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "ConsumableItem.DataRecordName" field
	 */
	public String getConsumableItemDataRecordName() {
		return getField(CONSUMABLE_ITEM_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "ConsumableItem.DateCreated" field
	 */
	public Long getConsumableItemDateCreated() {
		return getField(CONSUMABLE_ITEM_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of expiration for this consumable item.
	 * 
	 * @return the value stored on the "ConsumableItem.ExpirationDate" field
	 */
	public Long getConsumableItemExpirationDate() {
		return getField(CONSUMABLE_ITEM_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of expiration for this consumable item.
	 * 
	 * @param value The value to set on the "ConsumableItem.ExpirationDate" field
	 */
	public void setConsumableItemExpirationDate(Long value) {
		setField(CONSUMABLE_ITEM_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 * 
	 * @return the value stored on the "ConsumableItem.Expired" field
	 */
	public Boolean getConsumableItemExpired() {
		return getField(CONSUMABLE_ITEM_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 * 
	 * @param value The value to set on the "ConsumableItem.Expired" field
	 */
	public void setConsumableItemExpired(Boolean value) {
		setField(CONSUMABLE_ITEM_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_KIT_LOT_NUMBERS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.KitLotNumbers<br/>
	 * <br/>
	 * <b>Display Name</b>: Kit Lot Numbers<br/>
	 * <br/>
	 * <b>Description</b>: Lot number(s) of a kit that this consumable item is a part of.
	 * 
	 * @return the value stored on the "ConsumableItem.KitLotNumbers" field
	 */
	public String getConsumableItemKitLotNumbers() {
		return getField(CONSUMABLE_ITEM_KIT_LOT_NUMBERS);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_KIT_LOT_NUMBERS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.KitLotNumbers<br/>
	 * <br/>
	 * <b>Display Name</b>: Kit Lot Numbers<br/>
	 * <br/>
	 * <b>Description</b>: Lot number(s) of a kit that this consumable item is a part of.
	 * 
	 * @param value The value to set on the "ConsumableItem.KitLotNumbers" field
	 */
	public void setConsumableItemKitLotNumbers(String value) {
		setField(CONSUMABLE_ITEM_KIT_LOT_NUMBERS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number    <br/>
	 * <br/>
	 * <b>Description</b>: Lot number of this particular consumable item.
	 * 
	 * @return the value stored on the "ConsumableItem.LotNumber" field
	 */
	public String getConsumableItemLotNumber() {
		return getField(CONSUMABLE_ITEM_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number    <br/>
	 * <br/>
	 * <b>Description</b>: Lot number of this particular consumable item.
	 * 
	 * @param value The value to set on the "ConsumableItem.LotNumber" field
	 */
	public void setConsumableItemLotNumber(String value) {
		setField(CONSUMABLE_ITEM_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_LOT_NUMBER_DEFINED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.LotNumberDefined<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number Defined<br/>
	 * <br/>
	 * <b>Description</b>: This field is used to make the consumable item log number field either editable or not editable. This is a system field used by Materials Management
	 * 
	 * @return the value stored on the "ConsumableItem.LotNumberDefined" field
	 */
	public Boolean getConsumableItemLotNumberDefined() {
		return getField(CONSUMABLE_ITEM_LOT_NUMBER_DEFINED);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_LOT_NUMBER_DEFINED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.LotNumberDefined<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number Defined<br/>
	 * <br/>
	 * <b>Description</b>: This field is used to make the consumable item log number field either editable or not editable. This is a system field used by Materials Management
	 * 
	 * @param value The value to set on the "ConsumableItem.LotNumberDefined" field
	 */
	public void setConsumableItemLotNumberDefined(Boolean value) {
		setField(CONSUMABLE_ITEM_LOT_NUMBER_DEFINED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Part number corresponding to a consumable object to which this item belongs to.
	 * 
	 * @return the value stored on the "ConsumableItem.PartNumber" field
	 */
	public String getConsumableItemPartNumber() {
		return getField(CONSUMABLE_ITEM_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: Part number corresponding to a consumable object to which this item belongs to.
	 * 
	 * @param value The value to set on the "ConsumableItem.PartNumber" field
	 */
	public void setConsumableItemPartNumber(String value) {
		setField(CONSUMABLE_ITEM_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "ConsumableItem.RecordId" field
	 */
	public Long getConsumableItemRecordId() {
		return getField(CONSUMABLE_ITEM_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_ROW_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position in the Storage Unit where this reagent resides.
	 * 
	 * @return the value stored on the "ConsumableItem.RowPosition" field
	 */
	public String getConsumableItemRowPosition() {
		return getField(CONSUMABLE_ITEM_ROW_POSITION);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_ROW_POSITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position in the Storage Unit where this reagent resides.
	 * 
	 * @param value The value to set on the "ConsumableItem.RowPosition" field
	 */
	public void setConsumableItemRowPosition(String value) {
		setField(CONSUMABLE_ITEM_ROW_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_STORAGE_LOCATION_BARCODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this reagent resides.
	 * 
	 * @return the value stored on the "ConsumableItem.StorageLocationBarcode" field
	 */
	public String getConsumableItemStorageLocationBarcode() {
		return getField(CONSUMABLE_ITEM_STORAGE_LOCATION_BARCODE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_STORAGE_LOCATION_BARCODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this reagent resides.
	 * 
	 * @param value The value to set on the "ConsumableItem.StorageLocationBarcode" field
	 */
	public void setConsumableItemStorageLocationBarcode(String value) {
		setField(CONSUMABLE_ITEM_STORAGE_LOCATION_BARCODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_STORAGE_UNIT_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
	 * 
	 * @return the value stored on the "ConsumableItem.StorageUnitPath" field
	 */
	public String getConsumableItemStorageUnitPath() {
		return getField(CONSUMABLE_ITEM_STORAGE_UNIT_PATH);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_STORAGE_UNIT_PATH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
	 * 
	 * @param value The value to set on the "ConsumableItem.StorageUnitPath" field
	 */
	public void setConsumableItemStorageUnitPath(String value) {
		setField(CONSUMABLE_ITEM_STORAGE_UNIT_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 * 
	 * @return the value stored on the "ConsumableItem.Validated" field
	 */
	public Boolean getConsumableItemValidated() {
		return getField(CONSUMABLE_ITEM_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 * 
	 * @param value The value to set on the "ConsumableItem.Validated" field
	 */
	public void setConsumableItemValidated(Boolean value) {
		setField(CONSUMABLE_ITEM_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of validation for this consumable item.
	 * 
	 * @return the value stored on the "ConsumableItem.ValidationDate" field
	 */
	public Long getConsumableItemValidationDate() {
		return getField(CONSUMABLE_ITEM_VALIDATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Date<br/>
	 * <br/>
	 * <b>Description</b>: Date of validation for this consumable item.
	 * 
	 * @param value The value to set on the "ConsumableItem.ValidationDate" field
	 */
	public void setConsumableItemValidationDate(Long value) {
		setField(CONSUMABLE_ITEM_VALIDATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_EXPERIMENT_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationExperimentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Experiment Id<br/>
	 * <br/>
	 * <b>Description</b>: Id of an experiment during which this consumable item has been validated.
	 * 
	 * @return the value stored on the "ConsumableItem.ValidationExperimentId" field
	 */
	public String getConsumableItemValidationExperimentId() {
		return getField(CONSUMABLE_ITEM_VALIDATION_EXPERIMENT_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_EXPERIMENT_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationExperimentId<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Experiment Id<br/>
	 * <br/>
	 * <b>Description</b>: Id of an experiment during which this consumable item has been validated.
	 * 
	 * @param value The value to set on the "ConsumableItem.ValidationExperimentId" field
	 */
	public void setConsumableItemValidationExperimentId(String value) {
		setField(CONSUMABLE_ITEM_VALIDATION_EXPERIMENT_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_TECHICIAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationTechician<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Technician<br/>
	 * <br/>
	 * <b>Description</b>: <!-- TECHNICIAN -->
	 * 
	 * @return the value stored on the "ConsumableItem.ValidationTechician" field
	 */
	public String getConsumableItemValidationTechician() {
		return getField(CONSUMABLE_ITEM_VALIDATION_TECHICIAN);
	}
	
	/**
	 * Sets the value stored on the {@link #CONSUMABLE_ITEM_VALIDATION_TECHICIAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.ValidationTechician<br/>
	 * <br/>
	 * <b>Display Name</b>: Validation Technician<br/>
	 * <br/>
	 * <b>Description</b>: <!-- TECHNICIAN -->
	 * 
	 * @param value The value to set on the "ConsumableItem.ValidationTechician" field
	 */
	public void setConsumableItemValidationTechician(String value) {
		setField(CONSUMABLE_ITEM_VALIDATION_TECHICIAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "ConsumableItem.VeloxLastModifiedBy" field
	 */
	public String getConsumableItemVeloxLastModifiedBy() {
		return getField(CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ConsumableItem.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "ConsumableItem.VeloxLastModifiedDate" field
	 */
	public Long getConsumableItemVeloxLastModifiedDate() {
		return getField(CONSUMABLE_ITEM_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONTAINER_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ContainerType<br/>
	 * <br/>
	 * <b>Display Name</b>: Container Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of container the sample material is in.
	 * 
	 * @return the value stored on the "ContainerType" field
	 */
	public String getContainerType() {
		return getField(CONTAINER_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #CONTAINER_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ContainerType<br/>
	 * <br/>
	 * <b>Display Name</b>: Container Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of container the sample material is in.
	 * 
	 * @param value The value to set on the "ContainerType" field
	 */
	public void setContainerType(String value) {
		setField(CONTAINER_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CONTROL_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
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
	 * <b>Description</b>: No Description
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
	 * Retrieves the value stored on the {@link #DNACREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "DNA.CreatedBy" field
	 */
	public String getDNACreatedBy() {
		return getField(DNACREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNADATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "DNA.DataRecordName" field
	 */
	public String getDNADataRecordName() {
		return getField(DNADATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNADATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "DNA.DateCreated" field
	 */
	public Long getDNADateCreated() {
		return getField(DNADATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAEXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.ExpirationDate" field
	 */
	public Long getDNAExpirationDate() {
		return getField(DNAEXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #DNAEXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.ExpirationDate" field
	 */
	public void setDNAExpirationDate(Long value) {
		setField(DNAEXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAEXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.Expired" field
	 */
	public Boolean getDNAExpired() {
		return getField(DNAEXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #DNAEXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.Expired" field
	 */
	public void setDNAExpired(Boolean value) {
		setField(DNAEXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAITEM_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.ItemId<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.ItemId" field
	 */
	public String getDNAItemId() {
		return getField(DNAITEM_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #DNAITEM_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.ItemId<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.ItemId" field
	 */
	public void setDNAItemId(String value) {
		setField(DNAITEM_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNANAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.Name" field
	 */
	public String getDNAName() {
		return getField(DNANAME);
	}
	
	/**
	 * Sets the value stored on the {@link #DNANAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Name<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.Name" field
	 */
	public void setDNAName(String value) {
		setField(DNANAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAPART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable part. The default will be "Compound". It does not need to be unique. It is only used as a disambiguate in case of collision in auto-name.
	 * 
	 * @return the value stored on the "DNA.PartNumber" field
	 */
	public String getDNAPartNumber() {
		return getField(DNAPART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #DNAPART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable part. The default will be "Compound". It does not need to be unique. It is only used as a disambiguate in case of collision in auto-name.
	 * 
	 * @param value The value to set on the "DNA.PartNumber" field
	 */
	public void setDNAPartNumber(String value) {
		setField(DNAPART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNARECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "DNA.RecordId" field
	 */
	public Long getDNARecordId() {
		return getField(DNARECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNASEQUENCE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.SequenceType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequence Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.SequenceType" field
	 */
	public String getDNASequenceType() {
		return getField(DNASEQUENCE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #DNASEQUENCE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.SequenceType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequence Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.SequenceType" field
	 */
	public void setDNASequenceType(String value) {
		setField(DNASEQUENCE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAVALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DNA.Validated" field
	 */
	public Boolean getDNAValidated() {
		return getField(DNAVALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #DNAVALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DNA.Validated" field
	 */
	public void setDNAValidated(Boolean value) {
		setField(DNAVALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAVELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "DNA.VeloxLastModifiedBy" field
	 */
	public String getDNAVeloxLastModifiedBy() {
		return getField(DNAVELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DNAVELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DNA.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "DNA.VeloxLastModifiedDate" field
	 */
	public Long getDNAVeloxLastModifiedDate() {
		return getField(DNAVELOX_LAST_MODIFIED_DATE);
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
	 * Retrieves the value stored on the {@link #DATEOF_BIRTH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DateofBirth<br/>
	 * <br/>
	 * <b>Display Name</b>: Date of Birth<br/>
	 * <br/>
	 * <b>Description</b>: Date of Birth of Patient
	 * 
	 * @return the value stored on the "DateofBirth" field
	 */
	public Long getDateofBirth() {
		return getField(DATEOF_BIRTH);
	}
	
	/**
	 * Sets the value stored on the {@link #DATEOF_BIRTH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DateofBirth<br/>
	 * <br/>
	 * <b>Display Name</b>: Date of Birth<br/>
	 * <br/>
	 * <b>Description</b>: Date of Birth of Patient
	 * 
	 * @param value The value to set on the "DateofBirth" field
	 */
	public void setDateofBirth(Long value) {
		setField(DATEOF_BIRTH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "DrugProduct.ConsumableName" field
	 */
	public String getDrugProductConsumableName() {
		return getField(DRUG_PRODUCT_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "DrugProduct.ConsumableName" field
	 */
	public void setDrugProductConsumableName(String value) {
		setField(DRUG_PRODUCT_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "DrugProduct.ConsumableType" field
	 */
	public String getDrugProductConsumableType() {
		return getField(DRUG_PRODUCT_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: DrugProduct Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "DrugProduct.ConsumableType" field
	 */
	public void setDrugProductConsumableType(String value) {
		setField(DRUG_PRODUCT_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "DrugProduct.CreatedBy" field
	 */
	public String getDrugProductCreatedBy() {
		return getField(DRUG_PRODUCT_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "DrugProduct.DataRecordName" field
	 */
	public String getDrugProductDataRecordName() {
		return getField(DRUG_PRODUCT_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "DrugProduct.DateCreated" field
	 */
	public Long getDrugProductDateCreated() {
		return getField(DRUG_PRODUCT_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "DrugProduct.ExpirationDate" field
	 */
	public Long getDrugProductExpirationDate() {
		return getField(DRUG_PRODUCT_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "DrugProduct.ExpirationDate" field
	 */
	public void setDrugProductExpirationDate(Long value) {
		setField(DRUG_PRODUCT_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "DrugProduct.LotNumber" field
	 */
	public String getDrugProductLotNumber() {
		return getField(DRUG_PRODUCT_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "DrugProduct.LotNumber" field
	 */
	public void setDrugProductLotNumber(String value) {
		setField(DRUG_PRODUCT_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: MES/ERP Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @return the value stored on the "DrugProduct.PartNumber" field
	 */
	public String getDrugProductPartNumber() {
		return getField(DRUG_PRODUCT_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: MES/ERP Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @param value The value to set on the "DrugProduct.PartNumber" field
	 */
	public void setDrugProductPartNumber(String value) {
		setField(DRUG_PRODUCT_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "DrugProduct.RecordId" field
	 */
	public Long getDrugProductRecordId() {
		return getField(DRUG_PRODUCT_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 * 
	 * @return the value stored on the "DrugProduct.Validated" field
	 */
	public Boolean getDrugProductValidated() {
		return getField(DRUG_PRODUCT_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #DRUG_PRODUCT_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: Defines if this consumable item has already been validated.
	 * 
	 * @param value The value to set on the "DrugProduct.Validated" field
	 */
	public void setDrugProductValidated(Boolean value) {
		setField(DRUG_PRODUCT_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "DrugProduct.VeloxLastModifiedBy" field
	 */
	public String getDrugProductVeloxLastModifiedBy() {
		return getField(DRUG_PRODUCT_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DRUG_PRODUCT_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DrugProduct.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "DrugProduct.VeloxLastModifiedDate" field
	 */
	public Long getDrugProductVeloxLastModifiedDate() {
		return getField(DRUG_PRODUCT_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme ID<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "Enzyme.ConsumableName" field
	 */
	public String getEnzymeConsumableName() {
		return getField(ENZYME_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme ID<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "Enzyme.ConsumableName" field
	 */
	public void setEnzymeConsumableName(String value) {
		setField(ENZYME_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "Enzyme.ConsumableType" field
	 */
	public String getEnzymeConsumableType() {
		return getField(ENZYME_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "Enzyme.ConsumableType" field
	 */
	public void setEnzymeConsumableType(String value) {
		setField(ENZYME_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Enzyme.CreatedBy" field
	 */
	public String getEnzymeCreatedBy() {
		return getField(ENZYME_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Enzyme.DataRecordName" field
	 */
	public String getEnzymeDataRecordName() {
		return getField(ENZYME_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Enzyme.DateCreated" field
	 */
	public Long getEnzymeDateCreated() {
		return getField(ENZYME_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_DATE_OF_PURCHASE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.DateOfPurchase<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Of Purchase<br/>
	 * <br/>
	 * <b>Description</b>: The purchasing date of this enzyme lot
	 * 
	 * @return the value stored on the "Enzyme.DateOfPurchase" field
	 */
	public Long getEnzymeDateOfPurchase() {
		return getField(ENZYME_DATE_OF_PURCHASE);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_DATE_OF_PURCHASE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.DateOfPurchase<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Of Purchase<br/>
	 * <br/>
	 * <b>Description</b>: The purchasing date of this enzyme lot
	 * 
	 * @param value The value to set on the "Enzyme.DateOfPurchase" field
	 */
	public void setEnzymeDateOfPurchase(Long value) {
		setField(ENZYME_DATE_OF_PURCHASE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_ENZYME_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.EnzymeType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Enzyme.EnzymeType" field
	 */
	public String getEnzymeEnzymeType() {
		return getField(ENZYME_ENZYME_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_ENZYME_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.EnzymeType<br/>
	 * <br/>
	 * <b>Display Name</b>: Enzyme Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Enzyme.EnzymeType" field
	 */
	public void setEnzymeEnzymeType(String value) {
		setField(ENZYME_ENZYME_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Enzyme.ExpirationDate" field
	 */
	public Long getEnzymeExpirationDate() {
		return getField(ENZYME_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Enzyme.ExpirationDate" field
	 */
	public void setEnzymeExpirationDate(Long value) {
		setField(ENZYME_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Enzyme.Expired" field
	 */
	public Boolean getEnzymeExpired() {
		return getField(ENZYME_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Enzyme.Expired" field
	 */
	public void setEnzymeExpired(Boolean value) {
		setField(ENZYME_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Enzyme.LotNumber" field
	 */
	public String getEnzymeLotNumber() {
		return getField(ENZYME_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Enzyme.LotNumber" field
	 */
	public void setEnzymeLotNumber(String value) {
		setField(ENZYME_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @return the value stored on the "Enzyme.PartNumber" field
	 */
	public String getEnzymePartNumber() {
		return getField(ENZYME_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @param value The value to set on the "Enzyme.PartNumber" field
	 */
	public void setEnzymePartNumber(String value) {
		setField(ENZYME_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Enzyme.RecordId" field
	 */
	public Long getEnzymeRecordId() {
		return getField(ENZYME_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Enzyme.Validated" field
	 */
	public Boolean getEnzymeValidated() {
		return getField(ENZYME_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Enzyme.Validated" field
	 */
	public void setEnzymeValidated(Boolean value) {
		setField(ENZYME_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Enzyme.VeloxLastModifiedBy" field
	 */
	public String getEnzymeVeloxLastModifiedBy() {
		return getField(ENZYME_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Enzyme.VeloxLastModifiedDate" field
	 */
	public Long getEnzymeVeloxLastModifiedDate() {
		return getField(ENZYME_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENZYME_VENDOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @return the value stored on the "Enzyme.Vendor" field
	 */
	public String getEnzymeVendor() {
		return getField(ENZYME_VENDOR);
	}
	
	/**
	 * Sets the value stored on the {@link #ENZYME_VENDOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Enzyme.Vendor<br/>
	 * <br/>
	 * <b>Display Name</b>: Vendor<br/>
	 * <br/>
	 * <b>Description</b>: The name of the vendor that provides this part.
	 * 
	 * @param value The value to set on the "Enzyme.Vendor" field
	 */
	public void setEnzymeVendor(String value) {
		setField(ENZYME_VENDOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXEMPLAR_SAMPLE_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Current process tracking status of the sample. This maintains the samples current availability and progress through its assigned processes. Once a sample enters into process tracking workflows, this field will usually contain values that reflect that it has become ready for, in process, completed, or failed for a workflow. Note that this status only applies to this specific aliquot and not the whole lineage of the sample from which it is derived.
	 * 
	 * @return the value stored on the "ExemplarSampleStatus" field
	 */
	public String getExemplarSampleStatus() {
		return getField(EXEMPLAR_SAMPLE_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #EXEMPLAR_SAMPLE_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Current process tracking status of the sample. This maintains the samples current availability and progress through its assigned processes. Once a sample enters into process tracking workflows, this field will usually contain values that reflect that it has become ready for, in process, completed, or failed for a workflow. Note that this status only applies to this specific aliquot and not the whole lineage of the sample from which it is derived.
	 * 
	 * @param value The value to set on the "ExemplarSampleStatus" field
	 */
	public void setExemplarSampleStatus(String value) {
		setField(EXEMPLAR_SAMPLE_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXEMPLAR_SAMPLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The physical type of sample material. (E.g. Blood, DNA, or DNA Library)
	 * 
	 * @return the value stored on the "ExemplarSampleType" field
	 */
	public String getExemplarSampleType() {
		return getField(EXEMPLAR_SAMPLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #EXEMPLAR_SAMPLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExemplarSampleType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Type<br/>
	 * <br/>
	 * <b>Description</b>: The physical type of sample material. (E.g. Blood, DNA, or DNA Library)
	 * 
	 * @param value The value to set on the "ExemplarSampleType" field
	 */
	public void setExemplarSampleType(String value) {
		setField(EXEMPLAR_SAMPLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FED_EX_TRACKING_NO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FedExTrackingNo<br/>
	 * <br/>
	 * <b>Display Name</b>: FedEx Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: Tracking Number of FedEx Shipment
	 * 
	 * @return the value stored on the "FedExTrackingNo" field
	 */
	public String getFedExTrackingNo() {
		return getField(FED_EX_TRACKING_NO);
	}
	
	/**
	 * Sets the value stored on the {@link #FED_EX_TRACKING_NO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FedExTrackingNo<br/>
	 * <br/>
	 * <b>Display Name</b>: FedEx Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: Tracking Number of FedEx Shipment
	 * 
	 * @param value The value to set on the "FedExTrackingNo" field
	 */
	public void setFedExTrackingNo(String value) {
		setField(FED_EX_TRACKING_NO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FERMENTED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Display Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Fermented" field
	 */
	public Boolean getFermented() {
		return getField(FERMENTED);
	}
	
	/**
	 * Sets the value stored on the {@link #FERMENTED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Display Name</b>: Fermented<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Fermented" field
	 */
	public void setFermented(Boolean value) {
		setField(FERMENTED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FLAGS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Flags<br/>
	 * <br/>
	 * <b>Display Name</b>: Flags<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Flags" field
	 */
	public String getFlags() {
		return getField(FLAGS);
	}
	
	/**
	 * Sets the value stored on the {@link #FLAGS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Flags<br/>
	 * <br/>
	 * <b>Display Name</b>: Flags<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Flags" field
	 */
	public void setFlags(String value) {
		setField(FLAGS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #FLOW_JO_GROUP_SIDE_LINK} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowJoGroupSideLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Jo Group Side Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "FlowJoGroupSideLink" field
	 */
	public Long getFlowJoGroupSideLink() {
		return getField(FLOW_JO_GROUP_SIDE_LINK);
	}
	
	/**
	 * Sets the value stored on the {@link #FLOW_JO_GROUP_SIDE_LINK} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowJoGroupSideLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Jo Group Side Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "FlowJoGroupSideLink" field
	 */
	public void setFlowJoGroupSideLink(Long value) {
		setField(FLOW_JO_GROUP_SIDE_LINK, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_APERIO_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AperioId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AperioId" field
	 */
	public String getHistologySlideAperioId() {
		return getField(HISTOLOGY_SLIDE_APERIO_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_APERIO_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AperioId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AperioId" field
	 */
	public void setHistologySlideAperioId(String value) {
		setField(HISTOLOGY_SLIDE_APERIO_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_APERIO_IMAGE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AperioImageId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio Image ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AperioImageId" field
	 */
	public String getHistologySlideAperioImageId() {
		return getField(HISTOLOGY_SLIDE_APERIO_IMAGE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_APERIO_IMAGE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AperioImageId<br/>
	 * <br/>
	 * <b>Display Name</b>: Aperio Image ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AperioImageId" field
	 */
	public void setHistologySlideAperioImageId(String value) {
		setField(HISTOLOGY_SLIDE_APERIO_IMAGE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_DOSAGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedDosage<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Dosage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AssignedDosage" field
	 */
	public String getHistologySlideAssignedDosage() {
		return getField(HISTOLOGY_SLIDE_ASSIGNED_DOSAGE);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_DOSAGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedDosage<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Dosage<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AssignedDosage" field
	 */
	public void setHistologySlideAssignedDosage(String value) {
		setField(HISTOLOGY_SLIDE_ASSIGNED_DOSAGE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_GROUPS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedGroups<br/>
	 * <br/>
	 * <b>Display Name</b>: Section(s) On Slide<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AssignedGroups" field
	 */
	public String getHistologySlideAssignedGroups() {
		return getField(HISTOLOGY_SLIDE_ASSIGNED_GROUPS);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_GROUPS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedGroups<br/>
	 * <br/>
	 * <b>Display Name</b>: Section(s) On Slide<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AssignedGroups" field
	 */
	public void setHistologySlideAssignedGroups(String value) {
		setField(HISTOLOGY_SLIDE_ASSIGNED_GROUPS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_STAIN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AssignedStain" field
	 */
	public String getHistologySlideAssignedStain() {
		return getField(HISTOLOGY_SLIDE_ASSIGNED_STAIN);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_STAIN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AssignedStain" field
	 */
	public void setHistologySlideAssignedStain(String value) {
		setField(HISTOLOGY_SLIDE_ASSIGNED_STAIN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_TISSUE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedTissue<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Tissue<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.AssignedTissue" field
	 */
	public String getHistologySlideAssignedTissue() {
		return getField(HISTOLOGY_SLIDE_ASSIGNED_TISSUE);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_ASSIGNED_TISSUE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.AssignedTissue<br/>
	 * <br/>
	 * <b>Display Name</b>: Assigned Tissue<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.AssignedTissue" field
	 */
	public void setHistologySlideAssignedTissue(String value) {
		setField(HISTOLOGY_SLIDE_ASSIGNED_TISSUE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "HistologySlide.CreatedBy" field
	 */
	public String getHistologySlideCreatedBy() {
		return getField(HISTOLOGY_SLIDE_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "HistologySlide.DataRecordName" field
	 */
	public String getHistologySlideDataRecordName() {
		return getField(HISTOLOGY_SLIDE_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "HistologySlide.DateCreated" field
	 */
	public Long getHistologySlideDateCreated() {
		return getField(HISTOLOGY_SLIDE_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_FILE_IDENTIFIER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.FileIdentifier<br/>
	 * <br/>
	 * <b>Display Name</b>: File Identifier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.FileIdentifier" field
	 */
	public String getHistologySlideFileIdentifier() {
		return getField(HISTOLOGY_SLIDE_FILE_IDENTIFIER);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_FILE_IDENTIFIER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.FileIdentifier<br/>
	 * <br/>
	 * <b>Display Name</b>: File Identifier<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.FileIdentifier" field
	 */
	public void setHistologySlideFileIdentifier(String value) {
		setField(HISTOLOGY_SLIDE_FILE_IDENTIFIER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_FILE_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @return the value stored on the "HistologySlide.FilePath" field
	 */
	public String getHistologySlideFilePath() {
		return getField(HISTOLOGY_SLIDE_FILE_PATH);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_FILE_PATH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @param value The value to set on the "HistologySlide.FilePath" field
	 */
	public void setHistologySlideFilePath(String value) {
		setField(HISTOLOGY_SLIDE_FILE_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_GENERATED_LAYOUT_ASSIGNED_STAIN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutAssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Suggested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.GeneratedLayoutAssignedStain" field
	 */
	public String getHistologySlideGeneratedLayoutAssignedStain() {
		return getField(HISTOLOGY_SLIDE_GENERATED_LAYOUT_ASSIGNED_STAIN);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_GENERATED_LAYOUT_ASSIGNED_STAIN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutAssignedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Suggested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.GeneratedLayoutAssignedStain" field
	 */
	public void setHistologySlideGeneratedLayoutAssignedStain(String value) {
		setField(HISTOLOGY_SLIDE_GENERATED_LAYOUT_ASSIGNED_STAIN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_GENERATED_LAYOUT_SLIDE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutSlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Generated Layout Slide Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.GeneratedLayoutSlideId" field
	 */
	public String getHistologySlideGeneratedLayoutSlideId() {
		return getField(HISTOLOGY_SLIDE_GENERATED_LAYOUT_SLIDE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_GENERATED_LAYOUT_SLIDE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.GeneratedLayoutSlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Generated Layout Slide Id<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.GeneratedLayoutSlideId" field
	 */
	public void setHistologySlideGeneratedLayoutSlideId(String value) {
		setField(HISTOLOGY_SLIDE_GENERATED_LAYOUT_SLIDE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_NUM_SECTIONS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.NumSections<br/>
	 * <br/>
	 * <b>Display Name</b>: # Sections<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.NumSections" field
	 */
	public Integer getHistologySlideNumSections() {
		return getField(HISTOLOGY_SLIDE_NUM_SECTIONS);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_NUM_SECTIONS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.NumSections<br/>
	 * <br/>
	 * <b>Display Name</b>: # Sections<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.NumSections" field
	 */
	public void setHistologySlideNumSections(Integer value) {
		setField(HISTOLOGY_SLIDE_NUM_SECTIONS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_PROTOCOL_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.ProtocolName<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.ProtocolName" field
	 */
	public String getHistologySlideProtocolName() {
		return getField(HISTOLOGY_SLIDE_PROTOCOL_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_PROTOCOL_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.ProtocolName<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.ProtocolName" field
	 */
	public void setHistologySlideProtocolName(String value) {
		setField(HISTOLOGY_SLIDE_PROTOCOL_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_PROTOCOL_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.ProtocolNumber" field
	 */
	public String getHistologySlideProtocolNumber() {
		return getField(HISTOLOGY_SLIDE_PROTOCOL_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_PROTOCOL_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.ProtocolNumber" field
	 */
	public void setHistologySlideProtocolNumber(String value) {
		setField(HISTOLOGY_SLIDE_PROTOCOL_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "HistologySlide.RecordId" field
	 */
	public Long getHistologySlideRecordId() {
		return getField(HISTOLOGY_SLIDE_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_SAMPLE_GROUP_BY_FIELD_IDS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SampleGroupByFieldIds<br/>
	 * <br/>
	 * <b>Display Name</b>: Investigator Ids<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.SampleGroupByFieldIds" field
	 */
	public String getHistologySlideSampleGroupByFieldIds() {
		return getField(HISTOLOGY_SLIDE_SAMPLE_GROUP_BY_FIELD_IDS);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_SAMPLE_GROUP_BY_FIELD_IDS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SampleGroupByFieldIds<br/>
	 * <br/>
	 * <b>Display Name</b>: Investigator Ids<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.SampleGroupByFieldIds" field
	 */
	public void setHistologySlideSampleGroupByFieldIds(String value) {
		setField(HISTOLOGY_SLIDE_SAMPLE_GROUP_BY_FIELD_IDS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_SLIDE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.SlideId" field
	 */
	public String getHistologySlideSlideId() {
		return getField(HISTOLOGY_SLIDE_SLIDE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_SLIDE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SlideId<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.SlideId" field
	 */
	public void setHistologySlideSlideId(String value) {
		setField(HISTOLOGY_SLIDE_SLIDE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_SLIDE_ID_CLONED_FROM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SlideIdClonedFrom<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID Cloned From<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "HistologySlide.SlideIdClonedFrom" field
	 */
	public String getHistologySlideSlideIdClonedFrom() {
		return getField(HISTOLOGY_SLIDE_SLIDE_ID_CLONED_FROM);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_SLIDE_ID_CLONED_FROM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.SlideIdClonedFrom<br/>
	 * <br/>
	 * <b>Display Name</b>: Slide ID Cloned From<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "HistologySlide.SlideIdClonedFrom" field
	 */
	public void setHistologySlideSlideIdClonedFrom(String value) {
		setField(HISTOLOGY_SLIDE_SLIDE_ID_CLONED_FROM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_CHECK_OUT_USER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @return the value stored on the "HistologySlide.VeloxCheckOutUser" field
	 */
	public String getHistologySlideVeloxCheckOutUser() {
		return getField(HISTOLOGY_SLIDE_VELOX_CHECK_OUT_USER);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_CHECK_OUT_USER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @param value The value to set on the "HistologySlide.VeloxCheckOutUser" field
	 */
	public void setHistologySlideVeloxCheckOutUser(String value) {
		setField(HISTOLOGY_SLIDE_VELOX_CHECK_OUT_USER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_CURRENT_VERSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @return the value stored on the "HistologySlide.VeloxCurrentVersion" field
	 */
	public Integer getHistologySlideVeloxCurrentVersion() {
		return getField(HISTOLOGY_SLIDE_VELOX_CURRENT_VERSION);
	}
	
	/**
	 * Sets the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_CURRENT_VERSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @param value The value to set on the "HistologySlide.VeloxCurrentVersion" field
	 */
	public void setHistologySlideVeloxCurrentVersion(Integer value) {
		setField(HISTOLOGY_SLIDE_VELOX_CURRENT_VERSION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "HistologySlide.VeloxLastModifiedBy" field
	 */
	public String getHistologySlideVeloxLastModifiedBy() {
		return getField(HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: HistologySlide.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "HistologySlide.VeloxLastModifiedDate" field
	 */
	public Long getHistologySlideVeloxLastModifiedDate() {
		return getField(HISTOLOGY_SLIDE_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_CONTROL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Control?<br/>
	 * <br/>
	 * <b>Description</b>: Denotes if this sample represents a control sample or not.
	 * 
	 * @return the value stored on the "IsControl" field
	 */
	public Boolean getIsControl() {
		return getField(IS_CONTROL);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_CONTROL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Control?<br/>
	 * <br/>
	 * <b>Description</b>: Denotes if this sample represents a control sample or not.
	 * 
	 * @param value The value to set on the "IsControl" field
	 */
	public void setIsControl(Boolean value) {
		setField(IS_CONTROL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_INVALID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsInvalid<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Invalid?<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the Specimen's validity for consideration for further testing
	 * 
	 * @return the value stored on the "IsInvalid" field
	 */
	public Boolean getIsInvalid() {
		return getField(IS_INVALID);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_INVALID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsInvalid<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Invalid?<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the Specimen's validity for consideration for further testing
	 * 
	 * @param value The value to set on the "IsInvalid" field
	 */
	public void setIsInvalid(Boolean value) {
		setField(IS_INVALID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_POOLED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsPooled<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Pooled?<br/>
	 * <br/>
	 * <b>Description</b>: This should be set to true when a sample represents a pool of multiple other samples.
	 * 
	 * @return the value stored on the "IsPooled" field
	 */
	public Boolean getIsPooled() {
		return getField(IS_POOLED);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_POOLED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsPooled<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Pooled?<br/>
	 * <br/>
	 * <b>Description</b>: This should be set to true when a sample represents a pool of multiple other samples.
	 * 
	 * @param value The value to set on the "IsPooled" field
	 */
	public void setIsPooled(Boolean value) {
		setField(IS_POOLED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LAST_EDITED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastEditedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Edited By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LastEditedBy" field
	 */
	public String getLastEditedBy() {
		return getField(LAST_EDITED_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #LAST_EDITED_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LastEditedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Edited By<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LastEditedBy" field
	 */
	public void setLastEditedBy(String value) {
		setField(LAST_EDITED_BY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NGSSINGLE_TEMPLATE_PROCESS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NGSSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: NGS Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "NGSSingleTemplateProcess" field
	 */
	public String getNGSSingleTemplateProcess() {
		return getField(NGSSINGLE_TEMPLATE_PROCESS);
	}
	
	/**
	 * Sets the value stored on the {@link #NGSSINGLE_TEMPLATE_PROCESS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NGSSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: NGS Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "NGSSingleTemplateProcess" field
	 */
	public void setNGSSingleTemplateProcess(String value) {
		setField(NGSSINGLE_TEMPLATE_PROCESS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OBSERVED_CONDITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ObservedCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Observed Aspects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "ObservedCondition" field
	 */
	public String getObservedCondition() {
		return getField(OBSERVED_CONDITION);
	}
	
	/**
	 * Sets the value stored on the {@link #OBSERVED_CONDITION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ObservedCondition<br/>
	 * <br/>
	 * <b>Display Name</b>: Observed Aspects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "ObservedCondition" field
	 */
	public void setObservedCondition(String value) {
		setField(OBSERVED_CONDITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ORGANISM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Organism<br/>
	 * <br/>
	 * <b>Display Name</b>: Organism<br/>
	 * <br/>
	 * <b>Description</b>: Describes the specimen this sample was extracted from.
	 * 
	 * @return the value stored on the "Organism" field
	 */
	public String getOrganism() {
		return getField(ORGANISM);
	}
	
	/**
	 * Sets the value stored on the {@link #ORGANISM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Organism<br/>
	 * <br/>
	 * <b>Display Name</b>: Organism<br/>
	 * <br/>
	 * <b>Description</b>: Describes the specimen this sample was extracted from.
	 * 
	 * @param value The value to set on the "Organism" field
	 */
	public void setOrganism(String value) {
		setField(ORGANISM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #OTHER_SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: OtherSampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name<br/>
	 * <br/>
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
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
	 * <b>Description</b>: A secondary identifer that can hold any other meaningful identifier for this sample. This will be mapped down to all aliquot samples and wells.
	 * 
	 * @param value The value to set on the "OtherSampleId" field
	 */
	public void setOtherSampleId(String value) {
		setField(OTHER_SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PATIENT_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PatientID<br/>
	 * <br/>
	 * <b>Display Name</b>: Patient ID<br/>
	 * <br/>
	 * <b>Description</b>: Patient ID
	 * 
	 * @return the value stored on the "PatientID" field
	 */
	public String getPatientID() {
		return getField(PATIENT_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #PATIENT_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PatientID<br/>
	 * <br/>
	 * <b>Display Name</b>: Patient ID<br/>
	 * <br/>
	 * <b>Description</b>: Patient ID
	 * 
	 * @param value The value to set on the "PatientID" field
	 */
	public void setPatientID(String value) {
		setField(PATIENT_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PLATE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
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
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "PlateId" field
	 */
	public void setPlateId(String value) {
		setField(PLATE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PREVIOUS_EXEMPLAR_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PreviousExemplarStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Previous Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Previous sample status before placed on-hold Agendia only.
	 * 
	 * @return the value stored on the "PreviousExemplarStatus" field
	 */
	public String getPreviousExemplarStatus() {
		return getField(PREVIOUS_EXEMPLAR_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #PREVIOUS_EXEMPLAR_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PreviousExemplarStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Previous Sample Status<br/>
	 * <br/>
	 * <b>Description</b>: Previous sample status before placed on-hold Agendia only.
	 * 
	 * @param value The value to set on the "PreviousExemplarStatus" field
	 */
	public void setPreviousExemplarStatus(String value) {
		setField(PREVIOUS_EXEMPLAR_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_BARCODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Barcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Protein.Barcode" field
	 */
	public String getProteinBarcode() {
		return getField(PROTEIN_BARCODE);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_BARCODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Barcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Barcode<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Protein.Barcode" field
	 */
	public void setProteinBarcode(String value) {
		setField(PROTEIN_BARCODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this part.
	 * 
	 * @return the value stored on the "Protein.ConsumableName" field
	 */
	public String getProteinConsumableName() {
		return getField(PROTEIN_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this part.
	 * 
	 * @param value The value to set on the "Protein.ConsumableName" field
	 */
	public void setProteinConsumableName(String value) {
		setField(PROTEIN_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this part.
	 * 
	 * @return the value stored on the "Protein.ConsumableType" field
	 */
	public String getProteinConsumableType() {
		return getField(PROTEIN_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this part.
	 * 
	 * @param value The value to set on the "Protein.ConsumableType" field
	 */
	public void setProteinConsumableType(String value) {
		setField(PROTEIN_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Protein.CreatedBy" field
	 */
	public String getProteinCreatedBy() {
		return getField(PROTEIN_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Protein.DataRecordName" field
	 */
	public String getProteinDataRecordName() {
		return getField(PROTEIN_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Protein.DateCreated" field
	 */
	public Long getProteinDateCreated() {
		return getField(PROTEIN_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Protein.ExpirationDate" field
	 */
	public Long getProteinExpirationDate() {
		return getField(PROTEIN_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Protein.ExpirationDate" field
	 */
	public void setProteinExpirationDate(Long value) {
		setField(PROTEIN_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 * 
	 * @return the value stored on the "Protein.Expired" field
	 */
	public Boolean getProteinExpired() {
		return getField(PROTEIN_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: Signifies if this consumable item is expired or not.
	 * 
	 * @param value The value to set on the "Protein.Expired" field
	 */
	public void setProteinExpired(Boolean value) {
		setField(PROTEIN_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Protein.LotNumber" field
	 */
	public String getProteinLotNumber() {
		return getField(PROTEIN_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Protein.LotNumber" field
	 */
	public void setProteinLotNumber(String value) {
		setField(PROTEIN_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is not used, but currently required to identify a data type as a consumable item.
	 * 
	 * @return the value stored on the "Protein.PartNumber" field
	 */
	public String getProteinPartNumber() {
		return getField(PROTEIN_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: This field is not used, but currently required to identify a data type as a consumable item.
	 * 
	 * @param value The value to set on the "Protein.PartNumber" field
	 */
	public void setProteinPartNumber(String value) {
		setField(PROTEIN_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Protein.RecordId" field
	 */
	public Long getProteinRecordId() {
		return getField(PROTEIN_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Protein.Validated" field
	 */
	public Boolean getProteinValidated() {
		return getField(PROTEIN_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #PROTEIN_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Protein.Validated" field
	 */
	public void setProteinValidated(Boolean value) {
		setField(PROTEIN_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Protein.VeloxLastModifiedBy" field
	 */
	public String getProteinVeloxLastModifiedBy() {
		return getField(PROTEIN_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROTEIN_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Protein.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Protein.VeloxLastModifiedDate" field
	 */
	public Long getProteinVeloxLastModifiedDate() {
		return getField(PROTEIN_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNACONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "RNA.ConsumableName" field
	 */
	public String getRNAConsumableName() {
		return getField(RNACONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #RNACONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "RNA.ConsumableName" field
	 */
	public void setRNAConsumableName(String value) {
		setField(RNACONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNACONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "RNA.ConsumableType" field
	 */
	public String getRNAConsumableType() {
		return getField(RNACONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #RNACONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Type<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "RNA.ConsumableType" field
	 */
	public void setRNAConsumableType(String value) {
		setField(RNACONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNACREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "RNA.CreatedBy" field
	 */
	public String getRNACreatedBy() {
		return getField(RNACREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNADATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "RNA.DataRecordName" field
	 */
	public String getRNADataRecordName() {
		return getField(RNADATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNADATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "RNA.DateCreated" field
	 */
	public Long getRNADateCreated() {
		return getField(RNADATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAEXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "RNA.ExpirationDate" field
	 */
	public Long getRNAExpirationDate() {
		return getField(RNAEXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #RNAEXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "RNA.ExpirationDate" field
	 */
	public void setRNAExpirationDate(Long value) {
		setField(RNAEXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAEXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RNA.Expired" field
	 */
	public Boolean getRNAExpired() {
		return getField(RNAEXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #RNAEXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RNA.Expired" field
	 */
	public void setRNAExpired(Boolean value) {
		setField(RNAEXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNALOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "RNA.LotNumber" field
	 */
	public String getRNALotNumber() {
		return getField(RNALOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #RNALOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "RNA.LotNumber" field
	 */
	public void setRNALotNumber(String value) {
		setField(RNALOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNARECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "RNA.RecordId" field
	 */
	public Long getRNARecordId() {
		return getField(RNARECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAREGISTRY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @return the value stored on the "RNA.RegistryId" field
	 */
	public String getRNARegistryId() {
		return getField(RNAREGISTRY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #RNAREGISTRY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.RegistryId<br/>
	 * <br/>
	 * <b>Display Name</b>: Registry ID<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this part.
	 * 
	 * @param value The value to set on the "RNA.RegistryId" field
	 */
	public void setRNARegistryId(String value) {
		setField(RNAREGISTRY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAVALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RNA.Validated" field
	 */
	public Boolean getRNAValidated() {
		return getField(RNAVALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #RNAVALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RNA.Validated" field
	 */
	public void setRNAValidated(Boolean value) {
		setField(RNAVALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAVELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "RNA.VeloxLastModifiedBy" field
	 */
	public String getRNAVeloxLastModifiedBy() {
		return getField(RNAVELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RNAVELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RNA.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "RNA.VeloxLastModifiedDate" field
	 */
	public Long getRNAVeloxLastModifiedDate() {
		return getField(RNAVELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RELATED_PLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RelatedPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Plate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RelatedPlate" field
	 */
	public String getRelatedPlate() {
		return getField(RELATED_PLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #RELATED_PLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RelatedPlate<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Plate<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RelatedPlate" field
	 */
	public void setRelatedPlate(String value) {
		setField(RELATED_PLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ROW_POSITION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RowPosition<br/>
	 * <br/>
	 * <b>Display Name</b>: Row Position<br/>
	 * <br/>
	 * <b>Description</b>: The row position in the Storage Unit where this sample resides.
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
	 * <b>Description</b>: The row position in the Storage Unit where this sample resides.
	 * 
	 * @param value The value to set on the "RowPosition" field
	 */
	public void setRowPosition(String value) {
		setField(ROW_POSITION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SACRIFICED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SacrificedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sacrificed Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SacrificedDate" field
	 */
	public Long getSacrificedDate() {
		return getField(SACRIFICED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SACRIFICED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SacrificedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sacrificed Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SacrificedDate" field
	 */
	public void setSacrificedDate(Long value) {
		setField(SACRIFICED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleId<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample ID<br/>
	 * <br/>
	 * <b>Description</b>: The primary identifier of the sample.
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
	 * <b>Description</b>: The primary identifier of the sample.
	 * 
	 * @param value The value to set on the "SampleId" field
	 */
	public void setSampleId(String value) {
		setField(SAMPLE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLE_REGISTRATION_LINK} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleRegistrationLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Registration Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SampleRegistrationLink" field
	 */
	public Long getSampleRegistrationLink() {
		return getField(SAMPLE_REGISTRATION_LINK);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLE_REGISTRATION_LINK} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SampleRegistrationLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Registration Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SampleRegistrationLink" field
	 */
	public void setSampleRegistrationLink(Long value) {
		setField(SAMPLE_REGISTRATION_LINK, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAMPLING_SCHEDULE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SamplingSchedule<br/>
	 * <br/>
	 * <b>Display Name</b>: Sampling Schedule<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SamplingSchedule" field
	 */
	public Long getSamplingSchedule() {
		return getField(SAMPLING_SCHEDULE);
	}
	
	/**
	 * Sets the value stored on the {@link #SAMPLING_SCHEDULE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SamplingSchedule<br/>
	 * <br/>
	 * <b>Display Name</b>: Sampling Schedule<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SamplingSchedule" field
	 */
	public void setSamplingSchedule(Long value) {
		setField(SAMPLING_SCHEDULE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SAPIO_SINGLE_TEMPLATE_PROCESS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SapioSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: Sapio Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SapioSingleTemplateProcess" field
	 */
	public String getSapioSingleTemplateProcess() {
		return getField(SAPIO_SINGLE_TEMPLATE_PROCESS);
	}
	
	/**
	 * Sets the value stored on the {@link #SAPIO_SINGLE_TEMPLATE_PROCESS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SapioSingleTemplateProcess<br/>
	 * <br/>
	 * <b>Display Name</b>: Sapio Single Template Process<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SapioSingleTemplateProcess" field
	 */
	public void setSapioSingleTemplateProcess(String value) {
		setField(SAPIO_SINGLE_TEMPLATE_PROCESS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SOURCE_SUBJECT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceSubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SourceSubject" field
	 */
	public Long getSourceSubject() {
		return getField(SOURCE_SUBJECT);
	}
	
	/**
	 * Sets the value stored on the {@link #SOURCE_SUBJECT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SourceSubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SourceSubject" field
	 */
	public void setSourceSubject(Long value) {
		setField(SOURCE_SUBJECT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Id<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "Stain.ConsumableName" field
	 */
	public String getStainConsumableName() {
		return getField(STAIN_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Stain Id<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "Stain.ConsumableName" field
	 */
	public void setStainConsumableName(String value) {
		setField(STAIN_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "Stain.ConsumableType" field
	 */
	public String getStainConsumableType() {
		return getField(STAIN_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Name<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "Stain.ConsumableType" field
	 */
	public void setStainConsumableType(String value) {
		setField(STAIN_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Stain.CreatedBy" field
	 */
	public String getStainCreatedBy() {
		return getField(STAIN_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Stain.DataRecordName" field
	 */
	public String getStainDataRecordName() {
		return getField(STAIN_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Stain.DateCreated" field
	 */
	public Long getStainDateCreated() {
		return getField(STAIN_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Stain.ExpirationDate" field
	 */
	public Long getStainExpirationDate() {
		return getField(STAIN_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Stain.ExpirationDate" field
	 */
	public void setStainExpirationDate(Long value) {
		setField(STAIN_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Stain.Expired" field
	 */
	public Boolean getStainExpired() {
		return getField(STAIN_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Stain.Expired" field
	 */
	public void setStainExpired(Boolean value) {
		setField(STAIN_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Stain.LotNumber" field
	 */
	public String getStainLotNumber() {
		return getField(STAIN_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Stain.LotNumber" field
	 */
	public void setStainLotNumber(String value) {
		setField(STAIN_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @return the value stored on the "Stain.PartNumber" field
	 */
	public String getStainPartNumber() {
		return getField(STAIN_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @param value The value to set on the "Stain.PartNumber" field
	 */
	public void setStainPartNumber(String value) {
		setField(STAIN_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_PROTOCOL_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Stain.ProtocolNumber" field
	 */
	public String getStainProtocolNumber() {
		return getField(STAIN_PROTOCOL_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_PROTOCOL_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.ProtocolNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Protocol Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Stain.ProtocolNumber" field
	 */
	public void setStainProtocolNumber(String value) {
		setField(STAIN_PROTOCOL_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Stain.RecordId" field
	 */
	public Long getStainRecordId() {
		return getField(STAIN_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Stain.Validated" field
	 */
	public Boolean getStainValidated() {
		return getField(STAIN_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #STAIN_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Stain.Validated" field
	 */
	public void setStainValidated(Boolean value) {
		setField(STAIN_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Stain.VeloxLastModifiedBy" field
	 */
	public String getStainVeloxLastModifiedBy() {
		return getField(STAIN_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STAIN_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Stain.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Stain.VeloxLastModifiedDate" field
	 */
	public Long getStainVeloxLastModifiedDate() {
		return getField(STAIN_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_LOCATION_BARCODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this sample resides.
	 * 
	 * @return the value stored on the "StorageLocationBarcode" field
	 */
	public String getStorageLocationBarcode() {
		return getField(STORAGE_LOCATION_BARCODE);
	}
	
	/**
	 * Sets the value stored on the {@link #STORAGE_LOCATION_BARCODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageLocationBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Barcode<br/>
	 * <br/>
	 * <b>Description</b>: The Storage Unit Identifier where this sample resides.
	 * 
	 * @param value The value to set on the "StorageLocationBarcode" field
	 */
	public void setStorageLocationBarcode(String value) {
		setField(STORAGE_LOCATION_BARCODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STORAGE_UNIT_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StorageUnitPath<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Location Path<br/>
	 * <br/>
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
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
	 * <b>Description</b>: The path from the top-level Storage Unit to the parent of this unit's storage location.
	 * 
	 * @param value The value to set on the "StorageUnitPath" field
	 */
	public void setStorageUnitPath(String value) {
		setField(STORAGE_UNIT_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_CI_95_BOUNDS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.Ci95Bounds" field
	 */
	public Double getStrainCi95Bounds() {
		return getField(STRAIN_CI_95_BOUNDS);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_CI_95_BOUNDS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Ci95Bounds<br/>
	 * <br/>
	 * <b>Display Name</b>: CI 95% Bounds<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.Ci95Bounds" field
	 */
	public void setStrainCi95Bounds(Double value) {
		setField(STRAIN_CI_95_BOUNDS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_CONSUMABLE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @return the value stored on the "Strain.ConsumableName" field
	 */
	public String getStrainConsumableName() {
		return getField(STRAIN_CONSUMABLE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_CONSUMABLE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ConsumableName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of this consumable item.
	 * 
	 * @param value The value to set on the "Strain.ConsumableName" field
	 */
	public void setStrainConsumableName(String value) {
		setField(STRAIN_CONSUMABLE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_CONSUMABLE_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @return the value stored on the "Strain.ConsumableType" field
	 */
	public String getStrainConsumableType() {
		return getField(STRAIN_CONSUMABLE_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_CONSUMABLE_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ConsumableType<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Subtype<br/>
	 * <br/>
	 * <b>Description</b>: The type of this consumable item.
	 * 
	 * @param value The value to set on the "Strain.ConsumableType" field
	 */
	public void setStrainConsumableType(String value) {
		setField(STRAIN_CONSUMABLE_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "Strain.CreatedBy" field
	 */
	public String getStrainCreatedBy() {
		return getField(STRAIN_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "Strain.DataRecordName" field
	 */
	public String getStrainDataRecordName() {
		return getField(STRAIN_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "Strain.DateCreated" field
	 */
	public Long getStrainDateCreated() {
		return getField(STRAIN_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_EXPIRATION_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @return the value stored on the "Strain.ExpirationDate" field
	 */
	public Long getStrainExpirationDate() {
		return getField(STRAIN_EXPIRATION_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_EXPIRATION_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.ExpirationDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expiration Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when this consumable item will expire.
	 * 
	 * @param value The value to set on the "Strain.ExpirationDate" field
	 */
	public void setStrainExpirationDate(Long value) {
		setField(STRAIN_EXPIRATION_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_EXPIRED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.Expired" field
	 */
	public Boolean getStrainExpired() {
		return getField(STRAIN_EXPIRED);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_EXPIRED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Expired<br/>
	 * <br/>
	 * <b>Display Name</b>: Expired<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.Expired" field
	 */
	public void setStrainExpired(Boolean value) {
		setField(STRAIN_EXPIRED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @return the value stored on the "Strain.LotNumber" field
	 */
	public String getStrainLotNumber() {
		return getField(STRAIN_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.LotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: The lot number of this consumable item.
	 * 
	 * @param value The value to set on the "Strain.LotNumber" field
	 */
	public void setStrainLotNumber(String value) {
		setField(STRAIN_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @return the value stored on the "Strain.PartNumber" field
	 */
	public String getStrainPartNumber() {
		return getField(STRAIN_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.PartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Part Number<br/>
	 * <br/>
	 * <b>Description</b>: The part number of this consumable item.
	 * 
	 * @param value The value to set on the "Strain.PartNumber" field
	 */
	public void setStrainPartNumber(String value) {
		setField(STRAIN_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "Strain.RecordId" field
	 */
	public Long getStrainRecordId() {
		return getField(STRAIN_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_SAMPLE_MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.SampleMean" field
	 */
	public Double getStrainSampleMean() {
		return getField(STRAIN_SAMPLE_MEAN);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_SAMPLE_MEAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.SampleMean" field
	 */
	public void setStrainSampleMean(Double value) {
		setField(STRAIN_SAMPLE_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_SAMPLE_NORMALIZED_MEAN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.SampleNormalizedMean" field
	 */
	public Double getStrainSampleNormalizedMean() {
		return getField(STRAIN_SAMPLE_NORMALIZED_MEAN);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_SAMPLE_NORMALIZED_MEAN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleNormalizedMean<br/>
	 * <br/>
	 * <b>Display Name</b>: Normalized Mean<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.SampleNormalizedMean" field
	 */
	public void setStrainSampleNormalizedMean(Double value) {
		setField(STRAIN_SAMPLE_NORMALIZED_MEAN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_SAMPLE_STD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.SampleStd" field
	 */
	public Double getStrainSampleStd() {
		return getField(STRAIN_SAMPLE_STD);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_SAMPLE_STD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.SampleStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Deviation<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.SampleStd" field
	 */
	public void setStrainSampleStd(Double value) {
		setField(STRAIN_SAMPLE_STD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_STANDARD_ERROR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.StandardError" field
	 */
	public Double getStrainStandardError() {
		return getField(STRAIN_STANDARD_ERROR);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_STANDARD_ERROR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.StandardError<br/>
	 * <br/>
	 * <b>Display Name</b>: Standard Error<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.StandardError" field
	 */
	public void setStrainStandardError(Double value) {
		setField(STRAIN_STANDARD_ERROR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_VALIDATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "Strain.Validated" field
	 */
	public Boolean getStrainValidated() {
		return getField(STRAIN_VALIDATED);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_VALIDATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.Validated<br/>
	 * <br/>
	 * <b>Display Name</b>: Validated<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "Strain.Validated" field
	 */
	public void setStrainValidated(Boolean value) {
		setField(STRAIN_VALIDATED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "Strain.VeloxLastModifiedBy" field
	 */
	public String getStrainVeloxLastModifiedBy() {
		return getField(STRAIN_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Strain.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "Strain.VeloxLastModifiedDate" field
	 */
	public Long getStrainVeloxLastModifiedDate() {
		return getField(STRAIN_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "StrainDetails.CreatedBy" field
	 */
	public String getStrainDetailsCreatedBy() {
		return getField(STRAIN_DETAILS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "StrainDetails.DataRecordName" field
	 */
	public String getStrainDetailsDataRecordName() {
		return getField(STRAIN_DETAILS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "StrainDetails.DateCreated" field
	 */
	public Long getStrainDetailsDateCreated() {
		return getField(STRAIN_DETAILS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_PLASMID_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.PlasmidLotNumber" field
	 */
	public String getStrainDetailsPlasmidLotNumber() {
		return getField(STRAIN_DETAILS_PLASMID_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_PLASMID_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.PlasmidLotNumber" field
	 */
	public void setStrainDetailsPlasmidLotNumber(String value) {
		setField(STRAIN_DETAILS_PLASMID_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_PLASMID_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.PlasmidName" field
	 */
	public String getStrainDetailsPlasmidName() {
		return getField(STRAIN_DETAILS_PLASMID_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_PLASMID_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidName<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.PlasmidName" field
	 */
	public void setStrainDetailsPlasmidName(String value) {
		setField(STRAIN_DETAILS_PLASMID_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_PLASMID_SEQUENCE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidSequence<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Sequence<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.PlasmidSequence" field
	 */
	public String getStrainDetailsPlasmidSequence() {
		return getField(STRAIN_DETAILS_PLASMID_SEQUENCE);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_PLASMID_SEQUENCE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.PlasmidSequence<br/>
	 * <br/>
	 * <b>Display Name</b>: Plasmid Sequence<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.PlasmidSequence" field
	 */
	public void setStrainDetailsPlasmidSequence(String value) {
		setField(STRAIN_DETAILS_PLASMID_SEQUENCE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "StrainDetails.RecordId" field
	 */
	public Long getStrainDetailsRecordId() {
		return getField(STRAIN_DETAILS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_STRAIN_LOT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.StrainLotNumber" field
	 */
	public String getStrainDetailsStrainLotNumber() {
		return getField(STRAIN_DETAILS_STRAIN_LOT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_STRAIN_LOT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainLotNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Lot Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.StrainLotNumber" field
	 */
	public void setStrainDetailsStrainLotNumber(String value) {
		setField(STRAIN_DETAILS_STRAIN_LOT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_STRAIN_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.StrainName" field
	 */
	public String getStrainDetailsStrainName() {
		return getField(STRAIN_DETAILS_STRAIN_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_STRAIN_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainName<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.StrainName" field
	 */
	public void setStrainDetailsStrainName(String value) {
		setField(STRAIN_DETAILS_STRAIN_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_STRAIN_PART_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainPartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Part Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainDetails.StrainPartNumber" field
	 */
	public String getStrainDetailsStrainPartNumber() {
		return getField(STRAIN_DETAILS_STRAIN_PART_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_DETAILS_STRAIN_PART_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.StrainPartNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Part Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainDetails.StrainPartNumber" field
	 */
	public void setStrainDetailsStrainPartNumber(String value) {
		setField(STRAIN_DETAILS_STRAIN_PART_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "StrainDetails.VeloxLastModifiedBy" field
	 */
	public String getStrainDetailsVeloxLastModifiedBy() {
		return getField(STRAIN_DETAILS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_DETAILS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainDetails.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "StrainDetails.VeloxLastModifiedDate" field
	 */
	public Long getStrainDetailsVeloxLastModifiedDate() {
		return getField(STRAIN_DETAILS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STRAIN_HIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainHit<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Hit?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StrainHit" field
	 */
	public Boolean getStrainHit() {
		return getField(STRAIN_HIT);
	}
	
	/**
	 * Sets the value stored on the {@link #STRAIN_HIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StrainHit<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain Hit?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StrainHit" field
	 */
	public void setStrainHit(Boolean value) {
		setField(STRAIN_HIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SAMPLING_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySamplingId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Sampling ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySamplingId" field
	 */
	public String getStudySamplingId() {
		return getField(STUDY_SAMPLING_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SAMPLING_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySamplingId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Sampling ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySamplingId" field
	 */
	public void setStudySamplingId(String value) {
		setField(STUDY_SAMPLING_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySubject" field
	 */
	public Long getStudySubject() {
		return getField(STUDY_SUBJECT);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubject<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySubject" field
	 */
	public void setStudySubject(Long value) {
		setField(STUDY_SUBJECT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TAT_PROGRESS_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TatProgressStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT Progress Status<br/>
	 * <br/>
	 * <b>Description</b>: The progress of a sample in terms of Turn Around Time in assigned process
	 * 
	 * @return the value stored on the "TatProgressStatus" field
	 */
	public String getTatProgressStatus() {
		return getField(TAT_PROGRESS_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #TAT_PROGRESS_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TatProgressStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT Progress Status<br/>
	 * <br/>
	 * <b>Description</b>: The progress of a sample in terms of Turn Around Time in assigned process
	 * 
	 * @param value The value to set on the "TatProgressStatus" field
	 */
	public void setTatProgressStatus(String value) {
		setField(TAT_PROGRESS_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TIME_POINT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TimePoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Point (hr)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "TimePoint" field
	 */
	public Double getTimePoint() {
		return getField(TIME_POINT);
	}
	
	/**
	 * Sets the value stored on the {@link #TIME_POINT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TimePoint<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Point (hr)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "TimePoint" field
	 */
	public void setTimePoint(Double value) {
		setField(TIME_POINT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TOTAL_MASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass is automatically computed by the system from the Concentration and Volume when both are specified. The units for the Concentration are derived from Concentration Units, while the units for Volume are assumed to be ul.
	 * 
	 * @return the value stored on the "TotalMass" field
	 */
	public Double getTotalMass() {
		return getField(TOTAL_MASS);
	}
	
	/**
	 * Sets the value stored on the {@link #TOTAL_MASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalMass<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Mass<br/>
	 * <br/>
	 * <b>Description</b>: The mass is automatically computed by the system from the Concentration and Volume when both are specified. The units for the Concentration are derived from Concentration Units, while the units for Volume are assumed to be ul.
	 * 
	 * @param value The value to set on the "TotalMass" field
	 */
	public void setTotalMass(Double value) {
		setField(TOTAL_MASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TUBE_BARCODE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TubeBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Tube Barcode<br/>
	 * <br/>
	 * <b>Description</b>: A field for holding a barcode value that can be used as an identifier to match on for scanning interfaces or other purposes by plugins.
	 * 
	 * @return the value stored on the "TubeBarcode" field
	 */
	public String getTubeBarcode() {
		return getField(TUBE_BARCODE);
	}
	
	/**
	 * Sets the value stored on the {@link #TUBE_BARCODE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TubeBarcode<br/>
	 * <br/>
	 * <b>Display Name</b>: Tube Barcode<br/>
	 * <br/>
	 * <b>Description</b>: A field for holding a barcode value that can be used as an identifier to match on for scanning interfaces or other purposes by plugins.
	 * 
	 * @param value The value to set on the "TubeBarcode" field
	 */
	public void setTubeBarcode(String value) {
		setField(TUBE_BARCODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ULTIMA_POOL_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UltimaPoolCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Ultima Pool Created?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "UltimaPoolCreated" field
	 */
	public Boolean getUltimaPoolCreated() {
		return getField(ULTIMA_POOL_CREATED);
	}
	
	/**
	 * Sets the value stored on the {@link #ULTIMA_POOL_CREATED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: UltimaPoolCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Ultima Pool Created?<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "UltimaPoolCreated" field
	 */
	public void setUltimaPoolCreated(Boolean value) {
		setField(ULTIMA_POOL_CREATED, value);
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
	 * Retrieves the value stored on the {@link #VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Volume<br/>
	 * <br/>
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Volume can specified in whatever units is desirable. The default assumed by most built-in functionality is microliters once a Concentration value appears on the sample. Prior to that the volume could represent units of any quantity metric desired.
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
	 * <b>Display Name</b>: Quantity<br/>
	 * <br/>
	 * <b>Description</b>: Volume can specified in whatever units is desirable. The default assumed by most built-in functionality is microliters once a Concentration value appears on the sample. Prior to that the volume could represent units of any quantity metric desired.
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
	 * <b>Display Name</b>: Quantity Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Volume.
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
	 * <b>Display Name</b>: Quantity Units<br/>
	 * <br/>
	 * <b>Description</b>: Unit of measure for the Volume.
	 * 
	 * @param value The value to set on the "VolumeUnits" field
	 */
	public void setVolumeUnits(String value) {
		setField(VOLUME_UNITS, value);
	}
}