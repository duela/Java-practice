public class CrossPattern {
    public static void main(String[] args){
        int size = 9;
        int center = (size - 1)/2;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row == center || col == center){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");

                }
            }
            System.out.println();

        }
    }
}
