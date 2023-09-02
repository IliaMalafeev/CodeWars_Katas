package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Check to see if a string has the same amount of 'x's and 'o's.
    The method must return a boolean and be case-insensitive.
    The string can contain any char.
---------------------------------------------------> */

public class K09_ExesAndOhs_UPGRADED {
    public static void main(String[] args) {

        System.out.println(getXO("XXxxOoo"));
        System.out.println(getXO("XXxOoo"));

        System.out.println(getXOUpgraded("XXxxOoo"));
        System.out.println(getXOUpgraded("XXxOoo"));
    }

    public static boolean getXO(String str){
        int exes = 0, ohs = 0;
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) == 'x') || (str.charAt(i) == 'X')) exes++;
            if ((str.charAt(i) == 'o') || (str.charAt(i) == 'O')) ohs++;
        }
        return exes == ohs;
    }

    public static boolean getXOUpgraded(String str){

        return str.toLowerCase().chars().filter(c -> c == 'x').count() == str.toLowerCase().chars().filter(c -> c == 'o').count();
    }
}
