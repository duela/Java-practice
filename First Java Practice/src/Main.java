import java.util.Arrays;

public class Main {
    public static void printNTimes(String message, int n) {
        // Write you code here
        for(; n > 0; n--){
            System.out.println(message);
        }
    }
    public static void printHeader(){
        System.out.println("=================");
        System.out.println("Event Schedule");
        System.out.println("=================");

    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String msg = scanner.nextLine();
//        int n = scanner.nextInt();
//
//        printNTimes(msg, n);
//        printHeader();
//
//        Scanner scanner = new Scanner(System.in);
        int ni = 7;
        int sum = 0;
        int[] grades = {70, 85, 55, 44, 60, 100, 130, 96};
        // Write code here
        for(int i = 0; i < grades.length; i++){
            grades[i] += 2;
        }
        System.out.print(Arrays.toString(grades));

    }
}
