public class SquarePatternHole {
    public static void main(String[] args){
        int size = 5;
        for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row == 0 || row == size - 1
                            || col == 0 || col == size - 1) {
                        System.out.print(row+col + " ");
                    }
                    else {
                        System.out.print("  ");

                    }
                }
            System.out.println();

        }
    }
}
