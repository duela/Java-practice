package com.java.practice.coddy;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

import java.util.Scanner;

public class Coddy2DArraysPrintSum {
    public static void printSum(int[][] array) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum = array.length;
            }
            System.out.printf("Row %d sum: %d",array.length, sum );

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();

//        Type arrayType = new TypeToken<int[][]>(){}.getType();
//        int[][] array = new Gson().fromJson(arrayString, arrayType);

//        printSum(array);
    }
}
