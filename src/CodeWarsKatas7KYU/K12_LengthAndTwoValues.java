package CodeWarsKatas7KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Given an integer n and two other values, build
    an array of size n filled with these two values alternating.
---------------------------------------------------> */

public class K12_LengthAndTwoValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(alternate(5, "true", "false")));
        System.out.println(Arrays.toString(alternate(20, "blue", "red")));
    }

    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) result[i] = firstValue;
            else result[i] = secondValue;
        }
        return result;
    }
}
