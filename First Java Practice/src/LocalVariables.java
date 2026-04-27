public class LocalVariables {
    public  void getDogAge(int age){
        int dogAge = age + 12; // local variable for age, because it is declared inside of a method
        System.out.println("Dog age is: " + dogAge);
    }

    public static void main(String[] args){
        LocalVariables local = new LocalVariables();
        local.getDogAge(2);
    }
}
