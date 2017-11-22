package com.company;

public class Otp {

    int numberOTP = 7;


    public int getNumberOTP() {
        return numberOTP;
    }

    public void sendNumber(Pull pull,int a){
        this.numberOTP=a;
        pull.setNumberPull(a);
    }

}