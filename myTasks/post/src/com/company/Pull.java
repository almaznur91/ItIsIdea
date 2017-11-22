package com.company;

public class Pull {
int numberPull;


    public int getNumberPull() {
        return numberPull;
    }

    public void receive(Otp otp){
        this.numberPull=otp.getNumberOTP();
    }



}
