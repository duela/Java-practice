package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyPatternFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");
        // Write your code below
        int str1Size = str1.length;
        int str2Size = str2.length;
        boolean match = false;

        for (int outer = 0; outer < str1Size - str2Size; outer++) {
            // Assume true for this specific window position
            boolean currentWindowMatch = true;
            for (int inner = 0; inner < str2Size; inner++) {
                    if (!str1[outer + inner].trim().equals(str2[inner].trim())) {
                        currentWindowMatch = false;
                    break;
                    }
                }
            if (currentWindowMatch) {
                match = true;
            }

            }

        System.out.println(match);
    }
}
