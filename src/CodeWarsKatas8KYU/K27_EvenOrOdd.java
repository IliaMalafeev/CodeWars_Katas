package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Create a function that takes an integer as an argument and
    returns "Even" for even numbers or "Odd" for odd numbers.
---------------------------------------------------> */

public class K27_EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(evenOrOdd(56));
        System.out.println(evenOrOdd(8273));
        System.out.println(evenOrOdd(0));
        System.out.println(evenOrOdd(-35));
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
