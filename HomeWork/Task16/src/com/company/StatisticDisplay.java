package com.company;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements com.company.Observer {


    @Override
    public void handleEvent() {
        System.out.println("Что то произошло");
    }
}
