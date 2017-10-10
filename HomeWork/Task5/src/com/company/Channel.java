package com.company;

public class Channel {

    private Program[] programs;
    private String nameChannel;

    public Channel(Program[] programs, String nameChannel) {
        this.programs = programs;
        this.nameChannel = nameChannel;
    }

    public void showChannel(){
        programs[0].showProgram();
    }




}