package com.java.practice.coddy;
import java.util.Scanner;

class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }
}
public class CoddyBasicErrorHandlingPt7 {
    public static String validateEmail(String email) throws EmailException {
        // Write your code here
        if (email == null) {
            throw new EmailException("Email cannot be null");
        } else if (email.isEmpty()) {
            throw new EmailException("Email cannot be empty");
        } else if (!email.contains("@")){
            throw new EmailException("Email must contain @");
        } else if (email.startsWith("@")) {
            throw new EmailException("Email must have a local part");
        }

        return "Valid email";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if (email.equals("null")) {
            email = null;
        }

        try {
            System.out.println(validateEmail(email));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Test case
//user@domain.com

// null