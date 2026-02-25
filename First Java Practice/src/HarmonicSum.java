public class HarmonicSum {
    public static void main(String[] args){
        int maxDenominator = 500000000;
        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;
        double difference;

        for (int i = 1;  i <= maxDenominator; i++){
            sumLeftToRight += 1.0 / i;
        }
        for (int i = maxDenominator;  i >= 1; i--){
            sumRightToLeft += 1.0 / i;
        }
        difference = sumLeftToRight - sumRightToLeft;

        System.out.println("Sum Left-to-Right: " + sumLeftToRight);
        System.out.println("Sum Right-to-Left: " + sumRightToLeft);
        System.out.println("Absolute Difference: " + difference);
    }
}
