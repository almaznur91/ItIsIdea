package com.company;

import static java.lang.Math.PI;

public class Circle extends Ellipse {

    public Circle(int r, int BigR) {
        super(r, BigR);
    }

    public void area() {
        System.out.println("Площадь круга =" + (PI * r * r));
    }
}
