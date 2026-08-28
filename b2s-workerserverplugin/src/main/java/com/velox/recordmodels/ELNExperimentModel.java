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
 * Automatically generated class for: Experiment
 */
@ExemplarDataTypeModel(dataTypeName="ELNExperiment")
public class ELNExperimentModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "ELNExperiment";

	/**
	 * <b>Data Field Name</b>: ClusterWithCBot<br/>
	 * <br/>
	 * <b>Display Name</b>: Cluster With CBot<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String CLUSTER_WITH_CBOT = "ClusterWithCBot";

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
	 * <b>Data Field Name</b>: DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String DATE_COMPLETED = "DateCompleted";

	/**
	 * <b>Data Field Name</b>: DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String DATE_CREATED = "DateCreated";

	/**
	 * <b>Data Field Name</b>: FlowcellId<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell ID<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String FLOWCELL_ID = "FlowcellId";

	/**
	 * <b>Data Field Name</b>: IlluminaSeqTemplateDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String ILLUMINA_SEQ_TEMPLATE_DESCRIPTION = "IlluminaSeqTemplateDescription";

	/**
	 * <b>Data Field Name</b>: LockedAwaitingApprovalSince<br/>
	 * <br/>
	 * <b>Display Name</b>: Locked Awaiting Approval Since<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOCKED_AWAITING_APPROVAL_SINCE = "LockedAwaitingApprovalSince";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Experiment Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: RelatedELNExperimentParent<br/>
	 * <br/>
	 * <b>Display Name</b>: Related Notebook Experiment Parent<br/>
	 * <br/>
	 * <b>Description</b>: The name of the parent of this Notebook Experiment.
	 */
	public static final String RELATED_ELNEXPERIMENT_PARENT = "RelatedELNExperimentParent";

	/**
	 * <b>Data Field Name</b>: RunCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String RUN_COMPLETED = "RunCompleted";

	/**
	 * <b>Data Field Name</b>: RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run ID<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String RUN_ID = "RunId";

	/**
	 * <b>Data Field Name</b>: SequencerInstrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Used<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String SEQUENCER_INSTRUMENT = "SequencerInstrument";

	/**
	 * <b>Data Field Name</b>: SequencerRunDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Date<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String SEQUENCER_RUN_DATE = "SequencerRunDate";

	/**
	 * <b>Data Field Name</b>: SequencerRunFolder<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Folder<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String SEQUENCER_RUN_FOLDER = "SequencerRunFolder";

	/**
	 * <b>Data Field Name</b>: SequencingRunMode<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencing Run Mode<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String SEQUENCING_RUN_MODE = "SequencingRunMode";

	/**
	 * <b>Data Field Name</b>: Side<br/>
	 * <br/>
	 * <b>Display Name</b>: Side<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String SIDE = "Side";

	/**
	 * <b>Data Field Name</b>: TemplateExperimentName<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Experiment<br/>
	 * <br/>
	 * <b>Description</b>: The name of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 */
	public static final String TEMPLATE_EXPERIMENT_NAME = "TemplateExperimentName";

	/**
	 * <b>Data Field Name</b>: TemplateVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Version<br/>
	 * <br/>
	 * <b>Description</b>: The version of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 */
	public static final String TEMPLATE_VERSION = "TemplateVersion";

	/**
	 * <b>Data Field Name</b>: TimeCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 */
	public static final String TIME_COMPLETED = "TimeCompleted";

	/**
	 * <b>Data Field Name</b>: VELOXOWNER<br/>
	 * <br/>
	 * <b>Display Name</b>: Owner<br/>
	 * <br/>
	 * <b>Description</b>: The owner of the Notebook Experiment. Owner may assign roles to an unlocked experiment.
	 */
	public static final String VELOXOWNER = "VELOXOWNER";

	/**
	 * <b>Data Field Name</b>: VeloxCompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: The user that completed the Notebook Experiment.
	 */
	public static final String VELOX_COMPLETED_BY = "VeloxCompletedBy";

	/**
	 * <b>Data Field Name</b>: VeloxDateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: The timestamp when the Notebook Experiment was marked completed.
	 */
	public static final String VELOX_DATE_COMPLETED = "VeloxDateCompleted";

	/**
	 * <b>Data Field Name</b>: VeloxExperimentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Experiment Status<br/>
	 * <br/>
	 * <b>Description</b>: The status of the Notebook Experiment.
	 */
	public static final String VELOX_EXPERIMENT_STATUS = "VeloxExperimentStatus";

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

	protected ELNExperimentModel(RecordModel backingModel) {
		super(backingModel);
	}
	
	/**
	 * Retrieves the value stored on the {@link #CLUSTER_WITH_CBOT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ClusterWithCBot<br/>
	 * <br/>
	 * <b>Display Name</b>: Cluster With CBot<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "ClusterWithCBot" field
	 */
	public void setClusterWithCBot(Boolean value) {
		setField(CLUSTER_WITH_CBOT, value);
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
	 * Retrieves the value stored on the {@link #DATE_COMPLETED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "DateCompleted" field
	 */
	public Long getDateCompleted() {
		return getField(DATE_COMPLETED);
	}
	
	/**
	 * Sets the value stored on the {@link #DATE_COMPLETED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: DateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "DateCompleted" field
	 */
	public void setDateCompleted(Long value) {
		setField(DATE_COMPLETED, value);
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
	 * Retrieves the value stored on the {@link #FLOWCELL_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: FlowcellId<br/>
	 * <br/>
	 * <b>Display Name</b>: Flow Cell ID<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "FlowcellId" field
	 */
	public void setFlowcellId(String value) {
		setField(FLOWCELL_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #ILLUMINA_SEQ_TEMPLATE_DESCRIPTION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IlluminaSeqTemplateDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "IlluminaSeqTemplateDescription" field
	 */
	public String getIlluminaSeqTemplateDescription() {
		return getField(ILLUMINA_SEQ_TEMPLATE_DESCRIPTION);
	}
	
	/**
	 * Sets the value stored on the {@link #ILLUMINA_SEQ_TEMPLATE_DESCRIPTION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: IlluminaSeqTemplateDescription<br/>
	 * <br/>
	 * <b>Display Name</b>: Description<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "IlluminaSeqTemplateDescription" field
	 */
	public void setIlluminaSeqTemplateDescription(String value) {
		setField(ILLUMINA_SEQ_TEMPLATE_DESCRIPTION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOCKED_AWAITING_APPROVAL_SINCE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LockedAwaitingApprovalSince<br/>
	 * <br/>
	 * <b>Display Name</b>: Locked Awaiting Approval Since<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LockedAwaitingApprovalSince" field
	 */
	public Long getLockedAwaitingApprovalSince() {
		return getField(LOCKED_AWAITING_APPROVAL_SINCE);
	}
	
	/**
	 * Sets the value stored on the {@link #LOCKED_AWAITING_APPROVAL_SINCE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LockedAwaitingApprovalSince<br/>
	 * <br/>
	 * <b>Display Name</b>: Locked Awaiting Approval Since<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LockedAwaitingApprovalSince" field
	 */
	public void setLockedAwaitingApprovalSince(Long value) {
		setField(LOCKED_AWAITING_APPROVAL_SINCE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RUN_COMPLETED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "RunCompleted" field
	 */
	public Boolean getRunCompleted() {
		return getField(RUN_COMPLETED);
	}
	
	/**
	 * Sets the value stored on the {@link #RUN_COMPLETED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Run Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "RunCompleted" field
	 */
	public void setRunCompleted(Boolean value) {
		setField(RUN_COMPLETED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #RUN_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: RunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Run ID<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "RunId" field
	 */
	public void setRunId(String value) {
		setField(RUN_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCER_INSTRUMENT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerInstrument<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Used<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "SequencerInstrument" field
	 */
	public void setSequencerInstrument(String value) {
		setField(SEQUENCER_INSTRUMENT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCER_RUN_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerRunDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Date<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "SequencerRunDate" field
	 */
	public Long getSequencerRunDate() {
		return getField(SEQUENCER_RUN_DATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SEQUENCER_RUN_DATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerRunDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Date<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "SequencerRunDate" field
	 */
	public void setSequencerRunDate(Long value) {
		setField(SEQUENCER_RUN_DATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SEQUENCER_RUN_FOLDER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SequencerRunFolder<br/>
	 * <br/>
	 * <b>Display Name</b>: Sequencer Run Folder<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
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
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "SequencingRunMode" field
	 */
	public void setSequencingRunMode(String value) {
		setField(SEQUENCING_RUN_MODE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SIDE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Side<br/>
	 * <br/>
	 * <b>Display Name</b>: Side<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "Side" field
	 */
	public String getSide() {
		return getField(SIDE);
	}
	
	/**
	 * Sets the value stored on the {@link #SIDE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: Side<br/>
	 * <br/>
	 * <b>Display Name</b>: Side<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "Side" field
	 */
	public void setSide(String value) {
		setField(SIDE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPLATE_EXPERIMENT_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemplateExperimentName<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Experiment<br/>
	 * <br/>
	 * <b>Description</b>: The name of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 * 
	 * @return the value stored on the "TemplateExperimentName" field
	 */
	public String getTemplateExperimentName() {
		return getField(TEMPLATE_EXPERIMENT_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPLATE_EXPERIMENT_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemplateExperimentName<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Experiment<br/>
	 * <br/>
	 * <b>Description</b>: The name of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 * 
	 * @param value The value to set on the "TemplateExperimentName" field
	 */
	public void setTemplateExperimentName(String value) {
		setField(TEMPLATE_EXPERIMENT_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TEMPLATE_VERSION} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemplateVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Version<br/>
	 * <br/>
	 * <b>Description</b>: The version of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 * 
	 * @return the value stored on the "TemplateVersion" field
	 */
	public Long getTemplateVersion() {
		return getField(TEMPLATE_VERSION);
	}
	
	/**
	 * Sets the value stored on the {@link #TEMPLATE_VERSION} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TemplateVersion<br/>
	 * <br/>
	 * <b>Display Name</b>: Template Version<br/>
	 * <br/>
	 * <b>Description</b>: The version of the TemplateExperiment that this E-Notebook Experiment record was created from.
	 * 
	 * @param value The value to set on the "TemplateVersion" field
	 */
	public void setTemplateVersion(Long value) {
		setField(TEMPLATE_VERSION, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #TIME_COMPLETED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TimeCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @return the value stored on the "TimeCompleted" field
	 */
	public String getTimeCompleted() {
		return getField(TIME_COMPLETED);
	}
	
	/**
	 * Sets the value stored on the {@link #TIME_COMPLETED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: TimeCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Time Completed<br/>
	 * <br/>
	 * <b>Description</b>: For Instrument Run Monitor (IRM)
	 * 
	 * @param value The value to set on the "TimeCompleted" field
	 */
	public void setTimeCompleted(String value) {
		setField(TIME_COMPLETED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOXOWNER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VELOXOWNER<br/>
	 * <br/>
	 * <b>Display Name</b>: Owner<br/>
	 * <br/>
	 * <b>Description</b>: The owner of the Notebook Experiment. Owner may assign roles to an unlocked experiment.
	 * 
	 * @return the value stored on the "VELOXOWNER" field
	 */
	public String getVELOXOWNER() {
		return getField(VELOXOWNER);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOXOWNER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VELOXOWNER<br/>
	 * <br/>
	 * <b>Display Name</b>: Owner<br/>
	 * <br/>
	 * <b>Description</b>: The owner of the Notebook Experiment. Owner may assign roles to an unlocked experiment.
	 * 
	 * @param value The value to set on the "VELOXOWNER" field
	 */
	public void setVELOXOWNER(String value) {
		setField(VELOXOWNER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_COMPLETED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: The user that completed the Notebook Experiment.
	 * 
	 * @return the value stored on the "VeloxCompletedBy" field
	 */
	public String getVeloxCompletedBy() {
		return getField(VELOX_COMPLETED_BY);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_COMPLETED_BY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxCompletedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Completed By<br/>
	 * <br/>
	 * <b>Description</b>: The user that completed the Notebook Experiment.
	 * 
	 * @param value The value to set on the "VeloxCompletedBy" field
	 */
	public void setVeloxCompletedBy(String value) {
		setField(VELOX_COMPLETED_BY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_DATE_COMPLETED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxDateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: The timestamp when the Notebook Experiment was marked completed.
	 * 
	 * @return the value stored on the "VeloxDateCompleted" field
	 */
	public Long getVeloxDateCompleted() {
		return getField(VELOX_DATE_COMPLETED);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_DATE_COMPLETED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxDateCompleted<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Completed<br/>
	 * <br/>
	 * <b>Description</b>: The timestamp when the Notebook Experiment was marked completed.
	 * 
	 * @param value The value to set on the "VeloxDateCompleted" field
	 */
	public void setVeloxDateCompleted(Long value) {
		setField(VELOX_DATE_COMPLETED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #VELOX_EXPERIMENT_STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxExperimentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Experiment Status<br/>
	 * <br/>
	 * <b>Description</b>: The status of the Notebook Experiment.
	 * 
	 * @return the value stored on the "VeloxExperimentStatus" field
	 */
	public String getVeloxExperimentStatus() {
		return getField(VELOX_EXPERIMENT_STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #VELOX_EXPERIMENT_STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: VeloxExperimentStatus<br/>
	 * <br/>
	 * <b>Display Name</b>: Experiment Status<br/>
	 * <br/>
	 * <b>Description</b>: The status of the Notebook Experiment.
	 * 
	 * @param value The value to set on the "VeloxExperimentStatus" field
	 */
	public void setVeloxExperimentStatus(String value) {
		setField(VELOX_EXPERIMENT_STATUS, value);
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