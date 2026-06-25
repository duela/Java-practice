import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Add2Integer {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first integer: ");
//
//        int firstNumber = input.nextInt();
//
//        System.out.print("Enter second integer: ");
//        int secondNumber = input.nextInt();
//
//        System.out.println("The sum is: " + (firstNumber + secondNumber));
//        input.close();
        String[] operation = {"GET Bob", "CHECK Charlie", "MODIFY Bob 92", "MODIFY Charlie 88"};
        HashMap<String, Integer> data = new HashMap<>(Map.of("Alice", 85, "Bob", 92));

        for (int i = 0; i < operation.length; i++) {
            String key = operation[i];
            String keyValue = key.split(" ")[1].trim();
            boolean checker = data.containsKey(keyValue);
            if (key.contains("GET")) {
                if (checker) {
                    System.out.println(data.get(keyValue));
                }
                else{
                    System.out.println("Not found");
                }

            }
            if (key.contains("CHECK")) {
                if (checker) {
                    System.out.println("Exists");
                }
                else{
                    System.out.println("Not found");

                }
            }
            if (key.contains("MODIFY")) {
                Integer modifyKeyValue = Integer.valueOf(key.split(" ")[2].trim());
                if (checker && Objects.equals(data.get(keyValue), modifyKeyValue)) {
                    data.replace(keyValue, modifyKeyValue + 1);
                }
                if (checker && !Objects.equals(data.get(key), modifyKeyValue)) {
                    data.remove(key);
                } else{
                    data.put(keyValue, modifyKeyValue);
                }
            }

        }
        System.out.println(data);
    }
}
