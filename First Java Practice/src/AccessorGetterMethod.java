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
