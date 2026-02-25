public class CozaLozaWozaIndustryAcceptedSolution {
    public static void main(String[] args){
        int maxValue = 110;
        int minValue = 1;
        for (int i = minValue; i < maxValue; i++) {

            String result = "";
            if(i % 3 == 0) result += "Coza";
            if(i % 5 == 0) result += "Loza";
            if(i % 7 == 0) result += "Woza";

            if(result.isEmpty()) result = String.valueOf(i);
            System.out.print(result + " ");
            if (i % 11 == 0){
                System.out.println();
            }

        }
    }
}
