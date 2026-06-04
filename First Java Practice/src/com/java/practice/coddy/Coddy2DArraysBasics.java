package com.java.practice.coddy;

import java.util.Arrays;

public class Coddy2DArraysBasics {
    public static void main(String[] args){
        int[][] arrayName = new int[3][4];
        int[][] matrixx = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arrayName[0][2]);
        System.out.println(Arrays.deepToString(arrayName));
        System.out.println(Arrays.deepToString(matrixx));

        int[][] matrix = {
                // Write your code here
                { 5, 7, 10 },
                { 86, 13, 13 },
                { 42, 5, 9 },
                { 86, 5, 8 },
                { 9, 1, 5 },
        };
        System.out.println("Print the matrix");
        int finalSum = 0;
        int finalEvenSum = 0;
        int sum = 0;
        int evenSum = 0;
        // Print the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
//        System.out.println("number rows: " + rows);
//        System.out.println("cols: " + cols);
        for (int i = 0; i < rows; i++) {
            int product = 1;

            int max = matrix[0][0];

            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
                product *= matrix[i][j];
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
                if (matrix[i][j] % 2 == 0) {
                    evenSum++;
                }

            }
//            finalSum += sum;
//            finalEvenSum += evenSum;
            System.out.printf("Row %d sum: %d max %d even %d product %d", i, sum, max, evenSum, product);
            System.out.println();
        }
//        System.out.println("final sum is: " + finalSum);
//        System.out.println("final even sum is: " + finalEvenSum);

    }
}
