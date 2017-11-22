package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pull pull = new Pull();
        Otp otp = new Otp();
        otp.setNumberOTP(12);
        otp.sendNumber(pull);
        System.out.println(pull.getNumberPull());
    }

}
