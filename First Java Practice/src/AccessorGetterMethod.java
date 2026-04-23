  class Automobile{
    String make;
    String model;
    String colour;
    int year;

    //Constructor method with parameters
    public Automobile(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Getter methods
    public String getMake(){ return  make; }
    public String getModel(){return model; }
    public String getColour(){return colour; }
    public int getYear(){return  year; }


}
public class AccessorGetterMethod {
    public static void main(String[] args){
        //Create object
        Automobile toyota = new Automobile("Toyota", "RAV4", "Blue", 2024);
        Automobile ford = new Automobile("Ford", "Escape", "Red", 2023);

        // USe getter method to get the value
        System.out.println("Car make is: " + toyota.getMake());
        System.out.println("Car make is: " + ford.getMake());

        System.out.println("Car model is: " + toyota.getModel());
        System.out.println("Car model is: " + ford.getModel());


        System.out.println("Car colour is: " + toyota.getColour());
        System.out.println("Car colour is: " + ford.getColour());

        System.out.println("Car year is: " + toyota.getYear());
        System.out.println("Car year is: " + ford.getYear());

    }

}
