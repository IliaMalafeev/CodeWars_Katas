package CodeWarsKatas7KYU;

/* <------------------------------------------------------------------------
    DESCRIPTION:

    This time no story, no theory. The examples below show you how to write function accum:

    Examples:
        accum("abcd")       --->    "A-Bb-Ccc-Dddd"
        accum("RqaEzty")    --->    "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt")       --->    "C-Ww-Aaa-Tttt"

    The parameter of accum is a string which includes only letters from a..z and A..Z.
---------------------------------------------------------------------------> */

public class K10_Mumbling_UPGRADED {

    public static void main(String[] args) {

        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));

        System.out.println(accumUpgraded("ZpglnRxqenU"));
        System.out.println(accumUpgraded("NyffsGeyylB"));
    }

    public static String accum(String s) {

        String str = s.toLowerCase();
        char[] x = str.toCharArray();
        String result = "";
        int k = 0;
        for (char i : x) {
            for (int j = 0; j <= k; j++) {
                result = result + i;
            }
            result += "-";
            k++;
        }
        char[] y = result.toCharArray();
        for (int i = 0; i < y.length; i++){
            if (i == 0 || y[i - 1] == '-') y[i] = Character.toUpperCase(y[i]);
        }
        return new String(y).substring(0, y.length - 1);
    }

    public static String accumUpgraded(String s) {

        char[] x = s.toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length; i++) {
            result.append(x[i]).append(String.valueOf(Character.toLowerCase(x[i])).repeat(i)).append("-");
        }

        return result.substring(0, result.length() - 1);
    }
}
