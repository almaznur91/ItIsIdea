package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  1.В классе Tree перегрузи метод info(Object s) два раза так, чтобы получилось три метода info(Object s), info(Number s), info(String s).
        1.1. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
        1.2. Например, для метода info(Number s) результат может быть таким "Дерево № 123 , метод Number, параметр Short".
        2. В блоке 2 должен вызываться метод info(Object s).
        3. В блоке 3 должен вызываться метод info(Number s).
        4. В блоке 4 должен вызываться метод info(String s).*/

        new Tree().info((Object)new Integer("4"));
        new Tree().info((Number) new Short("4"));
        //new Tree().info((Object)new BigDecimal("4"));

    }

}
