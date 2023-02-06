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
