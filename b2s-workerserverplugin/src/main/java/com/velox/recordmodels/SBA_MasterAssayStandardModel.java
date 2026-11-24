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
 * Automatically generated class for: Standard
 */
@ExemplarDataTypeModel(dataTypeName="SBA_MasterAssayStandard")
public class SBA_MasterAssayStandardModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_MasterAssayStandard";

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
	 * <b>Data Field Name</b>: SBA_CVPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: CV Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CVPERCENT_LIMIT = "SBA_CVPercentLimit";

	/**
	 * <b>Data Field Name</b>: SBA_ControlRanking<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Ranking<br/>
	 * <br/>
	 * <b>Description</b>: A numeric value used to determine a sort order for the controls.  If this field is set then runs of the assay will fail if the instrument signal results for these controls are not in the same order as these rankings.  For example, if an LPC is ranked 1, an MPC is ranked 2, and a HPC is ranked 3, then when the instrument signal results are returned for those controls sorting them should maintain the same order where LPC is the smallest value, MPC is the middle value, and HPC is the highest value among the controls.
	 */
	public static final String SBA___CONTROL_RANKING = "SBA_ControlRanking";

	/**
	 * <b>Data Field Name</b>: SBA_ControlType<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CONTROL_TYPE = "SBA_ControlType";

	/**
	 * <b>Data Field Name</b>: SBA_DilutionFactor<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___DILUTION_FACTOR = "SBA_DilutionFactor";

	/**
	 * <b>Data Field Name</b>: SBA_FlagPctDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias %<br/>
	 * <br/>
	 * <b>Description</b>: This value will be used when validating the bias% of values read from the instrument.  This value will be used when a percentage is not specified for the analyte.
	 */
	public static final String SBA___FLAG_PCT_DIFF = "SBA_FlagPctDiff";

	/**
	 * <b>Data Field Name</b>: SBA_NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Planned # of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___NUMBER_OF_REPLICATES = "SBA_NumberOfReplicates";

	/**
	 * <b>Data Field Name</b>: SBA_StandardName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___STANDARD_NAME = "SBA_StandardName";

	/**
	 * <b>Data Field Name</b>: SBA_WellPositions<br/>
	 * <br/>
	 * <b>Display Name</b>: Well Positions<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___WELL_POSITIONS = "SBA_WellPositions";

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

	protected SBA_MasterAssayStandardModel(RecordModel backingModel) {
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
	 * Retrieves the value stored on the {@link #SBA___CVPERCENT_LIMIT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: CV Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CVPercentLimit" field
	 */
	public Double getSBA_CVPercentLimit() {
		return getField(SBA___CVPERCENT_LIMIT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CVPERCENT_LIMIT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CVPercentLimit<br/>
	 * <br/>
	 * <b>Display Name</b>: CV Percent Limit<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CVPercentLimit" field
	 */
	public void setSBA_CVPercentLimit(Double value) {
		setField(SBA___CVPERCENT_LIMIT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CONTROL_RANKING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlRanking<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Ranking<br/>
	 * <br/>
	 * <b>Description</b>: A numeric value used to determine a sort order for the controls.  If this field is set then runs of the assay will fail if the instrument signal results for these controls are not in the same order as these rankings.  For example, if an LPC is ranked 1, an MPC is ranked 2, and a HPC is ranked 3, then when the instrument signal results are returned for those controls sorting them should maintain the same order where LPC is the smallest value, MPC is the middle value, and HPC is the highest value among the controls.
	 * 
	 * @return the value stored on the "SBA_ControlRanking" field
	 */
	public Integer getSBA_ControlRanking() {
		return getField(SBA___CONTROL_RANKING);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CONTROL_RANKING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ControlRanking<br/>
	 * <br/>
	 * <b>Display Name</b>: Control Ranking<br/>
	 * <br/>
	 * <b>Description</b>: A numeric value used to determine a sort order for the controls.  If this field is set then runs of the assay will fail if the instrument signal results for these controls are not in the same order as these rankings.  For example, if an LPC is ranked 1, an MPC is ranked 2, and a HPC is ranked 3, then when the instrument signal results are returned for those controls sorting them should maintain the same order where LPC is the smallest value, MPC is the middle value, and HPC is the highest value among the controls.
	 * 
	 * @param value The value to set on the "SBA_ControlRanking" field
	 */
	public void setSBA_ControlRanking(Integer value) {
		setField(SBA___CONTROL_RANKING, value);
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
	 * Retrieves the value stored on the {@link #SBA___DILUTION_FACTOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_DilutionFactor<br/>
	 * <br/>
	 * <b>Display Name</b>: Dilution Factor<br/>
	 * <br/>
	 * <b>Description</b>: No Description
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
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_DilutionFactor" field
	 */
	public void setSBA_DilutionFactor(Double value) {
		setField(SBA___DILUTION_FACTOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___FLAG_PCT_DIFF} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FlagPctDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias %<br/>
	 * <br/>
	 * <b>Description</b>: This value will be used when validating the bias% of values read from the instrument.  This value will be used when a percentage is not specified for the analyte.
	 * 
	 * @return the value stored on the "SBA_FlagPctDiff" field
	 */
	public Double getSBA_FlagPctDiff() {
		return getField(SBA___FLAG_PCT_DIFF);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___FLAG_PCT_DIFF} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FlagPctDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max Bias %<br/>
	 * <br/>
	 * <b>Description</b>: This value will be used when validating the bias% of values read from the instrument.  This value will be used when a percentage is not specified for the analyte.
	 * 
	 * @param value The value to set on the "SBA_FlagPctDiff" field
	 */
	public void setSBA_FlagPctDiff(Double value) {
		setField(SBA___FLAG_PCT_DIFF, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___NUMBER_OF_REPLICATES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Planned # of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_NumberOfReplicates" field
	 */
	public Integer getSBA_NumberOfReplicates() {
		return getField(SBA___NUMBER_OF_REPLICATES);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___NUMBER_OF_REPLICATES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_NumberOfReplicates<br/>
	 * <br/>
	 * <b>Display Name</b>: Planned # of Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_NumberOfReplicates" field
	 */
	public void setSBA_NumberOfReplicates(Integer value) {
		setField(SBA___NUMBER_OF_REPLICATES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___STANDARD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_StandardName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_StandardName" field
	 */
	public String getSBA_StandardName() {
		return getField(SBA___STANDARD_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___STANDARD_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_StandardName<br/>
	 * <br/>
	 * <b>Display Name</b>: Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_StandardName" field
	 */
	public void setSBA_StandardName(String value) {
		setField(SBA___STANDARD_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___WELL_POSITIONS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_WellPositions<br/>
	 * <br/>
	 * <b>Display Name</b>: Well Positions<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_WellPositions" field
	 */
	public String getSBA_WellPositions() {
		return getField(SBA___WELL_POSITIONS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___WELL_POSITIONS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_WellPositions<br/>
	 * <br/>
	 * <b>Display Name</b>: Well Positions<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_WellPositions" field
	 */
	public void setSBA_WellPositions(String value) {
		setField(SBA___WELL_POSITIONS, value);
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