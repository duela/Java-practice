package com.java.practice.coddy;

public class Coddy2DArraysMatrixAdditionSubstraction {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        // Write your code here
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (operator.trim().equals("add")) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                } else if (operator.trim().equals("subtract")) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
                else{
                    throw new IllegalArgumentException("Unknown operator: " + operator);
                }


            }

        }
        return  result;
    }
    public static void main(String[] args){
        int[][] matrix1 = {
                {1,2,3},
                {0,1,2},
                {2,0,1},
        };
        int[][] matrix2 = {
                {4,5,6},
                {7,8,9},
                {0,1,0},
        };
        String operator = "add";
        int[][] finalResult = matrixOperation(matrix1, matrix2, operator);

        for (int[] ints : finalResult) {
            for (int j = 0; j < finalResult[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }


}


