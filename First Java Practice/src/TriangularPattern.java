import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();

        while(size <= 0){
            System.out.println("Try again......Enter a valid non-negative integer");
            size = input.nextInt();
        }
     // For pattern (a),
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col){
                    System.out.print("# ");

                }

            }
            System.out.println();
        }
        System.out.println();

        // For pattern (b),
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1){
                    System.out.print("# ");

                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
        System.out.println();
        // For pattern (c),
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col){
                    System.out.print("# ");

                }
                else{
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
        System.out.println();

        // For pattern (d),
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1){
                    System.out.print("# ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
