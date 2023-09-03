package CodeWarsKatas5KYU;

import java.util.*;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K14_IntegersRecreationOne_UPGRADED {

    public static void main(String[] args) {

        System.out.println(listSquared(1, 250));
        System.out.println(listSquaredUPGRADED(1, 250));
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

    public static String listSquaredUPGRADED(long m, long n) {

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
