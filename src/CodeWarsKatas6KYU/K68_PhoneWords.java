package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a string of numbers, you must perform a method in which you will
    translate this string into text, based on the below:

                    2 -> abc    3 -> def
        4 -> ghi    5 -> jkl    6 -> mno
        7 -> pqrs   8 -> tuv    9 -> wxyz

    For example if you get "22" return "b", if you get "222" you will return "c". If you get "2222" return "ca".

    Further details:
        0 is a space in the string.
        1 is used to separate letters with the same number.
        always transform the number to the letter with the maximum value, as long as
        it does not have a 1 in the middle. So, "777777" -->  "sq" and "7717777" --> "qs".
        you cannot return digits.
        Given a empty string, return empty string.
        Return a lowercase string.

    Examples:
        "443355555566604466690277733099966688"  -->  "hello how are you"
        "55282"                 -->  "kata"
        "22266631339277717777"  -->  "codewars"
        "66885551555"           -->  "null"
        "833998"                -->  "text"
        "000"                   -->  "   "
---------------------------------------------------> */

public class K68_PhoneWords {

    public static void main(String[] args) {

        System.out.println(phoneWords("416666663105558822255"));
        System.out.println(phoneWords("443355555566604466690277733099966688"));
    }

    public static String phoneWords(String str) {

        if (str == null || str.replaceAll("1+", "").isEmpty()) return "";
        String[] buttonValues = {" ", null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder result = new StringBuilder();
        int currentButton = 10;
        int currentButtonCount = 0;

        for (char x : str.toCharArray()) {
            if (x == '1') {
                appendLetter(currentButton, currentButtonCount, result, buttonValues);
                currentButtonCount = 0;
                currentButton = 10;
                continue;
            }
            if (currentButton != Integer.parseInt(String.valueOf(x))) {
                appendLetter(currentButton, currentButtonCount, result, buttonValues);
                currentButton = Integer.parseInt(String.valueOf(x));
                currentButtonCount = 1;
            } else {
                if (currentButtonCount == buttonValues[Integer.parseInt(String.valueOf(x))].length()) {
                    appendLetter(currentButton, currentButtonCount, result, buttonValues);
                    currentButtonCount = 0;
                }
                if (currentButtonCount < buttonValues[Integer.parseInt(String.valueOf(x))].length()) currentButtonCount++;
            }
        }
        appendLetter(currentButton, currentButtonCount, result, buttonValues);
        return result.toString();
    }

    public static void appendLetter(int button, int buttonCount, StringBuilder result, String[] values) {
        if (button > 9) return;
        result.append(values[button].charAt(buttonCount - 1));
    }
}
