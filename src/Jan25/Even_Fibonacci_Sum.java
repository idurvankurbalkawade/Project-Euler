package Jan25;/*
Even Fibonacci Sum
"Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
 */

public class Even_Fibonacci_Sum
{
    public static void main(String[] args)
    {
        int n1=1,n2=2,n3=0;
        int sum = 0;

        while(n2<4000000)
        {
            if(n2%2==0)
                sum = sum+n2;

            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

        System.out.println(sum);
    }
}
