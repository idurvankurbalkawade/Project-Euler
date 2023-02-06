package Day8;

import java.math.BigInteger;

public class TruncatePrimes {

    //function to check whether a number is prime or not
    public static boolean isPrime(int num)
    {
        if (num<=1)
            return false;
        for (int i = 2;i<=Math.sqrt(num);i++){
            if (num%i==0)
                return false;
        }
        return true;
    }

    private static boolean checkTruncatePrime(int n)
    {
        // left to right
        for (long i=10;i<=n;i*=10)
        {
            if (!isPrime(n % (int) i))
                return false;
        }
        //Test for right truncatable
        for (;n!=0;n/=10)
        {
            if (!isPrime(n)){
                return false;
            }
        }
        return true;
    }

    public static String sumTruncate()
    {
        long sum = 0;
        for (int count = 0,n = 10;count<11;n++){
            if (checkTruncatePrime(n)){
                sum+=n;
                count++;
            }
        }
        return Long.toString(sum);
    }

    public static void main(String[] args) {
        System.out.println(sumTruncate());
    }
}