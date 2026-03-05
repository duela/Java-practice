import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String value = input.nextLine();
        int stringLength = value.length();
        int vowelCount = 0;
        int digitCount = 0;


        for (int i = stringLength - 1; i >= 0; i--) {
            String characterString = String.valueOf(value.charAt(i));
            char ch = Character.toLowerCase(value.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                    ch == 'u'){
                vowelCount++;
            }
            else if (ch >= '0' && ch <= '9'){
                digitCount++;
            }

        }
        double sumPercentage = ((double) vowelCount / stringLength * 100);
        double digitPercentage = ((double)digitCount / stringLength * 100);


        System.out.printf("Number of vowels: %d (%.2f%%)%n", vowelCount, sumPercentage);
        System.out.printf("Number of digits: %d (%.2f%%)%n", digitCount,  digitPercentage);


    }
}
