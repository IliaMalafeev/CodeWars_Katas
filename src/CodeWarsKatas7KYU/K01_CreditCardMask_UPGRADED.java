package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Usually when you buy something, you're asked whether your credit card number,
    phone number or answer to your most secret question is still correct.
    However, since someone could look over your shoulder,
    you don't want that shown on your screen. Instead, we mask it.

    Your task is to write a function maskify, which changes all but the last four characters into '#'.

    Examples:   "4556364607935616" --> "############5616"
                "64607935616" --> "#######5616"
                "1" --> "1"
                "" --> ""
                "Skippy" --> "##ippy"
                "Nananananananananananananananana Batman!" --> "####################################man!"
-------------------------------------------------------------------------------------------------------------> */

public class K01_CreditCardMask_UPGRADED {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskifyUpgraded("4556364607935616"));
    }

    public static String maskify(String str) {

        if (str.length() < 4) return str;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length - 4; i++){
            array[i] = '#';
        }
        return String.copyValueOf(array);
    }

    public static String maskifyUpgraded(String str) {
        return str.length() < 5 ? str : "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
    }
}
