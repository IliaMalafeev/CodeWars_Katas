package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* <------------------------------------------------
    DESCRIPTION:

    Your goal in this kata is to implement a difference function,
    which subtracts one list from another and returns the result.
    It should remove all values from list "a", which are present in list "b" keeping their order.
    If a value is present in "b", all of its occurrences must be removed from the other:

    Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
    Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
---------------------------------------------------> */

public class K06_ArrayDiff {

    public static void main(String[] args) {

        int[] a = new int [] {1,2,3,3,2,4};
        int[] b = new int[] {2,3};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(b).boxed().collect(Collectors.toList());

        list.removeAll(list2);

        return list.stream().mapToInt(x -> x).toArray();
    }
}
