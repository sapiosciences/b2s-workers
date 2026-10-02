/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.buttons.TableToolbarButtons;

import com.velox.api.user.User;
import com.velox.recordmodels.C_ShipmentBoxModel;
import org.apache.commons.lang3.StringUtils;

import java.rmi.RemoteException;

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

    /** True only when the user's currently active group is Logistics (membership alone is not enough). */
    static boolean isLogisticsUser(User user) throws RemoteException {
        return LOGISTICS_GROUP.equalsIgnoreCase(user.getUserGroup().getGroupName());
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
