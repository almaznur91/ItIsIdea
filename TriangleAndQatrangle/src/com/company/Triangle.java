package com.company;

public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
          this.side3=1;
          this.side2=1;
          this.side1=1;
        }
    }

    public void area() {
        int p = (side1 + side2 + side3) / 2;
        System.out.println(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }

}
