package CodeWarsKatas7KYU;

import java.util.Arrays;
import java.util.Comparator;

/* <------------------------------------------------
    DESCRIPTION:

    Simple, given a string of words, return the length of the shortest word(s).
    String will never be empty, and you do not need to account for different data types.
---------------------------------------------------> */

public class K19_ShortestWord_UPGRADED {

    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShortUpgraded("turns out random test cases are easier than writing out basic ones"));
    }

    public static int findShort(String s) {

        String[] array = s.split(" ");
        int min = Integer.MAX_VALUE;
        for (String word : array){
            min = Math.min(word.length(), min);
        }
        return min;
    }

    public static int findShortUpgraded(String s) {
        return Arrays.stream(s.split(" ")).min(Comparator.comparingInt(String::length)).get().length();
    }
}
