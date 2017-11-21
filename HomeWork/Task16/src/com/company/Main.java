package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        WeatherData weatherData = new WeatherData();
        weatherData.setObserver(new ForecastDisplay());
        weatherData.event();

    }
}
