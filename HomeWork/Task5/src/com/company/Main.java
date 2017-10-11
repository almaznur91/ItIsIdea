package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Channel[] channels = new Channel[3];

        Program[] programs1 = new Program[4];

        channels[0] = new Channel(programs1, "Охота и рыбалка");
        programs1[0] = new Program("Зимняя рыбалка", LocalTime.parse("00:00"), LocalTime.parse("06:00"));
        programs1[1] = new Program("Охота на кабана", LocalTime.parse("06:00"), LocalTime.parse("12:00"));
        programs1[2] = new Program("как поймать золотую рыбку?", LocalTime.parse("12:00"), LocalTime.parse("20:00"));
        programs1[3] = new Program("Морские монстры и виды их ловли", LocalTime.parse("20:00"), LocalTime.parse("23:59"));

        Program[] programs2 = new Program[2];
        channels[1] = new Channel(programs2, "Hi-Tech");
        programs2[0] = new Program("Презентация очередного убийцы iPhone", LocalTime.parse("00:00"), LocalTime.parse("12:00"));
        programs2[1] = new Program("Топ 100 смартфонов до 99$ с крйтой камерой", LocalTime.parse("12:00"), LocalTime.parse("23:59"));

        Program[] programs3 = new Program[1];
        channels[2] = new Channel(programs3, "Первый");
        programs3[0] = new Program("Предвыборная компания Путина", LocalTime.parse("00:00"), LocalTime.parse("23:59"));


        TV tv = new TV(channels, "Zenith");
        TVConsole console = new TVConsole(tv);
        console.menu();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Нажимаем на кнопку: ");
            console.pushButton(scanner.nextInt());
        }

    }
}
