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
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.datatypelayout.DataTypeLayout;
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
 *   <li>Prompt for address fields using the Data Designer layout
 *       {@code Sponsor Address Creation} on {@code C_SponsorAddress}</li>
 *   <li>Create {@code C_SponsorAddress} as a child of that Directory</li>
 * </ol>
 *
 * @author Connor Skevington
 */
public class SponsorAddressCreation extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String SPONSOR_FIELD = "Sponsor";

    /** C_SponsorAddress layout in Data Designer that drives the address details popup. */
    private static final String SPONSOR_ADDRESS_CREATION_LAYOUT = "Sponsor Address Creation";

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

            String addressName = stringValue(addressFields.get(C_SponsorAddressModel.C___ADDRESS_NAME));
            clientCallback.displayPopup(
                    "Sponsor Address Created",
                    StringUtils.isNotBlank(addressName)
                            ? "Address \"" + addressName + "\" was created under " + sponsorName + "."
                            : "Sponsor Address was created under " + sponsorName + ".",
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

    /**
     * Second dialog: collect address fields from the Data Designer layout
     * {@link #SPONSOR_ADDRESS_CREATION_LAYOUT}. Required/optional flags come from that layout.
     */
    private Map<String, Object> promptForAddressFields(String sponsorName) throws Throwable {
        TemporaryDataType form = loadSponsorAddressCreationForm();
        Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                "Create Sponsor Address",
                "Enter address details for " + sponsorName + ".",
                form,
                user);
        if (entered == null || entered.isEmpty()) {
            throw new UserRequestedCancelServerException();
        }
        return entered;
    }

    /**
     * Pulls the "Sponsor Address Creation" layout off {@code C_SponsorAddress} so the popup
     * matches Data Designer. Tries the layout's internal name first, then its display name.
     */
    private TemporaryDataType loadSponsorAddressCreationForm() throws Throwable {
        DataTypeDefinition addressDefinition = dataMgmtServer.getDataTypeManager(user)
                .getDataTypeDefinition(C_SponsorAddressModel.DATA_TYPE_NAME);

        TemporaryDataType form =
                addressDefinition.getTemporaryDataType(SPONSOR_ADDRESS_CREATION_LAYOUT, user);
        if (form != null) {
            return form;
        }

        List<DataTypeLayout> layouts = addressDefinition.getDataTypeLayoutList(user);
        if (layouts != null) {
            for (DataTypeLayout layout : layouts) {
                if (SPONSOR_ADDRESS_CREATION_LAYOUT.equals(layout.getLayoutName())
                        || SPONSOR_ADDRESS_CREATION_LAYOUT.equals(layout.getDisplayName())) {
                    form = addressDefinition.getTemporaryDataType(layout.getLayoutName(), user);
                    if (form != null) {
                        return form;
                    }
                }
            }
        }

        clientCallback.displayError("C_SponsorAddress layout \"" + SPONSOR_ADDRESS_CREATION_LAYOUT
                + "\" was not found. Check the layout name in Data Designer and try again.");
        throw new UserRequestedCancelServerException();
    }

    /**
     * Creates a {@code C_SponsorAddress} child of the sponsor's Directory and commits.
     * Field values come straight from the layout dialog (same pattern as {@link CreateSubmission}).
     */
    private void createSponsorAddress(DirectoryModel directory, Map<String, Object> fields)
            throws Throwable {
        C_SponsorAddressModel address = directory.add(Child.ofType(C_SponsorAddressModel.class));
        address.setFields(fields);

        String addressName = stringValue(fields.get(C_SponsorAddressModel.C___ADDRESS_NAME));
        recMan.storeAndCommit(
                "Created Sponsor Address"
                        + (StringUtils.isNotBlank(addressName) ? " \"" + addressName + "\"" : "")
                        + " under Directory " + directory.getDirectoryName());
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

    private static String stringValue(Object value) {
        if (value == null) {
            return "";
        }
        String text = String.valueOf(value).trim();
        return "null".equals(text) ? "" : text;
    }
}
