package com.company;

public class Dog {
    private int size;
    private int weight;


    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


    public Dog(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }


    public boolean fight( Dog dog1){
        if(this. getSize()> dog1.getSize()){
            return true;
        }
        return false;
    }

}
