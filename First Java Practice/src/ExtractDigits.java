public class ExtractDigits {
    public static void main(String[] args){
        int n = 15423;
        while( n > 0){
            int digit = n % 10;
            n = n / 10;

            System.out.print(digit);
        }
        System.out.println();

        for (int i = 15423; i > 0; i /= 10) {
            int digit = i % 10;
            System.out.print(digit + " ");
        }
    }
}
