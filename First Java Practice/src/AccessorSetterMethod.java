public class AccessorSetterMethod {
    public static void main(String[] args){
        Car volvo = new Car("Volvo", "XC60", "white", 2026);
        System.out.println("The initial car maker is: " + volvo.getMake());

        //use setter method to set new value
        volvo.setMake("Mercedes");
        volvo.setModel("GLE");
        volvo.setColour("black");
        volvo.setYear(2025);

        System.out.println("The new car maker is: " + volvo.getMake());
        System.out.println("The new car model is: " + volvo.getModel());
        System.out.println("The new car colour is: " + volvo.getColour());
        System.out.println("The new car year is: " + volvo.getYear());


    }
}
