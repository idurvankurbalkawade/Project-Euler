package Jan30;/*
Q.4 Largest Pallindrome Product

"A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers."
 */

import java.lang.Math;

public class PallindromeProduct
{

    public static int largest_pallindrome(int n)
    {
        int upper_limit = (int)Math.pow(10,n)-1;    //999
        int lower_limit = 1+upper_limit/10;         //100

        int max = 0;

        for(int i = upper_limit;i>=lower_limit;i--) //upper limit
        {
            for(int j=i;j>=lower_limit;j--) //lower limit
            {
                int product = i*j;
                if(product<max)
                    break;
                int number = product;
                int reverse = 0;

                while(number!=0)
                {
                    reverse = reverse*10+number%10;
                    number/=10;
                }
                if(product == reverse && product > max)
                    max = product;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int count=3;
        System.out.println(largest_pallindrome(count));
    }
}
