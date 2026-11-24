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
 * Automatically generated class for: PK Report
 */
@ExemplarDataTypeModel(dataTypeName="C_PKReport")
public class C_PKReportModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "C_PKReport";

	/**
	 * <b>Data Field Name</b>: C_Assay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___ASSAY = "C_Assay";

	/**
	 * <b>Data Field Name</b>: C_ManagementSignatory<br/>
	 * <br/>
	 * <b>Display Name</b>: Management Signatory<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___MANAGEMENT_SIGNATORY = "C_ManagementSignatory";

	/**
	 * <b>Data Field Name</b>: C_ReportDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REPORT_DATE = "C_ReportDate";

	/**
	 * <b>Data Field Name</b>: C_ReportNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REPORT_NUMBER = "C_ReportNumber";

	/**
	 * <b>Data Field Name</b>: C_ReportVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Version<br/>
	 * <br/>
	 * <b>Description</b>: An indicator of what version of report this is. Each combination of Study+Assay under a single report gets its own versions.
	 */
	public static final String C___REPORT_VERSION = "C_ReportVersion";

	/**
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STATUS = "C_Status";

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
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 */
	public static final String FILE_PATH = "FilePath";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 */
	public static final String VELOX_CHECK_OUT_USER = "VeloxCheckOutUser";

	/**
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 */
	public static final String VELOX_CURRENT_VERSION = "VeloxCurrentVersion";

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

	protected C_PKReportModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___ASSAY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Assay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Assay" field
	 */
	public Long getC_Assay() {
		return getField(C___ASSAY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___ASSAY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Assay<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Assay" field
	 */
	public void setC_Assay(Long value) {
		setField(C___ASSAY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___MANAGEMENT_SIGNATORY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ManagementSignatory<br/>
	 * <br/>
	 * <b>Display Name</b>: Management Signatory<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ManagementSignatory" field
	 */
	public String getC_ManagementSignatory() {
		return getField(C___MANAGEMENT_SIGNATORY);
	}
	
	/**
	 * Sets the value stored on the {@link #C___MANAGEMENT_SIGNATORY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ManagementSignatory<br/>
	 * <br/>
	 * <b>Display Name</b>: Management Signatory<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ManagementSignatory" field
	 */
	public void setC_ManagementSignatory(String value) {
		setField(C___MANAGEMENT_SIGNATORY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REPORT_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReportDate" field
	 */
	public Long getC_ReportDate() {
		return getField(C___REPORT_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REPORT_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReportDate" field
	 */
	public void setC_ReportDate(Long value) {
		setField(C___REPORT_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REPORT_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ReportNumber" field
	 */
	public String getC_ReportNumber() {
		return getField(C___REPORT_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REPORT_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Report Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ReportNumber" field
	 */
	public void setC_ReportNumber(String value) {
		setField(C___REPORT_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REPORT_VERSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Version<br/>
	 * <br/>
	 * <b>Description</b>: An indicator of what version of report this is. Each combination of Study+Assay under a single report gets its own versions.
	 * 
	 * @return the value stored on the "C_ReportVersion" field
	 */
	public Integer getC_ReportVersion() {
		return getField(C___REPORT_VERSION);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REPORT_VERSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ReportVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Version<br/>
	 * <br/>
	 * <b>Description</b>: An indicator of what version of report this is. Each combination of Study+Assay under a single report gets its own versions.
	 * 
	 * @param value The value to set on the "C_ReportVersion" field
	 */
	public void setC_ReportVersion(Integer value) {
		setField(C___REPORT_VERSION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Status" field
	 */
	public String getC_Status() {
		return getField(C___STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Status" field
	 */
	public void setC_Status(String value) {
		setField(C___STATUS, value);
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
	 * Retrieves the value stored on the {@link #FILE_PATH} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @return the value stored on the "FilePath" field
	 */
	public String getFilePath() {
		return getField(FILE_PATH);
	}
	
	/**
	 * Sets the value stored on the {@link #FILE_PATH} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FilePath<br/>
	 * <br/>
	 * <b>Display Name</b>: File Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the file attachment.
	 * 
	 * @param value The value to set on the "FilePath" field
	 */
	public void setFilePath(String value) {
		setField(FILE_PATH, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_CHECK_OUT_USER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @return the value stored on the "VeloxCheckOutUser" field
	 */
	public String getVeloxCheckOutUser() {
		return getField(VELOX_CHECK_OUT_USER);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_CHECK_OUT_USER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCheckOutUser<br/>
	 * <br/>
	 * <b>Display Name</b>: Check-Out User<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who currently has this record checked-out.
	 * 
	 * @param value The value to set on the "VeloxCheckOutUser" field
	 */
	public void setVeloxCheckOutUser(String value) {
		setField(VELOX_CHECK_OUT_USER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_CURRENT_VERSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @return the value stored on the "VeloxCurrentVersion" field
	 */
	public Integer getVeloxCurrentVersion() {
		return getField(VELOX_CURRENT_VERSION);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_CURRENT_VERSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCurrentVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Current Version<br/>
	 * <br/>
	 * <b>Description</b>: The current version of the attachment data.
	 * 
	 * @param value The value to set on the "VeloxCurrentVersion" field
	 */
	public void setVeloxCurrentVersion(Integer value) {
		setField(VELOX_CURRENT_VERSION, value);
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