/*
Q.48 Self Powers
"The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000."
 */

package Feb7;

import java.math.BigInteger;

public class SelfPowers {


    //function to calculate sum of the given series
    public static String calcPowerSum()
    {
        BigInteger powerSum = BigInteger.ZERO;

        for (int i=1;i<=1000;i++)
        {
            powerSum = powerSum.add(BigInteger.valueOf(i).pow(i));
        }

        //calculate last ten digits from the sum of the series
        BigInteger lastTen = powerSum.remainder(BigInteger.TEN.pow(10));

        //System.out.println(powerSum);
        return lastTen.toString();
    }

    public static void main(String[] args) {
        System.out.println(calcPowerSum());
    }
}
