package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Complete the function so that it finds the average
    of the three scores passed to it and returns
    the letter value associated with that grade.

    Numerical Score         Letter Grade
    90 <= score <= 100	    'A'
    80 <= score < 90	    'B'
    70 <= score < 80	    'C'
    60 <= score < 70	    'D'
    0 <= score < 60	        'F'

    Tested values are all between 0 and 100.
    There is no need to check for negative values
    or values greater than 100.
---------------------------------------------------> */

public class K33_GrasshopperGradeBook {

    public static void main(String[] args) {

        System.out.println(getGrade(90, 99, 89));
        System.out.println(getGrade(75, 81, 93));
        System.out.println(getGrade(60, 82, 76));
        System.out.println(getGrade(58, 62, 70));
        System.out.println(getGrade(48, 55, 52));
    }

    public static char getGrade(int s1, int s2, int s3) {

        double average = (s1 + s2 + s3) / 3.0;

        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
}
