package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    "A divisibility rule is a shorthand way of determining whether a given integer is divisible
    by a fixed divisor without performing the division, usually by examining its digits."

    When you divide the successive powers of 10 by 13 you get the following remainders of the integer divisions:

        1, 10, 9, 12, 3, 4 because:

            10 ^ 0 ->  1 (mod 13)
            10 ^ 1 -> 10 (mod 13)
            10 ^ 2 ->  9 (mod 13)
            10 ^ 3 -> 12 (mod 13)
            10 ^ 4 ->  3 (mod 13)
            10 ^ 5 ->  4 (mod 13)

    Then the whole pattern repeats. Hence the following method:

        Multiply

            the right most digit of the number with the left most number in the sequence shown above,
            the second right most digit with the second left most digit of the number in the sequence.

        The cycle goes on and you sum all these products.
        Repeat this process until the sequence of sums is stationary.

    Example:

        What is the remainder when 1234567 is divided by 13?

            7      6     5      4     3     2     1  (digits of 1234567 from the right)
            ×      ×     ×      ×     ×     ×     ×  (multiplication)
            1     10     9     12     3     4     1  (the repeating sequence)

        Therefore following the method we get: 7×1 + 6×10 + 5×9 + 4×12 + 3×3 + 2×4 + 1×1 = 178
        We repeat the process with the number 178: 8x1 + 7x10 + 1x9 = 87
        And again with 87: 7x1 + 8x10 = 87
        From now on the sequence is stationary (we always get 87) and the remainder
        of 1234567 by 13 is the same as the remainder of 87 by 13 ( i.e 9).

    Task:

        Call thirt the function which processes this sequence of operations on an integer n (>=0).
        thirt will return the stationary number.
        thirt(1234567) calculates 178, then 87, then 87 and returns 87.
        thirt(321) calculates 48, 48 and returns 48
---------------------------------------------------> */

public class K60_ARuleOfDivisibilityBy13 {

    public static void main(String[] args) {

        System.out.println(thirt(1234567)); // 87
        System.out.println(thirt(987654321)); // 30
        System.out.println(thirt(1111111111)); // 71
        System.out.println(thirt(5634)); // 57
    }

    public static long thirt(long n) {

        long sum = findSum(n);
        while (sum != findSum(sum)) {
            sum = findSum(sum);
        }
        return sum;
    }

    public static long findSum(long n) {

        String number = String.valueOf(n);
        int digitCount = number.length();
        long sum = 0;
        for (int i = 0; i < digitCount; i++) {
            int x = (int) (Math.pow(10, i) % 13);
            int j = digitCount - 1 - i;
            sum += (long) Integer.parseInt(String.valueOf(number.charAt(j))) * x;
        }
        return sum;
    }
}
