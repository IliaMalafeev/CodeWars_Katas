package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour.
    Young B knows she runs faster than A, and furthermore has not finished her cabbage.
    When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour.
    How long will it take B to catch A?
    More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0)
    and a lead g (integer > 0) how long will it take B to catch A?

    The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds
    (round down to the nearest second) or a string in some languages.

    If v1 >= v2 then return null.

    Examples:
        race(720, 850, 70) => [0, 32, 18] or "0 32 18"
        race(80, 91, 37)   => [3, 21, 49] or "3 21 49"

    Note:
        The returned string is not permitted to contain any redundant trailing
        whitespace: you can use dynamically allocated character strings.
---------------------------------------------------> */

public class K61_TortoiseRacing {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(race(720, 850, 70)));    // 0    32  18
        System.out.println(Arrays.toString(race(80, 91, 37)));      // 3    21  49
        System.out.println(Arrays.toString(race(80, 100, 40)));      // 2    0   0
    }

    public static int[] race(int v1, int v2, int g) {

        if (v1 >= v2) return null;
        int seconds = 3600 * g / (v2 - v1);
        return new int[]{seconds / 3600, seconds / 60 % 60, seconds % 60};
    }
}
