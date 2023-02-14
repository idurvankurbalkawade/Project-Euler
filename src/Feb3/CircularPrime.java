/*
Q.35 Circular Primes
"The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
How many circular primes are there below one million?"
 */

package Feb3;

public class CircularPrime {

    //function to check whether a number is prime or not
    public static boolean isPrime(long num)
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

    //function to check whether a number is circular prime or not
    public static boolean checkCircular(int num)
    {
        int count = 0;
        int temp = num;

        while (temp>0)
        {
            count++;
            temp/=10;
        }

        int org = num;
        while (isPrime(org))
        {
            int rem = org%10;
            int div = org/10;
            org = (int)((Math.pow(10,count-1))*rem)+div;

            if (org==num)
                return true;
        }
        return false;
    }

    //function to take count of circular primes below specific input limit
    public static long countCircular(long limit)
    {
        long counter = 0;

        for (int i=2;i<=limit;i++)
        {
            if (checkCircular(i))
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        long input = 1000000L;
        System.out.println("Count: " + countCircular(input));
    }

}
