package CodeWarsKatas5KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Implement a function that receives two IPv4 addresses, and returns the number
    of addresses between them (including the first one, excluding the last one).

    All inputs will be valid IPv4 addresses in the form of strings.
    The last address will always be greater than the first one.

    Examples

        * With input "10.0.0.0", "10.0.0.50" => return   50
        * With input "10.0.0.0", "10.0.1.0"  => return  256
        * With input "20.0.0.10", "20.0.1.0" => return  246
        * With input "180.0.0.0", "181.0.0.0" => return 16777216
---------------------------------------------------> */

public class K21_CountIPAddresses {

    public static void main(String[] args) {

        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));    // return   50
        System.out.println(ipsBetween("1.0.0.0", "1.0.0.50"));    // return   50
        System.out.println(ipsBetween("10.0.0.0", "10.0.1.0"));     // return   256
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));    // return   246
        System.out.println(ipsBetween("180.0.0.0", "181.0.0.0"));   // return   16777216
        System.out.println(ipsBetween("0.0.0.0", "128.32.10.1"));   // return   2149583361
    }

    public static long ipsBetween(String start, String end) {

        long[] startValues = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).toArray();
        long[] endValues = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).toArray();

        long firstIpCount = (long) ((Math.pow(256, 3) * startValues[0]) + (Math.pow(256, 2) * startValues[1]) + (256 * startValues[2]) + startValues[3]);
        long secondIpCount = (long) ((Math.pow(256, 3) * endValues[0]) + (Math.pow(256, 2) * endValues[1]) + (256 * endValues[2]) + endValues[3]);

        return secondIpCount - firstIpCount;
    }
}
