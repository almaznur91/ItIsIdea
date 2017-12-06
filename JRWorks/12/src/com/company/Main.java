package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Разные методы для разных типов

        1. Считать с консоли данные, пока не введено слово "exit".
        2. Для каждого значения вызвать метод print. Если значение:
        2.1. содержит точку '.', то вызвать метод print для Double;
        2.2. больше нуля, но меньше 128, то вызвать метод print для short;
        2.3. больше либо равно 128, то вызвать метод print для Integer;
        2.4. иначе, вызвать метод print для String.*/

        Scanner scanner = new Scanner(System.in);
        String temp;
        Integer tempInt = null;


        while (true) {
            temp = scanner.next();
            if (temp.equals("exit")) {
                break;
            } else {

                if (temp.equals(".")) {
                    char tempFloat;
                    tempFloat = temp.charAt(0);
                    print(temp);
                } else
                    try {


                        tempInt = Integer.valueOf(temp);
                        if (tempInt > 0 && tempInt < 128) {
                            print((Short.valueOf(temp)));
                        } else if (tempInt >= 128) {
                            print(tempInt);
                        } else print(temp);


                    }
                    catch (NumberFormatException e){
                       print(temp);
                    }
            }
        }


    }

    private static void print(String temp) {
        System.out.println("Тут значит у на стрмнг");
    }

    private static void print(Short s) {
        System.out.println("тут у нвс знаитю был шор");
    }

    private static void print(Integer i) {
        System.out.println("Тут был у нас интегер");
    }


}
