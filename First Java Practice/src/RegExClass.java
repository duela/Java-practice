import java.util.Arrays;

public class RegExClass {
    public static final  String STRING_TEST = "This is my " + "small example";

    public static void main(String[] args){
        System.out.println(STRING_TEST.matches("\\w.*"));
        System.out.println(Arrays.toString(STRING_TEST.split("\\s")));


        String[] splitString = (STRING_TEST.split("\\s+"));
        System.out.println(Arrays.toString(splitString));

        for (String i: splitString){
            System.out.println(i);
        }
        System.out.println(STRING_TEST.replaceAll("\\s", "\t"));
    }
}
