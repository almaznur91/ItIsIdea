package com.company;

public class RussianHen extends Hen {
    int N=4;
    String country="Russia";


    public int getCountOfEggsPerMonth(){
        return N;
    }

    String getDescription(){
        return super.getDescription()+" Моя страна - "+ country +". Я несу "+N+" яиц в месяц.";
    }
}
