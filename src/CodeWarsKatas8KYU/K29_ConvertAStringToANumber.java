package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    We need a function that can transform a string into a number.
    What ways of achieving this do you know?
    All inputs will be strings, and every string is
    a perfectly valid representation of an integral number.
---------------------------------------------------> */

public class K29_ConvertAStringToANumber {

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("-7"));
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
