import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day > 0 && day <= 31) {
        this.day = day;
        } else{System.out.println("sorry, incorrect day set");}

        if(month > 0 && month <= 12) {
        this.month = month;
        } else {System.out.println("sorry, incorrect month set");}

        if(year >= 1900 && year <= 2099){
        this.year = year;
        } else {System.out.println("sorry, incorrect year set");}
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate() {
        String date = day + "/" + month + "/" + year;
        return date;

    }


}
