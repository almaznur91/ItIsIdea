package ru.almaz;

import java.util.Arrays;

public class Sorter {


    void sort(int[] array) {

        sort1(array,0,array.length-1);




    }

    void sort1(int[] array,int start,int end){
        if (end-start>0) {
            int middle = start + (end - start + 1) / 2;

            sort1(array, start, middle-1);
            sort1(array, middle, end);
            merger(array, start, end, middle);
        }
    }


    void merger(int[] array, int start, int hight, int midlle) {

        int[] helparray = new int[array.length];
        for (int i = 0; i < helparray.length; i++) {
            helparray[i] = array[i];
        }

        int indexI = start;
        int indexJ = midlle;
        int current = start;

        while (true){
            if (indexI==midlle){
                for (int i=indexJ;i<helparray.length;i++){
                    array[current]=helparray[i];
                    current++;
                }
                break;
            }

            if (indexJ==helparray.length){
                for (int i = indexI;i<midlle;i++){
                    array[current]=helparray[i];
                    current++;

                }
                break;
            }

             if (helparray[indexI] <= helparray[indexJ]) {
                array[current] = helparray[indexI];

                current++;
                indexI++;

            }
            else if (helparray[indexJ]<helparray[indexI]){
                array[current]=helparray[indexJ];
                current++;
                indexJ++;

            }



        }


    }

}
