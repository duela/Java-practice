package com.java.practice.coddy;

import java.util.Scanner;

public class CoddyDelimiterString {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        // Write your code here
        return String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, (double) quantity , unitPrice);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine().trim();
//        String delimiter = scanner.nextLine();
//        // Write your code below
//        String result = text.replace(" ", delimiter);
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
        System.out.println("apple".compareTo("banana"));
        System.out.println("Apple".equalsIgnoreCase("APPLE"));

    }
}
