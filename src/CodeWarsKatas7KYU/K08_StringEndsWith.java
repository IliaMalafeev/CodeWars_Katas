package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the solution so that it returns true if the first argument(string)
    passed in ends with the 2nd argument (also a string).
---------------------------------------------------> */

public class K08_StringEndsWith {
    public static void main(String[] args) {

        System.out.println(solution("String", "ng"));
        System.out.println(solution("String", "nd"));
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
