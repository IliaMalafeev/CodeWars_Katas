package CodeWarsKatas5KYU;

public class K18_NotVerySecure {
    public static void main(String[] args) {
        System.out.println(alphanumeric("hel112lo"));
    }

    public static boolean alphanumeric(String s) {
        if (s.equals("")) return false;
        return s.replaceAll("[^\\w]|_", "").length() == s.length();
    }
}
