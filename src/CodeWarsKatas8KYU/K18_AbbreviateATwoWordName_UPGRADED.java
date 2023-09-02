package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function to convert a name into initials.
    This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.

    It should look like this:
        Sam Harris => S.H
        patrick feeney => P.F
---------------------------------------------------> */

public class K18_AbbreviateATwoWordName_UPGRADED {

    public static void main(String[] args) {
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("David Mendieta"));
        System.out.println(abbrevName("george clooney"));
        System.out.println("--------------------");
        System.out.println(abbrevNameUpgraded("P Favuzzi"));
        System.out.println(abbrevNameUpgraded("Sam Harris"));
        System.out.println(abbrevNameUpgraded("Patrick Feenan"));
        System.out.println(abbrevNameUpgraded("Evan Cole"));
        System.out.println(abbrevNameUpgraded("David Mendieta"));
        System.out.println(abbrevNameUpgraded("george clooney"));
    }

    public static String abbrevName(String name) {
        char[] x = name.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (i == 0 || x[i - 1] == ' ') x[i] = Character.toUpperCase(x[i]);
        }
        return new String(x).replaceAll("[a-z]", "").replaceAll(" ", ".");
    }

    public static String abbrevNameUpgraded(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
