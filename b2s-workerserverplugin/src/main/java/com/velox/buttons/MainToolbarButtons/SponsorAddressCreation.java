/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.MainToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.clientcallback.InputDialogCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.api.util.InputDialogResult;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.C_SponsorAddressModel;
import com.velox.recordmodels.C_SponsorModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main toolbar button that creates a Sponsor Address under a sponsor's Directory.
 *
 * <p>Flow:
 * <ol>
 *   <li>Prompt to select an existing Sponsor ({@code C_Sponsor} names)</li>
 *   <li>Resolve the Directory whose name matches that sponsor</li>
 *   <li>Prompt for address fields (only Address Name is required)</li>
 *   <li>Create {@code C_SponsorAddress} as a child of that Directory</li>
 * </ol>
 *
 * @author Connor Skevington
 */
public class SponsorAddressCreation extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String SPONSOR_FIELD = "Sponsor";

    @Override
    public String getLine1Text() {
        return "Sponsor Address";
    }

    @Override
    public String getLine2Text() {
        return "Creation";
    }

    @Override
    public String getDescription() {
        return "Create a Sponsor Address under a sponsor's Directory.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "card-text-outline.svg");
    }

    @Override
    public List<String> getSectionNamePath() {
        return List.of("Sponsor Setup");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        return true;
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            String sponsorName = promptForSponsor();
            DirectoryModel directory = findDirectoryForSponsor(sponsorName);
            Map<String, Object> addressFields = promptForAddressFields(sponsorName);
            createSponsorAddress(directory, addressFields);

            clientCallback.displayPopup(
                    "Sponsor Address Created",
                    "Address \"" + stringValue(addressFields.get(C_SponsorAddressModel.C___ADDRESS_NAME))
                            + "\" was created under " + sponsorName + ".",
                    PopupType.Success);
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * First dialog: pick an existing Sponsor. Options come from {@code C_Sponsor} names
     * (same pattern as {@link SponsorUserCreation}).
     */
    private String promptForSponsor() throws Throwable {
        List<String> sponsorNames = loadExistingSponsorNames();
        if (sponsorNames.isEmpty()) {
            clientCallback.displayError(
                    "No Sponsor records were found. Create sponsors before adding addresses.");
            throw new UserRequestedCancelServerException();
        }

        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Select Sponsor")
                .message("Select the sponsor whose Directory will hold the new address.")
                .fieldDefinition(VeloxFieldDefinition.selectionFieldBuilder()
                        .dataFieldName(SPONSOR_FIELD)
                        .displayName("Sponsor")
                        .required(true)
                        .editable(true)
                        .visible(true)
                        .multiSelect(false)
                        .directEdit(false)
                        .staticListValues(sponsorNames)
                        .build())
                .build());
        if (input == null || input.getValue() == null) {
            throw new UserRequestedCancelServerException();
        }

        String sponsorName = stringValue(input.getValue());
        if (StringUtils.isBlank(sponsorName)) {
            clientCallback.displayError("A sponsor must be selected.");
            throw new UserRequestedCancelServerException();
        }
        return sponsorName;
    }

    /**
     * Finds the Directory whose name matches the selected sponsor.
     * Sponsor Directories are created with the same name as the Sponsor
     * (see {@link AddNewSponsor}).
     */
    private DirectoryModel findDirectoryForSponsor(String sponsorName) throws Throwable {
        List<DataRecord> directoryRecords =
                dataRecordManager.getAllRecordsOfType(DirectoryModel.DATA_TYPE_NAME, user);
        if (directoryRecords == null || directoryRecords.isEmpty()) {
            clientCallback.displayError("No Directory records were found.");
            throw new UserRequestedCancelServerException();
        }

        List<DirectoryModel> directories =
                instMan.addExistingRecordsOfType(directoryRecords, DirectoryModel.class);
        for (DirectoryModel directory : directories) {
            if (StringUtils.equals(sponsorName, directory.getDirectoryName())) {
                return directory;
            }
        }

        clientCallback.displayError(
                "No Directory named \"" + sponsorName + "\" was found. "
                        + "Create the sponsor (and its Directory) before adding an address.");
        throw new UserRequestedCancelServerException();
    }

    /** Second dialog: collect address fields. Only Address Name is required. */
    private Map<String, Object> promptForAddressFields(String sponsorName) throws Throwable {
        Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                "Create Sponsor Address",
                "Enter address details for " + sponsorName + ". Only Address Name is required.",
                buildAddressEntryForm(),
                user);
        if (entered == null || entered.isEmpty()) {
            throw new UserRequestedCancelServerException();
        }

        String addressName = stringValue(entered.get(C_SponsorAddressModel.C___ADDRESS_NAME));
        if (StringUtils.isBlank(addressName)) {
            clientCallback.displayError("Address Name is required.");
            throw new UserRequestedCancelServerException();
        }
        return entered;
    }

    private TemporaryDataType buildAddressEntryForm() throws Throwable {
        FormBuilder formBuilder = new FormBuilder();

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___ADDRESS_NAME)
                .displayName("Address Name")
                .required(true)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___ATTENTION)
                .displayName("Attention")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___ADDRESS_LINE_1)
                .displayName("Address Line 1")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___ADDRESS_LINE_2)
                .displayName("Address Line 2")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___CITY)
                .displayName("City")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___COUNTRY)
                .displayName("Country")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___STATE_REGION)
                .displayName("State / Region")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(C_SponsorAddressModel.C___POSTAL_CODE)
                .displayName("Postal Code")
                .required(false)
                .editable(true)
                .visible(true)
                .build());

        return formBuilder.getTemporaryDataType();
    }

    /**
     * Creates a {@code C_SponsorAddress} child of the sponsor's Directory and commits.
     * Blank optional fields are left unset.
     */
    private void createSponsorAddress(DirectoryModel directory, Map<String, Object> fields)
            throws Throwable {
        C_SponsorAddressModel address = directory.add(Child.ofType(C_SponsorAddressModel.class));

        address.setC_AddressName(stringValue(fields.get(C_SponsorAddressModel.C___ADDRESS_NAME)));
        setIfPresent(address::setC_Attention, fields.get(C_SponsorAddressModel.C___ATTENTION));
        setIfPresent(address::setC_AddressLine1, fields.get(C_SponsorAddressModel.C___ADDRESS_LINE_1));
        setIfPresent(address::setC_AddressLine2, fields.get(C_SponsorAddressModel.C___ADDRESS_LINE_2));
        setIfPresent(address::setC_City, fields.get(C_SponsorAddressModel.C___CITY));
        setIfPresent(address::setC_Country, fields.get(C_SponsorAddressModel.C___COUNTRY));
        setIfPresent(address::setC_StateRegion, fields.get(C_SponsorAddressModel.C___STATE_REGION));
        setIfPresent(address::setC_PostalCode, fields.get(C_SponsorAddressModel.C___POSTAL_CODE));

        recMan.storeAndCommit(
                "Created Sponsor Address \"" + address.getC_AddressName()
                        + "\" under Directory " + directory.getDirectoryName());
    }

    /** Loads sponsor names from existing C_Sponsor records (sorted, blanks skipped). */
    private List<String> loadExistingSponsorNames() throws Throwable {
        List<DataRecord> sponsorRecords =
                dataRecordManager.getAllRecordsOfType(C_SponsorModel.DATA_TYPE_NAME, user);
        if (sponsorRecords == null || sponsorRecords.isEmpty()) {
            return List.of();
        }

        List<C_SponsorModel> sponsors =
                instMan.addExistingRecordsOfType(sponsorRecords, C_SponsorModel.class);
        Set<String> uniqueNames = new HashSet<>();
        for (C_SponsorModel sponsor : sponsors) {
            String name = sponsor.getC_SponsorName();
            if (StringUtils.isNotBlank(name)) {
                uniqueNames.add(name.trim());
            }
        }

        List<String> sponsorNames = new ArrayList<>(uniqueNames);
        Collections.sort(sponsorNames);
        return sponsorNames;
    }

    private static void setIfPresent(java.util.function.Consumer<String> setter, Object value) {
        String text = stringValue(value);
        if (StringUtils.isNotBlank(text)) {
            setter.accept(text);
        }
    }

    private static String stringValue(Object value) {
        if (value == null) {
            return "";
        }
        String text = String.valueOf(value).trim();
        return "null".equals(text) ? "" : text;
    }
}
