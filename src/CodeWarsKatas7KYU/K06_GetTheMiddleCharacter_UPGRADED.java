package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You are going to be given a word. Your job is to return the middle character of the word.
    If the word's length is odd, return the middle character.
    If the word's length is even, return the middle 2 characters.

    Input: A word (string) of length 0 < str < 1000. You do not need to test for this.
    This is only here to tell you that you do not need to worry about your solution timing out.

    #Output: The middle character(s) of the word represented as a string.
---------------------------------------------------> */

public class K06_GetTheMiddleCharacter_UPGRADED {

    public static void main(String[] args) {
        System.out.println(getMiddle("cast"));
        System.out.println(getMiddleUpgraded("cast"));
    }

    public static String getMiddle(String word) {

        char [] strToChar = word.toCharArray();
        String result = "";
        if (strToChar.length % 2 == 0) {
            result += String.valueOf(strToChar[strToChar.length / 2 - 1]) + strToChar[strToChar.length / 2];
        }
        else result += strToChar[strToChar.length / 2];
        return result;
    }

    public static String getMiddleUpgraded(String word) {

        int l = word.length();
        return (l % 2 == 0) ? word.substring(l / 2 - 1, l / 2 + 1) : word.substring(l / 2, l / 2 + 1);
    }
}
