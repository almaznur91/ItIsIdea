package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        int[] arrayAges = new int[100];


        FileInputStream input = new FileInputStream("input.txt");
        int index = input.read();
        while (index != (-1)) {
            if (index == ' ') {
                int num1 = input.read();
                int num2 = input.read();
                int num = (num1 - '0') * 10 + (num2 - '0') * 1;
                arrayAges[num]++;
            }
            index = input.read();
        }
        for (int i = 0; i < arrayAges.length; i++) {
            if (arrayAges[i] != 0) {
                System.out.print(i + "-");
                System.out.println(arrayAges[i]);
            }
        }
    }
}
