/*
Q.39 Integer Right Triangles
"If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
{20,48,52}, {24,45,51}, {30,40,50}
For which value of p ≤ 1000, is the number of solutions maximised?"
 */

package Feb6;

public class IntegerRightTriangles {

    //function to count no of triangles
    private static int count(int peri)
    {
        int count = 0;
        for (int a = 1;a<=peri;a++){
            for (int b = a;b<=peri;b++){
                int c  = peri-a-b;
                if (a*a+b*b == c*c)
                    count++;
            }
        }
        return count;
    }

    //maximum possible count
    private static int maxCount()
    {
        int maxPeri = 0;
        int maxTri = 0;
        for (int peri = 1;peri<=1000;peri++)
        {
            int triangles = count(peri);
            if (triangles>maxTri){
                maxTri = triangles;
                maxPeri = peri;
            }
        }
        return maxPeri;
    }

    public static void main(String[] args) {
        System.out.println(count(120));
        System.out.println(maxCount());
    }
}
