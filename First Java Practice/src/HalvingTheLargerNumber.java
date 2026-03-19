import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HalvingTheLargerNumber {

    public static double bigger(double arg1, int arg2) {
        // Complete the method

        return Math.max(arg1, arg2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of iterations: ");
        int iterations = scanner.nextInt();
        System.out.print("Enter num1: ");

        double num1 = scanner.nextDouble();
        System.out.print("Enter num2: ");

        int num2 = scanner.nextInt();
        System.out.println(num2);

//        double smaller ;

        for (int i = 1; i <= iterations; i++) {
            // Write your code below

            double maxValue = bigger(num1,num2);
            if (maxValue < 2) {
                break;
            }
            double newValue = maxValue / 2;
            if(num1 >= num2){
                num1 = newValue;

            }
            else{
                num2 = (int) newValue;

            }
            System.out.println(newValue);


        }
        scanner.close();
    }
}
