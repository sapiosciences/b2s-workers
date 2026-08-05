/*
 * Copyright (C) 2005 - Sapio Sciences <support@sapiosciences.com>
 * ====================================================================
 * This software is the property of Sapio Sciences.
 * ====================================================================
 */
package com.velox.InstrumentIntegrationPlugins;

import com.velox.api.datarecord.DataRecord;
import com.velox.api.exception.recoverability.serverexception.UserRequestedCancelServerException;
import com.velox.api.util.ServerException;
import com.velox.sapio.commons.exemplar.plugin.instrumentation.AbstractVeloxFileParser;
import com.velox.sapio.commons.utils.StreamingUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Parses Synergy H1 titer assessment Excel exports.
 * Reads Plate sheets only (skips Analysis), pulls Plate Number, and extracts the
 * Results plate diagram values (450, 630, and Delta) for each well.
 *
 * @author Connor Skevington
 * 8/5/2026
 */
public class SynergyH1CustomParser extends AbstractVeloxFileParser {

    private static final List<String> COLUMN_HEADERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");

    /** Column B holds the plate-row letter; columns C–N hold well values 1–12. */
    private static final int ROW_LETTER_COL = 1;
    private static final int FIRST_VALUE_COL = 2;
    private static final int PLATE_ROWS = 8;
    private static final int READINGS_PER_ROW = 3;

    public SynergyH1CustomParser() {
        super("SynergyH1");
    }

    @Override
    public List<Map<String, Object>> parse(List<DataRecord> files) throws Throwable {
        List<Map<String, Object>> returnList = new ArrayList<>();

        for (DataRecord file : files) {
            byte[] attachmentData = StreamingUtil.readBytesFromRecord(file, user);
            returnList.addAll(performParsing(attachmentData));
        }

        return returnList;
    }

