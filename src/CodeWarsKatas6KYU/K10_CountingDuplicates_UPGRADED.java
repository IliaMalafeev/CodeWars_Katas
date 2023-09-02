package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that will return the count of distinct case-insensitive alphabetic characters
    and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Examples:
        "abcde" -> 0  # no characters repeats more than once;
        "aabbcde" -> 2  # 'a' and 'b';
        "aabBcde" -> 2  # 'a' occurs twice and 'b' twice (`b` and `B`);
        "indivisibility" -> 1  # 'i' occurs six times;
        "Indivisibilities" -> 2  # 'i' occurs seven times and 's' occurs twice;
        "aA11" -> 2  # 'a' and '1';
        "ABBA" -> 2  # 'A' and 'B' each occur twice;
---------------------------------------------------> */

public class K10_CountingDuplicates_UPGRADED {

    public static void main(String[] args) {

        String test1 = "abcdeaa";
        String test2 = "aabcdeca";
        String test3 = "inBdivisibility";
        String test4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix";

        System.out.println(duplicateCount(test1));
        System.out.println(duplicateCount(test2));
        System.out.println(duplicateCount(test3));
        System.out.println(duplicateCount(test4));

        System.out.println(duplicateCountUpgrade(test1));
        System.out.println(duplicateCountUpgrade(test2));
        System.out.println(duplicateCountUpgrade(test3));
        System.out.println(duplicateCountUpgrade(test4));

        System.out.println(duplicateCountUpgrade2(test1));
        System.out.println(duplicateCountUpgrade2(test2));
        System.out.println(duplicateCountUpgrade2(test3));
        System.out.println(duplicateCountUpgrade2(test4));
    }

    public static int duplicateCount(String text) {

        char[] x = text.toLowerCase().toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (Character i : x){
            list.add(i);
            list2.add(i);
        }
        int count = 0;
        for (Character i : list){
            list2.remove(i);
            if (list2.contains(i)){
                count ++;
                list2.removeAll(Collections.singleton(i));
            }
        }
        return count;
    }

    public static int duplicateCountUpgrade(String text) {

        int ans = 0;
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }

    public static int duplicateCountUpgrade2(String text) {

        int[] array = new int[26];
        for (char x : text.toLowerCase().toCharArray()) array[x - 97] += 1;
        return (int) Arrays.stream(array).filter(x -> x > 1).count();
    }
}
