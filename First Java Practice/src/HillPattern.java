import java.util.Scanner;

public class HillPattern {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();

        while(size <= 0){
            System.out.println("Try again......Enter a valid non-negative integer");
            size = input.nextInt();
        }
        // For pattern (a),
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < (size * 2) -1; col++) {
                if (row + col == row - 1 || row == size - 1 || col - row == size -1 || col ==  size - 1){
//                    System.out.printf("(%d,%2d)", row, col);
                    System.out.print("# ");


                } else{
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
        System.out.println();



        for (int row = 0; row < size; row++) {
            for (int col = 0; col < (size * 2) -1; col++) {

                System.out.printf("(%2d,%2d )", row, col);

            }
            System.out.println();
        }
        System.out.println();


//        // For pattern (b),
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if (row == 0 || row == size - 1
//                        || row == col){
//                    System.out.print("# ");
//                }
//                else{
//                    System.out.print("  ");
//
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        // For pattern (c),
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if (row == 0 || row == size -1
//                        || row + col == size - 1){
//                    System.out.print("# ");
//
//                }
//                else{
//                    System.out.print("  ");
//
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        // For pattern (d),
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if (row == 0 || row == size - 1 || row == col
//                        || row + col == size - 1){
//                    System.out.print("# ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        // For pattern (e),
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < size; col++) {
//                if (row == 0 || row == size - 1 || col == 0
//                        || col == size -1 || row == col || row + col == size - 1){
//                    System.out.print("# ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        input.close();
    }
}
