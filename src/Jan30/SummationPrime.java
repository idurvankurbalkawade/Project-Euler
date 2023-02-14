package Jan30;/*
Q10.Summation Of Primes
"The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million."
 */
import java.math.BigInteger;

public class SummationPrime {
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

    private static BigInteger AddPrime(int limit)
    {
        var summation = BigInteger.TWO;
        for (var x = 3;x<limit;x+=2){
            if(checkPrime(x)){
                summation = summation.add(BigInteger.valueOf(x));
            }
        }
        return summation;
    }

    public static void main(String[] args) {
        System.out.println("Summation: "+AddPrime(2000000));
    }
}
