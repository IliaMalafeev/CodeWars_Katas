package CodeWarsKatas5KYU;

import java.math.BigInteger;

/* <------------------------------------------------
    DESCRIPTION:

    Define a function that takes in two non-negative integers a and b and returns the last decimal digit of a^b.
    Note that a and b may be very large!

    For example, the last decimal digit of 9^7 is 9, since 9^7 = 4782969
    The last decimal digit of (2^200)^(2^300), which has over 10^92 decimal digits, is 6.
    Also, please take 0^0 to be 1. You may assume that the input will always be valid.

    Examples:
        lastDigit(new BigInteger("4"), new BigInteger("1")) // returns 4
        lastDigit(new BigInteger("4"), new BigInteger("2")) // returns 6
        lastDigit(new BigInteger("9"), new BigInteger("7")) // returns 9
        lastDigit(new BigInteger("10"), new BigInteger("10000000000")) // returns 0
---------------------------------------------------> */

public class K17_LastDigitOfALargeNumber {

    public static void main(String[] args) {

        System.out.println(lastDigit(new BigInteger("4"), new BigInteger("1")));
        System.out.println(lastDigit(new BigInteger("0"), new BigInteger("0")));
        System.out.println(lastDigit(new BigInteger("10"), new BigInteger("10000000000")));
        System.out.println(lastDigit(new BigInteger("12345"), new BigInteger("10000000000")));
    }

    public static int lastDigit(BigInteger n1, BigInteger n2) {

        int x = n2.remainder(BigInteger.valueOf(4)).intValue();
        switch (x) {
            case 1 -> {return n1.remainder(BigInteger.TEN).intValue();}
            case 2 -> {return n1.multiply(n1).remainder(BigInteger.TEN).intValue();}
            case 3 -> {return n1.multiply(n1).multiply(n1).remainder(BigInteger.TEN).intValue();}
            case 0 -> {
                if (n2.equals(BigInteger.ZERO)) return 1;
                int y = n1.remainder(BigInteger.TEN).intValue();
                if (y == 5) return 5;
                if (y == 0) return 0;
                if (y % 2 == 0) return 6;
                if (y % 2 == 1) return 1;
            }
        }
        return 0;
    }
}
