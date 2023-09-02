package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    A stream of data is received and needs to be reversed.
    Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:

        11111111  00000000  00001111  10101010
         (byte1)   (byte2)   (byte3)   (byte4)

        should become:

        10101010  00001111  00000000  11111111
         (byte4)   (byte3)   (byte2)   (byte1)

    The total number of bits will always be a multiple of 8.

    The data is given in an array as such: [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
---------------------------------------------------> */

public class K56_DataReverse {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(DataReverse(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0})));
    }

    public static int[] DataReverse(int[] data) {

        ArrayList<Integer> list = new ArrayList<>(data.length);
        for (int i = data.length - 8; i >= 0; i -= 8) {
            for (int j = 0; j < 8; j++) {
                list.add(data[i + j]);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
