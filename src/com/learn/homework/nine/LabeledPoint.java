package com.learn.homework.nine;

public class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label, double xLabel, double yLabel) {
        super(xLabel, yLabel);
        this.label = label;
    }
}
