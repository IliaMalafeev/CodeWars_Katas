package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    <---------------THIS KATA IS MARKED "RETIRED".---------------->

    Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
    The function should return true if the string is valid, and false if it's invalid.

    Examples:
        "()"              =>  true
        ")(()))"          =>  false
        "("               =>  false
        "(())((()())())"  =>  true

    Constraints: 0 <= input.length <= 100
    Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
    Furthermore, the input string may be empty and/or not contain any parentheses at all.
    Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
---------------------------------------------------> */

public class KXX_ValidParenthesis {

    public static void main(String[] args) {

        System.out.println(validParentheses( "(dsgdsg))2432" ));
        System.out.println(validParentheses( "V(E)Z(w(4x(((h)()bWwiGKX);gkM)2ww\\A)mls)U.ZI" ));
        System.out.println(validParentheses( "(())((()())())" ));
    }

    public static boolean validParentheses(String parens) {

        parens = parens.replaceAll ("[^)(]", "");
        int x = parens.length();
        for (int i = 0; i < x; i++) parens = parens.replaceAll("\\(\\)", "");
        return parens.isEmpty();
    }
}
