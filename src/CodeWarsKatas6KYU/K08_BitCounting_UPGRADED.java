package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function that takes an integer as input, and returns the number
    of bits that are equal to one in the binary representation of that number.
    You can guarantee that input is non-negative.
    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
---------------------------------------------------> */

public class K08_BitCounting_UPGRADED {

    public static void main(String[] args) {

        System.out.println(countBits(1234));
        System.out.println(countBitsUpgrade(1234));
    }

    public static int countBits(int n){

        char[] bits = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char i : bits){
            if (Integer.parseInt(String.valueOf(i)) == 1) count++;
        }
        return count;
    }

    public static int countBitsUpgrade(int n){
        return Integer.bitCount(n);
    }
}
