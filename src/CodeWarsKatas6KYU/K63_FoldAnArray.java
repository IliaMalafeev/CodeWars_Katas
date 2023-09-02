package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K63_FoldAnArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5, 99, 88, 78, 74, 73}, 130)));
        System.out.println(Arrays.toString(foldArray(new int[]{2}, 1)));
        System.out.println(Arrays.toString(foldArray(new int[]{68, 159, 164, -188, 22, 183, -30, 14, 66, -74, 193, 149, 134,
                -92, 165, -12, -115, 92, 157, 94, -24, -193, 129, 107, 84, 37, 150, 192, -143, 55, 145, 197, 195, 28, 54,
                -52, -46, -76, -146, 132, -32, 92, -54, -4, 38, -175, 48, -132, 152, -133, 154, -32, 178, 0, 0, 136, -81,
                -51, 162, 10, 4, -20, -51, 184, 198, 153, 18, -30, -143, -77, 81, -148, -122, -199, 43, 7, -4, 153, -172,
                178, -79, 39, -107, 69, -195, 194, 200, 18, 133, -80, 178, 150, 158, -156, -1, -133, -135, 40, -109, 197,
                -128, 166, 12, 179, -34, 75, -162, 189, 37, -48, -154, -37, -132, 192, -61, -171, 139, 130}, 7)));
    }

    public static int[] foldArray(int[] array, int runs) {

        if (array.length == 1) return array;

        int[] result = Arrays.copyOf(array, array.length);
        for (int j = 0; j < runs; j ++) {
            int newResultLength = result.length % 2 == 0 ? result.length / 2 : result.length / 2 + 1;
            if (newResultLength == 1) return new int[]{result[0] + result[1]};
            int[] currentResult = new int[newResultLength];
            for (int i = 0; i < result.length / 2; i++) {
                currentResult[i] = result[i] + result[result.length - i - 1];
            }
            if (result.length % 2 == 1) currentResult[newResultLength - 1] = result[newResultLength - 1];
            result = currentResult;
        }
        return result;
    }
}
