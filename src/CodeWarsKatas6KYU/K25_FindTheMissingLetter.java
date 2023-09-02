package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a method that takes an array of consecutive (increasing) letters
    as input and that returns the missing letter in the array.

    You will always get a valid array, and it will be always exactly one letter be missing.
    The length of the array will always be at least 2.
    The array will always contain letters in only one case.

    Example:
        ['a','b','c','d','f'] -> 'e'
        ['O','Q','R','S'] -> 'P'

    (Use the English alphabet with 26 letters!)
---------------------------------------------------> */

public class K25_FindTheMissingLetter {

    public static void main(String[] args) {

        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' }));
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }

    public static char findMissingLetter(char[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) return (char) (array[i] + 1);
        }
        return ' ';
    }
}
