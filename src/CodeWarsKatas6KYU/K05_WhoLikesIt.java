package CodeWarsKatas6KYU;

import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    You probably know the "like" system from Facebook and other pages.
    People can "like" blog posts, pictures or other items.
    We want to create the text that should be displayed next to such an item.

    Implement the function which takes an array containing the names of people that like an item.
    It must return the display text as shown in the examples:

        []                                -->  "no one likes this"
        ["Peter"]                         -->  "Peter likes this"
        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

    Note: For 4 or more names, the number in "and 2 others" simply increases.
---------------------------------------------------> */

public class K05_WhoLikesIt {

    public static void main(String[] args) {

        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "John"));
    }

    public static String whoLikesIt(String... names) {

        List<String> list = List.of(names);
        String result = "";

        switch(list.size()) {
            case 0 -> result = "no one likes this";
            case 1 -> result = list.get(0) + " likes this";
            case 2 -> result = list.get(0) + " and " + list.get(1) + " like this";
            case 3 -> result = list.get(0) + ", " + list.get(1) + " and " + list.get(2) + " like this";
            default -> result = list.get(0) + ", " + list.get(1) + " and " + (list.size() - 2) + " others like this";
        }

        return result;
    }
}
