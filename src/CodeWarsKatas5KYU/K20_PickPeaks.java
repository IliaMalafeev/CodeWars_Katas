package CodeWarsKatas5KYU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* <------------------------------------------------
    DESCRIPTION:

   In this kata, you will write a function that returns the positions
   and the values of the "peaks" (or local maxima) of a numeric array.

    For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak
    at position 3 with a value of 5 (since arr[3] equals 5).

    The output will be returned as a Map<String,List> with two key-value pairs:"pos"and"peaks".
    If there is no peak in the given array, simply return {"pos" => [], "peaks" => []}.

    Example:
        pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]}

    All input arrays will be valid integer arrays (although it could
    still be empty), so you won't need to validate the input.

    The first and last elements of the array will not be considered as peaks
    (in the context of a mathematical function, we don't know what is after
    and before and therefore, we don't know if it is a peak or not).

    Also, beware of plateaus!!! [1, 2, 2, 2, 1] has a peak while
    [1, 2, 2, 2, 3] and [1, 2, 2, 2, 2] do not. In case of a plateau-peak,
    please only return the position and value of the beginning of the plateau.

    For example:
        pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]}

    Have fun!
---------------------------------------------------> */

public class K20_PickPeaks {

    public static void main(String[] args) {

        int[] test1 = {1, 2, 3, 6, 4, 1, 2, 3, 2, 1};
        int[] test2 = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};
        int[] test3 = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1};
        int[] test4 = {2, 1, 3, 1, 2, 2, 2, 2, 1};
        int[] test5 = {2, 1, 3, 1, 2, 2, 2, 2};
        int[] test6 = {1, 12, -1, 19, -1, 6, 4, 7, 2, 7, 13, 13, 9, 3, 15, 16, 11, 11, 9, 14, 18, 7, 13, 3, 15, 10, 11};
        int[] test7 = {};

        System.out.println(getPeaks(test1));    // should return {pos=[3, 7],       peaks=[6, 3]}
        System.out.println(getPeaks(test2));    // should return {pos=[3, 7],       peaks=[6, 3]}
        System.out.println(getPeaks(test3));    // should return {pos=[3, 7, 10],   peaks=[6, 3, 2]}
        System.out.println(getPeaks(test4));    // should return {pos=[2, 4],       peaks=[3, 2]}
        System.out.println(getPeaks(test5));    // should return {pos=[2],          peaks=[3]}
        System.out.println(getPeaks(test6));    // should return {pos=[1, 3, 5, 7, 10, 15, 20, 22, 24], peaks=[12, 19, 6, 7, 13, 16, 18, 13, 15]}
        System.out.println(getPeaks(test7));    // should return {pos=[], peaks=[]}
    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        if (arr.length == 0) return result;

        int nextPosToAdd = 0;
        int nextPeakToAdd = arr[0];

        boolean isGoingUp = false;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > nextPeakToAdd) {

                isGoingUp = true;
                nextPosToAdd = i;
                nextPeakToAdd = arr[i];
                continue;
            }

            if (arr[i] == nextPeakToAdd) continue;

            if (arr[i] < nextPeakToAdd) {

                if (isGoingUp) {

                    result.get("pos").add(nextPosToAdd);
                    result.get("peaks").add(nextPeakToAdd);

                    isGoingUp = false;
                }

                nextPosToAdd = i;
                nextPeakToAdd = arr[i];
            }
        }

        return result;
    }
}