package CodeWarsKatas8KYU;

import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function findNeedle() that takes an array full of junk but containing one "needle"
    After your function finds the needle it should return a message (as a string) that says:
    "found the needle at position " plus the index it found the needle.
---------------------------------------------------> */

public class K03_ANeedleInTheHaystack {

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1));
    }

    public static String findNeedle(Object[] haystack) {
        List<Object> list = Arrays.asList(haystack);
        return "found the needle at position " + list.indexOf("needle");
    }
}
