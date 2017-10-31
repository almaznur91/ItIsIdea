package com.company;

import java.util.*;

public class Main {
/*
    Создать класс кот – Cat, с полем «имя» (String).
    Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
    Получить из Map множество(Set) всех имен и вывести его на экран.*/

    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<>();


        Cat cat1 = new Cat("vaska");
        map.put("vaska", cat1);

        Set<Cat> set = convertMaptoSet(map);
        for (Cat v : set) {
            System.out.println(v);
        }
    }

    public static Set<Cat> convertMaptoSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            set.add(pair.getValue());

        }
        return set;
    }

}

