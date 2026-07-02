package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyBasicErrorHandlingPt3 {
    public static String multiplyNumbers(String num1, String num2, int index) {
        // Write your code here using try-catch
        int[] arraySizeThree = new int[3];
        int multiplyResult = 1;
        try{
            int intNum1 = Integer.parseInt(num1);
            int intNum2 = Integer.parseInt(num2);
            multiplyResult = intNum1 * intNum2;
            arraySizeThree[index] = multiplyResult;
        } catch (NumberFormatException e) {
            return "Error: Invalid number format";
        } catch(ArrayIndexOutOfBoundsException e) {
            return "Error: Invalid array index";
        }
        return String.valueOf(multiplyResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplyNumbers(num1, num2, index));
    }
}
