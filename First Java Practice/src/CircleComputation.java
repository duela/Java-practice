import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius value: ");
        double radius = input.nextDouble();
        double diameter = (2.0 * radius);
        double area = (Math.PI * Math.pow(radius, 2));
        double circumference = (2.0 * Math.PI * radius);

        System.out.printf("The diameter is: %.2f%n The area is: %.2f%n The circumference is: %.2f%n", diameter, area, circumference);

        input.close();
    }

}
