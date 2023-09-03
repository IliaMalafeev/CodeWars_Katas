package CodeWarsKatas5KYU;

public class K11_NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        System.out.println(zeros(6));
        System.out.println(zeros(840547743));
    }

    public static int zeros(int n) {
        int result = 0;
        while (n > 1) {
            n /= 5;
            result += n;
        }
        return result;
    }
}
