package CodeWarsKatas6KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Your task, is to create N×N multiplication table, of size provided in parameter.
    For example, when given size is 3:

        1 2 3
        2 4 6
        3 6 9

    For the given example, the return value should be: [[1,2,3],[2,4,6],[3,6,9]].
---------------------------------------------------> */

public class K50_MultiplicationTable {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(multiplicationTable(1)));
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
        System.out.println(Arrays.deepToString(multiplicationTable(10)));
    }

    public static int [][] multiplicationTable(int n){

        int [][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }
}
