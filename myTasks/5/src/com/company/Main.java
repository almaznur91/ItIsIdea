package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        int[] array1 = new int[]{1, 15, 14, 12, 1, 4, 18, 19};
        int[] array2 = new int[]{4, 16, 11, 17, 4, 6, 13, 14};


        ThreadMediator threadMediator = new ThreadMediator();
        threadMediator.toDoInThread(new Task() {
            @Override
            public void dolt() {
                Arrays.sort(array2);
            }
        });

        Thread.sleep(5000);
        //threadMediator.join();

        Arrays.sort(array1);

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
    }



}