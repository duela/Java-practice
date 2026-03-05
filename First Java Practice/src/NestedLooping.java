import java.util.Scanner;

public class NestedLooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int value = scanner.nextInt();
        int initialValue = value;
        int sum = 0;

        for (int i = 0; i < initialValue; i++) {

            value = scanner.nextInt();
            sum += value;
        }
        System.out.println(sum);
        scanner.close();
    }
}
