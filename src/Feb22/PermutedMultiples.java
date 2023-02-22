/*
Q.52 Permuted Multiples
"It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits."
 */

package Feb22;

import java.util.Arrays;

public class PermutedMultiples {

    public static char[] sortDigits(int x)
    {
        char[] result = Integer.toString(x).toCharArray();
        Arrays.sort(result);
        return result;
    }

    public static boolean sameDigits(int x)
    {
        for (int i=2;i<=6;i++)
        {
            if (!Arrays.equals(sortDigits(x),sortDigits(i*x)))
                return false;
        }
        return true;
    }

    public static String calcMultiples()
    {
        for (int i=1;;i++)
        {
            if (i> Integer.MAX_VALUE/6)
                throw new ArithmeticException("overflow");
            if (sameDigits(i))
                return Integer.toString(i);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(calcMultiples());
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
