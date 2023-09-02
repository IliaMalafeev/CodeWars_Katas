package CodeWarsKatas8KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    You will be given an array a and a value x.
    All you need to do is check whether the provided array contains the value.
    Array can contain numbers or strings. X can be either.
    Return true if the array contains the value, false if not.
---------------------------------------------------> */

public class K30_YouOnlyNeedOneBeginner_UPGRADED {

    public static void main(String[] args) {
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));

        System.out.println(checkUpgraded(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(checkUpgraded(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }

    public static boolean check(Object[] a, Object x) {
        for (Object i : a){
            if (i.equals(x)) return true;
        }
        return false;
    }

    public static boolean checkUpgraded(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
