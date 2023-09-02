package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

    Rules for a smiling face:

    Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
    A smiley face can have a nose, but it does not have to. Valid characters for a nose are - or ~
    Every smiling face must have a smiling mouth that should be marked with either ) or D
    No additional characters are allowed except for those mentioned.

    Valid smiley face examples: :) :D ;-D :~)
    Invalid smiley faces:  ;( :> :} :]

    Example
        countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
        countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
        countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

    In case of an empty array return 0.
    You will not be tested with invalid input (input will always be an array).
    Order of the face (eyes, nose, mouth) elements will always be the same.
---------------------------------------------------> */

public class K29_CountTheSmileyFaces_UPGRADED {

    public static void main(String[] args) {

        System.out.println(countSmileys(new String[]{";]", ":[", ";*", ":$", ";-D"}));
        System.out.println(countSmileysUpgrade(new String[]{";]", ":[", ";*", ":$", ";-D"}));
        System.out.println(countSmileys(new String[]{";D", ":-(", ":-)", ";~)", ":-~D"}));
        System.out.println(countSmileysUpgrade(new String[]{";D", ":-(", ":-)", ";~)", ":-~D"}));
        //"(:|;)(-?|~?)(\\)|D)"
    }

    public static int countSmileys(String[] array) {

        int count = 0;
        for (String x : array) {
            if (x.matches("(:|;)(-?|~?)(\\)|D)")) count++;
        }
        return count;
    }

    public static int countSmileysUpgrade(String[] array) {
        return (int) Arrays.stream(array).filter(x -> x.matches("(:|;)(-?|~?)(\\)|D)")).count();
    }
}
