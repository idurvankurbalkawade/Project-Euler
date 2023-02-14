package Jan31;

import java.math.BigInteger;

public class FactorialDigitSum {

    private static int FactDigitSum(int number)
    {

        //To calculate Factorial Value
        var fact = BigInteger.ONE;
        for (var x = number;x>0;x--)
        {
            fact = fact.multiply(BigInteger.valueOf(x));
        }

        //To Calculate Factorial Digit Sum
        var digits = fact.toString();
        var sum = 0;
        for (var c:digits.toCharArray()) {
            sum+=Integer.parseInt(Character.toString(c));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(FactDigitSum(100));
    }
}
