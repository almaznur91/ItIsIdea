package com.company;


public class Rectangle extends Figure {
    private final int DEFAULT_SIDE = 1;


    protected int side1;
    protected int side2;

    public Rectangle(int side1, int side2) {

        if (side1 > 0) {
            this.side1 = side1;
        } else {
            this.side1 = DEFAULT_SIDE;
        }
        if (side2 > 0) {
            this.side2 = side2;
        } else {
            this.side2 = DEFAULT_SIDE;
        }
    }

    public void area() {
        System.out.println("Площадь прямоугольника= " + (side1 * side2));
    }


}
