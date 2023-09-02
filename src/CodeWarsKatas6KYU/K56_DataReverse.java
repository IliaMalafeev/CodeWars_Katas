package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;

public class K56_DataReverse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DataReverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0})));
    }

    public static int[] DataReverse(int[] data) {
        ArrayList<Integer> list = new ArrayList<>(data.length);
        for (int i = data.length - 8; i >= 0; i -= 8) {
            for (int j = 0; j < 8; j++) {
                list.add(data[i + j]);
            }
        }
        int[] result = new int[data.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
