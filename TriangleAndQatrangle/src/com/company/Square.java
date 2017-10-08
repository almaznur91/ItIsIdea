package com.company;

public class Square extends Figure {
    protected int side1;

    public Square(int side1) {
        this.side1 = side1;
    }
    public void area(){
        System.out.println("Площадь квадрата = "+(side1*side1));
    }

}
