package CodeWarsKatas5KYU;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

/* <------------------------------------------------
    DESCRIPTION:

    The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8.
    It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

    Could you give the sum of the perimeters of all the squares in a rectangle
    when there are n + 1 squares disposed in the same manner as in the drawing:

    <-----alternative text----->

    Hint: See Fibonacci sequence
    Ref: http://oeis.org/A000045

    The function perimeter has for parameter n where n + 1 is the number of squares
    (they are numbered from 0 to n) and returns the total perimeter of all the squares.

    perimeter(5)  should return 80
    perimeter(7)  should return 216
---------------------------------------------------> */

public class K12_PerimeterOfSquaresInARectangle {

    public static void main(String[] args) {

        System.out.println(perimeter(BigInteger.valueOf(434)));
    }

    public static BigInteger perimeter(BigInteger n) {

        long y = Long.parseLong(String.valueOf(n.add(BigInteger.valueOf(2))));
        BigInteger result = BigInteger.valueOf(0);

        List<BigInteger> list = Stream.iterate(new BigInteger[]{BigInteger.valueOf(0), BigInteger.valueOf(1)}, x -> new BigInteger[]{x[1], x[0].add(x[1])})
                .map(x -> x[0]).limit(y).toList();

        for (BigInteger x : list) {
            result = result.add(x);
        }

        return result.multiply(BigInteger.valueOf(4));
    }
}
