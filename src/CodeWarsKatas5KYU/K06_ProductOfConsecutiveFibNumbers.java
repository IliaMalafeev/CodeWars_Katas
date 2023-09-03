package CodeWarsKatas5KYU;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* <------------------------------------------------
    DESCRIPTION:

    The Fibonacci numbers are the numbers in the following integer sequence (Fn):
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
    such as F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

    Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
    F(n) * F(n+1) = prod.

    Your function productFib takes an integer (prod) and returns an array:
    [F(n), F(n+1), 1] if F(n) * F(n+1) = prod.

    If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prod you will return
    [F(n), F(n+1), 0] F(n) being the smallest one such as F(n) * F(n+1) > prod.

    Some Examples:
        productFib(714) # should return [21, 34, 1], since F(8) = 21, F(9) = 34 and 714 = 21 * 34
        productFib(800) # should return (34, 55, 0), since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
---------------------------------------------------> */

public class K06_ProductOfConsecutiveFibNumbers {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productFib(800)));
        System.out.println(Arrays.toString(productFib(4895)));
        System.out.println(Arrays.toString(productFib(5895)));
    }

    public static long[] productFib(long prod) {

        List<long[]> list = Stream.iterate(new long[]{0, 1}, x -> new long[]{x[1], x[0] + x[1]})
                .filter(x -> (x[0] * x[1]) >= prod)
                .limit(1)
                .toList();

        long x = list.get(0)[0], y = list.get(0)[1];
        return new long[]{x, y, x * y == prod ? 1 : 0};
    }
}

