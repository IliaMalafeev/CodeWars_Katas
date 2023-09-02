package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given an array of integers your solution should find the smallest integer.
    You can assume, for the purpose of this kata, that the supplied array will not be empty.
---------------------------------------------------> */

import java.util.Arrays;

public class K08_FindTheSmallestIntegerInTheArray_UPGRADED {

    public static void main(String[] args) {

        System.out.println(findSmallestInt(new int[]{78,56,232,12,8}));
        System.out.println(findSmallestInt(new int[]{-133,-5666,-89,-12341,-321423, Integer.MAX_VALUE}));
        System.out.println(findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));

        System.out.println(findSmallestIntUpgraded(new int[]{78,56,232,12,8}));
        System.out.println(findSmallestIntUpgraded(new int[]{-133,-5666,-89,-12341,-321423, Integer.MAX_VALUE}));
        System.out.println(findSmallestIntUpgraded(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));
    }

    public static int findSmallestInt(int[] args) {

        int min = Integer.MAX_VALUE;
        for (int i : args) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int findSmallestIntUpgraded(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}
