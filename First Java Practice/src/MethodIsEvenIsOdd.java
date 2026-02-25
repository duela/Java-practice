public class MethodIsEvenIsOdd {
    public static boolean isEvenMethod1(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    // cleaner version
    public static boolean isEvenMethod2(int number){

        return number % 2 == 0;
    }
    public static void main(String[] args){
        int numberCheck = 50;
        System.out.println("Method one: Is " + numberCheck + " number even? " + isEvenMethod1(numberCheck) );
        System.out.println("Method two: Is number even? " + isEvenMethod2(9) );
    }

}
