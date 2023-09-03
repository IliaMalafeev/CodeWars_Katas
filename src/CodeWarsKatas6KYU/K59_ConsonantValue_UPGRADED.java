package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Given a lowercase string that has alphabetic characters only and no spaces,
    return the highest value of consonant substrings.
    Consonants are any letters of the alphabet except "aeiou".
    We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.

    For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"

    -- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22. The highest is 26.
    solve("zodiacs") = 26

    For the word "strength", solve("strength") = 57
    -- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and "ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.
---------------------------------------------------> */

import java.util.Arrays;

public class K59_ConsonantValue_UPGRADED {

    public static void main(String[] args) {

        System.out.println(solve("mischtschenkoana"));  // 80
        System.out.println(solve("twelfthstreet"));     // 103
        System.out.println(solve("khrushchev"));        // 38

        System.out.println(solveUpgrade("mischtschenkoana"));  // 80
        System.out.println(solveUpgrade("twelfthstreet"));     // 103
        System.out.println(solveUpgrade("khrushchev"));        // 38
        System.out.println(solveUpgrade("zodiacsaozoa"));           // 26
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

    public static int solveUpgrade(final String s) {

        return Arrays.stream(s.split("[aeiou]"))
                .mapToInt(subSeq -> subSeq.chars().map(x -> x - 96).sum())
                .max().orElse(0);
    }
}
