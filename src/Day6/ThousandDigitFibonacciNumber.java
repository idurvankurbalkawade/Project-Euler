/*
Q25.1000-Digit Fibonacci Number
"The Fibonacci sequence is defined by the recurrence relation:
Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:
F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.
What is the index of the first term in the Fibonacci sequence to contain 1000 digits?"
 */

package Day6;

import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {

    public static void fibonacci()
    {
        BigInteger first_term = BigInteger.ONE;
        BigInteger second_term = BigInteger.ONE;
        BigInteger last_term = BigInteger.ONE;

        int counter = 2;

        do {
            last_term = first_term.add(second_term);
            first_term = second_term;
            second_term = last_term;
            counter++;
        }while (last_term.toString().length()<1000);

        System.out.println("First Term in the fibonacci series that have 1000 digits: "+counter);
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
