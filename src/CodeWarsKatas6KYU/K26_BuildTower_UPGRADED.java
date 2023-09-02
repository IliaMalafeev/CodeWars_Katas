package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors.
    A tower block is represented with "*" character.

    For example, a tower with 3 floors looks like this:
        [ "  *  ",
          " *** ",
          "*****" ]

    And a tower with 6 floors looks like this:
        [ "     *     ",
          "    ***    ",
          "   *****   ",
          "  *******  ",
          " ********* ",
          "***********" ]
---------------------------------------------------> */

public class K26_BuildTower_UPGRADED {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(towerBuilder(3)));
        System.out.println(Arrays.toString(towerBuilder(6)));
        System.out.println(Arrays.toString(towerBuilder(9)));

        System.out.println(Arrays.toString(towerBuilderUpgrade(3)));
        System.out.println(Arrays.toString(towerBuilderUpgrade(6)));
        System.out.println(Arrays.toString(towerBuilderUpgrade(9)));
    }

    public static String[] towerBuilder(int nFloors) {

        String[] result = new String[nFloors];
        StringBuilder str = new StringBuilder();
        for (int i = 0, j = 1; i < nFloors; i++, j += 2) {
            for (int k = 0; k < nFloors - 1 - i; k++) str.append(" ");
            for (int l = 0; l < j; l++) str.append("*");
            for (int k = 0; k < nFloors - 1 - i; k++) str.append(" ");
            result[i] = str.toString();
            str = new StringBuilder();
        }
        return result;
    }

    public static String[] towerBuilderUpgrade(int nFloors) {

        String[] result = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            result[i] = " ".repeat(nFloors - 1 - i) + "*".repeat(i + i + 1) + " ".repeat(nFloors - 1 - i);
        }

        return result;
    }
}
