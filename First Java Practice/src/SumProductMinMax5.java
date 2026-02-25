import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter 2nd integer: ");
        int secondInteger = input.nextInt();

        System.out.print("Enter 3rd integer: ");
        int thirdInteger = input.nextInt();

        System.out.print("Enter 4th integer: ");
        int fourthInteger = input.nextInt();

        System.out.print("Enter 5th integer: ");
        int fifthInteger = input.nextInt();

        int sum = (firstInteger + secondInteger + thirdInteger + fourthInteger +  fifthInteger);
        int product = (firstInteger * secondInteger * thirdInteger * fourthInteger * fifthInteger);
//        int min = Math.min(firstInteger, Math.min(secondInteger, thirdInteger));
//        int max = Math.max(firstInteger, Math.max(secondInteger, thirdInteger));

        int minimum = firstInteger;
        if (secondInteger < minimum){
            minimum = secondInteger;
        }
        if(thirdInteger < secondInteger) {
            minimum = thirdInteger;
        }
        if(fourthInteger < thirdInteger) minimum = fourthInteger;
        if(fifthInteger < fourthInteger) minimum = fifthInteger;


        int maximum = firstInteger;
        if(secondInteger > maximum) maximum = secondInteger;
        if(thirdInteger > maximum) maximum = thirdInteger;
        if(fourthInteger > thirdInteger) maximum = fourthInteger;
        if(fifthInteger > fourthInteger) maximum = fifthInteger;


        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + minimum);
        System.out.println("The max is: " + maximum);

        input.close();

    }

}
