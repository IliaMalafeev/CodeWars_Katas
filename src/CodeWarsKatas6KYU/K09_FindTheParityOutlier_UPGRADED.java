package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You are given an array (which will have a length of at least 3, but could be very large)
    containing integers. The array is either entirely composed of odd integers or
    entirely composed of even integers except for a single integer N.
    Write a method that takes the array as an argument and returns this "outlier" N.

    Examples:

        [2, 4, 0, 100, 4, 11, 2602, 36]
        Should return: 11 (the only odd number)

        [160, 3, 1719, 19, 11, 13, -21]
        Should return: 160 (the only even number)
---------------------------------------------------> */

import java.util.Arrays;

public class K09_FindTheParityOutlier_UPGRADED {

    public static void main(String[] args) {

        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {160, 3, 1719, 19, 11, 13, -21};
        int[] exampleTest5 = {160, 4, 1718, 16, 10, 12, -21};

        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));
        System.out.println(find(exampleTest4));
        System.out.println(find(exampleTest5));

        System.out.println(findUpgraded(exampleTest1));
        System.out.println(findUpgraded(exampleTest2));
        System.out.println(findUpgraded(exampleTest3));
        System.out.println(findUpgraded(exampleTest4));
        System.out.println(findUpgraded(exampleTest5));
    }

    static int find(int[] integers){

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < 3; i++){
            if (integers[i] % 2 == 0) countEven++;
            else countOdd++;
        }

        for (int i : integers){
            if (countEven > countOdd){
                if ( Math.abs(i % 2) == 1 ) return i;
            }
            else if (i % 2 == 0) return i;
        }

        return 0;
    }

    static int findUpgraded(int[] integers){

        int[] odds = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] evens = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

        return odds.length == 1 ? odds[0] : evens[0];
    }
}
