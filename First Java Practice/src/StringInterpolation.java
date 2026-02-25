public class StringInterpolation {
    public static void main(String[] args){
        String customerName = "Kelvin" ,  streetName = "4131, California Avenue";
        int age = 35;
        String city = "Los Angeles", state = "California", zipCode = "90012", country = "United States";

        System.out.printf("Student Details: name %s is age: %d, Address: %s, City: %s, State: %s, Zip Code: %s, Country: %s", customerName, age, streetName, city, state, zipCode,country );
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println();
        System.out.println(firstName.concat(lastName));
    }

}
