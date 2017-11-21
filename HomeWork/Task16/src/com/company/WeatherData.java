package com.company;

import java.util.Observable;

public class WeatherData  implements com.company.Observable{
    StatisticDisplay statisticDisplay;

    void setObserver(Observer observer){
    statisticDisplay=observer;  //чет не прет
    }
    
    @Override
    public void event(Observer observer) {
         {
            statisticDisplay.handleEvent();
        }
    }
}
