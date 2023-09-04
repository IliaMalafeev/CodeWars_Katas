package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    In this example you have to validate if a user input string is alphanumeric.
    The given string is not nil/null/NULL/None, so you don't have to check that.

    The string has the following conditions to be alphanumeric:
        At least one character ("" is not valid)
        Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
        No whitespaces / underscore
---------------------------------------------------> */

public class K18_NotVerySecure {

    public static void main(String[] args) {

        System.out.println(alphanumeric("hel112lo"));
        System.out.println(alphanumeric("hel112 lo"));
        System.out.println(alphanumeric(""));
    }

    public static boolean alphanumeric(String s) {

        if (s.isEmpty()) return false;
        return s.replaceAll("\\W|_", "").length() == s.length();
    }
}
