package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyAsteriskPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                String asterisk = new String(new  char[i]).replace("\0", "*");
                System.out.println(asterisk);
            }
        }

    }
}
