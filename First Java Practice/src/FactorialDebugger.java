import java.util.Scanner;

public class FactorialDebugger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int temp = n;
        int fact = 1;
        if (n < 1){
            System.out.print("Enter a non negative integer...");
        }
        else{
            while(n > 0){
                fact *= n;
                n -= 1;
            }
            System.out.printf("The factorial of %d is %d: " , temp, fact);
        }

        input.close();
    }
}
