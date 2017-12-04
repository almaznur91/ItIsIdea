package com.company;

public class Singleton {
    Singleton singleton=null;


    private Singleton() {
        this.getInstance();
    }

    Singleton getInstance() {
        if (singleton==null){
            singleton=new Singleton();

        }
        return singleton;
    }
}
