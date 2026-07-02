package com.java.practice.coddy;

import java.util.Scanner;

public class CoddySwitchExpressionArrowOperator {
    public static String getDayType(int day, boolean abbreviated) {
        // Write your code here
         String dayType = switch (day){
                case 1,2,3,4,5 -> abbreviated ? "WKD" : "WORKDAY";
                case 6,7 -> abbreviated ? "WKND" : "WEEKEND";
                default -> abbreviated ? "INV" : "INVALID";
            };

//        String dayType = "";
//        if (abbreviated) {
//            dayType = switch (day){
//                case 1,2,3,4,5 -> "WKD";
//                case 6,7 -> "WKND";
//                default -> "INV";
//            };
//        }
//        else {
//            dayType = switch (day){
//                case 1,2,3,4,5 -> "WORKDAY";
//                case 6,7 -> "WEEKEND";
//                default -> "INVALID";
//            };
//        }

        return dayType;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(getDayType(day, abbreviated));
    }
}
// Test case
//8
//false