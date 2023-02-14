/*
Q.30 Digit Fifth Powers
"Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.
The sum of these numbers is 1634 + 8208 + 9474 = 19316.
Find the sum of all the numbers that can be written as the sum of fifth powers of their digits."
 */

package Feb2;

import java.math.BigInteger;

public class DigitFifthPowers {

    //calculate sum of the fifth powers of digits of a number
    private static int fifthDigitPower(int x){
        int sum = 0;

        while (x != 0) {
            int rem = x%10;
            sum+=Math.pow(rem,5);
            x/=10;
        }
        return sum;
    }

    //function to calculate numbers that can be written as sum of the fifth power of their digits
    private static BigInteger fifthDigitPowerSum(int limit)
    {
        int sum = 0;
        for (int i=2;i<limit;i++)
        {
            if (i == fifthDigitPower(i))
                sum+=i;
        }
        return BigInteger.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println(fifthDigitPowerSum(200000));
    }
}
