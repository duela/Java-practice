public class GradingExerciseConditionalExpressionCleanerVersion {

        public static void main(String[] args){
            double grade = 68;
            String letterGrade = "";
            String description = "";
            int pointGrade = 0;
            if (grade >= 70){
                letterGrade = "A";
                pointGrade = 5;
                description = "Excellent";
                System.out.println(description + " grade point of: " + pointGrade + " you have an " + letterGrade);
            } else if (grade >= 60) {
                letterGrade = "B";
                pointGrade = 4;
                description = "Very Good";
                System.out.println(description + " grade point of: " + pointGrade + " you have a " + letterGrade);
            } else if (grade >= 50 ) {
                letterGrade = "C";
                pointGrade = 3;
                description = "Good";
                System.out.println(description + " grade point of: " + pointGrade + " you have a " + letterGrade);
            } else if (grade >= 45 ) {
                letterGrade = "D";
                pointGrade = 2;
                description = "Good";
                System.out.println(description + " grade point of: " + pointGrade + " you have a " + letterGrade);
            } else if (grade >= 40 ) {
                letterGrade = "E";
                pointGrade = 1;
                description = "Pass";
                System.out.println("You " + description + "ed with a grade point of: " + pointGrade + " you have an " + letterGrade);
            }
            else {
                letterGrade = "F";
                description = "Fail";
                System.out.println("You " + description + "ed with a grade point of: " + pointGrade + " you have an " + letterGrade);
            }
            System.out.println(grade);
            System.out.println(letterGrade);
            System.out.println(pointGrade);
            System.out.println(description);

        }


}

