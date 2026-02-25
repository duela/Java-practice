public class CozaLozaWozaExercise {
    public static void main(String[] args){
        int maxNumber = 1000;
        String coza = "Coza";
        String loza = "Loza";
        String woza = "Woza";
        String value;
//        int cozaLozaWozaValue;

        for (int i = 1; i <= maxNumber; i++) {
            value = String.valueOf(i);

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                value = coza + loza + woza;
//                cozaLozaWozaValue = i;
//                System.out.println(cozaLozaWozaValue);

            }
            else if (i % 3 == 0 && i % 5 == 0) {
                value = coza + loza;
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                value = coza + woza;
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                value = loza + woza;
            }
            else if(i % 3 == 0){
                value = coza;
            }
            else if(i % 5 == 0){
                value = loza;
            }
            else if (i % 7 == 0) {
                value = woza;
            }

            System.out.print(value + " ");
            if (i % 11 == 0){
                System.out.println();
            }

//                System.out.println(cozaLozaWozaValue);
        }

    }
}
