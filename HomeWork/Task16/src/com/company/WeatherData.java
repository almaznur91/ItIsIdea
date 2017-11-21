package com.company;

import java.util.Observable;

public class WeatherData  {

    ForecastDisplay forecastDisplay;

    void setStatisticDisplay(ForecastDisplay forecastDisplay){
        this.forecastDisplay=forecastDisplay;
    }

    void event(){
        forecastDisplay.handleEvent();
    }


}
