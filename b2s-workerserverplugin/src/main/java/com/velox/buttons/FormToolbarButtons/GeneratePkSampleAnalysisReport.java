/**
 * Created: 2026-11-20 10:57
 * Agent type: Grok 4.7
 * Modified: 2026-11-20 16:09
 * Agent type: Grok 4.7
 */
/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.FormToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.DataRecordSelectionCriteria;
import com.velox.api.clientcallback.ReadFileDialogCriteria;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.servermanager.DataTypeManager;
import com.velox.api.servermanager.PickListManager;
import com.velox.api.reportbuilder.entries.RbEntry;
import com.velox.api.reportbuilder.entries.RbStaticTextEntry;
import com.velox.api.reportbuilder.shared.RbInterfaceContext;
import com.velox.api.reportbuilder.shared.RbInterfaceCriteria;
import com.velox.api.reportbuilder.shared.RbInterfaceResponse;
import com.velox.api.reportbuilder.shared.RbTemplate;
import com.velox.api.util.ShowListDialogCriteria;
import com.velox.managers.MasterAssayRunApprovalHelper;
import com.velox.recordmodels.C_InterAssayLevelResultModel;
import com.velox.recordmodels.C_PKReportModel;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.SBA_AssayAnalyteModel;
import com.velox.recordmodels.SBA_AssayRunControlResultModel;
import com.velox.recordmodels.SBA_AssayRunResultModel;
import com.velox.recordmodels.SBA_MasterAssayModel;
import com.velox.recordmodels.SBA_MasterAssayQCModel;
import com.velox.recordmodels.SBA_MasterAssayRunModel;
import com.velox.recordmodels.SBA_MasterAssayStandardModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.definition.datatype.DataTypeHelper;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.attachment.AttachmentData;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RelationshipPath;
import com.velox.sapio.commons.exemplar.recordmodel.util.RecordModelUtil;
import com.velox.sapio.commons.utils.StreamingUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.io.RandomAccessReadBuffer;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Study form button that opens the PK sample analysis report mock-up in the report builder preview.
 */
public class GeneratePkSampleAnalysisReport extends DefaultFormToolbarPlugin {

    private static final String TEMPLATE_NAME = "B2S_PK_SampleAnalysisReport";

    /** Pick list holding the management signatories the user chooses from before the report is filled. */
    private static final String MANAGEMENT_SIGNATORY_PICKLIST = "Management Signatory";

    /** Appendices the user uploads before the report is filled, in report order (B2S1-136). */
    private static final List<String> APPENDIX_LABELS = List.of(
            "Appendix 1: Test Method",
            "Appendix 2: Sample Analysis Plan",
            "Appendix 3: Validation Report");

    /** Pick list of the Study Type values that count as GLP (B2S1-258). */
    private static final String GLP_STUDY_TYPES_PICKLIST = "Report \u2013 GLP Study Types";

    /** C_BlindingStatus value that prints the unblinded wording (B2S1-258). */
    private static final String UNBLINDED = "Unblinded";

    /** [[RPT][NAME]] placeholders filled by this plugin. */
    private static final String RPT_MANAGEMENT_NAME = "MANAGEMENT_NAME";
    private static final String RPT_MANAGEMENT_TITLE = "MANAGEMENT_TITLE";
    private static final String RPT_UNBLINDED_LINE = "UNBLINDED_LINE";
    private static final String RPT_UNBLINDED_FOOTER = "UNBLINDED_FOOTER";
    private static final String RPT_GLP_TEST_FACILITY_BLOCK = "GLP_TEST_FACILITY_BLOCK";
    private static final String RPT_SITE_LABEL = "SITE_LABEL";
    private static final String RPT_GLP_FROM_TEST_FACILITY = "GLP_FROM_TEST_FACILITY";

    /** B2S1-265: control result parents and their level name fields (same as B2S1-222). */
    private static final String MASTER_ASSAY_STANDARD = SBA_MasterAssayStandardModel.DATA_TYPE_NAME;
    private static final String MASTER_ASSAY_QC = SBA_MasterAssayQCModel.DATA_TYPE_NAME;
    private static final String STANDARD_NAME_FIELD = SBA_MasterAssayStandardModel.SBA___STANDARD_NAME;
    private static final String QC_NAME_FIELD = SBA_MasterAssayQCModel.SBA___QC_NAME;
    /** C_InterAssayLevelResult.C_ControlType values written by B2S1-222. */
    private static final String CONTROL_TYPE_STANDARD = "Standard";
    private static final String CONTROL_TYPE_QC = "QC";
    /** Runs that count, same rule as B2S1-222: Analysis runs that were not rejected. */
    private static final String ASSAY_RUN_TYPE_ANALYSIS = "Analysis";
    private static final String RUN_RESULT_REJECT = "Reject";

