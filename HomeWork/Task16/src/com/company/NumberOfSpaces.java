package com.company;



public class NumberOfSpaces implements Observer {
    int countOfSpaces;
    String count;

    @Override
    public void handleEvent(String count) {
        char[] chars = count.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                countOfSpaces++;
            }
        }
        System.out.println("Количество пробелов = "+ countOfSpaces);
    }


}

