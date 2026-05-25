package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyCalculateStats {
    public static double[] calculateStats(int[] arr) {
        // Write your code here
        int lengthSize = arr.length;
        if (lengthSize == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double sum = 0;
        double minElement = arr[0];
        double maxElement = arr[0];
        
        for (int element : arr) {
            sum += element;
            if (minElement > element) {
                minElement = element;

            }
            if (maxElement < element) {

                maxElement = element;
            }

        }
        double average = sum / lengthSize;
        return new double[]{sum, average, maxElement, minElement };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            numbers[i] = Integer.parseInt(arrString[i].trim());
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}
