package com.java.practice.coddy;

import java.util.Arrays;

public class Coddy3DArrays {
    public static void main(String[] args){
        int[][][] cube = new int[4][3][4];
        int[][][] cuba = {
                {
                        {1,2,3,1},
                        {4,5,6,1},
                        {7,8,9,0}
                },
                {
                        {10,11,12,0},
                        {13,14,15,0},
                        {16,17,18,0}
                }
        };
        System.out.println(Arrays.deepToString(cube));
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[0].length; j++) {
                for (int k = 0; k < cube[0][0].length; k++) {
                    System.out.print(cube[i][j][k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
