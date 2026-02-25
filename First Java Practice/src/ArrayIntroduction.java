public class ArrayIntroduction {
    public static void main(String[] args){
        String[] studentNames =  {"John", "David", "Henry", "Bob", "Victor"};
        int[] studentAge =  {29, 25, 42, 31, 33};
        double[] studentGrades = {4.0, 3.25, 3.9, 2.9,3.5};
        String[] studentSubjects = new String[5]; // creates an array that can hold 5 strings
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Physics";
        studentSubjects[2] = "Political Science";
        studentSubjects[3] = "Mathematics";
        studentSubjects[4] = "Sociology";


        System.out.println(studentNames[3]);
        System.out.println(studentAge[0]);
        System.out.println(studentGrades[4]);
        System.out.println(studentSubjects[3]);
    }
}
