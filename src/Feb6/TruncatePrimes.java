/*
Q.37 Truncatable Primes
"The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes."
 */

package Feb6;

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

    //function to check number is truncatable prime or not
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

    //function to calculate sum of truncatable primes
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