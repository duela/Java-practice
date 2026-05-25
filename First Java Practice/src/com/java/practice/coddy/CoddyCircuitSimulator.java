package com.java.practice.coddy;

import java.util.Arrays;
import java.util.Scanner;

public class CoddyCircuitSimulator {
    public static void main(String[] args) {

//        Find the sum of all elements in an array:
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
//        Find the average of elements in an array:

        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
//        Find the maximum element in an array:

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max: " + max);
//        Find the minimum element in an array:

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min: " + min);

        // Initialize the fruits array
        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};

        // Use an enhanced for loop to iterate over the array

        for(String fruit : fruits){
            System.out.println(fruit.toUpperCase());
        }


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below

        int longWordsCount = 0;
   /**     for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().length() > 5) {
                longWordsCount++;
            }
        }

        String[] result = new String[longWordsCount];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].trim();
            if (word.length() > 5) {
                result[index] = word;
                index++;
            }

        }
**/

        for (String s : arr) {
            if (s.trim().length() > 5) {
                longWordsCount++;
            }
        }

        String[] result = new String[longWordsCount];

        int index = 0;
        for (String s : arr) {
            String word = s.trim();
            if (word.length() > 5) {
                result[index] = word;
                index++;
            }

        }

        System.out.println(Arrays.toString(result));


//         Don't modify these arrays!
        boolean[] signal_A = {false, false, true, true};
        boolean[] signal_B = {false, true, false, true};

        // Calculate outputs for each combination
        boolean[] output1 = new boolean[4];  // A && B
        boolean[] output2 = new boolean[4];  // A || B
        boolean[] output3 = new boolean[4];  // !A && B
        boolean[] output4 = new boolean[4];  // !(A || B)
        boolean[] output5 = new boolean[4];  // !A || !B

        // Fill in the truth tables
        for (int i = 0; i < 4; i++) {
            output1[i] = signal_A[i] && signal_B[i];          // A AND B
            output2[i] = signal_A[i] || signal_B[i];          // A OR B
            output3[i] = !signal_A[i] && signal_B[i];         // NOT A AND B
            output4[i] = !(signal_A[i] || signal_B[i]);       // NOT (A OR B)
            output5[i] = !signal_A[i] || !signal_B[i];        // NOT A OR NOT B
        }

        // Don't modify the code below
        System.out.println("Truth Table Results:");
        System.out.println("-------------------");
        System.out.println("A\tB\tA&&B\tA||B\t!A&&B\t!(A||B)\t!A||!B");
        for (int i = 0; i < 4; i++) {
            System.out.println(signal_A[i] + "\t" + signal_B[i] + "\t" +
                    output1[i] + "\t" + output2[i] + "\t" +
                    output3[i] + "\t" + output4[i] + "\t" +
                    output5[i]);
        }
    }
}
