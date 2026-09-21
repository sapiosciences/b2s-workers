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
 * Automatically generated class for: Study
 */
@ExemplarDataTypeModel(dataTypeName="Study")
public class StudyModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "Study";

	/**
	 * <b>Data Field Name</b>: BodyWeightWarningPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Body Weight Discrepency Percentage<br/>
	 * <br/>
	 * <b>Description</b>: The minimum change in body weight to trigger a request for re-measurement.
	 */
	public static final String BODY_WEIGHT_WARNING_PERCENTAGE = "BodyWeightWarningPercentage";

	/**
	 * <b>Data Field Name</b>: C_SponsorStudyNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Sponsor Study Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SPONSOR_STUDY_NUMBER = "C_SponsorStudyNumber";

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
	 * <b>Data Field Name</b>: Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Detailed description of the study.
	 */
	public static final String DESCRIPTION = "Description";

	/**
	 * <b>Data Field Name</b>: DisableAutoStudyTaskGrouping<br/>
	 * <br/>
	 * <b>Display Name</b>: Schedule Tasks by Treatment Event<br/>
	 * <br/>
	 * <b>Description</b>: When this option is true then all samplings and observations linked to a given treatment event regardless of whether they are offset from the treatment or not will be scheduled as part of the same task as the treatment.

This will also allow the tasks to be created as part of dosing sheets across multiple studies.
	 */
	public static final String DISABLE_AUTO_STUDY_TASK_GROUPING = "DisableAutoStudyTaskGrouping";

	/**
	 * <b>Data Field Name</b>: DisableSubjectRequest<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Subject Request<br/>
	 * <br/>
	 * <b>Description</b>: When enabled, users can add subjects directly to the study without submitting a subject request or going through the approval workflow.
	 */
	public static final String DISABLE_SUBJECT_REQUEST = "DisableSubjectRequest";

	/**
	 * <b>Data Field Name</b>: EnableEventOffsetScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Enable Event Offset Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If 'false' then the tasks will remain at the originally scheduled time when prior tasks are completed.  When 'true' then whenever a study task is completed the subsequent tasks will be shifted to maintain a consistent offset between the current task and the subsequent tasks.
	 */
	public static final String ENABLE_EVENT_OFFSET_SCHEDULING = "EnableEventOffsetScheduling";

	/**
	 * <b>Data Field Name</b>: InheritRolesFromParent<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Parent<br/>
	 * <br/>
	 * <b>Description</b>: Whether this record should inherit possible ELN roles from its parent.
	 */
	public static final String INHERIT_ROLES_FROM_PARENT = "InheritRolesFromParent";

	/**
	 * <b>Data Field Name</b>: InheritRolesFromProject<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Project<br/>
	 * <br/>
	 * <b>Description</b>: When this option is enabled the Role Candidates will be linked to the parent Project. This results in any Role Candidate changes being copied to and from the parent Project whenever changes to the candidates are made.

If this option is currently enabled and is set to disabled the current Role Candidates will remain and future changes won't be copied.
	 */
	public static final String INHERIT_ROLES_FROM_PROJECT = "InheritRolesFromProject";

	/**
	 * <b>Data Field Name</b>: IsClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: Defines whether the study is clinical or not.
	 */
	public static final String IS_CLINICAL = "IsClinical";

	/**
	 * <b>Data Field Name</b>: IsStudyTaskTypesCombined<br/>
	 * <br/>
	 * <b>Display Name</b>: Combine Task Types into Single Task Groupings<br/>
	 * <br/>
	 * <b>Description</b>: A configuration that indicates whether different types of study tasks should be combined into common groupings.  If this boolean is set to true, then observation, dosing, and sampling tasks can all be combined into one common grouping and done within a single study task workflow.
	 */
	public static final String IS_STUDY_TASK_TYPES_COMBINED = "IsStudyTaskTypesCombined";

	/**
	 * <b>Data Field Name</b>: IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String IS_TEMPLATE = "IsTemplate";

	/**
	 * <b>Data Field Name</b>: IsVivariumSubjectTracking<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Vivarium Subject Tracking<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String IS_VIVARIUM_SUBJECT_TRACKING = "IsVivariumSubjectTracking";

	/**
	 * <b>Data Field Name</b>: MaxBodyWeightDosingTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Maximum Number of Days Between Dosing and Last Body Mass Measurement<br/>
	 * <br/>
	 * <b>Description</b>: This value represents the maximum number of days between a body mass dosing and the prior body mass measurement.  If this value is exceeded during a dosing task a warning will be displayed to the user that a body mass measurement should be taken before applying the current dose to the subject.
	 */
	public static final String MAX_BODY_WEIGHT_DOSING_TIME = "MaxBodyWeightDosingTime";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: StudyId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study ID<br/>
	 * <br/>
	 * <b>Description</b>: The identifier of the study.
	 */
	public static final String STUDY_ID = "StudyId";

	/**
	 * <b>Data Field Name</b>: StudyName<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the study.
	 */
	public static final String STUDY_NAME = "StudyName";

	/**
	 * <b>Data Field Name</b>: StudyStartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Start Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_START_DATE = "StudyStartDate";

	/**
	 * <b>Data Field Name</b>: StudySubjectRandomizerConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject Randomizer Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The study subject randomizer to be used with this study when randomly assigning subjects to study subjects within a study design.  If this is blank then a simple randomization algorithm will be used to evenly distribute the subjects among the groups within the study.
	 */
	public static final String STUDY_SUBJECT_RANDOMIZER_CONFIG = "StudySubjectRandomizerConfig";

	/**
	 * <b>Data Field Name</b>: StudyType<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Type<br/>
	 * <br/>
	 * <b>Description</b>: What kind of study this is.
	 */
	public static final String STUDY_TYPE = "StudyType";

	/**
	 * <b>Data Field Name</b>: SubjectLevelTaskScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject Level Task Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If this is set to true, then the Study Start Date set on the Study Subjects will be used for scheduling Study Tasks instead of the Start Date field on the Study.  Additionally, when this is true, then the Create Study Tasks button will prompt for which subjects to schedule study tasks for.
	 */
	public static final String SUBJECT_LEVEL_TASK_SCHEDULING = "SubjectLevelTaskScheduling";

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

	protected StudyModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #BODY_WEIGHT_WARNING_PERCENTAGE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BodyWeightWarningPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Body Weight Discrepency Percentage<br/>
	 * <br/>
	 * <b>Description</b>: The minimum change in body weight to trigger a request for re-measurement.
	 * 
	 * @return the value stored on the "BodyWeightWarningPercentage" field
	 */
	public Double getBodyWeightWarningPercentage() {
		return getField(BODY_WEIGHT_WARNING_PERCENTAGE);
	}
	
	/**
	 * Sets the value stored on the {@link #BODY_WEIGHT_WARNING_PERCENTAGE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: BodyWeightWarningPercentage<br/>
	 * <br/>
	 * <b>Display Name</b>: Body Weight Discrepency Percentage<br/>
	 * <br/>
	 * <b>Description</b>: The minimum change in body weight to trigger a request for re-measurement.
	 * 
	 * @param value The value to set on the "BodyWeightWarningPercentage" field
	 */
	public void setBodyWeightWarningPercentage(Double value) {
		setField(BODY_WEIGHT_WARNING_PERCENTAGE, value);
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
	 * Retrieves the value stored on the {@link #DESCRIPTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Description<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: Detailed description of the study.
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
	 * <b>Description</b>: Detailed description of the study.
	 * 
	 * @param value The value to set on the "Description" field
	 */
	public void setDescription(String value) {
		setField(DESCRIPTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DISABLE_AUTO_STUDY_TASK_GROUPING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableAutoStudyTaskGrouping<br/>
	 * <br/>
	 * <b>Display Name</b>: Schedule Tasks by Treatment Event<br/>
	 * <br/>
	 * <b>Description</b>: When this option is true then all samplings and observations linked to a given treatment event regardless of whether they are offset from the treatment or not will be scheduled as part of the same task as the treatment.

This will also allow the tasks to be created as part of dosing sheets across multiple studies.
	 * 
	 * @return the value stored on the "DisableAutoStudyTaskGrouping" field
	 */
	public Boolean getDisableAutoStudyTaskGrouping() {
		return getField(DISABLE_AUTO_STUDY_TASK_GROUPING);
	}
	
	/**
	 * Sets the value stored on the {@link #DISABLE_AUTO_STUDY_TASK_GROUPING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableAutoStudyTaskGrouping<br/>
	 * <br/>
	 * <b>Display Name</b>: Schedule Tasks by Treatment Event<br/>
	 * <br/>
	 * <b>Description</b>: When this option is true then all samplings and observations linked to a given treatment event regardless of whether they are offset from the treatment or not will be scheduled as part of the same task as the treatment.

This will also allow the tasks to be created as part of dosing sheets across multiple studies.
	 * 
	 * @param value The value to set on the "DisableAutoStudyTaskGrouping" field
	 */
	public void setDisableAutoStudyTaskGrouping(Boolean value) {
		setField(DISABLE_AUTO_STUDY_TASK_GROUPING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #DISABLE_SUBJECT_REQUEST} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableSubjectRequest<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Subject Request<br/>
	 * <br/>
	 * <b>Description</b>: When enabled, users can add subjects directly to the study without submitting a subject request or going through the approval workflow.
	 * 
	 * @return the value stored on the "DisableSubjectRequest" field
	 */
	public Boolean getDisableSubjectRequest() {
		return getField(DISABLE_SUBJECT_REQUEST);
	}
	
	/**
	 * Sets the value stored on the {@link #DISABLE_SUBJECT_REQUEST} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableSubjectRequest<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Subject Request<br/>
	 * <br/>
	 * <b>Description</b>: When enabled, users can add subjects directly to the study without submitting a subject request or going through the approval workflow.
	 * 
	 * @param value The value to set on the "DisableSubjectRequest" field
	 */
	public void setDisableSubjectRequest(Boolean value) {
		setField(DISABLE_SUBJECT_REQUEST, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ENABLE_EVENT_OFFSET_SCHEDULING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EnableEventOffsetScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Enable Event Offset Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If 'false' then the tasks will remain at the originally scheduled time when prior tasks are completed.  When 'true' then whenever a study task is completed the subsequent tasks will be shifted to maintain a consistent offset between the current task and the subsequent tasks.
	 * 
	 * @return the value stored on the "EnableEventOffsetScheduling" field
	 */
	public Boolean getEnableEventOffsetScheduling() {
		return getField(ENABLE_EVENT_OFFSET_SCHEDULING);
	}
	
	/**
	 * Sets the value stored on the {@link #ENABLE_EVENT_OFFSET_SCHEDULING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: EnableEventOffsetScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Enable Event Offset Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If 'false' then the tasks will remain at the originally scheduled time when prior tasks are completed.  When 'true' then whenever a study task is completed the subsequent tasks will be shifted to maintain a consistent offset between the current task and the subsequent tasks.
	 * 
	 * @param value The value to set on the "EnableEventOffsetScheduling" field
	 */
	public void setEnableEventOffsetScheduling(Boolean value) {
		setField(ENABLE_EVENT_OFFSET_SCHEDULING, value);
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
	 * Retrieves the value stored on the {@link #INHERIT_ROLES_FROM_PROJECT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InheritRolesFromProject<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Project<br/>
	 * <br/>
	 * <b>Description</b>: When this option is enabled the Role Candidates will be linked to the parent Project. This results in any Role Candidate changes being copied to and from the parent Project whenever changes to the candidates are made.

If this option is currently enabled and is set to disabled the current Role Candidates will remain and future changes won't be copied.
	 * 
	 * @return the value stored on the "InheritRolesFromProject" field
	 */
	public Boolean getInheritRolesFromProject() {
		return getField(INHERIT_ROLES_FROM_PROJECT);
	}
	
	/**
	 * Sets the value stored on the {@link #INHERIT_ROLES_FROM_PROJECT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InheritRolesFromProject<br/>
	 * <br/>
	 * <b>Display Name</b>: Inherit Roles From Project<br/>
	 * <br/>
	 * <b>Description</b>: When this option is enabled the Role Candidates will be linked to the parent Project. This results in any Role Candidate changes being copied to and from the parent Project whenever changes to the candidates are made.

If this option is currently enabled and is set to disabled the current Role Candidates will remain and future changes won't be copied.
	 * 
	 * @param value The value to set on the "InheritRolesFromProject" field
	 */
	public void setInheritRolesFromProject(Boolean value) {
		setField(INHERIT_ROLES_FROM_PROJECT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_CLINICAL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: Defines whether the study is clinical or not.
	 * 
	 * @return the value stored on the "IsClinical" field
	 */
	public Boolean getIsClinical() {
		return getField(IS_CLINICAL);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_CLINICAL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsClinical<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Clinical<br/>
	 * <br/>
	 * <b>Description</b>: Defines whether the study is clinical or not.
	 * 
	 * @param value The value to set on the "IsClinical" field
	 */
	public void setIsClinical(Boolean value) {
		setField(IS_CLINICAL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_STUDY_TASK_TYPES_COMBINED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsStudyTaskTypesCombined<br/>
	 * <br/>
	 * <b>Display Name</b>: Combine Task Types into Single Task Groupings<br/>
	 * <br/>
	 * <b>Description</b>: A configuration that indicates whether different types of study tasks should be combined into common groupings.  If this boolean is set to true, then observation, dosing, and sampling tasks can all be combined into one common grouping and done within a single study task workflow.
	 * 
	 * @return the value stored on the "IsStudyTaskTypesCombined" field
	 */
	public Boolean getIsStudyTaskTypesCombined() {
		return getField(IS_STUDY_TASK_TYPES_COMBINED);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_STUDY_TASK_TYPES_COMBINED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsStudyTaskTypesCombined<br/>
	 * <br/>
	 * <b>Display Name</b>: Combine Task Types into Single Task Groupings<br/>
	 * <br/>
	 * <b>Description</b>: A configuration that indicates whether different types of study tasks should be combined into common groupings.  If this boolean is set to true, then observation, dosing, and sampling tasks can all be combined into one common grouping and done within a single study task workflow.
	 * 
	 * @param value The value to set on the "IsStudyTaskTypesCombined" field
	 */
	public void setIsStudyTaskTypesCombined(Boolean value) {
		setField(IS_STUDY_TASK_TYPES_COMBINED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_TEMPLATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "IsTemplate" field
	 */
	public Boolean getIsTemplate() {
		return getField(IS_TEMPLATE);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_TEMPLATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsTemplate<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Template<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "IsTemplate" field
	 */
	public void setIsTemplate(Boolean value) {
		setField(IS_TEMPLATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IS_VIVARIUM_SUBJECT_TRACKING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsVivariumSubjectTracking<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Vivarium Subject Tracking<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "IsVivariumSubjectTracking" field
	 */
	public Boolean getIsVivariumSubjectTracking() {
		return getField(IS_VIVARIUM_SUBJECT_TRACKING);
	}
	
	/**
	 * Sets the value stored on the {@link #IS_VIVARIUM_SUBJECT_TRACKING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IsVivariumSubjectTracking<br/>
	 * <br/>
	 * <b>Display Name</b>: Is Vivarium Subject Tracking<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "IsVivariumSubjectTracking" field
	 */
	public void setIsVivariumSubjectTracking(Boolean value) {
		setField(IS_VIVARIUM_SUBJECT_TRACKING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #MAX_BODY_WEIGHT_DOSING_TIME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MaxBodyWeightDosingTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Maximum Number of Days Between Dosing and Last Body Mass Measurement<br/>
	 * <br/>
	 * <b>Description</b>: This value represents the maximum number of days between a body mass dosing and the prior body mass measurement.  If this value is exceeded during a dosing task a warning will be displayed to the user that a body mass measurement should be taken before applying the current dose to the subject.
	 * 
	 * @return the value stored on the "MaxBodyWeightDosingTime" field
	 */
	public Integer getMaxBodyWeightDosingTime() {
		return getField(MAX_BODY_WEIGHT_DOSING_TIME);
	}
	
	/**
	 * Sets the value stored on the {@link #MAX_BODY_WEIGHT_DOSING_TIME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: MaxBodyWeightDosingTime<br/>
	 * <br/>
	 * <b>Display Name</b>: Maximum Number of Days Between Dosing and Last Body Mass Measurement<br/>
	 * <br/>
	 * <b>Description</b>: This value represents the maximum number of days between a body mass dosing and the prior body mass measurement.  If this value is exceeded during a dosing task a warning will be displayed to the user that a body mass measurement should be taken before applying the current dose to the subject.
	 * 
	 * @param value The value to set on the "MaxBodyWeightDosingTime" field
	 */
	public void setMaxBodyWeightDosingTime(Integer value) {
		setField(MAX_BODY_WEIGHT_DOSING_TIME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study ID<br/>
	 * <br/>
	 * <b>Description</b>: The identifier of the study.
	 * 
	 * @return the value stored on the "StudyId" field
	 */
	public String getStudyId() {
		return getField(STUDY_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyId<br/>
	 * <br/>
	 * <b>Display Name</b>: Study ID<br/>
	 * <br/>
	 * <b>Description</b>: The identifier of the study.
	 * 
	 * @param value The value to set on the "StudyId" field
	 */
	public void setStudyId(String value) {
		setField(STUDY_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyName<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the study.
	 * 
	 * @return the value stored on the "StudyName" field
	 */
	public String getStudyName() {
		return getField(STUDY_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyName<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the study.
	 * 
	 * @param value The value to set on the "StudyName" field
	 */
	public void setStudyName(String value) {
		setField(STUDY_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_START_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyStartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Start Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudyStartDate" field
	 */
	public Long getStudyStartDate() {
		return getField(STUDY_START_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_START_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyStartDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Start Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudyStartDate" field
	 */
	public void setStudyStartDate(Long value) {
		setField(STUDY_START_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_RANDOMIZER_CONFIG} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRandomizerConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject Randomizer Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The study subject randomizer to be used with this study when randomly assigning subjects to study subjects within a study design.  If this is blank then a simple randomization algorithm will be used to evenly distribute the subjects among the groups within the study.
	 * 
	 * @return the value stored on the "StudySubjectRandomizerConfig" field
	 */
	public String getStudySubjectRandomizerConfig() {
		return getField(STUDY_SUBJECT_RANDOMIZER_CONFIG);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT_RANDOMIZER_CONFIG} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRandomizerConfig<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Subject Randomizer Configuration<br/>
	 * <br/>
	 * <b>Description</b>: The study subject randomizer to be used with this study when randomly assigning subjects to study subjects within a study design.  If this is blank then a simple randomization algorithm will be used to evenly distribute the subjects among the groups within the study.
	 * 
	 * @param value The value to set on the "StudySubjectRandomizerConfig" field
	 */
	public void setStudySubjectRandomizerConfig(String value) {
		setField(STUDY_SUBJECT_RANDOMIZER_CONFIG, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyType<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Type<br/>
	 * <br/>
	 * <b>Description</b>: What kind of study this is.
	 * 
	 * @return the value stored on the "StudyType" field
	 */
	public String getStudyType() {
		return getField(STUDY_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudyType<br/>
	 * <br/>
	 * <b>Display Name</b>: Study Type<br/>
	 * <br/>
	 * <b>Description</b>: What kind of study this is.
	 * 
	 * @param value The value to set on the "StudyType" field
	 */
	public void setStudyType(String value) {
		setField(STUDY_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SUBJECT_LEVEL_TASK_SCHEDULING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectLevelTaskScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject Level Task Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If this is set to true, then the Study Start Date set on the Study Subjects will be used for scheduling Study Tasks instead of the Start Date field on the Study.  Additionally, when this is true, then the Create Study Tasks button will prompt for which subjects to schedule study tasks for.
	 * 
	 * @return the value stored on the "SubjectLevelTaskScheduling" field
	 */
	public Boolean getSubjectLevelTaskScheduling() {
		return getField(SUBJECT_LEVEL_TASK_SCHEDULING);
	}
	
	/**
	 * Sets the value stored on the {@link #SUBJECT_LEVEL_TASK_SCHEDULING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SubjectLevelTaskScheduling<br/>
	 * <br/>
	 * <b>Display Name</b>: Subject Level Task Scheduling<br/>
	 * <br/>
	 * <b>Description</b>: If this is set to true, then the Study Start Date set on the Study Subjects will be used for scheduling Study Tasks instead of the Start Date field on the Study.  Additionally, when this is true, then the Create Study Tasks button will prompt for which subjects to schedule study tasks for.
	 * 
	 * @param value The value to set on the "SubjectLevelTaskScheduling" field
	 */
	public void setSubjectLevelTaskScheduling(Boolean value) {
		setField(SUBJECT_LEVEL_TASK_SCHEDULING, value);
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