/*
Q.26 Reciprocal Cycles
"A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:
1/2 =  0.5
1/3 =  0.(3)
1/4 =  0.25
1/5 =  0.2
1/6 =  0.1(6)
1/7 =  0.(142857)
1/8 =  0.125
1/9 =  0.(1)
1/10 =  0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part."
 */

package Feb16;

import java.util.HashMap;

public class ReciprocalCycles {

    public static int getCycleLength(int denominator)
    {
        var numMap = new HashMap<Integer,Integer>();
        var mod = 1;

        for (int index = 1;;index++)
        {
            if (numMap.containsKey(mod)){
                return index - numMap.get(mod);
            }
            else{
                numMap.put(mod,index);
                mod = mod * 10 % denominator;
            }
        }
    }

    public static int getLongestCycle(int d){
        var max = 0;
        var denominator = 0;

        for (int i=2;i<d;i++){
            var curr = getCycleLength(i);
            if (curr > max){
                max = curr;
                denominator = i;
            }
        }

        return denominator;
    }

    public static void main(String[] args) {
        System.out.println(getCycleLength(7));
        System.out.println(getLongestCycle(1000));
    }
}
