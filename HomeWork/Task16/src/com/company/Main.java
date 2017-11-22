package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code hereg
        WeatherData weatherData = new WeatherData();

        weatherData.addObserver(new StatisticDisplay());
        weatherData.addObserver(new PartyDisplay());


        weatherData.event();


    }



}
