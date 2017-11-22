package com.company;


public class StatisticDisplay implements Observer {

    int count;


    public void handleEvent(int count) {
        System.out.println("Живьем брать демонов!");
    }


}
