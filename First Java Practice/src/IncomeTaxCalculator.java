public class IncomeTaxCalculator {
    public static void taxCalculator (double income){
        double taxRateAbove60K = 60000;
        double taxRateAbove40K = 40000;
        double taxRateAbove20K = 20000;
        double tax = 0;
        double incomePay = income;


        if(income > taxRateAbove60K){
            tax += (income - taxRateAbove60K) * 0.3;
             income = 60000;

        }
        if (income > taxRateAbove40K){
            tax += (income - taxRateAbove40K) * 0.2;
            income = 40000;
        }
        if (income > taxRateAbove20K){

            tax += (income - taxRateAbove20K) * 0.1;

        }
        double netPay = (incomePay - tax);

//        System.out.println("The taxable income for gross pay $" + incomePay + " is $%.2f" + tax + " your net pay is: " + (incomePay - tax));
//        System.out.println(String.format("The taxable income for gross pay $ %f is $%.2f your net pay is %f", incomePay, tax, netPay));
        System.out.printf("The taxable income for gross pay $%.2f is $%.2f your net pay is $%.2f", incomePay, tax, netPay);




        // Alternative method
//        if (income <= 20000) {
//            return taxableIncome;
//        } else if (income <= 40000) {
//            return taxableIncome = 0 + ((income - 20000) * 0.1);
//        } else if (income <= 60000){
//            return taxableIncome = 0 + ((20000 * 0.1) + ((income - 40000) * 0.2));
//        } else {
//            return taxableIncome = 0 + ((20000 * 0.1) + (20000 * 0.2) + ((income - 60000) * 0.3));
//        }
    }

    public static void main (String[] args){
        taxCalculator(85432);
    }
}
