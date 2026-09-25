/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.api.datamgmtserver.DataMgmtServer;
import com.velox.api.user.User;
import com.velox.api.user.UserGroupInfo;
import com.velox.recordmodels.C_ShipmentBoxModel;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Shared visibility rules and shipment status constants for Shipment Box table toolbar buttons.
 *
 * Created: 2025-09-25
 * Agent type: Composer
 */
final class ShipmentBoxTableToolbarSupport {

    static final String LOGISTICS_GROUP = "Logistics";

    static final String STATUS_PENDING = "Pending";
    static final String STATUS_IN_TRANSIT = "In Transit";
    static final String STATUS_DELIVERED = "Delivered";

    private ShipmentBoxTableToolbarSupport() {
    }

    static boolean isLogisticsUser(User user, DataMgmtServer dataMgmtServer) throws Throwable {
        if (user == null) {
            return false;
        }
        if (user.getUserGroup() != null
                && LOGISTICS_GROUP.equalsIgnoreCase(user.getUserGroup().getGroupName())) {
            return true;
        }
        List<UserGroupInfo> groups = dataMgmtServer.getUserGroupManager(user)
                .getUserGroupInfoListForUser(user.getUsername(), user);
        if (groups == null) {
            return false;
        }
        for (UserGroupInfo groupInfo : groups) {
            if (groupInfo != null
                    && LOGISTICS_GROUP.equalsIgnoreCase(groupInfo.getUserGroupName())) {
                return true;
            }
        }
        return false;
    }

    static boolean isPending(C_ShipmentBoxModel shipmentBox) {
        return shipmentBox != null
                && STATUS_PENDING.equalsIgnoreCase(StringUtils.trimToEmpty(shipmentBox.getC_Status()));
    }

    static boolean isInTransit(C_ShipmentBoxModel shipmentBox) {
        return shipmentBox != null
                && STATUS_IN_TRANSIT.equalsIgnoreCase(StringUtils.trimToEmpty(shipmentBox.getC_Status()));
    }
}