    private static final String TABLE_STYLE = "border-collapse: collapse; table-layout: fixed; word-break: break-word;"
            + " overflow-wrap: anywhere; text-align: center;";
    private static final String HEAD_CELL = "border: 1px solid #000; font-weight: bold; padding: 2pt;";
    private static final String BODY_CELL = "border: 1px solid #000; padding: 2pt;";

    private static final Set<String> ALLOWED_GROUPS = Set.of(
            "Principal Investigator",
            "Tech Writer",
            "B2S Admin",
            "Sapio Admin");

    private static final DateTimeFormatter REPORT_DATE = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    /** [[DataType][Field]], with any spaces inside the brackets. */
    private static final Pattern FIELD_MACRO = Pattern.compile(
            "\\[\\[\\s*([A-Za-z_][A-Za-z0-9_]*)\\s*\\]\\s*\\[\\s*([A-Za-z_][A-Za-z0-9_]*)\\s*\\]\\]");

    @Override
    public String getLine1Text() {
        return "PK Analysis";
    }

    @Override
    public String getLine2Text() {
        return "Report";
    }

    @Override
    public String getDescription() {
        return "Preview the PK sample analysis report.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "card-text-outline.svg");
    }

    @Override
    public boolean onFormToolbar(OnFormToolbarContext ctx) throws Throwable {
        return StudyModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName())
                && ALLOWED_GROUPS.contains(user.getUserGroup().getGroupName());
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        StudyModel study = instMan.addExistingRecordOfType(ctx.getDataRecord(), StudyModel.class);
        SBA_MasterAssayModel assay = selectMasterAssay(study);
        if (assay == null) {
            return new PluginResult(false);
        }
        String managementSignatory = selectManagementSignatory();
        if (managementSignatory == null) {
            return new PluginResult(false);
        }
        List<Appendix> appendices = uploadAppendices();
        relationshipMan.loadPath(List.of(assay), RelationshipPath.child(SBA_AssayAnalyteModel.class));
        // Missing records do not stop the report: their placeholders are filled with blanks.
        SBA_AssayAnalyteModel analyte = firstChild(assay, SBA_AssayAnalyteModel.class);
        // A path cannot branch, so each chain is its own bulk load. All of them finish before any relationship is read.
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .parent(DirectoryModel.class).child(C_SponsorAddressModel.class));
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .child(C_SponsorContactModel.class));
        relationshipMan.loadPath(List.of(study), RelationshipPath.child(C_PKReportModel.class));
        ProjectModel project = study.get(Parent.ofType(ProjectModel.class));
        DirectoryModel directory = project == null ? null : project.get(Parent.ofType(DirectoryModel.class));
        C_SponsorAddressModel address = directory == null ? null : firstChild(directory, C_SponsorAddressModel.class);
        C_SponsorContactModel contact = project == null ? null : firstChild(project, C_SponsorContactModel.class);

        RbTemplate template = dataMgmtServer.getRbTemplateManager(user).getRbTemplate(TEMPLATE_NAME, user);
        if (template == null) {
            clientCallback.displayError("Report template \"" + TEMPLATE_NAME + "\" was not found.");
            return new PluginResult(false);
        }
        Boolean glp = isGlpStudy(study);
        if (glp == null) {
            return new PluginResult(false);
        }
        // [[RPT][NAME]] values are inserted as HTML, so plain text is escaped here.
        Map<String, String> rptValues = new HashMap<>();
        rptValues.put(RPT_MANAGEMENT_NAME, escapeHtml(managementSignatory));
        boolean unblinded = UNBLINDED.equals(study.getC_BlindingStatus());
        rptValues.put(RPT_UNBLINDED_LINE, unblinded ? "DATA IS UNBLINDED" : "");
        rptValues.put(RPT_UNBLINDED_FOOTER, unblinded ? "CONFIDENTIAL - UNBLINDED" : "CONFIDENTIAL");
        rptValues.put(RPT_SITE_LABEL, glp ? "Test Site" : "Bioanalytical Site");
        rptValues.put(RPT_MANAGEMENT_TITLE, glp ? "Test Site Management" : "B2S Management");
        rptValues.put(RPT_GLP_TEST_FACILITY_BLOCK, glp ? testFacilityBlock(study.getC_TestFacility()) : "");
        // B2S1-259: " from [Test Facility]" for GLP studies. C_TestFacility is pasted as entered; blank means no text.
        String testFacility = study.getC_TestFacility();
        rptValues.put(RPT_GLP_FROM_TEST_FACILITY,
                glp && StringUtils.isNotBlank(testFacility) ? " from " + escapeHtml(testFacility.trim()) : "");
        // Tables 3 and 5 are rebuilt first so the macros in their new headings are filled by fillTemplate.
        fillControlTables(template, assay, analyte);
        fillTemplate(template, study, project, directory, address, contact, assay, analyte, rptValues);

        for (RbEntry entry : template.getEntryList()) {
            entry.setReadOnly(false);
        }
        // Builder booleans start false and replace the context defaults, so each edit has to be turned on here.
        RbInterfaceContext report = RbInterfaceContext.builder()
                .report(template)
                .isReadOnly(false)
                .isMainToolbarPluginsEnabled(true)
                .isToolKitGrabbersEnabled(true)
                .isNewPageGrabberEnabled(true)
                .isFormViewGrabberEnabled(true)
                .isTableViewGrabberEnabled(true)
                .isImageGrabberEnabled(true)
                .isDashboardGrabberEnabled(true)
                .isPluginGrabbersEnabled(true)
                .isStaticTextGrabberEnabled(true)
                .isPageNumberGrabberEnabled(true)
                .isDateGrabberEnabled(true)
                .isEditRecordDataEnabled(true)
                .isModifyPageSizeEnabled(true)
                .isModifyPageMarginsEnabled(true)
                .isSectionsResizable(true)
                .isSectionsDraggable(true)
                .isSectionsConfigModifiable(true)
                .isSectionsStyleModifiable(true)
                .isPagesStyleModifiable(true)
                .isTemplateCreatedEntriesRemovable(true)
                .isTemplateCreatedSectionsRemovable(true)
                .isSectionsAddable(true)
                .isPagesAddable(true)
                .isDisableDownloadPdfButton(false)
                .build();
        RbInterfaceCriteria criteria = RbInterfaceCriteria.builder().rbInterfaceContext(report).build();
        RbInterfaceResponse response;
        try {
            response = clientCallback.showReportBuilder(criteria, user);
        } catch (UserRequestedCancelServerException cancel) {
            return new PluginResult(false);
        }
        if (response == null || response.getRbInterfaceContext() == null
                || response.getRbInterfaceContext().getRbTemplate() == null) {
            return new PluginResult(false);
        }
        byte[] pdf = clientCallback.getReportBuilderPdf(response.getRbInterfaceContext(), user);
        if (pdf == null || pdf.length == 0) {
            clientCallback.displayError("The PK report could not be generated as a PDF.");
            return new PluginResult(false);
        }
        byte[] reportWithAppendices;
        try {
            reportWithAppendices = appendPdfs(pdf, appendices);
        } catch (IOException e) {
            clientCallback.displayError("The appendices could not be added to the PK report: " + e.getMessage());
            return new PluginResult(false);
        }

        int version = nextReportVersion(study, assay.getRecordId());
        C_PKReportModel pkReport = study.add(Child.ofType(C_PKReportModel.class));
        pkReport.setC_Assay(assay.getRecordId());
        pkReport.setC_ReportVersion(version);
        pkReport.setC_ManagementSignatory(managementSignatory);
        pkReport.setFilePath(StringUtils.defaultIfBlank(study.getDataRecordName(), "Study") + "_PK_Report.pdf");
        pkReport.set(AttachmentData.bytes(reportWithAppendices));
        recMan.storeAndCommit("Generate PK Report");
        return new PluginResult(true);
    }

    /**
     * The next version for this Study and Master Assay. Existing reports for other assays do not count.
     * A blank version still counts as an existing report so the next number moves forward.
     */
    private static int nextReportVersion(StudyModel study, Long assayRecordId) {
        int existing = 0;
        int highest = 0;
        for (C_PKReportModel report : study.get(Children.ofType(C_PKReportModel.class))) {
            if (assayRecordId == null || !assayRecordId.equals(report.getC_Assay())) {
                continue;
            }
            existing++;
            if (report.getC_ReportVersion() != null && report.getC_ReportVersion() > highest) {
                highest = report.getC_ReportVersion();
            }
        }
        return Math.max(existing, highest) + 1;
    }

    /**
     * Shows the entries of the Management Signatory pick list and returns the one the user picks.
     * A missing or empty pick list, or a cancelled dialog, returns null.
     */
    private String selectManagementSignatory() throws Throwable {
        PickListManager pickListManager = dataMgmtServer.getPickListManager(user);
        var config = pickListManager.getPickListConfig(MANAGEMENT_SIGNATORY_PICKLIST);
        List<String> signatories = config == null ? null : config.getEntryList();
        if (signatories == null || signatories.isEmpty()) {
            clientCallback.displayError("The \"" + MANAGEMENT_SIGNATORY_PICKLIST
                    + "\" pick list is missing or empty, so the report cannot be filled in.");
            return null;
        }
        List<String> selection;
        try {

            ShowListDialogCriteria<String> criteria = ShowListDialogCriteria.<String>builder()
                    .itemList(signatories)
                    .multiSelect(false)
                    .build();
            selection = clientCallback.showListDialog("Select the Management Signatory for this report.",criteria, user);

        } catch (UserRequestedCancelServerException cancel) {
            return null;
        }
        if (selection == null || selection.isEmpty() || StringUtils.isBlank(selection.get(0))) {
            return null;
        }
        return selection.get(0);
    }

    /**
     * True when the Study's Study Type is on the Report \u2013 GLP Study Types pick list.
     * A missing or empty pick list shows an error and returns null.
     */
    private Boolean isGlpStudy(StudyModel study) throws Throwable {
        PickListManager pickListManager = dataMgmtServer.getPickListManager(user);
        var config = pickListManager.getPickListConfig(GLP_STUDY_TYPES_PICKLIST);
        List<String> glpStudyTypes = config == null ? null : config.getEntryList();
        if (glpStudyTypes == null || glpStudyTypes.isEmpty()) {
            clientCallback.displayError("The \"" + GLP_STUDY_TYPES_PICKLIST
                    + "\" pick list is missing or empty, so the report cannot be filled in.");
            return null;
        }
        String studyType = study.getStudyType();
        return studyType != null && glpStudyTypes.contains(studyType);
    }

    /** The title page Test Facility block for GLP studies, as written in the spec. Line breaks in the field are kept. */
    private static String testFacilityBlock(String testFacility) {
        String lines = escapeHtml(StringUtils.defaultString(testFacility)).replace("\r\n", "\n").replace("\n", "<br>");
        return "<div style=\"margin:0 0 14pt 0;\"><b>Test Facility</b>:<br>" + lines + "</div>";
    }

    /** One uploaded appendix file. */
    private record Appendix(String label, String fileName, byte[] bytes) {
    }

    /**
     * Asks the user to upload each appendix in APPENDIX_LABELS order.
     * Every upload is optional: cancelling the dialog skips that appendix and moves on to the next.
     * A file that cannot be read or is not a PDF is reported to the user and skipped.
     */
    private List<Appendix> uploadAppendices() throws Throwable {
        List<Appendix> appendices = new ArrayList<>(APPENDIX_LABELS.size());
        for (String label : APPENDIX_LABELS) {
            String filePath;
            try {
                filePath = clientCallback.showFileDialog(ReadFileDialogCriteria.builder()
                        .title("Upload " + label + " (PDF, optional)")
                        .extension("pdf")
                        .showCameraButton(false)
                        .showImageEditor(false)
                        .build());
            } catch (UserRequestedCancelServerException skipped) {
                continue;
            }
            if (StringUtils.isBlank(filePath) || clientCallback.isAborted()) {
                continue;
            }
            byte[] fileBytes = StreamingUtil.readBytesFromUser(filePath, exemplarContext);
            if (fileBytes == null || fileBytes.length == 0) {
                clientCallback.displayError("Could not read the file uploaded for " + label + ". It will be left out.");
                continue;
            }
            String fileName = new File(filePath).getName();
            if (!isPdf(fileName, fileBytes)) {
                clientCallback.displayError(label + " must be a PDF file. \"" + fileName + "\" is not a PDF, so it will be left out.");
                continue;
            }
            appendices.add(new Appendix(label, fileName, fileBytes));
        }
        return appendices;
    }

    /**
     * Returns one PDF: the filled report's pages, then each appendix's pages in list order.
     * With no appendices the report PDF is returned unchanged.
     * The report and the appendices are copied as they are; nothing inside them is changed.
     */
    private static byte[] appendPdfs(byte[] reportPdf, List<Appendix> appendices) throws IOException {
        if (appendices.isEmpty()) {
            return reportPdf;
        }
        PDFMergerUtility merger = new PDFMergerUtility();
        merger.addSource(new RandomAccessReadBuffer(reportPdf));
        for (Appendix appendix : appendices) {
            merger.addSource(new RandomAccessReadBuffer(appendix.bytes()));
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        merger.setDestinationStream(out);
        merger.mergeDocuments(IOUtils.createMemoryOnlyStreamCache());
        return out.toByteArray();
    }

    /** A PDF has a .pdf name and starts with the "%PDF" header. */
    private static boolean isPdf(String fileName, byte[] bytes) {
        return StringUtils.endsWithIgnoreCase(fileName, ".pdf")
                && bytes.length >= 4 && bytes[0] == '%' && bytes[1] == 'P' && bytes[2] == 'D' && bytes[3] == 'F';
    }

    /**
     * Loads the Study's Master Assays in one path. A single assay is used as-is.
     * Several assays open a single-select record dialog. Cancel or a missing assay returns null.
     */
    private SBA_MasterAssayModel selectMasterAssay(StudyModel study) throws Throwable {
        relationshipMan.loadPath(List.of(study), RelationshipPath.child(SBA_MasterAssayModel.class));
        List<SBA_MasterAssayModel> assays = new ArrayList<>(study.get(Children.ofType(SBA_MasterAssayModel.class)));
        if (assays.isEmpty()) {
            clientCallback.displayError("This Study has no Master Assay, so the report cannot be filled in.");
            return null;
        }
        if (assays.size() == 1) {
            return assays.get(0);
        }

        DataTypeDefinition definition = getInstance(DataTypeManager.class)
                .getDataTypeDefinition(SBA_MasterAssayModel.DATA_TYPE_NAME);
        if (definition == null) {
            clientCallback.displayError("The Master Assay data type could not be retrieved.");
            return null;
        }
        TemporaryDataType tempType = definition.getTemporaryDataType(user);
        String assayLabel = getInstance(DataTypeHelper.class).getDisplayName(SBA_MasterAssayModel.DATA_TYPE_NAME);
        List<Map<String, Object>> selection = clientCallback.showDataRecordSelectionDialog(
                "Select the " + assayLabel + " for this report.",
                DataRecordSelectionCriteria.builder()
                        .temporaryDataType(tempType)
                        .multiSelect(false)
                        .records(RecordModelUtil.getClonedFieldsList(assays))
                        .build(),
                user);
        if (selection == null || selection.isEmpty() || clientCallback.isAborted()) {
            return null;
        }
        Object rawId = selection.get(0).get(SBA_MasterAssayModel.RECORD_ID);
        if (!(rawId instanceof Number)) {
            clientCallback.displayError("The selected Master Assay could not be retrieved.");
            return null;
        }
        Map<Long, SBA_MasterAssayModel> assaysById =
                RecordModelUtil.mapRecordsByFieldValue(assays, SBA_MasterAssayModel.RECORD_ID);
        SBA_MasterAssayModel selected = assaysById.get(((Number) rawId).longValue());
        if (selected == null) {
            clientCallback.displayError("The selected Master Assay could not be retrieved.");
        }
        return selected;
    }

    /** One Standard or QC level: a column of Table 3 or Table 5. */
    private record Level(long parentRecordId, String name, Double nominal) {
    }

    /** One accepted plate, with its control results grouped by the record ID of their Standard or QC. */
    private record AcceptedPlate(String plateId, Map<Long, List<SBA_AssayRunControlResultModel>> controlsByLevel) {
    }

    /**
     * B2S1-265: rebuilds the Table 3 (Standards) and Table 5 (QC) grids with one column per level and
     * one row per accepted plate, followed by the B2S1-222 statistics.
     * Database calls: runs and plate results (1 path), control results of the counted runs (1),
     * inter-assay level results (1), and the Standard and QC parents of the control results (2).
     * Missing records leave blank cells. Nothing here stops the report.
     */
    private void fillControlTables(RbTemplate template, SBA_MasterAssayModel assay, SBA_AssayAnalyteModel analyte)
            throws Throwable {
        relationshipMan.loadPath(List.of(assay), RelationshipPath.child(SBA_MasterAssayRunModel.class)
                .child(SBA_AssayRunResultModel.class));
        relationshipMan.loadChildren(assay, C_InterAssayLevelResultModel.class);
        List<SBA_MasterAssayRunModel> runs = new ArrayList<>();
        for (SBA_MasterAssayRunModel run : assay.get(Children.ofType(SBA_MasterAssayRunModel.class))) {
            if (ASSAY_RUN_TYPE_ANALYSIS.equals(run.getSBA_AssayRunType())
                    && !RUN_RESULT_REJECT.equals(run.getSBA_RunResult())) {
                runs.add(run);
            }
        }
        if (!runs.isEmpty()) {
            relationshipMan.loadChildren(runs, SBA_AssayRunControlResultModel.class);
        }

        // Accepted plates (SBA_AcceptOrReject = Accept) and the control results for this analyte with the same Plate ID on the same run.
        String analyteName = analyte == null ? null : analyte.getSBA_AnalyteName();
        Map<String, List<SBA_AssayRunControlResultModel>> controlsByPlate = new LinkedHashMap<>();
        List<SBA_AssayRunControlResultModel> controls = new ArrayList<>();
        for (SBA_MasterAssayRunModel run : runs) {
            Map<String, List<SBA_AssayRunControlResultModel>> runControlsByPlate = new HashMap<>();
            for (SBA_AssayRunControlResultModel control : run.get(Children.ofType(SBA_AssayRunControlResultModel.class))) {
                if (StringUtils.isNotBlank(analyteName) && !analyteName.equals(control.getSBA_AnalyteName())) {
                    continue;
                }
                runControlsByPlate.computeIfAbsent(StringUtils.defaultString(control.getSBA_PlateId()),
                        ignored -> new ArrayList<>()).add(control);
            }
            Set<String> seenPlates = new HashSet<>();
            for (SBA_AssayRunResultModel plate : run.get(Children.ofType(SBA_AssayRunResultModel.class))) {
                String plateId = plate.getSBA_PlateId();
                if (!MasterAssayRunApprovalHelper.ACCEPT.equals(plate.getSBA_AcceptOrReject())
                        || StringUtils.isBlank(plateId) || !seenPlates.add(plateId)) {
                    continue;
                }
                List<SBA_AssayRunControlResultModel> plateControls = runControlsByPlate.getOrDefault(plateId, List.of());
                controlsByPlate.computeIfAbsent(plateId, ignored -> new ArrayList<>()).addAll(plateControls);
                controls.addAll(plateControls);
            }
        }
        if (!controls.isEmpty()) {
            relationshipMan.loadParents(controls, MASTER_ASSAY_STANDARD);
            relationshipMan.loadParents(controls, MASTER_ASSAY_QC);
        }

        // Group each plate's controls under their Standard or QC, and collect the levels.
        Map<Long, Level> standardLevels = new HashMap<>();
        Map<Long, Level> qcLevels = new HashMap<>();
        List<AcceptedPlate> plates = new ArrayList<>();
        for (Map.Entry<String, List<SBA_AssayRunControlResultModel>> entry : controlsByPlate.entrySet()) {
            Map<Long, List<SBA_AssayRunControlResultModel>> byLevel = new HashMap<>();
            for (SBA_AssayRunControlResultModel control : entry.getValue()) {
                RecordModel parent = control.get(Parent.ofType(MASTER_ASSAY_STANDARD));
                Map<Long, Level> levels = standardLevels;
                String nameField = STANDARD_NAME_FIELD;
                if (parent == null) {
                    parent = control.get(Parent.ofType(MASTER_ASSAY_QC));
                    levels = qcLevels;
                    nameField = QC_NAME_FIELD;
                }
                if (parent == null) {
                    continue;
                }
                long parentId = parent.getRecordId();
                Level level = levels.get(parentId);
                if (level == null || (level.nominal() == null && control.getSBA_TheoreticalValue() != null)) {
                    levels.put(parentId, new Level(parentId,
                            StringUtils.defaultString((String) parent.getField(nameField)), control.getSBA_TheoreticalValue()));
                }
                byLevel.computeIfAbsent(parentId, ignored -> new ArrayList<>()).add(control);
            }
            plates.add(new AcceptedPlate(entry.getKey(), byLevel));
        }
        plates.sort(Comparator.comparing(AcceptedPlate::plateId));

        // Statistics from B2S1-222, keyed by control type and level name.
        Map<String, C_InterAssayLevelResultModel> statsByLevel = new HashMap<>();
        for (C_InterAssayLevelResultModel stats : assay.get(Children.ofType(C_InterAssayLevelResultModel.class))) {
            if (StringUtils.isNotBlank(analyteName) && stats.getC_AnalyteName() != null
                    && !analyteName.equals(stats.getC_AnalyteName())) {
                continue;
            }
            statsByLevel.putIfAbsent(stats.getC_ControlType() + "|" + stats.getC_Level(), stats);
        }

        List<Level> standards = new ArrayList<>(standardLevels.values());
        standards.sort(Comparator.comparing(Level::name));
        List<Level> qcs = new ArrayList<>(qcLevels.values());
        qcs.sort(Comparator.<Level, Double>comparing(Level::nominal, Comparator.nullsLast(Comparator.reverseOrder()))
                .thenComparing(Level::name));

        String table3 = buildStandardsTable(standards, plates, statsByLevel);
        String table5 = buildQcTable(qcs, plates, statsByLevel);
        for (RbEntry entry : template.getEntryList()) {
            if (!(entry instanceof RbStaticTextEntry text) || !text.hasStaticHtml()) {
                continue;
            }
            String html = replaceTableAfter(text.getStaticHtml(), "Table 3:", table3);
            html = replaceTableAfter(html, "Table 5:", table5);
            text.setStaticHtml(html);
        }
    }

    /** Table 3: one row per accepted plate. A deactivated standard is marked "*". */
    private static String buildStandardsTable(List<Level> levels, List<AcceptedPlate> plates,
            Map<String, C_InterAssayLevelResultModel> statsByLevel) {
        List<List<String>> rows = new ArrayList<>();
        for (AcceptedPlate plate : plates) {
            List<String> row = new ArrayList<>();
            row.add(escapeHtml(plate.plateId()));
            for (Level level : levels) {
                List<String> values = new ArrayList<>();
                for (SBA_AssayRunControlResultModel control
                        : plate.controlsByLevel().getOrDefault(level.parentRecordId(), List.of())) {
                    String value = displayValue("", control.getSBA_MeanConcentration());
                    values.add(Boolean.FALSE.equals(control.getSBA_IsActive()) ? value + "*" : value);
                }
                row.add(String.join("<br>", values));
            }
            rows.add(row);
        }
        List<List<String>> summary = statsRows(levels, CONTROL_TYPE_STANDARD, statsByLevel, "% Bias (Mean):", false);
        return levelTable("100%", "16%", "Concentration ([[SBA_MasterAssay][SBA_ConcentrationUnits]])",
                levels, rows, summary);
    }

    /**
     * Table 5: one row per QC set on each accepted plate. There is no field naming the set, so the
     * plate's results at each level are taken in record order: the first of each level make row 1, and so on.
     */
    private static String buildQcTable(List<Level> levels, List<AcceptedPlate> plates,
            Map<String, C_InterAssayLevelResultModel> statsByLevel) {
        List<List<String>> rows = new ArrayList<>();
        for (AcceptedPlate plate : plates) {
            int sets = 0;
            Map<Long, List<SBA_AssayRunControlResultModel>> ordered = new HashMap<>();
            for (Level level : levels) {
                List<SBA_AssayRunControlResultModel> results =
                        new ArrayList<>(plate.controlsByLevel().getOrDefault(level.parentRecordId(), List.of()));
                results.sort(Comparator.comparing(RecordModel::getRecordId));
                ordered.put(level.parentRecordId(), results);
                sets = Math.max(sets, results.size());
            }
            for (int set = 0; set < sets; set++) {
                List<String> row = new ArrayList<>();
                row.add(escapeHtml(plate.plateId()));
                for (Level level : levels) {
                    List<SBA_AssayRunControlResultModel> results = ordered.get(level.parentRecordId());
                    row.add(set < results.size() ? displayValue("", results.get(set).getSBA_MeanConcentration()) : "");
                }
                rows.add(row);
            }
        }
        List<List<String>> summary = statsRows(levels, CONTROL_TYPE_QC, statsByLevel, "% Bias:", true);
        return levelTable("80%", "25%",
                "[[SBA_AssayAnalyte][SBA_AnalyteName]] Concentration ([[SBA_MasterAssay][SBA_ConcentrationUnits]])",
                levels, rows, summary);
    }

    /** n, Mean, % CV and % Bias rows (and % TE = |% Bias| + % CV when asked), each starting with its label. */
    private static List<List<String>> statsRows(List<Level> levels, String controlType,
            Map<String, C_InterAssayLevelResultModel> statsByLevel, String biasLabel, boolean withTotalError) {
        List<String> n = new ArrayList<>(List.of("n:"));
        List<String> mean = new ArrayList<>(List.of("Mean:"));
        List<String> cv = new ArrayList<>(List.of("% CV:"));
        List<String> bias = new ArrayList<>(List.of(biasLabel));
        List<String> totalError = new ArrayList<>(List.of("% TE:"));
        for (Level level : levels) {
            C_InterAssayLevelResultModel stats = statsByLevel.get(controlType + "|" + level.name());
            Double levelCv = stats == null ? null : stats.getC_PercentCV();
            Double levelBias = stats == null ? null : stats.getC_PercentBias();
            n.add(stats == null ? "" : displayValue("", stats.getC_N()));
            mean.add(stats == null ? "" : displayValue("", stats.getC_Mean()));
            cv.add(displayValue("", levelCv));
            bias.add(displayValue("", levelBias));
            totalError.add(levelCv == null || levelBias == null ? "" : displayValue("", Math.abs(levelBias) + levelCv));
        }
        return withTotalError ? List.of(n, mean, cv, bias, totalError) : List.of(n, mean, cv, bias);
    }

    /**
     * Plate ID column, a group heading over one column per level (name, then nominal), the plate rows,
     * then the label + value summary rows. With no levels one blank column is kept so the table still renders.
     */
    private static String levelTable(String tableWidth, String plateWidth, String groupHeading, List<Level> levels,
            List<List<String>> rows, List<List<String>> summary) {
        int columns = Math.max(levels.size(), 1);
        StringBuilder html = new StringBuilder("<table style=\"width: ").append(tableWidth).append("; ")
                .append(TABLE_STYLE).append("\">\n<tbody>\n<tr>\n")
                .append("<td style=\"width: ").append(plateWidth).append("; ").append(HEAD_CELL)
                .append("\" rowspan=\"2\">Plate ID</td>\n")
                .append("<td style=\"").append(HEAD_CELL).append("\" colspan=\"").append(columns).append("\">")
                .append(groupHeading).append("</td>\n</tr>\n<tr>\n");
        for (int i = 0; i < columns; i++) {
            String heading = i < levels.size()
                    ? escapeHtml(levels.get(i).name()) + "<br>" + displayValue("", levels.get(i).nominal())
                    : "";
            html.append("<td style=\"").append(HEAD_CELL).append("\">").append(heading).append("</td>\n");
        }
        html.append("</tr>\n");
        for (List<String> row : rows) {
            appendRow(html, row, columns, false);
        }
        for (List<String> row : summary) {
            appendRow(html, row, columns, true);
        }
        return html.append("</tbody>\n</table>").toString();
    }

    /** First cell is the row label (bold for summary rows); missing value cells are left blank. */
    private static void appendRow(StringBuilder html, List<String> row, int columns, boolean boldLabel) {
        html.append("<tr>\n");
        for (int i = 0; i <= columns; i++) {
            String style = i == 0 && boldLabel ? HEAD_CELL : BODY_CELL;
            html.append("<td style=\"").append(style).append("\">")
                    .append(i < row.size() ? row.get(i) : "").append("</td>\n");
        }
        html.append("</tr>\n");
    }

    /** Swaps the first table after the caption text for the new table. Without that caption the HTML is unchanged. */
    private static String replaceTableAfter(String html, String caption, String table) {
        int captionAt = html.indexOf(caption);
        int start = captionAt < 0 ? -1 : html.indexOf("<table", captionAt);
        int end = start < 0 ? -1 : html.indexOf("</table>", start);
        if (end < 0) {
            return html;
        }
        return html.substring(0, start) + table + html.substring(end + "</table>".length());
    }

    /** The loaded child list is already in memory. The first entry is used when more than one is present. */
    private static <T extends RecordModel> T firstChild(RecordModel parent, Class<T> childType) {
        for (T child : parent.get(Children.ofType(childType))) {
            return child;
        }
        return null;
    }

    /**
     * Replaces [[DataType][Field]] (escaped) and the [[RPT][NAME]] values in rptValues (already HTML) in every static-text entry,
     * including the header and footer.
     * A data type or field that is not on one of the loaded records is left unchanged.
     */
    private static void fillTemplate(RbTemplate template, StudyModel study, ProjectModel project,
            DirectoryModel directory, C_SponsorAddressModel address, C_SponsorContactModel contact,
            SBA_MasterAssayModel assay, SBA_AssayAnalyteModel analyte, Map<String, String> rptValues) {
        // A null record is kept in the map so its placeholders are blanked instead of left in the report.
        Map<String, RecordModel> recordsByType = new HashMap<>();
        recordsByType.put(StudyModel.DATA_TYPE_NAME, study);
        recordsByType.put(ProjectModel.DATA_TYPE_NAME, project);
        recordsByType.put(DirectoryModel.DATA_TYPE_NAME, directory);
        recordsByType.put(C_SponsorAddressModel.DATA_TYPE_NAME, address);
        recordsByType.put(C_SponsorContactModel.DATA_TYPE_NAME, contact);
        recordsByType.put(SBA_MasterAssayModel.DATA_TYPE_NAME, assay);
        recordsByType.put(SBA_AssayAnalyteModel.DATA_TYPE_NAME, analyte);
        for (RbEntry entry : template.getEntryList()) {
            if (!(entry instanceof RbStaticTextEntry text) || !text.hasStaticHtml()) {
                continue;
            }
            text.setStaticHtml(applyMacros(text.getStaticHtml(), recordsByType, rptValues));
        }
    }

    private static String applyMacros(String html, Map<String, RecordModel> recordsByType,
            Map<String, String> rptValues) {
        Matcher matcher = FIELD_MACRO.matcher(html);
        StringBuilder out = new StringBuilder();
        while (matcher.find()) {
            String value = "RPT".equals(matcher.group(1))
                    ? rptValues.get(matcher.group(2))
                    : escapeOrNull(valueFor(recordsByType, matcher.group(1), matcher.group(2)));
            matcher.appendReplacement(out, Matcher.quoteReplacement(value == null ? matcher.group(0) : value));
        }
        matcher.appendTail(out);
        return out.toString();
    }

    /**
     * Null means leave the macro in place (a data type this report does not load).
     * An empty string means the field is blank or the record was not found.
     */
    private static String valueFor(Map<String, RecordModel> recordsByType, String typeName, String fieldName) {
        if (!recordsByType.containsKey(typeName)) {
            return null;
        }
        RecordModel record = recordsByType.get(typeName);
        if (record == null) {
            return "";
        }
        Map<String, Object> fields = record.getFields();
        if (fields == null || !fields.containsKey(fieldName)) {
            return null;
        }
        return displayValue(fieldName, fields.get(fieldName));
    }

    private static String displayValue(String fieldName, Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof Number && isDateField(fieldName)) {
            long millis = ((Number) value).longValue();
            if (millis <= 0) {
                return "";
            }
            return REPORT_DATE.format(Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()));
        }
        if (value instanceof Double || value instanceof Float) {
            double number = ((Number) value).doubleValue();
            if (Double.isNaN(number) || Double.isInfinite(number)) {
                return "";
            }
            if (number == Math.rint(number)) {
                return String.valueOf((long) number);
            }
            return String.valueOf(number);
        }
        return String.valueOf(value);
    }

    private static boolean isDateField(String fieldName) {
        return fieldName != null && fieldName.contains("Date");
    }

    private static String escapeOrNull(String value) {
        return value == null ? null : escapeHtml(value);
    }

    private static String escapeHtml(String value) {
        return StringUtils.defaultString(value)
                .replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;");
    }
}
