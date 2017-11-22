package com.company;

import java.util.LinkedList;
import java.util.Observable;

public class TextViewer {

    String count;

    public TextViewer(String count) {
        this.count = count;
    }

    LinkedList<Observer> observers = new LinkedList<>();


    void addObserver(Observer observer) {
        observers.add(observer);
    }


    void event() {

        for (Observer observer : observers
                ) {

             observer.handleEvent(this.count);
        }

    }


}
