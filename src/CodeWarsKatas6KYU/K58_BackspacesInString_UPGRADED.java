package CodeWarsKatas6KYU;

public class K58_BackspacesInString_UPGRADED {
    public static void main(String[] args) {
        System.out.println(cleanStringShortened("###He##llo#"));
        System.out.println(cleanStringShortened("abc#d##c"));
        System.out.println(cleanStringShortened("abc##d######"));
        System.out.println(cleanStringShortened("#######"));
        System.out.println(cleanStringShortened(""));
        System.out.println(cleanStringShortened("d#####nw#f##h#U"));
        System.out.println(cleanStringShortened("qI##P#D##v"));
    }

    public static String cleanString(String s) {
        int y = s.length();
        for (int i = 0; i <= y; i++) s = s.replaceAll("^#+|[^#]#", "");
        return s.replaceAll("#", "").length() == 0 ? "" : s;
    }

    public static String cleanStringShortened(String s) {
        while (s.contains("#")) s = s.replaceAll("^#+|[^#]#", "");
        return s;
    }
}
