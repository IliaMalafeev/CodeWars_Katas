package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:
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
