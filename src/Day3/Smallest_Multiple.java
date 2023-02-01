package Day3;

/*
Q5.Smallest Multiple
"2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 */
public class Smallest_Multiple {

    private static long multipleSmallest(){
        boolean found = true;
        long result = 0;

        for (long x = 2520;found;x++){
            if (x % 11 !=0|| x % 12!=0 || x % 13!=0||x % 14 !=0||x % 15!=0 || x % 16!=0||x % 17 !=0||x % 18!=0 || x % 19!=0|| x % 20 !=0)
                continue;
                result = x;
                found = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(multipleSmallest());
    }
}
