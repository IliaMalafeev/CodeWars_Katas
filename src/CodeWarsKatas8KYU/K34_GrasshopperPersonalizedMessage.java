package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Create a function that gives a personalized greeting.
    This function takes two parameters: name and owner.
    Use conditionals to return the proper message:

    CASE                    RETURN
    name equals owner       'Hello boss'
    otherwise               'Hello guest'
---------------------------------------------------> */

public class K34_GrasshopperPersonalizedMessage {

    public static void main(String[] args) {
        System.out.println(greet("Jack", "Jack"));
        System.out.println(greet("John", "Jack"));
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
