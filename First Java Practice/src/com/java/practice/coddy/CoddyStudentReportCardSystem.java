package com.java.practice.coddy;

public class CoddyStudentReportCardSystem {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;

        // Create your formatted strings
        String[] nameParts = studentName.split(" ");
        for (int i = 0; i < nameParts.length; i++) {
            if (!nameParts[i].isEmpty()) {
                nameParts[i] = nameParts[i].substring(0, 1).toUpperCase() + nameParts[i].substring(1);
            }
        }
//        %05d ensures any integer is safely padded with leading zeros to exactly 5 digits.
//        %: The trigger indicating a format instruction follows.0: The padding flag, which explicitly tells the engine to fill empty spaces with zeros instead of spaces.5: The width constraint,
//        defining the exact minimum character length of the final output string.d: The conversion type, standing for "decimal integer" (expects a base-10 integer like int or long).
        String formattedName = String.join(" ", nameParts);

        String paddedStudentId = String.format("%05d", studentId);
        String headerInfo = String.format("Student: %s, ID: %s", formattedName, paddedStudentId);
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f", mathGrade, scienceGrade, englishGrade );
        String attendanceInfo = String.format("Attendance: %.1f%%", attendance * 100 );

        // Don't modify the code below
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
        String str = new String(new char[10]).replace("\0", "k");
        System.out.println(str);
    }
}
