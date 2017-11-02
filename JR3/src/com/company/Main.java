package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             /* Ввести с клавиатуры в список 20 слов.
                Нужно подсчитать количество одинаковых слов в списке.
                результат нужно представить в виде словаря Map<String, Integer>,
                где первый параметр – уникальная строка, а второй – число,
                сколько раз данная строка встречалась в списке.
                Вывести содержимое словаря на экран.
                В тестах регистр (большая/маленькая буква) не влияет на результат.*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> world = new ArrayList<>();
        ArrayList<String> worldCopy = world;
        for (int i = 0; i < 5; i++) {
            world.add(scanner.nextLine());
        }

        int count = 0;
        for (String s : world) {
            for (int i = 0; i < world.size(); i++) {
                if (world.get(i) == s) {
                    count++;

                }

            }
            count = 0;
            System.out.println(count);




        }


    }
}
