package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Create a function taking a positive integer between 1 and 3999 (both included) as its parameter
    and returning a string containing the Roman Numeral representation of that integer.
    Modern Roman numerals are written by expressing each digit separately
    starting with the left most digit and skipping any digit with a value of zero.
    In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
    2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

    Example: conversion.solution(1000); //should return "M"

    Help:
        Symbol    Value
        I          1
        V          5
        X          10
        L          50
        C          100
        D          500
        M          1,000

    Remember that there can't be more than 3 identical symbols in a row.
---------------------------------------------------> */

public class K43_RomanNumeralsEncoder {

    public static void main(String[] args) {

        System.out.println(solution(1876)); //MDCCCLXXVI
    }

    public static String solution(int n) {

        String[] thousands = {"", "M", "MM", "MMM"},
                 hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                 tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                 units     = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String result      = "";

        int nUnits = n % 10;
        n /= 10;
        int nTens = n % 10;
        n /= 10;
        int nHundreds = n % 10;
        n /= 10;
        int nThousands = n % 10;

        result += thousands[nThousands] + hundreds[nHundreds] + tens[nTens] + units[nUnits];

        return result;
    }
}
