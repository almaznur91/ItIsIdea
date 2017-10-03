package com.company;

/*
1) Создай класс "прямая" (class Straight)
2) Этот класс прямой(линия), подумай какие поля у него есть. y=k*x+b, сделай их приватными и инициализируй в конструкторе
2) Внутри класса создай функцию f(x) которая возвращает значение y при x
3) Внутри класса создай функцию intersectionX(), которая принимает на вход другую прямую, и возвращает значение X, точки пересечения этих двух прямых
4) То же самое для Y, inersection Y(), если прямые параллельные выведи 0;
5) Создай функцию isParallel() принимает прямую и выводит true или false
5) В main() протестируй свой класс, создай две прямые и выведи на экран точку пересечения(X,Y), если параллельные то надпись об этом
 */
public class Line {

    private static int k;
    private static int b;

    public void setB(int b) {
        Line.b = b;
    }

    public void setK(int k) {
        Line.k = k;
    }

    public static int getB() {
        return b;
    }

    public static int getK() {
        return k;
    }

    public Line(int k, int b) {
        setK(k);
        setB(b);
    }

    public static int f(int x) {
        return (k * x) + b;
    }
    private static int getB.line2{
        return line2.b;
    }
    public static double intersectionX(Line line2) {

        return (b - line2.b) / (line2.k - k);

    }
}
