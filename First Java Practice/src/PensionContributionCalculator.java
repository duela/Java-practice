import java.util.Scanner;

public class PensionContributionCalculator {

    public static void pensionCalculator(double monthlySalary, int age){
        double employeeRateAge55andBelow = 0.20;
        double employeeRateAge55to60 = 0.13;
        double employeeRateAge60to65 = 0.075;
        double employeeRateAge65andAbove = 0.05;

        double employerRateAge55andBelow = 0.17;
        double employerRateAge55to60 = 0.13;
        double employerRateAge60to65 = 0.09;
        double employerRateAge65andAbove = 0.075;

        double employeeContribution = 0.0;
        double employerContribution = 0.0;
//        double pensionContribution =

        if (monthlySalary > 6000){
            monthlySalary = 6000;
        }
        if(age > 65){
            employeeContribution = monthlySalary * employeeRateAge65andAbove;
            employerContribution = monthlySalary * employerRateAge65andAbove;
        }
        else if (age > 60) {
            employeeContribution = monthlySalary * employeeRateAge60to65;
            employerContribution = monthlySalary * employerRateAge60to65;
        }
        else if (age > 55) {
            employeeContribution = monthlySalary * employeeRateAge55to60;
            employerContribution = monthlySalary * employerRateAge55to60;
        }
        else {
            employeeContribution = monthlySalary * employeeRateAge55andBelow;
            employerContribution = monthlySalary * employerRateAge55andBelow;
        }



        System.out.printf("The employee's contribution is: $%.2f %nThe employer's contribution is: $%.2f %nThe total contribution is: $%.2f"
                , employeeContribution, employerContribution, (employeeContribution + employerContribution) );
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        pensionCalculator(monthlySalary, age);

        input.close();




    }
}
