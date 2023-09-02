package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    The first century spans from the year 1 up to and including the year 100,
    the second century - from the year 101 up to and including the year 200, etc.
    Given a year, return the century it is in.

    Examples: 1705 --> 18, 1900 --> 19, 1601 --> 17, 2000 --> 20
---------------------------------------------------> */

public class K20_CenturyFromYear_UPGRADED {

    public static void main(String[] args) {
        System.out.println(century(1705));
        System.out.println(century(89));
        System.out.println(century(1900));
        System.out.println(century(1601));
        System.out.println("-----------------");
        System.out.println(centuryUpgraded(1705));
        System.out.println(centuryUpgraded(89));
        System.out.println(centuryUpgraded(1900));
        System.out.println(centuryUpgraded(1601));
    }

    public static int century(int number) {

        if (number % 100 == 0) {
            return (number / 100);
        } else {
            return (number / 100 + 1);
        }
    }

    public static int centuryUpgraded(int number) {
        return (number % 100 == 0) ? (number / 100) : (number / 100 + 1);
    }
}
