/*
Q.17 Number Letter Counts
"If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of ""and"" when writing out numbers is in compliance with British usage."
 */

package Feb14;

public class NumberLetterCounts {

    public static Digit[] digitData(){
        Digit[] arr = {
                new Digit("one",1),
                new Digit("two",2),
                new Digit("three",3),
                new Digit("four",4),
                new Digit("five",5),
                new Digit("six",6),
                new Digit("seven",7),
                new Digit("eight",8),
                new Digit("nine",9),
                new Digit("eleven",11),
                new Digit("twelve",12),
                new Digit("thirteen",13),
                new Digit("fourteen",14),
                new Digit("fifteen",15),
                new Digit("sixteen",16),
                new Digit("seventeen",17),
                new Digit("eighteen",18),
                new Digit("nineteen",19),
                new Digit("twenty",20),
                new Digit("thirty",30),
                new Digit("forty",40),
                new Digit("fifty",50),
                new Digit("sixty",60),
                new Digit("seventy",70),
                new Digit("eighty",80),
                new Digit("ninety",90),
                new Digit("one hundred",100),
                new Digit("two hundred",200),
                new Digit("three hundred",300),
                new Digit("four hundred",400),
                new Digit("five hundred",500),
                new Digit("six hundred",600),
                new Digit("seven hundred",700),
                new Digit("eight hundred",800),
                new Digit("nine hundred",900),
                new Digit("one thousand",1000),
        };

        return arr;
    }

    public static String numToLetter(int digit){
        var data = digitData();
        var str = "";

        for (Digit d: data){
            if (d.getNumValue() == digit){
                str = d.getLetterValue();
                break;
            }
        }

        return str;
    }

    public static String generateCombination(int val){
        var and ="and";
        var result = "";

        while (val>10)
        {
            if (val == 1000){
                result = numToLetter(val);
                val = 0;
            }

            if (val>10 && val<20){
                result = numToLetter(val);
                val = 0;
            }

            if(val<1000 && val>119){
                var mode = val % 100;
                val = val - mode;
                result = numToLetter(val);

                if (mode!=0)
                    result = result.concat(" "+and+" ");
                val = mode;

                if (val>10)
                    result = result.concat("");
                if (val<20) {
                    result = result.concat(numToLetter(val));
                    val = 0;
                }
            }

            if (val>100 && val<=119){
                var mode = val % 20;
                val = val - mode;
                result = numToLetter(val)+" "+and;
                result = result.concat(" "+numToLetter(mode));

            }

            if (val<=100){
                var mode = val % 10;
                val = val - mode;
                result = result.concat(numToLetter(val));
                val=mode;
                if (val!=0)
                    result = result.concat(" ");
            }
        }
        return result.concat(numToLetter(val));
    }

    public static long generateOutput(int limit){
        var sum = 0L;
        for (var x = 1;x<=limit;x++){
            var str = generateCombination(x).replace(" ","");
            sum+=str.length();
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(generateOutput(1000));
    }
}
