package com.company;

public class PartyDisplay implements Observer {

    int count;

    @Override
    public void setCount( int count ) {
        this.count = count;
    }

    public void handleEvent() {
        System.out.println("А князь то не настоящий!");

    }
}

