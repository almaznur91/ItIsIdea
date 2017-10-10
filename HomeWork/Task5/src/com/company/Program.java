package com.company;

import java.time.LocalTime;

public class Program {

    private int nameProgram;
    private LocalTime beginTime;
    private LocalTime endTime;

    public Program(int nameProgram, LocalTime beginTime, LocalTime endTime) {
        this.nameProgram = nameProgram;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public  void showProgram(){

        LocalTime currentTime= LocalTime.now();
        if (currentTime.isAfter(beginTime)&& (currentTime.isBefore(endTime))){


        System.out.println("Программа работает");}
        else System.out.println();
    }

//public void showProgram1()

}
