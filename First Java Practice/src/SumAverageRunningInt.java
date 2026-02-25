public class SumAverageRunningInt {
    public static void main(String[] args){
        int number1 = 100;
        int sum1 = 1;
        int sum2 = 0;

        double average =  (double) (sum1 + number1)/2;
        for (int i = 0; i <= number1; i++){
            sum2 += i;
        }
        System.out.println("The sum of 1 to 100 is " + sum2);
        System.out.println("The average is " + average);


    }
}
