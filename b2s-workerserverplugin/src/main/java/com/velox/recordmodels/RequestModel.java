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
 * Automatically generated class for: Request
 */
@ExemplarDataTypeModel(dataTypeName="Request")
public class RequestModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "Request";

	/**
	 * <b>Data Field Name</b>: AddSamplesMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Creation or Selection Method<br/>
	 * <br/>
	 * <b>Description</b>: For this request this field will indicate how samples are to be added to it.  Samples can be loaded from a spreadsheet, pulled from the Exemplar BioBank or Manually added.
	 */
	public static final String ADD_SAMPLES_METHOD = "AddSamplesMethod";

	/**
	 * <b>Data Field Name</b>: ArePoolsIncluded<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Pools Included?<br/>
	 * <br/>
	 * <b>Description</b>: Are there Libraries you are adding to this request actually library pools?
	 */
	public static final String ARE_POOLS_INCLUDED = "ArePoolsIncluded";

	/**
	 * <b>Data Field Name</b>: AreSamplesLibraries<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Samples Libraries?<br/>
	 * <br/>
	 * <b>Description</b>: Are samples that are to be added to this request Libraries?
	 */
	public static final String ARE_SAMPLES_LIBRARIES = "AreSamplesLibraries";

	/**
	 * <b>Data Field Name</b>: C_Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___COMMENTS = "C_Comments";

	/**
	 * <b>Data Field Name</b>: C_ExpectedArrivalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expected Arrival Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___EXPECTED_ARRIVAL_DATE = "C_ExpectedArrivalDate";

	/**
	 * <b>Data Field Name</b>: C_NotificationSent<br/>
	 * <br/>
	 * <b>Display Name</b>: Notification Sent<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___NOTIFICATION_SENT = "C_NotificationSent";

	/**
	 * <b>Data Field Name</b>: C_RequestType<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REQUEST_TYPE = "C_RequestType";

	/**
	 * <b>Data Field Name</b>: C_RequisitionStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Requisition Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___REQUISITION_STATUS = "C_RequisitionStatus";

	/**
	 * <b>Data Field Name</b>: C_SampleNameType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name/Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___SAMPLE_NAME_TYPE = "C_SampleNameType";

	/**
	 * <b>Data Field Name</b>: C_StorageTemp<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Temp. (°C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___STORAGE_TEMP = "C_StorageTemp";

	/**
	 * <b>Data Field Name</b>: C_TrackingNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String C___TRACKING_NUMBER = "C_TrackingNumber";

	/**
	 * <b>Data Field Name</b>: CompletedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in this Request completed processing.
	 */
	public static final String COMPLETED_DATE = "CompletedDate";

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
	 * <b>Data Field Name</b>: DisableRequetFields<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Request Fields<br/>
	 * <br/>
	 * <b>Description</b>: Boolean value that disables request fields which should be marked as read-only when the request is submitted
	 */
	public static final String DISABLE_REQUET_FIELDS = "DisableRequetFields";

	/**
	 * <b>Data Field Name</b>: InProcessDate<br/>
	 * <br/>
	 * <b>Display Name</b>: In Process Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample from this Request entered into a process tracking workflow.
	 */
	public static final String IN_PROCESS_DATE = "InProcessDate";

	/**
	 * <b>Data Field Name</b>: NumOfReadsNeeded<br/>
	 * <br/>
	 * <b>Display Name</b>: Num Of Reads Needed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String NUM_OF_READS_NEEDED = "NumOfReadsNeeded";

	/**
	 * <b>Data Field Name</b>: NumberOfSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Samples<br/>
	 * <br/>
	 * <b>Description</b>: The number of samples that are to be created or are expected to be a part of this Request.  Only relevant when manual method is selected.
	 */
	public static final String NUMBER_OF_SAMPLES = "NumberOfSamples";

	/**
	 * <b>Data Field Name</b>: PartiallyReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Partially Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample was received for this Request.
	 */
	public static final String PARTIALLY_RECEIVED_DATE = "PartiallyReceivedDate";

	/**
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in the Request have been received.
	 */
	public static final String RECEIVED_DATE = "ReceivedDate";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RequestApproved<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Approved<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String REQUEST_APPROVED = "RequestApproved";

	/**
	 * <b>Data Field Name</b>: RequestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that the Request was requested.
	 */
	public static final String REQUEST_DATE = "RequestDate";

	/**
	 * <b>Data Field Name</b>: RequestId<br/>
	 * <br/>
	 * <b>Display Name</b>: Request ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String REQUEST_ID = "RequestId";

	/**
	 * <b>Data Field Name</b>: RequestName<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Name<br/>
	 * <br/>
	 * <b>Description</b>: The descriptive name of the Request. This can be modified to be meaningful per organization.
	 */
	public static final String REQUEST_NAME = "RequestName";

	/**
	 * <b>Data Field Name</b>: RequestedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Requested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String REQUESTED_STAIN = "RequestedStain";

	/**
	 * <b>Data Field Name</b>: RequesterEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Email<br/>
	 * <br/>
	 * <b>Description</b>: The email of the initializing user.
	 */
	public static final String REQUESTER_EMAIL = "RequesterEmail";

	/**
	 * <b>Data Field Name</b>: RequesterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who initiated the Request.
	 */
	public static final String REQUESTER_NAME = "RequesterName";

	/**
	 * <b>Data Field Name</b>: RequesterOrganization<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Organization<br/>
	 * <br/>
	 * <b>Description</b>: The organization the initializing user is from.
	 */
	public static final String REQUESTER_ORGANIZATION = "RequesterOrganization";

	/**
	 * <b>Data Field Name</b>: RequesterPhoneNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Phone Number<br/>
	 * <br/>
	 * <b>Description</b>: The phone number of the initializing user.
	 */
	public static final String REQUESTER_PHONE_NUMBER = "RequesterPhoneNumber";

	/**
	 * <b>Data Field Name</b>: SampleRegistrationLink<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Registration Link<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SAMPLE_REGISTRATION_LINK = "SampleRegistrationLink";

	/**
	 * <b>Data Field Name</b>: Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: The current status of the Request as determined by the aggregate of the statuses of all the samples in this Request.
	 */
	public static final String STATUS = "Status";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String STUDY_SUBJECT_REQUEST_CREATED_BY = "StudySubjectRequest.CreatedBy";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String STUDY_SUBJECT_REQUEST_DATA_RECORD_NAME = "StudySubjectRequest.DataRecordName";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String STUDY_SUBJECT_REQUEST_DATE_CREATED = "StudySubjectRequest.DateCreated";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.Gender<br/>
	 * <br/>
	 * <b>Display Name</b>: Gender<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT_REQUEST_GENDER = "StudySubjectRequest.Gender";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.LaunchSubjectRegistration<br/>
	 * <br/>
	 * <b>Display Name</b>: Begin Subject Registration<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT_REQUEST_LAUNCH_SUBJECT_REGISTRATION = "StudySubjectRequest.LaunchSubjectRegistration";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.NumberOfSubjects<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Subjects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT_REQUEST_NUMBER_OF_SUBJECTS = "StudySubjectRequest.NumberOfSubjects";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String STUDY_SUBJECT_REQUEST_RECORD_ID = "StudySubjectRequest.RecordId";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT_REQUEST_SPECIES = "StudySubjectRequest.Species";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.Strain<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String STUDY_SUBJECT_REQUEST_STRAIN = "StudySubjectRequest.Strain";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_BY = "StudySubjectRequest.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: StudySubjectRequest.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_DATE = "StudySubjectRequest.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: TATFromInProcessing<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT From Processing<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from In Process to Completed.
	 */
	public static final String TATFROM_IN_PROCESSING = "TATFromInProcessing";

	/**
	 * <b>Data Field Name</b>: TATFromReceiving<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT from Receiving<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from Receiving to Completed.
	 */
	public static final String TATFROM_RECEIVING = "TATFromReceiving";

	/**
	 * <b>Data Field Name</b>: TotalSampleVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Sample Volume<br/>
	 * <br/>
	 * <b>Description</b>: The total volume of all samples under this request.
	 */
	public static final String TOTAL_SAMPLE_VOLUME = "TotalSampleVolume";

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

	protected RequestModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ADD_SAMPLES_METHOD} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AddSamplesMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Creation or Selection Method<br/>
	 * <br/>
	 * <b>Description</b>: For this request this field will indicate how samples are to be added to it.  Samples can be loaded from a spreadsheet, pulled from the Exemplar BioBank or Manually added.
	 * 
	 * @return the value stored on the "AddSamplesMethod" field
	 */
	public String getAddSamplesMethod() {
		return getField(ADD_SAMPLES_METHOD);
	}
	
	/**
	 * Sets the value stored on the {@link #ADD_SAMPLES_METHOD} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AddSamplesMethod<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Creation or Selection Method<br/>
	 * <br/>
	 * <b>Description</b>: For this request this field will indicate how samples are to be added to it.  Samples can be loaded from a spreadsheet, pulled from the Exemplar BioBank or Manually added.
	 * 
	 * @param value The value to set on the "AddSamplesMethod" field
	 */
	public void setAddSamplesMethod(String value) {
		setField(ADD_SAMPLES_METHOD, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ARE_POOLS_INCLUDED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ArePoolsIncluded<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Pools Included?<br/>
	 * <br/>
	 * <b>Description</b>: Are there Libraries you are adding to this request actually library pools?
	 * 
	 * @return the value stored on the "ArePoolsIncluded" field
	 */
	public Boolean getArePoolsIncluded() {
		return getField(ARE_POOLS_INCLUDED);
	}
	
	/**
	 * Sets the value stored on the {@link #ARE_POOLS_INCLUDED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ArePoolsIncluded<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Pools Included?<br/>
	 * <br/>
	 * <b>Description</b>: Are there Libraries you are adding to this request actually library pools?
	 * 
	 * @param value The value to set on the "ArePoolsIncluded" field
	 */
	public void setArePoolsIncluded(Boolean value) {
		setField(ARE_POOLS_INCLUDED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ARE_SAMPLES_LIBRARIES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AreSamplesLibraries<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Samples Libraries?<br/>
	 * <br/>
	 * <b>Description</b>: Are samples that are to be added to this request Libraries?
	 * 
	 * @return the value stored on the "AreSamplesLibraries" field
	 */
	public Boolean getAreSamplesLibraries() {
		return getField(ARE_SAMPLES_LIBRARIES);
	}
	
	/**
	 * Sets the value stored on the {@link #ARE_SAMPLES_LIBRARIES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: AreSamplesLibraries<br/>
	 * <br/>
	 * <b>Display Name</b>: Are Samples Libraries?<br/>
	 * <br/>
	 * <b>Description</b>: Are samples that are to be added to this request Libraries?
	 * 
	 * @param value The value to set on the "AreSamplesLibraries" field
	 */
	public void setAreSamplesLibraries(Boolean value) {
		setField(ARE_SAMPLES_LIBRARIES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___COMMENTS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_Comments" field
	 */
	public String getC_Comments() {
		return getField(C___COMMENTS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___COMMENTS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_Comments<br/>
	 * <br/>
	 * <b>Display Name</b>: Comments<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_Comments" field
	 */
	public void setC_Comments(String value) {
		setField(C___COMMENTS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___EXPECTED_ARRIVAL_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ExpectedArrivalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expected Arrival Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_ExpectedArrivalDate" field
	 */
	public Long getC_ExpectedArrivalDate() {
		return getField(C___EXPECTED_ARRIVAL_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___EXPECTED_ARRIVAL_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_ExpectedArrivalDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Expected Arrival Date<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_ExpectedArrivalDate" field
	 */
	public void setC_ExpectedArrivalDate(Long value) {
		setField(C___EXPECTED_ARRIVAL_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___NOTIFICATION_SENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_NotificationSent<br/>
	 * <br/>
	 * <b>Display Name</b>: Notification Sent<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_NotificationSent" field
	 */
	public Boolean getC_NotificationSent() {
		return getField(C___NOTIFICATION_SENT);
	}
	
	/**
	 * Sets the value stored on the {@link #C___NOTIFICATION_SENT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_NotificationSent<br/>
	 * <br/>
	 * <b>Display Name</b>: Notification Sent<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_NotificationSent" field
	 */
	public void setC_NotificationSent(Boolean value) {
		setField(C___NOTIFICATION_SENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REQUEST_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RequestType<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_RequestType" field
	 */
	public String getC_RequestType() {
		return getField(C___REQUEST_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REQUEST_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RequestType<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_RequestType" field
	 */
	public void setC_RequestType(String value) {
		setField(C___REQUEST_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___REQUISITION_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RequisitionStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Requisition Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_RequisitionStatus" field
	 */
	public String getC_RequisitionStatus() {
		return getField(C___REQUISITION_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #C___REQUISITION_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_RequisitionStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Requisition Status<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_RequisitionStatus" field
	 */
	public void setC_RequisitionStatus(String value) {
		setField(C___REQUISITION_STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___SAMPLE_NAME_TYPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleNameType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name/Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_SampleNameType" field
	 */
	public String getC_SampleNameType() {
		return getField(C___SAMPLE_NAME_TYPE);
	}
	
	/**
	 * Sets the value stored on the {@link #C___SAMPLE_NAME_TYPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_SampleNameType<br/>
	 * <br/>
	 * <b>Display Name</b>: Sample Name/Type<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_SampleNameType" field
	 */
	public void setC_SampleNameType(String value) {
		setField(C___SAMPLE_NAME_TYPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___STORAGE_TEMP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StorageTemp<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Temp. (°C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_StorageTemp" field
	 */
	public Double getC_StorageTemp() {
		return getField(C___STORAGE_TEMP);
	}
	
	/**
	 * Sets the value stored on the {@link #C___STORAGE_TEMP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_StorageTemp<br/>
	 * <br/>
	 * <b>Display Name</b>: Storage Temp. (°C)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_StorageTemp" field
	 */
	public void setC_StorageTemp(Double value) {
		setField(C___STORAGE_TEMP, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #C___TRACKING_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TrackingNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "C_TrackingNumber" field
	 */
	public String getC_TrackingNumber() {
		return getField(C___TRACKING_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #C___TRACKING_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: C_TrackingNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Tracking Number<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "C_TrackingNumber" field
	 */
	public void setC_TrackingNumber(String value) {
		setField(C___TRACKING_NUMBER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #COMPLETED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CompletedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in this Request completed processing.
	 * 
	 * @return the value stored on the "CompletedDate" field
	 */
	public Long getCompletedDate() {
		return getField(COMPLETED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #COMPLETED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: CompletedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in this Request completed processing.
	 * 
	 * @param value The value to set on the "CompletedDate" field
	 */
	public void setCompletedDate(Long value) {
		setField(COMPLETED_DATE, value);
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
	 * Retrieves the value stored on the {@link #DISABLE_REQUET_FIELDS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableRequetFields<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Request Fields<br/>
	 * <br/>
	 * <b>Description</b>: Boolean value that disables request fields which should be marked as read-only when the request is submitted
	 * 
	 * @return the value stored on the "DisableRequetFields" field
	 */
	public Boolean getDisableRequetFields() {
		return getField(DISABLE_REQUET_FIELDS);
	}
	
	/**
	 * Sets the value stored on the {@link #DISABLE_REQUET_FIELDS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DisableRequetFields<br/>
	 * <br/>
	 * <b>Display Name</b>: Disable Request Fields<br/>
	 * <br/>
	 * <b>Description</b>: Boolean value that disables request fields which should be marked as read-only when the request is submitted
	 * 
	 * @param value The value to set on the "DisableRequetFields" field
	 */
	public void setDisableRequetFields(Boolean value) {
		setField(DISABLE_REQUET_FIELDS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #IN_PROCESS_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InProcessDate<br/>
	 * <br/>
	 * <b>Display Name</b>: In Process Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample from this Request entered into a process tracking workflow.
	 * 
	 * @return the value stored on the "InProcessDate" field
	 */
	public Long getInProcessDate() {
		return getField(IN_PROCESS_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #IN_PROCESS_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: InProcessDate<br/>
	 * <br/>
	 * <b>Display Name</b>: In Process Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample from this Request entered into a process tracking workflow.
	 * 
	 * @param value The value to set on the "InProcessDate" field
	 */
	public void setInProcessDate(Long value) {
		setField(IN_PROCESS_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NUM_OF_READS_NEEDED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumOfReadsNeeded<br/>
	 * <br/>
	 * <b>Display Name</b>: Num Of Reads Needed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "NumOfReadsNeeded" field
	 */
	public Integer getNumOfReadsNeeded() {
		return getField(NUM_OF_READS_NEEDED);
	}
	
	/**
	 * Sets the value stored on the {@link #NUM_OF_READS_NEEDED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumOfReadsNeeded<br/>
	 * <br/>
	 * <b>Display Name</b>: Num Of Reads Needed<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "NumOfReadsNeeded" field
	 */
	public void setNumOfReadsNeeded(Integer value) {
		setField(NUM_OF_READS_NEEDED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #NUMBER_OF_SAMPLES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Samples<br/>
	 * <br/>
	 * <b>Description</b>: The number of samples that are to be created or are expected to be a part of this Request.  Only relevant when manual method is selected.
	 * 
	 * @return the value stored on the "NumberOfSamples" field
	 */
	public Long getNumberOfSamples() {
		return getField(NUMBER_OF_SAMPLES);
	}
	
	/**
	 * Sets the value stored on the {@link #NUMBER_OF_SAMPLES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: NumberOfSamples<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Samples<br/>
	 * <br/>
	 * <b>Description</b>: The number of samples that are to be created or are expected to be a part of this Request.  Only relevant when manual method is selected.
	 * 
	 * @param value The value to set on the "NumberOfSamples" field
	 */
	public void setNumberOfSamples(Long value) {
		setField(NUMBER_OF_SAMPLES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #PARTIALLY_RECEIVED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PartiallyReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Partially Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample was received for this Request.
	 * 
	 * @return the value stored on the "PartiallyReceivedDate" field
	 */
	public Long getPartiallyReceivedDate() {
		return getField(PARTIALLY_RECEIVED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #PARTIALLY_RECEIVED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: PartiallyReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Partially Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when the first sample was received for this Request.
	 * 
	 * @param value The value to set on the "PartiallyReceivedDate" field
	 */
	public void setPartiallyReceivedDate(Long value) {
		setField(PARTIALLY_RECEIVED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RECEIVED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in the Request have been received.
	 * 
	 * @return the value stored on the "ReceivedDate" field
	 */
	public Long getReceivedDate() {
		return getField(RECEIVED_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #RECEIVED_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ReceivedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Received Date<br/>
	 * <br/>
	 * <b>Description</b>: The date when all the samples in the Request have been received.
	 * 
	 * @param value The value to set on the "ReceivedDate" field
	 */
	public void setReceivedDate(Long value) {
		setField(RECEIVED_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUEST_APPROVED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestApproved<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Approved<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RequestApproved" field
	 */
	public Boolean getRequestApproved() {
		return getField(REQUEST_APPROVED);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUEST_APPROVED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestApproved<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Approved<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RequestApproved" field
	 */
	public void setRequestApproved(Boolean value) {
		setField(REQUEST_APPROVED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUEST_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that the Request was requested.
	 * 
	 * @return the value stored on the "RequestDate" field
	 */
	public Long getRequestDate() {
		return getField(REQUEST_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUEST_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that the Request was requested.
	 * 
	 * @param value The value to set on the "RequestDate" field
	 */
	public void setRequestDate(Long value) {
		setField(REQUEST_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUEST_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestId<br/>
	 * <br/>
	 * <b>Display Name</b>: Request ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RequestId" field
	 */
	public String getRequestId() {
		return getField(REQUEST_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUEST_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestId<br/>
	 * <br/>
	 * <b>Display Name</b>: Request ID<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RequestId" field
	 */
	public void setRequestId(String value) {
		setField(REQUEST_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUEST_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestName<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Name<br/>
	 * <br/>
	 * <b>Description</b>: The descriptive name of the Request. This can be modified to be meaningful per organization.
	 * 
	 * @return the value stored on the "RequestName" field
	 */
	public String getRequestName() {
		return getField(REQUEST_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUEST_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestName<br/>
	 * <br/>
	 * <b>Display Name</b>: Request Name<br/>
	 * <br/>
	 * <b>Description</b>: The descriptive name of the Request. This can be modified to be meaningful per organization.
	 * 
	 * @param value The value to set on the "RequestName" field
	 */
	public void setRequestName(String value) {
		setField(REQUEST_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUESTED_STAIN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Requested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "RequestedStain" field
	 */
	public String getRequestedStain() {
		return getField(REQUESTED_STAIN);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUESTED_STAIN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequestedStain<br/>
	 * <br/>
	 * <b>Display Name</b>: Requested Stain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "RequestedStain" field
	 */
	public void setRequestedStain(String value) {
		setField(REQUESTED_STAIN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUESTER_EMAIL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Email<br/>
	 * <br/>
	 * <b>Description</b>: The email of the initializing user.
	 * 
	 * @return the value stored on the "RequesterEmail" field
	 */
	public String getRequesterEmail() {
		return getField(REQUESTER_EMAIL);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUESTER_EMAIL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterEmail<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Email<br/>
	 * <br/>
	 * <b>Description</b>: The email of the initializing user.
	 * 
	 * @param value The value to set on the "RequesterEmail" field
	 */
	public void setRequesterEmail(String value) {
		setField(REQUESTER_EMAIL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUESTER_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who initiated the Request.
	 * 
	 * @return the value stored on the "RequesterName" field
	 */
	public String getRequesterName() {
		return getField(REQUESTER_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUESTER_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterName<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Name<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who initiated the Request.
	 * 
	 * @param value The value to set on the "RequesterName" field
	 */
	public void setRequesterName(String value) {
		setField(REQUESTER_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUESTER_ORGANIZATION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterOrganization<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Organization<br/>
	 * <br/>
	 * <b>Description</b>: The organization the initializing user is from.
	 * 
	 * @return the value stored on the "RequesterOrganization" field
	 */
	public String getRequesterOrganization() {
		return getField(REQUESTER_ORGANIZATION);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUESTER_ORGANIZATION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterOrganization<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Organization<br/>
	 * <br/>
	 * <b>Description</b>: The organization the initializing user is from.
	 * 
	 * @param value The value to set on the "RequesterOrganization" field
	 */
	public void setRequesterOrganization(String value) {
		setField(REQUESTER_ORGANIZATION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #REQUESTER_PHONE_NUMBER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterPhoneNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Phone Number<br/>
	 * <br/>
	 * <b>Description</b>: The phone number of the initializing user.
	 * 
	 * @return the value stored on the "RequesterPhoneNumber" field
	 */
	public String getRequesterPhoneNumber() {
		return getField(REQUESTER_PHONE_NUMBER);
	}
	
	/**
	 * Sets the value stored on the {@link #REQUESTER_PHONE_NUMBER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RequesterPhoneNumber<br/>
	 * <br/>
	 * <b>Display Name</b>: Requester Phone Number<br/>
	 * <br/>
	 * <b>Description</b>: The phone number of the initializing user.
	 * 
	 * @param value The value to set on the "RequesterPhoneNumber" field
	 */
	public void setRequesterPhoneNumber(String value) {
		setField(REQUESTER_PHONE_NUMBER, value);
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
	 * Retrieves the value stored on the {@link #STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: The current status of the Request as determined by the aggregate of the statuses of all the samples in this Request.
	 * 
	 * @return the value stored on the "Status" field
	 */
	public String getStatus() {
		return getField(STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Status<br/>
	 * <br/>
	 * <b>Description</b>: The current status of the Request as determined by the aggregate of the statuses of all the samples in this Request.
	 * 
	 * @param value The value to set on the "Status" field
	 */
	public void setStatus(String value) {
		setField(STATUS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "StudySubjectRequest.CreatedBy" field
	 */
	public String getStudySubjectRequestCreatedBy() {
		return getField(STUDY_SUBJECT_REQUEST_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "StudySubjectRequest.DataRecordName" field
	 */
	public String getStudySubjectRequestDataRecordName() {
		return getField(STUDY_SUBJECT_REQUEST_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "StudySubjectRequest.DateCreated" field
	 */
	public Long getStudySubjectRequestDateCreated() {
		return getField(STUDY_SUBJECT_REQUEST_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_GENDER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Gender<br/>
	 * <br/>
	 * <b>Display Name</b>: Gender<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySubjectRequest.Gender" field
	 */
	public String getStudySubjectRequestGender() {
		return getField(STUDY_SUBJECT_REQUEST_GENDER);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT_REQUEST_GENDER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Gender<br/>
	 * <br/>
	 * <b>Display Name</b>: Gender<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySubjectRequest.Gender" field
	 */
	public void setStudySubjectRequestGender(String value) {
		setField(STUDY_SUBJECT_REQUEST_GENDER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_NUMBER_OF_SUBJECTS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.NumberOfSubjects<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Subjects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySubjectRequest.NumberOfSubjects" field
	 */
	public Integer getStudySubjectRequestNumberOfSubjects() {
		return getField(STUDY_SUBJECT_REQUEST_NUMBER_OF_SUBJECTS);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT_REQUEST_NUMBER_OF_SUBJECTS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.NumberOfSubjects<br/>
	 * <br/>
	 * <b>Display Name</b>: Number Of Subjects<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySubjectRequest.NumberOfSubjects" field
	 */
	public void setStudySubjectRequestNumberOfSubjects(Integer value) {
		setField(STUDY_SUBJECT_REQUEST_NUMBER_OF_SUBJECTS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "StudySubjectRequest.RecordId" field
	 */
	public Long getStudySubjectRequestRecordId() {
		return getField(STUDY_SUBJECT_REQUEST_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_SPECIES} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySubjectRequest.Species" field
	 */
	public String getStudySubjectRequestSpecies() {
		return getField(STUDY_SUBJECT_REQUEST_SPECIES);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT_REQUEST_SPECIES} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Species<br/>
	 * <br/>
	 * <b>Display Name</b>: Species<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySubjectRequest.Species" field
	 */
	public void setStudySubjectRequestSpecies(String value) {
		setField(STUDY_SUBJECT_REQUEST_SPECIES, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_STRAIN} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Strain<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "StudySubjectRequest.Strain" field
	 */
	public String getStudySubjectRequestStrain() {
		return getField(STUDY_SUBJECT_REQUEST_STRAIN);
	}
	
	/**
	 * Sets the value stored on the {@link #STUDY_SUBJECT_REQUEST_STRAIN} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.Strain<br/>
	 * <br/>
	 * <b>Display Name</b>: Strain<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "StudySubjectRequest.Strain" field
	 */
	public void setStudySubjectRequestStrain(String value) {
		setField(STUDY_SUBJECT_REQUEST_STRAIN, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "StudySubjectRequest.VeloxLastModifiedBy" field
	 */
	public String getStudySubjectRequestVeloxLastModifiedBy() {
		return getField(STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: StudySubjectRequest.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "StudySubjectRequest.VeloxLastModifiedDate" field
	 */
	public Long getStudySubjectRequestVeloxLastModifiedDate() {
		return getField(STUDY_SUBJECT_REQUEST_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TATFROM_IN_PROCESSING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TATFromInProcessing<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT From Processing<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from In Process to Completed.
	 * 
	 * @return the value stored on the "TATFromInProcessing" field
	 */
	public String getTATFromInProcessing() {
		return getField(TATFROM_IN_PROCESSING);
	}
	
	/**
	 * Sets the value stored on the {@link #TATFROM_IN_PROCESSING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TATFromInProcessing<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT From Processing<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from In Process to Completed.
	 * 
	 * @param value The value to set on the "TATFromInProcessing" field
	 */
	public void setTATFromInProcessing(String value) {
		setField(TATFROM_IN_PROCESSING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TATFROM_RECEIVING} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TATFromReceiving<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT from Receiving<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from Receiving to Completed.
	 * 
	 * @return the value stored on the "TATFromReceiving" field
	 */
	public String getTATFromReceiving() {
		return getField(TATFROM_RECEIVING);
	}
	
	/**
	 * Sets the value stored on the {@link #TATFROM_RECEIVING} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TATFromReceiving<br/>
	 * <br/>
	 * <b>Display Name</b>: TAT from Receiving<br/>
	 * <br/>
	 * <b>Description</b>: The total Turn Around Time from Receiving to Completed.
	 * 
	 * @param value The value to set on the "TATFromReceiving" field
	 */
	public void setTATFromReceiving(String value) {
		setField(TATFROM_RECEIVING, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TOTAL_SAMPLE_VOLUME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalSampleVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Sample Volume<br/>
	 * <br/>
	 * <b>Description</b>: The total volume of all samples under this request.
	 * 
	 * @return the value stored on the "TotalSampleVolume" field
	 */
	public Double getTotalSampleVolume() {
		return getField(TOTAL_SAMPLE_VOLUME);
	}
	
	/**
	 * Sets the value stored on the {@link #TOTAL_SAMPLE_VOLUME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TotalSampleVolume<br/>
	 * <br/>
	 * <b>Display Name</b>: Total Sample Volume<br/>
	 * <br/>
	 * <b>Description</b>: The total volume of all samples under this request.
	 * 
	 * @param value The value to set on the "TotalSampleVolume" field
	 */
	public void setTotalSampleVolume(Double value) {
		setField(TOTAL_SAMPLE_VOLUME, value);
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