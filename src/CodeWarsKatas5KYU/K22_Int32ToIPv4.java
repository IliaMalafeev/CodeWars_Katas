package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Take the following IPv4 address: 128.32.10.1

    This address has 4 octets where each octet is a single byte (or 8 bits).

        1st octet 128 has the binary representation: 10000000
        2nd octet 32 has the binary representation: 00100000
        3rd octet 10 has the binary representation: 00001010
        4th octet 1 has the binary representation: 00000001
        So 128.32.10.1 == 10000000.00100000.00001010.00000001

    Because the above IP address has 32 bits, we can represent it as
    the unsigned 32-bit number: 2149583361

    Complete the function that takes an unsigned 32-bit number
    and returns a string representation of its IPv4 address.

    Examples:

        2149583361 ==> "128.32.10.1"
        32         ==> "0.0.0.32"
        0          ==> "0.0.0.0"
---------------------------------------------------> */

public class K22_Int32ToIPv4 {

    public static void main(String[] args) {

        System.out.println(longToIP(2154959208L));  // return   128.114.17.104
        System.out.println(longToIP(2149583361L));  // return   128.32.10.1
        System.out.println(longToIP(16777216));     // return   1.0.0.0
        System.out.println(longToIP(0));            // return   0.0.0.0
    }

    public static String longToIP(long ip) {

        StringBuilder ipStr = new StringBuilder();

        for (int i = 3; i > 0; i--) {

            ipStr.append((long) (ip / (Math.pow(256, i)))).append(".");
            ip = ip % ((long) Math.pow(256, i));
        }

        ipStr.append(ip);

        return ipStr.toString();
    }
}
