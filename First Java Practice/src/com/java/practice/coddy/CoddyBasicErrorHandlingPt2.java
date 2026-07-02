package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyBasicErrorHandlingPt2 {
    public static String divideNumbers(String num1, String num2, int index) {
        // Write your code here
        int[] divisionArray = new int[2];
        int divisionResult = 0;
        try {
            int intNum1 = Integer.parseInt(num1);
            int intNum2 = Integer.parseInt(num2);
            divisionResult = intNum1 / intNum2;
            divisionArray[index] = divisionResult;

        } catch (NumberFormatException e) {
            return "Error: Invalid number format";
        } catch (ArithmeticException e){
            return "Error: Division by zero";
        }
        catch (ArrayIndexOutOfBoundsException e){
            return "Error: Invalid array index";
        }


        return String.valueOf(divisionResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println(divideNumbers(num1, num2, index));
    }
}

// test case
//10
//2
//0

//5
//0
//0

//abc
//2
//0