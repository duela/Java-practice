import java.util.Arrays;
import java.util.Scanner;

public class CoddyArrayMergerAndSorting {
    public static String[] merge(String[] arr1, String[] arr2) {
        // Write code here
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int size = arr1Length + arr2Length;
        String[] merger = new String[size];

        for (int i = 0; i < arr1Length; i++) {
            merger[i] = arr1[i];
        }
        for (int j = 0; j < arr2Length; j++) {
            merger[arr1Length + j] = arr2[j];
        }
        Arrays.sort(merger);
        return merger;
    }

    public static String[] mergedArrayCopy(String[] arr1, String[] arr2){

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int size = arr1Length + arr2Length;
        String[] merger = new String[size];
        System.arraycopy(arr1, 0, merger, 0, arr1Length);
        System.arraycopy(arr2, 0, merger, arr1Length, arr2Length);
        Arrays.sort(merger);
        return merger;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        String[] mergedArrayCopy = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
        System.out.println(Arrays.toString(mergedArrayCopy));

    }
}
