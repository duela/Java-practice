package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyBasicErrorHandlingPt4 {
    public static String processNumber(String number, boolean shouldThrow) {
        // Write your code here
        int result = 0;
        try {
            if (shouldThrow) {
                result = 10/0;
            }
            else{
                result = Integer.parseInt(number);
            }
        } catch (NumberFormatException | ArithmeticException e) {
            result = -1;
        } finally {
            result+= 100;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        boolean shouldThrow = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(processNumber(number, shouldThrow));
    }
}

// test case
//42
//false

//42
//true

//abc
//false

//0
//true

//-10
//false
