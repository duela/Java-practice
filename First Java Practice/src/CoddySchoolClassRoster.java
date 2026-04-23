import java.util.Arrays;

public class CoddySchoolClassRoster {

    public static String[] createSeatingChart(String[] names, int[] grades) {
        int namesLength = names.length;
        int gradesLength = grades.length;
        int size = namesLength + gradesLength;
        String[] merger = new String[size];
        System.arraycopy(names, 0, merger, 0, namesLength);
        System.arraycopy(grades, 0, merger, namesLength, gradesLength);
        Arrays.sort(merger);
        return merger;
    }

    public static void main(String[] args) {
        // Test arrays
        String[] names = {"Tom", "Alice", "Bob"};
        int[] grades = {85, 92, 78};
        int[] grades2 = {85, 92, 78};

        // Test first method
        String[] seatingChart = createSeatingChart(names, grades);
        System.out.print("Seating Chart: ");
        System.out.println(Arrays.toString(seatingChart));

//        // Test second method
//        String[] gradeLetters = findTopStudents(grades);
//        System.out.print("Grade Letters: ");
//        System.out.println(Arrays.toString(gradeLetters));
//
//        // Test third method
//        boolean equalClasses = isClassEqual(grades, grades2);
//        System.out.println("Classes Equal: " + equalClasses);
    }        // Test arrays

}