package com.company;

import java.util.LinkedList;
import java.util.Observable;

public class WeatherData {

    int count=1;
    Observer observer;
    LinkedList<Observer> observers = new LinkedList<>();


    void addObserver(Observer observer) {
        observers.add(observer);
        count++;

    }

    void event() {

        for (Observer observer:observers
             ) {
            observer.handleEvent();
        }

    }


}
