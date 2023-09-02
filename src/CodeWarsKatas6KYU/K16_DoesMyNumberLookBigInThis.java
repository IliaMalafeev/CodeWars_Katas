package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
    each raised to the power of the number of digits in a given base.
    In this Kata, we will restrict ourselves to decimal (base 10).

    For example, take 153 (3 digits), which is narcissistic:
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

    and 1652 (4 digits), which isn't:
    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

    Your code must return true or false (not 'true' and 'false') depending upon whether
    the given number is a Narcissistic number in base 10.
    Error checking for text strings or other invalid inputs is not required,
    only valid positive non-zero integers will be passed into the function.
---------------------------------------------------> */

public class K16_DoesMyNumberLookBigInThis {

    public static void main(String[] args) {

        System.out.println(isNarcissistic(112));
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
    }

    public static boolean isNarcissistic(int number) {

        String numStr = String.valueOf(number);
        int count = numStr.length();
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += Math.pow(digit, count);
        }
        return sum == number;
    }
}
