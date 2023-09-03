package CodeWarsKatas5KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Once upon a time, on a way through the old wild mountainous west,
    a man was given directions to go from one point to another.
    The directions were "NORTH", "SOUTH", "WEST", "EAST".
    Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.

    Going to one direction and coming back the opposite direction right away is a needless effort.
    Since this is the wild west, with dreadful weather and not much water,
    it's important to save yourself some energy, otherwise you might die of thirst!

    How I crossed a mountainous desert the smart way.

    The directions given to the man are, for example, the following:

        { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }
        You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable,
        better stay to the same place! So the task is to give to the man a simplified version of the plan.
        A better plan in this case is simply: { "WEST" }.

    Other examples:

        In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming
        back right away. The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other,
        therefore, the final result is [].

        In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite,
        but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path
        is reducible to ["WEST", "WEST"].

    Task:
        Write a function dirReduc which will take an array of strings and returns an array of strings with
        the needless directions removed (W<->E or S<->N side by side).

    Notes:
        Not all paths can be made simpler.
        The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
        "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other
        and can't become such. Hence, the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
---------------------------------------------------> */

public class K04_DirectionsReduction_UPGRADED {

    public static void main(String[] args) {

        String[] test1 = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"};
        String[] test2 = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] test3 = new String[]{"NORTH", "WEST", "SOUTH", "EAST"};
        String[] test4 = new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"};

        System.out.println(Arrays.toString(dirReduc(test1)));
        System.out.println(Arrays.toString(dirReduc(test2)));
        System.out.println(Arrays.toString(dirReduc(test3)));
        System.out.println(Arrays.toString(dirReduc(test4))); //EAST  NORTH

        System.out.println(Arrays.toString(dirReducUpgrade(test1)));
        System.out.println(Arrays.toString(dirReducUpgrade(test2)));
        System.out.println(Arrays.toString(dirReducUpgrade(test3)));
        System.out.println(Arrays.toString(dirReducUpgrade(test4))); //EAST  NORTH
    }

    public static String[] dirReduc(String[] arr) {

        StringBuilder dirBuilder = new StringBuilder();
        for (String i : arr) dirBuilder.append(i).append(" ");
        String dir = dirBuilder.toString();

        for (int i = 0; i < arr.length + 1; i++) {
            dir = dir.replaceAll("NORTH SOUTH ", "").replaceAll("SOUTH NORTH ", "").replaceAll("WEST EAST ", "").replaceAll("EAST WEST ", "").trim();
        }

        dir = dir.replaceAll("NORTH SOUTH", "").replaceAll("SOUTH NORTH", "").replaceAll("WEST EAST", "").replaceAll("EAST WEST", "").trim();
        if (dir.split(" ").length == 1 && dir.split(" ")[0].isEmpty()) return new String[0];
        return dir.split(" ");
    }

    public static String[] dirReducUpgrade(String[] arr) {

        String dir = String.join(" ", arr);

        for (int i = 0; i < arr.length; i++) {
            dir = dir.replaceAll("NORTH SOUTH|SOUTH NORTH|WEST EAST|EAST WEST", "").replaceAll(" +", " ").trim();
        }

        return dir.split(" ");
    }
}
