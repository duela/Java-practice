package com.java.practice.coddy;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Coddy2DArraysAdvanceControlFlowPt2 {
    public static void skipNumber(int[][] grid, int skipValue, boolean skipRow) {
        // Write your code here
        outer : for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == skipValue ) {
                    if (skipRow) {
                        System.out.println("Skipping row: " + row);
                        continue outer;
                    }
                    else {
                        continue;
                    }
                }
                System.out.println("Visited: " + row + "," + col);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a 2D array
        String gridString = scanner.nextLine();
        // Read the skip value
        int skipValue = Integer.parseInt(scanner.nextLine());
        // Read the skipRow flag
        boolean skipRow = Boolean.parseBoolean(scanner.nextLine());

        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);

        skipNumber(grid, skipValue, skipRow);
    }
}

//[[10, 20, 30], [40, 50, 60]]
//10
//true

//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//5
//true

//[[1, 2], [3, 4]]
//3
//false

//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//5
//false

//[[1, 2], [3, 4]]
//3
//false
