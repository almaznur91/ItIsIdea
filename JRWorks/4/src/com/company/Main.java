package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
//                Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
//                Ввод окончен, когда строка не совпадает ни с одной из вышеуказанных.
//
//        2. Для каждой введенной строки нужно:
//        2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
//        2.2. Передать этот объект в метод doWork.
//
//        3. Написать реализацию метода doWork, который:
//        3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
//        3.2. Вызывает метод doNothing(), если person имеет тип Looser.
//        3.3. Вызывает метод coding(), если person имеет тип Coder.
//        3.4. Вызывает метод enjoy(), если person имеет тип Proger.

        Scanner scanner = new Scanner(System.in);
        while (true){
            String temp=scanner.next();
            if (temp.equals("user")){
                doWork(new Person.User());
            }
            else if (temp.equals("looser")){
                doWork(new Person.Looser());
            }
            else if (temp.equals("coder")){
                doWork(new Person.Coder());
            }
            else if (temp.equals("proger")){
                doWork(new Person.Proger());
            }
            break;
        }

    }

    private static void doWork(Person person) {

        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        else if (person instanceof Person.Looser){
            ((Person.Looser) person).doNothing();
        }

        else if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
