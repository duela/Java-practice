public class VehicleConstructorMethod {
    public static void printHeader(){
        System.out.println("=================");
        System.out.println("Event Schedule");
        System.out.println("=================");


    }
    public static void main(String[] args){
        Vehicle v2 = new Vehicle("Tesla", "Model 3 luxury sedan", 2026);
        v2.start();
        printHeader();
        // Create your house here using System.out methods

    }

}
