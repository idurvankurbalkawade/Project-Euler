/*
Q.38 Pandigital Multiples
"Take the number 192 and multiply it by each of 1, 2, and 3:
192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?"
 */

package Day8;

import java.util.Arrays;

public class PanDigitalMultiples {
    private static boolean isPanDigital(String str)
    {
        if (str.length()!=9)
            return false;

        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }
    private static String panDigitalProduct()
    {
        int max = -1;
        for (int n=2;n<=9;n++)
        {
            for (int i=1;i<Math.pow(10,9/n);i++){
                StringBuilder str = new StringBuilder();
                for (int j=1;j<=n;j++)
                    str.append(i * j);
                if (isPanDigital(String.valueOf(str)))
                    max = Math.max(Integer.parseInt(String.valueOf(str)),max);
            }
        }
        return Integer.toString(max);
    }


    public static void main(String[] args) {
        System.out.println(panDigitalProduct());
    }
}
