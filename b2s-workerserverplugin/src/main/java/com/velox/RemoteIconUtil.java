/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox;


import com.velox.sapio.commons.exemplar.plugin.veloxplugin.AbstractSapioServerPlugin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Connor Skevington
 * 1/29/2026
 */
public class RemoteIconUtil {
    public static byte[] getRemoteIcon(AbstractSapioServerPlugin plugin, String iconPathPackage) {
        try (InputStream inputStream = plugin.getClass().getClassLoader().getResourceAsStream(iconPathPackage)) {
            if (inputStream == null) {
                return null; // Resource not found
            }
            return inputStream.readAllBytes();
        } catch (IOException e) {
            // Attempt the old method in case plugins were deployed locally:
            try {
                URL url = plugin.getClass().getClassLoader().getResource(iconPathPackage);
                if (url == null) {
                    return null;
                } else {
                    Path path = Paths.get(url.toURI());
                    return Files.readAllBytes(path);
                }
            } catch (Exception var4) {
                return null;
            }
        }
    }
}
