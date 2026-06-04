package com.java.practice.coddy;

import java.util.Scanner;

public class Coddy3DArraysThreeIntegerArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depth = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][][] array3D = new int[depth][rows][cols];
        // Write your code below
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[0].length; j++) {
                for (int k = 0; k < array3D[0][0].length; k++) {
                    array3D[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                }
            }
        }

        // Print the 3D array
        for (int d = 0; d < depth; d++) {
            System.out.println("Depth " + d + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(array3D[d][r][c] + " ");
                }
                System.out.println();
            }
        }
    }
}
