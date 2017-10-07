package com.company;

public class Human {


    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    private int sumMoney;
    private String name;

    public String getName() {
        return name;
    }

    public Human(int sumMoney, String name) {
        this.sumMoney = sumMoney;
        this.name = name;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void goToBankAndGiveFukingMoney(Bank bank, int howMachGive) {
        if (bank.takeMoney(this, howMachGive)) {
            sumMoney = sumMoney - howMachGive;
        }


    }

    public void takeMeFukingMoney(Bank bank) {
       if (bank.giveMoney(this)){
           sumMoney=
       }

    }
}
