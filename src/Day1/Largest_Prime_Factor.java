package Day1;/*
Largest Prime Factor
"The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?"
 */

import java.lang.Math;
public class Largest_Prime_Factor
{
    public static long maxPrime(long n)
    {
        //initialize curr to 0
        long curr = 0;

        //if the number is divisible by 2
        if(n%2==0)
            curr = 2;
            while(n%2==0){
                n/=2;
            }

            for(long i=3;i<=Math.sqrt(n);i+=2)
            {
                while(n%i==0){
                    curr=i;
                    n/=i;
                }
            }

            if(n>2)
                curr=n;
        return curr;
    }



    public static void main(String[] args) {
        long num = 600851475143L;
        System.out.println(maxPrime(num));
    }
}
