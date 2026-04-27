public class  Car{
    String make;
    String model;
    String colour;
    int year;

    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Getter methods
    public String getMake(){ return  make; }
    public String getModel(){ return model; }
    public String getColour(){ return colour; }
    public int getYear(){ return year; }


    // Setter methods
    public void setMake(String newMake){
        this.make = newMake;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setColour(String newColour){
        this.colour = newColour;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
}
