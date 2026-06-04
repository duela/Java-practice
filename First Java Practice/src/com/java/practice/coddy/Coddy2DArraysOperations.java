package com.java.practice.coddy;

import java.util.Arrays;

public class Coddy2DArraysOperations {
    public static void arrayOperations(int[][] matrix) {
        // Write your code here
        int sum = 0;
        int max = matrix[0][0];
        int[] rowSums = new int[matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            int rowSum = 0;
            for (int cols = 0; cols < matrix[0].length; cols++) {
               sum += matrix[rows][cols];
                if (max < matrix[rows][cols]) {
                    max = matrix[rows][cols];
                }

                rowSum += matrix[rows][cols];

            }
            rowSums[rows] = rowSum;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));

    }
    public static void main(String[] args){

        int[][] matrix = {
                { 1,  2,  3 },
                { 4,  5,  6 },
                { 7,  8,  9 },

        };

        arrayOperations(matrix);
    }
}
