/*
Q.36 Double-base Pallindromes
"The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
(Please note that the palindromic number, in either base, may not include leading zeros.)"
 */

package Day11;

import java.math.BigInteger;

public class DoubleBasePallindromes {


    //function to calculate binary output of the number
    public static String calculateBinary(int num)
    {
        return Integer.toBinaryString(num);
    }

    //function used to check number and binary output is pallindrome or not
    public static boolean isPallindrome(String str){
        String temp ="";

        for(int i=str.length()-1;i>=0;i--){
            temp = temp+str.charAt(i);
        }

        if(str.equals(temp)){
            return true;
        }
        else
        {
            return false;
        }
    }

    //function to calculate sum of numbers which are pallindromic in both cases
    public static String generateSum(){

        int sum = 0;
        for (int i=1;i<1000000;i++){
            if (isPallindrome(Integer.toString(i))){
                //System.out.println(i);
                String res = calculateBinary(i);
                if(isPallindrome(res)){
                    sum+=i;
                }
            }
        }

        return Integer.toString(sum);
        //return sum;
    }

    public static void main(String[] args) {

        System.out.println(generateSum());
    }
}
