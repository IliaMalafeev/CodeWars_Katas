package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Digital root is the recursive sum of all the digits in a number.
    Given n, take the sum of the digits of n. If that value has more than one digit,
    continue reducing in this way until a single-digit number is produced.
    The input will be a non-negative integer.
---------------------------------------------------> */

public class K04_SumOfDigitsDigitalRoot {

    public static void main(String[] args) {

        System.out.println(digital_root(5));
        System.out.println(digital_root(16));
        System.out.println(digital_root(81));
        System.out.println(digital_root(493193));
    }

    public static int digital_root(int n) {
        if (n > 9) return n % 9 == 0 ? 9 : n % 9;
        else return n;
    }
}
