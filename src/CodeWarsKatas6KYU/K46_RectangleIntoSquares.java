package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    The drawing below gives an idea of how to cut a given "true" rectangle into squares
    ("true" rectangle meaning that the two dimensions are different).

    https://i.imgur.com/lk5vJ7sm.jpg

    Can you translate this drawing into an algorithm?

    You will be given two dimensions: a positive integer length and a positive integer width.
    You will return a collection with the size of each of the squares.

    Examples in general form:
        sqInRect(5, 3) should return [3, 2, 1, 1]
        sqInRect(3, 5) should return [3, 2, 1, 1]

    Notes:
        lng == wdth as a starting case would be an entirely different problem
        and the drawing is planned to be interpreted with lng != wdth.

    When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious
    but not in the spirit of this kata so, in that case, return null.
---------------------------------------------------> */

public class K46_RectangleIntoSquares {

    public static void main(String[] args) {

        System.out.println(sqInRect(5, 3));
        System.out.println(sqInRect(5, 5));
        System.out.println(sqInRect(78, 565));
    }

    public static List<Integer> sqInRect(int lng, int wdth) {

        if (lng == wdth) return null;
        if (wdth > lng) {
            int temp = wdth;
            wdth = lng;
            lng = temp;
        }
        List<Integer> list = new ArrayList<>();
        int totalArea = lng * wdth;
        while (totalArea > 0) {
            list.add(wdth);
            if (lng - wdth == wdth) {
                list.add(wdth);
                break;
            }
            else if (lng - wdth < wdth) {
                int temp = wdth;
                wdth = lng - wdth;
                lng = temp;
            }
            else if (lng - wdth > wdth) lng -= wdth;
            totalArea = lng * wdth;
        }
        return list;
    }
}
