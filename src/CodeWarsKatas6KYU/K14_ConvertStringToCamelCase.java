package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case).
    The next words should be always capitalized.

    Examples:
        "the-stealth-warrior" -> "theStealthWarrior"
        "The_Stealth_Warrior" -> "TheStealthWarrior"
        "The_Stealth-Warrior" -> "TheStealthWarrior"
---------------------------------------------------> */

public class K14_ConvertStringToCamelCase {

    public static void main(String[] args) {

        System.out.println(toCamelCase("the_stealth_warrior"));
        System.out.println(toCamelCase("The_stealth_warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }

    static String toCamelCase(String s) {

        char[] x = s.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == '-' || x[i] == '_') {
                x[i] = ' ';
                x[i + 1] = Character.toUpperCase(x[i + 1]);
            }
        }
        return new String(x).replaceAll(" ", "");
    }
}
