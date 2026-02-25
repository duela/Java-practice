public class SumTheSquares {
    public static void main(String[] args){
        int number2 = 100;
        int sum = 0;
        for (int i = 1; i <= number2; i++){
            int square = i*i;
            sum += square;
//            System.out.println("Number: " + i*i);
        }
        System.out.println("Sum: " + sum);
    }
}
