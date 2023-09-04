package CodeWarsKatas3KYU;

/* <------------------------------------------------
    DESCRIPTION:

    The purpose of this kata is to write a program that can do some algebra.
    Write a function expand that takes in an expression with a single, one character variable, and expands it.
    The expression is in the form (ax+b)^n where a and b are integers which may be positive or negative,
    x is any single character variable, and n is a natural number. If a = 1, no coefficient will be placed
    in front of the variable. If a = -1, a "-" will be placed in front of the variable.

    The expanded form should be returned as a string in the form ax^b+cx^d+ex^f...
    where a, c, and e are the coefficients of the term,
    x is the original one character variable that was passed in the original expression
    and b, d, and f, are the powers that x is being raised to in each term and are in decreasing order.

    If the coefficient of a term is zero, the term should not be included.
    If the coefficient of a term is one, the coefficient should not be included.
    If the coefficient of a term is -1, only the "-" should be included.
    If the power of the term is 0, only the coefficient should be included.
    If the power of the term is 1, the caret and power should be excluded.

    Examples:

        KataSolution.expand("(x+1)^2");      // returns "x^2+2x+1"
        KataSolution.expand("(p-1)^3");      // returns "p^3-3p^2+3p-1"
        KataSolution.expand("(2f+4)^6");     // returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"
        KataSolution.expand("(-2a-4)^0");    // returns "1"
        KataSolution.expand("(-12t+43)^2");  // returns "144t^2-1032t+1849"
        KataSolution.expand("(r+0)^203");    // returns "r^203"
        KataSolution.expand("(-x-1)^2");     // returns "x^2+2x+1"
---------------------------------------------------> */

public class BinominalExpansion {

    public static void main(String[] args) {

        System.out.println(expand("(x+1)^2")); // x^2+2x+1
        System.out.println(expand("(p-1)^3")); // p^3-3p^2+3p-1
        System.out.println(expand("(2f+4)^6")); // 64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096
        System.out.println(expand("(-2a-4)^0")); // 1
        System.out.println(expand("(-12t+43)^2")); // 144t^2-1032t+1849
        System.out.println(expand("(r+0)^203")); // r^203
        System.out.println(expand("(-x-1)^2")); // x^2+2x+1

        System.out.println(expand("(-c+11)^2")); // tests
    }

    public static String expand(String expression){

        String firstNumber = "";
        String secondNumber = "";
        String variable = "";
        String power = expression.substring(expression.indexOf('^') + 1);
        if (Integer.parseInt(power) == 0) return "1";

        expression = expression.replaceAll("[()]", "");

        for (char x: expression.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                firstNumber = expression.substring(0, expression.indexOf(x));
                secondNumber = expression.substring(expression.indexOf(x) + 1, expression.indexOf('^'));
                variable = String.valueOf(x);
                break;
            }
        }

        int pow = Integer.parseInt(power);
        int a = firstNumber.isEmpty() ? 1 : firstNumber.equals("-") ? -1 : Integer.parseInt(firstNumber);

        int b = Integer.parseInt(secondNumber);
        if (b == 0) {
            switch (a) {
                case 1  -> {return variable + "^" + pow;}
                case -1 -> {return "-" + variable + "^" + pow;}
                default -> {return ((long) Math.pow(a, pow)) + variable + "^" + pow;}
            }
        }

        String firstPart = switch (a) {
            case 1  -> variable + "^" + pow;
            case -1 -> "-" + variable + "^" + pow;
            default -> (long) Math.pow(a, pow) + variable + "^" + pow;
        };

        if (firstPart.endsWith("^1")) firstPart = firstPart.substring(0, firstPart.indexOf("^"));
        if (firstPart.startsWith("-") && pow % 2 == 0) firstPart = firstPart.substring(1);

        long lastNumber = (long) Math.pow(b, pow);
        String lastPart = lastNumber < 0 ? String.valueOf(lastNumber) : "+" + lastNumber;

        StringBuilder middleResult = new StringBuilder();
        String anotherPart;

        for (int i = 1; i < pow; i++) {
            anotherPart = ((long) (calcBinomCoef(i, pow) * Math.pow(a, pow - i) * Math.pow(b, i))) + variable + "^" + (pow - i);
            if (anotherPart.startsWith("-")) {
                if (anotherPart.endsWith("^1")) middleResult.append(anotherPart, 0, anotherPart.indexOf("^"));
                else middleResult.append(anotherPart);
            }
            else {
                if (anotherPart.endsWith("^1")) middleResult.append("+").append(anotherPart, 0, anotherPart.indexOf("^"));
                else middleResult.append("+").append(anotherPart);
            }
        }

        return firstPart + middleResult + lastPart;
    }

    public static long calcBinomCoef(int x, int y) {

        long xFactorial = 1;
        long yFactorial = 1;
        long diffFactorial = 1;

        for (int i = 1; i <= x; i++) xFactorial *= i;
        for (int j = 1; j <= y; j++) yFactorial *= j;
        for (int i = 1; i <= y - x; i++) diffFactorial *= i;

        return yFactorial / (diffFactorial * xFactorial);
    }
}
