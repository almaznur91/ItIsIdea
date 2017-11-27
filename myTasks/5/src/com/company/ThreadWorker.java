package com.company;

import java.util.Arrays;

public class ThreadWorker extends Thread {

    int[]array;
    public void toDoInThread(Task task) {
        task.dolt();


    }
    public void run(){
        Arrays.sort(array);

    }

}
