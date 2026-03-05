import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String value = input.nextLine();
        int characterLength = value.length();

        for (int i = characterLength - 1; i >= 0   ; i--) {
            System.out.print(value.charAt(i));
            System.out.print(value.codePointAt(i));

        }

//        System.out.print(value.length());
//        System.out.print(value.charAt(length - 1));

    }
}
