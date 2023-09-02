package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K60_ARuleOfDivisibilityBy13 {

    public static void main(String[] args) {

        System.out.println(thirt(1234567)); // 87
        System.out.println(thirt(987654321)); // 30
        System.out.println(thirt(1111111111)); // 71
        System.out.println(thirt(5634)); // 57
    }

    public static long thirt(long n) {

        long sum = findSum(n);
        while (sum != findSum(sum)) {
            sum = findSum(sum);
        }
        return sum;
    }

    public static long findSum(long n) {

        String number = String.valueOf(n);
        int digitCount = number.length();
        long sum = 0;
        for (int i = 0; i < digitCount; i++) {
            int x = (int) (Math.pow(10, i) % 13);
            int j = digitCount - 1 - i;
            sum += (long) Integer.parseInt(String.valueOf(number.charAt(j))) * x;
        }
        return sum;
    }
}
