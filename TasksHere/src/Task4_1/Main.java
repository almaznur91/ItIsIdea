package Task4_1;

public class Main {

    public static void main(String[] args) {
	    //(DONE) 1)Создай классы Cat и Human
        //(DONE) 2)Создай женщину и двух кошек
        //(DONE) 3)У Cat поля: Human mistress; String name; int age;
        //(DONE) 4)У Cat функции: сказать мяу;
        //(DONE) 5)У Human поля: int Age; String name; Cat[] cats;
        //TODO: 6)У Human функции: сколько кошек у человека
        //TODO: Дополнение: тебе не надо считать сколько обьектов всего создано, а только то, сколько кошек у
        //TODO: конкретного объекта Human. Выведи просто сколько кошек есть в массиве, по аналогии с 5ым заданием
        //TODO: 7)Чтоб было понятнее, сделай в классе Human функцию(Назови его например"ZavestiKoshku()")
        //TODO: который принимает кошку и заносит его в первый пустой элемент массива=)
        System.out.println("Проверка вывода");
        Cat vaska = new Cat();
        Cat murzic = new Cat();
        Human chelovek = new Human();
        chelovek.name = "Загр";
        chelovek.howMatchCat(cat);

        //                for (int i = 0; i < 10; i++) {
//                    Cat object = new Cat();
//                    //не доделано
//                }
//
//                System.out.println("у"+chelovek.name+ Cat.getCount() + " кошек");



    }
}
