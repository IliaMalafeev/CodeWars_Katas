package CodeWarsKatas6KYU;

public class K55_EncryptThis {
    public static void main(String[] args) {
        System.out.println(encrypt("hello world"));
        System.out.println(encrypt("A wise old owl lived in an oak"));
        System.out.println(encrypt("The more he saw the less he spoke"));
        System.out.println(encrypt("The less he spoke the more he heard"));
        System.out.println(encrypt("Why can we not all be like that wise old bird"));
        System.out.println(encrypt(""));
    }

    public static String encrypt(String text) {
        if (text.equals("")) return "";
        String[] array = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : array) {
            int firstChar = word.charAt(0);
            if (word.length() == 1) {
                sb.append(firstChar).append(" ");
                continue;
            }
            String substring = word.substring(1).replaceAll("(^\\w)(.+)(\\w$)", "$3$2$1");
            sb.append(firstChar).append(substring).append(" ");
        }
        return sb.toString().trim();
    }
}
