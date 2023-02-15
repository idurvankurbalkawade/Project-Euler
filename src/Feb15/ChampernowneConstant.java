/*
Q.40 Champernowne's constant
"An irrational decimal fraction is created by concatenating the positive integers:
0.123456789101112131415161718192021...
It can be seen that the 12th digit of the fractional part is 1.
If dn represents the nth digit of the fractional part, find the value of the following expression.
d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000"
 */

package Feb15;

import java.util.ArrayList;

public class ChampernowneConstant {

    public static String generateProd(int limit)
    {
        StringBuilder str = new StringBuilder();
        for (int i=1;i<limit;i++)
        {
            str.append(i);
        }

        int prod=1;
        for (int p=1;p<=6;p++){
            prod*=str.charAt((int)Math.pow(10,p)-1)-'0';

        }
        return Integer.toString(prod);
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(generateProd(1000000));
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
