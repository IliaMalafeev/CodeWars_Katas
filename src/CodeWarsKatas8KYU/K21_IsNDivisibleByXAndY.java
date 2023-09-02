package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Create a function that checks if a number n is divisible by two numbers x AND y.
    All inputs are positive, non-zero numbers.
---------------------------------------------------> */

public class K21_IsNDivisibleByXAndY {

    public static void main(String[] args) {
        System.out.println(isDivisible(12,4,3));
        System.out.println(isDivisible(8,3,4));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
