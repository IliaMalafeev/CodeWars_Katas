package CodeWarsKatas5KYU;

public class K05_MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr) {
        int sum = 0, tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = i; j < arr.length; j++) {
                    tempSum += arr[j];
                    if (tempSum > sum) sum = tempSum;
                }
                tempSum = 0;
            }
        }
        return sum;
    }
}
