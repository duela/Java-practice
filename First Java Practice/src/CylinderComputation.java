import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();

        double baseArea = (Math.PI * Math.pow(radius, 2));
        double surfaceArea = (2.0 * Math.PI * radius * height) + (2.0 * baseArea);
        double volume = (baseArea * height);

        System.out.printf("The base area is: %.2f%n The surface area is: %.2f%n The volume of the cylinder: %.2f%n", baseArea, surfaceArea, volume);
    }
}
