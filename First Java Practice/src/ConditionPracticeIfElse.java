public class ConditionPracticeIfElse {
    public static void main(String[] args){
        String weather = null;
        String nullPointer = null;

        if (weather == "snowing"){
            System.out.println("I will stay ski today because it is " + weather);
        }
//        else if (weather.equals("sunny")) {  // A NullPointerException happens when you try to: use an object that doesn’t exist
//            System.out.println("I will dive as it is " + weather + " today");
//        }
        else if ("null".equals(weather)) {
            System.out.println("null value weather");

        }
        else if ("raining".equals(weather)) {    // safer pattern as raining is never null
            System.out.println("I will swim as it is " + weather + " today");

        } else {
            System.out.println("I will head out as it is not " + weather + " today");
        }
        System.out.println("snowing".equals(weather)); // false
        System.out.println(nullPointer.length()); // A NullPointerException happens when you try to: use an object that doesn’t exist
        System.out.println(weather.equals("snowing")); // 💥 NPE
    }
}
