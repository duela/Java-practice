package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt3 {
    public static String processExtendedValue(Object value) {
        // Write your code here using pattern matching
        return switch (value){
            case Integer number -> (number % 2 == 0 )
                    ? "Even Number: " + number * 3
                    : "Odd Number: " + number * 2;
            case String text -> (text.length() > 5 )
                    ? "Long Text: " + text.toLowerCase()
                    : "Short Text: " + text.toUpperCase();
            case Boolean bool -> bool
                    ? "Boolean: Yes"
                    : "Boolean: No";
            case null, default -> "Unsupported Type";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String inputValue = scanner.nextLine();

        Object value = switch(type) {
            case "Integer" -> Integer.parseInt(inputValue);
            case "String" -> inputValue;
            case "Boolean" -> Boolean.parseBoolean(inputValue);
            default -> inputValue;
        };

        System.out.println(processExtendedValue(value));
    }
}


// Test case

//Integer
//4

//Integer
//7

//String
//Hello