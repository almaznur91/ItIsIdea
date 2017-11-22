package com.company;

public class NumberOfDigits implements Observer{
    int countOfNumber;


    @Override
    public void handleEvent(String text) {
        char[] chars=text.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]>='0'&& chars[i]<='9'){
                countOfNumber++;
            }
        }
        System.out.println("Количество цифр = "+ countOfNumber);

    }


}
