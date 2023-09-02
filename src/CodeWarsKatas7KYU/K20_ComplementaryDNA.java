package CodeWarsKatas7KYU;

import java.util.HashMap;

/* <------------------------------------------------
    DESCRIPTION:

    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
    carries the "instructions" for the development and functioning of living organisms.

    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
    Your function receives one side of the DNA (string, except for Haskell).
    You need to return the other complementary side.
    DNA strand is never empty or there is no DNA at all (again, except for Haskell).

    Example:    "ATTGC" --> "TAACG"
                "GTAT"  --> "CATA"
---------------------------------------------------> */

public class K20_ComplementaryDNA {

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }

    public static String makeComplement(String DNA){

        HashMap<String, String> DNAcomplements = new HashMap<>();
        DNAcomplements.put("A", "T");
        DNAcomplements.put("T", "A");
        DNAcomplements.put("C", "G");
        DNAcomplements.put("G", "C");

        char[] stringToChars = DNA.toCharArray();
        String result = "";
        for (char x : stringToChars) result = (result + DNAcomplements.get(String.valueOf(x))).trim();
        return result;
    }
}
