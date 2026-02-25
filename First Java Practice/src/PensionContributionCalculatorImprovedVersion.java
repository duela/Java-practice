import java.util.Scanner;

public class PensionContributionCalculatorImprovedVersion {

    public static double[] pensionCalculator(double monthlySalary, int age){

        final double employerRate;
        final double employeeRate;
        double employeeContribution;
        double employerContribution;
        double[] totalContribution = {};
//        double

        double contributableSalary = Math.min(monthlySalary, Constants.SALARY_CEILING);

        if (age > 65){
            employeeRate = 0.05;
            employerRate = 0.075;
        }
        else if (age > 60){
            employeeRate = 0.075;
            employerRate = 0.09;
        }
        else if (age > 55){
            employeeRate = 0.13;
            employerRate = 0.13;
        }
        else {
            employeeRate = 0.2;
            employerRate = 0.17;
        }
        employeeContribution = contributableSalary * employeeRate;
        employerContribution = contributableSalary * employerRate;
        return totalContribution = new double[]{employeeContribution, employerContribution};


    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        double monthlySalary = input.nextDouble();
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        double[] result = pensionCalculator(monthlySalary, age);

        System.out.printf("The employee's contribution is: $%.2f %nThe employer's contribution is: $%.2f %nThe total contribution is: $%.2f"
                , result[0], result[1], (result[0] + result[1]) );
    }
}
