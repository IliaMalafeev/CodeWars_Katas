package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
    Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    You can assume you will be given an integer input. You can not assume that the integer will be only positive.
    You may be given negative numbers as well ( or 0 ).
    NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
    Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to n, or n/2, will be too slow.

    Examples:
        is_prime(1)   =>    false
        is_prime(2)   =>    true
        is_prime(-1)  =>    false
---------------------------------------------------> */

public class K32_IsANumberPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(-73));
        System.out.println(isPrime(5099));
        System.out.println(isPrime(45));
        System.out.println(isPrime(-8));
        System.out.println(isPrime(-2));
        System.out.println(isPrime(1));
        System.out.println(isPrime(860076397));
    }

    public static boolean isPrime(int num) {

        if (num < 0 || num == 1 || num == 0) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
