// Constructor 1 example

class Vehicle{
    String make;
    String model;
    int year;

    // Constructor with parameters
    public Vehicle(String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //Starting
    public void start(){
        System.out.println("starting");
    }
}

// Constructor 2 example
class Constructor101 {
    //constructor method w/o parameters
    public Constructor101(){
        System.out.println("This is a constructor method");
    }
    //constructor method with parameters
    public  Constructor101(String param){
        System.out.println("This is a constructor method with a parameter " +  param);
    }
    // Instance method w/o parameter
    public void InstanceMethod(){
        System.out.println("This is an instance method");
    }

    // Instance method with parameter
    public void CustomerName(String name){
        System.out.println("The customer name is : " + name);
    }

}

class Customer{
    public Customer(){
        System.out.println("Welcome to Walmart");
    }
    public void GetName(String name){
        System.out.println("Customer name is : " + name);
    }
}


public class ConstructorMethodIntroduction {
    public static void main(String[] args){
        // First constructor method
        Vehicle ford = new Vehicle("ford", "Explorer", 2020);
        // Starting
        ford.start();
        // Second instance constructor method....
        // create object method with default constructor
        Constructor101 method1 = new Constructor101();
        method1.InstanceMethod();

        // create object method with constructor having a parameter
        Constructor101 method2 = new Constructor101("constructor");

        // create object method with constructor and instance having a parameter
        Constructor101 method3 = new Constructor101("testing param");
        method2.CustomerName("John");
    }
}
