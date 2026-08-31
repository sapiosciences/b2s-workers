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
 * Automatically generated class for: Assay Run Result
 */
@ExemplarDataTypeModel(dataTypeName="SBA_AssayRunResult")
public class SBA_AssayRunResultModel extends AbstractRecordModelWrapper {

	/**
	 * The name of the Data Type this class represents
	 */
	public static final String DATA_TYPE_NAME = "SBA_AssayRunResult";

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
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_CREATED_BY = "ExponentialDecayRegParameter.CreatedBy";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_DATA_RECORD_NAME = "ExponentialDecayRegParameter.DataRecordName";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_DATE_CREATED = "ExponentialDecayRegParameter.DateCreated";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DecayRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Decay Rate<br/>
	 * <br/>
	 * <b>Description</b>: Inverse of Growth Rate. It is "e" of formula
f(x)=d*(exp(-x/e))
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_DECAY_RATE = "ExponentialDecayRegParameter.DecayRate";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: When intercept is 0, at x=0, the function evaluates to 0. This is how far the curve is being shifted from the center.

This can be assumed to be 0 if the model is decay around origin.

When c is not equal to 0, the formula is: f(x)= c + (d-c)exp(-x/e)
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_INTERCEPT = "ExponentialDecayRegParameter.Intercept";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.OriginalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Original Amount<br/>
	 * <br/>
	 * <b>Description</b>: Original Amount d in formulaf(x)=d*(exp(-x/e)). If the graph is shifted by intercept, then this is not the original amount, but is instead the original amount BEFORE the graph is shifted.
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_ORIGINAL_AMOUNT = "ExponentialDecayRegParameter.OriginalAmount";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_RECORD_ID = "ExponentialDecayRegParameter.RecordId";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_BY = "ExponentialDecayRegParameter.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_DATE = "ExponentialDecayRegParameter.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_CREATED_BY = "LinearRegressionParameter.CreatedBy";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_DATA_RECORD_NAME = "LinearRegressionParameter.DataRecordName";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_DATE_CREATED = "LinearRegressionParameter.DateCreated";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: The intercept in linear regression
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_INTERCEPT = "LinearRegressionParameter.Intercept";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_RECORD_ID = "LinearRegressionParameter.RecordId";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED = "LinearRegressionParameter.SBA_AdjRSquared";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_SBA___RSQUARED = "LinearRegressionParameter.SBA_RSquared";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.Slope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: The slope in linear regression
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_SLOPE = "LinearRegressionParameter.Slope";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY = "LinearRegressionParameter.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: LinearRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE = "LinearRegressionParameter.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_CREATED_BY = "LogisticRegressionParameter.CreatedBy";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_DATA_RECORD_NAME = "LogisticRegressionParameter.DataRecordName";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_DATE_CREATED = "LogisticRegressionParameter.DateCreated";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticAsymmetry<br/>
	 * <br/>
	 * <b>Display Name</b>: Asymmetry (5P only)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ASYMMETRY = "LogisticRegressionParameter.LogisticAsymmetry";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticBottom<br/>
	 * <br/>
	 * <b>Display Name</b>: Bottom<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_BOTTOM = "LogisticRegressionParameter.LogisticBottom";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticICEC50<br/>
	 * <br/>
	 * <b>Display Name</b>: IC50/EC50<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ICEC_50 = "LogisticRegressionParameter.LogisticICEC50";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticSlope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_SLOPE = "LogisticRegressionParameter.LogisticSlope";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticTop<br/>
	 * <br/>
	 * <b>Display Name</b>: Top<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_TOP = "LogisticRegressionParameter.LogisticTop";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_RECORD_ID = "LogisticRegressionParameter.RecordId";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY = "LogisticRegressionParameter.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: LogisticRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE = "LogisticRegressionParameter.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_CREATED_BY = "QuadraticRegressionParameter.CreatedBy";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_DATA_RECORD_NAME = "QuadraticRegressionParameter.DataRecordName";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_DATE_CREATED = "QuadraticRegressionParameter.DateCreated";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticA<br/>
	 * <br/>
	 * <b>Display Name</b>: A<br/>
	 * <br/>
	 * <b>Description</b>: Parameter A in the model y = a*x^2 + b*x + c
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_A = "QuadraticRegressionParameter.QuadraticA";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticB<br/>
	 * <br/>
	 * <b>Display Name</b>: B<br/>
	 * <br/>
	 * <b>Description</b>: Parameter B in the model y = a*x^2 + b*x + c
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_B = "QuadraticRegressionParameter.QuadraticB";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticC<br/>
	 * <br/>
	 * <b>Display Name</b>: C<br/>
	 * <br/>
	 * <b>Description</b>: Parameter C in the model y = a*x^2 + b*x + c
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_C = "QuadraticRegressionParameter.QuadraticC";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_RECORD_ID = "QuadraticRegressionParameter.RecordId";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED = "QuadraticRegressionParameter.SBA_AdjRSquared";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_SBA___RSQUARED = "QuadraticRegressionParameter.SBA_RSquared";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY = "QuadraticRegressionParameter.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE = "QuadraticRegressionParameter.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String RECORD_ID = "RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_CREATED_BY = "SBA_AccAndPrecIntraResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_DATA_RECORD_NAME = "SBA_AccAndPrecIntraResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_DATE_CREATED = "SBA_AccAndPrecIntraResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_RECORD_ID = "SBA_AccAndPrecIntraResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass CV% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_CVCHECK_INTRA = "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass Bias% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_MEAN_BIAS_INTRA = "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_AccAndPrecIntraResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_AccAndPrecIntraResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_AcceptOrReject<br/>
	 * <br/>
	 * <b>Display Name</b>: Accept/Reject<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject (regardless of the Pass/Fail status determined by System)
	 */
	public static final String SBA___ACCEPT_OR_REJECT = "SBA_AcceptOrReject";

	/**
	 * <b>Data Field Name</b>: SBA_AllQCLevelsPassCVCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All QC Pass CV Check<br/>
	 * <br/>
	 * <b>Description</b>: [Common Result] Whether all QC levels pass CV% limit check
	 */
	public static final String SBA___ALL_QCLEVELS_PASS_CVCHECK = "SBA_AllQCLevelsPassCVCheck";

