package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList[] lists;
        lists = new ArrayList[5];
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choise;

        System.out.println("МЕНЮ:+\n" +
                "1. Создать список +\n" +
                "2. Показть все списки+\n" +
                "3. Работа со списком ");

        while (true) {
            choise = scanner.nextInt();
            switch (choise) {
                case 1:

                    System.out.println("Введите номер создаваемого списка:[0..4]");
                    int listsNumbre = scanner.nextInt();
                    if (listsNumbre > 4 || listsNumbre < 0) {
                        System.out.println("Введеное значение неверно! Введите номер создаваемого списка от 0 до 4");
                    } else {
                        lists[listsNumbre] = new ArrayList();
                    }
                    break;
                case 2:
                    for (int i = 0; i < lists.length; i++) {
                        if (lists[i] != null) {
                            int[] tempArray = lists[i].getArray();
                            for (int j = 0; j < tempArray.length; j++) {
                                System.out.print(tempArray[j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер списка");
                    int numberOfList = scanner.nextInt();
                    System.out.println("Работа со сиском номер " + numberOfList);
                    System.out.println("Подменю(работа со списком) \n" +
                            "1. Добавление элемента в конец списка \n" +
                            "2. Добавление элемента в начало списка\n" +
                            "3. Вставка элемента в заданную позицию со сдвигом\n" +
                            "4. Получение элемента по индексу\n" +
                            "5. Замена элемента в заданной позиции новым элементом \n" +
                            "6. Сортировка \n" +
                            "7. Развертка \n" +
                            "8. Удаление по индексу\n" +
                            "9. Возврат индекса элемента, если элемента нет = -1\n" +
                            "10. Показать хоанилище\n" +
                            "11. Вернуться в предыдущее меню");
                    while (true) {
                        choise = scanner.nextInt();
                        switch (choise) {
                            case 1:
                                System.out.println("Введите значение элемента для занесения в конец списка");
                                lists[numberOfList].add(scanner.nextInt());

                                break;
                            case 2:
                                //TODO: добавить предупреждение
                                System.out.println("Введите знчение элемента для добавления в начало списка");
                                lists[numberOfList].addStart(scanner.nextInt());
                                break;

                            case 3:
                                System.out.println("Введите значение и индекс элемента для добавления в список");
                                lists[numberOfList].insertElement(scanner.nextInt(), scanner.nextInt());
                                break;

                            case 4:
                                System.out.println("Введите номер элемннта для получения по индексу");
                                System.out.println(lists[numberOfList].get(scanner.nextInt()));
                                break;

                            case 5:
                                System.out.println("Введите индекс элемента и значение элемента которое вы хотите присвоить ");
                                lists[numberOfList].replace(scanner.nextInt(), scanner.nextInt());
                                break;

                            case 6:
                                lists[numberOfList].sort();
                                break;

                            case 7:
                                //TODO: Развернуть(доделать)
                                break;

                            case 8:

                                System.out.println("Введите число для удаления по индексу");
                                if (!lists[numberOfList].delByInd(scanner.nextInt())) {
                                    System.out.println("Удаление не прошло, введите верное значение");
                                }
                                break;

                            case 9:

                                System.out.println("Введите число для поиска массиву");

                                if (lists[numberOfList].isReturnIndex(scanner.nextInt()) == -1) {
                                    System.out.println("Введеного значение не обнаружено!");
                                }
                                System.out.println(lists[numberOfList].isReturnIndex(scanner.nextInt()));
                                break;

                            case 10:
                                //TODO: Показать хранилище

                                break;

                            case 11:
                                System.exit(0);
                                System.out.println("Сортировка проивидена");
                                break;

                        }
                    }

            }
        }
    }
}