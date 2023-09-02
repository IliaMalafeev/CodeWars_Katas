package CodeWarsKatas7KYU;

import java.util.Objects;

/* <------------------------------------------------
    DESCRIPTION:

    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.
---------------------------------------------------> */

public class K04_Isograms_UPGRADED {
    public static void main(String[] args) {

        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("Dermatoglyphics"));

        System.out.println(isIsogramUpgraded("moOse"));
        System.out.println(isIsogramUpgraded("Dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {

        String test = str.toLowerCase();
        char[] charArray = test.toCharArray();
        int count = 0;
        for (char x : charArray) {
            for (char c : charArray) {
                if (Objects.equals(x, c)) count++;
                if (count > 1) return false;
            }
            count = 0;
        }
        return true;
    }

    public static boolean isIsogramUpgraded(String str) {

        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
