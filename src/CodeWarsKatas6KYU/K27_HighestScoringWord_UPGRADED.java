package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.Comparator;

/* <------------------------------------------------
    DESCRIPTION:

    Given a string of words, you need to find the highest scoring word.
    Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
    For example, the score of abad is 8 (1 + 2 + 1 + 4).
    You need to return the highest scoring word as a string.
    If two words score the same, return the word that appears earliest in the original string.
    All letters will be lowercase and all inputs will be valid.
---------------------------------------------------> */

public class K27_HighestScoringWord_UPGRADED {

    public static void main(String[] args) {

        System.out.println(highUpgrade("what time are we climbing up to the volcano"));
        System.out.println(highUpgrade("man i need a taxi up to ubud"));
    }

    public static String high(String s) {

        String[] words = s.split(" ");
        int currentWordSum = 0;
        int highestWordSum = 0;
        String result = "";
        for (String word : words) {
            for (char x : word.toCharArray()) {
                currentWordSum += (Character.getNumericValue(x) - 9);
            }
            if (currentWordSum > highestWordSum) {
                result = word;
                highestWordSum = currentWordSum;
            }
            currentWordSum = 0;
        }

        return result;
    }

    public static String highUpgrade(String s) {
        return Arrays.stream(s.split(" ")).max(Comparator.comparingInt(x -> x.chars().map(y -> y - 96).sum())).get();
    }
}
