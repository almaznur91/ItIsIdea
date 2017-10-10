package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Human almaz;
        almaz = new Human(909,"Almaz");
        SberBank bank = new SberBank(LocalTime.parse("08:00"),LocalTime.parse("20:00"));
        almaz.goToBankAndGiveFukingMoney(bank,scanner.nextInt());
        System.out.println(almaz.getSumMoney());
    }
}
