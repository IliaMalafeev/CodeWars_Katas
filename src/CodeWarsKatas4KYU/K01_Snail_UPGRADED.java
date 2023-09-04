package CodeWarsKatas4KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    Given an n x n array, return the array elements arranged from
    outermost elements to the middle element, traveling clockwise.

        array = [[1,2,3],       snail(array) #=> [1,2,3,6,9,8,7,4,5]
                 [4,5,6],
                 [7,8,9]]

    For better understanding, please follow the numbers of the next array consecutively:

        array = [[1,2,3],       snail(array) #=> [1,2,3,4,5,6,7,8,9]
                 [8,9,4],
                 [7,6,5]]

    NOTE: The idea is not sort the elements from the lowest value to the highest;
    the idea is to traverse the 2-d array in a clockwise snailShell pattern.

    NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
---------------------------------------------------> */

public class K01_Snail_UPGRADED {

    public static void main(String[] args) {

        int [][] array = {
                {4, 2, 6, 8, 5},
                {7, 1, 3, 9, 2},
                {9, 6, 1, 5, 3},
                {2, 8, 7, 4, 1},
                {3, 4, 5, 2, 8}};

        System.out.println(Arrays.toString(snailTheArray(array)));
        System.out.println(Arrays.toString(snailUpgrade(array)));

        int [][] array2 = {
                {6, 7, 2, 1, 9, 5, 3, 4},
                {1, 9, 8, 3, 4, 2, 5, 6},
                {8, 5, 9, 7, 6, 1, 4, 2},
                {4, 2, 6, 8, 5, 3, 7, 9},
                {7, 1, 3, 9, 2, 4, 8, 5},
                {9, 6, 1, 5, 3, 7, 2, 8},
                {2, 8, 7, 4, 1, 9, 6, 3},
                {3, 4, 5, 2, 8, 6, 1, 7}};

        System.out.println(Arrays.toString(snailTheArray(array2)));
        System.out.println(Arrays.toString(snailUpgrade(array2)));

        int[][] array3 = new int[0][0];

        System.out.println(Arrays.toString(snailTheArray(array3)));
        System.out.println(Arrays.toString(snailUpgrade(array3)));
    }


//<----------------------- Upgraded solution ----------------------->

    public static int[] snailUpgrade(int[][] array) {

        if (array == null || array.length == 0 || array[0].length == 0) return new int[0];

        int length = array.length;
        int[] result = new int[length * length];
        int index = 0;
        for (int i = 0; i < length / 2; i++){
            for (int j = i; j < length - i; j++) result[index++] = array[i][j];
            for (int j = i + 1; j < length - i; j++) result[index++] = array[j][length-i-1];
            for (int j = i + 1; j < length - i; j++) result[index++] = array[length-i-1][length-j-1];
            for (int j = i + 1; j < length - i - 1; j++) result[index++] = array[length-j-1][i];
        }
        if (length % 2 != 0) result[index] = array[length/2][length/2];
        return result;
    }


//<----------------------- Old solution ----------------------->

    public static int[] snailTheArray(int[][] array) {

        if (array == null) return new int[0];
        List<Integer> list = new ArrayList<>(array.length * array.length);
        int numberOfSteps = array.length % 2 == 0 ? array.length * 2 : array.length * 2 - 1;

        for (int x = 0; x < numberOfSteps; x++) {
            if (x > 0 && x % 4 == 0) array = cropTheArray(array);
            if (array.length == 1) {
                list.add(array[0][0]);
                break;
            }
            for (int i = 0; i < array[0].length - 1; i++) list.add(array[0][i]);
            array = turnArrayCounterClockwise(array);
        }

        return list.stream().mapToInt(x -> x).toArray();
    }

    public static int[][] cropTheArray (int[][] array) {

        int [][] croppedArray = new int[array.length - 2][array[0].length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[0].length - 1 - 1 >= 0) {
                System.arraycopy(array[i], 1, croppedArray[i - 1], 0, array[0].length - 1 - 1);
            }
        }
        return croppedArray;
    }

    public static int[][] turnArrayCounterClockwise (int[][] array) {

        int [][] turnedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = array[0].length - 1; j >= 0; j--){
                turnedArray[array.length - 1 - i][j] = array[j][i];
            }
        }
        return turnedArray;
    }
}