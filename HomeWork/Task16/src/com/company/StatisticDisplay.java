package com.company;


public class StatisticDisplay implements Observer {
    int count;


    public void handleEvent() {
        System.out.println("Живьем брать демонов!");
    }
}
