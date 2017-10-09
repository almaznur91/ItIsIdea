package com.company;

 class Square extends Rectangle {


    public Square(int side1, int side2) {
        super(side1, side2);
    }

    public void area() {
        System.out.println("Площадь квадрата = " + (side1 * side1));
    }

}
