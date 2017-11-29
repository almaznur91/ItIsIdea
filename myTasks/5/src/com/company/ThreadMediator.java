package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadMediator {
    Object o = new Object();
    Lock lock = new ReentrantLock();

    private ThreadWorker threadWorker;


    public ThreadMediator() {
        threadWorker = new ThreadWorker();
        threadWorker.start();
    }

    void toDoInThread(Task task) {
        threadWorker.task = task;
        lock.lock();
    }

    void join() throws InterruptedException {
        threadWorker.join();
    }

    private class ThreadWorker extends Thread {
        Task task;

        public void run() {
            while (true) {

                if (task == null) {
                    lock.lock();
                    task.dolt();
                    task = null;

                }
            }

        }
    }

}