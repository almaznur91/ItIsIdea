package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code hereg
        WeatherData weatherData = new WeatherData();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        weatherData.addObserver(statisticDisplay);
        weatherData.addObserver(new PartyDisplay());



        weatherData.event();
        statisticDisplay.setCount(weatherData);
        System.out.println(statisticDisplay.count);

    }



}
