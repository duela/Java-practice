import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int integer = input.nextInt();
        int temp = integer;
        int digit;
        int sum = 0;

        if (integer < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        while(temp != 0){
            digit = temp % 10;
            temp /= 10;
            sum += digit;

        }
        System.out.print("The sum of digits of " + integer + " is: " + sum);
        input.close();
    }
}
