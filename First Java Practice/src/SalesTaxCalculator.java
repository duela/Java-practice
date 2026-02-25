import java.util.Scanner;

public class SalesTaxCalculator {
    private static final double SALES_PRICE_PERCENTAGE = 0.07;

    public static double[] salesTax(double taxInclusivePrice){
        double actualPrice  = taxInclusivePrice / ( 1 + SALES_PRICE_PERCENTAGE);
        double salesTax = (taxInclusivePrice - actualPrice) ;
        return new double[] {actualPrice , salesTax};
    }

    public static void main(String[] args){
        Scanner input = new Scanner((System.in));
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        double taxInclusivePrice  = input.nextDouble();
        double taxInclusivePriceSum = 0;
        double actualPriceSum = 0;
        double salesTaxSum = 0;


        while (taxInclusivePrice != Constants.SENTINEL ){
            double[] result = (salesTax(taxInclusivePrice));
            System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n"
                    , result[0], result[1]);
            taxInclusivePriceSum += taxInclusivePrice;
            actualPriceSum += result[0];
            salesTaxSum += result[1];
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            taxInclusivePrice  = input.nextDouble();
        }
        System.out.printf("Total Price is: $%.2f%nTotal Actual Price is: $%.2f%nTotal Sales Tax is: $%.2f"
                , taxInclusivePriceSum, actualPriceSum, salesTaxSum);
        input.close();
    }
}
