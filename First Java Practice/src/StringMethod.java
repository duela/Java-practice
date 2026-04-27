import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args){
        String str1 = "Hello students" + " Welcome to Java World!";
        String str2 = "Welcome ";
        String str3 = "";
        String str4 = "Java";
        String str5 = "  string  ";
        String str6 = "abc def ghi";
        String[] strCount = str6.split("\\s+");
        // \s matches any whitespace character (space, tab, newline).
        // + is a quantifier meaning "one or more."
        // The extra backslash \ is required in Java to escape the backslash used in regex.
        System.out.println(str1.length()); //Find length of the string
        System.out.println(str1.substring(1)); // Return string after 1 index
        System.out.println(str1.substring(6,13));
        System.out.println(str1.contains("Hello")); // Return string after 1 index
        System.out.println(str1.contains("Hello"));
        System.out.println(str2.equals("welcome"));
        System.out.println(str2.equalsIgnoreCase("welcome"));
        System.out.println(str3.isEmpty());
        System.out.println(str1.replace("ello", "allo"));
        System.out.println(str2.replace("e", "a"));
        System.out.println(str2.concat(str4));
        System.out.println(str4.toUpperCase());
        System.out.println(str5.trim());
        System.out.println(Arrays.toString(strCount));
        for (String s : strCount) {
            System.out.println("Word: " + s);
        }

    }
}
