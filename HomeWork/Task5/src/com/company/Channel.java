package com.company;

import java.time.LocalTime;

public class Channel {

    private Program[] programs;
    private String nameChannel;

    public Channel(Program[] programs, String nameChannel) {
        this.programs = programs;
        this.nameChannel = nameChannel;
    }

    public String showChannel() {
        LocalTime currentTime = LocalTime.now();
        for (int i = 0; i < programs.length; i++) {
            if (currentTime.isAfter(programs[i].getBeginTime()) &&
                    currentTime.isBefore(programs[i].getEndTime())) {
                return programs[i].showProgram();
            }
        }
        return "нет";
    }



}