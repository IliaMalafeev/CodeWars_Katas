package CodeWarsKatas5KYU;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class K15_GapInPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(2,100,110)));
        System.out.println(Arrays.toString(gap(6,100,110)));
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
}
