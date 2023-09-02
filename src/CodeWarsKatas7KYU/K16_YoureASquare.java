package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given an integral number, determine if it's a square number:
    In mathematics, a square number or perfect square is an integer
    that is the square of an integer; in other words, it is the product of some integer with itself.
    The tests will always use some integral number, so don't worry about that in dynamic typed languages.
---------------------------------------------------> */

public class K16_YoureASquare {

    public static void main(String[] args) {

        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) (Math.sqrt(n));
    }
}
