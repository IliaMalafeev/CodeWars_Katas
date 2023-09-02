package CodeWarsKatas8KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Given an array of integers,
    return a new array with each value doubled.
---------------------------------------------------> */

public class K31_BeginnerLostWithoutAMap_UPGRADED {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[] {})));
        System.out.println(Arrays.toString(map(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(map(new int[] {4, 1, 1, 1, 4})));
        System.out.println(Arrays.toString(map(new int[] {1, 1, 1, 1, 1, 1})));

        System.out.println(Arrays.toString(mapUpgraded(new int[] {})));
        System.out.println(Arrays.toString(mapUpgraded(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(mapUpgraded(new int[] {4, 1, 1, 1, 4})));
        System.out.println(Arrays.toString(mapUpgraded(new int[] {1, 1, 1, 1, 1, 1})));
    }

    public static int[] map(int[] arr) {
        for (int i=0; i<arr.length; i++) arr[i] = arr[i]*2;
        return arr;
    }

    public static int[] mapUpgraded(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }
}
