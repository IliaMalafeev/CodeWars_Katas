package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    This code does not execute properly:

    public static Double multiply(Double a, Double b) {
        return a * b
    }

    Try to figure out why.
---------------------------------------------------> */

public class K09_Multiply {

    public static void main(String[] args) {
        System.out.println(multiply(3.12, 5.15));
    }

    public static Double multiply(Double a, Double b) {
        return a * b; // <---- ";" was missing
    }
}
