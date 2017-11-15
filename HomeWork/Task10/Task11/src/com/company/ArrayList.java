package com.company;

public class ArrayList<T> {

    private int count;
    Object arraylist[];

    public ArrayList() {
        this.count = 0;
        this.arraylist = new Object[1000];
    }

    public void add(T element) {
        arraylist[count] = element;
        count++;
    }
    public T get(int index){
        return (T) arraylist[index];
    }
    public int size(){
        return count;
    }

}
