package CodeWarsKatas8KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    We need a function that can transform a string into a number.
    What ways of achieving this do you know?
    All inputs will be strings, and every string is
    a perfectly valid representation of an integral number.
---------------------------------------------------> */

public class K28_FindMaxAndMinValuesOfAList_UPGRADED {

    public static void main(String[] args) {
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(min(new int[]{42, 54, 65, 87, 0}));
        System.out.println(min(new int[]{-1, -2, -3, -4, -5, -10}));

        System.out.println(max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(max(new int[]{42, 54, 65, 87, 0}));
        System.out.println(max(new int[]{-1, -2, -3, -4, -5, -10}));

        System.out.println("----------------------------------------------------------");

        System.out.println(minUpgraded(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(minUpgraded(new int[]{42, 54, 65, 87, 0}));
        System.out.println(minUpgraded(new int[]{-1, -2, -3, -4, -5, -10}));

        System.out.println(maxUpgraded(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(maxUpgraded(new int[]{42, 54, 65, 87, 0}));
        System.out.println(maxUpgraded(new int[]{-1, -2, -3, -4, -5, -10}));
    }

    public static int min(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int max(int[] list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int minUpgraded(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int maxUpgraded(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
