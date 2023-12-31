package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded
    by voice and digital data communication channels, it still has its use in some applications around the world.

    The Morse code encodes every character as a sequence of "dots" and "dashes". For example,
    the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
    The Morse code is case-insensitive, traditionally capital letters are used.
    When the message is written in Morse code, a single space is used to separate the character codes
    and 3 spaces are used to separate words.
    For example, the message HEY JUDE in Morse code is "···· · −·−−   ·−−− ··− −·· ·".

    NOTE: Extra spaces before or after the code have no meaning and should be ignored.

    In addition to letters, digits and some punctuation, there are some special service codes,
    the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
    that is coded as "···−−−···". These special codes are treated as single special characters,
    and usually are transmitted as separate words.

    Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

    For example:
        MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")     ->    "HEY JUDE"

    NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.

    The Morse code table is preloaded for you as a dictionary, feel free to use it:
        Java: MorseCode.get(".--")
        NASM: a table of pointers to the morsecodes, and a corresponding list of ascii symbols

    All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions.
---------------------------------------------------> */

public class K18_DecodeTheMorseCode {

    public static void main(String[] args) {

        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }

    public static String decode(String morseCode) {

        StringBuilder sb = new StringBuilder();
        int spaceCount = 0;
        for (int i = 0; i < morseCode.length(); i++) {
            if (morseCode.charAt(i) == ' ') {
                spaceCount ++;
                if (spaceCount == 3) {
                    sb.append(" ");
                    spaceCount = 0;
                }
            }
            else if (morseCode.indexOf(" ", i) > 0) {
                sb.append(morseCode.substring(i, morseCode.indexOf(" ", i))); //Should be "...append.(MorseCode.get(morseCode.substring...)"
                i = morseCode.indexOf(" ", i);
                spaceCount = 0;
            }
            else {
                sb.append(morseCode.substring(i)); //Should be "...append.(MorseCode.get(morseCode.substring...)"
                break;
            }
        }
        return sb.toString();
    }
}
