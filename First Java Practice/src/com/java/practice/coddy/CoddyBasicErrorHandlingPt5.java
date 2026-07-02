package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyBasicErrorHandlingPt5 {
    public static String validateAge(int age, boolean strict) {
        // Write your code here
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            } else if (age > 150) {
                throw new IllegalArgumentException("Age cannot be greater than 150");
            }
            if (age == 0 && strict) {
                throw new IllegalArgumentException("Age cannot be zero in strict mode");
            }
        } catch (NumberFormatException e) {
           return "Error: Not a valid number";
        }

        return String.valueOf(age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());

        try {
            System.out.println(validateAge(age, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


// test case
//25
//false

//-5
//false

//0
//true

//0
//false

//200
//false
