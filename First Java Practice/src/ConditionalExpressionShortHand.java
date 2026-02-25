public class ConditionalExpressionShortHand {
    public static void main(String[] args){

        for (int timeOfDay = 0; timeOfDay <= 9; timeOfDay++ ){
            int RandomTimeOfDay = (int) (Math.random()*26 - 1);
            String result = (RandomTimeOfDay > 0 && RandomTimeOfDay < 12)? "Morning"
                    : (RandomTimeOfDay == 12) ? "Noon"
                    : (RandomTimeOfDay > 12 && RandomTimeOfDay < 18) ? "Afternoon"
                    : (RandomTimeOfDay >= 18 && RandomTimeOfDay < 20) ? "Evening"
                    : (RandomTimeOfDay >= 20 && RandomTimeOfDay < 24) ? "Night"
                    : (RandomTimeOfDay == 0 || RandomTimeOfDay == 24) ? "Dawn"
                    : ("Invalid time");
            System.out.println("The time is " + RandomTimeOfDay + ": 00 We are currently in the " + result);
//            while ("Dawn".equals(result)){
//                System.out.println(result);
//
//            }

        }


    }
}
