package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You are going to be given an array of integers. Your job is to take that array and find an index N
    where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.

    Examples:

        for {1,2,3,4,3,2,1}         ---> 3, because the sum of left side ({1,2,3}) and the sum of right side ({3,2,1}) both equal 6.
        for {1,100,50,-51,1,1}      ---> 1, because the sum of left side ({1}) and the sum of right side ({50,-51,1,1}) both equal 1.
        for {20,10,-80,10,10,15,35} ---> 0, because the sum of left side {} and the sum of right side {10,-80,10,10,15,35} both equal 0.

    Note: Please remember that in most programming/scripting languages the index of an array starts at 0.

    Input: An integer array of length 0 < arr < 1000.
    The numbers in the array can be any integer positive or negative.

    Output: The lowest index N where the side to the left of N is equal to the side to the right of N.
    If you do not find an index that fits these rules, then you will return -1.

    Note: If you are given an array with multiple answers, return the lowest correct index.
---------------------------------------------------> */

import java.util.Arrays;

public class K20_EqualSidesOfAnArray_UPGRADED {

    public static void main(String[] args) {

        int[] test1 = new int[] {1,2,3,4,3,2,1};                            //3
        int[] test2 = new int[] {1,100,50,-51,1,1};                         //1
        int[] test3 = new int[] {20,10,-80,10,10,15,35};                    //0
        int[] test4 = new int[] {20,10,30,10,10,15,35};                     //3
        int[] test5 = new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};   //6
        int[] test6 = new int[] {-8505, -5130, 1926, -9026};                //-1

        System.out.println(findEvenIndex(test1)); // 3
        System.out.println(findEvenIndex(test2)); // 1
        System.out.println(findEvenIndex(test3)); // 0
        System.out.println(findEvenIndex(test4)); // 3
        System.out.println(findEvenIndex(test5)); // 6
        System.out.println(findEvenIndex(test6)); // -1

        System.out.println(findEvenIndexUpgraded(test1)); // 3
        System.out.println(findEvenIndexUpgraded(test2)); // 1
        System.out.println(findEvenIndexUpgraded(test3)); // 0
        System.out.println(findEvenIndexUpgraded(test4)); // 3
        System.out.println(findEvenIndexUpgraded(test5)); // 6
        System.out.println(findEvenIndexUpgraded(test6)); // -1
    }

    public static int findEvenIndex(int[] arr) {

        int leftSideSum = 0, rightSideSum = 0;

        for (int x : arr) rightSideSum += x;
        if (rightSideSum - arr[0] == 0) return 0;
        rightSideSum = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) leftSideSum += arr[j];
            for (int k = i + 1; k < arr.length; k++) rightSideSum += arr[k];
            if (rightSideSum == leftSideSum) return i;
            leftSideSum = 0;
            rightSideSum = 0;
        }
        return -1;
    }

    public static int findEvenIndexUpgraded(int[] arr) {

        int leftSideSum = 0;
        int rightSideSum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            leftSideSum += arr[i];
            rightSideSum -= arr[i];
            if (leftSideSum - arr[i] == rightSideSum) return i;
        }

        return -1;
    }
}
