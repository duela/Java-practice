import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
     public static double taxCalculatorWithSentinel(double income){
//         double first20K = 0.0;in
         double second20K = 0.1;
         double third20k = 0.2;
         double fourth20K = 0.3;
         double tax = 0.0;

         if (income >= 60000){
             tax += (income - 60000) * fourth20K;
             income = 60000;
         }
         if (income >= 40000){
             tax += (income - 40000) * third20k;
             income = 40000;
         }
         if (income >= 20000){
             tax += (income - 20000) * second20K;

         }
         return  tax;
     }

    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the taxable income (or -1 to end): ");

        double income = input.nextDouble();


        while (income != Constants.SENTINEL ){
            System.out.printf("The income tax payable is: $%.2f%n", taxCalculatorWithSentinel(income));
            System.out.print("Enter the taxable income (or -1 to end): ");
            income = input.nextDouble();

        }

        System.out.println("Bye");

        input.close();
    }
}
