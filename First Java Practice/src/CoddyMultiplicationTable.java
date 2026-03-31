public class CoddyMultiplicationTable {
    public static void main(String[] args){
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        for (int row = 1; row < 6; row++) {
            for (int col = 1; col < 6; col++) {
                // Left-align in a 3-character field for all but the last column
                if (col < 5) {
                    System.out.printf("%-3d", row*col);
                }
                // Print the last number in the row with no trailing spaces
                else{
                    System.out.print(row*col);
                }

            }
            System.out.println();
        }
    }
}
