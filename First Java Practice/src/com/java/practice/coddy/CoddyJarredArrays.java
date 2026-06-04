package com.java.practice.coddy;

import java.util.Arrays;
import java.util.Scanner;

public class CoddyJarredArrays {
    public static int[][] createJaggedArray(int n) {
        // Write your code here
        int[][] result = new int[n][];
            for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = (i + 1) * (j + 1);
                }

        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] finalResult = createJaggedArray(n);
        System.out.println(Arrays.deepToString(finalResult));
        int[][] matrix1 = {
                {1},
                {2,3},
                {0,1,2},
                {2,0,1,4},
        };
        matrix1[2] = new int[4];
        System.out.println("matrix");
        System.out.println(Arrays.deepToString(matrix1));


        System.out.println("jarred");

        int[][] jarred = new int[1][];
        jarred[0] = new int[4];

        System.out.println(Arrays.deepToString(jarred));
//        for (int[] jar : jarred){
//            for (int j = 0; j < 5; j++) {
//                System.out.print(jar[j] + " ");
//            }
//            System.out.println();
//        }
//
    }
}
