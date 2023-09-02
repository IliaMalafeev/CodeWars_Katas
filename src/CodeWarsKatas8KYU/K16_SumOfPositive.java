package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    You get an array of numbers, return the sum of all of the positives ones.
---------------------------------------------------> */

public class K16_SumOfPositive {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{-1,2,3,4,-5}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int nextNumber : arr){
            if (nextNumber > 0) sum += nextNumber;
        }
        return sum;
    }
}
