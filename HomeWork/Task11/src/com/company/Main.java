package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        ArrayList<LinkedList<Human>> linkedListArrayList = new ArrayList<LinkedList<Human>>();
        for (int i = 0; i < 100; i++) {
            linkedListArrayList.add(new LinkedList<Human>());
        }
        DataReader dataReader = new DataReader("input.txt");
        String name = dataReader.readString();
        int age = dataReader.readInteger();
        while (!name.equals("")) {
            linkedListArrayList.get(age).add(new Human(name, age));
            name = dataReader.readString();
            age = dataReader.readInteger();
        }
        for (int i = 0; i < linkedListArrayList.size(); i++) {
            LinkedList<Human> humans = linkedListArrayList.get(i);
            for (int j=0;j<humans.size();j++){
                System.out.println(humans.get(j));
            }
        }


    }
}
