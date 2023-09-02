package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Collections;

/* <------------------------------------------------
    DESCRIPTION:

    You will be given a number, and you will need to return it as a string in Expanded Form. For example:

        Kata.expandedForm(12); # Should return "10 + 2"
        Kata.expandedForm(42); # Should return "40 + 2"
        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

    NOTE: All numbers will be whole numbers greater than 0.
---------------------------------------------------> */

public class K34_WriteNumberInExpandedForm {

    public static void main(String[] args) {

        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int x) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 10; i <= x; i *= 10) {
            if (x % i != 0) {
                list.add(String.valueOf(x % i));
                x -= x % i;
            }
        }
        list.add(String.valueOf(x));
        Collections.reverse(list);
        return String.join(" + ", list);
    }
}
