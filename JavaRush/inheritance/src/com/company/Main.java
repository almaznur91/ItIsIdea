package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < m; i++) {
            list.add(list.size() - m + i, list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
        return list;
    }

}