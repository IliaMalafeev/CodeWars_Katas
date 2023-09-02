package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given two integers a and b, which can be positive or negative,
    find the sum of all the integers between and including them and return it.
    If the two numbers are equal return a or b.
    Note: a and b are not ordered!
---------------------------------------------------> */

import java.util.stream.IntStream;

public class K18_BeginnerSeries3SumOfNumbers_UPGRADED {

    public static void main(String[] args) {

        System.out.println(GetSum(6, -5));
        System.out.println(GetSum(6, 6));
        System.out.println(GetSum(-6, -5));
        System.out.println(GetSum(16, 6));

        System.out.println(GetSumUpgraded(6, -5));
        System.out.println(GetSumUpgraded(6, 6));
        System.out.println(GetSumUpgraded(-6, -5));
        System.out.println(GetSumUpgraded(16, 6));
    }

    public static int GetSum(int a, int b) {

        int x = Math.min(a, b);
        int y = Math.max(a, b);
        int result = 0;
        while (x != y + 1){
            result += x;
            x++;
        }
        return result;
    }

    public static int GetSumUpgraded(int a, int b) {

        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
