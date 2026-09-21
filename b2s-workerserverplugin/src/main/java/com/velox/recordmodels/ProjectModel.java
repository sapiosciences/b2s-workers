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
 * Automatically generated class for: Project
 */
@ExemplarDataTypeModel(dataTypeName="Project")
public class ProjectModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "Project";

	/**
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client Name
	 */
	public static final String C___SPONSOR = "C_Sponsor";

	/**
	 * <b>Data Field Name</b>: C_SponsorID<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor ID<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client ID
	 */
	public static final String C___SPONSOR_ID = "C_SponsorID";

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
	 * <b>Data Field Name</b>: DefaultReplicateQc<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of QC Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DEFAULT_REPLICATE_QC = "DefaultReplicateQc";

	/**
	 * <b>Data Field Name</b>: DefaultReplicateStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of STD Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String DEFAULT_REPLICATE_STD = "DefaultReplicateStd";

	/**
	 * <b>Data Field Name</b>: EndDate<br/>
	 * <br/>
	 * <b>Display Name</b>: End Date<br/>
	 * <br/>
	 * <b>Description</b>: Idicates the date the project was finshed or target finish date.
	 */
	public static final String END_DATE = "EndDate";

	/**
	 * <b>Data Field Name</b>: InheritRolesFromParent<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Parent<br/>
	 * <br/>
	 * <b>Description</b>: Whether this record should inherit possible ELN roles from its parent.
	 */
	public static final String INHERIT_ROLES_FROM_PARENT = "InheritRolesFromParent";

	/**
	 * <b>Data Field Name</b>: LeadEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Lead Email<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LEAD_EMAIL = "LeadEmail";

	/**
	 * <b>Data Field Name</b>: Leader<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Leader<br/>
	 * <br/>
	 * <b>Description</b>: This is a descriptive field for indicating a leader if one applies to the project.
	 */
	public static final String LEADER = "Leader";

	/**
	 * <b>Data Field Name</b>: PrecisionOfConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PRECISION_OF_CONCENTRATION = "PrecisionOfConcentration";

	/**
	 * <b>Data Field Name</b>: PrecisionOfCv<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String PRECISION_OF_CV = "PrecisionOfCv";

	/**
	 * <b>Data Field Name</b>: ProjectDesc<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Description<br/>
	 * <br/>
	 * <b>Description</b>: A long description of the project.
	 */
	public static final String PROJECT_DESC = "ProjectDesc";

	/**
	 * <b>Data Field Name</b>: ProjectId<br/>
	 * <br/>
	 * <b>Display Name</b>: Project ID<br/>
	 * <br/>
	 * <b>Description</b>: The project ID is a unique identifier for the project. This will be used to relate Requests and is used as an identifier when viewing records.
	 */
	public static final String PROJECT_ID = "ProjectId";

	/**
	 * <b>Data Field Name</b>: ProjectName<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Name<br/>
	 * <br/>
	 * <b>Description</b>: The project name is a free text description of the project. It will be used as an identifier whenever the record is displayed to give a more meaningful context to the name.
	 */
	public static final String PROJECT_NAME = "ProjectName";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: SDMSSubdirectory<br/>
	 * <br/>
	 * <b>Display Name</b>: SDMS Folder<br/>
	 * <br/>
	 * <b>Description</b>: The subfolder used for SDMS files
	 */
	public static final String SDMSSUBDIRECTORY = "SDMSSubdirectory";

	/**
	 * <b>Data Field Name</b>: StartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Start Date<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the date the project was started or is projected to be started.
	 */
	public static final String START_DATE = "StartDate";

	/**
	 * <b>Data Field Name</b>: SubjectIdPrefix<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Prefix<br/>
	 * <br/>
	 * <b>Description</b>: A field indicating the prefix that will be used in Study Subject ID.
	 */
	public static final String SUBJECT_ID_PREFIX = "SubjectIdPrefix";

	/**
	 * <b>Data Field Name</b>: SubjectIdSequenceDigits<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Seq Digits<br/>
	 * <br/>
	 * <b>Description</b>: The number of digits used in subject ID sequence.
	 */
	public static final String SUBJECT_ID_SEQUENCE_DIGITS = "SubjectIdSequenceDigits";

	/**
	 * <b>Data Field Name</b>: VeloxApprover<br/>
	 * <br/>
	 * <b>Display Name</b>: Document Approver<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String VELOX_APPROVER = "VeloxApprover";

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
	 * <b>Data Field Name</b>: isClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String IS_CLINICAL = "isClinical";

	protected ProjectModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SPONSOR} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client Name
	 * 
	 * @return the value stored on the "C_Sponsor" field
	 */
	public String getC_Sponsor() {
		return getField(C___SPONSOR);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SPONSOR} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Sponsor<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client Name
	 * 
	 * @param value The value to set on the "C_Sponsor" field
	 */
	public void setC_Sponsor(String value) {
		setField(C___SPONSOR, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SPONSOR_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorID<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor ID<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client ID
	 * 
	 * @return the value stored on the "C_SponsorID" field
	 */
	public String getC_SponsorID() {
		return getField(C___SPONSOR_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SPONSOR_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SponsorID<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor ID<br/>
	 * <br/>
	 * <b>Description</b>: B2S Client ID
	 * 
	 * @param value The value to set on the "C_SponsorID" field
	 */
	public void setC_SponsorID(String value) {
		setField(C___SPONSOR_ID, value);
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
	 * Retrieves the value stored on the {@link #DEFAULT_REPLICATE_QC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DefaultReplicateQc<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of QC Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DefaultReplicateQc" field
	 */
	public Integer getDefaultReplicateQc() {
		return getField(DEFAULT_REPLICATE_QC);
	}
	
	/**
	 * Sets the value stored on the {@link #DEFAULT_REPLICATE_QC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DefaultReplicateQc<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of QC Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DefaultReplicateQc" field
	 */
	public void setDefaultReplicateQc(Integer value) {
		setField(DEFAULT_REPLICATE_QC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DEFAULT_REPLICATE_STD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DefaultReplicateStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of STD Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "DefaultReplicateStd" field
	 */
	public Integer getDefaultReplicateStd() {
		return getField(DEFAULT_REPLICATE_STD);
	}
	
	/**
	 * Sets the value stored on the {@link #DEFAULT_REPLICATE_STD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DefaultReplicateStd<br/>
	 * <br/>
	 * <b>Display Name</b>: Default # of STD Replicates<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "DefaultReplicateStd" field
	 */
	public void setDefaultReplicateStd(Integer value) {
		setField(DEFAULT_REPLICATE_STD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #END_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EndDate<br/>
	 * <br/>
	 * <b>Display Name</b>: End Date<br/>
	 * <br/>
	 * <b>Description</b>: Idicates the date the project was finshed or target finish date.
	 * 
	 * @return the value stored on the "EndDate" field
	 */
	public Long getEndDate() {
		return getField(END_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #END_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EndDate<br/>
	 * <br/>
	 * <b>Display Name</b>: End Date<br/>
	 * <br/>
	 * <b>Description</b>: Idicates the date the project was finshed or target finish date.
	 * 
	 * @param value The value to set on the "EndDate" field
	 */
	public void setEndDate(Long value) {
		setField(END_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #INHERIT_ROLES_FROM_PARENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InheritRolesFromParent<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Parent<br/>
	 * <br/>
	 * <b>Description</b>: Whether this record should inherit possible ELN roles from its parent.
	 * 
	 * @return the value stored on the "InheritRolesFromParent" field
	 */
	public Boolean getInheritRolesFromParent() {
		return getField(INHERIT_ROLES_FROM_PARENT);
	}
	
	/**
	 * Sets the value stored on the {@link #INHERIT_ROLES_FROM_PARENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InheritRolesFromParent<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Parent<br/>
	 * <br/>
	 * <b>Description</b>: Whether this record should inherit possible ELN roles from its parent.
	 * 
	 * @param value The value to set on the "InheritRolesFromParent" field
	 */
	public void setInheritRolesFromParent(Boolean value) {
		setField(INHERIT_ROLES_FROM_PARENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LEAD_EMAIL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LeadEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Lead Email<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LeadEmail" field
	 */
	public String getLeadEmail() {
		return getField(LEAD_EMAIL);
	}
	
	/**
	 * Sets the value stored on the {@link #LEAD_EMAIL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LeadEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Lead Email<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LeadEmail" field
	 */
	public void setLeadEmail(String value) {
		setField(LEAD_EMAIL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LEADER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Leader<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Leader<br/>
	 * <br/>
	 * <b>Description</b>: This is a descriptive field for indicating a leader if one applies to the project.
	 * 
	 * @return the value stored on the "Leader" field
	 */
	public String getLeader() {
		return getField(LEADER);
	}
	
	/**
	 * Sets the value stored on the {@link #LEADER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Leader<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Leader<br/>
	 * <br/>
	 * <b>Description</b>: This is a descriptive field for indicating a leader if one applies to the project.
	 * 
	 * @param value The value to set on the "Leader" field
	 */
	public void setLeader(String value) {
		setField(LEADER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PRECISION_OF_CONCENTRATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PrecisionOfConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "PrecisionOfConcentration" field
	 */
	public Integer getPrecisionOfConcentration() {
		return getField(PRECISION_OF_CONCENTRATION);
	}
	
	/**
	 * Sets the value stored on the {@link #PRECISION_OF_CONCENTRATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PrecisionOfConcentration<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of Concentration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "PrecisionOfConcentration" field
	 */
	public void setPrecisionOfConcentration(Integer value) {
		setField(PRECISION_OF_CONCENTRATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PRECISION_OF_CV} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PrecisionOfCv<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "PrecisionOfCv" field
	 */
	public Integer getPrecisionOfCv() {
		return getField(PRECISION_OF_CV);
	}
	
	/**
	 * Sets the value stored on the {@link #PRECISION_OF_CV} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PrecisionOfCv<br/>
	 * <br/>
	 * <b>Display Name</b>: Precision # of % CV<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "PrecisionOfCv" field
	 */
	public void setPrecisionOfCv(Integer value) {
		setField(PRECISION_OF_CV, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROJECT_DESC} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectDesc<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Description<br/>
	 * <br/>
	 * <b>Description</b>: A long description of the project.
	 * 
	 * @return the value stored on the "ProjectDesc" field
	 */
	public String getProjectDesc() {
		return getField(PROJECT_DESC);
	}
	
	/**
	 * Sets the value stored on the {@link #PROJECT_DESC} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectDesc<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Description<br/>
	 * <br/>
	 * <b>Description</b>: A long description of the project.
	 * 
	 * @param value The value to set on the "ProjectDesc" field
	 */
	public void setProjectDesc(String value) {
		setField(PROJECT_DESC, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROJECT_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectId<br/>
	 * <br/>
	 * <b>Display Name</b>: Project ID<br/>
	 * <br/>
	 * <b>Description</b>: The project ID is a unique identifier for the project. This will be used to relate Requests and is used as an identifier when viewing records.
	 * 
	 * @return the value stored on the "ProjectId" field
	 */
	public String getProjectId() {
		return getField(PROJECT_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #PROJECT_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectId<br/>
	 * <br/>
	 * <b>Display Name</b>: Project ID<br/>
	 * <br/>
	 * <b>Description</b>: The project ID is a unique identifier for the project. This will be used to relate Requests and is used as an identifier when viewing records.
	 * 
	 * @param value The value to set on the "ProjectId" field
	 */
	public void setProjectId(String value) {
		setField(PROJECT_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PROJECT_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectName<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Name<br/>
	 * <br/>
	 * <b>Description</b>: The project name is a free text description of the project. It will be used as an identifier whenever the record is displayed to give a more meaningful context to the name.
	 * 
	 * @return the value stored on the "ProjectName" field
	 */
	public String getProjectName() {
		return getField(PROJECT_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #PROJECT_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ProjectName<br/>
	 * <br/>
	 * <b>Display Name</b>: Project Name<br/>
	 * <br/>
	 * <b>Description</b>: The project name is a free text description of the project. It will be used as an identifier whenever the record is displayed to give a more meaningful context to the name.
	 * 
	 * @param value The value to set on the "ProjectName" field
	 */
	public void setProjectName(String value) {
		setField(PROJECT_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SDMSSUBDIRECTORY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SDMSSubdirectory<br/>
	 * <br/>
	 * <b>Display Name</b>: SDMS Folder<br/>
	 * <br/>
	 * <b>Description</b>: The subfolder used for SDMS files
	 * 
	 * @return the value stored on the "SDMSSubdirectory" field
	 */
	public String getSDMSSubdirectory() {
		return getField(SDMSSUBDIRECTORY);
	}
	
	/**
	 * Sets the value stored on the {@link #SDMSSUBDIRECTORY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SDMSSubdirectory<br/>
	 * <br/>
	 * <b>Display Name</b>: SDMS Folder<br/>
	 * <br/>
	 * <b>Description</b>: The subfolder used for SDMS files
	 * 
	 * @param value The value to set on the "SDMSSubdirectory" field
	 */
	public void setSDMSSubdirectory(String value) {
		setField(SDMSSUBDIRECTORY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #START_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Start Date<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the date the project was started or is projected to be started.
	 * 
	 * @return the value stored on the "StartDate" field
	 */
	public Long getStartDate() {
		return getField(START_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #START_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Start Date<br/>
	 * <br/>
	 * <b>Description</b>: Indicates the date the project was started or is projected to be started.
	 * 
	 * @param value The value to set on the "StartDate" field
	 */
	public void setStartDate(Long value) {
		setField(START_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SUBJECT_ID_PREFIX} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectIdPrefix<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Prefix<br/>
	 * <br/>
	 * <b>Description</b>: A field indicating the prefix that will be used in Study Subject ID.
	 * 
	 * @return the value stored on the "SubjectIdPrefix" field
	 */
	public String getSubjectIdPrefix() {
		return getField(SUBJECT_ID_PREFIX);
	}
	
	/**
	 * Sets the value stored on the {@link #SUBJECT_ID_PREFIX} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectIdPrefix<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Prefix<br/>
	 * <br/>
	 * <b>Description</b>: A field indicating the prefix that will be used in Study Subject ID.
	 * 
	 * @param value The value to set on the "SubjectIdPrefix" field
	 */
	public void setSubjectIdPrefix(String value) {
		setField(SUBJECT_ID_PREFIX, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SUBJECT_ID_SEQUENCE_DIGITS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectIdSequenceDigits<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Seq Digits<br/>
	 * <br/>
	 * <b>Description</b>: The number of digits used in subject ID sequence.
	 * 
	 * @return the value stored on the "SubjectIdSequenceDigits" field
	 */
	public Integer getSubjectIdSequenceDigits() {
		return getField(SUBJECT_ID_SEQUENCE_DIGITS);
	}
	
	/**
	 * Sets the value stored on the {@link #SUBJECT_ID_SEQUENCE_DIGITS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectIdSequenceDigits<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject ID Seq Digits<br/>
	 * <br/>
	 * <b>Description</b>: The number of digits used in subject ID sequence.
	 * 
	 * @param value The value to set on the "SubjectIdSequenceDigits" field
	 */
	public void setSubjectIdSequenceDigits(Integer value) {
		setField(SUBJECT_ID_SEQUENCE_DIGITS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_APPROVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxApprover<br/>
	 * <br/>
	 * <b>Display Name</b>: Document Approver<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "VeloxApprover" field
	 */
	public String getVeloxApprover() {
		return getField(VELOX_APPROVER);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_APPROVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxApprover<br/>
	 * <br/>
	 * <b>Display Name</b>: Document Approver<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "VeloxApprover" field
	 */
	public void setVeloxApprover(String value) {
		setField(VELOX_APPROVER, value);
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
	 * Retrieves the value stored on the {@link #IS_CLINICAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: isClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "isClinical" field
	 */
	public Boolean getisClinical() {
		return getField(IS_CLINICAL);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_CLINICAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: isClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "isClinical" field
	 */
	public void setisClinical(Boolean value) {
		setField(IS_CLINICAL, value);
	}
}