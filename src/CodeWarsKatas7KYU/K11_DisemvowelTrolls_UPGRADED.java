package CodeWarsKatas7KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Trolls are attacking your comment section! A common way to deal with this situation
    is to remove all the vowels from the trolls' comments, neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

    Note: for this kata y isn't considered a vowel.
---------------------------------------------------> */

public class K11_DisemvowelTrolls_UPGRADED {

    public static void main(String[] args) {

        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowelUpgraded("No offense but,\nYour writing is among the worst I've ever read"));
    }

    public static String disemvowel(String str) {

        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (Arrays.binarySearch(vowels, str.charAt(i)) < 0) result += str.charAt(i);
        }
        return result;
    }

    public static String disemvowelUpgraded(String str){
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
