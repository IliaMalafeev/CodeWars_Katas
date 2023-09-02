package CodeWarsKatas6KYU;

import java.util.Arrays;

public class K67_AscendDescendRepeat {
    public static void main(String[] args) {
        System.out.println(ascendDescend(14, 0, 2)); // 01210121012101
        System.out.println(ascendDescend(25, -9, -3)); // -9-8-7-6-5-4-3-4-5-6-7-8-
    }

    public static String ascendDescend(int length, int minimum, int maximum) {
        String result = "";
        if (minimum > maximum) return "";
        if (minimum == maximum) {
            for (int i = 0; i < length; i++) result += minimum;
            return result;
        }
        while (result.length() < length) {
            for (int i = minimum; i < maximum; i++) {
                if (result.length() < length) result += i;
            }
            for (int j = maximum; j > minimum; j--) {
                if (result.length() < length) result += j;
            }
        }
        return new String(Arrays.copyOf(result.toCharArray(), length));
    }
}
