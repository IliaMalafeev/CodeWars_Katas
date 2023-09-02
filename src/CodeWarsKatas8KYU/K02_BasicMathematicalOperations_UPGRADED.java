package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Your task is to create a function that does four basic mathematical operations.

    The function should take three arguments - operation(string/char), value1(number), value2(number).
    The function should return result of numbers after applying the chosen operation.
---------------------------------------------------> */

public class K02_BasicMathematicalOperations_UPGRADED {

    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMathUpgraded("/", 9, 4));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if (op.equals("+")) result = v1 + v2;
        if (op.equals("-")) result = v1 - v2;
        if (op.equals("*")) result = v1 * v2;
        if (op.equals("/")) result = v1 / v2;
        return result;
    }

    public static Integer basicMathUpgraded(String op, int v1, int v2) {
        switch (op) {
            case "+" -> {return v1 + v2;}
            case "-" -> {return v1 - v2;}
            case "*" -> {return v1 * v2;}
            case "/" -> {return v1 / v2;}
            default -> {return 0;}
        }
    }
}
