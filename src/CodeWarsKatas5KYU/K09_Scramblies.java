package CodeWarsKatas5KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the function scramble(str1, str2) that returns true if a portion
    of str1 characters can be rearranged to match str2, otherwise returns false.

    Notes:
        Only lower case letters will be used (a-z). No punctuation or digits will be included.
        Performance needs to be considered.

    Examples:
        scramble('rkqodlw', 'world') ==> True
        scramble('cedewaraaossoqqyt', 'codewars') ==> True
        scramble('katas', 'steak') ==> False
---------------------------------------------------> */

public class K09_Scramblies {

    public static void main(String[] args) {

        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("katas","steak"));
        System.out.println(scramble("scriptjavx","javascript"));

    }

    public static boolean scramble(String str1, String str2) {

        List<String> list = new ArrayList<>(Arrays.stream(str1.split("")).toList());
        for (String y : str2.split("")){
            if (!list.contains(y)) return false;
            else list.remove(y);
        }
        return true;
    }
}
