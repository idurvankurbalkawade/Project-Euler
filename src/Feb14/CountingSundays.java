/*
Q.19 Counting Sundays
"You are given the following information, but you may prefer to do some research for yourself.
1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?"
 */

package Feb14;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CountingSundays {

    public static int getSundayCount(LocalDate start,LocalDate end)
    {
        var sundayCount = 0;

        while(start.compareTo(end)<=0){
            if (start.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0){
                sundayCount++;
            }

            start = start.plusMonths(1);
        }

        return sundayCount;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        LocalDate d1 = LocalDate.of(1901,01,01);
        LocalDate d2 = LocalDate.of(2000,12,31);
        System.out.println("Sunday Count: "+getSundayCount(d1,d2));
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: "+(end-start)/1000F+" seconds");
    }
}
