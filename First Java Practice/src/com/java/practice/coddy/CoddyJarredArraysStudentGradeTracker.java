package com.java.practice.coddy;

import java.util.Arrays;

public class CoddyJarredArraysStudentGradeTracker {
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        // Check if input is valid
        // Create jagged array based on number of students
        // For each student:
        //   - Create row with length matching their subject count
        //   - Fill with grades using formula: (studentNum + 1) * 10 + subjectNum
        int[][] result = new int[subjectsPerStudent.length][];
        for (int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            result[studentIndex] = new int[subjectsPerStudent[studentIndex]];
            for (int subjectIndex = 0; subjectIndex < result[studentIndex].length; subjectIndex++) {
                result[studentIndex][subjectIndex] = (studentIndex + 1) * 10 + (subjectIndex + 1);
            }
        }
        return result;
    }

    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        int numStudents = 4;
        int[] subjectsPerStudent = {1,3,2,4};

        int[][] finalResult = processGrades(numStudents, subjectsPerStudent);
        System.out.println(Arrays.deepToString(finalResult));

    }
}
