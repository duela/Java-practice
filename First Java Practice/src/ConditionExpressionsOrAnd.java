public class ConditionExpressionsOrAnd {
    public static void main(String[] args){
        double accountBalance = 102050.50;
        int age = 75;
        if (accountBalance >= 1000000 || age >= 65) {
            System.out.println("You can retire now, Good luck!");
        } else {
            System.out.println("You still need to save money for your retirement");
        }
    }
}
