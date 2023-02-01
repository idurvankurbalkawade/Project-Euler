package Day4;

import java.math.BigInteger;

public class Power_Digit_Sum
{
    public static int powerSum(int power)
    {
        var product = BigInteger.TWO.pow(power);
        var str = product.toString();
        var answer = 0;

        for (var c: str.toCharArray()) {
            answer+=Integer.parseInt(Character.toString(c));
        }

        return answer;
    }

    public static void main(String[] args)
    {
        System.out.println(powerSum(1000));
    }
}
