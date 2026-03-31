public class CoddySimplePrimeNumberFinder {
    public static void main(String[] args){
        int number = 97;
        boolean isPrime = true;

        System.out.println("Checking if " + number + " is prime...");

        // Write your code here
        for (int i = 2; i <= 48 ; i++) {
            if (number % i == 0) {

                System.out.println("Found divisor: " + i);
                isPrime = false;

            }
            else {
                System.out.println("Checking divisor: " + i);
                isPrime = true;

            }

        }

        // Print the result
        System.out.println(number + " is " + (isPrime ? "prime!" : "not prime!"));
    }
}
