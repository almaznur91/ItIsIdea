package ru.itPark;

public class Human {
    private String name;
    private int age;
    private String nationality;

    public Human(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
    public String toString() {
        return this.name + " " + this.age+" "+this.nationality;

    }
}
