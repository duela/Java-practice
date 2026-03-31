public class CoddyShapeCalculator {
    // Write your calculateArea methods here

    public static void calculateArea(int num){
       System.out.println("Square area with side " + num + ": " + (num * num));
    }
    public static void calculateArea(int num1, int num2){
        System.out.println("Rectangle area with length " + num1 + " and width " + num2  + ": " + (num1 * num2));
    }
    public static void calculateArea(double num){
        System.out.println("Circle area with radius " + num + ": " + (3.14 * num * num));
    }
    public static void main(String[] args){

            // Test your methods with these exact values
            calculateArea(5);          // square
            calculateArea(4, 6);       // rectangle
            calculateArea(2.5);        // circle

    }
}
