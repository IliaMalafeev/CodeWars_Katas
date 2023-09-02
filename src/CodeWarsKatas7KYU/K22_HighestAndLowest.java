package CodeWarsKatas7KYU;

/* <------------------------------------------------
    DESCRIPTION:

    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.
---------------------------------------------------> */

public class K22_HighestAndLowest {

    public static void main(String[] args) {

        System.out.println(highAndLow("1 -1"));         // return "1 -1"
        System.out.println(highAndLow("1 2 3 4 5"));    // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));   // return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));   // return "9 -5"
    }

    public static String highAndLow(String numbers) {

        String [] numbersArr = numbers.split(" |\n");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String x : numbersArr) if (Integer.parseInt(x) < min) min = Integer.parseInt(x);
        for (String x : numbersArr) if (Integer.parseInt(x) > max) max = Integer.parseInt(x);
        return max + " " + min;
    }

}
