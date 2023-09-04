package CodeWarsKatas5KYU;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.LongStream;

/* <------------------------------------------------
    DESCRIPTION:

    The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1.
    From 3 to 5 the gap is 2. From 7 to 11 it is 4.
    Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43

    A prime gap of length n is a run of n-1 consecutive composite numbers between
    two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).

    We will write a function gap with parameters:

        g (integer >= 2) which indicates the gap we are looking for
        m (integer > 2) which gives the start of the search (m inclusive)
        n (integer >= m) which gives the end of the search (n inclusive)

    In the example above gap(2, 3, 50) will return [3, 5], which is the first pair between 3 and 50 with a 2-gap.
    So this function should return the first pair of two prime numbers spaced with a gap of g
    between the limits m, n if these numbers exist otherwise null.

    Examples:

        gap(2, 5, 7) --> [5, 7]
        gap(2, 5, 5) --> null.
        gap(4, 130, 200) --> [163, 167]
            ([193, 197] is also such a 4-gap primes between 130 and 200, but it's not the first pair)

        gap(6,100,110) --> null
            (between 100 and 110 we have 101, 103, 107, 109 but 101-107 is not a 6-gap
            because there is 103 in between and 103-109 is not a 6-gap because there is 107in between)
---------------------------------------------------> */

public class K15_GapInPrimes_UPGRADED {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(gap(2,5,7)));
        System.out.println(Arrays.toString(gap(4,130,200)));
        System.out.println(Arrays.toString(gap(2,100,110)));
        System.out.println(Arrays.toString(gap(6,100,110)));

        System.out.println(Arrays.toString(gapUpgrade(2,5,7)));
        System.out.println(Arrays.toString(gapUpgrade(4,130,200)));
        System.out.println(Arrays.toString(gapUpgrade(2,100,110)));
        System.out.println(Arrays.toString(gapUpgrade(6,100,110)));
    }

    public static long[] gap(int g, long m, long n) {

        List<Long> list = new ArrayList<>((int) (n - m) + 1);
        for (long i = m; i <= n; i++) {
            list.add(i);
        }

        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            BigInteger x = BigInteger.valueOf(it.next());
            if (!x.isProbablePrime(100)) it.remove();
        }

        long[] result = new long[2];
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == g) {
                result[0] = list.get(i);
                result[1] = list.get(i + 1);
                break;
            }
        }

        if (result[0] == 0 && result[1] == 0) return null;
        return result;
    }

    public static long[] gapUpgrade(int g, long m, long n) {

        List<Long> primes = LongStream.rangeClosed(m, n)
                .filter(x -> BigInteger.valueOf(x).isProbablePrime(100))
                .boxed().toList();

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == g) {
                return new long[] {primes.get(i), primes.get(i + 1)};
            }
        }

        return null;
    }
}
