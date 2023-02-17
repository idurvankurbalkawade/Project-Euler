/*
Q.55 Powerful Digit Sum
"A googol (10100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.
Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?"
 */


package Feb17;

import java.math.BigInteger;

public class PowerfulDigitSum {

    public static int calculateSum(BigInteger num)
    {
        int sum = 0;
        String str = num.toString();

        for (int i=0;i<str.length();i++)
            sum+=str.charAt(i)-'0';
        return sum;
    }

    public static String maxDigitSum()
    {
        int max = 0;
        for (int a=1;a<100;a++)
        {
            for (int b=1;b<100;b++)
            {
                BigInteger power = BigInteger.valueOf(a).pow(b);
                max = Math.max(calculateSum(power),max);
            }
        }

        return Integer.toString(max);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(maxDigitSum());
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }

}
