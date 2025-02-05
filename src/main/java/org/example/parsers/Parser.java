package org.example.parsers;

import org.example.tokenizer.JsonTokenizer;
import org.example.validators.JsonMetadataValidator;

public class Parser {
    // this is the main entry point of the application
    public static boolean isValidJson(String jsonFileLocation) {
        try {
            String fileContents = new JsonMetadataValidator()
                    .validateFileMetadata(jsonFileLocation)
                    .extractFileContents();

            // this checks the content
            // for stage 1 we are checking if the json has opening and closing
            // parenthesis
            // for stage 1 this should do.
            new JsonTokenizer(fileContents)
                    .cleanContent()
                    .checkBoundaries();

            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
