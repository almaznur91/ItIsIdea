package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array1 = new int[]{1, 15, 14, 12, 1, 4, 18, 19};
        int[] array2 = new int[]{4, 16, 11, 17, 4, 6, 13, 14};


        ThreadWorker threadWorker = new ThreadWorker();
        threadWorker.array=array2;
        threadWorker.toDoInThread(new Task() {
            @Override
            public void dolt() {
                threadWorker.start();
            }
        });
        array2=threadWorker.array;
        Arrays.sort(array1);

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
    }
}
