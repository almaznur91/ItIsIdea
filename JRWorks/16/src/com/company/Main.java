package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
               /*Считать с консоли URl ссылку.
                Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
                URL содержит минимум 1 параметр.
                Если присутствует параметр obj, то передать его значение в нужный метод alert.
                alert(double value) - для чисел (дробные числа разделяются точкой)
                alert(String value) - для строк
                Пример ввода:
                    http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
                    Пример вывода:
                    lvl view name

                    Еще пример ввода:
                    http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
                    Пример вывода:
                    obj name
                    double 3.14
                */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> objects = new ArrayList<>();
        try {


            String temp = reader.readLine();
            int index1 = temp.indexOf('?')+1;
            temp = temp.substring(index1);
            String[] strings = temp.split("&");
            for (String s : strings) {
                if (s.contains("=")) {
                    String[] splits = s.split("=");
                    String potentialart = splits[0];
                    arrayList.add(potentialart);

                    if (potentialart.equals("obj")) {
                        objects.add(splits[1]);

                    }


                } else {
                    arrayList.add(s);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println();


        for (String s : objects) {
            try {
                aletrt(Double.parseDouble(s));
            } catch (Exception e) {
                aletrt(s);
            }
        }


    }


    private static void aletrt(double v) {
        System.out.println(v);
    }

    private static void aletrt(String v) {
        System.out.println(v);
    }
}
