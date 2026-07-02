package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperatorPt1 {
    public static String getMealType(int hour, boolean abbreviated) {
        // Write your code here
        Object value = 42;
        Object obj = "Hello";
        if (obj instanceof String str) {
            // str is automatically cast to String
            System.out.println(str.toUpperCase());
        }

        String result;
        if (value instanceof Integer i) {
            result = "Number: " + i;
        } else if (value instanceof String s) {
            result = "Text: " + s;
        } else {
            result = "Unknown";
        }
        return switch (hour){
            case 5,6,7,8,9,10 -> abbreviated ? "BKT" : "BREAKFAST";
            case 11,12,13,14,15 -> abbreviated ? "LCH" : "LUNCH";
            case 16,17,18,19,20,21 -> abbreviated ? "DNR" : "DINNER";
            default -> abbreviated ? "SNK" : "SNACK";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(getMealType(hour, abbreviated));
    }
}
// test case
//6
//false