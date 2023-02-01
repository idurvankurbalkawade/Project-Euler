/*
Q.34 Digit Factorials
"145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included."
 */

package Day5;

public class DigitFactorials {

    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }

        return fact;
    }

    public static boolean SumEqualToFactorial(int n){
        int fact=0;
        int sum=0;
        int temp = n;

        while(n>0){
            int q = n%10;
            fact = factorial(q);
            sum+=fact;
            n/=10;
        }

        if(sum==temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int sum=0;
        for(int i=3;i<Integer.MAX_VALUE;i++)
        {
            if(SumEqualToFactorial(i))
            {
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}
