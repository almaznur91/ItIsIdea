package com.company;


import java.util.*;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Cat> cats = creatCats();
        Iterator<Cat>it=cats.iterator();
        if(it.hasNext()){
            cats.remove(it.next());

        }
        show(cats);

    }

    public static Set<Cat> creatCats() {
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void show(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }


    }

    public static class Cat {

    }
}