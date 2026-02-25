import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");

        int firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        System.out.println("The sum is: " + (firstNumber + secondNumber));
        input.close();
    }
}
