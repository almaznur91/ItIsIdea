package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code hereg
        TextViewer textViewer = new TextViewer("Привет Загир");

        StatisticDisplay statisticDisplay = new StatisticDisplay();
        PartyDisplay partyDisplay = new PartyDisplay();
        textViewer.addObserver(statisticDisplay);
        textViewer.addObserver(partyDisplay);

        textViewer.event();

        System.out.printf("Количество пробелов ="+ partyDisplay.count1);

    }



}
