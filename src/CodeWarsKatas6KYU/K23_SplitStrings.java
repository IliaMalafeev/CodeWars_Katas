package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the solution so that it splits the string into pairs of two characters.
    If the string contains an odd number of characters then it should replace
    the missing second character of the final pair with an underscore ('_').

    Examples:
        'abc' =>  ['ab', 'c_']
        'abcdef' => ['ab', 'cd', 'ef']
---------------------------------------------------> */

public class K23_SplitStrings {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("Hello World")));
        System.out.println(Arrays.toString(solution("LovePizza")));
        System.out.println(Arrays.toString(solution("Love Pizza")));
    }

    public static String[] solution(String s) {

        if (s.length() % 2 != 0) s += "_";
        return s.replaceAll("(.{2})", "$1!").split("!");
    }
}
