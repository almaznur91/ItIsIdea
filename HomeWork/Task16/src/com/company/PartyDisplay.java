package com.company;

public class PartyDisplay implements Observer {

    int count;

    @Override
    public void setCount( WeatherData weatherData) {
        this.count = weatherData.count;
    }

    public void handleEvent() {
        System.out.println("А князь то не настоящий!");

    }
}

