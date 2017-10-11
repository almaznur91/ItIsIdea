package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Parallelogram parallelogram = new Parallelogram(7, 8, 30);
        parallelogram.area();
        Figure figurs[] = new Figure[7];
        Figure fig=new Circle(1);
        fig.area();

        figurs[0] = new Parallelogram(1, 3, 45);
        figurs[1] = new Rectangle(2, 4);
        figurs[2] = new Square(3, 0);
        figurs[3] = new Triangle(2, 3, 3);
        figurs[4] = new Ellipse(-1, -2);
        figurs[5] = new Circle(-5);
        figurs[6] = new Dot();

         for (int i=0; i<7;i++){
             figurs[i].area();
         }






    }
}
