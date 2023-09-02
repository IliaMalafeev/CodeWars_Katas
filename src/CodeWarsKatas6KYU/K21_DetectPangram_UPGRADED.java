package CodeWarsKatas6KYU;

public class K21_DetectPangram_UPGRADED {

/* <------------------------------------------------
    DESCRIPTION:

    A pangram is a sentence that contains every single letter of the alphabet at least once.
    For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
    because it uses the letters A-Z at least once (case is irrelevant).
    Given a string, detect whether it is a pangram.
    Return True if it is, False if not. Ignore numbers and punctuation.
---------------------------------------------------> */

    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(checkUpgraded("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence){

        String sentenceToCheck = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char x : alphabet.toCharArray()) {
            if (!sentenceToCheck.contains(String.valueOf(x))) return false;
        }

        return true;
    }

    public static boolean checkUpgraded(String sentence){
        return sentence.chars().filter(Character::isAlphabetic).map(Character::toLowerCase).distinct().count() == 26;
    }
}
