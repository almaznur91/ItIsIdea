package Task1;

class Math {


    public static int sum(int x, int y) {
        return x + y;
    }

    public static int diff(int x, int y) {
        return x - y;
    }

    public static int prod(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        return (double) x / y;
    }

    public static int abs(int x) {
        if (x < 0) {
            return (-1) * x;
        }
        return x;
    }

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        }
        return y;
    }

    public static int max(int x, int y)

    {
        if (x < y) {
            return y;
        }
        return x;
    }
}
