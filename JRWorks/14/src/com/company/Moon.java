package com.company;

public class Moon implements Planet {
    private static final Moon instance = new Moon();

    private Moon() {
    }

    public static Moon getinstance() {
        return instance;
    }

}
