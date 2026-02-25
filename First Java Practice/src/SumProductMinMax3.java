import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        long firstInteger = input.nextLong();

        System.out.print("Enter 2nd integer: ");
        long secondInteger = input.nextLong();

        System.out.print("Enter 3rd integer: ");
        long thirdInteger = input.nextLong();

        long sum = (firstInteger + secondInteger + thirdInteger);
        long product = (firstInteger * secondInteger * thirdInteger);
        long min = Math.min(firstInteger, Math.min(secondInteger, thirdInteger));
        long max = Math.max(firstInteger, Math.max(secondInteger, thirdInteger));
        // Alternative min and max solution
        long minimum = firstInteger;
        if (secondInteger < minimum){
            minimum =secondInteger;
        }
        if(thirdInteger < secondInteger) {
            minimum = thirdInteger;
        }
        long maximum = firstInteger;
        if(secondInteger > maximum) maximum = secondInteger;
        if(thirdInteger > maximum) maximum = thirdInteger;


        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min + " or " + minimum);
        System.out.println("The max is: " + max + " or " + maximum);

        input.close();

    }
}
