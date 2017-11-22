package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pull pull = new Pull();


        Otp otp = new Otp(4);
        pull.receive(otp);
        System.out.println(pull.getNumberPull());
    }

}
