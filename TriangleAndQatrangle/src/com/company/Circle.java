package com.company;

import static java.lang.Math.PI;

public class Circle extends Ellipse {

    public Circle(int r) {
        super(r, 0);
    }

    public void area() {
        System.out.println("Площадь круга =" + (PI * r * r));
    }
}
