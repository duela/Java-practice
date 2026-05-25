package com.java.practice.coddy;

import java.util.Arrays;
import java.util.Scanner;

public class CoddyReversedArray {
    public static int[] reverse(int[] arr) {
        // Write your code below
        int[] reversal = new int[arr.length];
        for (int i = arr.length -1, j = 0 ; i >= 0 ; i--, j++) {
            reversal[j] = arr[i];
        }
        return reversal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        int[] result = reverse(arr);
        System.out.println("The reversed array is: " + Arrays.toString(result));
    }
}
