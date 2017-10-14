package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        if (n > 0) {
            num = n;
        } else {
            System.out.println("введите значение более 0");
        }
        int[] array= new int[num];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);

    }
}

