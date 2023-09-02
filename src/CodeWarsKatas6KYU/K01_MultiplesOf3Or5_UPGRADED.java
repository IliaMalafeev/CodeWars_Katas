package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.
    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
    Note: If the number is a multiple of both 3 and 5, only count it once.
---------------------------------------------------> */

import java.util.stream.IntStream;

public class K01_MultiplesOf3Or5_UPGRADED {

    public static void main(String[] args) {

        System.out.println(solution(10));
        System.out.println(solutionUpgraded(10));

        System.out.println(solution(100));
        System.out.println(solutionUpgraded(100));
    }

    public static int solution(int number) {

        if (number < 0) return 0;
        int sum = 0;
        for (int i = 0; i < number; i++){
            if (i % 3 == 0) sum = sum + i;
            else if (i % 5 == 0) sum = sum + i;
            else continue;
        }
        return sum;
    }

    public static int solutionUpgraded(int number) {

        return IntStream.range(0, number).filter(x -> (x % 3 == 0) || (x % 5 == 0)).sum();
    }
}
