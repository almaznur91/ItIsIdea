package com.company;

public class Parser implements Observable {

    private Observer[] observers = new Observer[3];
    private int count = 0;


    @Override
    public void event(char number) {

        for (int i = 0; i < count; i++) {
            observers[i].handleEvent(number);
        }
    }

    public void forEvent(String string) {
        char[] arrray = string.toCharArray();
        for (int i = 0; i < arrray.length; i++) {
            event(arrray[i]);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers[count] = observer;
        count++;

    }
}
