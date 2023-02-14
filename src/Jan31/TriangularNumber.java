package Jan31;

import java.util.HashSet;
import java.util.Set;
import java.lang.Math;
public class TriangularNumber
{
    private static Set<Integer> getFactors(int number)
    {
        var FirstHalf = new HashSet<Integer>();
        var SecondHalf = new HashSet<Integer>();

        var sqrt = (int) Math.sqrt(number);

        for(var divisor = 1;divisor<=sqrt;divisor++)
        {
            if(number%divisor==0)
                FirstHalf.add(divisor);
        }

        var iterator = FirstHalf.iterator();

        while (iterator.hasNext()){
            var val = iterator.next();
            SecondHalf.add(number/val);
        }

        FirstHalf.addAll(SecondHalf);

        //System.out.println(FirstHalf);
        //System.out.println(SecondHalf);

        return FirstHalf;
    }

    private static int largestDivisor(final int size){
        for (int value = 1,increment = 2;;value+=increment,increment++)
        {
            if (getFactors(value).size()>size){
                return value;
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(getFactors(16));
        System.out.println(largestDivisor(500));
    }
}
