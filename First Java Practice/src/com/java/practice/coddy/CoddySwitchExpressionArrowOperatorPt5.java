package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt5 {
    public static String validateUsername(String username) {
        // Write your code here using guard clauses
        return switch (username){
            case null -> "Username cannot be null";
            case String text when text.isEmpty() -> "Username cannot be empty";
            case String text when !Character.isLetter(text.charAt(0)) -> "Username must start with a letter";
            case String text when !text.trim().matches("^[a-zA-Z0-9]+$") -> "Username cannot contain special characters";
            case String text when (text.length() < 5 || text.length( )> 15) -> "Username must be between 5 and 15 characters";
            default -> "Valid username";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        if (username.equals("null")) {
            username = null;
        }
        System.out.println(validateUsername(username));
    }
}

// Test case
// 123User
// User@name
// null
