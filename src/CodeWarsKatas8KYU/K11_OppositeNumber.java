package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Very simple, given an integer or a floating-point number, find its opposite.
---------------------------------------------------> */

public class K11_OppositeNumber {

    public static void main(String[] args) {
        System.out.println(opposite(14));
        System.out.println(opposite(-32));
    }

    public static int opposite(int number) {
        return number * -1;
    }
}
