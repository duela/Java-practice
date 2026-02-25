import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int variable1 = input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int variable2 = input.nextInt();
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        System.out.printf("After the swap,  the first integer is: %d, second integer is: %d", variable1, variable2);

        input.close();
    }
}
