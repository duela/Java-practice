package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyProductArray {
    public static int prod(int[] arr) {
        // Write your code below
        int product = 1;
        for (int j : arr) {
            product *= j;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        int result = prod(arr);
        System.out.println("Product of array elements: " + result);
    }
}
