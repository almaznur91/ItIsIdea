package com.company;

import java.util.LinkedList;
import java.util.Observable;

public class WeatherData {

    Observer observer;
    LinkedList<Observer> observers = new LinkedList<>();


    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void event() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(0).handleEvent();
        }
    }


}
