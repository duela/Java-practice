package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt2 {
    public static String processValue(Object value) {
        // TODO: Use pattern matching with instanceof to process the value
        // If it's an Integer: return "Number: " + (value * 2)
        // If it's a String: return "Text: " + value.toUpperCase()
        // If it's a Boolean: return "Boolean: " + (!value)
        // For any other type: return "Unknown"

        return switch (value) {
            case Integer number -> "Number: " + (number * 2);
            case String text    -> "Text: " + text.toUpperCase();
            case Boolean bool   -> "Boolean: " + (!bool);
            case null, default  -> "UNKNOWN";
        };

//        System.out.println(result);

//        Alternative
//        String result = "";
//        if(value instanceof Integer number){
//            System.out.println("Number: " + number * 2);
//        } else if (value instanceof String text) {
//            System.out.println("Text: " + text.toUpperCase());
//        } else if (value instanceof Boolean bool) {
//            System.out.println("Boolean: " + !bool);
//        }
//        else {
//            System.out.println("UNKNOWN");
//        }
//        return result;
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

        System.out.println(processValue(value));
    }
}

// Test case
//Boolean
//false

//Integer
//5

//String
//Hello

