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
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.api.user.UserGroupInfo;
import com.velox.api.user.UserGroupManager;
import com.velox.api.util.PopupType;
import com.velox.recordmodels.DirectoryModel;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Main toolbar button that resets Directory group ACL entries system-wide.
 * <ul>
 *   <li>Root Directory ({@code /}) — every group gets full access (except Owner and Grant) so
 *       all users can reach the tree</li>
 *   <li>All other Directories — Sponsor Approver / Sponsor Viewer get no group permissions
 *       (those users rely on per-user ACL from {@link SponsorUserCreation}); every other group
 *       gets full permissions except Owner and Grant (ACLMGMT)</li>
 * </ul>
 *
 * @author Connor Skevington
 */
public class ResetDirectoryGroupAcl extends ExemplarVeloxServerPlugin<ActionMenuContext>
        implements ActionMenuPlugin {

    private static final String ROOT_DIRECTORY_NAME = "/";
    private static final String SPONSOR_APPROVER_GROUP = "Sponsor Approver";
    private static final String SPONSOR_VIEWER_GROUP = "Sponsor Viewer";
    private static final Set<String> SPONSOR_USER_GROUPS = Set.of(
            SPONSOR_APPROVER_GROUP,
            SPONSOR_VIEWER_GROUP
    );

    @Override
    public String getLine1Text() {
        return "Reset Directory";
    }

    @Override
    public String getLine2Text() {
        return "Group ACL";
    }

    @Override
    public String getDescription() {
        return "Reset Directory group ACL: root stays open to all groups; other directories clear "
                + "sponsor groups and grant other groups full access (except Owner and Grant).";
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "shield-key.svg");
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        return true;
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        try {
            boolean confirmed = clientCallback.showOkCancelDialog(
                    "Reset Directory Group ACL",
                    "This will update group ACL on every Directory:\n"
                            + "- Root (/): grant all groups full access except Owner and Grant\n"
                            + "- Other directories: remove Sponsor Approver / Sponsor Viewer; "
                            + "grant all other groups full access except Owner and Grant\n\n"
                            + "User-level ACL will not be changed. Continue?");
            if (!confirmed) {
                throw new UserRequestedCancelServerException();
            }

            int updatedCount = resetAllDirectoryGroupAcls();
            clientCallback.displayPopup(
                    "Directory Group ACL Reset",
                    "Updated group ACL on " + updatedCount + " Directory record(s).",
                    PopupType.Success);
            return new PluginResult(true);
        } catch (UserRequestedCancelServerException e) {
            return new PluginResult(true);
        }
    }

    /**
     * Walks every Directory and rewrites its group ACL map.
     * Root ({@code /}) gets all groups; other directories clear sponsor groups.
     *
     * @return number of Directory records updated
     */
    private int resetAllDirectoryGroupAcls() throws Throwable {
        List<DataRecord> directoryRecords =
                dataRecordManager.getAllRecordsOfType(DirectoryModel.DATA_TYPE_NAME, user);
        if (directoryRecords == null || directoryRecords.isEmpty()) {
            clientCallback.displayWarning("No Directory records found; nothing to update.");
            return 0;
        }

        Map<Integer, String> groupIdToName = new HashMap<>();
        Set<Integer> sponsorGroupIds = new HashSet<>();
        UserGroupManager groupMan = dataMgmtServer.getUserGroupManager(user);
        for (UserGroupInfo groupInfo : groupMan.getUserGroupInfoList(user)) {
            String groupName = groupInfo.getUserGroupName();
            Integer groupId = groupInfo.getUserGroupId();
            groupIdToName.put(groupId, groupName);
            if (SPONSOR_USER_GROUPS.contains(groupName)) {
                sponsorGroupIds.add(groupId);
            }
        }

        if (sponsorGroupIds.size() < SPONSOR_USER_GROUPS.size()) {
            clientCallback.displayWarning(
                    "One or both sponsor user groups were not found. Present groups will still be "
                            + "cleared on non-root directories; other groups will be updated.");
        }

        DataRecordAccess otherGroupAccess = buildOtherGroupAccess();
        List<DirectoryModel> directories =
                instMan.addExistingRecordsOfType(directoryRecords, DirectoryModel.class);

        for (DirectoryModel directory : directories) {
            DataRecord directoryRecord = directory.getDataRecord();
            DataRecordACL acl = directoryRecord.getDataRecordACL(user);
            if (acl == null) {
                acl = new DataRecordACL(directoryRecord.getRecordId());
            }

            boolean isRoot = ROOT_DIRECTORY_NAME.equals(directory.getDirectoryName());
            Map<Integer, DataRecordAccess> groupAccessMap = new HashMap<>();
            for (Map.Entry<Integer, String> entry : groupIdToName.entrySet()) {
                Integer groupId = entry.getKey();
                if (!isRoot && sponsorGroupIds.contains(groupId)) {
                    // Non-root: sponsor groups intentionally get no group ACL entry.
                    continue;
                }
                groupAccessMap.put(groupId, otherGroupAccess);
            }

            acl.setGroupAccessMap(groupAccessMap);
            // Root: update the Directory record only — do not cascade "everyone" down the tree.
            directoryRecord.setDataRecordACL(acl, !isRoot, user);
        }

        dataRecordManager.storeAndCommit(
                "Reset Directory group ACL for all directories",
                clientCallback.getClientCallbackRMI(),
                user);
        return directories.size();
    }

    /**
     * Full access for non-sponsor groups: Read/Write/Delete (and related), but not Owner or Grant.
     */
    private static DataRecordAccess buildOtherGroupAccess() {
        DataRecordAccess access = new DataRecordAccess(true, true, true, true);
        access.setAccess(DataRecordAccess.OWNER, false);
        access.setAccess(DataRecordAccess.ACLMGMT, false);
        return access;
    }
}
