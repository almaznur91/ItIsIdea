package ru.almaz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array = {1, 7, 8, 9, 8, 7, 11, 2, 5, 6, 23, 45};

        Sorter sorter = new Sorter();
        sorter.sort(array);


//        int[] arrayTest = {1,4,7,60,2,13,18,20};
//        sorter.merger(arrayTest,0, arrayTest.length, 4);
        System.out.println((Arrays.toString(array)));

    }

}
