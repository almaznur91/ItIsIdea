package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        list.remove(2);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}