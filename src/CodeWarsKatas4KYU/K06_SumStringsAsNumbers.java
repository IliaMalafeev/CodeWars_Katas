package CodeWarsKatas4KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given the string representations of two integers,
    return the string representation of the sum of those integers.

    For example: sumStrings('1','2') // => '3'

    A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
    I have removed the use of BigInteger and BigDecimal in java.
---------------------------------------------------> */

public class K06_SumStringsAsNumbers {

    public static void main(String[] args) {

        System.out.println(sumStrings("999", "123456")); // 124455
        System.out.println(sumStrings("800", "9567")); // 10367
        System.out.println(sumStrings("000000103", "08567")); // 8670
    }

    public static String sumStrings(String a, String b) {

        StringBuilder aStringReversed = new StringBuilder(a).reverse();
        StringBuilder bStringReversed = new StringBuilder(b).reverse();
        if (a.length() > b.length()) bStringReversed.append("0".repeat(a.length() - b.length()));
        if (a.length() < b.length()) aStringReversed.append("0".repeat(b.length() - a.length()));

        String[] aDigits = aStringReversed.toString().split("");
        String[] bDigits = bStringReversed.toString().split("");

        StringBuilder result = new StringBuilder();
        int remainder = 0;
        for (int i = 0; i < aDigits.length; i++) {
            int sumOfDigits = Integer.parseInt(aDigits[i]) + Integer.parseInt(bDigits[i]);
            result.append((sumOfDigits + remainder) % 10);
            if (sumOfDigits + remainder >= 10) remainder = (sumOfDigits + remainder) / 10;
            else remainder = 0;
        }
        if (remainder != 0) result.append(remainder);

        return result.reverse().toString().replaceAll("^0+", "");
    }
}