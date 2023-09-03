package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K03_RGBToHexConversion {

    public static void main(String[] args) {

        System.out.println(rgb(1, 2, 5));
    }

    public static String rgb(int r, int g, int b) {

        r = r > 0 ? (Math.min(r, 255)) : 0;
        g = g > 0 ? (Math.min(g, 255)) : 0;
        b = b > 0 ? (Math.min(b, 255)) : 0;
        String result =
                (Integer.toHexString(r).matches("[0-9]") ? "0" + Integer.toHexString(r) : Integer.toHexString(r)) +
                (Integer.toHexString(g).matches("[0-9]") ? "0" + Integer.toHexString(g) : Integer.toHexString(g)) +
                (Integer.toHexString(b).matches("[0-9]") ? "0" + Integer.toHexString(b) : Integer.toHexString(b));
        return result.toUpperCase();
    }
}
