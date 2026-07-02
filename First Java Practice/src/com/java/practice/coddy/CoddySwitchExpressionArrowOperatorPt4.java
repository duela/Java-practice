package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt4 {
    public static String validatePassword(String password) {
        // Write your code here
        return switch (password){
            case null -> "Password cannot be null";
            case String text when text.isEmpty() -> "Password cannot be empty";
            case String text when (text.length() < 8) -> "Password must be at least 8 characters";
            case String text when text.contains(" ") -> "Password cannot contain spaces";
            default -> "Valid password";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("null")) {
            password = null;
        }
        System.out.println(validatePassword(password));
    }
}

// test case
// Password123
// abc123
// null
// pass word123