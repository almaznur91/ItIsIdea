package ru.itis;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Double x = 0.002;
        System.out.println(x.hashCode());



	    Map<String, Integer> map = new HashMap<>();

        map.put("Алексей", 27);
        map.put("Алмаз", 25);
        map.put("Загир", 26);
        map.put("Радик", 24);
        map.put("Марс", 24);
        map.put("Антон", 18);
        map.put("Алия", 21);
        map.put("Даниил", 25);
        map.put("Андрей", 19);
        map.put("Елизавета", 19);
        map.put("Руслан", 47);
        map.put("Артур", 18);




        System.out.println();
        Set<String> set = new SetWithHashMap<String>();
                set.put("Елизавета");
                set.put("Марсель");
                set.put("Марсель");
                for (String s:set){
                       System.out.println(s);
                   }


    }
}
