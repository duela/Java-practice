package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyCompareStrings {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        System.out.printf("%s equals %s: %b%n", str1, str2, str1.equals(str2));
        System.out.printf("%s equalsIgnoreCase %s: %b%n", str1, str2, str1.equalsIgnoreCase(str2));
        System.out.printf("%s compareTo %s: %d%n", str1, str2, str1.compareTo(str2));
        System.out.printf("%s compareToIgnoreCase %s: %d%n", str1, str2, str1.compareToIgnoreCase(str2));



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}
