package com.company;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    }




public class Dog implements Run{

    @Override
    public void run() {

    }
}

public class Cat implements Climb{
    @Override
    public void climb() {

    }
}

public interface Fly{
        void fly();
}

public interface Climb{
        void climb();
}

public interface Run{
        void run();
}



}
