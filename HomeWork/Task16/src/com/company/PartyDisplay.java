package com.company;

public class PartyDisplay implements Observer {

    int count;

    @Override
    public void setCount( int count ) {
        this.count = count;
    }

    public void handleEvent(int count) {
        System.out.println("А князь то не настоящий!");
        System.out.println(count + " - поганое число");

    }
}