    private List<Map<String, Object>> performParsing(byte[] data) throws IOException, ServerException {
        if (ArrayUtils.isEmpty(data)) {
            displayWarning("Did not receive data from the file.");
            throw new UserRequestedCancelServerException();
        }

        List<Map<String, Object>> returnList = new ArrayList<>();

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             Workbook workbook = new XSSFWorkbook(bais)) {

            DataFormatter formatter = new DataFormatter();

            for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
                Sheet sheet = workbook.getSheetAt(sheetIndex);
                String sheetName = sheet.getSheetName();
                if (sheetName == null || !sheetName.contains("Plate")) {
                    continue;
                }

                String plateNumber = retrievePlateNumber(sheet, formatter);
                List<Map<String, Object>> resultsRows = readResultsPlateData(sheet, formatter);
                returnList.addAll(buildWellMaps(resultsRows, plateNumber));
            }
        } catch (UserRequestedCancelServerException e) {
            throw e;
        } catch (Exception e) {
            displayWarning("Error reading Synergy H1 Excel file: " + e.getMessage());
            throw new RuntimeException("Failed to read Synergy H1 Excel file", e);
        }

        return returnList;
    }

    private String retrievePlateNumber(Sheet sheet, DataFormatter formatter) throws ServerException, RemoteException {
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                continue;
            }

            String label = formatCell(row.getCell(0), formatter);
            if ("Plate Number".equalsIgnoreCase(label)) {
                String value = formatCell(row.getCell(1), formatter);
                if (value != null && !value.isBlank()) {
                    return value.trim();
                }
            }
        }

        displayWarning("Could not find Plate Number on sheet \"" + sheet.getSheetName() + "\".");
        throw new UserRequestedCancelServerException();
    }

    /**
     * Locates the Results plate diagram (second block of 1–12 headers) and converts
     * each Excel data row into a dictionary keyed by {@code <>} plus columns 1–12.
     * Each plate row contributes three dictionaries: 450, 630, then Delta.
     */
    private List<Map<String, Object>> readResultsPlateData(Sheet sheet, DataFormatter formatter)
            throws ServerException, RemoteException {

        int headerRowIndex = findResultsHeaderRow(sheet, formatter);
        if (headerRowIndex < 0) {
            displayWarning("Could not find Results plate headers (1–12) on sheet \"" + sheet.getSheetName() + "\".");
            throw new UserRequestedCancelServerException();
        }

        List<Map<String, Object>> result = new ArrayList<>();
        int expectedRows = PLATE_ROWS * READINGS_PER_ROW;

        for (int offset = 1; offset <= expectedRows; offset++) {
            Row row = sheet.getRow(headerRowIndex + offset);
            if (row == null) {
                continue;
            }

            Map<String, Object> rowMap = new LinkedHashMap<>();
            // Row letter lives in column B; values for columns 1–12 live in C–N.
            String rowLetter = formatCell(row.getCell(ROW_LETTER_COL), formatter);
            rowMap.put("<>", (rowLetter == null || rowLetter.isBlank()) ? null : rowLetter.trim());

            for (int colOffset = 0; colOffset < COLUMN_HEADERS.size(); colOffset++) {
                String header = COLUMN_HEADERS.get(colOffset);
                String value = formatCell(row.getCell(FIRST_VALUE_COL + colOffset), formatter);
                rowMap.put(header, (value == null || value.isBlank()) ? null : value.trim());
            }

            // Column O holds the reading type (450 / 630 / Delta).
            String readingType = formatCell(row.getCell(FIRST_VALUE_COL + COLUMN_HEADERS.size()), formatter);
            if (readingType != null && !readingType.isBlank()) {
                rowMap.put("ReadingType", readingType.trim());
            }

            result.add(rowMap);
        }

        if (result.size() < expectedRows) {
            displayWarning("Results plate diagram on sheet \"" + sheet.getSheetName()
                    + "\" did not contain the expected " + expectedRows + " data rows.");
            throw new UserRequestedCancelServerException();
        }

        return result;
    }

    /**
     * Finds the second occurrence of a 1–12 header row (Layout is first, Results is second).
     */
    private int findResultsHeaderRow(Sheet sheet, DataFormatter formatter) {
        int matches = 0;
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                continue;
            }
            if (isPlateHeaderRow(row, formatter)) {
                matches++;
                if (matches == 2) {
                    return rowIndex;
                }
            }
        }
        return -1;
    }

    private boolean isPlateHeaderRow(Row row, DataFormatter formatter) {
        for (int colOffset = 0; colOffset < COLUMN_HEADERS.size(); colOffset++) {
            String expected = COLUMN_HEADERS.get(colOffset);
            String actual = formatCell(row.getCell(FIRST_VALUE_COL + colOffset), formatter);
            if (actual == null || !expected.equals(actual.trim())) {
                return false;
            }
        }
        return true;
    }

    private List<Map<String, Object>> buildWellMaps(List<Map<String, Object>> resultsRows, String plateNumber) {
        List<Map<String, Object>> returnList = new ArrayList<>();

        for (int plateRowIndex = 0; plateRowIndex < PLATE_ROWS; plateRowIndex++) {
            int base = plateRowIndex * READINGS_PER_ROW;
            Map<String, Object> reading450 = resultsRows.get(base);
            Map<String, Object> reading630 = resultsRows.get(base + 1);
            Map<String, Object> readingDelta = resultsRows.get(base + 2);

            String rowLetter = valueAsString(reading450.get("<>"));
            if (rowLetter == null || rowLetter.isBlank()) {
                // 630/Delta rows omit the letter; fall back if needed.
                rowLetter = valueAsString(reading630.get("<>"));
            }
            if (rowLetter == null || rowLetter.isBlank()) {
                continue;
            }

            for (String column : COLUMN_HEADERS) {
                Object raw450 = reading450.get(column);
                boolean isOverflow = isOverflowValue(raw450);

                Map<String, Object> map = new HashMap<>();
                map.put("PlateNumber", plateNumber);
                map.put("FileSpecifiedRow", rowLetter);
                map.put("FileSpecifiedColumn", column);
                map.put("wellId", retrieveWellId(rowLetter, column));
                map.put("450", isOverflow ? "4" : raw450);
                map.put("630", reading630.get(column));
                map.put("Delta", readingDelta.get(column));
                map.put("overflow", isOverflow ? "true" : "false");
                returnList.add(map);
            }
        }

        return returnList;
    }

    private boolean isOverflowValue(Object value) {
        if (value == null) {
            return false;
        }
        String normalized = value.toString().trim();
        return "OVRFLW".equalsIgnoreCase(normalized) || "OVERFLOW".equalsIgnoreCase(normalized);
    }

    private String retrieveWellId(String row, String column) {
        return String.format("%s%02d", row, Integer.parseInt(column));
    }

    private String formatCell(Cell cell, DataFormatter formatter) {
        if (cell == null) {
            return null;
        }
        return formatter.formatCellValue(cell);
    }

    private String valueAsString(Object value) {
        return value == null ? null : value.toString();
    }
}
