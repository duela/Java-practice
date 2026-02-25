public class ComputePiExercise {
    public static void main(String[] args){

        int [] values = {1000, 10000, 100000, 1000000000};
        for (int value: values){
//            System.out.println(value);
//            final int MAX_DENOMINATOR =  100000;
            double sum = 0.0;
            for (int denominator = 1; denominator <= value; denominator+=2) {
                if(denominator % 4 == 1){
                    sum += (1.0 / denominator);
                } else if (denominator %  4 == 3) {
                    sum -= (1.0 / denominator);
                }
                else{
                    System.out.println("Impossible");
                }

            }
            sum = 4 * sum;
            double difference = (sum - Math.PI);
            System.out.println(value + " : " + sum + " the difference is " + difference);
        }


    }
}
