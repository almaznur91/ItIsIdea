package com.company;

import java.time.LocalTime;

public class ProgramsList {

    private int numProgram;
    private LocalTime beginTime;
    private LocalTime endTime;

    public ProgramsList(int numProgram, LocalTime beginTime, LocalTime endTime) {
        this.numProgram = numProgram;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public  void showProgram(СhannelList chanellist){
        System.out.println("Программа работает");
    }


}
