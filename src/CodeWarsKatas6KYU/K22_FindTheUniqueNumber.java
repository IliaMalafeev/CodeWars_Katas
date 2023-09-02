package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    There is an array with some numbers. All numbers are equal except for one.
    Try to find it!

    Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

    It’s guaranteed that array contains at least 3 numbers.
    The tests contain some very huge arrays, so think about performance.
---------------------------------------------------> */

public class K22_FindTheUniqueNumber {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {

        Arrays.sort(arr);
        if (arr[0] == arr[1]) return arr[arr.length - 1];
        else return arr[0];
    }
}
