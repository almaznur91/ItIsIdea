package com.company;

public class Sun implements Planet{

    private static final Sun instance = new Sun();

    private Sun() {
    }

    public static Sun getInstance() {
        return instance;
    }
}

