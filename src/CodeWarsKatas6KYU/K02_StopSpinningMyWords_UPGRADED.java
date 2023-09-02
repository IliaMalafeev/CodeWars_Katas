package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that takes in a string of one or more words, and returns the same string,
    but with all five or more letter words reversed (Just like the name of this Kata).
    Strings passed in will consist of only letters and spaces.
    Spaces will be included only when more than one word is present.
---------------------------------------------------> */

public class K02_StopSpinningMyWords_UPGRADED {

    public static void main(String[] args) {

        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWordsUpgrade("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";
        for(String word : words){
            if (word.length() >= 5) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < word.length() / 2; i++) {
                    char temp = chars[i];
                    chars[i] = chars[chars.length - 1 - i];
                    chars[chars.length - 1 - i] = temp;
                }
                word = String.copyValueOf(chars);
            }
            result = (result + word + " ");
        }
        return result.stripTrailing();
    }

    public static String spinWordsUpgrade(String sentence) {

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
