package com.java.practice.w3resource.encapsulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Student {
    private String studentId;
    private String studentName;
    private List<Double> grades;


    public String studentId() {
        return studentId;
    }

    public void studentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Double> getGrades() {
        return Collections.unmodifiableList(grades);
    }

    public void addGrade(double grade){

        if (grades == null){
            grades = new ArrayList<>();
        }
       grades.add(grade);

    }

    public double sumGrade(){
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (Double grade : grades) {
            sum += grade;
        }
        return sum;

    }

    public double averageGrade(){
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum/grades.size();

    }
}

class AccessStudent{
    public static void main(String[] args){
        Student student = new Student();
        student.studentId("NYU2026");
        student.setStudentName("Thomas Anthony");
        student.addGrade(90.2);
        student.addGrade(89.7);
        student.addGrade(68.5);
        System.out.printf("Hello, %s ID:%s, your grade is %s%n",
                student.getStudentName(),
                student.studentId(),
                student.getGrades());
        System.out.printf("Your average is %.2fcpa %n", student.averageGrade());
        System.out.printf("Your average is %.2fcpa %n", student.sumGrade());
    }
}
