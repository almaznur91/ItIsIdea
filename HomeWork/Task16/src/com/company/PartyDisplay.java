package com.company;

public class PartyDisplay implements  Observer {

    public PartyDisplay(int count) {
        this.count = count;
    }

    int count;

        public void handleEvent() {
            System.out.println("А князь то не настоящий!");
        }
    }

