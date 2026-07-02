package com.java.practice.coddy;

public class CoddyBasicErrorHandling {
    public static void main(String[] args){
        String text = "abd";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a valid number");
        }
    }
}
