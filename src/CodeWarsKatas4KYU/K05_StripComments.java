package CodeWarsKatas4KYU;

import java.util.ArrayList;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
    Any whitespace at the end of the line should also be stripped out.

    Example:

        Given an input string of:

            apples, pears # and bananas
            grapes
            bananas !apples

        The output expected would be:

            apples, pears
            grapes
            bananas

    The code would be called like so:

        var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
        // result should == "apples, pears\ngrapes\nbananas"
---------------------------------------------------> */

public class K05_StripComments {

    public static void main(String[] args) {

        System.out.println(stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } ));
    }

    public static String stripComments(String text, String[] commentSymbols) {

        String[] textArray = text.split("\n");
        ArrayList<String> resultList = new ArrayList<>();

        for (String comment : textArray) {
            for (String symbol : commentSymbols) {
                if (comment.contains(symbol)) comment = comment.substring(0, comment.indexOf(symbol));
            }
            resultList.add(comment.stripTrailing());
        }
        return String.join("\n", resultList);
    }
}
