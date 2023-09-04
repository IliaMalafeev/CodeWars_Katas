package CodeWarsKatas5KYU;

import java.util.*;

/* <------------------------------------------------
    DESCRIPTION:

    1, 246, 2, 123, 3, 82, 6, 41 are the divisors of number 246.
    Squaring these divisors we get: 1, 60516, 4, 15129, 9, 6724, 36, 1681.
    The sum of these squares is 84100 which is 290 * 290.

    Task: Find all integers between m and n (m and n integers with 1 <= m <= n)
        such that the sum of their squared divisors is itself a square.
        We will return an array of subarrays or of tuples (in C an array of Pair) or a string.
        The subarrays (or tuples or Pairs) will have two elements: first the number the squared
        divisors of which is a square and then the sum of the squared divisors.

    Example:
        list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
        list_squared(42, 250) --> [[42, 2500], [246, 84100]]

    Note: the returned string is not permitted to contain any redundant trailing whitespace:
        you can use dynamically allocated character strings.
---------------------------------------------------> */

public class K14_IntegersRecreationOne_UPGRADED {

    public static void main(String[] args) {

        System.out.println(listSquared(1, 250));
        System.out.println(listSquared(30, 250));

        System.out.println(listSquaredUpgrade(1, 250));
        System.out.println(listSquaredUpgrade(30, 250));
    }

    public static String listSquared(long m, long n) {

        List<Long> list = new ArrayList<>((int)(n - m + 1));
        for (long i = m; i <= n; i++) list.add(i);

        HashMap<Long, Long> listOfResults = new HashMap<>();

        for(long i : list) {
            List<Long> listOfDelimiters = new ArrayList<>((int)Math.sqrt(i));
            for (long k = 1; k <= (i / k); k++) {
                if (i % k == 0) {
                    if ((i / k) != k){
                        listOfDelimiters.add(k);
                        listOfDelimiters.add(i / k);
                    } else {
                        listOfDelimiters.add(k);
                    }
                }
            }
            for (long j : listOfDelimiters) listOfDelimiters.set(listOfDelimiters.indexOf(j), j * j);
            long sum = 0;
            for (long j : listOfDelimiters) sum += j;
            long sumSqrt = (long) Math.sqrt(sum);
            if ((sumSqrt * sumSqrt) == sum) listOfResults.put(i, sum);
        }

        List<Long> list2 = new ArrayList<>(), list3 = new ArrayList<>();
        for (long i : listOfResults.keySet()) {
            list2.add(i);
            list3.add(listOfResults.get(i));
        }
        list2.sort(Comparator.comparingLong(x -> x));
        list3.sort(Comparator.comparingLong(x -> x));

        long [][] result = new long[listOfResults.size()][2];
        for (int i = 0; i < list2.size(); i++) {
                result[i][0] = list2.get(i);
                result[i][1] = list3.get(i);
        }

        return Arrays.deepToString(result);
    }

    public static String listSquaredUpgrade(long m, long n) {

        ArrayList<Long[]> list = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            long sum = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) sum += j * j;
            }
            if (Math.sqrt(sum) % 1 == 0) {
                list.add(new Long[]{i, sum});
            }
        }

        return Arrays.deepToString(list.toArray());
    }
}
