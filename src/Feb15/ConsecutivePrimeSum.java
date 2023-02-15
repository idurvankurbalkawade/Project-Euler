/*
Q.50 Consecutive Prime Sum
"The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.
The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
Which prime, below one-million, can be written as the sum of the most consecutive primes?"
 */

package Feb15;


import java.util.ArrayList;

public class ConsecutivePrimeSum {

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

    public static long consecutivePrime(int limit){
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for (int i=2;i<=limit;i++)
        {
            if (isPrime(i)){
                primeList.add(i);
            }
        }

        int total = 0;
        int counter = 0;
        while (total+primeList.get(counter)<limit){
            total+=primeList.get(counter);
            counter+=1;
        }

        return total;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(consecutivePrime(1000000));
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
