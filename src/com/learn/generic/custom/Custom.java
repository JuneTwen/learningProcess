package com.learn.generic.custom;

public class Custom<T, R, M> {
    private String name;
    private T t;
    private R r;
    private M m;

    public Custom(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

}
