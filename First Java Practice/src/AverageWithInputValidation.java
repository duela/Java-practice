import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput1;
        int numberInput2;
        int numberInput3;

        while(true){
            System.out.print("Enter the mark (0-100) for student 1: ");
            numberInput1 = input.nextInt();
            if(numberInput1 >= 0 && numberInput1 <= 100){
                break;
            }
            System.out.println("Invalid input, try again...");
        }
        while(true){
            System.out.print("Enter the mark (0-100) for student 2: ");
            numberInput2 = input.nextInt();
            if(numberInput2 >= 0 && numberInput2 <= 100){
                break;
            }
            System.out.println("Invalid input, try again...");
        }
        while(true){
            System.out.print("Enter the mark (0-100) for student 3: ");
            numberInput3 = input.nextInt();
            if(numberInput3 >= 0 && numberInput3 <= 100){
                break;
            }
            System.out.println("Invalid input, try again...");
        }
        double average = (double) (numberInput1 + numberInput2 + numberInput3) / 3;
        System.out.printf("The average is: %.2f", average);
    }
}
