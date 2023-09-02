package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
    The first letter must be converted to its ASCII code.
    The second letter must be switched with the last letter
    Keepin' it simple: There are no special characters in the input.
    Examples:

    Kata.encryptThis("Hello") => "72olle"
    Kata.encryptThis("good") => "103doo"
    Kata.encryptThis("hello world") => "104olle 119drlo"
---------------------------------------------------> */

public class K55_EncryptThis {

    public static void main(String[] args) {

        System.out.println(encrypt("hello world"));
        System.out.println(encrypt("A wise old owl lived in an oak"));
        System.out.println(encrypt("The more he saw the less he spoke"));
        System.out.println(encrypt("The less he spoke the more he heard"));
        System.out.println(encrypt("Why can we not all be like that wise old bird"));
        System.out.println(encrypt(""));
    }

    public static String encrypt(String text) {

        if (text.isEmpty()) return "";
        String[] array = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : array) {
            int firstChar = word.charAt(0);
            if (word.length() == 1) {
                sb.append(firstChar).append(" ");
                continue;
            }
            String substring = word.substring(1).replaceAll("(^\\w)(.+)?(\\w$)", "$3$2$1");
            sb.append(firstChar).append(substring).append(" ");
        }

        return sb.toString().trim();
    }
}
