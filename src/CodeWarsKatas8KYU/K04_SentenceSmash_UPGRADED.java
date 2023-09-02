package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that takes an array of words and smashes them together
    into a sentence and returns the sentence.
    You can ignore any need to sanitize words or add punctuation,
    but you should add spaces between each word.
    Be careful, there shouldn't be a space at the beginning or the end of the sentence!
---------------------------------------------------> */

public class K04_SentenceSmash_UPGRADED {

    public static void main(String[] args) {
        System.out.println(smash());
        System.out.println(smash("Bilal", "Djaghout"));
        System.out.println(smash("hello", "amazing", "world"));

        System.out.println("----------------------------------------------------------");

        System.out.println(smashUpgraded());
        System.out.println(smashUpgraded("Bilal", "Djaghout"));
        System.out.println(smashUpgraded("hello", "amazing", "world"));

        System.out.println("----------------------------------------------------------");

        System.out.println(smashUpgraded2());
        System.out.println(smashUpgraded2("Bilal", "Djaghout"));
        System.out.println(smashUpgraded2("hello", "amazing", "world"));
    }

    public static String smash(String... words) {

        if (words.length == 0) return "";

        String sentence = words[0];
        if (words.length > 1){
            for (int i = 1; i < words.length; i++){
                sentence = sentence + " " + words[i];
            }
        }
        return sentence;
    }

    public static String smashUpgraded(String... words) {

        if (words.length == 0) return "";
        StringBuilder sentence = new StringBuilder();
        for (String word : words) sentence.append(word + " ");

        return sentence.toString().trim();
    }

    public static String smashUpgraded2(String... words) {

        return String.join(" ", words);
    }
}
