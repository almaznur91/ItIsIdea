package com.company;

public class Otp {

    int numberOTP;


    public int getNumberOTP() {
        return numberOTP;
    }

    public void setNumberOTP(int numberOTP) {
        this.numberOTP = numberOTP;
    }

    public void sendNumber(Pull pull){
        pull.setNumberPull(numberOTP);
    }

}