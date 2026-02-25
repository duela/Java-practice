public class CheckOddEvenExercise {
    public static void main (String[] args){
        int number = 1001;
        int modulus = number % 2;
        System.out.println(modulus);
        if (modulus == 1){
            System.out.println("The number " + number + " is an odd number");
        } else {
            System.out.println("The number " + number + " is an even number");
        }

    }
}
