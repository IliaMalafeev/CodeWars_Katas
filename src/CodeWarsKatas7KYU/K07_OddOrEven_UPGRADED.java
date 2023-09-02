package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a list of integers, determine whether the sum of its elements is odd or even.
    Give your answer as a string matching "odd" or "even".
    If the input array is empty consider it as: [0] (array with a zero).
---------------------------------------------------> */

import java.util.Arrays;

public class K07_OddOrEven_UPGRADED {
    public static void main(String[] args) {

        System.out.println(oddOrEven(new int []{1, 2, 3, 4, 5}));
        System.out.println(oddOrEven(new int []{1, 2, 3, 4}));
        System.out.println(oddOrEven(new int []{}));

        System.out.println(oddOrEvenUpgraded(new int []{1, 2, 3, 4, 5}));
        System.out.println(oddOrEvenUpgraded(new int []{1, 2, 3, 4}));
        System.out.println(oddOrEvenUpgraded(new int []{}));
    }

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum % 2 == 0 ? "even" : "odd";
    }

    public static String oddOrEvenUpgraded(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
