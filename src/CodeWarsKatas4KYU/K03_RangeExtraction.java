package CodeWarsKatas4KYU;

import java.util.ArrayList;

/* <------------------------------------------------
    DESCRIPTION:

    A format for expressing an ordered list of integers is to use a comma separated list of either individual
    integers or a range of integers denoted by the starting integer separated from the end integer in the range
    by a dash, '-'. The range includes all integers in the interval including both endpoints.
    It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
    Complete the solution so that it takes a list of integers in increasing order and
    returns a correctly formatted string in the range format.

    Example:
        Solution.rangeExtraction(
            new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}
        )
        # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
---------------------------------------------------> */

public class K03_RangeExtraction {

    public static void main(String[] args) {

        System.out.println(rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {

        var list = new ArrayList<Integer>();
        list.add(arr[0]);

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                list.add(arr[i]);
            } else if (list.size() >= 3) {
                sb.append(list.get(0)).append("-").append(list.get(list.size() - 1)).append(",");
                list.clear();
                list.add(arr[i]);
            } else {
                for (int j : list) sb.append(j).append(",");
                list.clear();
                list.add(arr[i]);
            }
        }

        if (list.size() >= 3) {
            sb.append(list.get(0)).append("-").append(list.get(list.size() - 1)).append(",");
        } else {
            for (int j : list) sb.append(j).append(",");
        }

        return sb.toString().replaceAll(",$", "");
    }
}
