package CodeWarsKatas8KYU;

import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Given an array of integers as strings and numbers,
    return the sum of the array values as if all were numbers.
    Return your answer as a number.
---------------------------------------------------> */

public class K37_SumMixedArray_UPGRADED {

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(sumUpgraded(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    public static int sum(List<?> mixed) {
        int result = 0;
        for (Object o : mixed){
            result = result + Integer.parseInt(String.valueOf(o));
        }
        return result;
    }

    public static int sumUpgraded(List<?> mixed) {
        return mixed.stream().mapToInt(x -> Integer.parseInt(x.toString())).sum();
    }
}
