package CodeWarsKatas6KYU;

public class K59_ConsonantValue {
    public static void main(String[] args) {
        System.out.println(solve("mischtschenkoana"));  // 80
        System.out.println(solve("twelfthstreet"));     // 103
        System.out.println(solve("khrushchev"));        // 38
    }

    public static int solve(final String s) {
        String sNoVowels = s.replaceAll("[aeiou]", " ");
        String[] consSequences = sNoVowels.split(" ");
        int maxValue = 0;
        for (String sequence : consSequences) {
            char[] seqChars = sequence.toCharArray();
            int sum = 0;
            for (char c : seqChars) sum += c - 96;
            if (sum > maxValue) maxValue = sum;
        }
        return maxValue;
    }
}
