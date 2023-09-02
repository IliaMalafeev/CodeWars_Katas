package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* <------------------------------------------------
    DESCRIPTION:

    Given two arrays of strings a1 and a2 return a sorted array r in lexicographical
    order of the strings of a1 which are substrings of strings of a2.

    Example 1:
        a1 = ["arp", "live", "strong"]
        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        returns ["arp", "live", "strong"]

    Example 2:
        a1 = ["tarp", "mice", "bull"]
        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        returns []

    Notes: Arrays are written in "general" notation.
---------------------------------------------------> */

public class K38_WhichAreIn {

    public static void main(String[] args) {

        String[] a1 = new String[] {"arp", "live", "strong"};
        String[] b1 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        String[] a2 = new String[] {"tarp", "mice", "bull"};
        String[] b2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        System.out.println(Arrays.toString(inArray(a1, b1)));
        System.out.println(Arrays.toString(inArray(a2, b2)));
    }

    public static String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> list = new ArrayList<>();
        for (String x : array1) {
            for (String y : array2) {
                if (y.contains(x) && !list.contains(x)) list.add(x);
            }
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}
