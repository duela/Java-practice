public class FibonacciExercise {
    public static void main(String[] args){
        int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn = 0;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int f1 = 1;
        int f2 = 1;
        int sum = 0;
//        System.out.println("f(0): 0");
//        System.out.println("f(1): 1");
        System.out.print(f1 + " " + f2 + " ");

        for (int i = n; i <= nMax ; i++) {
            fn =  fnMinus1 + fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
//            System.out.println("f(" + i + "): " + fn);

                System.out.print(fn + " ");
                sum += fn;


        }
        double average = (double) (sum  + f1 + f2) / nMax;  // Need sum to compute average
        System.out.print("\n");

        System.out.println("The average is " + average);

    }
}
