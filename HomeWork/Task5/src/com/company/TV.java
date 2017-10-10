package com.company;

public class TV {
    public TV(Channel[] channels, String modlTV) {
        this.channels = channels;
        this.modlTV = modlTV;
    }

    private Channel[] channels;
    private String modlTV;


    public void showTV() {
        channels[0].showChannel();
    }

}
