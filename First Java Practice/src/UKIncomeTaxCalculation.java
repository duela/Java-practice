public class UKIncomeTaxCalculation {
     public static void incomeCalculator(double [] grossIncome){
//         grossIncome = {235, 829};

         double personalAllowance = 0.0;
         double basicRate = 0.2;
         double higherRate = 0.4;
         double additionalRate = 0.45;
         for (int i = 0; i < grossIncome.length; i++) {
             double tax = 0.0;
//             double gross = grossIncome[i];
//             System.out.println(grossIncome[i]);
             double incomePay =  grossIncome[i];
             double taxableIncome = incomePay;

             if (taxableIncome > 125140) {
                 tax += (taxableIncome - 125140) * additionalRate;
                 taxableIncome = 125140;
             }
             if (taxableIncome > 50270) {
                 tax += (taxableIncome - 50270) * higherRate;
                 taxableIncome = 50270;
             }
             if (taxableIncome > 12570) {
                 tax += (taxableIncome - 12570) * basicRate;

             }
////         tax = personalAllowance;
             double netPay = incomePay - tax;
             System.out.printf("For the gross income £%.2f, the payable tax is £%.2f and the net pay is £%.2f%n", incomePay, tax, netPay);
         }


     }


    public static void main (String[] args){
         double[] grossIncome = {25700, 49800, 92000, 100000, 132000} ;
        incomeCalculator(grossIncome);
    }
}
