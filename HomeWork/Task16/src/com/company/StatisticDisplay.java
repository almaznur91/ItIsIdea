package com.company;


public class StatisticDisplay implements Observer {

    String count;


    public void handleEvent(String  count) {
        System.out.println("Живьем брать демонов!");
    }


}
