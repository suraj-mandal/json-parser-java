package org.example.validators;

import java.io.*;

import org.apache.commons.io.FilenameUtils;

public class JsonMetadataValidator {

    private String fileLocation;

    private static boolean isValidJsonFile(File inputFile) {
        return inputFile.exists()
                && inputFile.isFile()
                && FilenameUtils.getExtension(inputFile.getName()).equals("json");
    }

    public JsonMetadataValidator() {
    }

    public JsonMetadataValidator validateFileMetadata(String fileLocation) throws IllegalArgumentException, IOException {
        if (this.fileLocation != null) {
            throw new IllegalArgumentException("File location already set");
        }
        if (!isValidJsonFile(new File(fileLocation))) {
            throw new IOException("File not found");
        }
        this.fileLocation = fileLocation;
        return this;
    }

    public String extractFileContents() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileLocation));
        int inputChar;
        while ((inputChar = inputStreamReader.read()) != -1) {
            contentBuilder.append((char) inputChar);
        }
        return contentBuilder.toString();
    }
}
