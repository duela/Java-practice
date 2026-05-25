package com.java.practice.coddy;

public class CoddyCourseInfirmation {
    // Write your methods here
    public static String formatCourseInfo(String courseInfo){
        String regex = "[:.\\s]";
        String[] myArray = courseInfo.split(regex);
        String courseCode = myArray[0];
        String courseName = myArray[1];
        String days = myArray[2];
        String time = myArray[3];

        return String.format( "Course Code: %s%n" +
                "Course Name: %s%n" +
                "Days: %s%n" +
                "Time: %s", courseCode, courseName, days, time);
    }

    public static String createCourseList( String[] courseCodes){
        return String.format( "Available Courses: %s, %s, %s" , courseCodes[0], courseCodes[1], courseCodes[2] );
    }
    public static String formatSchedule(String days){
        return days.replace(",", " | ");
    }

    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";

        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));

        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));

        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
