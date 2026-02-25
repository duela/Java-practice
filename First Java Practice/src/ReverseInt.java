import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int integer = input.nextInt();
        int digit;

        while(integer > 0){
            digit = integer % 10;
            integer /= 10;
            System.out.print(digit);
        }
//        System.out.print(integer);

    }
}
