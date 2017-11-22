package com.company;

public class PartyDisplay implements Observer {
    int count1;
    String count;

    @Override
    public void handleEvent(String count) {
        System.out.println("А князь то не настоящий!");
        System.out.println(count + " - поганое число");
        char[] chars = count.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]==' '){
                count1++;
            }
        }

    }
}

