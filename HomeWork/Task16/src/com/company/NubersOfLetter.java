package com.company;

public class NubersOfLetter implements Observer {
    int countOfLetter;
    int countLowerLetter;
    int countCapitanLetter;

    @Override
    public void handleEvent(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z' || chars[i] >= 'А' && chars[i] <= 'Я') {
                countCapitanLetter++;
                countOfLetter++;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'а' && chars[i] <= 'я') {
                countLowerLetter++;
                countOfLetter++;

            }

        }
        System.out.println("Количество букв = " + countOfLetter +"\n"
                + "Количество заглавных букв = " + countCapitanLetter + "\n"
                + "Количество строчных букв = " + countLowerLetter);
    }


}
