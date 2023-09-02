package CodeWarsKatas6KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Your task is to construct a building which will be a pile of n cubes.
    The cube at the bottom will have a volume of n^3, the cube above will have volume of (n - 1)^3
    and so on until the top which will have a volume of 1^3.
    You are given the total volume m of the building.
    Being given m can you find the number n of cubes you will have to build?

    The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m,
    and you have to return the integer n such as n^3 + (n - 1)^3 + (n - 2)^3 + ... + 1^3 = m
    if such a n exists or -1 if there is no such n.

    Examples:
        findNb(1071225) --> 45
        findNb(91716553919377) --> -1
---------------------------------------------------> */

public class K30_BuildAPileOfCubes {

    public static void main(String[] args) {

        System.out.println(findNb(1071225));
        System.out.println(findNb(91716553919377L));
        System.out.println(findNb(1778703625400391361L));
    }

    public static long findNb(long m) {

        long sum = 0;
        for (long i = 1; i < m; i++) {
            sum += (long) Math.pow(i, 3);
            if (sum == m) return i;
            if (sum > m) return - 1;
        }
        return 0;
    }
}
