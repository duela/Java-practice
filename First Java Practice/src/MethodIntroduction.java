public class MethodIntroduction {
    public static void main(String[] args){
        System.out.println(greet("Danny") + ageRangeChange(10) + " he is old");
        System.out.println(greet("Seun"));
        ageRange(10);
        ageRange(30);
        location("California");

    }
    public static String greet(String name){
        return "Hello, " + name + ", Welcome to Java class ";
    }

    public static int ageRangeChange(int ages){
        return ages;
    }
    public static void ageRange(int age){
        System.out.println("Age value: " + age);
    }
    public static void location(String address){
        System.out.println("Your current location is " + address);
    }
}
