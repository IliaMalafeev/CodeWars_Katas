package CodeWarsKatas5KYU;

import java.math.BigInteger;

public class K08_StringIncrementer {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(incrementString("7957900015536898731141109007"));
        System.out.println(incrementString("99999999999999999999999999999999"));
        System.out.println(incrementString("He55llo9999"));
        System.out.println(incrementString(""));
    }

    public static String incrementString(String str) {
        if (str.length() == 0) return "1";

        String beginning = str.replaceAll("\\d+$", "");
        String ending = str.substring(beginning.length());

        if (ending.length() == 0) ending = "0";

        BigInteger bi = new BigInteger(ending);
        bi = bi.add(BigInteger.valueOf(1));

        String incrementedEnding = String.valueOf(bi);
        while (incrementedEnding.length() < ending.length()) incrementedEnding = "0" + incrementedEnding;

        String result = beginning + incrementedEnding;
        return result;
    }
}