	/**
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___ANALYTE_NAME = "SBA_AnalyteName";

	/**
	 * <b>Data Field Name</b>: SBA_AssayRunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Captures the analysis workflow Experiment Record ID
	 */
	public static final String SBA___ASSAY_RUN_ID = "SBA_AssayRunId";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_CREATED_BY = "SBA_CalibrationCurveResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_DATA_RECORD_NAME = "SBA_CalibrationCurveResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_DATE_CREATED = "SBA_CalibrationCurveResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_RECORD_ID = "SBA_CalibrationCurveResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDLEVELS = "SBA_CalibrationCurveResults.SBA_NumSTDLevels";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDPASS_RATE = "SBA_CalibrationCurveResults.SBA_NumSTDPassRate";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass<br/>
	 * <br/>
	 * <b>Display Name</b>: Within STD Level Bias% Check Passed<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result] 50 % standards should pass the Bias% check per concentration level.
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_SBA___WITHIN_STD_LEVEL_BIAS_PASS = "SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_CalibrationCurveResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_CalibrationCurveResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___CARRY_OVER_RESULTS_CREATED_BY = "SBA_CarryOverResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___CARRY_OVER_RESULTS_DATA_RECORD_NAME = "SBA_CarryOverResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___CARRY_OVER_RESULTS_DATE_CREATED = "SBA_CarryOverResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___CARRY_OVER_RESULTS_RECORD_ID = "SBA_CarryOverResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CALC_AREA_RATIO_CARRYOVER = "SBA_CarryOverResults.SBA_CalcAreaRatioCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CALC_ISCARRYOVER = "SBA_CarryOverResults.SBA_CalcISCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcPeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CALC_PEAK_AREA_CARRYOVER = "SBA_CarryOverResults.SBA_CalcPeakAreaCarryover";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Area Ratio Carryover Percentage ((Mean Carryover Blank Area Ratio / Mean Reference Control Area Ratio) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_AREA_RATIO = "SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard Carryover Percentage ((Mean Carryover Blank IS Result / Configured IS Result) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_IS = "SBA_CarryOverResults.SBA_CarryoverAgainstIS";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Peak Area Carryover Percentage ((Mean Carryover Blank Peak Area / Mean Reference Control Peak Area) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_LLOQ = "SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_ReferenceControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Reference Control<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CARRY_OVER_RESULTS_SBA___REFERENCE_CONTROL = "SBA_CarryOverResults.SBA_ReferenceControl";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_CarryOverResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_CarryOverResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_CarryOverResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_CurveFitModelName<br/>
	 * <br/>
	 * <b>Display Name</b>: Curve Fit Model<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___CURVE_FIT_MODEL_NAME = "SBA_CurveFitModelName";

	/**
	 * <b>Data Field Name</b>: SBA_FailureDetected<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Detected<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 */
	public static final String SBA___FAILURE_DETECTED = "SBA_FailureDetected";

	/**
	 * <b>Data Field Name</b>: SBA_FailureReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason determined by system that the result does not pass the Acceptance/Validation Criteria.
	 */
	public static final String SBA___FAILURE_REASON = "SBA_FailureReason";

	/**
	 * <b>Data Field Name</b>: SBA_ManualOverrideReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Override Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually overridden.
	 */
	public static final String SBA___MANUAL_OVERRIDE_REASON = "SBA_ManualOverrideReason";

	/**
	 * <b>Data Field Name</b>: SBA_ManualRejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually rejected.
	 */
	public static final String SBA___MANUAL_REJECTION_REASON = "SBA_ManualRejectionReason";

	/**
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 */
	public static final String SBA___PLATE_ID = "SBA_PlateId";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___RECOVERY_RESULTS_CREATED_BY = "SBA_RecoveryResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___RECOVERY_RESULTS_DATA_RECORD_NAME = "SBA_RecoveryResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___RECOVERY_RESULTS_DATE_CREATED = "SBA_RecoveryResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___RECOVERY_RESULTS_RECORD_ID = "SBA_RecoveryResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.SBA_MaxMinRecoveryDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 */
	public static final String SBA___RECOVERY_RESULTS_SBA___MAX_MIN_RECOVERY_DIFF = "SBA_RecoveryResults.SBA_MaxMinRecoveryDiff";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_RecoveryResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_RecoveryResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_RecoveryResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___SELECTIVITY_RESULTS_CREATED_BY = "SBA_SelectivityResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___SELECTIVITY_RESULTS_DATA_RECORD_NAME = "SBA_SelectivityResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___SELECTIVITY_RESULTS_DATE_CREATED = "SBA_SelectivityResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___SELECTIVITY_RESULTS_RECORD_ID = "SBA_SelectivityResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesIS<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against IS response
	 */
	public static final String SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_IS = "SBA_SelectivityResults.SBA_NumPassedSamplesIS";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against LLOQ
	 */
	public static final String SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_LLOQ = "SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_SelectivityResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SelectivityResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_SelectivityResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 */
	public static final String SBA___SENSITIVITY_RESULTS_CREATED_BY = "SBA_SensitivityResults.CreatedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 */
	public static final String SBA___SENSITIVITY_RESULTS_DATA_RECORD_NAME = "SBA_SensitivityResults.DataRecordName";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 */
	public static final String SBA___SENSITIVITY_RESULTS_DATE_CREATED = "SBA_SensitivityResults.DateCreated";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 */
	public static final String SBA___SENSITIVITY_RESULTS_RECORD_ID = "SBA_SensitivityResults.RecordId";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.SBA_AllPassBiasCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All Replicates Pass Bias Check<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity Result] Whether all replicates pass the Bias% limit check
	 */
	public static final String SBA___SENSITIVITY_RESULTS_SBA___ALL_PASS_BIAS_CHECK = "SBA_SensitivityResults.SBA_AllPassBiasCheck";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 */
	public static final String SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_BY = "SBA_SensitivityResults.VeloxLastModifiedBy";

	/**
	 * <b>Data Field Name</b>: SBA_SensitivityResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 */
	public static final String SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE = "SBA_SensitivityResults.VeloxLastModifiedDate";

	/**
	 * <b>Data Field Name</b>: SBA_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Acceptance Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: Determined by system. Fail or Pass the Run Acceptance Criteria (Method Execution) or Parameter Evaluation Criteria (Method Validation).
	 */
	public static final String SBA___STATUS = "SBA_Status";

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

	protected SBA_AssayRunResultModel(RecordModel backingModel) {
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
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.CreatedBy" field
	 */
	public String getExponentialDecayRegParameterCreatedBy() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.DataRecordName" field
	 */
	public String getExponentialDecayRegParameterDataRecordName() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.DateCreated" field
	 */
	public Long getExponentialDecayRegParameterDateCreated() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_DECAY_RATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DecayRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Decay Rate<br/>
	 * <br/>
	 * <b>Description</b>: Inverse of Growth Rate. It is "e" of formula
f(x)=d*(exp(-x/e))
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.DecayRate" field
	 */
	public Double getExponentialDecayRegParameterDecayRate() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_DECAY_RATE);
	}
	
	/**
	 * Sets the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_DECAY_RATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.DecayRate<br/>
	 * <br/>
	 * <b>Display Name</b>: Decay Rate<br/>
	 * <br/>
	 * <b>Description</b>: Inverse of Growth Rate. It is "e" of formula
f(x)=d*(exp(-x/e))
	 * 
	 * @param value The value to set on the "ExponentialDecayRegParameter.DecayRate" field
	 */
	public void setExponentialDecayRegParameterDecayRate(Double value) {
		setField(EXPONENTIAL_DECAY_REG_PARAMETER_DECAY_RATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_INTERCEPT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: When intercept is 0, at x=0, the function evaluates to 0. This is how far the curve is being shifted from the center.

This can be assumed to be 0 if the model is decay around origin.

When c is not equal to 0, the formula is: f(x)= c + (d-c)exp(-x/e)
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.Intercept" field
	 */
	public Double getExponentialDecayRegParameterIntercept() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_INTERCEPT);
	}
	
	/**
	 * Sets the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_INTERCEPT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: When intercept is 0, at x=0, the function evaluates to 0. This is how far the curve is being shifted from the center.

This can be assumed to be 0 if the model is decay around origin.

When c is not equal to 0, the formula is: f(x)= c + (d-c)exp(-x/e)
	 * 
	 * @param value The value to set on the "ExponentialDecayRegParameter.Intercept" field
	 */
	public void setExponentialDecayRegParameterIntercept(Double value) {
		setField(EXPONENTIAL_DECAY_REG_PARAMETER_INTERCEPT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_ORIGINAL_AMOUNT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.OriginalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Original Amount<br/>
	 * <br/>
	 * <b>Description</b>: Original Amount d in formulaf(x)=d*(exp(-x/e)). If the graph is shifted by intercept, then this is not the original amount, but is instead the original amount BEFORE the graph is shifted.
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.OriginalAmount" field
	 */
	public Double getExponentialDecayRegParameterOriginalAmount() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_ORIGINAL_AMOUNT);
	}
	
	/**
	 * Sets the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_ORIGINAL_AMOUNT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.OriginalAmount<br/>
	 * <br/>
	 * <b>Display Name</b>: Original Amount<br/>
	 * <br/>
	 * <b>Description</b>: Original Amount d in formulaf(x)=d*(exp(-x/e)). If the graph is shifted by intercept, then this is not the original amount, but is instead the original amount BEFORE the graph is shifted.
	 * 
	 * @param value The value to set on the "ExponentialDecayRegParameter.OriginalAmount" field
	 */
	public void setExponentialDecayRegParameterOriginalAmount(Double value) {
		setField(EXPONENTIAL_DECAY_REG_PARAMETER_ORIGINAL_AMOUNT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.RecordId" field
	 */
	public Long getExponentialDecayRegParameterRecordId() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.VeloxLastModifiedBy" field
	 */
	public String getExponentialDecayRegParameterVeloxLastModifiedBy() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: ExponentialDecayRegParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "ExponentialDecayRegParameter.VeloxLastModifiedDate" field
	 */
	public Long getExponentialDecayRegParameterVeloxLastModifiedDate() {
		return getField(EXPONENTIAL_DECAY_REG_PARAMETER_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "LinearRegressionParameter.CreatedBy" field
	 */
	public String getLinearRegressionParameterCreatedBy() {
		return getField(LINEAR_REGRESSION_PARAMETER_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "LinearRegressionParameter.DataRecordName" field
	 */
	public String getLinearRegressionParameterDataRecordName() {
		return getField(LINEAR_REGRESSION_PARAMETER_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "LinearRegressionParameter.DateCreated" field
	 */
	public Long getLinearRegressionParameterDateCreated() {
		return getField(LINEAR_REGRESSION_PARAMETER_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_INTERCEPT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: The intercept in linear regression
	 * 
	 * @return the value stored on the "LinearRegressionParameter.Intercept" field
	 */
	public Double getLinearRegressionParameterIntercept() {
		return getField(LINEAR_REGRESSION_PARAMETER_INTERCEPT);
	}
	
	/**
	 * Sets the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_INTERCEPT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.Intercept<br/>
	 * <br/>
	 * <b>Display Name</b>: Intercept<br/>
	 * <br/>
	 * <b>Description</b>: The intercept in linear regression
	 * 
	 * @param value The value to set on the "LinearRegressionParameter.Intercept" field
	 */
	public void setLinearRegressionParameterIntercept(Double value) {
		setField(LINEAR_REGRESSION_PARAMETER_INTERCEPT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "LinearRegressionParameter.RecordId" field
	 */
	public Long getLinearRegressionParameterRecordId() {
		return getField(LINEAR_REGRESSION_PARAMETER_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 * 
	 * @return the value stored on the "LinearRegressionParameter.SBA_AdjRSquared" field
	 */
	public Double getLinearRegressionParameterSBA_AdjRSquared() {
		return getField(LINEAR_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED);
	}
	
	/**
	 * Sets the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 * 
	 * @param value The value to set on the "LinearRegressionParameter.SBA_AdjRSquared" field
	 */
	public void setLinearRegressionParameterSBA_AdjRSquared(Double value) {
		setField(LINEAR_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SBA___RSQUARED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 * 
	 * @return the value stored on the "LinearRegressionParameter.SBA_RSquared" field
	 */
	public Double getLinearRegressionParameterSBA_RSquared() {
		return getField(LINEAR_REGRESSION_PARAMETER_SBA___RSQUARED);
	}
	
	/**
	 * Sets the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SBA___RSQUARED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 * 
	 * @param value The value to set on the "LinearRegressionParameter.SBA_RSquared" field
	 */
	public void setLinearRegressionParameterSBA_RSquared(Double value) {
		setField(LINEAR_REGRESSION_PARAMETER_SBA___RSQUARED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SLOPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.Slope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: The slope in linear regression
	 * 
	 * @return the value stored on the "LinearRegressionParameter.Slope" field
	 */
	public Double getLinearRegressionParameterSlope() {
		return getField(LINEAR_REGRESSION_PARAMETER_SLOPE);
	}
	
	/**
	 * Sets the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_SLOPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.Slope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: The slope in linear regression
	 * 
	 * @param value The value to set on the "LinearRegressionParameter.Slope" field
	 */
	public void setLinearRegressionParameterSlope(Double value) {
		setField(LINEAR_REGRESSION_PARAMETER_SLOPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "LinearRegressionParameter.VeloxLastModifiedBy" field
	 */
	public String getLinearRegressionParameterVeloxLastModifiedBy() {
		return getField(LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LinearRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "LinearRegressionParameter.VeloxLastModifiedDate" field
	 */
	public Long getLinearRegressionParameterVeloxLastModifiedDate() {
		return getField(LINEAR_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.CreatedBy" field
	 */
	public String getLogisticRegressionParameterCreatedBy() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.DataRecordName" field
	 */
	public String getLogisticRegressionParameterDataRecordName() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.DateCreated" field
	 */
	public Long getLogisticRegressionParameterDateCreated() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ASYMMETRY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticAsymmetry<br/>
	 * <br/>
	 * <b>Display Name</b>: Asymmetry (5P only)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.LogisticAsymmetry" field
	 */
	public Double getLogisticRegressionParameterLogisticAsymmetry() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ASYMMETRY);
	}
	
	/**
	 * Sets the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ASYMMETRY} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticAsymmetry<br/>
	 * <br/>
	 * <b>Display Name</b>: Asymmetry (5P only)<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LogisticRegressionParameter.LogisticAsymmetry" field
	 */
	public void setLogisticRegressionParameterLogisticAsymmetry(Double value) {
		setField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ASYMMETRY, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_BOTTOM} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticBottom<br/>
	 * <br/>
	 * <b>Display Name</b>: Bottom<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.LogisticBottom" field
	 */
	public Double getLogisticRegressionParameterLogisticBottom() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_BOTTOM);
	}
	
	/**
	 * Sets the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_BOTTOM} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticBottom<br/>
	 * <br/>
	 * <b>Display Name</b>: Bottom<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LogisticRegressionParameter.LogisticBottom" field
	 */
	public void setLogisticRegressionParameterLogisticBottom(Double value) {
		setField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_BOTTOM, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ICEC_50} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticICEC50<br/>
	 * <br/>
	 * <b>Display Name</b>: IC50/EC50<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.LogisticICEC50" field
	 */
	public Double getLogisticRegressionParameterLogisticICEC50() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ICEC_50);
	}
	
	/**
	 * Sets the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ICEC_50} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticICEC50<br/>
	 * <br/>
	 * <b>Display Name</b>: IC50/EC50<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LogisticRegressionParameter.LogisticICEC50" field
	 */
	public void setLogisticRegressionParameterLogisticICEC50(Double value) {
		setField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_ICEC_50, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_SLOPE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticSlope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.LogisticSlope" field
	 */
	public Double getLogisticRegressionParameterLogisticSlope() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_SLOPE);
	}
	
	/**
	 * Sets the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_SLOPE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticSlope<br/>
	 * <br/>
	 * <b>Display Name</b>: Slope<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LogisticRegressionParameter.LogisticSlope" field
	 */
	public void setLogisticRegressionParameterLogisticSlope(Double value) {
		setField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_SLOPE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_TOP} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticTop<br/>
	 * <br/>
	 * <b>Display Name</b>: Top<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.LogisticTop" field
	 */
	public Double getLogisticRegressionParameterLogisticTop() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_TOP);
	}
	
	/**
	 * Sets the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_TOP} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.LogisticTop<br/>
	 * <br/>
	 * <b>Display Name</b>: Top<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "LogisticRegressionParameter.LogisticTop" field
	 */
	public void setLogisticRegressionParameterLogisticTop(Double value) {
		setField(LOGISTIC_REGRESSION_PARAMETER_LOGISTIC_TOP, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.RecordId" field
	 */
	public Long getLogisticRegressionParameterRecordId() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.VeloxLastModifiedBy" field
	 */
	public String getLogisticRegressionParameterVeloxLastModifiedBy() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: LogisticRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "LogisticRegressionParameter.VeloxLastModifiedDate" field
	 */
	public Long getLogisticRegressionParameterVeloxLastModifiedDate() {
		return getField(LOGISTIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.CreatedBy" field
	 */
	public String getQuadraticRegressionParameterCreatedBy() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.DataRecordName" field
	 */
	public String getQuadraticRegressionParameterDataRecordName() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.DateCreated" field
	 */
	public Long getQuadraticRegressionParameterDateCreated() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_A} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticA<br/>
	 * <br/>
	 * <b>Display Name</b>: A<br/>
	 * <br/>
	 * <b>Description</b>: Parameter A in the model y = a*x^2 + b*x + c
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.QuadraticA" field
	 */
	public Double getQuadraticRegressionParameterQuadraticA() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_A);
	}
	
	/**
	 * Sets the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_A} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticA<br/>
	 * <br/>
	 * <b>Display Name</b>: A<br/>
	 * <br/>
	 * <b>Description</b>: Parameter A in the model y = a*x^2 + b*x + c
	 * 
	 * @param value The value to set on the "QuadraticRegressionParameter.QuadraticA" field
	 */
	public void setQuadraticRegressionParameterQuadraticA(Double value) {
		setField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_A, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_B} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticB<br/>
	 * <br/>
	 * <b>Display Name</b>: B<br/>
	 * <br/>
	 * <b>Description</b>: Parameter B in the model y = a*x^2 + b*x + c
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.QuadraticB" field
	 */
	public Double getQuadraticRegressionParameterQuadraticB() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_B);
	}
	
	/**
	 * Sets the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_B} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticB<br/>
	 * <br/>
	 * <b>Display Name</b>: B<br/>
	 * <br/>
	 * <b>Description</b>: Parameter B in the model y = a*x^2 + b*x + c
	 * 
	 * @param value The value to set on the "QuadraticRegressionParameter.QuadraticB" field
	 */
	public void setQuadraticRegressionParameterQuadraticB(Double value) {
		setField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_B, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_C} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticC<br/>
	 * <br/>
	 * <b>Display Name</b>: C<br/>
	 * <br/>
	 * <b>Description</b>: Parameter C in the model y = a*x^2 + b*x + c
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.QuadraticC" field
	 */
	public Double getQuadraticRegressionParameterQuadraticC() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_C);
	}
	
	/**
	 * Sets the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_C} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.QuadraticC<br/>
	 * <br/>
	 * <b>Display Name</b>: C<br/>
	 * <br/>
	 * <b>Description</b>: Parameter C in the model y = a*x^2 + b*x + c
	 * 
	 * @param value The value to set on the "QuadraticRegressionParameter.QuadraticC" field
	 */
	public void setQuadraticRegressionParameterQuadraticC(Double value) {
		setField(QUADRATIC_REGRESSION_PARAMETER_QUADRATIC_C, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.RecordId" field
	 */
	public Long getQuadraticRegressionParameterRecordId() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.SBA_AdjRSquared" field
	 */
	public Double getQuadraticRegressionParameterSBA_AdjRSquared() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED);
	}
	
	/**
	 * Sets the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_AdjRSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: Adjusted R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The adjusted r^2 value of the fitting.
	 * 
	 * @param value The value to set on the "QuadraticRegressionParameter.SBA_AdjRSquared" field
	 */
	public void setQuadraticRegressionParameterSBA_AdjRSquared(Double value) {
		setField(QUADRATIC_REGRESSION_PARAMETER_SBA___ADJ_RSQUARED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_SBA___RSQUARED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.SBA_RSquared" field
	 */
	public Double getQuadraticRegressionParameterSBA_RSquared() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_SBA___RSQUARED);
	}
	
	/**
	 * Sets the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_SBA___RSQUARED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.SBA_RSquared<br/>
	 * <br/>
	 * <b>Display Name</b>: R Squared<br/>
	 * <br/>
	 * <b>Description</b>: The r^2 value of the fitting
	 * 
	 * @param value The value to set on the "QuadraticRegressionParameter.SBA_RSquared" field
	 */
	public void setQuadraticRegressionParameterSBA_RSquared(Double value) {
		setField(QUADRATIC_REGRESSION_PARAMETER_SBA___RSQUARED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.VeloxLastModifiedBy" field
	 */
	public String getQuadraticRegressionParameterVeloxLastModifiedBy() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: QuadraticRegressionParameter.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "QuadraticRegressionParameter.VeloxLastModifiedDate" field
	 */
	public Long getQuadraticRegressionParameterVeloxLastModifiedDate() {
		return getField(QUADRATIC_REGRESSION_PARAMETER_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.CreatedBy" field
	 */
	public String getSBA_AccAndPrecIntraResultsCreatedBy() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.DataRecordName" field
	 */
	public String getSBA_AccAndPrecIntraResultsDataRecordName() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.DateCreated" field
	 */
	public Long getSBA_AccAndPrecIntraResultsDateCreated() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.RecordId" field
	 */
	public Long getSBA_AccAndPrecIntraResultsRecordId() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_CVCHECK_INTRA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass CV% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra" field
	 */
	public Boolean getSBA_AccAndPrecIntraResultsSBA_AllLevelsPassCVCheckIntra() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_CVCHECK_INTRA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_CVCHECK_INTRA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass CV% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassCVCheckIntra" field
	 */
	public void setSBA_AccAndPrecIntraResultsSBA_AllLevelsPassCVCheckIntra(Boolean value) {
		setField(SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_CVCHECK_INTRA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_MEAN_BIAS_INTRA} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass Bias% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra" field
	 */
	public Boolean getSBA_AccAndPrecIntraResultsSBA_AllLevelsPassMeanBiasIntra() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_MEAN_BIAS_INTRA);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_MEAN_BIAS_INTRA} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra<br/>
	 * <br/>
	 * <b>Display Name</b>: All Levels Pass Bias% Check<br/>
	 * <br/>
	 * <b>Description</b>: [Accuracy & Precision - Intra, Result]
	 * 
	 * @param value The value to set on the "SBA_AccAndPrecIntraResults.SBA_AllLevelsPassMeanBiasIntra" field
	 */
	public void setSBA_AccAndPrecIntraResultsSBA_AllLevelsPassMeanBiasIntra(Boolean value) {
		setField(SBA___ACC_AND_PREC_INTRA_RESULTS_SBA___ALL_LEVELS_PASS_MEAN_BIAS_INTRA, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_AccAndPrecIntraResultsVeloxLastModifiedBy() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AccAndPrecIntraResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_AccAndPrecIntraResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_AccAndPrecIntraResultsVeloxLastModifiedDate() {
		return getField(SBA___ACC_AND_PREC_INTRA_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ACCEPT_OR_REJECT} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AcceptOrReject<br/>
	 * <br/>
	 * <b>Display Name</b>: Accept/Reject<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject (regardless of the Pass/Fail status determined by System)
	 * 
	 * @return the value stored on the "SBA_AcceptOrReject" field
	 */
	public String getSBA_AcceptOrReject() {
		return getField(SBA___ACCEPT_OR_REJECT);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ACCEPT_OR_REJECT} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AcceptOrReject<br/>
	 * <br/>
	 * <b>Display Name</b>: Accept/Reject<br/>
	 * <br/>
	 * <b>Description</b>: Accept or Reject (regardless of the Pass/Fail status determined by System)
	 * 
	 * @param value The value to set on the "SBA_AcceptOrReject" field
	 */
	public void setSBA_AcceptOrReject(String value) {
		setField(SBA___ACCEPT_OR_REJECT, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ALL_QCLEVELS_PASS_CVCHECK} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AllQCLevelsPassCVCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All QC Pass CV Check<br/>
	 * <br/>
	 * <b>Description</b>: [Common Result] Whether all QC levels pass CV% limit check
	 * 
	 * @return the value stored on the "SBA_AllQCLevelsPassCVCheck" field
	 */
	public Boolean getSBA_AllQCLevelsPassCVCheck() {
		return getField(SBA___ALL_QCLEVELS_PASS_CVCHECK);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ALL_QCLEVELS_PASS_CVCHECK} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AllQCLevelsPassCVCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All QC Pass CV Check<br/>
	 * <br/>
	 * <b>Description</b>: [Common Result] Whether all QC levels pass CV% limit check
	 * 
	 * @param value The value to set on the "SBA_AllQCLevelsPassCVCheck" field
	 */
	public void setSBA_AllQCLevelsPassCVCheck(Boolean value) {
		setField(SBA___ALL_QCLEVELS_PASS_CVCHECK, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ANALYTE_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_AnalyteName" field
	 */
	public String getSBA_AnalyteName() {
		return getField(SBA___ANALYTE_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ANALYTE_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AnalyteName<br/>
	 * <br/>
	 * <b>Display Name</b>: Analyte Name<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_AnalyteName" field
	 */
	public void setSBA_AnalyteName(String value) {
		setField(SBA___ANALYTE_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___ASSAY_RUN_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayRunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Captures the analysis workflow Experiment Record ID
	 * 
	 * @return the value stored on the "SBA_AssayRunId" field
	 */
	public String getSBA_AssayRunId() {
		return getField(SBA___ASSAY_RUN_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___ASSAY_RUN_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_AssayRunId<br/>
	 * <br/>
	 * <b>Display Name</b>: Assay Run ID<br/>
	 * <br/>
	 * <b>Description</b>: Captures the analysis workflow Experiment Record ID
	 * 
	 * @param value The value to set on the "SBA_AssayRunId" field
	 */
	public void setSBA_AssayRunId(String value) {
		setField(SBA___ASSAY_RUN_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.CreatedBy" field
	 */
	public String getSBA_CalibrationCurveResultsCreatedBy() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.DataRecordName" field
	 */
	public String getSBA_CalibrationCurveResultsDataRecordName() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.DateCreated" field
	 */
	public Long getSBA_CalibrationCurveResultsDateCreated() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.RecordId" field
	 */
	public Long getSBA_CalibrationCurveResultsRecordId() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDLEVELS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.SBA_NumSTDLevels" field
	 */
	public Long getSBA_CalibrationCurveResultsSBA_NumSTDLevels() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDLEVELS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDLEVELS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDLevels<br/>
	 * <br/>
	 * <b>Display Name</b>: # of STD Levels<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveResults.SBA_NumSTDLevels" field
	 */
	public void setSBA_CalibrationCurveResultsSBA_NumSTDLevels(Long value) {
		setField(SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDLEVELS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDPASS_RATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.SBA_NumSTDPassRate" field
	 */
	public Double getSBA_CalibrationCurveResultsSBA_NumSTDPassRate() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDPASS_RATE);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDPASS_RATE} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_NumSTDPassRate<br/>
	 * <br/>
	 * <b>Display Name</b>: STD Pass Rate<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result]
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveResults.SBA_NumSTDPassRate" field
	 */
	public void setSBA_CalibrationCurveResultsSBA_NumSTDPassRate(Double value) {
		setField(SBA___CALIBRATION_CURVE_RESULTS_SBA___NUM_STDPASS_RATE, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___WITHIN_STD_LEVEL_BIAS_PASS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass<br/>
	 * <br/>
	 * <b>Display Name</b>: Within STD Level Bias% Check Passed<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result] 50 % standards should pass the Bias% check per concentration level.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass" field
	 */
	public Boolean getSBA_CalibrationCurveResultsSBA_WithinStdLevelBiasPass() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_SBA___WITHIN_STD_LEVEL_BIAS_PASS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_SBA___WITHIN_STD_LEVEL_BIAS_PASS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass<br/>
	 * <br/>
	 * <b>Display Name</b>: Within STD Level Bias% Check Passed<br/>
	 * <br/>
	 * <b>Description</b>: [Calibration Curve Result] 50 % standards should pass the Bias% check per concentration level.
	 * 
	 * @param value The value to set on the "SBA_CalibrationCurveResults.SBA_WithinStdLevelBiasPass" field
	 */
	public void setSBA_CalibrationCurveResultsSBA_WithinStdLevelBiasPass(Boolean value) {
		setField(SBA___CALIBRATION_CURVE_RESULTS_SBA___WITHIN_STD_LEVEL_BIAS_PASS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_CalibrationCurveResultsVeloxLastModifiedBy() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CalibrationCurveResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_CalibrationCurveResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_CalibrationCurveResultsVeloxLastModifiedDate() {
		return getField(SBA___CALIBRATION_CURVE_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.CreatedBy" field
	 */
	public String getSBA_CarryOverResultsCreatedBy() {
		return getField(SBA___CARRY_OVER_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.DataRecordName" field
	 */
	public String getSBA_CarryOverResultsDataRecordName() {
		return getField(SBA___CARRY_OVER_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.DateCreated" field
	 */
	public Long getSBA_CarryOverResultsDateCreated() {
		return getField(SBA___CARRY_OVER_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.RecordId" field
	 */
	public Long getSBA_CarryOverResultsRecordId() {
		return getField(SBA___CARRY_OVER_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_AREA_RATIO_CARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CalcAreaRatioCarryover" field
	 */
	public Boolean getSBA_CarryOverResultsSBA_CalcAreaRatioCarryover() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CALC_AREA_RATIO_CARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_AREA_RATIO_CARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcAreaRatioCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Area Ratio Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CalcAreaRatioCarryover" field
	 */
	public void setSBA_CarryOverResultsSBA_CalcAreaRatioCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CALC_AREA_RATIO_CARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_ISCARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CalcISCarryover" field
	 */
	public Boolean getSBA_CarryOverResultsSBA_CalcISCarryover() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CALC_ISCARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_ISCARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcISCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Internal Standard Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CalcISCarryover" field
	 */
	public void setSBA_CarryOverResultsSBA_CalcISCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CALC_ISCARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_PEAK_AREA_CARRYOVER} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcPeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CalcPeakAreaCarryover" field
	 */
	public Boolean getSBA_CarryOverResultsSBA_CalcPeakAreaCarryover() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CALC_PEAK_AREA_CARRYOVER);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CALC_PEAK_AREA_CARRYOVER} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CalcPeakAreaCarryover<br/>
	 * <br/>
	 * <b>Display Name</b>: Calculate Peak Area Carryover<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CalcPeakAreaCarryover" field
	 */
	public void setSBA_CarryOverResultsSBA_CalcPeakAreaCarryover(Boolean value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CALC_PEAK_AREA_CARRYOVER, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_AREA_RATIO} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Area Ratio Carryover Percentage ((Mean Carryover Blank Area Ratio / Mean Reference Control Area Ratio) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio" field
	 */
	public Double getSBA_CarryOverResultsSBA_CarryoverAgainstAreaRatio() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_AREA_RATIO);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_AREA_RATIO} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio<br/>
	 * <br/>
	 * <b>Display Name</b>: Area Ratio Carryover Percentage ((Mean Carryover Blank Area Ratio / Mean Reference Control Area Ratio) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CarryoverAgainstAreaRatio" field
	 */
	public void setSBA_CarryOverResultsSBA_CarryoverAgainstAreaRatio(Double value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_AREA_RATIO, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_IS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard Carryover Percentage ((Mean Carryover Blank IS Result / Configured IS Result) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CarryoverAgainstIS" field
	 */
	public Double getSBA_CarryOverResultsSBA_CarryoverAgainstIS() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_IS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_IS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstIS<br/>
	 * <br/>
	 * <b>Display Name</b>: Internal Standard Carryover Percentage ((Mean Carryover Blank IS Result / Configured IS Result) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CarryoverAgainstIS" field
	 */
	public void setSBA_CarryOverResultsSBA_CarryoverAgainstIS(Double value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_IS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Peak Area Carryover Percentage ((Mean Carryover Blank Peak Area / Mean Reference Control Peak Area) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ" field
	 */
	public Double getSBA_CarryOverResultsSBA_CarryoverAgainstLLOQ() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: Peak Area Carryover Percentage ((Mean Carryover Blank Peak Area / Mean Reference Control Peak Area) * 100)<br/>
	 * <br/>
	 * <b>Description</b>: [Carry-over Result]
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_CarryoverAgainstLLOQ" field
	 */
	public void setSBA_CarryOverResultsSBA_CarryoverAgainstLLOQ(Double value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___CARRYOVER_AGAINST_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___REFERENCE_CONTROL} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_ReferenceControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Reference Control<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.SBA_ReferenceControl" field
	 */
	public String getSBA_CarryOverResultsSBA_ReferenceControl() {
		return getField(SBA___CARRY_OVER_RESULTS_SBA___REFERENCE_CONTROL);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CARRY_OVER_RESULTS_SBA___REFERENCE_CONTROL} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.SBA_ReferenceControl<br/>
	 * <br/>
	 * <b>Display Name</b>: Reference Control<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CarryOverResults.SBA_ReferenceControl" field
	 */
	public void setSBA_CarryOverResultsSBA_ReferenceControl(String value) {
		setField(SBA___CARRY_OVER_RESULTS_SBA___REFERENCE_CONTROL, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_CarryOverResultsVeloxLastModifiedBy() {
		return getField(SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CarryOverResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_CarryOverResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_CarryOverResultsVeloxLastModifiedDate() {
		return getField(SBA___CARRY_OVER_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___CURVE_FIT_MODEL_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CurveFitModelName<br/>
	 * <br/>
	 * <b>Display Name</b>: Curve Fit Model<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_CurveFitModelName" field
	 */
	public String getSBA_CurveFitModelName() {
		return getField(SBA___CURVE_FIT_MODEL_NAME);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___CURVE_FIT_MODEL_NAME} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_CurveFitModelName<br/>
	 * <br/>
	 * <b>Display Name</b>: Curve Fit Model<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_CurveFitModelName" field
	 */
	public void setSBA_CurveFitModelName(String value) {
		setField(SBA___CURVE_FIT_MODEL_NAME, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___FAILURE_DETECTED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FailureDetected<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Detected<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @return the value stored on the "SBA_FailureDetected" field
	 */
	public String getSBA_FailureDetected() {
		return getField(SBA___FAILURE_DETECTED);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___FAILURE_DETECTED} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FailureDetected<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Detected<br/>
	 * <br/>
	 * <b>Description</b>: No Description
	 * 
	 * @param value The value to set on the "SBA_FailureDetected" field
	 */
	public void setSBA_FailureDetected(String value) {
		setField(SBA___FAILURE_DETECTED, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___FAILURE_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FailureReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason determined by system that the result does not pass the Acceptance/Validation Criteria.
	 * 
	 * @return the value stored on the "SBA_FailureReason" field
	 */
	public String getSBA_FailureReason() {
		return getField(SBA___FAILURE_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___FAILURE_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_FailureReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Failure Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason determined by system that the result does not pass the Acceptance/Validation Criteria.
	 * 
	 * @param value The value to set on the "SBA_FailureReason" field
	 */
	public void setSBA_FailureReason(String value) {
		setField(SBA___FAILURE_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MANUAL_OVERRIDE_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ManualOverrideReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Override Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually overridden.
	 * 
	 * @return the value stored on the "SBA_ManualOverrideReason" field
	 */
	public String getSBA_ManualOverrideReason() {
		return getField(SBA___MANUAL_OVERRIDE_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MANUAL_OVERRIDE_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ManualOverrideReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Override Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually overridden.
	 * 
	 * @param value The value to set on the "SBA_ManualOverrideReason" field
	 */
	public void setSBA_ManualOverrideReason(String value) {
		setField(SBA___MANUAL_OVERRIDE_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___MANUAL_REJECTION_REASON} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ManualRejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually rejected.
	 * 
	 * @return the value stored on the "SBA_ManualRejectionReason" field
	 */
	public String getSBA_ManualRejectionReason() {
		return getField(SBA___MANUAL_REJECTION_REASON);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___MANUAL_REJECTION_REASON} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_ManualRejectionReason<br/>
	 * <br/>
	 * <b>Display Name</b>: Manual Rejection Reason<br/>
	 * <br/>
	 * <b>Description</b>: The reason that the analyte measurement on a plate is manually rejected.
	 * 
	 * @param value The value to set on the "SBA_ManualRejectionReason" field
	 */
	public void setSBA_ManualRejectionReason(String value) {
		setField(SBA___MANUAL_REJECTION_REASON, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___PLATE_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 * 
	 * @return the value stored on the "SBA_PlateId" field
	 */
	public String getSBA_PlateId() {
		return getField(SBA___PLATE_ID);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___PLATE_ID} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_PlateId<br/>
	 * <br/>
	 * <b>Display Name</b>: Plate ID<br/>
	 * <br/>
	 * <b>Description</b>: This unique identifier will be used to identify the collective storage plate of many plate well records
	 * 
	 * @param value The value to set on the "SBA_PlateId" field
	 */
	public void setSBA_PlateId(String value) {
		setField(SBA___PLATE_ID, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.CreatedBy" field
	 */
	public String getSBA_RecoveryResultsCreatedBy() {
		return getField(SBA___RECOVERY_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.DataRecordName" field
	 */
	public String getSBA_RecoveryResultsDataRecordName() {
		return getField(SBA___RECOVERY_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.DateCreated" field
	 */
	public Long getSBA_RecoveryResultsDateCreated() {
		return getField(SBA___RECOVERY_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.RecordId" field
	 */
	public Long getSBA_RecoveryResultsRecordId() {
		return getField(SBA___RECOVERY_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_SBA___MAX_MIN_RECOVERY_DIFF} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.SBA_MaxMinRecoveryDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.SBA_MaxMinRecoveryDiff" field
	 */
	public Double getSBA_RecoveryResultsSBA_MaxMinRecoveryDiff() {
		return getField(SBA___RECOVERY_RESULTS_SBA___MAX_MIN_RECOVERY_DIFF);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___RECOVERY_RESULTS_SBA___MAX_MIN_RECOVERY_DIFF} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.SBA_MaxMinRecoveryDiff<br/>
	 * <br/>
	 * <b>Display Name</b>: Max&Min Recovery% Diff<br/>
	 * <br/>
	 * <b>Description</b>: [Recovery]
	 * 
	 * @param value The value to set on the "SBA_RecoveryResults.SBA_MaxMinRecoveryDiff" field
	 */
	public void setSBA_RecoveryResultsSBA_MaxMinRecoveryDiff(Double value) {
		setField(SBA___RECOVERY_RESULTS_SBA___MAX_MIN_RECOVERY_DIFF, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_RecoveryResultsVeloxLastModifiedBy() {
		return getField(SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_RecoveryResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_RecoveryResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_RecoveryResultsVeloxLastModifiedDate() {
		return getField(SBA___RECOVERY_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.CreatedBy" field
	 */
	public String getSBA_SelectivityResultsCreatedBy() {
		return getField(SBA___SELECTIVITY_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.DataRecordName" field
	 */
	public String getSBA_SelectivityResultsDataRecordName() {
		return getField(SBA___SELECTIVITY_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.DateCreated" field
	 */
	public Long getSBA_SelectivityResultsDateCreated() {
		return getField(SBA___SELECTIVITY_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.RecordId" field
	 */
	public Long getSBA_SelectivityResultsRecordId() {
		return getField(SBA___SELECTIVITY_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_IS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesIS<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against IS response
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.SBA_NumPassedSamplesIS" field
	 */
	public Long getSBA_SelectivityResultsSBA_NumPassedSamplesIS() {
		return getField(SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_IS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_IS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesIS<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against IS<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against IS response
	 * 
	 * @param value The value to set on the "SBA_SelectivityResults.SBA_NumPassedSamplesIS" field
	 */
	public void setSBA_SelectivityResultsSBA_NumPassedSamplesIS(Long value) {
		setField(SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_IS, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_LLOQ} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against LLOQ
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ" field
	 */
	public Long getSBA_SelectivityResultsSBA_NumPassedSamplesLLOQ() {
		return getField(SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_LLOQ);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_LLOQ} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ<br/>
	 * <br/>
	 * <b>Display Name</b>: # of Passed Blanks against LLOQ<br/>
	 * <br/>
	 * <b>Description</b>: [Selectivity Result] Number of BLANK samples that passed evaluation against LLOQ
	 * 
	 * @param value The value to set on the "SBA_SelectivityResults.SBA_NumPassedSamplesLLOQ" field
	 */
	public void setSBA_SelectivityResultsSBA_NumPassedSamplesLLOQ(Long value) {
		setField(SBA___SELECTIVITY_RESULTS_SBA___NUM_PASSED_SAMPLES_LLOQ, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_SelectivityResultsVeloxLastModifiedBy() {
		return getField(SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SelectivityResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_SelectivityResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_SelectivityResultsVeloxLastModifiedDate() {
		return getField(SBA___SELECTIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_CREATED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.CreatedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Created By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who created this record
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.CreatedBy" field
	 */
	public String getSBA_SensitivityResultsCreatedBy() {
		return getField(SBA___SENSITIVITY_RESULTS_CREATED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_DATA_RECORD_NAME} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.DataRecordName<br/>
	 * <br/>
	 * <b>Display Name</b>: ID<br/>
	 * <br/>
	 * <b>Description</b>: The textual identifier or name for this data record.
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.DataRecordName" field
	 */
	public String getSBA_SensitivityResultsDataRecordName() {
		return getField(SBA___SENSITIVITY_RESULTS_DATA_RECORD_NAME);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_DATE_CREATED} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.DateCreated<br/>
	 * <br/>
	 * <b>Display Name</b>: Date Created<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was created in or added to the system.
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.DateCreated" field
	 */
	public Long getSBA_SensitivityResultsDateCreated() {
		return getField(SBA___SENSITIVITY_RESULTS_DATE_CREATED);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_RECORD_ID} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.RecordId<br/>
	 * <br/>
	 * <b>Display Name</b>: Record ID<br/>
	 * <br/>
	 * <b>Description</b>: The system-wide unique ID of this data record
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.RecordId" field
	 */
	public Long getSBA_SensitivityResultsRecordId() {
		return getField(SBA___SENSITIVITY_RESULTS_RECORD_ID);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_SBA___ALL_PASS_BIAS_CHECK} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.SBA_AllPassBiasCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All Replicates Pass Bias Check<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity Result] Whether all replicates pass the Bias% limit check
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.SBA_AllPassBiasCheck" field
	 */
	public Boolean getSBA_SensitivityResultsSBA_AllPassBiasCheck() {
		return getField(SBA___SENSITIVITY_RESULTS_SBA___ALL_PASS_BIAS_CHECK);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___SENSITIVITY_RESULTS_SBA___ALL_PASS_BIAS_CHECK} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.SBA_AllPassBiasCheck<br/>
	 * <br/>
	 * <b>Display Name</b>: All Replicates Pass Bias Check<br/>
	 * <br/>
	 * <b>Description</b>: [Sensitivity Result] Whether all replicates pass the Bias% limit check
	 * 
	 * @param value The value to set on the "SBA_SensitivityResults.SBA_AllPassBiasCheck" field
	 */
	public void setSBA_SensitivityResultsSBA_AllPassBiasCheck(Boolean value) {
		setField(SBA___SENSITIVITY_RESULTS_SBA___ALL_PASS_BIAS_CHECK, value);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_BY} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.VeloxLastModifiedBy<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified By<br/>
	 * <br/>
	 * <b>Description</b>: The name of the user who last modified this record
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.VeloxLastModifiedBy" field
	 */
	public String getSBA_SensitivityResultsVeloxLastModifiedBy() {
		return getField(SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_BY);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_SensitivityResults.VeloxLastModifiedDate<br/>
	 * <br/>
	 * <b>Display Name</b>: Last Modified Date<br/>
	 * <br/>
	 * <b>Description</b>: The date that this Data Record was last modified in the system.
	 * 
	 * @return the value stored on the "SBA_SensitivityResults.VeloxLastModifiedDate" field
	 */
	public Long getSBA_SensitivityResultsVeloxLastModifiedDate() {
		return getField(SBA___SENSITIVITY_RESULTS_VELOX_LAST_MODIFIED_DATE);
	}
	
	/**
	 * Retrieves the value stored on the {@link #SBA___STATUS} field via {@link #getField(String)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Acceptance Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: Determined by system. Fail or Pass the Run Acceptance Criteria (Method Execution) or Parameter Evaluation Criteria (Method Validation).
	 * 
	 * @return the value stored on the "SBA_Status" field
	 */
	public String getSBA_Status() {
		return getField(SBA___STATUS);
	}
	
	/**
	 * Sets the value stored on the {@link #SBA___STATUS} field via {@link #setField(String, Object)}<br/>
	 * <br/>
	 * <b>Data Field Name</b>: SBA_Status<br/>
	 * <br/>
	 * <b>Display Name</b>: Acceptance Evaluation<br/>
	 * <br/>
	 * <b>Description</b>: Determined by system. Fail or Pass the Run Acceptance Criteria (Method Execution) or Parameter Evaluation Criteria (Method Validation).
	 * 
	 * @param value The value to set on the "SBA_Status" field
	 */
	public void setSBA_Status(String value) {
		setField(SBA___STATUS, value);
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