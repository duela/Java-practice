package com.java.practice.coddy;

public class Coddy2DArraysPrintPatterns {
    public static void printPatterns(int[][] matrix) {
        // Write your code here
        String mainDiagonal = "";
        String antiDiagonal = "";
        String topBorder = "";
        String bottomBorder = "";
        String leftBorder = "";
        String rightBorder = "";

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                if (rows == cols) {
                    mainDiagonal += matrix[rows][cols] + " ";
                }
                if (rows + cols == 2) {
                    antiDiagonal += matrix[rows][cols] + " ";
                }
                if (rows == 0) {
                    topBorder += matrix[rows][cols] + " ";
                }
                if (rows == matrix.length - 1) {
                    bottomBorder += matrix[rows][cols] + " ";
                }
                if (cols == 0) {
                    leftBorder += matrix[rows][cols] + " ";
                }
                if (cols == matrix.length - 1) {
                    rightBorder += matrix[rows][cols] + " ";
                }
            }
        }
        System.out.printf("Main Diagonal: %s%n", mainDiagonal);
        System.out.printf("Anti-Diagonal: %s%n", antiDiagonal);
        System.out.printf("Top Border: %s%n", topBorder);
        System.out.printf("Bottom Border: %s%n", bottomBorder);
        System.out.printf("Left Border: %s%n", leftBorder);
        System.out.printf("Right Border: %s%n", rightBorder);


    }
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printPatterns(matrix);
    }
}
