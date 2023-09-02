package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that takes an array of numbers (integers for the tests) and a target number.
    It should find two different items in the array that, when added together, give the target value.
    The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).

    For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

    The input will always be valid (numbers will be an array of length 2 or greater, and all the items will be numbers;
    target will always be the sum of two different items from that array).

    two_sum([1, 2, 3], 4) == {0, 2}
---------------------------------------------------> */

public class K41_TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1234, 5678, 9012}, 14690)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 2, 3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 1}, 4)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        List<Integer> list = Arrays.stream(numbers).boxed().toList();
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i),
                y = target - x;
            if (list.contains(y) && list.indexOf(y) != i) return new int[] {i, list.indexOf(y)};
        }
        return null;
    }
}
