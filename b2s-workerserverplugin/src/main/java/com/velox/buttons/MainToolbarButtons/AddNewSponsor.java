/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.MainToolbarButtons;

import com.velox.RemoteIconUtil;
import com.velox.api.access.DataRecordACL;
import com.velox.api.access.DataRecordAccess;
import com.velox.api.clientcallback.InputDialogCriteria;
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserGroupManager;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.C_SponsorModel;
import com.velox.recordmodels.DirectoryModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import com.velox.sapio.commons.exemplar.recordmodel.relationship.Child;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main toolbar button: create Sponsor(s) under root, each with a child Directory.
 *
 * <p>Flow:
 * <ol>
 *   <li>Ask how many, then collect names (form or table)</li>
 *   <li>Create each C_Sponsor as a child of root</li>
 *   <li>Create each Directory as a child of that Sponsor (not under root)</li>
 *   <li>Commit, set Directory ACL, commit</li>
 * </ol>
 *
 * @author Connor Skevington
 */
public class AddNewSponsor extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final long ROOT_DIRECTORY_RECORD_ID = 1L;
    private static final String SPONSOR_NAME_FIELD = C_SponsorModel.C___SPONSOR_NAME;

    private static final Set<String> SPONSOR_USER_GROUPS = Set.of(
            "Sponsor Approver",
            "Sponsor Viewer"
    );

    @Override
    public String getLine1Text() {
        return "Add New";
    }

    @Override
    public String getLine2Text() {
        return "Sponsor";
    }

    @Override
    public String getDescription() {
        return "Create Sponsors under root, each with a child Directory.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "plus-circle-outline.svg");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        return true;
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            List<String> sponsorNames = promptForSponsorNames();
            createSponsorsAndDirectories(sponsorNames);
            clientCallback.displayPopup(
                    "Sponsors Created",
                    "Created " + sponsorNames.size() + " Sponsor(s) under root.",
                    PopupType.Success);
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /** Ask how many, then collect names via a form (1) or table (2+). */
    private List<String> promptForSponsorNames() throws Throwable {
        int count = ((Number) clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Add New Sponsors")
                .message("How many sponsors do you want to create?")
                .fieldDefinition(VeloxFieldDefinition.integerFieldBuilder()
                        .dataFieldName("SponsorCount")
                        .displayName("Number of Sponsors")
                        .minValue(1)
                        .maxValue(500)
                        .defaultValue(1)
                        .required(true)
                        .build())
                .build()).getValue()).intValue();

        TemporaryDataType formType = buildSponsorNameForm();
        List<Map<String, Object>> rows;
        if (count == 1) {
            rows = List.of(clientCallback.showFieldEntryDialog(
                    "Add New Sponsor",
                    "Enter the sponsor name. A Directory with the same name is created under that Sponsor.",
                    formType,
                    user));
        } else {
            List<Map<String, Object>> blankRows = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                blankRows.add(new HashMap<>());
            }
            rows = clientCallback.showTableEntryDialog(
                    "Add New Sponsors",
                    "Enter a name for each Sponsor.",
                    formType,
                    blankRows);
        }

        List<String> names = new ArrayList<>();
        for (Map<String, Object> row : rows) {
            String name = String.valueOf(row.get(SPONSOR_NAME_FIELD)).trim();
            if (StringUtils.isNotBlank(name) && !"null".equals(name)) {
                names.add(name);
            }
        }
        return names;
    }

    private TemporaryDataType buildSponsorNameForm() throws Throwable {
        FormBuilder formBuilder = new FormBuilder();
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(SPONSOR_NAME_FIELD)
                .displayName("Sponsor Name")
                .required(true)
                .editable(true)
                .visible(true)
                .build());
        return formBuilder.getTemporaryDataType();
    }

    /**
     * Create each Sponsor under root, then create its Directory as a child of that Sponsor
     * via {@code sponsor.add(Child.ofType(DirectoryModel.class))} (MCP relationship pattern).
     */
    private void createSponsorsAndDirectories(List<String> sponsorNames) throws Throwable {
        DirectoryModel root = instMan.addExistingRecordOfType(
                dataRecordManager.querySystemForRecord(
                        ROOT_DIRECTORY_RECORD_ID, DirectoryModel.DATA_TYPE_NAME, user),
                DirectoryModel.class);

        List<DirectoryModel> directories = new ArrayList<>();

        for (String name : sponsorNames) {
            // Sponsor hangs under root
            C_SponsorModel sponsor = root.add(Child.ofType(C_SponsorModel.class));
            sponsor.setC_SponsorName(name);

            // Directory hangs under the Sponsor — not under root
            DirectoryModel directory = sponsor.add(Child.ofType(DirectoryModel.class));
            directory.setDirectoryName(name);
            directories.add(directory);
        }

        recMan.storeAndCommit("Created " + sponsorNames.size() + " Sponsor(s) with child Directory(ies)");

        for (DirectoryModel directory : directories) {
            applyStandardDirectoryGroupAcl(directory.getDataRecord());
        }

        recMan.storeAndCommit("Set ACL on new Directory(ies)");
    }

    /**
     * Same non-root group ACL as {@link ResetDirectoryGroupAcl}:
     * sponsor groups get nothing; every other group gets full access except Owner/Grant.
     */
    private void applyStandardDirectoryGroupAcl(DataRecord directoryRecord) throws Throwable {
        Map<Integer, DataRecordAccess> groupAccessMap = new HashMap<>();
        DataRecordAccess otherGroupAccess = buildOtherGroupAccess();

        UserGroupManager groupMan = dataMgmtServer.getUserGroupManager(user);
        for (UserGroupInfo groupInfo : groupMan.getUserGroupInfoList(user)) {
            if (!SPONSOR_USER_GROUPS.contains(groupInfo.getUserGroupName())) {
                groupAccessMap.put(groupInfo.getUserGroupId(), otherGroupAccess);
            }
        }

        DataRecordACL acl = new DataRecordACL(directoryRecord.getRecordId());
        acl.setGroupAccessMap(groupAccessMap);
        directoryRecord.setDataRecordACL(acl, true, user);
    }

    private static DataRecordAccess buildOtherGroupAccess() {
        DataRecordAccess access = new DataRecordAccess(true, true, true, true);
        access.setAccess(DataRecordAccess.OWNER, false);
        access.setAccess(DataRecordAccess.ACLMGMT, false);
        return access;
    }
}
