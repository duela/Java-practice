public class Encapsulation {
    // The main idea of encapsulation is to protect your data
    // instance variable
    private String name;
    private String id;
    private int age;
    public String countryCode;
    String country;
    String postalCode;
    String address;

    // I do not want the ID to change and should be generated upon objected creation.
    // I created a constructor to achieve that and setId would not be created
    public Encapsulation(String id) {
        this.id = id;
    }

    //Getter and Setter method
    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
