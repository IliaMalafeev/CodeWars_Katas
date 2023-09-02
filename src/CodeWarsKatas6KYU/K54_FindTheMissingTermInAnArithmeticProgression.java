package CodeWarsKatas6KYU;

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
