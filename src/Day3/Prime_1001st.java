package Day3;/*
Q7. 10001st Prime
"By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?"
 */

import java.lang.Math;
public class Prime_1001st
{
    private static boolean checkPrime(long num)
    {
        int counter = 0;
        long sqrt = (long) Math.sqrt(num);

        for(long x = 1;x<=sqrt;x++)
        {
            if(num % x == 0)
                counter++;

            if(counter>1)
                return false;
        }
        return true;
    }

    private static long TenThousandAndFirstPrime(long limit)
    {
        long counter = 1;
        long res = 0;

        for(long x = 2;counter<=limit;x++)
        {
            if(checkPrime(x)){
                res = x;
                counter++;
            }
        }

        return res;
    }
    public static void main(String[] args)
    {
        //System.out.println(checkPrime(20));
        System.out.println("10001st Prime Number: "+TenThousandAndFirstPrime(10001));
    }
}
