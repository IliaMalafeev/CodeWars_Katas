package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* <------------------------------------------------
    DESCRIPTION:

    Your task is to sort a given string. Each word in the string will contain a single number.
    This number is the position the word should have in the result.
    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
    If the input string is empty, return an empty string.
    The words in the input String will only contain valid consecutive numbers.

    Examples:
        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
        ""  -->  ""
---------------------------------------------------> */

public class K15_YourOrderPlease_UPGRADED {

    public static void main(String[] args) {

        String test1 = "";
        String test2 = "is2 Thi1s T4est 3a";
        String test3 = "4of Fo1r pe6ople g3ood th5e the2";

        System.out.println(order(test1));
        System.out.println(order(test2));
        System.out.println(order(test3));

        System.out.println(orderUpgrade(test1));
        System.out.println(orderUpgrade(test2));
        System.out.println(orderUpgrade(test3));

        System.out.println(orderUpgrade2(test1));
        System.out.println(orderUpgrade2(test2));
        System.out.println(orderUpgrade2(test3));
    }

    public static String order(String words) {

        if (words.isEmpty()) return "";
        String[] array = words.split(" ");
        List<Character> numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        String[] result = new String[array.length];
        for (String i : array){
            char[] j = i.toCharArray();
            for (char k : j){
                if (numbers.contains(k)) result[Integer.parseInt(String.valueOf(k)) - 1] = i;
            }
        }
        String resultString = "";
        for (String n : result) resultString += n + " ";
        return resultString.stripTrailing();
    }

    public static String orderUpgrade(String words) {

        String[] array = words.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++){
            for (String j : array){
                if (j.contains(String.valueOf(i))) result.append(j).append(" ");
            }
        }
        return result.toString().stripTrailing();
    }

    public static String orderUpgrade2(String words) {

        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(x -> x.replaceAll("\\D", "")))
                .collect(Collectors.joining(" "));
    }
}
