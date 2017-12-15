package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
          2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
          3. Закрой поток ввода методом close().*/


    }

    static class Solution {
        public static ArrayList<String> lines = new ArrayList();

        static {
            BufferedReader reader = BufferedReader(FileReader(Constants.FILE_NAME));
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                    reader.close();


                }
            } catch (IOException e) {
                e.printStackTrace();

        }


    }

}
