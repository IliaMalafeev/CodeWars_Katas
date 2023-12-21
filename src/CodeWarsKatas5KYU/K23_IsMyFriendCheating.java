package CodeWarsKatas5KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    A friend of mine takes the sequence of all numbers from 1 to n (where n > 0).
    Within that sequence, he chooses two numbers, a and b. He says that the product
    of a and b should be equal to the sum of all numbers in the sequence, excluding a and b.
    Given a number n, could you tell me the numbers he excluded from the sequence?
    The function takes the parameter: n (n is always strictly greater than 0) and
    returns an array or a string (depending on the language) of the form:

        [(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or [{a, b}, ...]
        with all (a, b) which are the possible removed numbers in the sequence 1 to n
        sorted in increasing order of the "a".

    It happens that there are several possible (a, b). The function returns
    an empty array (or an empty string) if no possible numbers are found
    which will prove that my friend has not told the truth!.

    Examples:
        removeNb(26) should return { {15, 21}, {21, 15} }
---------------------------------------------------> */

public class K23_IsMyFriendCheating {

    public static void main(String[] args) {

        removeNb(26).forEach(x -> System.out.print(Arrays.toString(x)));   // return   [15, 21][21, 15]
        System.out.println();
        removeNb(101086).forEach(x -> System.out.print(Arrays.toString(x)));   // return   [54561, 93640][93640, 54561]
    }

    public static List<long[]> removeNb(long n) {

        List<long[]> result = new ArrayList<>();

        long totalSum = (n * (n + 1)) / 2;

        for (int i = 2; i <= n; i++) {

            if ((totalSum + 1) % i == 0) {

                if ((totalSum + 1) / i < n) {

                    result.add(new long[] {i - 1, ((totalSum + 1) / i) - 1});
                }
            }
        }

        return result;
    }
}
