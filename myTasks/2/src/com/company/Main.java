package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {2,4,4,14, 12, 11, 12, 14, 15, 10, 5, 8};
        int index = 0;
        int min;

        for (int j = 0; j < array.length; j++) {
            min = array[j];
            index = j;


            for (int i = j; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    index = i;
                }
            }
                swap(array, index, j);


        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }

    }

    static void swap(int[] array, int i, int k) {
        int temp;
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;

    }


}


