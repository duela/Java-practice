class Car{
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
    public void setMake(String make){
        this.make = make;
    }
    public String setModel(String model){
        this.model = model;
        return model;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setYear(int year){
        this.year = year;
    }
}


public class AccessorSetterMethod {
    public static void main(String[] args){
        Car volvo = new Car("Volvo", "XC60", "white", 2026);

        System.out.println("The car maker is: " + volvo.getMake());
        System.out.println("New model is: " + volvo.setModel("XC40"));


    }
}
