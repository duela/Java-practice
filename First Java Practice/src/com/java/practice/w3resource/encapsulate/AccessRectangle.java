package com.java.practice.w3resource.encapsulate;

import java.util.Scanner;

public class AccessRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle Manager Menu: ");
        System.out.println("1. Calculate the area of a rectangle");
        System.out.println("2. Calculate the volume of a rectangle");
        System.out.println("0. Exit");
        System.out.print("Select a menu option: ");
        int scannerValue = scanner.nextInt();
        if (scannerValue == 0) {
            System.out.println("Exiting the application....");

        } else  {
            while (scannerValue != 0){
                if (scannerValue == 1) {
                    System.out.printf("You have selected :%d, let's calculate the area of a rectangle %n", scannerValue);
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter the value of the length: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the value of the width: ");
                    double width = input.nextDouble();

//                Rectangle rectangle = new Rectangle(length, width);
//                System.out.println("length is: " + rectangle.getLength() + " and width is: " + rectangle.getWidth());
//                rectangle.displayDetails();
                    SmallRectangle smallRectangle = new SmallRectangle(length, width);
                    double area = smallRectangle.printArea(length, width);
                    smallRectangle.displayDetails();
                    System.out.printf("The length is: 2.8 and the width is: 5.2, while the area is %.2f%n", area);
                    System.out.println();
                    System.out.println("Rectangle Manager Menu: ");
                    System.out.println("1. Calculate the area of a rectangle");
                    System.out.println("2. Calculate the volume of a rectangle");
                    System.out.println("0. Exit");
                    System.out.print("Select a menu option: ");
                    scannerValue = scanner.nextInt();

                }
                else if (scannerValue == 2) {
                    System.out.printf("You have selected :%d, let's calculate the area of a area %n", scannerValue);
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter the value of the length: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the value of the width: ");
                    double width = input.nextDouble();
                    System.out.print("Enter the value of the width: ");
                    double height = input.nextDouble();
//                Rectangle rectangle = new Rectangle(length, width);
//                System.out.println("length is: " + rectangle.getLength() + " and width is: " + rectangle.getWidth());
//                rectangle.displayDetails();
                    BigRectangle bigRectangle = new BigRectangle(length, width, height);
                    double volume = bigRectangle.printArea(length, width, height);
                    System.out.printf("The length is: 2.8 and the width is: 5.2, while the volume is %.2f%n", volume);
                    System.out.println();
                    System.out.println("Rectangle Manager Menu: ");
                    System.out.println("1. Calculate the area of a rectangle");
                    System.out.println("2. Calculate the volume of a rectangle");
                    System.out.println("0. Exit");
                    System.out.print("Select a menu option: ");
                    scannerValue = scanner.nextInt();

                }
            else{
                    System.out.println("Invalid option. Choose between 0-2, try again...");
                    System.out.println();

                    System.out.println("Rectangle Manager Menu: ");
                    System.out.println("1. Calculate the area of a rectangle");
                    System.out.println("2. Calculate the volume of a rectangle");
                    System.out.println("0. Exit");
                    System.out.print("Select a menu option: ");
                    scannerValue = scanner.nextInt();


                }


            }
        }





//




    }
}
