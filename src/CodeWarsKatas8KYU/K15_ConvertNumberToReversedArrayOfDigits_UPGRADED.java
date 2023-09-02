package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a random non-negative number, you have to
    return the digits of this number within an array in reverse order.
---------------------------------------------------> */

import java.util.Arrays;

public class K15_ConvertNumberToReversedArrayOfDigits_UPGRADED {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitizeUpgraded(35231)));
    }

    public static int[] digitize(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++){
            result[i] = Integer.parseInt(String.valueOf(chars[chars.length - 1 - i]));
        }
        return result;
    }

    public static int[] digitizeUpgraded(long n) {
        String[] digits = String.valueOf(n).split("");
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++){
            result[i] = Integer.parseInt(digits[digits.length - 1 - i]);
        }
        return result;
    }
}
