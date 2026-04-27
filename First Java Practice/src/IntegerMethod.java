public class IntegerMethod {
    public static void main(String[] args){
        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;
        Integer e = null;
        int f = 0;

        System.out.println(a.intValue()); // returns the integer value of a
        System.out.println(b.doubleValue());
        System.out.println(c.floatValue());
        System.out.println(Integer.parseInt("24561"));
        System.out.println(Integer.compare(a, d));
        System.out.println(Integer.compare(a, 90));
        System.out.println(Integer.compare(90, d));
        System.out.println(Integer.compare(a, b));
        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(e);
        System.out.println(f);
        System.out.println(f + c + a);





    }
}
