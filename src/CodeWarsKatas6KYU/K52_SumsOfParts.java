package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Let us consider this example (array written in general format): ls = [0, 1, 3, 6, 10]

    It's following parts:
        ls = [0, 1, 3, 6, 10]
        ls = [1, 3, 6, 10]
        ls = [3, 6, 10]
        ls = [6, 10]
        ls = [10]
        ls = []

    The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]

    The function parts_sums (or its variants in other languages) will take as parameter a list ls and
    return a list of the sums of its parts as defined above.

    Other Examples:
        ls = [1, 2, 3, 4, 5, 6], parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]

        ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358],
        parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]

    Note: Take a look at performance - some lists have thousands of elements.
---------------------------------------------------> */

public class K52_SumsOfParts {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumParts(new int[] {1, 2, 3, 4, 5})));
    }

    public static int[] sumParts(int[]array) {

        if (array.length == 0) return new int[] {0};

        int[] result = new int[array.length  +1];
        int sum = Arrays.stream(array).sum();
        result[0] = sum;
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
            result[i + 1] = sum;
        }

        return result;
    }
}
