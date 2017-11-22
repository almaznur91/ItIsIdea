package com.company;


public class StatisticDisplay implements Observer {

    int count;

    @Override
    public void setCount(int count) {
        this.count = count;
    }




    public void handleEvent() {
        System.out.println("Живьем брать демонов!");
    }


}
