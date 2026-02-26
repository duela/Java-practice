public class TimeTable {
    public static void main(String[] args){
        int size = 10;
        for (int row = 0; row <= size ; row++) {
            if (row == 0) {
                System.out.print("   * |");
            }

            else {
                System.out.printf("%4d", row);
            }

        }
        System.out.println();
        for (int row = 0; row <= size  ; row++) {

            System.out.printf("%4s", "-");
        }
        System.out.println();
        for (int row = 1; row <= size ; row++) {

            System.out.printf("%4d", row);
            System.out.print(" |");
            for (int col = 1; col <= size ; col++) {

                System.out.printf("%4d", row*col);

            }

            System.out.println();
        }
    }
}
