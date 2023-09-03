package CodeWarsKatas5KYU;

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
