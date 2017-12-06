package com.company;


class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %s , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }
   public void info(Number s){
       System.out.println(String.format("Дерево № %s , метод Number, параметр %s", number, s.getClass().getSimpleName()));

   }
}