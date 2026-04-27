class StaticVariable {
    // static or class variable
    public  static String name;
    public  static String address;
    public  static final double PI = 3.14; // constant variable
}

 class StaticVariableMethod{
    public static void main(String[] args){
        StaticVariable.name = "James";
        System.out.println(StaticVariable.name);

        StaticVariable.address = "B.Karvelio g";

        System.out.println(StaticVariable.address);
        System.out.println(StaticVariable.PI);
    }
}

