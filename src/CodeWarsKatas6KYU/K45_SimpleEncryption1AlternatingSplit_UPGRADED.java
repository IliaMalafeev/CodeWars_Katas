package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed
    characters of S with all the even-indexed characters of S, this process should be repeated N times.

    Examples:
        encrypt("012345", 1)  =>  "135024"
        encrypt("012345", 2)  =>  "135024"  ->  "304152"
        encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

        encrypt("01234", 1)  =>  "13024"
        encrypt("01234", 2)  =>  "13024"  ->  "32104"
        encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"

    Together with the encryption function, you should also implement a decryption function which reverses the process.
    If the string S is an empty value or the integer N is not positive, return the first argument without changes.
---------------------------------------------------> */

public class K45_SimpleEncryption1AlternatingSplit_UPGRADED {

    public static void main(String[] args) {

        System.out.println(encrypt("0123456", 0));
        System.out.println(encrypt("0123456", 1));
        System.out.println(encrypt("0123456", 2));
        System.out.println(encrypt(null, 2));
        System.out.println("--------------------------");
        System.out.println(decrypt("3041526", 2));
        System.out.println(decrypt("1350246", 1));
        System.out.println(decrypt("0123456", 0));
        System.out.println(decrypt(null, 0));
        System.out.println("--------------------------");
        System.out.println(decryptRecursive("3041526", 2));
        System.out.println(decryptRecursive("1350246", 1));
        System.out.println(decryptRecursive("0123456", 0));
        System.out.println(decryptRecursive(null, 0));
    }

    public static String encrypt(final String text, final int n) {

        if (text == null || n == 0 || text.equals("")) return text;
        String oddChars = "", evenChars = "", result = text;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < result.length(); i++) {
                if (i % 2 == 0) evenChars += result.charAt(i);
                else oddChars += result.charAt(i);
            }
            result = oddChars + evenChars;
            evenChars = "";
            oddChars = "";
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {

        if (encryptedText == null || n == 0 || encryptedText.equals("")) return encryptedText;
        String result = encryptedText;
        String oddChars = encryptedText.substring(0, encryptedText.length() / 2),
                evenChars = encryptedText.substring(encryptedText.length() / 2);

        for (int j = 0; j < n; j++) {
            String intermediateResult = "";
            for (int i = 0; i < encryptedText.length() / 2; i++) intermediateResult = intermediateResult + evenChars.charAt(i) + oddChars.charAt(i);
            if (encryptedText.length() % 2 != 0) intermediateResult += evenChars.charAt(evenChars.length() - 1);
            result = intermediateResult;
            oddChars = intermediateResult.substring(0, encryptedText.length() / 2);
            evenChars = intermediateResult.substring(encryptedText.length() / 2);
        }

        return result;
    }

    public static String decryptRecursive(final String encryptedText, final int n) {

        if (encryptedText == null || n == 0 || encryptedText.equals("")) return encryptedText;

        int x = n;
        String result = "";
        String oddChars = encryptedText.substring(0, encryptedText.length() / 2),
                evenChars = encryptedText.substring(encryptedText.length() / 2);

        for (int i = 0; i < encryptedText.length() / 2; i++) result = result + evenChars.charAt(i) + oddChars.charAt(i);
        if (encryptedText.length() % 2 != 0) result += evenChars.charAt(evenChars.length() - 1);

        return decryptRecursive(result, --x);
    }
}
