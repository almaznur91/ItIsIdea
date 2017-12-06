package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }


    static class Solution {
        public static Planet planet;

        static {
            readKeyFromConsoleAndInitPlanet();
        }

        static Scanner scanner = new Scanner(System.in);
        static String temp;

        public static void readKeyFromConsoleAndInitPlanet() {
            if (temp.equals(Planet.earth)){
                planet =Earth.getInstance();

            }
            else if (temp.equals(Planet.moon)){
                planet= Moon.getinstance();
            }
            else if (temp.equals(Planet.sun)){
                planet = Sun.getInstance();
            }

        }
    }
}
