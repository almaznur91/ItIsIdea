package Task4;

import static Task4.Cat.getCount;

public class Main {

    public static void main(String[] args) {

        //Я буду все кидать в один проект
        //Просто выбирай нужную папку
        //И нажимай запуск около main и все)
        //TODO Принял!


	    //TODO: 1)Создай классы Cat и Human
        //TODO: 2)Создай женщину и двух кошек
        //TODO: 3)У Cat поля: Human mistress; String name; int age;
        //TODO: 4)У Cat функции: сказать мяу;
        //TODO: 5)У Human поля: int Age; String name; Cat[] cats;
        //TODO: 6)У Human функции: сколько кошек у человека
        System.out.println("Проверка вывода");
        Cat vaska = new Cat();
        Cat murzic = new Cat();
        Human chelovek = new Human();
        chelovek.name = "Загр";

                for (int i = 0; i < 10; i++) {
                    Cat object = new Cat();
                    //не доделано
                }

                System.out.println("у"+chelovek.name+ Cat.getCount() + " кошек");



    }
}
