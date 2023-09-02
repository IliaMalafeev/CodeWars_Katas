package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
    which is the number of times you must multiply the digits in num until you reach a single digit.

    Examples:
        39  --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
        4   --> 0 (because 4 is already a one-digit number)

---------------------------------------------------> */

public class K13_PersistentBugger_UPGRADED {

    public static void main(String[] args) {

        System.out.println(persistence(999));
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));

        System.out.println(persistenceUPGRADE(999));
        System.out.println(persistenceUPGRADE(39));
        System.out.println(persistenceUPGRADE(4));
        System.out.println(persistenceUPGRADE(25));
    }

    public static int persistence(long n) {

        char[] chars = String.valueOf(n).toCharArray();
        int multiply = 1;
        int count = 0;

        for (; n > 9; count++) {

            for (char aChar : chars) {
                multiply *= Integer.parseInt(String.valueOf(aChar));
                n = multiply;
            }

            chars = String.valueOf(n).toCharArray();
            multiply = 1;
        }

        return count;
    }

    public static int persistenceUPGRADE(long n) {

        long m = 1, r = n;
        if (r / 10 == 0) return 0;
        for (r = n; r != 0; r /= 10) m *= r % 10;

        return persistenceUPGRADE(m) + 1;
    }
}
