package com.learn.generic.example;

import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }

    public int compareTo(MyDate myDate){
        int gapYear = year - myDate.getYear();
        int gapMonth = month - myDate.getMonth();
        int gapDay = day - myDate.getDay();

        if (gapYear != 0){
            return gapYear;
        }
        if (gapMonth != 0){
            return gapMonth;
        }
        return gapDay;
    }
}
