package com.company;

class Math {


    public static void sum(int x, int y) {
        System.out.println("Сумма х+у=" + (x + y));
    }

    public static void diff(int x, int y) {
        System.out.println(("Разность х-у=" + (x + y)));
    }

    public static void prod(int x, int y) {
        System.out.println("Проивидение х и у=" + (x * y));
    }

    public static void div(int x, int y) {
        System.out.println("Деление х на у=" + (x / y));
    }

    public static void abs(int x) {
        System.out.println(x);
    }

    public static int min(int x, int y) {
        int mini;
        if (x < y) {
            mini = x;
        } else mini = y;
        return mini;
    }
    public static void
}
