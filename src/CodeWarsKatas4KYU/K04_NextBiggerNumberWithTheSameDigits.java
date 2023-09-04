package CodeWarsKatas4KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Create a function that takes a positive integer and
    returns the next bigger number that can be formed by rearranging its digits.

    For example:
        12 ==> 21
        513 ==> 531
        2017 ==> 2071

    If the digits can't be rearranged to form a bigger number, return -1:
        9 ==> -1
        111 ==> -1
        531 ==> -1
---------------------------------------------------> */

public class K04_NextBiggerNumberWithTheSameDigits {

    public static void main(String[] args) {

        System.out.println(nextBiggerNumber(20171));
        System.out.println(nextBiggerNumber(122222222));
        System.out.println(nextBiggerNumber(22));
        System.out.println(nextBiggerNumber(531));
        System.out.println(nextBiggerNumber(6));
        System.out.println(nextBiggerNumber(10990));
        System.out.println(nextBiggerNumber(1115062062));
    }

    public static long nextBiggerNumber(long x) {

        String number = String.valueOf(x);
        char[] digits = number.toCharArray();
        int index = 0;

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                index = i;
                break;
            }
        }

        if (index == 0) return -1;

        char breakingNumber = number.charAt(index - 1);
        char temp;
        String digitBeginning = number.substring(0, index - 1);
        String digitTail = number.substring(index);

        char[] array = digitTail.toCharArray();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (breakingNumber < array[i]) {
                temp = breakingNumber;
                breakingNumber = array[i];
                array[i] = temp;
                break;
            }
        }

        String result = digitBeginning + breakingNumber + new String(array);

        return Long.parseLong(result);
    }
}
