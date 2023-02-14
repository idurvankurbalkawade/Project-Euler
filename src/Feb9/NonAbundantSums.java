/*
Q.23 Non-abundant Sums
"A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
A number n is called deficient if the sum of its proper divisors is less than n, and it is called abundant if this sum exceeds n.
As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers."
 */

package Feb9;

import java.util.ArrayList;
import java.util.HashSet;

public class NonAbundantSums {


    //function to check whether a number is an abundant number or not
    public static boolean isAbundantNumber(int value)
    {
        var sqrt = Math.sqrt(value);
        HashSet<Integer> list = new HashSet<Integer>();
        var sum = 0;

        list.add(1);

        for (int i=2;i<=sqrt;i++){
            if (value%i==0){
                list.add(i);
                list.add(value/i);
            }
        }

        for (var n:list){
            sum+=n;
        }

        return sum>value;
    }

    //function to generate abundant numbers
    public static ArrayList<Integer> generateAbundantNumbers(int limit){

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int n=12;n<=limit;n++){
            if (isAbundantNumber(n)){
                numList.add(n);
            }
        }

        return numList;
    }

    //function to calculate sum of abundant numbers
    public static int abundantSum(int limit){

        int[] array = new int[limit+1];
        var list = generateAbundantNumbers(limit);

        for (int i=0;i<list.size();i++){
            for (int j=i;j<list.size();j++){
                var sum = list.get(i)+list.get(j);
                if (sum<=limit)
                    array[sum] = sum;
            }
        }

        var sum = 0;
        for (var index=1;index<limit;index++){
            if (array[index]!=index)
                sum+=index;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(abundantSum(28123));
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }

}
