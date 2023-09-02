package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    DESCRIPTION:

    Write a simple parser that will parse and run Deadfish.
    Deadfish has 4 commands, each 1 character long:

        i increments the value (initially 0)
        d decrements the value
        s squares the value
        o outputs the value into the return array
        Invalid characters should be ignored.

    Deadfish.parse("iiisdoso") => new int[] {8, 64};
---------------------------------------------------> */

public class K48_MakeTheDeadfishSwim {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(parse("iiisdosodddddiso")));
    }

    public static int[] parse(String data) {

        int value = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        for (char x : data.toCharArray()) {
            switch (x) {
                case 'i' -> value++;
                case 's' -> value *= value;
                case 'd' -> value--;
                case 'o' -> resultList.add(value);
            }
        }
        return resultList.stream().mapToInt(x -> x).toArray();
    }
}
