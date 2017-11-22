package com.company;

import java.util.LinkedList;
import java.util.Observable;

public class WeatherData {

    int count;
    Observer observer;
    LinkedList<Observer> observers = new LinkedList<>();


    void addObserver(Observer observer) {
        observers.add(observer);
    }


    void event() {
        count++;

        for (Observer observer : observers
                ) {

             observer.handleEvent(this.count);
        }

    }


}
