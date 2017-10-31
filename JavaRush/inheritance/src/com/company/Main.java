package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
        Написать программу, которая вводит с клавиатуры строку текста.
                Программа должна вывести на экран две строки:
        1) первая строка содержит только гласные буквы
        2) вторая - только согласные буквы и знаки препинания из введённой строки.
        Символы соединять пробелом, каждая строка должна заканчиваться пробелом.

        Пример ввода:
        Мама мыла раму.
                Пример вывода:
        а а ы а а у
        М м м л р м . */

public class Main {


    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        ArrayList<Character> listVowls = new ArrayList<>();
        ArrayList<Character> listUnVowls = new ArrayList<>();

      for (int i =0;i<chars.length;i++){
          if (isVoweils(chars[i])){
              listVowls.add(chars[i]);
          }
          else if (chars[i]==' '){

          }
          else {
              listUnVowls.add(chars[i]);
          }
      }
      for (char x:listVowls){
          System.out.print(x+" ");

      }
        System.out.println(" ");

      for (char c: listUnVowls){
          System.out.print(c+" ");
      }


    }

    public static char[] vowels = {'а', 'о','э', 'и', 'у', 'ы', 'е', 'ё', 'ю', 'я', 'и', 'ы', 'у', 'э', 'о', 'а'};

    public static boolean isVoweils(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }

        }
        return false;
    }
}