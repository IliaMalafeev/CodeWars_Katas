package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
---------------------------------------------------> */

public class K14_VowelCount_UPGRADED {
    public static void main(String[] args) {
        System.out.println(getCount("Hello"));
        System.out.println(getCountUpgraded("Hello"));
        System.out.println(getCountUpgraded("abracadabra"));
    }

    public static int getCount(String str) {

        int vowelsCount = 0;
        String [] vowels = {"a", "e", "i", "o", "u"};
        char [] strToChars = str.toCharArray();
        for (int i=0; i < strToChars.length; i++){
            for (int j = 0; j < vowels.length; j++){
                if (String.valueOf(strToChars[i]).equals(vowels[j])) vowelsCount += 1;
            }
        }
        return vowelsCount;
    }

    public static int getCountUpgraded(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }
}
