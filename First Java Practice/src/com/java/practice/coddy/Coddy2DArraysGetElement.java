package com.java.practice.coddy;

public class Coddy2DArraysGetElement{
    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        // Write your code here
        int value = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rowIndex < 0 || rowIndex >= rows || colIndex < 0 || colIndex >= cols) {
            value = -1;
        }
        else{
            value = matrix[rowIndex][colIndex];
        }
        return  value;
    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        String[] stringArr = text.split(",");
//        int[] studentGrades = new int[stringArr.length];
//        for (int i = 0; i < stringArr.length; i++) {
//            studentGrades[i] = Integer.parseInt(stringArr[i]);
//        }
//
//        System.out.print(getElement(matrix));
//    }
}
