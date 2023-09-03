package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/* <------------------------------------------------
    DESCRIPTION:

    You are given three integer inputs: length, minimum, and maximum.

    Return a string that:
        Starts at minimum
        Ascends one at a time until reaching the maximum, then
        Descends one at a time until reaching the minimum
        repeat until the string is the appropriate length

    Examples:
        length: 5, minimum: 1, maximum: 3   ==>  "12321"
        length: 14, minimum: 0, maximum: 2  ==>  "01210121012101"
        length: 11, minimum: 5, maximum: 9  ==>  "56789876567"

    Notes:
        length will always be non-negative
        negative numbers can appear for minimum and maximum values
        hyphens/dashes ("-") for negative numbers do count towards the length
        the resulting string must be truncated to the exact length provided
        return an empty string if maximum < minimum or length == 0
        minimum and maximum can equal one another and result in a single number repeated for the length of the string
---------------------------------------------------> */

public class K67_AscendDescendRepeat_UPGRADED {

    public static void main(String[] args) {

        System.out.println(ascendDescend(14, 0, 2)); // 01210121012101
        System.out.println(ascendDescend(25, -9, -3)); // -9-8-7-6-5-4-3-4-5-6-7-8-

        System.out.println(ascendDescendUpgrade(14, 0, 2)); // 01210121012101
        System.out.println(ascendDescendUpgrade(25, -9, -3)); // -9-8-7-6-5-4-3-4-5-6-7-8-
    }

    public static String ascendDescend(int length, int minimum, int maximum) {

        if (minimum > maximum) return "";
        if (minimum == maximum) return String.valueOf(minimum).repeat(length);

        StringBuilder result = new StringBuilder();

        while (result.length() < length) {
            for (int i = minimum; i < maximum; i++) {
                if (result.length() < length) result.append(i);
            }
            for (int j = maximum; j > minimum; j--) {
                if (result.length() < length) result.append(j);
            }
        }
        return new String(Arrays.copyOf(result.toString().toCharArray(), length));
    }

    public static String ascendDescendUpgrade(int length, int minimum, int maximum) {

        if (minimum > maximum) return "";
        if (minimum == maximum) return String.valueOf(minimum).repeat(length);

        StringBuilder result = new StringBuilder();

        while (result.length() < length) {
            IntStream.rangeClosed(minimum, maximum).forEach(result::append);
            IntStream.rangeClosed(minimum + 1, maximum - 1).boxed().sorted(Comparator.reverseOrder()).forEach(result::append);
        }
        return result.substring(0, length);
    }
}
