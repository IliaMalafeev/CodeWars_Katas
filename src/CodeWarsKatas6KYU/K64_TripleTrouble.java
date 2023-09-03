package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function TripleDouble(long num1, long num2) which takes numbers num1 and num2 and returns 1 if there is
    a straight triple of a number at any place in num1 and also a straight double of the same number in num2.
    If this isn't the case, return 0

    Examples:
        TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and num2 has straight double 99s
        TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
        TripleDouble(12345, 12345) == 0
        TripleDouble(666789, 12345667) == 1
---------------------------------------------------> */

public class K64_TripleTrouble {

    public static void main(String[] args) {

        System.out.println(TripleDouble(1222345L, 12345L)); // 0
        System.out.println(TripleDouble(451999277L, 41177722899L)); // 1
    }

    public static int TripleDouble(long num1, long num2) {

        for (int i = 0; i < 10; i++) {
            if (String.valueOf(num1).contains(String.valueOf(i).repeat(3))) {
                if (String.valueOf(num2).contains(String.valueOf(i).repeat(2))) return 1;
            }
        }
        return 0;
    }
}
