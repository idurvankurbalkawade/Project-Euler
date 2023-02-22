/*
Q.63 Powerful Digit Counts
"The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.
How many n-digit positive integers exist which are also an nth power?"
 */


package Feb22;

import java.math.BigInteger;

public class PowerfulDigitCounts {

    public static String calculate()
    {
        int count = 0;

        for (int n=1;n<=9;n++){
            for (int k=1;k<=21;k++){
                if (BigInteger.valueOf(n).pow(k).toString().length()==k)
                    count++;
            }
        }

        return Integer.toString(count);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(calculate());
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
