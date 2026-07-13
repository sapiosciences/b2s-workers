/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox;

import com.velox.api.plugin.PluginResult;
import com.velox.api.plugin.invocation.ActionMenuPlugin;
import com.velox.api.plugin.invocation.context.ActionMenuContext;
import com.velox.api.plugin.invocation.context.OnActionMenuContext;
import com.velox.api.util.PopupType;
import com.velox.sapio.commons.exemplar.plugin.veloxplugin.ExemplarVeloxServerPlugin;

import java.io.InputStream;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Properties;

/**
 * @author Connor Skevington
 * 1/29/2026
 */
public class WorkerPing extends ExemplarVeloxServerPlugin<ActionMenuContext> implements ActionMenuPlugin {

    /** Manual version - update this when releasing. */
    private static final String VERSION = "1.0.0";

    private static final String BUILD_INFO_RESOURCE = "build-info.properties";

    @Override
    public String getLine1Text() {
        return "Worker Ping";
    }

    @Override
    public String getLine2Text() {
        return null;
    }

    @Override
    protected PluginResult run(ActionMenuContext ctx) throws Throwable {
        String buildTime = loadBuildTimestamp();
        String message = "Version: " + VERSION;
        if (buildTime != null) {
            message += "\nBuilt: " + buildTime;
        } else {
            message += "\nBuilt: (unknown)";
        }
        clientCallback.displayPopup("Plugin Connection Success", message, PopupType.Info);

        return new PluginResult(true);
    }

    private static String loadBuildTimestamp() {
        try (InputStream in = WorkerPing.class.getClassLoader().getResourceAsStream(BUILD_INFO_RESOURCE)) {
            if (in != null) {
                Properties p = new Properties();
                p.load(in);
                String raw = p.getProperty("build.timestamp");
                return raw != null ? formatBuildTimeInEst(raw) : null;
            }
        } catch (Exception ignored) {
            // ignore
        }
        return null;
    }

    /** Parses the raw build timestamp and formats it in Eastern time for display. */
    private static String formatBuildTimeInEst(String raw) {
        if (raw == null || raw.isEmpty()) return null;
        java.time.ZoneId eastern = java.time.ZoneId.of("America/New_York");
        DateTimeFormatter display = DateTimeFormatter.ofPattern("MMM d, yyyy 'at' h:mm a z");
        try {
            // ISO with offset (e.g. 2026-02-25T19:08:09-05:00)
            ZonedDateTime zdt = java.time.OffsetDateTime.parse(raw, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                    .atZoneSameInstant(eastern);
            return zdt.format(display);
        } catch (DateTimeParseException e) {
            try {
                // Maven-filtered UTC instant: yyyy-MM-dd'T'HH:mm:ss'Z'
                ZonedDateTime zdt = Instant.parse(raw.trim()).atZone(eastern);
                return zdt.format(display);
            } catch (DateTimeParseException e2) {
                try {
                    // Legacy: yyyy-MM-dd HH:mm:ss with no zone — Maven UTC
                    ZonedDateTime zdt = java.time.LocalDateTime.parse(raw.trim(),
                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                            .atZone(java.time.ZoneOffset.UTC)
                            .withZoneSameInstant(eastern);
                    return zdt.format(display);
                } catch (DateTimeParseException e3) {
                    return raw.contains("${") ? null : raw;
                }
            }
        }
    }

    @Override
    public boolean onActionMenu(OnActionMenuContext ctx) throws Throwable {
        return ctx.getUser().getUserGroup().getGroupName().equals("Sapio Admin");
    }

    @Override
    public byte[] getIcon() {
        return RemoteIconUtil.getRemoteIcon(this, "connection.svg");
    }
}
