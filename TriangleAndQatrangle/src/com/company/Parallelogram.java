package com.company;


import static java.lang.Math.*;

public class Parallelogram extends Rectangle {

    private double x;


    private double f(double x) {
        double r=x*PI/180;
        return sin(r);

    }

    public Parallelogram(int side1, int side2, double x) {
        super(side1, side2);
        this.x = x;
    }

    public void area() {
        double d = f(x);
        int s = side1*side2;
        System.out.println("Площадь параллелаграма = " + (f(x) * side1 * side2));
    }

}
