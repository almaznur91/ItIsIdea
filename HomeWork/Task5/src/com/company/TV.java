package com.company;

import java.time.LocalTime;

public class TV {
    public TV(Channel[] channels, String modlTV) {
        this.channels = channels;
        this.modlTV = modlTV;
    }

    private Channel[] channels;
    private String modlTV;


    public void showTV() {

        System.out.println(channels[i].showChannel());
        }


    }
