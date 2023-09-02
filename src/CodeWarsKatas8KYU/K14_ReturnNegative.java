package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    In this simple assignment you are given a number and have to make it negative.
    But maybe the number is already negative?
---------------------------------------------------> */

public class K14_ReturnNegative {

    public static void main(String[] args) {
        System.out.println(makeNegative(43));
        System.out.println(makeNegative(-14));
    }

    public static int makeNegative(final int x) {
        return (x < 0) ? x : -x;
    }
}
