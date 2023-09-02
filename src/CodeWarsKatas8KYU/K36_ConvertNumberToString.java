package CodeWarsKatas8KYU;

/* <-------------------------------------------------------------------------
    DESCRIPTION:

    We need a function that can transform a number (integer) into a string.
----------------------------------------------------------------------------> */

public class K36_ConvertNumberToString {

    public static void main(String[] args) {
        System.out.println(numberToString(123));
        System.out.println(numberToString(-100));
//        System.out.println(numberToString(-100) instanceof String);
    }

    public static String numberToString(int num) {
        return ""+num;
    }
}
