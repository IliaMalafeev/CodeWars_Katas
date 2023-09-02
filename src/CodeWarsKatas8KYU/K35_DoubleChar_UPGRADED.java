package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a string, you have to return a string
    in which each character (case-sensitive) is repeated once.
---------------------------------------------------> */

public class K35_DoubleChar_UPGRADED {
    public static void main(String[] args) {
        System.out.println(doubleChar("World"));
        System.out.println(doubleChar("1234!_ "));

        System.out.println(doubleCharUpgraded("World"));
        System.out.println(doubleCharUpgraded("1234!_ "));
    }

    public static String doubleChar(String s){

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += String.valueOf(s.charAt(i)) + s.charAt(i);
        }
        return result;
    }

    public static String doubleCharUpgraded(String s){

        StringBuilder result = new StringBuilder();
        String[] symbols = s.split("");
        for (String symbol : symbols) result.append(symbol.repeat(2));
        return result.toString();
    }
}
