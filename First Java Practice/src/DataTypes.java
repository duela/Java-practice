public class DataTypes{
  public static void main(String[] args) {
      byte Byte = 127;
      short shortNumber = 24123;
      int integer = 25;
      long  longNumber = 34567890;
      double balance = 243456788987656789876553.432f;
      float floatDecimal = 66.6f;
      boolean positiveNegative = false;
      char character = 'D';
      String name = "Samuel";

      System.out.println("byte value is: " + Byte);
      System.out.println("short number is: " + shortNumber);
      System.out.println("int number is: " + integer);
      System.out.println("long number is: " + longNumber);
      System.out.println("double decimal is: " + balance);
      System.out.println("float decimal is: " + floatDecimal);
      System.out.println("boolean type is: " + positiveNegative);
      System.out.println("char number is: " + character);
      System.out.println("string value is: " + name);

      int maxScore = 500;

// The actual score of the user
      int userScore = 423;

/* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to double to make sure that the division is accurate */
      double percentage = (double) userScore / maxScore * 100.0d;

      System.out.println("User\"s\\ percentage is' " + percentage);






  }
}
