import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int size;

        while (true){
            System.out.print("Enter the size (1-9): ");
            size = input.nextInt();
            if( size >= 1 && size <= 9){
                break;
            }
            System.out.println("Invalid input. Enter an integer between 1 and 9.");
        }
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        input.close();
    }
}
