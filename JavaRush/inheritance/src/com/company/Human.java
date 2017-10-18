package com.company;

public class Human {

    String name;
    boolean pol;
    int age;
    String father;
    String mather;


    public Human(String name, boolean pol, int age, String father, String mather) {
        this.name = name;
        this.pol = pol;
        this.age = age;
        this.father = father;
        this.mather = mather;
    }


    public Human(String name, boolean pol, int age) {
        this.name = name;
        this.pol = pol;
        this.age = age;
    }





    public void toString(Human human){
        System.out.println( this.name);
        if(this.pol){
            System.out.println("пол: Женский");
        }
        else {
            System.out.println("пол: Мужской");
        }
        System.out.println("возраст"+ this.age);

        if (this.father!= null){
            System.out.println("Отец:"+this.father);
        }

        if (this.mather!=null){
            System.out.println("Мать: "+ this.mather);
        }
    }

}
