package com.company;

import java.util.LinkedList;

public class TextViewer {

    String text;

    public TextViewer(String text) {
        this.text = text;
    }

    LinkedList<Observer> observers = new LinkedList<>();


    void addObserver(Observer observer) {
        observers.add(observer);
    }


    void event() {
        for (Observer observer : observers) {
            observer.handleEvent(this.text);
        }

    }


}
