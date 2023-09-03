package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    The rgb function is incomplete.
    Complete it so that passing in RGB decimal values will
    result in a hexadecimal representation being returned.
    Valid decimal values for RGB are 0 - 255.
    Any values that fall out of that range must be rounded to the closest valid value.

    Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

    Examples (input --> output):

        255, 255, 255 --> "FFFFFF"
        255, 255, 300 --> "FFFFFF"
        0, 0, 0       --> "000000"
        148, 0, 211   --> "9400D3"
---------------------------------------------------> */

public class K03_RGBToHexConversion {

    public static void main(String[] args) {

        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(255, 255, 300));
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(148, 0, 211));
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
