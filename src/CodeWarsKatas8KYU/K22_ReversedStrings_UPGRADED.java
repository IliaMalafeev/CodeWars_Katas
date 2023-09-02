package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the solution so that it reverses the string passed into it.
---------------------------------------------------> */

public class K22_ReversedStrings_UPGRADED {

    public static void main(String[] args) {
        System.out.println(solution("Hello"));
        System.out.println(solutionUpgraded("Hello"));
    }

    public static String solution(String str) {
        char [] strToChars = str.toCharArray();
        String result = "";
        char temp;
        int length = strToChars.length;
        for (int i = 0; i < length/ 2; i++){
            temp = strToChars[i];
            strToChars[i] = strToChars[length - 1 - i];
            strToChars[length - 1 - i] = temp;
        }
        for (char i : strToChars){
            result = result + String.valueOf(i);
        }
        return result;
    }

    public static String solutionUpgraded(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
