package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that accepts an integer n and a string s as parameters,
    and returns a string of s repeated exactly n times.
---------------------------------------------------> */

public class K19_StringRepeat {

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(0, "kata"));
    }

    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
