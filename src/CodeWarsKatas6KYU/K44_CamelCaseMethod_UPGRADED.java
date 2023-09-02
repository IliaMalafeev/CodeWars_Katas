package CodeWarsKatas6KYU;

import java.util.Arrays;
import java.util.stream.Collectors;

/* <------------------------------------------------
    DESCRIPTION:

    Write a method (or function, depending on the language) that converts a string to camelCase,
    that is, all words must have their first letter capitalized and spaces must be removed.

    Examples (input --> output):
        "hello case" --> "HelloCase"
        "camel case word" --> "CamelCaseWord"
---------------------------------------------------> */

public class K44_CamelCaseMethod_UPGRADED {

    public static void main(String[] args) {

        System.out.println(camelCase(" camel  case   method"));
        System.out.println(camelCase(""));
        System.out.println("-------------------");
        System.out.println(camelCaseUpgraded(" camel  case   method"));
        System.out.println(camelCaseUpgraded(""));
    }

    public static String camelCase(String str) {

        if (str.isEmpty()) return "";
        String[] array = str.trim().split(" +");
        StringBuilder result = new StringBuilder();
        for (String s : array) {
            result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
        }
        return result.toString();
    }

    public static String camelCaseUpgraded(String str) {

        return str.isEmpty() ? "" :
                Arrays.stream(str.trim().split("\\s+")).
                map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).
                collect(Collectors.joining());
    }
}
