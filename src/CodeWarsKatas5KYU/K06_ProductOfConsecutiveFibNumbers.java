package CodeWarsKatas5KYU;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K06_ProductOfConsecutiveFibNumbers {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productFib(800)));
        System.out.println(Arrays.toString(productFib(4895)));
        System.out.println(Arrays.toString(productFib(5895)));
    }

    public static long[] productFib(long prod) {

        List<long[]> list = Stream.iterate(new long[]{0, 1}, x -> new long[]{x[1], x[0] + x[1]}).filter(x -> (x[0] * x[1]) >= prod).limit(1).toList();
        long x = list.get(0)[0], y = list.get(0)[1];
        long[] result = new long[]{x, y, x * y == prod ? 1 : 0};
        return result;
    }
}

