import java.util.Scanner;

public class AverageWithInputValidationImprovedVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput;
        int sum = 0;
        double average =0;

        for (int i = 1; i <=3 ; i++) {
            while(true){
                System.out.print("Enter the mark (0-100) for student " + i + " : ");
                numberInput = input.nextInt();
                if(numberInput >= 0 && numberInput <= 100){
                    sum += numberInput;
                    break;
                }
                System.out.println("Invalid input, try again...");
            }
            average = (double)sum/3;

        }
        System.out.printf("The average is: %.2f", average);
    }
}
