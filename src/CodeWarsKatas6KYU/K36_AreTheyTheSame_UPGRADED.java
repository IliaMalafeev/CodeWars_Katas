package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Given two arrays a and b write a function comp(a, b) that checks whether the two arrays have the "same" elements,
    with the same multiplicities (the multiplicity of a member is the number of times it appears).
    "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

    Examples:

        Valid arrays:

            a = [121, 144, 19, 161, 19, 144, 19, 11]    and     b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
            comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121,
            20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on.

            It gets obvious if we write b's elements in terms of squares:
            a = [121, 144, 19, 161, 19, 144, 19, 11]    and     b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]

        Invalid arrays:

            If, for example, we change the first number to something else, comp is not returning true anymore:

            a = [121, 144, 19, 161, 19, 144, 19, 11]    and     b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
            comp(a,b) returns false because in b 132 is not the square of any number of a.

            a = [121, 144, 19, 161, 19, 144, 19, 11]    anf     b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
            comp(a,b) returns false because in b 36100 is not the square of any number of a.

    Remarks
    a or b might be [] or {} (all languages except R, Shell). a or b might be nil or null or None or nothing.
    If a or b are nil (or null or None, depending on the language), the problem doesn't make sense so return false.
---------------------------------------------------> */

public class K36_AreTheyTheSame_UPGRADED {

    public static void main(String[] args) {

        int[] a1 = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b1 = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        int[] a2 = new int[]{0, -14, 191, 161, 19, 144, 195, 1, 2};
        int[] b2 = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025, 3};

//        System.out.println(comp(a1, b1));
//        System.out.println(comp(a2, b2));

        System.out.println(compUpgrade(a1, b1));
        System.out.println(compUpgrade(a2, b2));
    }

    public static boolean comp(int[] a, int[] b) {

        if (a.length != b.length) return false;
        for (int i = 0; i < b.length; i++) {
            a[i] = Math.abs(a[i]);
            b[i] = (int) Math.sqrt(b[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static boolean compUpgrade(int[] a, int[] b) {

        if (a.length != b.length) return false;
        int[] formattedA = Arrays.stream(a).map(Math::abs).sorted().toArray();
        int[] formattedB = Arrays.stream(b).map(x -> (int) Math.sqrt(x)).sorted().toArray();

        return Arrays.equals(formattedA, formattedB);
    }
}
