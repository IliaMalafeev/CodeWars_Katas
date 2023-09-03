package CodeWarsKatas5KYU;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class K12_PerimeterOfSquaresInARectangle {
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(434)));
    }

    public static BigInteger perimeter(BigInteger n) {
        long y = Long.parseLong(String.valueOf(n.add(BigInteger.valueOf(2))));
        BigInteger result = BigInteger.valueOf(0);
        List<BigInteger> list = Stream.iterate(new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1)}, x -> new BigInteger[]{x[1], x[0].add(x[1])}).map(x -> x[0]).limit(y).toList();
        for (BigInteger x : list) {
            result = result.add(x);
        }
        return result.multiply(BigInteger.valueOf(4));
    }
}
