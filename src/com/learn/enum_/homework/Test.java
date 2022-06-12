package com.learn.enum_.homework;

public class Test {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color){
            case RED -> color.show();
            case BLUE -> color.show();
            case BLACK -> color.show();
            case GREEN -> color.show();
            case YELLOW -> color.show();
        }
    }
}
