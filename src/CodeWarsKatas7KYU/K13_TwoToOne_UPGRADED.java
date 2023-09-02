package CodeWarsKatas7KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/* <------------------------------------------------
    DESCRIPTION:

    Take 2 strings s1 and s2 including only letters from a to z.
    Return a new sorted string, the longest possible, containing
    distinct letters - each taken only once - coming from s1 or s2.
---------------------------------------------------> */

public class K13_TwoToOne_UPGRADED {

    public static void main(String[] args) {

        System.out.println(twoToOne("xyaabbbccccdefww", "xxxxyyyyabklmopq")); // "abcdefklmopqwxy"
        System.out.println(twoToOneUpgraded("xyaabbbccccdefww", "xxxxyyyyabklmopq")); // "abcdefklmopqwxy"
    }

    public static String twoToOne(String str1, String str2) {

        String sum = str1 + str2;
        String result = "";
        var list = new ArrayList<Character>();
        for (char i : sum.toCharArray()) {
            if (!list.contains(i)) list.add(i);
        }
        Collections.sort(list);
        for (char j : list) result += String.valueOf(j);
        return result;
    }

    public static String twoToOneUpgraded(String str1, String str2) {

        return Arrays.stream((str1 + str2).split("")).sorted().distinct().collect(Collectors.joining(""));
    }
}
