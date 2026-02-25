import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0-10 or 90-100: ");
        int numberIn = input.nextInt();
        boolean isValid = (numberIn >= 0 && numberIn  <= 10) || (numberIn >= 90 && numberIn <= 100);
        while(!isValid){
            System.out.println("Invalid input, try again...");
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = input.nextInt();
            isValid = (numberIn >= 0 && numberIn  <= 10 || numberIn >= 90 && numberIn <= 100);
        }
        System.out.println("You have entered: " + numberIn);
        input.close();

    }
}
