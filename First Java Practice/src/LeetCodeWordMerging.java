import java.util.Scanner;

public class LeetCodeWordMerging {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();

        Solution answer = new Solution();
        answer.mergeAlternately(word1, word2);

    }

}
class Solution {
    public void mergeAlternately(String word1, String word2) {

        int word1Length = word1.length();
        int word2Length = word2.length();
        if (word1Length == word2Length) {
            for (int i = 0, j = 0; i < word1Length; i++, j++) {
                System.out.print(word1.charAt(i));
                System.out.print(word2.charAt(j));
            }
        } else if (word1Length < word2Length) {
            for (int i = 0, j = 0; i < word1Length; i++, j++) {
                System.out.print(word1.charAt(i));
                System.out.print(word2.charAt(j));
            }
            System.out.print(word2.subSequence(word1Length, word2Length));
        } else {
            for (int i = 0, j = 0; i < word2Length; i++, j++) {
                System.out.print(word1.charAt(i));
                System.out.print(word2.charAt(j));
            }
            System.out.print(word1.subSequence(word2Length, word1Length));

        }

    }
}



