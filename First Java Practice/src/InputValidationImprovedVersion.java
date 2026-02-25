import java.util.Scanner;

public class InputValidationImprovedVersion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberInput;
        while (true){
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberInput = input.nextInt();
            if((numberInput >= 0 && numberInput <= 10) || (numberInput >= 90 && numberInput <= 100)){
                break; // Immediately exit the loop.  It jumps out of the nearest loop.
            }
            System.out.println("Invalid input, try again...");
        }
        System.out.println("You have entered: " + numberInput);
        input.close();
    }
}
