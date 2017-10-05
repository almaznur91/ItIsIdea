package Task5_done;

public class Main {
    public static void main(String[] args) {
        //TODO: Класс Кошка создай
        //TODO: массив из кошек.
        //TODO: создай две кошки
        //TODO: занеси в массив эти кошки

        //TODO: выведи на экран количество кошек в массиве


        //TODO: немного поправлю задание.
        //TODO: 1)создай класс(Сделал)
        //TODO: 2)создай пустой массив, например из 10 элементов
        //TODO: 3)создай 2 кошки(Сделал)
        //TODO: 4)Занеси в массив этих кошек
        //TODO: 5)Вывести на экран количество кошек в массиве

        Cat vaska = new Cat();
        Cat murka = new Cat();
        Cat[] cats = new Cat[10];
        cats[0] = vaska;
        cats[1] = murka;
        int count=0;

        for (int i=0; i<cats.length;i++){
            if(cats[i]!=null){
                count = count+1;
            }
        }

        System.out.println("Количество кошек:"+count);
}
}