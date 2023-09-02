package CodeWarsKatas6KYU;

import java.util.Arrays;

public class K61_TortoiseRacing {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(720, 850, 70)));    // 0    32  18
        System.out.println(Arrays.toString(race(80, 91, 37)));      // 3    21  49
        System.out.println(Arrays.toString(race(80, 100, 40)));      // 2    0   0
    }

    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int seconds = 3600 * g / (v2 - v1);
        int[] result = {seconds / 3600, seconds / 60 % 60, seconds % 60};
        return result;
    }
}
