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
import com.velox.api.util.InputDialogResult;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.DirectoryModel;
import com.velox.recordmodels.VeloxUserModel;
import com.velox.sapio.commons.exemplar.definition.form.FormBuilder;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main toolbar button that creates one or more sponsor users.
 *
 * <p>High-level flow:
 * <ol>
 *   <li>Ask how many users to create</li>
 *   <li>If 1 → show a form; if 2+ → show a table with that many rows</li>
 *   <li>Collect only email, sponsor, and user groups (password is preset)</li>
 *   <li>Create each user, put them in the chosen groups, and update Directory ACL</li>
 * </ol>
 *
 * <p>Sponsor users get Directory access as individuals (user ACL), not through the
 * Sponsor Approver / Sponsor Viewer groups. Those two groups should have no Directory
 * group permissions — see also {@link ResetDirectoryGroupAcl}.
 *
 * @author Connor Skevington
 */
public class SponsorUserCreation extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    /** Temporary field name used only in the form/table (not a VeloxUser data field). */
    private static final String USER_GROUP_FIELD = "UserGroup";

    /**
     * Temporary password applied at creation. New users get an email invite and set
     * their own password afterward, so this value is never shown in the UI.
     */
    private static final String DEFAULT_PASSWORD = "Test!123";

    private static final String SPONSOR_APPROVER_GROUP = "Sponsor Approver";
    private static final String SPONSOR_VIEWER_GROUP = "Sponsor Viewer";

    /** Only these two groups are offered in the selection list. */
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
        return "Create one or more sponsor users.";
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
            // Gather one map of field values per user to create.
            List<Map<String, Object>> enteredUsers = promptForUsers();

            List<String> createdUsernames = new ArrayList<>();
            for (Map<String, Object> entered : enteredUsers) {
                createAndSaveUser(entered);
                createdUsernames.add(resolveUsername(entered));
            }

            clientCallback.displayPopup(
                    "Sponsor User Created",
                    createdUsernames.size() == 1
                            ? "User " + createdUsernames.get(0) + " was created successfully."
                            : createdUsernames.size() + " users were created successfully.",
                    PopupType.Success);
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            // User hit cancel (or we aborted after showing an error) — treat as a clean exit.
            return new PluginResult(true);
        }
    }

    /**
     * Asks how many users to make, then opens either a single form or a multi-row table
     * and returns the validated rows ready for creation.
     */
    private List<Map<String, Object>> promptForUsers() throws Throwable {
        int userCount = promptForUserCount();
        TemporaryDataType formType = buildUserEntryForm();

        List<Map<String, Object>> enteredUsers;
        if (userCount == 1) {
            // One user → a simple form dialog.
            Map<String, Object> entered = clientCallback.showFieldEntryDialog(
                    "Create Sponsor User",
                    "Enter email, sponsor, and user groups for the new sponsor user.",
                    formType,
                    user);
            if (entered == null) {
                throw new UserRequestedCancelServerException();
            }
            enteredUsers = List.of(entered);
        } else {
            // Multiple users → a table with one empty row per requested user.
            // Use separate HashMap instances (not Collections.nCopies) so rows stay independent.
            List<Map<String, Object>> initialRows = new ArrayList<>(userCount);
            for (int i = 0; i < userCount; i++) {
                initialRows.add(new HashMap<>());
            }
            enteredUsers = clientCallback.showTableEntryDialog(
                    "Create Sponsor Users",
                    "Enter email, sponsor, and user groups for each sponsor user.",
                    formType,
                    initialRows);
            if (enteredUsers == null || enteredUsers.isEmpty()) {
                throw new UserRequestedCancelServerException();
            }
        }

        // Email is required on every non-empty row.
        List<Map<String, Object>> validUsers = new ArrayList<>();
        for (Map<String, Object> entered : enteredUsers) {
            if (entered == null || entered.isEmpty()) {
                continue;
            }
            String email = stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS));
            if (StringUtils.isBlank(email)) {
                clientCallback.displayError("Email is required for each sponsor user.");
                throw new UserRequestedCancelServerException();
            }
            validUsers.add(entered);
        }
        if (validUsers.isEmpty()) {
            clientCallback.displayError("No sponsor user details were entered.");
            throw new UserRequestedCancelServerException();
        }
        return validUsers;
    }

    /**
     * First dialog: "How many sponsor users do you want to create?"
     * That integer drives whether we show a form (1) or a table (2+).
     */
    private int promptForUserCount() throws Throwable {
        InputDialogResult input = clientCallback.showInputDialog(InputDialogCriteria.builder()
                .title("Create Sponsor Users")
                .message("How many sponsor users do you want to create?")
                .fieldDefinition(VeloxFieldDefinition.integerFieldBuilder()
                        .dataFieldName("UserCount")
                        .displayName("Number of Users")
                        .minValue(1)
                        .maxValue(500)
                        .defaultValue(1)
                        .required(true)
                        .build())
                .build());
        if (input == null || input.getValue() == null) {
            throw new UserRequestedCancelServerException();
        }

        int userCount = ((Number) input.getValue()).intValue();
        if (userCount < 1) {
            clientCallback.displayError("Number of users must be at least 1.");
            throw new UserRequestedCancelServerException();
        }
        return userCount;
    }

    /**
     * Builds the temporary data type used by both the form and the table.
     * Only email, sponsor, and user groups are shown — no password field.
     */
    private TemporaryDataType buildUserEntryForm() throws Throwable {
        FormBuilder formBuilder = new FormBuilder();

        formBuilder.addField(VeloxFieldDefinition.stringFieldBuilder()
                .dataFieldName(VeloxUserModel.EMAIL_ADDRESS)
                .displayName("Email Address")
                .stringFormat(VeloxStringFieldDefinition.StringFormat.EMAIL)
                .required(true)
                .editable(true)
                .visible(true)
                .build());

        // Reuse the real VeloxUser sponsor field so picklists / tags stay consistent.
        formBuilder.addField(getSponsorFieldDefinition());

        // Fixed list (not USERGROUP_MODE) so operators only pick Approver and/or Viewer.
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
     * Copies the live VeloxUser {@code C_Sponsor} field definition and unlocks it for the dialog.
     * Copying avoids mutating the system field definition itself.
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
     * Creates one active VeloxUser, writes their record fields, syncs group membership,
     * then updates Directory ACL for their selected sponsor.
     */
    private void createAndSaveUser(Map<String, Object> entered) throws Throwable {
        // Username is the email address.
        String username = resolveUsername(entered);

        VeloxUserManager userManager = dataMgmtServer.getVeloxUserManager(user);
        if (userManager.getUser(user, username) != null) {
            clientCallback.displayError("A user with username \"" + username + "\" already exists.");
            throw new UserRequestedCancelServerException();
        }

        User newUser = userManager.createUser(
                UserCriteria.builder().username(username).build(),
                user);
        newUser.activate(user);
        newUser.setPassword(DEFAULT_PASSWORD);
        newUser.setEmailAddress(stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS)));
        // Never force a password change on first login via expiry flags.
        newUser.setPasswordExpireInterval((short) -1);
        newUser.setPasswordExpireDate(-1L);

        // User groups are handled separately; only real VeloxUser fields go on the record.
        Map<String, Object> recordFields = new HashMap<>(entered);
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

        // createUser also drops the user into every "default" group — strip those extras.
        String selectedGroupsRaw = stringValue(entered.get(USER_GROUP_FIELD));
        syncUserGroups(username, selectedGroupsRaw);

        // ACL needs the user to already exist in the system, so this runs after commit.
        updateDirectoryAcls(username, stringValue(entered.get(VeloxUserModel.C___SPONSOR)), selectedGroupsRaw);
    }

    /**
     * Updates Directory ACL for the new user based on their selected sponsor.
     *
     * <ul>
     *   <li>Blank sponsor → create the user, but leave Directory ACL alone</li>
     *   <li>Matching Directory (name = sponsor) → grant this user access</li>
     *   <li>Every other Directory → remove this user from the user ACL map</li>
     *   <li>Group ACL → only remove Sponsor Approver / Viewer; leave other groups alone</li>
     * </ul>
     *
     * Approvers get full access; viewers get read-only. The {@code true} on
     * {@code setDataRecordACL} pushes the ACL down to records under each Directory.
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

        // Find the Directory whose name matches the sponsor string on the user.
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

        Set<Integer> sponsorGroupIds = resolveSponsorGroupIds();
        DataRecordAccess matchingDirectoryAccess = buildSponsorDirectoryAccess(selectedGroupsRaw);
        Long matchingRecordId = matchingDirectory.getRecordId();

        for (DirectoryModel directory : directories) {
            DataRecord directoryRecord = directory.getDataRecord();
            // Keep the existing ACL object so we don't wipe unrelated user permissions.
            DataRecordACL acl = directoryRecord.getDataRecordACL(user);
            if (acl == null) {
                acl = new DataRecordACL(directoryRecord.getRecordId());
            }

            // Sponsor groups rely on per-user ACL, not group ACL.
            removeSponsorGroupsFromAcl(acl, sponsorGroupIds);

            if (matchingRecordId.equals(directory.getRecordId())) {
                acl.setUserAccess(username, matchingDirectoryAccess);
            } else {
                // Make sure this sponsor user is not left with access on other Directories.
                Map<String, DataRecordAccess> userAccessMap = acl.getDataRecordAccessMap();
                if (userAccessMap == null) {
                    userAccessMap = new HashMap<>();
                } else {
                    userAccessMap = new HashMap<>(userAccessMap);
                }
                userAccessMap.remove(username);
                acl.setDataRecordAccessMap(userAccessMap);
            }

            // true = also apply to descendants under this Directory.
            directoryRecord.setDataRecordACL(acl, true, user);
        }

        dataRecordManager.storeAndCommit(
                "Updated Directory ACL for sponsor user " + username,
                clientCallback.getClientCallbackRMI(),
                user);
    }

    /**
     * Looks up the system group IDs for Sponsor Approver and Sponsor Viewer.
     * Group ACL maps are keyed by ID, not by display name.
     */
    private Set<Integer> resolveSponsorGroupIds() throws Throwable {
        Set<Integer> sponsorGroupIds = new HashSet<>();
        UserGroupManager groupMan = dataMgmtServer.getUserGroupManager(user);
        for (UserGroupInfo groupInfo : groupMan.getUserGroupInfoList(user)) {
            if (SPONSOR_USER_GROUPS.contains(groupInfo.getUserGroupName())) {
                sponsorGroupIds.add(groupInfo.getUserGroupId());
            }
        }
        return sponsorGroupIds;
    }

    /**
     * Drops Sponsor Approver / Sponsor Viewer from a Directory's group ACL map.
     * Does not touch any other groups' permissions.
     */
    private static void removeSponsorGroupsFromAcl(DataRecordACL acl, Set<Integer> sponsorGroupIds) {
        if (sponsorGroupIds == null || sponsorGroupIds.isEmpty()) {
            return;
        }
        Map<Integer, DataRecordAccess> groupAccessMap = acl.getGroupAccessMap();
        if (groupAccessMap == null || groupAccessMap.isEmpty()) {
            return;
        }
        Map<Integer, DataRecordAccess> updated = new HashMap<>(groupAccessMap);
        for (Integer sponsorGroupId : sponsorGroupIds) {
            updated.remove(sponsorGroupId);
        }
        acl.setGroupAccessMap(updated);
    }

    /**
     * Builds the per-user Directory access level from the selected groups.
     * Approver wins if both Approver and Viewer are selected.
     */
    private static DataRecordAccess buildSponsorDirectoryAccess(String selectedGroupsRaw) {
        Set<String> selectedGroups = parseCsv(selectedGroupsRaw);
        if (selectedGroups.contains(SPONSOR_APPROVER_GROUP)) {
            DataRecordAccess fullAccess = new DataRecordAccess(true, true, true, true);
            fullAccess.setAccess(DataRecordAccess.ACLMGMT, true);
            return fullAccess;
        }
        // Viewer (or no recognized group): read-only.
        return new DataRecordAccess(true, false, false, false);
    }

    /**
     * Makes the user's group membership match exactly what was selected in the dialog.
     * Anything Sapio auto-added (default groups) that wasn't selected gets removed.
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

        // Drop groups the user should not be in.
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

        // Add any selected groups they are missing.
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

    /** Multi-select selection fields come back as a comma-separated string. */
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

    /** We use email as the Sapio username. */
    private static String resolveUsername(Map<String, Object> entered) {
        return stringValue(entered.get(VeloxUserModel.EMAIL_ADDRESS)).trim();
    }

    private static String stringValue(Object value) {
        return value == null ? null : value.toString();
    }
}
