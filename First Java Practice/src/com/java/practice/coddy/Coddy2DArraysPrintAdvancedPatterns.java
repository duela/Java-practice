package com.java.practice.coddy;

public class Coddy2DArraysPrintAdvancedPatterns {
    public static void printAdvancedPatterns(int[][] matrix) {

        int size = matrix.length;

        // Both diagonals
        System.out.print("Both Diagonals: ");

        // Main diagonal
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // Anti-diagonal
        for (int i = 0; i < size; i++) {

            int col = size - 1 - i;

            // Skip center element for odd-sized matrices
            if (i == col) {
                continue;
            }

            System.out.print(matrix[i][col] + " ");
        }

        System.out.println();

        // Spiral traversal
        System.out.print("Spiral Order: ");

        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;

        while (top <= bottom && left <= right) {

            // Top row
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Right column
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }
    public static void main(String[] args){

        int[][] matrix = {
                { 1,  2,  3,  4 },
                { 5,  6,  7,  8 },
                { 9, 10, 11, 12 },
                {13, 14, 15, 16 }
        };

        printAdvancedPatterns(matrix
        );
    }
}
