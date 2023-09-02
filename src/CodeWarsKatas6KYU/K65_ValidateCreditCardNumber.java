package CodeWarsKatas6KYU;

public class K65_ValidateCreditCardNumber {
    public static void main(String[] args) {
        System.out.println(validate("891"));
        System.out.println(validate("123"));
    }

    public static boolean validate(String n){
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int x = Integer.parseInt(String.valueOf(n.charAt(i)));
            int y = x * 2 > 9 ? (x * 2) - 9 : x * 2;
            if (n.length() % 2 == 0 && i % 2 == 0) {
                sum += y;
                continue;
            }
            if (n.length() % 2 == 1 && i % 2 == 1) {
                sum += y;
                continue;
            }
            sum += x;
        }
        return sum % 10 == 0;
    }
}
