package com.company;

import java.time.LocalTime;

public class Program {

    private String nameProgram;
    private LocalTime beginTime;
    private LocalTime endTime;

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Program(String nameProgram, LocalTime beginTime, LocalTime endTime) {
        this.nameProgram = nameProgram;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String showProgram() {
         return nameProgram;
        }
    }

//public void showProgram1()

