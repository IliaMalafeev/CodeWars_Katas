package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* <------------------------------------------------
    DESCRIPTION:

    You will be given an array of numbers. You have to sort the odd numbers in ascending
    order while leaving the even numbers at their original positions.

    Examples
        [7, 1]  =>  [1, 7]
        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
---------------------------------------------------> */

public class K24_SortTheOdd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
    }

    public static int[] sortArray(int[] array) {

        ArrayList<Integer> odds= new ArrayList<>();
        for (int x : array) {
            if (x % 2 == 1) odds.add(x);
        }
        Collections.sort(odds);
        for (int y = 0; y < array.length; y++) {
            if (array[y] % 2 == 1) {
                array[y] = odds.get(0);
                odds.remove(0);
            }
        }
        return array;
    }
}
