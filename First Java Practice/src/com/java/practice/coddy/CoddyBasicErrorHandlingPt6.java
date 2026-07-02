package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyBasicErrorHandlingPt6 {
    public static String validateSalary(int salary, boolean strict) {
        // Write your code here
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        else if (salary > 1000000) {
            throw new IllegalArgumentException("Salary cannot be greater than 1000000");
        }
        if (strict && salary == 0){
            throw new IllegalArgumentException("Salary cannot be zero in strict mode");
        }
        return String.valueOf(salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());

        try {
            System.out.println(validateSalary(salary, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Test case
//5000
//false

//-100
//true

//1500000
//false