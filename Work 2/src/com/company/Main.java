package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        Line line=new Line(0,1);
        Line line3=new Line(1,0);
        double interX;
        interX=line.intersectionX(line3);
        System.out.println(interX);
        line3.isParallel(line);


    }
}
