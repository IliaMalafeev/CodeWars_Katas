package CodeWarsKatas8KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Bob is bored during his physics lessons, so he's built himself a toy box to help pass the time.
    The box is special because it has the ability to change gravity.

    There are some columns of toy cubes in the box arranged in a line.
    The i-th column contains a_i cubes.
    At first, the gravity in the box is pulling the cubes downwards.
    When Bob switches the gravity, it begins to pull all the cubes
    to a certain side of the box, d, which can be either 'L' or 'R' (left or right).
    Below is an example of what a box of cubes might look like before and after switching gravity.

    +---+                                       +---+
    |   |                                       |   |
    +---+                                       +---+
    +---++---+     +---+    R         +---++---++---+
    |   ||   |     |   |   -->        |   ||   ||   |
    +---++---+     +---+              +---++---++---+
    +---++---++---++---+         +---++---++---++---+
    |   ||   ||   ||   |         |   ||   ||   ||   |
    +---++---++---++---+         +---++---++---++---+

    Given the initial configuration of the cubes in the box, find out
    how many cubes are in each of the n columns after Bob switches the gravity.
---------------------------------------------------> */

public class K01_GravityFlip {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flip('R', new int[]{ 3,2,1,2 })));
        System.out.println(Arrays.toString(flip('L', new int[]{ 1,4,5,3,5 })));
    }

    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);

        if (dir == 'L') {
            List<Integer> list = new ArrayList<>();
            for (Integer i : arr) list.add(i);
            Collections.reverse(list);
            for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
        }

        return arr;
    }
}
