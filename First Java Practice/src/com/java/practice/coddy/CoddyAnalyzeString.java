package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyAnalyzeString {
    public static void analyzeString(String str) {
        // Write your code here
        int length = str.length();
        System.out.println("Length: " + length);
        System.out.println("Char at 4: " + str.charAt(4));
        System.out.println("Substring: " + str.substring(7, length));
        System.out.println("Substring 2: " + str.substring(3, 6));
        System.out.println("Ends with dot: " + str.trim().endsWith("."));
        System.out.println("Uppercase: " + str.toUpperCase());


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        analyzeString(message);
    }
}
