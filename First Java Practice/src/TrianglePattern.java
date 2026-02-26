public class TrianglePattern {
    public static void main(String[] args) {
        int size = 7;
        for (int row = 1; row <= size; row++) {
            for (int i = size; i >= row; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
