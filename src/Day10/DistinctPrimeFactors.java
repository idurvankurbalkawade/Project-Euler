/*
Q.47 Distinct Prime Factors
"The first two consecutive numbers to have two distinct prime factors are:
14 = 2 × 7
15 = 3 × 5
The first three consecutive numbers to have three distinct prime factors are:
644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.
Find the first four consecutive integers to have four distinct prime factors each. What is the first of these numbers?"
 */

package Day10;

public class DistinctPrimeFactors {

    public static int countDistinctFactors(int n){
        int count = 0;
        for (int i=2,end = (int)Math.sqrt(n);i<=end;i++)
        {
            if(n%i==0){
                do n/=i;
                while (n%i==0);
                count++;
                end = (int)Math.sqrt(n);
            }
        }
        if (n>1){
            count++;
        }
        return count;
    }

    public static boolean hasDistinctFactors(int n){
        return countDistinctFactors(n) == 4;
    }

    public static String result()
    {
        for (int i=2;;i++){
            if (hasDistinctFactors(i+0) && hasDistinctFactors(i+1) && hasDistinctFactors(i+2) && hasDistinctFactors(i+3))
                return Integer.toString(i);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(result());
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
