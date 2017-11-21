package com.company;

import java.util.Observable;

public class WeatherData  implements com.company.Observable{
    Observer observer;

    void setObserver(Observer observer){
        this.observer=observer;  //чет не прет
    }

    @Override
    public void event() {
         {
            observer.handleEvent();
        }
    }
}
