package com.company;

import javax.naming.Name;
import java.time.LocalTime;

public class SberBank implements Bank {

    private final int MAZ_SIZE = 10;

    private String[] names;
    private int[] sumNames;

    public int getCount() {
        return count;
    }

    private int count;

    private LocalTime beginTime;
    private LocalTime endTime;

    public SberBank(LocalTime beginTime, LocalTime endTime) {
        names = new String[MAZ_SIZE];
        sumNames = new int[MAZ_SIZE];
        count = 0;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }



//    public boolean takeMoney(Human human, int howMach) {
//        LocalTime currentTime = LocalTime.now();
//        if (currentTime.isAfter(beginTime) && currentTime.isBefore(endTime)) {
//            names[count] = human.getName();
//            sumNames[count] = howMach;
//            count++;
//            return true;
//        } else {
//            System.out.println("Банк Закрыт!");
//            return false;
//        }
//
//    }


    public int giveMoney(Human human) {
        LocalTime currentTime = LocalTime.now();
        if ((currentTime.isAfter(beginTime) &&
                (currentTime.isBefore(endTime)))) {
            for (int i = 0; i < count; i++) {
                if (human.getName() == names[i]) {
                    int tempSum = sumNames[i];
                    for (int j = i; j < count - 1; j++) {
                        names[j] = names[j + 1];
                        sumNames[j] = sumNames[j + 1];
                    }
                    count--;
                    return tempSum;
                }
            }

        } else {
            System.out.println("Банк закрыт!");
        }
        return -1;
    }
}
