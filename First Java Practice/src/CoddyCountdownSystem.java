public class CoddyCountdownSystem {
    public static void main(String[] args){
        // Initialize starting number
        int number = 16;

        System.out.println("Starting countdown...");

        // Write your do-while loop here
        do {
            System.out.printf("Number is: %2d%n", number);
            if (number % 2 == 1) { // checks for odd number
                number -= 1;
            }
            else {
                number /= 2; //
            }

        } while (number > 1);
        System.out.println("Final number is: " + number);
        System.out.println("Countdown finished!");
    }
}
