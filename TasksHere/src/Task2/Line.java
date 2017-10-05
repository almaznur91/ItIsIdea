package Task2;

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

    private int k;
    private int b;

    public int getB() {
        return b;
    }

    public int getK() {
        return k;
    }

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public int f(int x) {
        return (k * x) + b;
    }

    public double intersectionX(Line line2) {
        if (!isParallel(line2)) {
            return (double) (b - line2.getB()) / (line2.getK() - k);
        }
        else return 0;
    }

    public double intersectionY(Line line2) {
        return intersectionX(line2) * k + b;
    }

    public boolean isParallel(Line line2) {
        if (k == line2.getK()) {
            return true;
        }
        return false;
    }

}
