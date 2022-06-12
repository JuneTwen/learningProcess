package com.learn.enum_;

public enum Season2{
    SPRING("",""),SUMMER("","");
    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
