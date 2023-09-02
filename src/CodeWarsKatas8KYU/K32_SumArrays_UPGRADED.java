package CodeWarsKatas8KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that takes an array of numbers and returns the sum of the numbers.
    The numbers can be negative or non-integer.
    If the array does not contain any numbers then you should return 0.
---------------------------------------------------> */

public class K32_SumArrays_UPGRADED {

    public static void main(String[] args) {
        System.out.println(sum(new double[] {}));
        System.out.println(sum(new double[] {-2.398}));
        System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));

        System.out.println(sumUpgraded(new double[] {}));
        System.out.println(sumUpgraded(new double[] {-2.398}));
        System.out.println(sumUpgraded(new double[] {1, 5.2, 4, 0, -1}));
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for(double x: numbers) sum+=x;
        return sum;
    }

    public static double sumUpgraded(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
