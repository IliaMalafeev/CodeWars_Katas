package CodeWarsKatas7KYU;

/* <-------------------------------------------------------------------------------------------
    DESCRIPTION:

    When writing on Twitter, Jaden Smith is known for almost always capitalizing every word.
    For simplicity, you'll have to capitalize each word,
    check out how contractions are expected to be in the example below.
    Your task is to convert strings to how they would be written by Jaden Smith.
    The strings are actual quotes from Jaden Smith,
    but they are not capitalized in the same way he originally typed them.

    Example:    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
                Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

    Note that the Java version expects a return value of null for an empty string or null.
-----------------------------------------------------------------------------------------------> */

public class K03_JadenCasingStrings {
    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) return null;

        String[] words = phrase.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            if (!String.valueOf(wordChars[0]).toUpperCase().equals(String.valueOf(wordChars[0]))) {
                wordChars[0] -= 32;
            }
            words[i] = String.copyValueOf(wordChars);
            if (i != words.length - 1) result += words[i] + " ";
            else result += words[i];
        }

        return result;
    }
}
