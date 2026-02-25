import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");

        double radius = input.nextDouble();
        double surfaceArea = (4 * Math.PI * Math.pow(radius, 2));
        double volume = ((4.0/3.0) * Math.PI * Math.pow(radius, 3)) ;

        System.out.printf("The volume is: %.2f%n The surface area is: %.2f%n", volume, surfaceArea);

        input.close();
    }
}
