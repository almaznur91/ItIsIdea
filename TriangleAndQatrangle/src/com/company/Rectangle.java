package com.company;


import static java.lang.StrictMath.sin;

public class Rectangle extends Square {

protected int side2;

    public Rectangle(int side1, int side2) {
        super(side1);
        this.side2 = side2;
    }
    public void area(){
        System.out.println("Площадь прямоугольника= "+(side1*side2));
    }


}
