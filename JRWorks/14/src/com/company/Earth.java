package com.company;

public class Earth implements Planet {
    private static  Earth instance;

    Earth() {
    }

    public static Earth getInstance() {
        if (instance==null){
            instance= new Earth();

        }
        return instance;
    }


}