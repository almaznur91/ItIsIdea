package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here целых типов

        //Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.


        howMuch(chars());


    }

    private static char[] chars() {
        Scanner scanner = new Scanner(System.in);
        String noo = scanner.nextLine();
        noo+=scanner.nextLine();
        noo+=scanner.nextLine();
        return noo.toCharArray();
    }

    private static char[] alfavit = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

    public static void howMuch(char[] chars) {
        char[] abc = new char[alfavit.length];
        int count = 0;
        for (char x : alfavit) {
            for (char z : chars) {
                if (x == z) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(x + " " + count);
            }
            count = 0;

        }
    }
}
