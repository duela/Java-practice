package com.java.practice.coddy;

public class CoddyGradeBookAnalyzer {
    public static String getClassStats(int[] grades) {
        // Write your code here
        int size = grades.length;
        if (size == 0) {
            throw  new IllegalArgumentException("Array cannot be empty");
        }
        int sum = 0;
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        int passGrades = 0;

        for (int num : grades) {
            if (highestGrade < num) {
                highestGrade = num;
            }
            if (lowestGrade > num) {
                lowestGrade = num;
            }
            if (num >= 60) {
                passGrades++;
            }
            sum += num;
        }
        double average = (double) sum / size;
        return "Class Average: " + average + "\n"
                + "Highest Grade: " + highestGrade + "\n"
                + "Lowest Grade: " + lowestGrade + "\n"
                + "Passing Grades: " + passGrades + "/" + size;

    }
    public static String getLetterGrades(int[] grades) {
        // Write your code here
        int size = grades.length;
        if (size == 0) {
            throw  new IllegalArgumentException("Array cannot be empty");
        }
        int A = 0, B = 0, C = 0, D = 0, F = 0;
        for (int num : grades){
//            if (num >= 90) {
//                A++;
//            } else if (num >= 80) {
//                B++;
//            } else if (num >= 70) {
//                C++;
//            } else if (num >= 60) {
//                D++;
//            }
//            else {
//                F++;
//            }

            switch (num/10){
                case 10:
                case 9:
                    A++;
                    break;
                case 8:
                    B++;
                    break;
                case 7:
                    C++;
                    break;
                case 6:
                    D++;
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    F++;
                    break;
                default:
                    System.out.println("Invalid grade");
                    break;
            }
        }

        return "A (90-100): " + A + "\n"
                + "B (80-89): " + B + "\n"
                + "C (70-79): " + C + "\n"
                + "D (60-69): " + D + "\n"
                + "F (0-59): " + F;
    }
//
    public static String getImprovement(int[] startGrades, int[] endGrades) {
        // Write your code here
        if (startGrades.length == 0 || endGrades.length == 0 || startGrades.length != endGrades.length) {
            throw  new IllegalArgumentException("Array cannot be empty or start and end Array size must be equal");
        }
        int size = startGrades.length;
        int mostImproved = endGrades[0] - startGrades[0];
        int studentsImproved = 0;
        double totalImproved = 0;

        for (int i = 0; i < size ; i++) {
            totalImproved += (endGrades[i] - startGrades[i]);
            if (mostImproved < (endGrades[i] - startGrades[i]) ) {
                mostImproved = endGrades[i] - startGrades[i];
            }

            if (endGrades[i] > startGrades[i]) {
                studentsImproved++;
            }
        }
        return "Average Improvement: " + totalImproved/size + " points\n"
                + "Most Improved: " + mostImproved + " points\n"
                + "Students Improved: " + studentsImproved + "/" + size;

    }

    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};

        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));

        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));

        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }


}