/**
 * Created: 2026-11-20 10:57
 * Agent type: Grok 4.7
 * Modified: 2026-11-20 12:47
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
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.context.FormToolbarContext;
import com.velox.api.plugin.invocation.context.OnFormToolbarContext;
import com.velox.api.reportbuilder.entries.RbEntry;
import com.velox.api.reportbuilder.entries.RbStaticTextEntry;
import com.velox.api.reportbuilder.shared.RbInterfaceContext;
import com.velox.api.reportbuilder.shared.RbInterfaceCriteria;
import com.velox.api.reportbuilder.shared.RbTemplate;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorContactModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.ProjectModel;
import com.velox.recordmodels.StudyModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.DefaultFormToolbarPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.record.RecordModel;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Children;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Parent;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.RelationshipPath;
import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Study form button that opens the PK sample analysis report mock-up in the report builder preview.
 */
public class GeneratePkSampleAnalysisReport extends DefaultFormToolbarPlugin {

    private static final String TEMPLATE_NAME = "B2S_PK_SampleAnalysisReport_Mockup";

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
        return StudyModel.DATA_TYPE_NAME.equals(ctx.getDataTypeName());
    }

    @Override
    protected PluginResult run(FormToolbarContext ctx) throws Throwable {
        if (clientCallback == null) {
            return new PluginResult(false);
        }
        if (ctx.getDataRecord() == null) {
            clientCallback.displayError("This Study could not be retrieved.");
            return new PluginResult(false);
        }
        StudyModel study = instMan.addExistingRecordOfType(ctx.getDataRecord(), StudyModel.class);
        // A path cannot branch, so the contact is a second bulk load. Both finish before any relationship is read.
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .parent(DirectoryModel.class).child(C_SponsorAddressModel.class));
        relationshipMan.loadPath(List.of(study), RelationshipPath.parent(ProjectModel.class)
                .child(C_SponsorContactModel.class));
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
        fillTemplate(template, study, project, directory, address, contact);

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
        try {
            clientCallback.showReportBuilder(criteria, user);
        } catch (UserRequestedCancelServerException cancel) {
            return new PluginResult(false);
        }
        return new PluginResult(true);
    }

    /** The loaded child list is already in memory. The first entry is used when more than one is present. */
    private static <T extends RecordModel> T firstChild(RecordModel parent, Class<T> childType) {
        for (T child : parent.get(Children.ofType(childType))) {
            return child;
        }
        return null;
    }

    /**
     * Replaces [[DataType][Field]] in every static-text entry, including the header and footer.
     * A data type or field that is not on one of the loaded records is left unchanged.
     */
    private static void fillTemplate(RbTemplate template, StudyModel study, ProjectModel project,
            DirectoryModel directory, C_SponsorAddressModel address, C_SponsorContactModel contact) {
        Map<String, RecordModel> recordsByType = new HashMap<>();
        recordsByType.put(study.getDataTypeName(), study);
        recordsByType.put(project.getDataTypeName(), project);
        recordsByType.put(directory.getDataTypeName(), directory);
        recordsByType.put(address.getDataTypeName(), address);
        recordsByType.put(contact.getDataTypeName(), contact);
        for (RbEntry entry : template.getEntryList()) {
            if (!(entry instanceof RbStaticTextEntry text) || !text.hasStaticHtml()) {
                continue;
            }
            text.setStaticHtml(applyMacros(text.getStaticHtml(), recordsByType));
        }
    }

    private static String applyMacros(String html, Map<String, RecordModel> recordsByType) {
        Matcher matcher = FIELD_MACRO.matcher(html);
        StringBuilder out = new StringBuilder();
        while (matcher.find()) {
            String value = valueFor(recordsByType, matcher.group(1), matcher.group(2));
            matcher.appendReplacement(out, Matcher.quoteReplacement(value == null ? matcher.group(0) : escapeHtml(value)));
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

    private static String escapeHtml(String value) {
        return StringUtils.defaultString(value)
                .replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;");
    }
}
