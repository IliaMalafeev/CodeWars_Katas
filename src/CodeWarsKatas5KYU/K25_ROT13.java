package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    How can you tell an extrovert from an introvert at NSA?
    Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.

    I found this joke on USENET, but the punchline is scrambled. Maybe you can decipher it?
    According to Wikipedia, ROT13 is frequently used to obfuscate jokes on USENET.

    For this task you're only supposed to substitute characters. Not spaces, punctuation, numbers, etc.

    Test examples:

        "EBG13 rknzcyr." -> "ROT13 example."

        "This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"
---------------------------------------------------> */

public class K25_ROT13 {

    public static void main(String[] args) {

        System.out.println(rot13("EBG13 rknzcyr."));                    // returns "ROT13 example."
        System.out.println(rot13("This is my first ROT13 excercise!")); // returns "Guvf vf zl svefg EBG13 rkprepvfr!"
        System.out.println(rot13("W3 ar3 in ye@r 2023$$$!äöü"));        // returns "J3 ne3 va lr@e 2023$$$!äöü"
    }

    public static String rot13(String message) {

        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i ++) {

            if (chars[i] >= 97 && chars[i] <= 122) {    // a = 97, z = 122
                chars[i] = chars[i] + 13 > 122 ? (char) (chars[i] - 13) : (char) (chars[i] + 13);
            }

            if (chars[i] >= 65 && chars[i] <= 90) {     // A = 65, Z = 90
                chars[i] = chars[i] + 13 > 90 ? (char) (chars[i] - 13) : (char) (chars[i] + 13);
            }
        }

        return new String(chars);
    }
}
