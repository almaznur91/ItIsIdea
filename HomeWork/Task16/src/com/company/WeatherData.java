package com.company;

import java.util.Observable;

public class WeatherData  implements com.company.Observable{
    StatisticDisplay statisticDisplay;


    @Override
    public void event(Observer observer) {
         {
            observer.handleEvent();
        }
    }
}
