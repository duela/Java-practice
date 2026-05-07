package com.java.practice.coddy;

import java.util.Arrays;

public class CoddySchoolClassRoster {

    public static String[] createSeatingChart(String[] names, int[] grades) {
        if (names.length != grades.length) {
            throw new IllegalArgumentException(
                    "Names and grades must have same length"
            );
        }
        int namesLength = names.length;
        String[] seatingChart = new String[namesLength];
        for (int i = 0; i < names.length; i++) {
            seatingChart[i] = names[i] + ": " + grades[i];
        }
        Arrays.sort(seatingChart);
        return seatingChart;
    }

    public static String[] findTopStudents(int[] grades){
        int gradesLength = grades.length;

        String[] result = new String[gradesLength];
        for (int i = 0; i < gradesLength; i++) {
            result[i] = grades[i] >= 90 ? "A+" : "A";

        }
        return result;

    }

    public static boolean isClassEqual(int[] grades, int[] grades2){
       return Arrays.equals(grades, grades2);
    }

    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};

        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

//        // Test second method
        String[] gradeLetters = findTopStudents(grades);
        System.out.print("Grade Letters: ");
        System.out.println(Arrays.toString(gradeLetters));
//
//        // Test third method
        boolean equalClasses = isClassEqual(grades, grades2);
        System.out.println("Classes Equal: " + equalClasses);
    }

}