package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    My friend John and I are members of the "Fat to Fit Club (FFC)".
    John is worried because each month a list with the weights of members is published
    and each month he is the last on the list which means he is the heaviest.
    I am the one who establishes the list, so I told him: "Don't worry anymore, I will modify the order of the list".
    It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.
    For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
    Given a string with the weights of FFC members in normal order
    can you give this string ordered by "weights" of these numbers?

    Example:
        "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99".

    When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering)
    and not numbers: 180 is before 90 since, having the same "weight" (9), it comes before as a string.
    All numbers in the list are positive numbers and the list can be empty.

    Notes: it may happen that the input string have leading, trailing whitespaces
    and more than a unique whitespace between two consecutive numbers.
---------------------------------------------------> */

import java.util.Arrays;

public class K07_WeightForWeight_UPGRADED {

    public static void main(String[] args) {

        System.out.println(order("56  65 74 100 99 68 86  180 90")); // "100 180 90 56 65 74 68 86 99"
        System.out.println(order("2000 10003 1234000 44444444 9999 11 11 22 123"));

        System.out.println(orderUpgrade("56  65 74 100 99 68 86  180 90")); // "100 180 90 56 65 74 68 86 99"
        System.out.println(orderUpgrade("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    public static String order(String str) {

        str = str.replaceAll(" +", " ");
        String[] arr = str.split(" ");
        String temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                int sumJ = 0, sumNextJ = 0;
                for (char y : arr[j].toCharArray()) sumJ += Integer.parseInt(String.valueOf(y));
                for (char z : arr[j + 1].toCharArray()) sumNextJ += Integer.parseInt(String.valueOf(z));

                if (sumJ > sumNextJ) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else if (sumJ == sumNextJ) {

                    for (int c = 0; c < Math.min(arr[j].length(), arr[j + 1].length()); c++) {

                        if (Math.min(arr[j].length(), arr[j + 1].length()) == 1 && Integer.parseInt(String.valueOf(arr[j].charAt(0))) == Integer.parseInt(String.valueOf(arr[j + 1].charAt(0)))){
                            if (arr[j].length() > arr[j + 1].length()) {
                                temp = arr[j + 1];
                                arr[j + 1] = arr[j];
                                arr[j] = temp;
                                break;
                            }
                        }

                        if (Integer.parseInt(String.valueOf(arr[j].charAt(c))) < Integer.parseInt(String.valueOf(arr[j + 1].charAt(c)))) {
                            break;
                        } else if (Integer.parseInt(String.valueOf(arr[j].charAt(c))) > Integer.parseInt(String.valueOf(arr[j + 1].charAt(c)))){
                            temp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String a : arr) result.append(a).append(" ");
        return result.toString().trim();
    }

    public static String orderUpgrade(String str) {

        String[] array = str.replaceAll(" +", " ").split(" ");
        Arrays.sort(array, (a, b) -> {
            int weightOfA = a.chars().map(Character::getNumericValue).sum();
            int weightOfB = b.chars().map(Character::getNumericValue).sum();
            if (weightOfA == weightOfB) return a.compareTo(b);
            return weightOfA - weightOfB;
        });

        return String.join(" ", array);
    }
}
