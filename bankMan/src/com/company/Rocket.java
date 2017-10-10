package com.company;

public abstract class Rocket implements Bank {


    abstract void getMoney();

    @Override
    public boolean takeMoney(Human human, int howMach) {
        return false;
    }

    @Override
    public int giveMoney(Human human) {
        return 0;
    }
}
