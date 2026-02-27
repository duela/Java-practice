import java.util.Scanner;

public class BoxPatternXReusableMethod {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter size: ");
            int size = input.nextInt();

            System.out.print("Enter pattern type (1-5): ");
            int type = input.nextInt();

            printPattern(size, type);

            input.close();
        }

        public static void printPattern(int size, int type) {

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {

                    if (shouldPrint(row, col, size, type)) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }

        public static boolean shouldPrint(int row, int col, int size, int type) {

            boolean top = row == 0;
            boolean bottom = row == size - 1;
            boolean left = col == 0;
            boolean right = col == size - 1;
            boolean mainDiag = row == col;
            boolean antiDiag = row + col == size - 1;

            switch (type) {
                case 1: return top || bottom || left || right; // Hollow box
                case 2: return top || bottom || mainDiag;
                case 3: return top || bottom || antiDiag;
                case 4: return top || bottom || mainDiag || antiDiag;
                case 5: return top || bottom || left || right || mainDiag || antiDiag;
                default: return false;
            }
        }

}
