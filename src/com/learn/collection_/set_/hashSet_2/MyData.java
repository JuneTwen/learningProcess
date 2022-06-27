package com.learn.collection_.set_.hashSet_2;

import java.util.Objects;

public class MyData {
    private int year;
    private int month;
    private int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return year == myData.year && month == myData.month && day == myData.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
