package CodeWarsKatas6KYU;

public class K62_ValidPhoneNumber {
    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));     // true
        System.out.println(validPhoneNumber("(1233) 456-7890"));    // false
        System.out.println(validPhoneNumber("(1233)456-7890"));     // false
        System.out.println(validPhoneNumber("(123) 456 7890"));     // false
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }
}
