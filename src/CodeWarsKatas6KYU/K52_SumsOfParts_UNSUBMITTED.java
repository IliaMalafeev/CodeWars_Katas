package CodeWarsKatas6KYU;

import java.util.Arrays;

public class K52_SumsOfParts_UNSUBMITTED {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[] {1, 2, 3, 4, 5,})));
    }

    public static int[] sumParts(int[]array) {
        if (array.length == 0) return new int[]{0};
        int[] result = new int[array.length  +1];
        int sum = Arrays.stream(array).sum();
        result[0] = sum;
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
            result[i + 1] = sum;
        }
        return result;
    }
}
