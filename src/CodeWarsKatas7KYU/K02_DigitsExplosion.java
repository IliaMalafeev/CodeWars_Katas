package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a string made of digits [0-9],
    return a string where each digit is repeated a number of times equals to its value.
---------------------------------------------------> */

public class K02_DigitsExplosion {

    public static void main(String[] args) {
        System.out.println(explode("102269"));
    }

    public static String explode(String digits) {

        StringBuilder result = new StringBuilder();
        for (char x : digits.toCharArray()) {
            result.append(String.valueOf(x).repeat(Integer.parseInt(String.valueOf(x))));
        }
        return result.toString();
    }
}
