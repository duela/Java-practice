public class Automobile{
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
