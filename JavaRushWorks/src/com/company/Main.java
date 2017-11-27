package com.company;

import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.util.Scanner;

public class Main {
    //11. Прочесть с консоли имя файла.
//2. Считывать строки с консоли, пока пользователь не введет строку "exit".
    //  3. Вывести все строки в файл, каждую строчку с новой стороки.

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        OutputStream outputStream = new FileOutputStream(scanner.nextLine());
        char[]dataChar;

        while (true) {
            String data = scanner.next();
            dataChar=data.toCharArray();
            if (data.equals("exit")) {
                break;
            } else {
                    outputStream.write(Integer.parseInt(data));
            }
        }
        outputStream.close();


    }
}
