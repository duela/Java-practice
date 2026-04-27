public class AccessorEncapsulationMethod {
    public static void main(String[] args){
        Encapsulation customer = new Encapsulation("1000098");
        customer.setName("Clark");
        customer.setAge(36);
        customer.setCountryCode("US");
        customer.address = "7th Avenue New York";
        customer.postalCode = "870001";
        customer.country = "United State";

        System.out.printf("%s's with id num:%s is %d years old\n",
                customer.getName(), customer.getId(),
                customer.getAge());
        System.out.printf("%s's address is %s, %s, %s, %s", customer.getName(),
                customer.address, customer.postalCode, customer.country, customer.getCountryCode());



    }
}
