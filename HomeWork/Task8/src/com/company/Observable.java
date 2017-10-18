package com.company;

public interface Observable {
void event(char number);
void addObserver(Observer observer);
}
