package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in)
        Math one = new Math();
        int a;
        int b;



        for (int i = 0; i; i++) {
            System.out.println("Введите первое значение");
            a = new Scanner(System.in).nextInt();
            System.out.println("Введите второе значение");
            b = new Scanner(System.in).nextInt();
            System.out.println("Сумма введенных значений");
            one.sum(a,b);
        }
    }
}
