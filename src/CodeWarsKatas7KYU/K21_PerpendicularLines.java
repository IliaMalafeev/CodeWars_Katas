package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You are given an input (n) which represents the amount of
    lines you are given, your job is to figure out what is the
    maximum amount of perpendicular bisectors you can make using these lines.

    Note:   A perpendicular bisector is one that forms a 90-degree angle
            n will always be greater than or equal to 0
---------------------------------------------------> */

public class K21_PerpendicularLines {

    public static void main(String[] args) {

        System.out.println(maxBisectors(0)); // 0
        System.out.println(maxBisectors(1)); // 0
        System.out.println(maxBisectors(2)); // 1
        System.out.println(maxBisectors(3)); // 2
        System.out.println(maxBisectors(4)); // 4
        System.out.println(maxBisectors(5)); // 6
        System.out.println(maxBisectors(6)); // 9
        System.out.println(maxBisectors(51)); // 650
        System.out.println(maxBisectors(46438)); // 539121961
    }

    public static int maxBisectors(int n) {

        long square = (long) n * n;
        return (n % 2 == 0) ? (int) (square / 4) : (int) ((square - 1) / 4);
    }
}
