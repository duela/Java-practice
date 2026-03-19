import java.util.Scanner;

public class Main {
    public static void printNTimes(String message, int n) {
        // Write you code here
        for(; n > 0; n--){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int n = scanner.nextInt();

        printNTimes(msg, n);
    }
}