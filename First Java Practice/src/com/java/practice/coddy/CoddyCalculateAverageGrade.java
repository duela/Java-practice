package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyCalculateAverageGrade {
    public static double calculateAverageGrade(int[] grades) {
        // Write your code here
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] studentGrades = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        double averageGrade = calculateAverageGrade(studentGrades);
        System.out.printf("Average grade: %.2f", averageGrade);
    }
}
