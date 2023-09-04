package CodeWarsKatas5KYU;

import java.util.Map;
import java.util.TreeMap;

/* <------------------------------------------------
    DESCRIPTION:

    Given a positive number n > 1 find the prime factor decomposition of n.
    The result will be a string with the following form : "(p1**n1)(p2**n2)...(pk**nk)"
    with the p(i) in increasing order and n(i) empty if n(i) is 1.

    Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
---------------------------------------------------> */

public class K13_PrimesInNumbers {

    public static void main(String[] args) {

        int n = 7775460;
        System.out.println(getPrimes(n));
    }

    public static String getPrimes(int n) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 2; i <= n; i++) {
            int iPowerCount = 0;
            while (n > 1) {
                if (n % i == 0) {
                    n /= i;
                    iPowerCount++;
                }
                else break;
                map.put(i, iPowerCount);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            if (x.getValue() != 1) sb.append("(").append(x.getKey()).append("**").append(x.getValue()).append(")");
            else sb.append("(").append(x.getKey()).append(")");
        }

        return sb.toString();
    }
}
