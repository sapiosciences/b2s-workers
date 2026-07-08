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
 * Automatically generated class for: Fraction
 */
@ExemplarDataTypeModel(dataTypeName="C_Fraction")
public class C_FractionModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_Fraction";

	/**
	 * <b>Data Field Name</b>: C_CriticalReagentSampl<br/>
	 * <br/>
	 * <b>Display Name</b>: Critical Reagent Sample<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___CRITICAL_REAGENT_SAMPL = "C_CriticalReagentSampl";

	/**
	 * <b>Data Field Name</b>: C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___FINAL_FRACTIONM_L = "C_FinalFractionmL";

	/**
	 * <b>Data Field Name</b>: C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___INITIAL_FRACTIONM_L = "C_InitialFractionmL";

	/**
	 * <b>Data Field Name</b>: C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___RUN_NUMBER = "C_RunNumber";

	/**
	 * <b>Data Field Name</b>: C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SELECTED_FOR_INTERMEDI = "C_SelectedForIntermedi";

	/**
	 * <b>Data Field Name</b>: C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STEP = "C_Step";

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

	protected C_FractionModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___CRITICAL_REAGENT_SAMPL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CriticalReagentSampl<br/>
	 * <br/>
	 * <b>Display Name</b>: Critical Reagent Sample<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_CriticalReagentSampl" field
	 */
	public String getC_CriticalReagentSampl() {
		return getField(C___CRITICAL_REAGENT_SAMPL);
	}
	
	/**
	 * Sets the value stored on the {@link #C___CRITICAL_REAGENT_SAMPL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_CriticalReagentSampl<br/>
	 * <br/>
	 * <b>Display Name</b>: Critical Reagent Sample<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_CriticalReagentSampl" field
	 */
	public void setC_CriticalReagentSampl(String value) {
		setField(C___CRITICAL_REAGENT_SAMPL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___FINAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_FinalFractionmL" field
	 */
	public Double getC_FinalFractionmL() {
		return getField(C___FINAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #C___FINAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_FinalFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Final Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_FinalFractionmL" field
	 */
	public void setC_FinalFractionmL(Double value) {
		setField(C___FINAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___INITIAL_FRACTIONM_L} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_InitialFractionmL" field
	 */
	public Double getC_InitialFractionmL() {
		return getField(C___INITIAL_FRACTIONM_L);
	}
	
	/**
	 * Sets the value stored on the {@link #C___INITIAL_FRACTIONM_L} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_InitialFractionmL<br/>
	 * <br/>
	 * <b>Display Name</b>: Initial Fraction (mL)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_InitialFractionmL" field
	 */
	public void setC_InitialFractionmL(Double value) {
		setField(C___INITIAL_FRACTIONM_L, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___RUN_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_RunNumber" field
	 */
	public Double getC_RunNumber() {
		return getField(C___RUN_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___RUN_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RunNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_RunNumber" field
	 */
	public void setC_RunNumber(Double value) {
		setField(C___RUN_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SELECTED_FOR_INTERMEDI} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SelectedForIntermedi" field
	 */
	public Boolean getC_SelectedForIntermedi() {
		return getField(C___SELECTED_FOR_INTERMEDI);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SELECTED_FOR_INTERMEDI} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SelectedForIntermedi<br/>
	 * <br/>
	 * <b>Display Name</b>: Selected For Intermediate Pooling<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SelectedForIntermedi" field
	 */
	public void setC_SelectedForIntermedi(Boolean value) {
		setField(C___SELECTED_FOR_INTERMEDI, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STEP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Step" field
	 */
	public String getC_Step() {
		return getField(C___STEP);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STEP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Step<br/>
	 * <br/>
	 * <b>Display Name</b>: Step<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Step" field
	 */
	public void setC_Step(String value) {
		setField(C___STEP, value);
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