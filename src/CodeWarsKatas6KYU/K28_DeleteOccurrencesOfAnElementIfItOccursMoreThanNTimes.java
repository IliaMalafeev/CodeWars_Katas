package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* <------------------------------------------------
    DESCRIPTION:

    Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
    For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2],
    drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
    With list [20,37,20,21] and number 1, the result would be [20,37,21].
---------------------------------------------------> */

public class K28_DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(deleteNth( new int[] {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3 )));
        // { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 }
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if (maxOccurrences == 1) {
            return Arrays.stream(elements).distinct().toArray();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : elements) list.add(x);
        int count = 0;
        for (int x : elements) {
            Iterator<Integer> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next() == x) {
                    count++;
                    if (count > maxOccurrences) listIterator.remove();
                }
            }
            count = 0;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}
