package CodeWarsKatas5KYU;

import java.math.BigInteger;

/* <------------------------------------------------
    DESCRIPTION:

    Your job is to write a function which increments a string, to create a new string.
    If the string already ends with a number, the number should be incremented by 1.
    If the string does not end with a number. the number 1 should be appended to the new string.

    Examples:
        foo -> foo1
        foobar23 -> foobar24
        foo0042 -> foo0043
        foo9 -> foo10
        foo099 -> foo100

    Attention: If the number has leading zeros the amount of digits should be considered.
---------------------------------------------------> */

public class K08_StringIncrementer {

    public static void main(String[] args) {

        System.out.println(incrementString("foo"));
        System.out.println(incrementString("7957900015536898731141109007"));
        System.out.println(incrementString("99999999999999999999999999999999"));
        System.out.println(incrementString("He55llo9999"));
        System.out.println(incrementString(""));
    }

    public static String incrementString(String str) {

        if (str.isEmpty()) return "1";

        String beginning = str.replaceAll("\\d+$", "");
        String ending = str.substring(beginning.length());

        if (ending.isEmpty()) return beginning + "1";

        BigInteger bi = new BigInteger(ending);
        bi = bi.add(BigInteger.valueOf(1));

        StringBuilder incrementedEnding = new StringBuilder(String.valueOf(bi));
        while (incrementedEnding.length() < ending.length()) {
            incrementedEnding.insert(0, "0").append(incrementedEnding);
        }

        return beginning + incrementedEnding;
    }
}
