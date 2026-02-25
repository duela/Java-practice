public class SimpleCalculator {


    public static double addition(double number1, double number2){
        return number1 + number2;
    }
    public static double subtraction(double number1, double number2){
        return number1 - number2;
    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
    public static double division(double number1, double number2){
        if (number2 == 0.0){
            System.out.print("Error: This cannot be divisible by " ); return 0;
        }
        return  number1 / number2;
    }
    public static double modulus(double number1, double number2){
        return  number1 % number2;
    }

    public static void main(String[] args){
        double number1 = 10;
        double number2 = 30;
        System.out.println("Addition: " +  addition(number1, number2));
        System.out.println("Subtraction: " +  subtraction(number1, number2));
        System.out.println("Multiply: " +  multiply(number1, number2));
        System.out.println("Division: " +  division(number1, number2));
        System.out.println("Modulus: " +  modulus(number1, number2));


    }
}
