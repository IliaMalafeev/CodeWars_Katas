package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the findNextSquare method that finds the next
    integral perfect square after the one passed as a parameter.
    Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
    If the parameter is itself not a perfect square then -1 should be returned.
    You may assume the parameter is non-negative.
---------------------------------------------------> */

public class K25_FindTheNextPerfectSquare_UPGRADED {

    public static void main(String[] args) {

        System.out.println(findNextSquare(144));
        System.out.println(findNextSquare(143));

        System.out.println(findNextSquareUpgraded(144));
        System.out.println(findNextSquareUpgraded(143));
    }

    public static long findNextSquare(long sq) {
        double x = Math.sqrt(sq);
        if (x % 1 != 0) return -1;
        double y = ++x;
        return (long) (y * y);
    }

    public static long findNextSquareUpgraded(long sq) {
        return (Math.sqrt(sq) % 1 != 0) ? -1 : (long) (Math.pow(Math.sqrt(sq) + 1, 2));
    }
}
