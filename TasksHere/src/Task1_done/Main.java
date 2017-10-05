package Task1_done;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Scanner scanner = new Scanner(System.in)
        Math one = new Math();
        int a;
        int b;
        for (; true; ) {
            System.out.println("Введите первое значение");
            a = new Scanner(System.in).nextInt();
            System.out.println("Введите второе значение");
            b = new Scanner(System.in).nextInt();
            System.out.print("Сумма введенных значений ");
            System.out.println(one.sum(a, b));
            System.out.print("Разность введенных значений");
            System.out.println(one.diff(a, b));
            System.out.print("Произвидение введенных значений ");
            System.out.println(one.prod(a, b));
            System.out.print("Частное введенных значений ");
            System.out.println(one.div(a, b));
            System.out.print("Модуль первого введенного значения ");
            System.out.println(one.abs(a));
            System.out.print("Минумум ");
            System.out.println(one.min(a, b));
            System.out.print("Максимум ");
            System.out.println(one.max(a, b));
        }
    }
}
