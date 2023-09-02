package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    The goal of this exercise is to convert a string to a new string where each character
    in the new string is "(" if that character appears only once in the original string, or ")"
    if that character appears more than once in the original string.
    Ignore capitalization when determining if a character is a duplicate.

    Examples
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
---------------------------------------------------> */

public class K11_DuplicateEncoder {

    public static void main(String[] args) {

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
        System.out.println(encode("Prespecialized"));
    }

    static String encode(String word){

        String lowCaseWord = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char i : lowCaseWord.toCharArray()){
            result.append(lowCaseWord.indexOf(i) == lowCaseWord.lastIndexOf(i) ? "(" : ")");
        }
        return result.toString();
    }
}
