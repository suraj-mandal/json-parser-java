package org.example;

import org.example.parsers.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            boolean result = Parser.isValidJson(args[0]);
            if (result) {
                System.out.println("The json file is valid and parsed successfully.");
                System.exit(0);
            } else {
                System.out.println("The json file is invalid.");
                System.exit(1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid number of arguments provided");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}