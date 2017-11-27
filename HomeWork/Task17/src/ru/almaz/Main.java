package ru.almaz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array1 = {1, 23, 8, 9, 19, 7, 11, 2, 5, 6, 23, 45};
        int[] array2 = {4, 3,4,5,9,12,13,15,14,14,78,12,78};
        Sorter sorter = new Sorter();
        sorter.sort(array1);
        sorter.sort(array2);





//        int[] arrayTest = {1,4,7,60,2,13,18,20};
//        sorter.merger(arrayTest,0,  arrayTest.length, 4);

        System.out.println((Arrays.toString(array2)));
        System.out.println((Arrays.toString(array1)));
    }

}
