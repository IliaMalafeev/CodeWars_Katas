package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Implement a function which convert the given boolean value into its string representation.
    Note: Only valid inputs will be given.
---------------------------------------------------> */

public class K05_ConvertABooleanToAString_UPGRADED {

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
        System.out.println("----------------------------------------------------------");
        System.out.println(convertUpgraded(true));
        System.out.println(convertUpgraded(false));
    }

    public static String convert(boolean b){

        if(b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String convertUpgraded(boolean b){

        return String.valueOf(b);
    }
}
