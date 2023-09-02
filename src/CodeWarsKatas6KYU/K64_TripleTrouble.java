package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K64_TripleTrouble {

    public static void main(String[] args) {

        System.out.println(TripleDouble(1222345L, 12345L)); // 0
        System.out.println(TripleDouble(451999277L, 41177722899L)); // 1
    }

    public static int TripleDouble(long num1, long num2) {

        for (int i = 0; i < 10; i++) {
            if (String.valueOf(num1).contains(String.valueOf(i).repeat(3))) {
                if (String.valueOf(num2).contains(String.valueOf(i).repeat(2))) return 1;
            }
        }
        return 0;
    }
}
