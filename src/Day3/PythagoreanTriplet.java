package Day3;

/*
Q9.Special Pythagorean triplet
"A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc."
 */
public class PythagoreanTriplet {

    private static long triplet(int limit){
        long result = 0;
        for(var a = 3; a<limit;a++)
        {
            for(var b = a+1;b<limit;b++)
            {
                double c = Math.pow(a,2)+Math.pow(b,2);
                c = Math.sqrt(c);

                if(a+b+c == limit){
                    result = (long)(a*b*c);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: "+triplet(1000));
    }
}
