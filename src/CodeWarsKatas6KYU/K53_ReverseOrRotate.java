package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K53_ReverseOrRotate {
    public static void main(String[] args) {
        System.out.println(revRot("123456987654", 6)); //"234561876549"
        System.out.println(revRot("123456987653", 6)); //"234561356789"
    }

    public static String revRot(String strng, int sz) {
        if (strng.equals("") || sz == 0) return "";

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
                chunk = chunk.substring(1) + chunk.substring(0, 1);
                result.append(chunk);
            }
        }
        return result.toString();
    }
}
