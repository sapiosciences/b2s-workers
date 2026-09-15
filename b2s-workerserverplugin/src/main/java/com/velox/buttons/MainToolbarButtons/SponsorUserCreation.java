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
import com.velox.api.datarecord.DataRecord;
import com.velox.api.datatype.DataTypeDefinition;
import com.velox.api.datatype.TemporaryDataType;
import com.velox.api.datatype.fielddefinition.VeloxFieldDefinition;
import com.velox.api.datatype.fielddefinition.VeloxStringFieldDefinition;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.api.servermanager.DataTypeManager;
import com.velox.api.user.User;
import com.velox.api.user.UserCriteria;
import com.velox.api.user.UserGroup;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserGroupManager;
import com.velox.api.user.VeloxUserManager;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.VeloxUserModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main toolbar button for sponsor user creation.
 * Prompts for VeloxUser fields (email + password required), then creates and saves the user.
 *
 * @author Connor Skevington
 */
public class SponsorUserCreation extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String PASSWORD_FIELD = "Password";
    private static final String USER_GROUP_FIELD = "UserGroup";
    private static final String SPONSOR_APPROVER_GROUP = "Sponsor Approver";
    private static final String SPONSOR_VIEWER_GROUP = "Sponsor Viewer";
    private static final List<String> SPONSOR_USER_GROUPS = List.of(
            SPONSOR_APPROVER_GROUP,
            SPONSOR_VIEWER_GROUP
    );

    @Override
    public String getLine1Text() {
        return "Sponsor User";
    }

    @Override
    public String getLine2Text() {
        return "Creation";
    }

    @Override
    public String getDescription() {
        return "Create a sponsor user.";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "account-plus.svg");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        return true;
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            Map<String, Object> entered = promptForUserFields();
            createAndSaveUser(entered);
            clientCallback.displayPopup("Sponsor User Created",
                    "User " + resolveUsername(entered) + " was created successfully.",
                    PopupType.Success);
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * Builds an explicit form with VeloxUser fields plus Password.
     * Only email and password are required.
     */
    private Map<String, Object> promptForUserFields() throws Throwable {
        TemporaryDataType formType = buildUserEntryForm();

        Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                "Create Sponsor User",
                "Enter details for the new sponsor user. Email and password are required.",
                formType,
                user);
        if (entered == null) {
            throw new UserRequestedCancelServerException();
        }

        String email = stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS));
        String password = stringValue(entered.get(PASSWORD_FIELD));
        if (StringUtils.isBlank(email) || StringUtils.isBlank(password)) {
            clientCallback.displayError("Email and password are required.");
            throw new UserRequestedCancelServerException();
        }
        return entered;
    }

    /**
     * Explicit FormBuilder fields for each VeloxUser value we collect, plus Password and User Group.
     * Sponsor uses the real VeloxUser field definition so picklists/tags/etc. are preserved.
     */
    private TemporaryDataType buildUserEntryForm() throws Throwable {
        FormBuilder formBuilder = new FormBuilder();

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.USERNAME)
                .displayName("Username")
                .required(false)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(PASSWORD_FIELD)
                .displayName("Password")
                .required(true)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.EMAIL_ADDRESS)
                .displayName("Email Address")
                .stringFormat(VeloxStringFieldDefinition.StringFormat.EMAIL)
                .required(true)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.FIRST_NAME)
                .displayName("First Name")
                .required(false)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.MIDDLE_NAME)
                .displayName("Middle Name")
                .required(false)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.LAST_NAME)
                .displayName("Last Name")
                .required(false)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.JOB_TITLE)
                .displayName("Job Title")
                .required(false)
                .editable(true)
                .visible(true)
                .build());
        formBuilder.addField(getSponsorFieldDefinition());
        formBuilder.addField(VeloxFieldDefinition.selectionFieldBuilder()
                .dataFieldName(USER_GROUP_FIELD)
                .displayName("User Groups")
                .required(false)
                .editable(true)
                .visible(true)
                .multiSelect(true)
                .directEdit(false)
                .staticListValues(SPONSOR_USER_GROUPS)
                .build());

        return formBuilder.getTemporaryDataType();
    }

    /**
     * Copies the VeloxUser {@code C_Sponsor} field definition and makes it dialog-editable.
     */
    private VeloxFieldDefinition<?> getSponsorFieldDefinition() throws Throwable {
        DataTypeDefinition veloxUserDef = getInstance(DataTypeManager.class)
                .getDataTypeDefinition(VeloxUserModel.DATA_TYPE_NAME);
        if (veloxUserDef == null) {
            clientCallback.displayError("VeloxUser data type is not available.");
            throw new UserRequestedCancelServerException();
        }

        Map<String, VeloxFieldDefinition<?>> fields =
                veloxUserDef.getVeloxFieldDefinitionMapWithExtensions(user);
        VeloxFieldDefinition<?> sponsorField = fields.get(VeloxUserModel.C___SPONSOR);
        if (sponsorField == null) {
            clientCallback.displayError("Sponsor field is not defined on VeloxUser.");
            throw new UserRequestedCancelServerException();
        }

        VeloxFieldDefinition<?> dialogField = sponsorField.copy();
        dialogField.setSystemField(false);
        dialogField.setVisible(true);
        dialogField.setEditable(true);
        dialogField.setRequired(false);
        return dialogField;
    }

    /**
     * Creates an active VeloxUser from the form values and commits password / profile / record fields.
     */
    private void createAndSaveUser(Map<String, Object> entered) throws Throwable {
        String username = resolveUsername(entered);
        String password = stringValue(entered.get(PASSWORD_FIELD));

        VeloxUserManager userManager = dataMgmtServer.getVeloxUserManager(user);
        if (userManager.getUser(user, username) != null) {
            clientCallback.displayError("A user with username \"" + username + "\" already exists.");
            throw new UserRequestedCancelServerException();
        }

        User newUser = userManager.createUser(
                UserCriteria.builder().username(username).build(),
                user);
        newUser.activate(user);
        newUser.setPassword(password);
        newUser.setEmailAddress(stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS)));
        newUser.setFirstName(stringValue(entered.get(VeloxUserModel.FIRST_NAME)));
        newUser.setMiddleName(stringValue(entered.get(VeloxUserModel.MIDDLE_NAME)));
        newUser.setLastName(stringValue(entered.get(VeloxUserModel.LAST_NAME)));
        newUser.setJobTitle(stringValue(entered.get(VeloxUserModel.JOB_TITLE)));
        newUser.setPasswordExpireInterval((short) -1);
        newUser.setPasswordExpireDate(-1L);

        // Dialog-only fields; everything else can go on the VeloxUser record.
        Map<String, Object> recordFields = new HashMap<>(entered);
        recordFields.remove(PASSWORD_FIELD);
        recordFields.remove(USER_GROUP_FIELD);
        recordFields.values().removeIf(value -> value == null
                || (value instanceof String str && StringUtils.isBlank(str)));

        if (!recordFields.isEmpty()) {
            DataRecord userDataRecord = newUser.getUserDataRecord(user);
            userDataRecord.setFields(recordFields, user);
            dataRecordManager.storeAndCommit(
                    "Set fields on sponsor user " + username,
                    clientCallback.getClientCallbackRMI(),
                    user);
        }

        newUser.commitChanges(user);
        // createUser auto-adds users to every "default" group; sync membership to only what was selected.
        String selectedGroupsRaw = stringValue(entered.get(USER_GROUP_FIELD));
        syncUserGroups(username, selectedGroupsRaw);
        // User must already exist/commit before Directory ACL can reference them.
        updateDirectoryAcls(username, stringValue(entered.get(VeloxUserModel.C___SPONSOR)), selectedGroupsRaw);
    }

    /**
     * Grants the new user ACL only on the Directory whose name matches the selected sponsor.
     * Removes that user's ACL from every other Directory, and clears group permissions on all
     * Directory ACLs so access is user-based only.
     * <p>
     * Sponsor Approver gets full access; Sponsor Viewer alone gets read-only access.
     */
    private void updateDirectoryAcls(String username, String sponsorName, String selectedGroupsRaw)
            throws Throwable {
        if (StringUtils.isBlank(sponsorName)) {
            clientCallback.displayWarning("No sponsor was selected; Directory ACL was not updated.");
            return;
        }

        List<DataRecord> directoryRecords =
                dataRecordManager.getAllRecordsOfType(DirectoryModel.DATA_TYPE_NAME, user);
        if (directoryRecords == null || directoryRecords.isEmpty()) {
            clientCallback.displayWarning("No Directory records found; ACL was not updated.");
            return;
        }

        List<DirectoryModel> directories =
                instMan.addExistingRecordsOfType(directoryRecords, DirectoryModel.class);

        DirectoryModel matchingDirectory = null;
        for (DirectoryModel directory : directories) {
            if (StringUtils.equals(sponsorName, directory.getDirectoryName())) {
                matchingDirectory = directory;
                break;
            }
        }
        if (matchingDirectory == null) {
            clientCallback.displayWarning(
                    "No Directory named \"" + sponsorName + "\" was found; ACL was not updated.");
            return;
        }

        DataRecordAccess matchingDirectoryAccess = buildSponsorDirectoryAccess(selectedGroupsRaw);
        Long matchingRecordId = matchingDirectory.getRecordId();
        for (DirectoryModel directory : directories) {
            DataRecord directoryRecord = directory.getDataRecord();
            DataRecordACL acl = directoryRecord.getDataRecordACL(user);
            if (acl == null) {
                acl = new DataRecordACL(directoryRecord.getRecordId());
            }

            // Directories use user permissions only — no group ACL entries.
            acl.setGroupAccessMap(new HashMap<>());

            if (matchingRecordId.equals(directory.getRecordId())) {
                acl.setUserAccess(username, matchingDirectoryAccess);
            } else {
                Map<String, DataRecordAccess> userAccessMap = acl.getDataRecordAccessMap();
                if (userAccessMap == null) {
                    userAccessMap = new HashMap<>();
                } else {
                    userAccessMap = new HashMap<>(userAccessMap);
                }
                userAccessMap.remove(username);
                acl.setDataRecordAccessMap(userAccessMap);
            }

            // Propagate ACL to descendants.
            directoryRecord.setDataRecordACL(acl, true, user);
        }

        dataRecordManager.storeAndCommit(
                "Updated Directory ACL for sponsor user " + username,
                clientCallback.getClientCallbackRMI(),
                user);
    }

    /**
     * Approvers get full directory access; viewers alone get read-only.
     * If both groups are selected, Approver access wins.
     */
    private static DataRecordAccess buildSponsorDirectoryAccess(String selectedGroupsRaw) {
        Set<String> selectedGroups = parseCsv(selectedGroupsRaw);
        if (selectedGroups.contains(SPONSOR_APPROVER_GROUP)) {
            DataRecordAccess fullAccess = new DataRecordAccess(true, true, true, true);
            fullAccess.setAccess(DataRecordAccess.ACLMGMT, true);
            return fullAccess;
        }
        // Sponsor Viewer (or no recognized group): read only
        return new DataRecordAccess(true, false, false, false);
    }

    /**
     * Sets the user's group membership to exactly the selected groups.
     * {@code createUser} auto-assigns default groups, so extras are removed here.
     */
    private void syncUserGroups(String username, String groupNamesRaw) throws Throwable {
        Set<String> selectedGroupNames = parseCsv(groupNamesRaw);
        UserGroupManager groupMan = dataMgmtServer.getUserGroupManager(user);

        Map<String, Integer> groupNameToId = new HashMap<>();
        for (UserGroupInfo groupInfo : groupMan.getUserGroupInfoList(user)) {
            groupNameToId.put(groupInfo.getUserGroupName(), groupInfo.getUserGroupId());
        }

        Set<String> currentGroupNames = new HashSet<>();
        List<UserGroupInfo> currentGroups = groupMan.getUserGroupInfoListForUser(username, user);
        if (currentGroups != null) {
            for (UserGroupInfo groupInfo : currentGroups) {
                currentGroupNames.add(groupInfo.getUserGroupName());
            }
        }

        // Remove auto-assigned (or otherwise extra) groups that were not selected.
        for (String currentGroupName : currentGroupNames) {
            if (selectedGroupNames.contains(currentGroupName)) {
                continue;
            }
            Integer groupId = groupNameToId.get(currentGroupName);
            if (groupId == null) {
                continue;
            }
            UserGroup userGroup = groupMan.getUserGroup(groupId);
            userGroup.removeUserList(user, Collections.singletonList(username));
            groupMan.commitChanges(userGroup, user);
        }

        // Add selected groups the user is not already in.
        for (String groupName : selectedGroupNames) {
            if (currentGroupNames.contains(groupName)) {
                continue;
            }
            Integer groupId = groupNameToId.get(groupName);
            if (groupId == null) {
                clientCallback.displayWarning("Group \"" + groupName + "\" does not exist in the system.");
                continue;
            }
            UserGroup userGroup = groupMan.getUserGroup(groupId);
            userGroup.addUserList(user, Collections.singletonList(username));
            groupMan.commitChanges(userGroup, user);
        }
    }

    private static Set<String> parseCsv(String value) {
        Set<String> values = new HashSet<>();
        if (StringUtils.isBlank(value)) {
            return values;
        }
        for (String part : StringUtils.split(value, ',')) {
            if (StringUtils.isNotBlank(part)) {
                values.add(part.trim());
            }
        }
        return values;
    }

    /**
     * Prefer the entered username; fall back to email when username is blank.
     */
    private static String resolveUsername(Map<String, Object> entered) {
        String username = stringValue(entered.get(VeloxUserModel.USERNAME));
        if (StringUtils.isNotBlank(username)) {
            return username.trim();
        }
        return stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS)).trim();
    }

    private static String stringValue(Object value) {
        return value == null ? null : value.toString();
    }
}
