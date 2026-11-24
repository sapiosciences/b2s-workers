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
import com.velox.recordmodels.C_PKReportModel;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.SBA_AssayAnalyteModel;
import com.velox.recordmodels.SBA_MasterAssayModel;
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
import java.util.HashMap;
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
        SBA_AssayAnalyteModel analyte = firstChild(assay, SBA_AssayAnalyteModel.class);
        if (analyte == null) {
            clientCallback.displayError("This Master Assay has no Assay Analyte, so the report cannot be filled in.");
            return new PluginResult(false);
        }
        // A path cannot branch, so each chain is its own bulk load. All of them finish before any relationship is read.
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .parent(DirectoryModel.class).child(C_SponsorAddressModel.class));
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .child(C_SponsorContactModel.class));
        relationshipMan.loadPath(List.of(study), RelationshipPath.child(C_PKReportModel.class));
        ProjectModel project = study.get(Parent.ofType(ProjectModel.class));
        if (project == null) {
            clientCallback.displayError("This Study has no parent Project, so the report cannot be filled in.");
            return new PluginResult(false);
        }
        DirectoryModel directory = project.get(Parent.ofType(DirectoryModel.class));
        if (directory == null) {
            clientCallback.displayError("This Project has no parent Directory, so the report cannot be filled in.");
            return new PluginResult(false);
        }
        C_SponsorAddressModel address = firstChild(directory, C_SponsorAddressModel.class);
        if (address == null) {
            clientCallback.displayError("This Directory has no Sponsor Address, so the report cannot be filled in.");
            return new PluginResult(false);
        }
        C_SponsorContactModel contact = firstChild(project, C_SponsorContactModel.class);
        if (contact == null) {
            clientCallback.displayError("This Project has no Sponsor Contact, so the report cannot be filled in.");
            return new PluginResult(false);
        }

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
        Map<String, RecordModel> recordsByType = new HashMap<>();
        recordsByType.put(study.getDataTypeName(), study);
        recordsByType.put(project.getDataTypeName(), project);
        recordsByType.put(directory.getDataTypeName(), directory);
        recordsByType.put(address.getDataTypeName(), address);
        recordsByType.put(contact.getDataTypeName(), contact);
        recordsByType.put(assay.getDataTypeName(), assay);
        recordsByType.put(analyte.getDataTypeName(), analyte);
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

    /** Null means leave the macro in place. An empty string means the field is present and blank. */
    private static String valueFor(Map<String, RecordModel> recordsByType, String typeName, String fieldName) {
        RecordModel record = recordsByType.get(typeName);
        if (record == null) {
            return null;
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
