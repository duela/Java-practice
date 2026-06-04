package com.java.practice.coddy;

import java.util.Scanner;

public class Coddy3DArraysGameBoardTracker {
    public static String create3DGameBoard(int levels, int rows, int cols) {
        // Check for valid dimensions
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }

        // Create and fill 3D array
        int[][][] board = new int[levels][rows][cols];

        // Fill the array with calculated values
        // Calculate base value (level + row + col + 3)
        // Multiply by 10 if cell is on any edge

        // Create output string using this exact format:
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    board[l][r][c] = ((l + 1) + (r + 1) + (c  + 1)) * 10;
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }

        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int levels = input.nextInt();
        int rows = input.nextInt();
        int cols = input.nextInt();


        System.out.println(create3DGameBoard(levels, rows, cols));

//        for (int i = 0; i < cube.length; i++) {
//            for (int j = 0; j < cube[0].length; j++) {
//                for (int k = 0; k < cube[0][0].length; k++) {
//                    System.out.print(cube[i][j][k] + " ");
//
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
    }
}
