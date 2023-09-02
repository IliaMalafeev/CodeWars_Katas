package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

    For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1. (81-1-1-81)
    Example #2: An input of 765 will/should return 493625 because 7^2 is 49, 6^2 is 36, and 5^2 is 25. (49-36-25)

    Note: The function accepts an integer and returns an integer.
---------------------------------------------------> */

import java.util.Arrays;

public class K23_SquareEveryDigit_UPGRADED {

    public static void main(String[] args) {

        System.out.println(squareDigits(123));
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(765));
        System.out.println(squareDigitsUpgraded(123));
        System.out.println(squareDigitsUpgraded(9119));
        System.out.println(squareDigitsUpgraded(765));
    }

    public static int squareDigits(int x){

        String intToString = String.valueOf(x);
        char[] stringToChars = intToString.toCharArray();
        String result = "";
        for (char i : stringToChars){
            result = (result + (Integer.parseInt(String.valueOf(i)) * Integer.parseInt(String.valueOf(i)))).trim();
        }
        return Integer.parseInt(result);
    }

    public static int squareDigitsUpgraded(int x){

        StringBuilder result = new StringBuilder();
        Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).forEach(i -> result.append(i * i));
        return Integer.parseInt(result.toString());
    }
}
