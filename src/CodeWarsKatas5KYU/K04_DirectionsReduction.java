package CodeWarsKatas5KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K04_DirectionsReduction {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"})));
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"})));
        System.out.println(Arrays.toString(dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"}))); //EAST  NORTH
    }

    public static String[] dirReduc(String[] arr) {

        String dir = "";
        for (String i : arr) dir += i + " ";
        System.out.println(dir);
        for (int i = 0; i < arr.length + 1; i++) {
            dir = dir.replaceAll("NORTH SOUTH ", "").replaceAll("SOUTH NORTH ", "").replaceAll("WEST EAST ", "").replaceAll("EAST WEST ", "").trim();
        }
        dir = dir.replaceAll("NORTH SOUTH", "").replaceAll("SOUTH NORTH", "").replaceAll("WEST EAST", "").replaceAll("EAST WEST", "").trim();
        if (dir.split(" ").length == 1 && dir.split(" ")[0].equals("")) return new String[0];
        return dir.split(" ");
    }
}
