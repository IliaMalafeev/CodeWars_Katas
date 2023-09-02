package CodeWarsKatas7KYU;

import java.util.Arrays;
import java.util.Collections;

/* <------------------------------------------------
    DESCRIPTION:

    Your task is to make a function that can take any non-negative integer as
    an argument and return it with its digits in descending order.
    Essentially, rearrange the digits to create the highest possible number.
---------------------------------------------------> */

public class K15_DescendingOrder_UPGRADED {
    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
        System.out.println(sortDescUpgraded1(145263));
        System.out.println(sortDescUpgraded2(123456789));
    }

    public static int sortDesc(final int num) {

        String x = "" + num;
        char[] y = x.toCharArray();
        Arrays.sort(y);
        for (int i = 0; i < y.length / 2; i++) {
            char temp = y[i];
            y[i] = y[y.length - 1 - i];
            y[y.length - 1 - i] = temp;
        }
        String result = "";
        for (char j : y) result += String.valueOf(j);
        return Integer.parseInt(result);
    }

    public static int sortDescUpgraded1(final int num) {

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static int sortDescUpgraded2(final int num) {

        StringBuilder result = new StringBuilder();
        Arrays.stream(String.valueOf(num).split("")).sorted().forEach(result::append);
        return Integer.parseInt(result.reverse().toString());
    }
}