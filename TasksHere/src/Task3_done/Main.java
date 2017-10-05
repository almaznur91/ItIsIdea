package Task3_done;

import java.util.Scanner;

public class Main {

    /*
    задача №3
    создать класс треугольник
    инициализировать через сеттеры
    функции
    *вывод площади
    *функция которая возвращает вид треуольника(тупой острый равнобедренный прямоугольный)
    *сравнение площади двух треугольников
    *тестирование в main
     */
    public static void main(String[] args) {
        // write your code here

        System.out.println("Введите значения трех сторон треугольника");
        Triangle triangle1 = new Triangle(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        if (triangle1.isTrue()){
            System.out.println("Вы ввели верные значения треугольника");
        }
        else {System.out.println("Вы ввели неверные значения треугольника");
        System.exit(0);}



        System.out.println("Площадь треугольника = "+triangle1.sAgle());


        if (triangle1.Bedr()) {
            System.out.println("Треугольник равнобедренный");
        }
        if (triangle1.Pryam()) {
            System.out.println("Треугольник прямоугольный");
        }


    }
}
