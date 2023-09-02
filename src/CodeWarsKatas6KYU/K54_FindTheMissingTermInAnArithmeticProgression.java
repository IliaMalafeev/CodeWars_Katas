package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    An Arithmetic Progression is defined as one in which there is a constant
    difference between the consecutive terms of a given series of numbers.
    You are provided with consecutive elements of an Arithmetic Progression.
    There is however one hitch: exactly one term from the original series is
    missing from the set of numbers which have been given to you.
    The rest of the given series is the same as the original AP.
    Find the missing term.

    You have to write a function that receives a list, list size will always be at least 3 numbers.
    The missing term will never be the first or last one.

    Example: findMissing([1, 3, 5, 9, 11]) == 7
---------------------------------------------------> */

public class K54_FindTheMissingTermInAnArithmeticProgression {

    public static void main(String[] args) {

        System.out.println(findMissing(new int[]{ 1, 2, 4}));
        System.out.println(findMissing(new int[]{ 1, 3, 4}));
        System.out.println(findMissing(new int[]{ 4, 2, 1}));
        System.out.println(findMissing(new int[]{ 1, 1, 1}));
    }

    public static int findMissing(int[] numbers) {

        for (int i = 2; i < numbers.length; i++) {
            int dif = numbers[i] - numbers[i - 1];
            int dif2 = numbers[i - 1] - numbers[i - 2];
            if (dif == dif2) continue;
            if (dif > dif2) return numbers[i] - dif2;
            return numbers[i - 2] + dif;
        }

        return numbers[0];
    }
}
