public class ClassIntroduction {
    public static void main(String[] args){
        //Call static method
        System.out.println("Calling static methods");
        dogName("Max");
        bark();
        eat();
        play();
        System.out.println();

        //Call instance method
//        System.out.println("Calling instance methods");
        System.out.println("Student 2");
        Student student1 = new Student(); // naming object
        student1.studentName("Tracy");
        student1.studentGrade(4.8);
        System.out.println();


        //2nd
        //Call static method
        System.out.println("Calling static methods");
        dogName("Charlie");
        bark();
        eat();
        play();
        System.out.println();


//        System.out.println("Calling instance methods");
        System.out.println("Student 2");
        Student student2 = new Student(); // naming object
        //Call instance method
        student2.studentName("Smith");
        student2.studentGrade(3.71);


    }
    //static methods
    public static void dogName(String name){
        System.out.printf("Dog name is %s%n" , name);
    }
    public static void bark(){
        System.out.println("I am barking");
    }
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void play(){
        System.out.println("I am playing");
    }


}
class Student {
    //Instance or non-static method
    //Instance method to get student name
    public void studentName(String name){
        System.out.printf("My name is %s%n" , name);
    }
    //Instance method to get student grade
    public void studentGrade(double grade){
        System.out.printf("Your grade is %.2f" , grade);
    }
}
