package com.company;

import java.util.Observable;

public class WeatherData  {

    Observer observer;

    void setObserver(Observer observer){
        this.observer=observer;
    }

    void event(){
        observer.handleEvent();
    }


}
