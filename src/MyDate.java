/*
Short Description:  This class will create a date.  The date can be defaulted to the current date (no-arg constructor),
                    it can be defaulted to three integers passed in representing the year, month, and day, or it can
                    be created by passing in the elapsed milliseconds from January 1, 1970.
Author:  Brian Wiatrek
Date:  August 25, 2024
*/
import java.time.LocalDateTime;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
        this.year = LocalDateTime.now().getYear();
        this.month = LocalDateTime.now().getMonthValue() - 1;
        this.day = LocalDateTime.now().getDayOfMonth();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime){
        LocalDateTime tempDateTime = LocalDateTime.of(1970, 1, 1, 0,0,0,0).plusSeconds(elapsedTime/1000);
        this.month = tempDateTime.getMonthValue() - 1;
        this.day = tempDateTime.getDayOfMonth();
        this.year = tempDateTime.getYear();
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        LocalDateTime tempDateTime = LocalDateTime.of(1970, 1, 1, 0,0,0,0).plusSeconds(elapsedTime/1000);
        this.month = tempDateTime.getMonthValue() - 1;
        this.day = tempDateTime.getDayOfMonth();
        this.year = tempDateTime.getYear();
    }
}
