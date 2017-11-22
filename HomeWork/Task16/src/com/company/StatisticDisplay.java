package com.company;


public class StatisticDisplay implements Observer {
    WeatherData weatherData;

    int count;

    public void setCount(int count) {
        this.count = weatherData.count;
    }

    public void handleEvent() {
        System.out.println("Живьем брать демонов!");
    }
}
