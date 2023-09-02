package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a program that finds the summation of every number from 1 to num.
    The number will always be a positive integer greater than 0.
---------------------------------------------------> */

import java.util.stream.IntStream;

public class K12_GrasshopperSummation_UPGRADED {

    public static void main(String[] args) {
        System.out.println(summation(8));
        System.out.println(summation(213));

        System.out.println(summationUpgraded(8));
        System.out.println(summationUpgraded(213));
    }

    public static int summation(int n) {

        int sum = n;
        for (int i = 0 ; i < n ; i++) sum += i;

        return sum;
    }

    public static int summationUpgraded(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }
}
