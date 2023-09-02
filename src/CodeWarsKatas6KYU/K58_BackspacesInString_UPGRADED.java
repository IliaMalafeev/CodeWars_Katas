package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
    Your task is to process a string with "#" symbols.

    Examples:
        "abc#d##c"      ==>  "ac"
        "abc##d######"  ==>  ""
        "#######"       ==>  ""
        ""              ==>  ""
---------------------------------------------------> */

public class K58_BackspacesInString_UPGRADED {

    public static void main(String[] args) {

        System.out.println(cleanString("###He##llo#"));
        System.out.println(cleanString("abc#d##c"));
        System.out.println(cleanString("abc##d######"));
        System.out.println(cleanString("#######"));
        System.out.println(cleanString(""));
        System.out.println(cleanString("d#####nw#f##h#U"));
        System.out.println(cleanString("qI##P#D##v"));

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
        return s.replaceAll("#", "").isEmpty() ? "" : s;
    }

    public static String cleanStringShortened(String s) {

        while (s.contains("#")) s = s.replaceAll("^#+|[^#]#", "");
        return s;
    }
}
