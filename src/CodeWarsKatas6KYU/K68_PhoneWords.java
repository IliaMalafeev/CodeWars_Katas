package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K68_PhoneWords {

    public static void main(String[] args) {

        System.out.println(phoneWords("416666663105558822255"));
        System.out.println(phoneWords("443355555566604466690277733099966688"));
    }

    public static String phoneWords(String str) {

        if (str == null || str.replaceAll("1+", "").length() == 0) return "";
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
