package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the solution so that the function will break up camel casing, using a space between words.

    Example
        "camelCasing"  =>  "camel Casing"
        "identifier"   =>  "identifier"
        ""             =>  ""
---------------------------------------------------> */

public class K35_BreakCamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("camelCasingTest"));
    }

    public static String camelCase(String input) {

        return input.replaceAll("([A-Z])", " $1");
    }
}
