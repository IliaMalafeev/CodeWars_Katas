package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.

    Example: h = 0, m = 1, s = 1 ---> result = 61000
    Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59
---------------------------------------------------> */

public class K23_BeginnerSeries2Clock {

    public static void main(String[] args) {
        System.out.println(past(0, 0, 0));
        System.out.println(past(0, 0, 1));
        System.out.println(past(0, 1, 1));
        System.out.println(past(1, 1, 1));
        System.out.println(past(3, 23, 47));
    }

    public static int past(int h, int m, int s){
        return ((h * 60 * 60) + (m * 60) + s) * 1000;
    }
}
