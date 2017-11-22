package com.company;

public class Otp {

    Pull pull;
    int numberOTP;

    public void setPull(Pull pull) {
        this.pull = pull;
    }




    public int getNumberOTP() {
        return numberOTP;
    }

    public void setNumberOTP(int numberOTP) {
        this.numberOTP = numberOTP;
    }

    public void sendNumber(){
        pull.setNumberPull(numberOTP);
    }

}