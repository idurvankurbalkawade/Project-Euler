package Jan25;/*
Sum Square Difference

"The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."
 */

public class Sum_Square_Difference
{
    public static void sum_square(int terms)
    {
        int sq_sum = 0,sum_terms = 0,square=1,diff = 0;
        for(int i=1;i<=terms;i++)
        {
            sq_sum += i*i;
            sum_terms+=i;
            square = sum_terms*sum_terms;
        }
        diff = square-sq_sum;
        System.out.println(square+" "+sq_sum);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        int count = 100;
        sum_square(count);
    }
}
