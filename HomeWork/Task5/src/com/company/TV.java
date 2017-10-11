package com.company;

import java.time.LocalTime;

public class TV {
    private Channel[] channels;
    private int numChannel;
    private String modlTV;

    public TV(Channel[] channels, String modlTV) {
        this.channels = channels;
        this.modlTV = modlTV;
        this.numChannel = 0;
    }


    public void show(int numButton) {
        System.out.println(channels[numButton].showChannel());
    }


}
