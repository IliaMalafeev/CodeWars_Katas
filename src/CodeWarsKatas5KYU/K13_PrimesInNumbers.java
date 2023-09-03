package CodeWarsKatas5KYU;

import java.util.Map;
import java.util.TreeMap;

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
            if (x.getValue() != 1) sb.append("(" + x.getKey() + "**" + x.getValue() + ")");
            else sb.append("(" + x.getKey() + ")");
        }

        return sb.toString();
    }
}
