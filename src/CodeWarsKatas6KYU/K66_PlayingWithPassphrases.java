package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on, but frequently
    they can be guessed due to common cultural references. You can get your passphrases stronger by different means.

    One is the following: choose a text in capital letters including or not digits and non-alphabetic characters,
        shift each letter by a given number but the transformed letter must be a letter (circular shift),
        replace each digit by its complement to 9,
        keep such as non-alphabetic and non digit characters,
        downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
        reverse the whole result.

    Example: your text: "BORN IN 2015!", shift 1
        1 + 2 + 3 -> "CPSO JO 7984!"
        4 "CpSo jO 7984!"
        5 "!4897 Oj oSpC"

    With longer passphrases it's better to have a small and easy program. Would you write it?
---------------------------------------------------> */

public class K66_PlayingWithPassphrases {

    public static void main(String[] args) {

        System.out.println(playPass("BORN IN 2015!", 1));
        System.out.println(playPass("I LOVE YOU!!!", 1));
        System.out.println(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }

    public static String playPass(String s, int n) {

        char[] letters = s.toUpperCase().toCharArray();

        StringBuilder lettersUpd = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            char nextChar = letters[i];
            if (String.valueOf(letters[i]).matches("[A-Z]")) {
                char nextLetter = (char) (letters[i] + n);
                if (nextLetter > 90) nextLetter = (char) (nextLetter - 91 + 65);
                if (i % 2 == 0) lettersUpd.append(nextLetter);
                else lettersUpd.append(String.valueOf(nextLetter).toLowerCase());
            } else if (String.valueOf(letters[i]).matches("[0-9]")) {
                int nextInt = 9 - Integer.parseInt(String.valueOf(letters[i]));
                lettersUpd.append(nextInt);
            } else lettersUpd.append(nextChar);
        }
        lettersUpd.reverse();

        return lettersUpd.toString();
    }
}
