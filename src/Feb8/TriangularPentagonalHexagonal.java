/*
Q.45 Triangular,Pentagonal and Hexagonal
"Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
Triangle   Tn=n(n+1)/2   1, 3, 6, 10, 15, ...
Pentagonal   Pn=n(3n−1)/2   1, 5, 12, 22, 35, ...
Hexagonal   Hn=n(2n−1)   1, 6, 15, 28, 45, ...
It can be verified that T285 = P165 = H143 = 40755.
Find the next triangle number that is also pentagonal and hexagonal."
 */

package Feb8;

public class TriangularPentagonalHexagonal {

    public static String generate()
    {
        int i = 286;
        int j = 166;
        int k = 144;

        while (true)
        {
            long triangle = (long)i*(i+1)/2;
            long pentagonal =(long)j*(j*3-1)/2;
            long hexagonal = (long) k*(k*2-1);

            long min = Math.min(Math.min(triangle,pentagonal),hexagonal);
            if(min == triangle && min == pentagonal && min == hexagonal){
                return Long.toString(min);
            }

            if (min==triangle)
                i++;
            if (min==pentagonal)
                j++;
            if (min==hexagonal)
                k++;
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(generate());
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
