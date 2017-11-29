package com.company;

public class MoldovanHen extends Hen {

    String country="Moldavan";
    int N=5;



    public int getCountOfEggsPerMonth() {
        return N;
    }

    String getDescription() {
        return (getDescription() + "родительского класса>" + " Моя страна - " + country + ". Я несу " + N + " яиц в месяц.");

    }

}