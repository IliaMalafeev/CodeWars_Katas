package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    The input is a string str of digits. Cut the string into chunks (a chunk here is a substring
    of the initial string) of size sz (ignore the last chunk if its size is less than sz).
    If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2,
    reverse that chunk; otherwise rotate it to the left by one position.
    Put together these modified chunks and return the result as a string.

    If sz is <= 0 or if str is empty return "".
    If sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

    Examples:
        revrot("123456987654", 6) --> "234561876549"
        revrot("123456987653", 6) --> "234561356789"
        revrot("66443875", 4) --> "44668753"
        revrot("66443875", 8) --> "64438756"
        revrot("664438769", 8) --> "67834466"
        revrot("123456779", 8) --> "23456771"
        revrot("", 8) --> ""
        revrot("123456779", 0) --> ""
        revrot("563000655734469485", 4) --> "0365065073456944"

    Example of a string rotated to the left by one position:
        s = "123456" gives "234561".
---------------------------------------------------> */

public class K53_ReverseOrRotate {

    public static void main(String[] args) {

        System.out.println(revRot("123456987654", 6)); //"234561876549"
        System.out.println(revRot("123456987653", 6)); //"234561356789"
    }

    public static String revRot(String strng, int sz) {

        if (strng.isEmpty() || sz == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strng.length() / sz; i++) {
            String s = strng.substring(i * sz, (i + 1) * sz);
            String[] chunkDigits = s.split("");
            int x = Arrays.stream(chunkDigits).
                    mapToInt(Integer::parseInt).
                    map(e -> (int)Math.pow(e, 3)).
                    sum();
            if (x % 2 == 0) {
                List<String> chunk = new ArrayList<>(Arrays.asList(chunkDigits));
                Collections.reverse(chunk);
                String revChunk = String.join("", chunk);
                result.append(revChunk);
            } else {
                String chunk = String.join("", chunkDigits);
                chunk = chunk.substring(1) + chunk.charAt(0);
                result.append(chunk);
            }
        }
        return result.toString();
    }
}
