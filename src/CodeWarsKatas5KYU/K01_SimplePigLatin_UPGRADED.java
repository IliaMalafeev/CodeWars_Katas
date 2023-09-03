package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K01_SimplePigLatin_UPGRADED {

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigItUpgraded("Hello world !"));
    }

    public static String pigIt(String str) {

        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arr){
            if (!word.replaceFirst("\\w", "").equals(word)) {
                word = word + word.charAt(0) + "ay";
                result.append(word.replaceFirst("\\w", "")).append(" ");
            }
            else result.append(word);
        }
        return result.toString().trim();
    }

    public static String pigItUpgraded(String str) {

        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
