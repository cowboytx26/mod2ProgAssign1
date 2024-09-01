/*
Short Description:  This program will create three dates using the MyDate class and print out the date to the console.
Author:  Brian Wiatrek
Date:  August 25, 2024
*/
public class Main {
    public static void main(String[] args) {

        long elapsedTime = 561555550000L;
        MyDate testDate = new MyDate(elapsedTime);
        System.out.printf("Year: %d Month: %d Day: %d\n", testDate.getYear(), testDate.getMonth(), testDate.getDay());

        MyDate testDate2 = new MyDate();
        System.out.printf("Year: %d Month: %d Day: %d\n", testDate2.getYear(), testDate2.getMonth(), testDate2.getDay());

        elapsedTime = 34355555133101L;
        MyDate testDate3 = new MyDate(elapsedTime);
        System.out.printf("Year: %d Month: %d Day: %d\n", testDate3.getYear(), testDate3.getMonth(), testDate3.getDay());
    }
}