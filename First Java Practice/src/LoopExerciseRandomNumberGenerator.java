public class LoopExerciseRandomNumberGenerator {
    public static void main(String[] args){
        // Generate 10 random numbers between 1 and 10
        for (int random = 1; random<= 10; random++){
            int randomNumberGenerator = (int)(Math.random()*3);
            System.out.println("Random number " + random + " generated is: " + randomNumberGenerator);
        }
    }
}
