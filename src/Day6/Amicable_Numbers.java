/*
Q21.Amicable Numbers
"Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000."
 */

package Day6;

import java.util.ArrayList;

public class Amicable_Numbers
{
    //function to calculate the divisors of a number
    public static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int i=2;i<(n/2+1);i++)
        {
            if (n%i==0){
                list.add(i);
            }
        }
        return list;
    }

    //function to find divisor sum of number
    public static int sum(ArrayList<Integer> arr)
    {
        int sum = 0;
        for (Integer e:arr) {
            sum+=e;
        }
        return sum;
    }

    //function to find sum of amicable numbers
    public static void generateAmicable(int limit)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=1;i<limit;i++)
        {
            int a = sum(divisors(i));
            int b = sum(divisors(a));

            if(i == b && i!=a){
                if(!arr.contains(i))
                    arr.add(i);
                if(!arr.contains(i))
                    arr.add(b);
            }
        }
        System.out.println("Sum: "+sum(arr));
    }

    public static void main(String[] args) {
        int limit = 10000;
        generateAmicable(limit);
    }
}
