import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();

        for (int row = 1; row <= size; row++) {
            if (row%2 == 1 ){
                for (int col = 1; col <= size; col++) {
                    System.out.print("# ");
                }
            }
            else{
                for (int col = 1; col <= size; col++) {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
