package com.company;

import java.util.Observable;

public class WeatherData  {

    StatisticDisplay statisticDisplay;

    void setStatisticDisplay(StatisticDisplay statisticDisplay){
        this.statisticDisplay=statisticDisplay;
    }

    void event(){
        statisticDisplay.handleEvent();
    }


}
